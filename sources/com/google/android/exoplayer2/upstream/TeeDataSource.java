package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

public final class TeeDataSource implements DataSource {
    private long bytesRemaining;
    private final DataSink dataSink;
    private boolean dataSinkNeedsClosing;
    private final DataSource upstream;

    public TeeDataSource(DataSource dataSource, DataSink dataSink2) {
        this.upstream = (DataSource) Assertions.checkNotNull(dataSource);
        this.dataSink = (DataSink) Assertions.checkNotNull(dataSink2);
    }

    public long open(DataSpec dataSpec) throws IOException {
        DataSpec dataSpec2 = dataSpec;
        this.bytesRemaining = this.upstream.open(dataSpec2);
        if (this.bytesRemaining == 0) {
            return 0;
        }
        if (dataSpec2.length == -1 && this.bytesRemaining != -1) {
            DataSpec dataSpec3 = new DataSpec(dataSpec2.uri, dataSpec2.absoluteStreamPosition, dataSpec2.position, this.bytesRemaining, dataSpec2.key, dataSpec2.flags);
            dataSpec2 = dataSpec3;
        }
        this.dataSinkNeedsClosing = true;
        this.dataSink.open(dataSpec2);
        return this.bytesRemaining;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.bytesRemaining == 0) {
            return -1;
        }
        int read = this.upstream.read(bArr, i, i2);
        if (read > 0) {
            this.dataSink.write(bArr, i, read);
            if (this.bytesRemaining != -1) {
                this.bytesRemaining -= (long) read;
            }
        }
        return read;
    }

    public Uri getUri() {
        return this.upstream.getUri();
    }

    public void close() throws IOException {
        try {
            this.upstream.close();
        } finally {
            if (this.dataSinkNeedsClosing) {
                this.dataSinkNeedsClosing = false;
                this.dataSink.close();
            }
        }
    }
}

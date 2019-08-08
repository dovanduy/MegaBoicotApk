package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

public final class ByteArrayDataSource implements DataSource {
    private int bytesRemaining;
    private final byte[] data;
    private int readPosition;
    private Uri uri;

    public ByteArrayDataSource(byte[] bArr) {
        Assertions.checkNotNull(bArr);
        Assertions.checkArgument(bArr.length > 0);
        this.data = bArr;
    }

    public long open(DataSpec dataSpec) throws IOException {
        this.uri = dataSpec.uri;
        this.readPosition = (int) dataSpec.position;
        this.bytesRemaining = (int) (dataSpec.length == -1 ? ((long) this.data.length) - dataSpec.position : dataSpec.length);
        if (this.bytesRemaining > 0 && this.readPosition + this.bytesRemaining <= this.data.length) {
            return (long) this.bytesRemaining;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsatisfiable range: [");
        sb.append(this.readPosition);
        sb.append(", ");
        sb.append(dataSpec.length);
        sb.append("], length: ");
        sb.append(this.data.length);
        throw new IOException(sb.toString());
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        int min = Math.min(i2, this.bytesRemaining);
        System.arraycopy(this.data, this.readPosition, bArr, i, min);
        this.readPosition += min;
        this.bytesRemaining -= min;
        return min;
    }

    public Uri getUri() {
        return this.uri;
    }

    public void close() throws IOException {
        this.uri = null;
    }
}

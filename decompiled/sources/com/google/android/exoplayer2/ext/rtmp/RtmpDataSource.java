package com.google.android.exoplayer2.ext.rtmp;

import android.net.Uri;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import net.butterflytv.rtmp_client.RtmpClient;
import net.butterflytv.rtmp_client.RtmpClient.C6246a;

public final class RtmpDataSource implements DataSource {
    private final TransferListener<? super RtmpDataSource> listener;
    private RtmpClient rtmpClient;
    private Uri uri;

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.rtmp");
    }

    public RtmpDataSource() {
        this(null);
    }

    public RtmpDataSource(TransferListener<? super RtmpDataSource> transferListener) {
        this.listener = transferListener;
    }

    public long open(DataSpec dataSpec) throws C6246a {
        this.rtmpClient = new RtmpClient();
        this.rtmpClient.mo22387a(dataSpec.uri.toString(), false);
        this.uri = dataSpec.uri;
        if (this.listener != null) {
            this.listener.onTransferStart(this, dataSpec);
        }
        return -1;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int a = this.rtmpClient.mo22385a(bArr, i, i2);
        if (a == -1) {
            return -1;
        }
        if (this.listener != null) {
            this.listener.onBytesTransferred(this, a);
        }
        return a;
    }

    public void close() {
        if (this.uri != null) {
            this.uri = null;
            if (this.listener != null) {
                this.listener.onTransferEnd(this);
            }
        }
        if (this.rtmpClient != null) {
            this.rtmpClient.mo22386a();
            this.rtmpClient = null;
        }
    }

    public Uri getUri() {
        return this.uri;
    }
}

package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.HttpDataSource.BaseFactory;
import com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties;

public final class DefaultHttpDataSourceFactory extends BaseFactory {
    private final boolean allowCrossProtocolRedirects;
    private final int connectTimeoutMillis;
    private final TransferListener<? super DataSource> listener;
    private final int readTimeoutMillis;
    private final String userAgent;

    public DefaultHttpDataSourceFactory(String str) {
        this(str, null);
    }

    public DefaultHttpDataSourceFactory(String str, TransferListener<? super DataSource> transferListener) {
        this(str, transferListener, 8000, 8000, false);
    }

    public DefaultHttpDataSourceFactory(String str, TransferListener<? super DataSource> transferListener, int i, int i2, boolean z) {
        this.userAgent = str;
        this.listener = transferListener;
        this.connectTimeoutMillis = i;
        this.readTimeoutMillis = i2;
        this.allowCrossProtocolRedirects = z;
    }

    /* access modifiers changed from: protected */
    public DefaultHttpDataSource createDataSourceInternal(RequestProperties requestProperties) {
        DefaultHttpDataSource defaultHttpDataSource = new DefaultHttpDataSource(this.userAgent, null, this.listener, this.connectTimeoutMillis, this.readTimeoutMillis, this.allowCrossProtocolRedirects, requestProperties);
        return defaultHttpDataSource;
    }
}

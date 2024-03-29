package com.google.android.exoplayer2.upstream.crypto;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;

public final class AesCipherDataSource implements DataSource {
    private AesFlushingCipher cipher;
    private final byte[] secretKey;
    private final DataSource upstream;

    public AesCipherDataSource(byte[] bArr, DataSource dataSource) {
        this.upstream = dataSource;
        this.secretKey = bArr;
    }

    public long open(DataSpec dataSpec) throws IOException {
        long open = this.upstream.open(dataSpec);
        AesFlushingCipher aesFlushingCipher = new AesFlushingCipher(2, this.secretKey, CryptoUtil.getFNV64Hash(dataSpec.key), dataSpec.absoluteStreamPosition);
        this.cipher = aesFlushingCipher;
        return open;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int read = this.upstream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.cipher.updateInPlace(bArr, i, read);
        return read;
    }

    public void close() throws IOException {
        this.cipher = null;
        this.upstream.close();
    }

    public Uri getUri() {
        return this.upstream.getUri();
    }
}

package com.google.android.exoplayer2.upstream.crypto;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class AesFlushingCipher {
    private final int blockSize;
    private final Cipher cipher;
    private final byte[] flushedBlock;
    private int pendingXorBytes;
    private final byte[] zerosBlock;

    public AesFlushingCipher(int i, byte[] bArr, long j, long j2) {
        try {
            this.cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.blockSize = this.cipher.getBlockSize();
            this.zerosBlock = new byte[this.blockSize];
            this.flushedBlock = new byte[this.blockSize];
            long j3 = j2 / ((long) this.blockSize);
            int i2 = (int) (j2 % ((long) this.blockSize));
            this.cipher.init(i, new SecretKeySpec(bArr, Util.splitAtFirst(this.cipher.getAlgorithm(), "/")[0]), new IvParameterSpec(getInitializationVector(j, j3)));
            if (i2 != 0) {
                updateInPlace(new byte[i2], 0, i2);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateInPlace(byte[] bArr, int i, int i2) {
        update(bArr, i, i2, bArr, i);
    }

    public void update(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        do {
            boolean z = true;
            if (this.pendingXorBytes > 0) {
                bArr2[i6] = (byte) (bArr[i4] ^ this.flushedBlock[this.blockSize - this.pendingXorBytes]);
                i6++;
                i4++;
                this.pendingXorBytes--;
                i5--;
            } else {
                int nonFlushingUpdate = nonFlushingUpdate(bArr, i4, i5, bArr2, i6);
                if (i5 != nonFlushingUpdate) {
                    int i7 = i5 - nonFlushingUpdate;
                    int i8 = 0;
                    Assertions.checkState(i7 < this.blockSize);
                    int i9 = i6 + nonFlushingUpdate;
                    this.pendingXorBytes = this.blockSize - i7;
                    if (nonFlushingUpdate(this.zerosBlock, 0, this.pendingXorBytes, this.flushedBlock, 0) != this.blockSize) {
                        z = false;
                    }
                    Assertions.checkState(z);
                    while (i8 < i7) {
                        int i10 = i9 + 1;
                        bArr2[i9] = this.flushedBlock[i8];
                        i8++;
                        i9 = i10;
                    }
                    return;
                }
                return;
            }
        } while (i5 != 0);
    }

    private int nonFlushingUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        try {
            return this.cipher.update(bArr, i, i2, bArr2, i3);
        } catch (ShortBufferException e) {
            throw new RuntimeException(e);
        }
    }

    private byte[] getInitializationVector(long j, long j2) {
        return ByteBuffer.allocate(16).putLong(j).putLong(j2).array();
    }
}

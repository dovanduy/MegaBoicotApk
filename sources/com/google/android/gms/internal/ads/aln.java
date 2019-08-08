package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

@C3718cm
public final class aln extends ali {

    /* renamed from: b */
    private MessageDigest f11369b;

    /* renamed from: a */
    public final byte[] mo14494a(String str) {
        byte[] bArr;
        String[] split = str.split(" ");
        int i = 4;
        if (split.length == 1) {
            int a = alm.m14392a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a);
            bArr = allocate.array();
        } else if (split.length < 5) {
            byte[] bArr2 = new byte[(split.length << 1)];
            for (int i2 = 0; i2 < split.length; i2++) {
                int a2 = alm.m14392a(split[i2]);
                int i3 = (a2 >> 16) ^ (65535 & a2);
                byte[] bArr3 = {(byte) i3, (byte) (i3 >> 8)};
                int i4 = i2 << 1;
                bArr2[i4] = bArr3[0];
                bArr2[i4 + 1] = bArr3[1];
            }
            bArr = bArr2;
        } else {
            byte[] bArr4 = new byte[split.length];
            for (int i5 = 0; i5 < split.length; i5++) {
                int a3 = alm.m14392a(split[i5]);
                bArr4[i5] = (byte) ((a3 >> 24) ^ (((a3 & 255) ^ ((a3 >> 8) & 255)) ^ ((a3 >> 16) & 255)));
            }
            bArr = bArr4;
        }
        this.f11369b = mo14493a();
        synchronized (this.f11362a) {
            if (this.f11369b == null) {
                byte[] bArr5 = new byte[0];
                return bArr5;
            }
            this.f11369b.reset();
            this.f11369b.update(bArr);
            byte[] digest = this.f11369b.digest();
            if (digest.length <= 4) {
                i = digest.length;
            }
            byte[] bArr6 = new byte[i];
            System.arraycopy(digest, 0, bArr6, 0, bArr6.length);
            return bArr6;
        }
    }
}

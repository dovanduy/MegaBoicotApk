package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class agy {

    /* renamed from: b */
    private static Cipher f11033b;

    /* renamed from: c */
    private static final Object f11034c = new Object();

    /* renamed from: d */
    private static final Object f11035d = new Object();

    /* renamed from: a */
    private final SecureRandom f11036a = null;

    public agy(SecureRandom secureRandom) {
    }

    /* renamed from: a */
    private static Cipher m14102a() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (f11035d) {
            if (f11033b == null) {
                f11033b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f11033b;
        }
        return cipher;
    }

    /* renamed from: a */
    public final String mo14290a(byte[] bArr, byte[] bArr2) throws agz {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length != 16) {
            throw new agz(this);
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f11034c) {
                m14102a().init(1, secretKeySpec, null);
                doFinal = m14102a().doFinal(bArr2);
                iv = m14102a().getIV();
            }
            int length = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length];
            allocate.get(bArr3);
            return afv.m14033a(bArr3, false);
        } catch (NoSuchAlgorithmException e) {
            throw new agz(this, e);
        } catch (InvalidKeyException e2) {
            throw new agz(this, e2);
        } catch (IllegalBlockSizeException e3) {
            throw new agz(this, e3);
        } catch (NoSuchPaddingException e4) {
            throw new agz(this, e4);
        } catch (BadPaddingException e5) {
            throw new agz(this, e5);
        }
    }

    /* renamed from: a */
    public final byte[] mo14291a(String str) throws agz {
        try {
            byte[] a = afv.m14034a(str, false);
            if (a.length != 32) {
                throw new agz(this);
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(a, 4, 16).get(bArr);
            for (int i = 0; i < 16; i++) {
                bArr[i] = (byte) (bArr[i] ^ 68);
            }
            return bArr;
        } catch (IllegalArgumentException e) {
            throw new agz(this, e);
        }
    }

    /* renamed from: a */
    public final byte[] mo14292a(byte[] bArr, String str) throws agz {
        byte[] doFinal;
        if (bArr.length != 16) {
            throw new agz(this);
        }
        try {
            byte[] a = afv.m14034a(str, false);
            if (a.length <= 16) {
                throw new agz(this);
            }
            ByteBuffer allocate = ByteBuffer.allocate(a.length);
            allocate.put(a);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[(a.length - 16)];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f11034c) {
                m14102a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = m14102a().doFinal(bArr3);
            }
            return doFinal;
        } catch (NoSuchAlgorithmException e) {
            throw new agz(this, e);
        } catch (InvalidKeyException e2) {
            throw new agz(this, e2);
        } catch (IllegalBlockSizeException e3) {
            throw new agz(this, e3);
        } catch (NoSuchPaddingException e4) {
            throw new agz(this, e4);
        } catch (BadPaddingException e5) {
            throw new agz(this, e5);
        } catch (InvalidAlgorithmParameterException e6) {
            throw new agz(this, e6);
        } catch (IllegalArgumentException e7) {
            throw new agz(this, e7);
        }
    }
}

package org.apache.p199a.p229k;

import com.google.android.exoplayer2.C2793C;
import java.io.UnsupportedEncodingException;

/* renamed from: org.apache.a.k.c */
/* compiled from: EncodingUtils */
public final class C6550c {
    /* renamed from: a */
    public static byte[] m25956a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("data may not be null");
        } else if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("charset may not be null or empty");
        } else {
            try {
                return str.getBytes(str2);
            } catch (UnsupportedEncodingException unused) {
                return str.getBytes();
            }
        }
    }

    /* renamed from: a */
    public static byte[] m25955a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Parameter may not be null");
        }
        try {
            return str.getBytes(C2793C.ASCII_NAME);
        } catch (UnsupportedEncodingException unused) {
            throw new Error("HttpClient requires ASCII support");
        }
    }

    /* renamed from: a */
    public static String m25954a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("Parameter may not be null");
        }
        try {
            return new String(bArr, i, i2, C2793C.ASCII_NAME);
        } catch (UnsupportedEncodingException unused) {
            throw new Error("HttpClient requires ASCII support");
        }
    }

    /* renamed from: a */
    public static String m25953a(byte[] bArr) {
        if (bArr != null) {
            return m25954a(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("Parameter may not be null");
    }
}

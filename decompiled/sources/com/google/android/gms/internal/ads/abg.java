package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C2793C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class abg {

    /* renamed from: a */
    static final Charset f10435a = Charset.forName(C2793C.UTF8_NAME);

    /* renamed from: b */
    public static final byte[] f10436b;

    /* renamed from: c */
    private static final Charset f10437c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    private static final ByteBuffer f10438d;

    /* renamed from: e */
    private static final aaf f10439e;

    static {
        byte[] bArr = new byte[0];
        f10436b = bArr;
        f10438d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f10436b;
        f10439e = aaf.m12941a(bArr2, 0, bArr2.length, false);
    }

    /* renamed from: a */
    static int m13317a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: a */
    public static int m13318a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m13319a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static <T> T m13320a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static Object m13321a(Object obj, Object obj2) {
        return ((acl) obj).mo13987n().mo14069a((acl) obj2).mo13997d();
    }

    /* renamed from: a */
    static <T> T m13322a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static boolean m13323a(acl acl) {
        return false;
    }

    /* renamed from: a */
    public static boolean m13324a(byte[] bArr) {
        return aef.m13843a(bArr);
    }

    /* renamed from: b */
    public static String m13325b(byte[] bArr) {
        return new String(bArr, f10435a);
    }

    /* renamed from: c */
    public static int m13326c(byte[] bArr) {
        int length = bArr.length;
        int a = m13317a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}

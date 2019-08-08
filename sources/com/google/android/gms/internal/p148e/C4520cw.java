package com.google.android.gms.internal.p148e;

import com.google.android.exoplayer2.C2793C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.e.cw */
public final class C4520cw {

    /* renamed from: a */
    static final Charset f14862a = Charset.forName(C2793C.UTF8_NAME);

    /* renamed from: b */
    public static final byte[] f14863b;

    /* renamed from: c */
    private static final Charset f14864c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    private static final ByteBuffer f14865d;

    /* renamed from: e */
    private static final C4481bv f14866e;

    /* renamed from: a */
    public static int m19444a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m19445a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static boolean m19449a(C4554ec ecVar) {
        return false;
    }

    /* renamed from: a */
    static <T> T m19446a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static <T> T m19448a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static boolean m19450a(byte[] bArr) {
        return C4607ft.m19936a(bArr);
    }

    /* renamed from: b */
    public static String m19451b(byte[] bArr) {
        return new String(bArr, f14862a);
    }

    /* renamed from: c */
    public static int m19452c(byte[] bArr) {
        int length = bArr.length;
        int a = m19443a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a */
    static int m19443a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: a */
    static Object m19447a(Object obj, Object obj2) {
        return ((C4554ec) obj).mo16613j().mo16365a((C4554ec) obj2).mo16621e();
    }

    static {
        byte[] bArr = new byte[0];
        f14863b = bArr;
        f14865d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f14863b;
        f14866e = C4481bv.m18998a(bArr2, 0, bArr2.length, false);
    }
}

package com.google.android.gms.internal.p148e;

/* renamed from: com.google.android.gms.internal.e.fu */
final class C4608fu {
    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m19955d(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m19956e(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m19957f(byte b) {
        return b < -16;
    }

    /* renamed from: g */
    private static boolean m19958g(byte b) {
        return b > -65;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m19952b(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m19951b(byte b, byte b2, char[] cArr, int i) throws C4526db {
        if (b < -62 || m19958g(b2)) {
            throw C4526db.m19465h();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m19950b(byte b, byte b2, byte b3, char[] cArr, int i) throws C4526db {
        if (m19958g(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m19958g(b3)))) {
            throw C4526db.m19465h();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m19949b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C4526db {
        if (m19958g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m19958g(b3) || m19958g(b4)) {
            throw C4526db.m19465h();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) (55232 + (b5 >>> 10));
        cArr[i + 1] = (char) (56320 + (b5 & 1023));
    }
}

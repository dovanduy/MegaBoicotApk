package com.startapp.p154a.p155a.p160e;

/* renamed from: com.startapp.a.a.e.c */
/* compiled from: StartAppSDK */
class C5060c {

    /* renamed from: a */
    private static final char[] f16379a = "0123456789abcdef".toCharArray();

    C5060c() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public byte[] mo18667a(String str) {
        if (m21834b(str)) {
            return null;
        }
        byte[] bArr = new byte[(str.length() / 2)];
        int length = str.length();
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* renamed from: b */
    private boolean m21834b(String str) {
        return str.length() % 2 != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo18666a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = 2 * i;
            cArr[i2] = f16379a[(bArr[i] & 240) >>> 4];
            cArr[i2 + 1] = f16379a[bArr[i] & 15];
        }
        return new String(cArr);
    }
}

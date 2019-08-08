package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.zs */
final class C4382zs {
    /* renamed from: a */
    static int m18741a(int i, byte[] bArr, int i2, int i3, abj<?> abj, C4383zt ztVar) {
        abf abf = (abf) abj;
        int a = m18747a(bArr, i2, ztVar);
        while (true) {
            abf.mo14000c(ztVar.f14359a);
            if (a >= i3) {
                break;
            }
            int a2 = m18747a(bArr, a, ztVar);
            if (i != ztVar.f14359a) {
                break;
            }
            a = m18747a(bArr, a2, ztVar);
        }
        return a;
    }

    /* renamed from: a */
    static int m18742a(int i, byte[] bArr, int i2, int i3, ady ady, C4383zt ztVar) throws IOException {
        if ((i >>> 3) == 0) {
            throw abk.m13335d();
        }
        int i4 = i & 7;
        if (i4 != 5) {
            switch (i4) {
                case 0:
                    int b = m18748b(bArr, i2, ztVar);
                    ady.mo14173a(i, (Object) Long.valueOf(ztVar.f14360b));
                    return b;
                case 1:
                    ady.mo14173a(i, (Object) Long.valueOf(m18749b(bArr, i2)));
                    return i2 + 8;
                case 2:
                    int a = m18747a(bArr, i2, ztVar);
                    int i5 = ztVar.f14359a;
                    ady.mo14173a(i, (Object) i5 == 0 ? C4386zw.f14365a : C4386zw.m18763a(bArr, a, i5));
                    return a + i5;
                case 3:
                    ady b2 = ady.m13726b();
                    int i6 = (i & -8) | 4;
                    int i7 = 0;
                    while (true) {
                        if (i2 < i3) {
                            int a2 = m18747a(bArr, i2, ztVar);
                            int i8 = ztVar.f14359a;
                            if (i8 != i6) {
                                i7 = i8;
                                i2 = m18742a(i8, bArr, a2, i3, b2, ztVar);
                            } else {
                                i7 = i8;
                                i2 = a2;
                            }
                        }
                    }
                    if (i2 > i3 || i7 != i6) {
                        throw abk.m13338g();
                    }
                    ady.mo14173a(i, (Object) b2);
                    return i2;
                default:
                    throw abk.m13335d();
            }
        } else {
            ady.mo14173a(i, (Object) Integer.valueOf(m18745a(bArr, i2)));
            return i2 + 4;
        }
    }

    /* renamed from: a */
    static int m18743a(int i, byte[] bArr, int i2, int i3, C4383zt ztVar) throws abk {
        if ((i >>> 3) == 0) {
            throw abk.m13335d();
        }
        int i4 = i & 7;
        if (i4 == 5) {
            return i2 + 4;
        }
        switch (i4) {
            case 0:
                return m18748b(bArr, i2, ztVar);
            case 1:
                return i2 + 8;
            case 2:
                return m18747a(bArr, i2, ztVar) + ztVar.f14359a;
            case 3:
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m18747a(bArr, i2, ztVar);
                    i6 = ztVar.f14359a;
                    if (i6 != i5) {
                        i2 = m18743a(i6, bArr, i2, i3, ztVar);
                    } else if (i2 > i3 && i6 == i5) {
                        return i2;
                    } else {
                        throw abk.m13338g();
                    }
                }
                if (i2 > i3) {
                }
                throw abk.m13338g();
            default:
                throw abk.m13335d();
        }
    }

    /* renamed from: a */
    static int m18744a(int i, byte[] bArr, int i2, C4383zt ztVar) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                ztVar.f14359a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            ztVar.f14359a = i7 | i3;
            return i8;
        }
        ztVar.f14359a = i5 | i4;
        return i6;
    }

    /* renamed from: a */
    static int m18745a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: a */
    static int m18746a(byte[] bArr, int i, abj<?> abj, C4383zt ztVar) throws IOException {
        abf abf = (abf) abj;
        int a = m18747a(bArr, i, ztVar);
        int i2 = ztVar.f14359a + a;
        while (a < i2) {
            a = m18747a(bArr, a, ztVar);
            abf.mo14000c(ztVar.f14359a);
        }
        if (a == i2) {
            return a;
        }
        throw abk.m13332a();
    }

    /* renamed from: a */
    static int m18747a(byte[] bArr, int i, C4383zt ztVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m18744a((int) b, bArr, i2, ztVar);
        }
        ztVar.f14359a = b;
        return i2;
    }

    /* renamed from: b */
    static int m18748b(byte[] bArr, int i, C4383zt ztVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            ztVar.f14360b = j;
            return i2;
        }
        long j2 = j & 127;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j3 = j2 | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j3 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        ztVar.f14360b = j3;
        return i3;
    }

    /* renamed from: b */
    static long m18749b(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* renamed from: c */
    static double m18750c(byte[] bArr, int i) {
        return Double.longBitsToDouble(m18749b(bArr, i));
    }

    /* renamed from: c */
    static int m18751c(byte[] bArr, int i, C4383zt ztVar) {
        int a = m18747a(bArr, i, ztVar);
        int i2 = ztVar.f14359a;
        if (i2 == 0) {
            ztVar.f14361c = "";
            return a;
        }
        ztVar.f14361c = new String(bArr, a, i2, abg.f10435a);
        return a + i2;
    }

    /* renamed from: d */
    static float m18752d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m18745a(bArr, i));
    }

    /* renamed from: d */
    static int m18753d(byte[] bArr, int i, C4383zt ztVar) throws IOException {
        int a = m18747a(bArr, i, ztVar);
        int i2 = ztVar.f14359a;
        if (i2 == 0) {
            ztVar.f14361c = "";
            return a;
        }
        int i3 = a + i2;
        if (!aef.m13844a(bArr, a, i3)) {
            throw abk.m13339h();
        }
        ztVar.f14361c = new String(bArr, a, i2, abg.f10435a);
        return i3;
    }

    /* renamed from: e */
    static int m18754e(byte[] bArr, int i, C4383zt ztVar) {
        int a = m18747a(bArr, i, ztVar);
        int i2 = ztVar.f14359a;
        if (i2 == 0) {
            ztVar.f14361c = C4386zw.f14365a;
            return a;
        }
        ztVar.f14361c = C4386zw.m18763a(bArr, a, i2);
        return a + i2;
    }
}

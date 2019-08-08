package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class afo extends aew<afo> {

    /* renamed from: f */
    private static volatile afo[] f10746f;

    /* renamed from: a */
    public Integer f10747a;

    /* renamed from: b */
    public String f10748b;

    /* renamed from: c */
    public afj f10749c;

    /* renamed from: d */
    public Integer f10750d;

    /* renamed from: e */
    public String[] f10751e;

    /* renamed from: g */
    private afl f10752g;

    /* renamed from: h */
    private Integer f10753h;

    /* renamed from: i */
    private int[] f10754i;

    /* renamed from: j */
    private String f10755j;

    public afo() {
        this.f10747a = null;
        this.f10748b = null;
        this.f10749c = null;
        this.f10752g = null;
        this.f10753h = null;
        this.f10754i = aff.f10692a;
        this.f10755j = null;
        this.f10750d = null;
        this.f10751e = aff.f10694c;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final afo mo13937a(aes aes) throws IOException {
        afc afc;
        int c;
        while (true) {
            int a = aes.mo14217a();
            switch (a) {
                case 0:
                    return this;
                case 8:
                    this.f10747a = Integer.valueOf(aes.mo14224c());
                    continue;
                case 18:
                    this.f10748b = aes.mo14228e();
                    continue;
                case 26:
                    if (this.f10749c == null) {
                        this.f10749c = new afj();
                    }
                    afc = this.f10749c;
                    break;
                case 34:
                    if (this.f10752g == null) {
                        this.f10752g = new afl();
                    }
                    afc = this.f10752g;
                    break;
                case 40:
                    this.f10753h = Integer.valueOf(aes.mo14224c());
                    continue;
                case 48:
                    int a2 = aff.m13985a(aes, 48);
                    int length = this.f10754i == null ? 0 : this.f10754i.length;
                    int[] iArr = new int[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f10754i, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = aes.mo14224c();
                        aes.mo14217a();
                        length++;
                    }
                    iArr[length] = aes.mo14224c();
                    this.f10754i = iArr;
                    continue;
                case 50:
                    int c2 = aes.mo14225c(aes.mo14231g());
                    int j = aes.mo14234j();
                    int i = 0;
                    while (aes.mo14233i() > 0) {
                        aes.mo14224c();
                        i++;
                    }
                    aes.mo14229e(j);
                    int length2 = this.f10754i == null ? 0 : this.f10754i.length;
                    int[] iArr2 = new int[(i + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f10754i, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = aes.mo14224c();
                        length2++;
                    }
                    this.f10754i = iArr2;
                    aes.mo14226d(c2);
                    continue;
                case 58:
                    this.f10755j = aes.mo14228e();
                    continue;
                case 64:
                    try {
                        c = aes.mo14224c();
                        if (c < 0 || c > 3) {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append(c);
                            sb.append(" is not a valid enum AdResourceType");
                            break;
                        } else {
                            this.f10750d = Integer.valueOf(c);
                            continue;
                        }
                    } catch (IllegalArgumentException unused) {
                        aes.mo14229e(aes.mo14234j());
                        mo14246a(aes, a);
                        break;
                    }
                case 74:
                    int a3 = aff.m13985a(aes, 74);
                    int length3 = this.f10751e == null ? 0 : this.f10751e.length;
                    String[] strArr = new String[(a3 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f10751e, 0, strArr, 0, length3);
                    }
                    while (length3 < strArr.length - 1) {
                        strArr[length3] = aes.mo14228e();
                        aes.mo14217a();
                        length3++;
                    }
                    strArr[length3] = aes.mo14228e();
                    this.f10751e = strArr;
                    continue;
                default:
                    if (!super.mo14246a(aes, a)) {
                        return this;
                    }
                    continue;
            }
            aes.mo14219a(afc);
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(c);
        sb2.append(" is not a valid enum AdResourceType");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: b */
    public static afo[] m14014b() {
        if (f10746f == null) {
            synchronized (afa.f10687b) {
                if (f10746f == null) {
                    f10746f = new afo[0];
                }
            }
        }
        return f10746f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a() + aeu.m13934b(1, this.f10747a.intValue());
        if (this.f10748b != null) {
            a += aeu.m13936b(2, this.f10748b);
        }
        if (this.f10749c != null) {
            a += aeu.m13935b(3, (afc) this.f10749c);
        }
        if (this.f10752g != null) {
            a += aeu.m13935b(4, (afc) this.f10752g);
        }
        if (this.f10753h != null) {
            a += aeu.m13934b(5, this.f10753h.intValue());
        }
        if (this.f10754i != null && this.f10754i.length > 0) {
            int i = 0;
            for (int a2 : this.f10754i) {
                i += aeu.m13926a(a2);
            }
            a = a + i + (this.f10754i.length * 1);
        }
        if (this.f10755j != null) {
            a += aeu.m13936b(7, this.f10755j);
        }
        if (this.f10750d != null) {
            a += aeu.m13934b(8, this.f10750d.intValue());
        }
        if (this.f10751e == null || this.f10751e.length <= 0) {
            return a;
        }
        int i2 = 0;
        int i3 = 0;
        for (String str : this.f10751e) {
            if (str != null) {
                i3++;
                i2 += aeu.m13929a(str);
            }
        }
        return a + i2 + (1 * i3);
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        aeu.mo14236a(1, this.f10747a.intValue());
        if (this.f10748b != null) {
            aeu.mo14239a(2, this.f10748b);
        }
        if (this.f10749c != null) {
            aeu.mo14238a(3, (afc) this.f10749c);
        }
        if (this.f10752g != null) {
            aeu.mo14238a(4, (afc) this.f10752g);
        }
        if (this.f10753h != null) {
            aeu.mo14236a(5, this.f10753h.intValue());
        }
        if (this.f10754i != null && this.f10754i.length > 0) {
            for (int a : this.f10754i) {
                aeu.mo14236a(6, a);
            }
        }
        if (this.f10755j != null) {
            aeu.mo14239a(7, this.f10755j);
        }
        if (this.f10750d != null) {
            aeu.mo14236a(8, this.f10750d.intValue());
        }
        if (this.f10751e != null && this.f10751e.length > 0) {
            for (String str : this.f10751e) {
                if (str != null) {
                    aeu.mo14239a(9, str);
                }
            }
        }
        super.mo13938a(aeu);
    }
}

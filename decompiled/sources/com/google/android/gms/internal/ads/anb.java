package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class anb extends aew<anb> {

    /* renamed from: a */
    private String f11494a;

    /* renamed from: b */
    private Integer f11495b;

    /* renamed from: c */
    private int[] f11496c;

    /* renamed from: d */
    private ank f11497d;

    public anb() {
        this.f11494a = null;
        this.f11495b = null;
        this.f11496c = aff.f10692a;
        this.f11497d = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final anb mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f11494a = aes.mo14228e();
            } else if (a == 16) {
                int j = aes.mo14234j();
                try {
                    this.f11495b = Integer.valueOf(ams.m14452a(aes.mo14231g()));
                } catch (IllegalArgumentException unused) {
                    aes.mo14229e(j);
                    mo14246a(aes, a);
                }
            } else if (a == 24) {
                int a2 = aff.m13985a(aes, 24);
                int length = this.f11496c == null ? 0 : this.f11496c.length;
                int[] iArr = new int[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f11496c, 0, iArr, 0, length);
                }
                while (length < iArr.length - 1) {
                    iArr[length] = aes.mo14231g();
                    aes.mo14217a();
                    length++;
                }
                iArr[length] = aes.mo14231g();
                this.f11496c = iArr;
            } else if (a == 26) {
                int c = aes.mo14225c(aes.mo14231g());
                int j2 = aes.mo14234j();
                int i = 0;
                while (aes.mo14233i() > 0) {
                    aes.mo14231g();
                    i++;
                }
                aes.mo14229e(j2);
                int length2 = this.f11496c == null ? 0 : this.f11496c.length;
                int[] iArr2 = new int[(i + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f11496c, 0, iArr2, 0, length2);
                }
                while (length2 < iArr2.length) {
                    iArr2[length2] = aes.mo14231g();
                    length2++;
                }
                this.f11496c = iArr2;
                aes.mo14226d(c);
            } else if (a == 34) {
                if (this.f11497d == null) {
                    this.f11497d = new ank();
                }
                aes.mo14219a((afc) this.f11497d);
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11494a != null) {
            a += aeu.m13936b(1, this.f11494a);
        }
        if (this.f11495b != null) {
            a += aeu.m13934b(2, this.f11495b.intValue());
        }
        if (this.f11496c != null && this.f11496c.length > 0) {
            int i = 0;
            for (int a2 : this.f11496c) {
                i += aeu.m13926a(a2);
            }
            a = a + i + (1 * this.f11496c.length);
        }
        return this.f11497d != null ? a + aeu.m13935b(4, (afc) this.f11497d) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11494a != null) {
            aeu.mo14239a(1, this.f11494a);
        }
        if (this.f11495b != null) {
            aeu.mo14236a(2, this.f11495b.intValue());
        }
        if (this.f11496c != null && this.f11496c.length > 0) {
            for (int a : this.f11496c) {
                aeu.mo14236a(3, a);
            }
        }
        if (this.f11497d != null) {
            aeu.mo14238a(4, (afc) this.f11497d);
        }
        super.mo13938a(aeu);
    }
}

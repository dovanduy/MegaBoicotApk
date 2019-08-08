package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class amx extends aew<amx> {

    /* renamed from: a */
    private Integer f11465a;

    /* renamed from: b */
    private ank f11466b;

    /* renamed from: c */
    private ank f11467c;

    /* renamed from: d */
    private ank f11468d;

    /* renamed from: e */
    private ank[] f11469e;

    /* renamed from: f */
    private Integer f11470f;

    public amx() {
        this.f11465a = null;
        this.f11466b = null;
        this.f11467c = null;
        this.f11468d = null;
        this.f11469e = ank.m14521b();
        this.f11470f = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11465a != null) {
            a += aeu.m13934b(1, this.f11465a.intValue());
        }
        if (this.f11466b != null) {
            a += aeu.m13935b(2, (afc) this.f11466b);
        }
        if (this.f11467c != null) {
            a += aeu.m13935b(3, (afc) this.f11467c);
        }
        if (this.f11468d != null) {
            a += aeu.m13935b(4, (afc) this.f11468d);
        }
        if (this.f11469e != null && this.f11469e.length > 0) {
            for (ank ank : this.f11469e) {
                if (ank != null) {
                    a += aeu.m13935b(5, (afc) ank);
                }
            }
        }
        return this.f11470f != null ? a + aeu.m13934b(6, this.f11470f.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        ank ank;
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a != 8) {
                if (a == 18) {
                    if (this.f11466b == null) {
                        this.f11466b = new ank();
                    }
                    ank = this.f11466b;
                } else if (a == 26) {
                    if (this.f11467c == null) {
                        this.f11467c = new ank();
                    }
                    ank = this.f11467c;
                } else if (a == 34) {
                    if (this.f11468d == null) {
                        this.f11468d = new ank();
                    }
                    ank = this.f11468d;
                } else if (a == 42) {
                    int a2 = aff.m13985a(aes, 42);
                    int length = this.f11469e == null ? 0 : this.f11469e.length;
                    ank[] ankArr = new ank[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f11469e, 0, ankArr, 0, length);
                    }
                    while (length < ankArr.length - 1) {
                        ankArr[length] = new ank();
                        aes.mo14219a((afc) ankArr[length]);
                        aes.mo14217a();
                        length++;
                    }
                    ankArr[length] = new ank();
                    aes.mo14219a((afc) ankArr[length]);
                    this.f11469e = ankArr;
                } else if (a == 48) {
                    this.f11470f = Integer.valueOf(aes.mo14231g());
                } else if (!super.mo14246a(aes, a)) {
                    return this;
                }
                aes.mo14219a((afc) ank);
            } else {
                this.f11465a = Integer.valueOf(aes.mo14231g());
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11465a != null) {
            aeu.mo14236a(1, this.f11465a.intValue());
        }
        if (this.f11466b != null) {
            aeu.mo14238a(2, (afc) this.f11466b);
        }
        if (this.f11467c != null) {
            aeu.mo14238a(3, (afc) this.f11467c);
        }
        if (this.f11468d != null) {
            aeu.mo14238a(4, (afc) this.f11468d);
        }
        if (this.f11469e != null && this.f11469e.length > 0) {
            for (ank ank : this.f11469e) {
                if (ank != null) {
                    aeu.mo14238a(5, (afc) ank);
                }
            }
        }
        if (this.f11470f != null) {
            aeu.mo14236a(6, this.f11470f.intValue());
        }
        super.mo13938a(aeu);
    }
}

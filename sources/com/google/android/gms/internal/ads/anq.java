package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class anq extends aew<anq> {

    /* renamed from: a */
    private Integer f11558a;

    /* renamed from: b */
    private ano f11559b;

    /* renamed from: c */
    private Integer f11560c;

    /* renamed from: d */
    private Integer f11561d;

    /* renamed from: e */
    private Integer f11562e;

    public anq() {
        this.f11558a = null;
        this.f11559b = null;
        this.f11560c = null;
        this.f11561d = null;
        this.f11562e = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final anq mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                int j = aes.mo14234j();
                try {
                    this.f11558a = Integer.valueOf(ams.m14452a(aes.mo14231g()));
                } catch (IllegalArgumentException unused) {
                    aes.mo14229e(j);
                    mo14246a(aes, a);
                }
            } else if (a == 18) {
                if (this.f11559b == null) {
                    this.f11559b = new ano();
                }
                aes.mo14219a((afc) this.f11559b);
            } else if (a == 24) {
                this.f11560c = Integer.valueOf(aes.mo14231g());
            } else if (a == 32) {
                this.f11561d = Integer.valueOf(aes.mo14231g());
            } else if (a == 40) {
                this.f11562e = Integer.valueOf(aes.mo14231g());
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11558a != null) {
            a += aeu.m13934b(1, this.f11558a.intValue());
        }
        if (this.f11559b != null) {
            a += aeu.m13935b(2, (afc) this.f11559b);
        }
        if (this.f11560c != null) {
            a += aeu.m13934b(3, this.f11560c.intValue());
        }
        if (this.f11561d != null) {
            a += aeu.m13934b(4, this.f11561d.intValue());
        }
        return this.f11562e != null ? a + aeu.m13934b(5, this.f11562e.intValue()) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11558a != null) {
            aeu.mo14236a(1, this.f11558a.intValue());
        }
        if (this.f11559b != null) {
            aeu.mo14238a(2, (afc) this.f11559b);
        }
        if (this.f11560c != null) {
            aeu.mo14236a(3, this.f11560c.intValue());
        }
        if (this.f11561d != null) {
            aeu.mo14236a(4, this.f11561d.intValue());
        }
        if (this.f11562e != null) {
            aeu.mo14236a(5, this.f11562e.intValue());
        }
        super.mo13938a(aeu);
    }
}

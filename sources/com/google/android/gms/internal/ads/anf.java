package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class anf extends aew<anf> {

    /* renamed from: a */
    private Integer f11506a;

    /* renamed from: b */
    private ank f11507b;

    public anf() {
        this.f11506a = null;
        this.f11507b = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final anf mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                int j = aes.mo14234j();
                try {
                    this.f11506a = Integer.valueOf(ams.m14452a(aes.mo14231g()));
                } catch (IllegalArgumentException unused) {
                    aes.mo14229e(j);
                    mo14246a(aes, a);
                }
            } else if (a == 18) {
                if (this.f11507b == null) {
                    this.f11507b = new ank();
                }
                aes.mo14219a((afc) this.f11507b);
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11506a != null) {
            a += aeu.m13934b(1, this.f11506a.intValue());
        }
        return this.f11507b != null ? a + aeu.m13935b(2, (afc) this.f11507b) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11506a != null) {
            aeu.mo14236a(1, this.f11506a.intValue());
        }
        if (this.f11507b != null) {
            aeu.mo14238a(2, (afc) this.f11507b);
        }
        super.mo13938a(aeu);
    }
}

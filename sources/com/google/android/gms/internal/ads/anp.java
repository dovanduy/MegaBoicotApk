package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class anp extends aew<anp> {

    /* renamed from: a */
    private anl f11554a;

    /* renamed from: b */
    private Integer f11555b;

    /* renamed from: c */
    private ano f11556c;

    /* renamed from: d */
    private ank f11557d;

    public anp() {
        this.f11554a = null;
        this.f11555b = null;
        this.f11556c = null;
        this.f11557d = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final anp mo13937a(aes aes) throws IOException {
        afc afc;
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f11554a == null) {
                    this.f11554a = new anl();
                }
                afc = this.f11554a;
            } else if (a == 16) {
                int j = aes.mo14234j();
                try {
                    this.f11555b = Integer.valueOf(ams.m14452a(aes.mo14231g()));
                } catch (IllegalArgumentException unused) {
                    aes.mo14229e(j);
                    mo14246a(aes, a);
                }
            } else if (a == 26) {
                if (this.f11556c == null) {
                    this.f11556c = new ano();
                }
                afc = this.f11556c;
            } else if (a == 34) {
                if (this.f11557d == null) {
                    this.f11557d = new ank();
                }
                afc = this.f11557d;
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
            aes.mo14219a(afc);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11554a != null) {
            a += aeu.m13935b(1, (afc) this.f11554a);
        }
        if (this.f11555b != null) {
            a += aeu.m13934b(2, this.f11555b.intValue());
        }
        if (this.f11556c != null) {
            a += aeu.m13935b(3, (afc) this.f11556c);
        }
        return this.f11557d != null ? a + aeu.m13935b(4, (afc) this.f11557d) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11554a != null) {
            aeu.mo14238a(1, (afc) this.f11554a);
        }
        if (this.f11555b != null) {
            aeu.mo14236a(2, this.f11555b.intValue());
        }
        if (this.f11556c != null) {
            aeu.mo14238a(3, (afc) this.f11556c);
        }
        if (this.f11557d != null) {
            aeu.mo14238a(4, (afc) this.f11557d);
        }
        super.mo13938a(aeu);
    }
}

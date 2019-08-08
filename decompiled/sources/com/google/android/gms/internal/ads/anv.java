package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class anv extends aew<anv> {

    /* renamed from: a */
    private Integer f11576a;

    /* renamed from: b */
    private ano f11577b;

    public anv() {
        this.f11576a = null;
        this.f11577b = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final anv mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                int j = aes.mo14234j();
                try {
                    this.f11576a = Integer.valueOf(ams.m14452a(aes.mo14231g()));
                } catch (IllegalArgumentException unused) {
                    aes.mo14229e(j);
                    mo14246a(aes, a);
                }
            } else if (a == 18) {
                if (this.f11577b == null) {
                    this.f11577b = new ano();
                }
                aes.mo14219a((afc) this.f11577b);
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11576a != null) {
            a += aeu.m13934b(1, this.f11576a.intValue());
        }
        return this.f11577b != null ? a + aeu.m13935b(2, (afc) this.f11577b) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11576a != null) {
            aeu.mo14236a(1, this.f11576a.intValue());
        }
        if (this.f11577b != null) {
            aeu.mo14238a(2, (afc) this.f11577b);
        }
        super.mo13938a(aeu);
    }
}

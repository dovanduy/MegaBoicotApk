package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class anu extends aew<anu> {

    /* renamed from: a */
    private Integer f11573a;

    /* renamed from: b */
    private ano f11574b;

    /* renamed from: c */
    private ank f11575c;

    public anu() {
        this.f11573a = null;
        this.f11574b = null;
        this.f11575c = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final anu mo13937a(aes aes) throws IOException {
        afc afc;
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a != 8) {
                if (a == 18) {
                    if (this.f11574b == null) {
                        this.f11574b = new ano();
                    }
                    afc = this.f11574b;
                } else if (a == 26) {
                    if (this.f11575c == null) {
                        this.f11575c = new ank();
                    }
                    afc = this.f11575c;
                } else if (!super.mo14246a(aes, a)) {
                    return this;
                }
                aes.mo14219a(afc);
            } else {
                int j = aes.mo14234j();
                try {
                    this.f11573a = Integer.valueOf(ams.m14452a(aes.mo14231g()));
                } catch (IllegalArgumentException unused) {
                    aes.mo14229e(j);
                    mo14246a(aes, a);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11573a != null) {
            a += aeu.m13934b(1, this.f11573a.intValue());
        }
        if (this.f11574b != null) {
            a += aeu.m13935b(2, (afc) this.f11574b);
        }
        return this.f11575c != null ? a + aeu.m13935b(3, (afc) this.f11575c) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11573a != null) {
            aeu.mo14236a(1, this.f11573a.intValue());
        }
        if (this.f11574b != null) {
            aeu.mo14238a(2, (afc) this.f11574b);
        }
        if (this.f11575c != null) {
            aeu.mo14238a(3, (afc) this.f11575c);
        }
        super.mo13938a(aeu);
    }
}

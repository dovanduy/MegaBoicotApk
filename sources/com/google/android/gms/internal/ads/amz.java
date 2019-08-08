package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class amz extends aew<amz> {

    /* renamed from: a */
    private Integer f11479a;

    /* renamed from: b */
    private anl f11480b;

    /* renamed from: c */
    private String f11481c;

    /* renamed from: d */
    private String f11482d;

    public amz() {
        this.f11479a = null;
        this.f11480b = null;
        this.f11481c = null;
        this.f11482d = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final amz mo13937a(aes aes) throws IOException {
        int g;
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 40) {
                try {
                    g = aes.mo14231g();
                    if (g < 0 || g > 2) {
                        StringBuilder sb = new StringBuilder(40);
                        sb.append(g);
                        sb.append(" is not a valid enum Platform");
                    } else {
                        this.f11479a = Integer.valueOf(g);
                    }
                } catch (IllegalArgumentException unused) {
                    aes.mo14229e(aes.mo14234j());
                    mo14246a(aes, a);
                }
            } else if (a == 50) {
                if (this.f11480b == null) {
                    this.f11480b = new anl();
                }
                aes.mo14219a((afc) this.f11480b);
            } else if (a == 58) {
                this.f11481c = aes.mo14228e();
            } else if (a == 66) {
                this.f11482d = aes.mo14228e();
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(g);
        sb2.append(" is not a valid enum Platform");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11479a != null) {
            a += aeu.m13934b(5, this.f11479a.intValue());
        }
        if (this.f11480b != null) {
            a += aeu.m13935b(6, (afc) this.f11480b);
        }
        if (this.f11481c != null) {
            a += aeu.m13936b(7, this.f11481c);
        }
        return this.f11482d != null ? a + aeu.m13936b(8, this.f11482d) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11479a != null) {
            aeu.mo14236a(5, this.f11479a.intValue());
        }
        if (this.f11480b != null) {
            aeu.mo14238a(6, (afc) this.f11480b);
        }
        if (this.f11481c != null) {
            aeu.mo14239a(7, this.f11481c);
        }
        if (this.f11482d != null) {
            aeu.mo14239a(8, this.f11482d);
        }
        super.mo13938a(aeu);
    }
}

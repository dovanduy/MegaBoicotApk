package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class ano extends aew<ano> {

    /* renamed from: a */
    private Integer f11553a;

    public ano() {
        this.f11553a = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ano mo13937a(aes aes) throws IOException {
        int g;
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    g = aes.mo14231g();
                    if (g < 0 || g > 3) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(g);
                        sb.append(" is not a valid enum VideoErrorCode");
                    } else {
                        this.f11553a = Integer.valueOf(g);
                    }
                } catch (IllegalArgumentException unused) {
                    aes.mo14229e(aes.mo14234j());
                    mo14246a(aes, a);
                }
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(g);
        sb2.append(" is not a valid enum VideoErrorCode");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        return this.f11553a != null ? a + aeu.m13934b(1, this.f11553a.intValue()) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11553a != null) {
            aeu.mo14236a(1, this.f11553a.intValue());
        }
        super.mo13938a(aeu);
    }
}

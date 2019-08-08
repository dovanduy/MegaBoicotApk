package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class amu extends aew<amu> {

    /* renamed from: a */
    private static volatile amu[] f11454a;

    /* renamed from: b */
    private Integer f11455b;

    /* renamed from: c */
    private ani f11456c;

    public amu() {
        this.f11455b = null;
        this.f11456c = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final amu mo13937a(aes aes) throws IOException {
        int g;
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    g = aes.mo14231g();
                    if (g < 0 || g > 10) {
                        StringBuilder sb = new StringBuilder(44);
                        sb.append(g);
                        sb.append(" is not a valid enum AdFormatType");
                    } else {
                        this.f11455b = Integer.valueOf(g);
                    }
                } catch (IllegalArgumentException unused) {
                    aes.mo14229e(aes.mo14234j());
                    mo14246a(aes, a);
                }
            } else if (a == 18) {
                if (this.f11456c == null) {
                    this.f11456c = new ani();
                }
                aes.mo14219a((afc) this.f11456c);
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append(g);
        sb2.append(" is not a valid enum AdFormatType");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: b */
    public static amu[] m14458b() {
        if (f11454a == null) {
            synchronized (afa.f10687b) {
                if (f11454a == null) {
                    f11454a = new amu[0];
                }
            }
        }
        return f11454a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11455b != null) {
            a += aeu.m13934b(1, this.f11455b.intValue());
        }
        return this.f11456c != null ? a + aeu.m13935b(2, (afc) this.f11456c) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11455b != null) {
            aeu.mo14236a(1, this.f11455b.intValue());
        }
        if (this.f11456c != null) {
            aeu.mo14238a(2, (afc) this.f11456c);
        }
        super.mo13938a(aeu);
    }
}

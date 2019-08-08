package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class ant extends aew<ant> {

    /* renamed from: a */
    private Integer f11567a;

    /* renamed from: b */
    private ano f11568b;

    /* renamed from: c */
    private Integer f11569c;

    /* renamed from: d */
    private Integer f11570d;

    /* renamed from: e */
    private Integer f11571e;

    /* renamed from: f */
    private Long f11572f;

    public ant() {
        this.f11567a = null;
        this.f11568b = null;
        this.f11569c = null;
        this.f11570d = null;
        this.f11571e = null;
        this.f11572f = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ant mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                int j = aes.mo14234j();
                try {
                    this.f11567a = Integer.valueOf(ams.m14452a(aes.mo14231g()));
                } catch (IllegalArgumentException unused) {
                    aes.mo14229e(j);
                    mo14246a(aes, a);
                }
            } else if (a == 18) {
                if (this.f11568b == null) {
                    this.f11568b = new ano();
                }
                aes.mo14219a((afc) this.f11568b);
            } else if (a == 24) {
                this.f11569c = Integer.valueOf(aes.mo14231g());
            } else if (a == 32) {
                this.f11570d = Integer.valueOf(aes.mo14231g());
            } else if (a == 40) {
                this.f11571e = Integer.valueOf(aes.mo14231g());
            } else if (a == 48) {
                this.f11572f = Long.valueOf(aes.mo14232h());
            } else if (!super.mo14246a(aes, a)) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11567a != null) {
            a += aeu.m13934b(1, this.f11567a.intValue());
        }
        if (this.f11568b != null) {
            a += aeu.m13935b(2, (afc) this.f11568b);
        }
        if (this.f11569c != null) {
            a += aeu.m13934b(3, this.f11569c.intValue());
        }
        if (this.f11570d != null) {
            a += aeu.m13934b(4, this.f11570d.intValue());
        }
        if (this.f11571e != null) {
            a += aeu.m13934b(5, this.f11571e.intValue());
        }
        return this.f11572f != null ? a + aeu.m13940c(6, this.f11572f.longValue()) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11567a != null) {
            aeu.mo14236a(1, this.f11567a.intValue());
        }
        if (this.f11568b != null) {
            aeu.mo14238a(2, (afc) this.f11568b);
        }
        if (this.f11569c != null) {
            aeu.mo14236a(3, this.f11569c.intValue());
        }
        if (this.f11570d != null) {
            aeu.mo14236a(4, this.f11570d.intValue());
        }
        if (this.f11571e != null) {
            aeu.mo14236a(5, this.f11571e.intValue());
        }
        if (this.f11572f != null) {
            aeu.mo14237a(6, this.f11572f.longValue());
        }
        super.mo13938a(aeu);
    }
}

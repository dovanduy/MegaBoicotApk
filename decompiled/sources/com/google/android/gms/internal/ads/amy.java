package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class amy extends aew<amy> {

    /* renamed from: a */
    public String f11471a;

    /* renamed from: b */
    public anl f11472b;

    /* renamed from: c */
    private ank f11473c;

    /* renamed from: d */
    private Integer f11474d;

    /* renamed from: e */
    private Integer f11475e;

    /* renamed from: f */
    private Integer f11476f;

    /* renamed from: g */
    private Integer f11477g;

    /* renamed from: h */
    private Integer f11478h;

    public amy() {
        this.f11471a = null;
        this.f11473c = null;
        this.f11474d = null;
        this.f11472b = null;
        this.f11475e = null;
        this.f11476f = null;
        this.f11477g = null;
        this.f11478h = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final amy mo13937a(aes aes) throws IOException {
        afc afc;
        int i;
        while (true) {
            int a = aes.mo14217a();
            if (a == 0) {
                return this;
            }
            if (a != 10) {
                if (a == 18) {
                    if (this.f11473c == null) {
                        this.f11473c = new ank();
                    }
                    afc = this.f11473c;
                } else if (a == 24) {
                    this.f11474d = Integer.valueOf(aes.mo14231g());
                } else if (a == 34) {
                    if (this.f11472b == null) {
                        this.f11472b = new anl();
                    }
                    afc = this.f11472b;
                } else if (a == 40) {
                    this.f11475e = Integer.valueOf(aes.mo14231g());
                } else if (a == 48) {
                    i = aes.mo14234j();
                    this.f11476f = Integer.valueOf(ams.m14452a(aes.mo14231g()));
                } else if (a == 56) {
                    i = aes.mo14234j();
                    this.f11477g = Integer.valueOf(ams.m14452a(aes.mo14231g()));
                } else if (a == 64) {
                    i = aes.mo14234j();
                    try {
                        this.f11478h = Integer.valueOf(ams.m14452a(aes.mo14231g()));
                    } catch (IllegalArgumentException unused) {
                        aes.mo14229e(i);
                        mo14246a(aes, a);
                    }
                } else if (!super.mo14246a(aes, a)) {
                    return this;
                }
                aes.mo14219a(afc);
            } else {
                this.f11471a = aes.mo14228e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11471a != null) {
            a += aeu.m13936b(1, this.f11471a);
        }
        if (this.f11473c != null) {
            a += aeu.m13935b(2, (afc) this.f11473c);
        }
        if (this.f11474d != null) {
            a += aeu.m13934b(3, this.f11474d.intValue());
        }
        if (this.f11472b != null) {
            a += aeu.m13935b(4, (afc) this.f11472b);
        }
        if (this.f11475e != null) {
            a += aeu.m13934b(5, this.f11475e.intValue());
        }
        if (this.f11476f != null) {
            a += aeu.m13934b(6, this.f11476f.intValue());
        }
        if (this.f11477g != null) {
            a += aeu.m13934b(7, this.f11477g.intValue());
        }
        return this.f11478h != null ? a + aeu.m13934b(8, this.f11478h.intValue()) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11471a != null) {
            aeu.mo14239a(1, this.f11471a);
        }
        if (this.f11473c != null) {
            aeu.mo14238a(2, (afc) this.f11473c);
        }
        if (this.f11474d != null) {
            aeu.mo14236a(3, this.f11474d.intValue());
        }
        if (this.f11472b != null) {
            aeu.mo14238a(4, (afc) this.f11472b);
        }
        if (this.f11475e != null) {
            aeu.mo14236a(5, this.f11475e.intValue());
        }
        if (this.f11476f != null) {
            aeu.mo14236a(6, this.f11476f.intValue());
        }
        if (this.f11477g != null) {
            aeu.mo14236a(7, this.f11477g.intValue());
        }
        if (this.f11478h != null) {
            aeu.mo14236a(8, this.f11478h.intValue());
        }
        super.mo13938a(aeu);
    }
}

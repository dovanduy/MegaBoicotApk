package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class anm extends aew<anm> {

    /* renamed from: a */
    private static volatile anm[] f11533a;

    /* renamed from: b */
    private anq f11534b;

    /* renamed from: c */
    private ant f11535c;

    /* renamed from: d */
    private anu f11536d;

    /* renamed from: e */
    private anv f11537e;

    /* renamed from: f */
    private ann f11538f;

    /* renamed from: g */
    private anr f11539g;

    /* renamed from: h */
    private anp f11540h;

    /* renamed from: i */
    private Integer f11541i;

    /* renamed from: j */
    private Integer f11542j;

    /* renamed from: k */
    private ank f11543k;

    /* renamed from: l */
    private Integer f11544l;

    /* renamed from: m */
    private Integer f11545m;

    /* renamed from: n */
    private Integer f11546n;

    /* renamed from: o */
    private Integer f11547o;

    /* renamed from: p */
    private Integer f11548p;

    /* renamed from: q */
    private Long f11549q;

    public anm() {
        this.f11534b = null;
        this.f11535c = null;
        this.f11536d = null;
        this.f11537e = null;
        this.f11538f = null;
        this.f11539g = null;
        this.f11540h = null;
        this.f11541i = null;
        this.f11542j = null;
        this.f11543k = null;
        this.f11544l = null;
        this.f11545m = null;
        this.f11546n = null;
        this.f11547o = null;
        this.f11548p = null;
        this.f11549q = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* renamed from: b */
    public static anm[] m14528b() {
        if (f11533a == null) {
            synchronized (afa.f10687b) {
                if (f11533a == null) {
                    f11533a = new anm[0];
                }
            }
        }
        return f11533a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11534b != null) {
            a += aeu.m13935b(5, (afc) this.f11534b);
        }
        if (this.f11535c != null) {
            a += aeu.m13935b(6, (afc) this.f11535c);
        }
        if (this.f11536d != null) {
            a += aeu.m13935b(7, (afc) this.f11536d);
        }
        if (this.f11537e != null) {
            a += aeu.m13935b(8, (afc) this.f11537e);
        }
        if (this.f11538f != null) {
            a += aeu.m13935b(9, (afc) this.f11538f);
        }
        if (this.f11539g != null) {
            a += aeu.m13935b(10, (afc) this.f11539g);
        }
        if (this.f11540h != null) {
            a += aeu.m13935b(11, (afc) this.f11540h);
        }
        if (this.f11541i != null) {
            a += aeu.m13934b(12, this.f11541i.intValue());
        }
        if (this.f11542j != null) {
            a += aeu.m13934b(13, this.f11542j.intValue());
        }
        if (this.f11543k != null) {
            a += aeu.m13935b(14, (afc) this.f11543k);
        }
        if (this.f11544l != null) {
            a += aeu.m13934b(15, this.f11544l.intValue());
        }
        if (this.f11545m != null) {
            a += aeu.m13934b(16, this.f11545m.intValue());
        }
        if (this.f11546n != null) {
            a += aeu.m13934b(17, this.f11546n.intValue());
        }
        if (this.f11547o != null) {
            a += aeu.m13934b(18, this.f11547o.intValue());
        }
        if (this.f11548p != null) {
            a += aeu.m13934b(19, this.f11548p.intValue());
        }
        return this.f11549q != null ? a + aeu.m13940c(20, this.f11549q.longValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        afc afc;
        while (true) {
            int a = aes.mo14217a();
            switch (a) {
                case 0:
                    return this;
                case 42:
                    if (this.f11534b == null) {
                        this.f11534b = new anq();
                    }
                    afc = this.f11534b;
                    break;
                case 50:
                    if (this.f11535c == null) {
                        this.f11535c = new ant();
                    }
                    afc = this.f11535c;
                    break;
                case 58:
                    if (this.f11536d == null) {
                        this.f11536d = new anu();
                    }
                    afc = this.f11536d;
                    break;
                case 66:
                    if (this.f11537e == null) {
                        this.f11537e = new anv();
                    }
                    afc = this.f11537e;
                    break;
                case 74:
                    if (this.f11538f == null) {
                        this.f11538f = new ann();
                    }
                    afc = this.f11538f;
                    break;
                case 82:
                    if (this.f11539g == null) {
                        this.f11539g = new anr();
                    }
                    afc = this.f11539g;
                    break;
                case 90:
                    if (this.f11540h == null) {
                        this.f11540h = new anp();
                    }
                    afc = this.f11540h;
                    break;
                case 96:
                    this.f11541i = Integer.valueOf(aes.mo14231g());
                    continue;
                case 104:
                    this.f11542j = Integer.valueOf(aes.mo14231g());
                    continue;
                case 114:
                    if (this.f11543k == null) {
                        this.f11543k = new ank();
                    }
                    afc = this.f11543k;
                    break;
                case 120:
                    this.f11544l = Integer.valueOf(aes.mo14231g());
                    continue;
                case 128:
                    this.f11545m = Integer.valueOf(aes.mo14231g());
                    continue;
                case 136:
                    this.f11546n = Integer.valueOf(aes.mo14231g());
                    continue;
                case 144:
                    this.f11547o = Integer.valueOf(aes.mo14231g());
                    continue;
                case 152:
                    this.f11548p = Integer.valueOf(aes.mo14231g());
                    continue;
                case 160:
                    this.f11549q = Long.valueOf(aes.mo14232h());
                    continue;
                default:
                    if (!super.mo14246a(aes, a)) {
                        return this;
                    }
                    continue;
            }
            aes.mo14219a(afc);
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11534b != null) {
            aeu.mo14238a(5, (afc) this.f11534b);
        }
        if (this.f11535c != null) {
            aeu.mo14238a(6, (afc) this.f11535c);
        }
        if (this.f11536d != null) {
            aeu.mo14238a(7, (afc) this.f11536d);
        }
        if (this.f11537e != null) {
            aeu.mo14238a(8, (afc) this.f11537e);
        }
        if (this.f11538f != null) {
            aeu.mo14238a(9, (afc) this.f11538f);
        }
        if (this.f11539g != null) {
            aeu.mo14238a(10, (afc) this.f11539g);
        }
        if (this.f11540h != null) {
            aeu.mo14238a(11, (afc) this.f11540h);
        }
        if (this.f11541i != null) {
            aeu.mo14236a(12, this.f11541i.intValue());
        }
        if (this.f11542j != null) {
            aeu.mo14236a(13, this.f11542j.intValue());
        }
        if (this.f11543k != null) {
            aeu.mo14238a(14, (afc) this.f11543k);
        }
        if (this.f11544l != null) {
            aeu.mo14236a(15, this.f11544l.intValue());
        }
        if (this.f11545m != null) {
            aeu.mo14236a(16, this.f11545m.intValue());
        }
        if (this.f11546n != null) {
            aeu.mo14236a(17, this.f11546n.intValue());
        }
        if (this.f11547o != null) {
            aeu.mo14236a(18, this.f11547o.intValue());
        }
        if (this.f11548p != null) {
            aeu.mo14236a(19, this.f11548p.intValue());
        }
        if (this.f11549q != null) {
            aeu.mo14237a(20, this.f11549q.longValue());
        }
        super.mo13938a(aeu);
    }
}

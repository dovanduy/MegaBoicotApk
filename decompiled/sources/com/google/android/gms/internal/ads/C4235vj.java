package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.vj */
public final class C4235vj extends aew<C4235vj> {

    /* renamed from: a */
    public String f14122a;

    /* renamed from: b */
    public Long f14123b;

    /* renamed from: c */
    private String f14124c;

    /* renamed from: d */
    private String f14125d;

    /* renamed from: e */
    private String f14126e;

    /* renamed from: f */
    private Long f14127f;

    /* renamed from: g */
    private Long f14128g;

    /* renamed from: h */
    private String f14129h;

    /* renamed from: i */
    private Long f14130i;

    /* renamed from: j */
    private String f14131j;

    public C4235vj() {
        this.f14122a = null;
        this.f14123b = null;
        this.f14124c = null;
        this.f14125d = null;
        this.f14126e = null;
        this.f14127f = null;
        this.f14128g = null;
        this.f14129h = null;
        this.f14130i = null;
        this.f14131j = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f14122a != null) {
            a += aeu.m13936b(1, this.f14122a);
        }
        if (this.f14123b != null) {
            a += aeu.m13942d(2, this.f14123b.longValue());
        }
        if (this.f14124c != null) {
            a += aeu.m13936b(3, this.f14124c);
        }
        if (this.f14125d != null) {
            a += aeu.m13936b(4, this.f14125d);
        }
        if (this.f14126e != null) {
            a += aeu.m13936b(5, this.f14126e);
        }
        if (this.f14127f != null) {
            a += aeu.m13942d(6, this.f14127f.longValue());
        }
        if (this.f14128g != null) {
            a += aeu.m13942d(7, this.f14128g.longValue());
        }
        if (this.f14129h != null) {
            a += aeu.m13936b(8, this.f14129h);
        }
        if (this.f14130i != null) {
            a += aeu.m13942d(9, this.f14130i.longValue());
        }
        return this.f14131j != null ? a + aeu.m13936b(10, this.f14131j) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ afc mo13937a(aes aes) throws IOException {
        while (true) {
            int a = aes.mo14217a();
            switch (a) {
                case 0:
                    return this;
                case 10:
                    this.f14122a = aes.mo14228e();
                    break;
                case 16:
                    this.f14123b = Long.valueOf(aes.mo14232h());
                    break;
                case 26:
                    this.f14124c = aes.mo14228e();
                    break;
                case 34:
                    this.f14125d = aes.mo14228e();
                    break;
                case 42:
                    this.f14126e = aes.mo14228e();
                    break;
                case 48:
                    this.f14127f = Long.valueOf(aes.mo14232h());
                    break;
                case 56:
                    this.f14128g = Long.valueOf(aes.mo14232h());
                    break;
                case 66:
                    this.f14129h = aes.mo14228e();
                    break;
                case 72:
                    this.f14130i = Long.valueOf(aes.mo14232h());
                    break;
                case 82:
                    this.f14131j = aes.mo14228e();
                    break;
                default:
                    if (super.mo14246a(aes, a)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f14122a != null) {
            aeu.mo14239a(1, this.f14122a);
        }
        if (this.f14123b != null) {
            aeu.mo14242b(2, this.f14123b.longValue());
        }
        if (this.f14124c != null) {
            aeu.mo14239a(3, this.f14124c);
        }
        if (this.f14125d != null) {
            aeu.mo14239a(4, this.f14125d);
        }
        if (this.f14126e != null) {
            aeu.mo14239a(5, this.f14126e);
        }
        if (this.f14127f != null) {
            aeu.mo14242b(6, this.f14127f.longValue());
        }
        if (this.f14128g != null) {
            aeu.mo14242b(7, this.f14128g.longValue());
        }
        if (this.f14129h != null) {
            aeu.mo14239a(8, this.f14129h);
        }
        if (this.f14130i != null) {
            aeu.mo14242b(9, this.f14130i.longValue());
        }
        if (this.f14131j != null) {
            aeu.mo14239a(10, this.f14131j);
        }
        super.mo13938a(aeu);
    }
}

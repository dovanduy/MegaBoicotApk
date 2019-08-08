package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.p132ts.TsExtractor;
import java.io.IOException;

public final class ana extends aew<ana> {

    /* renamed from: a */
    public String f11484a;

    /* renamed from: b */
    public long[] f11485b;

    /* renamed from: c */
    public amy f11486c;

    /* renamed from: d */
    public amt f11487d;

    /* renamed from: e */
    private Integer f11488e;

    /* renamed from: f */
    private Integer f11489f;

    /* renamed from: g */
    private Integer f11490g;

    /* renamed from: h */
    private anl f11491h;

    /* renamed from: i */
    private amz f11492i;

    /* renamed from: j */
    private ane f11493j;

    public ana() {
        this.f11488e = null;
        this.f11484a = null;
        this.f11489f = null;
        this.f11490g = null;
        this.f11491h = null;
        this.f11485b = aff.f10693b;
        this.f11486c = null;
        this.f11492i = null;
        this.f11493j = null;
        this.f11487d = null;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ana mo13937a(aes aes) throws IOException {
        afc afc;
        while (true) {
            int a = aes.mo14217a();
            switch (a) {
                case 0:
                    return this;
                case 72:
                    this.f11488e = Integer.valueOf(aes.mo14231g());
                    continue;
                case 82:
                    this.f11484a = aes.mo14228e();
                    continue;
                case 88:
                    this.f11489f = Integer.valueOf(aes.mo14231g());
                    continue;
                case 96:
                    int j = aes.mo14234j();
                    try {
                        this.f11490g = Integer.valueOf(ams.m14452a(aes.mo14231g()));
                        continue;
                    } catch (IllegalArgumentException unused) {
                        aes.mo14229e(j);
                        mo14246a(aes, a);
                        break;
                    }
                case 106:
                    if (this.f11491h == null) {
                        this.f11491h = new anl();
                    }
                    afc = this.f11491h;
                    break;
                case 112:
                    int a2 = aff.m13985a(aes, 112);
                    int length = this.f11485b == null ? 0 : this.f11485b.length;
                    long[] jArr = new long[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f11485b, 0, jArr, 0, length);
                    }
                    while (length < jArr.length - 1) {
                        jArr[length] = aes.mo14232h();
                        aes.mo14217a();
                        length++;
                    }
                    jArr[length] = aes.mo14232h();
                    this.f11485b = jArr;
                    continue;
                case 114:
                    int c = aes.mo14225c(aes.mo14231g());
                    int j2 = aes.mo14234j();
                    int i = 0;
                    while (aes.mo14233i() > 0) {
                        aes.mo14232h();
                        i++;
                    }
                    aes.mo14229e(j2);
                    int length2 = this.f11485b == null ? 0 : this.f11485b.length;
                    long[] jArr2 = new long[(i + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f11485b, 0, jArr2, 0, length2);
                    }
                    while (length2 < jArr2.length) {
                        jArr2[length2] = aes.mo14232h();
                        length2++;
                    }
                    this.f11485b = jArr2;
                    aes.mo14226d(c);
                    continue;
                case 122:
                    if (this.f11486c == null) {
                        this.f11486c = new amy();
                    }
                    afc = this.f11486c;
                    break;
                case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /*130*/:
                    if (this.f11492i == null) {
                        this.f11492i = new amz();
                    }
                    afc = this.f11492i;
                    break;
                case TsExtractor.TS_STREAM_TYPE_DTS /*138*/:
                    if (this.f11493j == null) {
                        this.f11493j = new ane();
                    }
                    afc = this.f11493j;
                    break;
                case 146:
                    if (this.f11487d == null) {
                        this.f11487d = new amt();
                    }
                    afc = this.f11487d;
                    break;
                default:
                    if (!super.mo14246a(aes, a)) {
                        return this;
                    }
                    continue;
            }
            aes.mo14219a(afc);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11488e != null) {
            a += aeu.m13934b(9, this.f11488e.intValue());
        }
        if (this.f11484a != null) {
            a += aeu.m13936b(10, this.f11484a);
        }
        if (this.f11489f != null) {
            a += aeu.m13933b(11) + aeu.m13941d(this.f11489f.intValue());
        }
        if (this.f11490g != null) {
            a += aeu.m13934b(12, this.f11490g.intValue());
        }
        if (this.f11491h != null) {
            a += aeu.m13935b(13, (afc) this.f11491h);
        }
        if (this.f11485b != null && this.f11485b.length > 0) {
            int i = 0;
            for (long a2 : this.f11485b) {
                i += aeu.m13927a(a2);
            }
            a = a + i + (1 * this.f11485b.length);
        }
        if (this.f11486c != null) {
            a += aeu.m13935b(15, (afc) this.f11486c);
        }
        if (this.f11492i != null) {
            a += aeu.m13935b(16, (afc) this.f11492i);
        }
        if (this.f11493j != null) {
            a += aeu.m13935b(17, (afc) this.f11493j);
        }
        return this.f11487d != null ? a + aeu.m13935b(18, (afc) this.f11487d) : a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11488e != null) {
            aeu.mo14236a(9, this.f11488e.intValue());
        }
        if (this.f11484a != null) {
            aeu.mo14239a(10, this.f11484a);
        }
        if (this.f11489f != null) {
            int intValue = this.f11489f.intValue();
            aeu.mo14244c(11, 0);
            aeu.mo14243c(intValue);
        }
        if (this.f11490g != null) {
            aeu.mo14236a(12, this.f11490g.intValue());
        }
        if (this.f11491h != null) {
            aeu.mo14238a(13, (afc) this.f11491h);
        }
        if (this.f11485b != null && this.f11485b.length > 0) {
            for (long a : this.f11485b) {
                aeu.mo14237a(14, a);
            }
        }
        if (this.f11486c != null) {
            aeu.mo14238a(15, (afc) this.f11486c);
        }
        if (this.f11492i != null) {
            aeu.mo14238a(16, (afc) this.f11492i);
        }
        if (this.f11493j != null) {
            aeu.mo14238a(17, (afc) this.f11493j);
        }
        if (this.f11487d != null) {
            aeu.mo14238a(18, (afc) this.f11487d);
        }
        super.mo13938a(aeu);
    }
}

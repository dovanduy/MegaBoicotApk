package com.google.android.gms.internal.ads;

import java.io.IOException;

public abstract class aaf {

    /* renamed from: f */
    private static volatile boolean f10276f = true;

    /* renamed from: a */
    int f10277a;

    /* renamed from: b */
    int f10278b;

    /* renamed from: c */
    aai f10279c;

    /* renamed from: d */
    private int f10280d;

    /* renamed from: e */
    private boolean f10281e;

    private aaf() {
        this.f10278b = 100;
        this.f10280d = Integer.MAX_VALUE;
        this.f10281e = false;
    }

    /* renamed from: a */
    public static long m12940a(long j) {
        return (j >>> 1) ^ (-(j & 1));
    }

    /* renamed from: a */
    static aaf m12941a(byte[] bArr, int i, int i2, boolean z) {
        aah aah = new aah(bArr, i, i2, z);
        try {
            aah.mo13784c(i2);
            return aah;
        } catch (abk e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: f */
    public static int m12942f(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract int mo13779a() throws IOException;

    /* renamed from: a */
    public abstract void mo13780a(int i) throws abk;

    /* renamed from: b */
    public abstract double mo13781b() throws IOException;

    /* renamed from: b */
    public abstract boolean mo13782b(int i) throws IOException;

    /* renamed from: c */
    public abstract float mo13783c() throws IOException;

    /* renamed from: c */
    public abstract int mo13784c(int i) throws abk;

    /* renamed from: d */
    public abstract long mo13785d() throws IOException;

    /* renamed from: d */
    public abstract void mo13786d(int i);

    /* renamed from: e */
    public abstract long mo13787e() throws IOException;

    /* renamed from: e */
    public abstract void mo13788e(int i) throws IOException;

    /* renamed from: f */
    public abstract int mo13789f() throws IOException;

    /* renamed from: g */
    public abstract long mo13790g() throws IOException;

    /* renamed from: h */
    public abstract int mo13791h() throws IOException;

    /* renamed from: i */
    public abstract boolean mo13792i() throws IOException;

    /* renamed from: j */
    public abstract String mo13793j() throws IOException;

    /* renamed from: k */
    public abstract String mo13794k() throws IOException;

    /* renamed from: l */
    public abstract C4386zw mo13795l() throws IOException;

    /* renamed from: m */
    public abstract int mo13796m() throws IOException;

    /* renamed from: n */
    public abstract int mo13797n() throws IOException;

    /* renamed from: o */
    public abstract int mo13798o() throws IOException;

    /* renamed from: p */
    public abstract long mo13799p() throws IOException;

    /* renamed from: q */
    public abstract int mo13800q() throws IOException;

    /* renamed from: r */
    public abstract long mo13801r() throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public abstract long mo13802s() throws IOException;

    /* renamed from: t */
    public abstract boolean mo13803t() throws IOException;

    /* renamed from: u */
    public abstract int mo13804u();
}

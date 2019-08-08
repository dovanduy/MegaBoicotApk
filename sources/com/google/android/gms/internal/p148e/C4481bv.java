package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.bv */
public abstract class C4481bv {

    /* renamed from: a */
    int f14711a;

    /* renamed from: b */
    int f14712b;

    /* renamed from: c */
    C4484by f14713c;

    /* renamed from: d */
    private int f14714d;

    /* renamed from: e */
    private boolean f14715e;

    /* renamed from: a */
    public static C4481bv m18997a(byte[] bArr, int i, int i2) {
        return m18998a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public abstract int mo16412a() throws IOException;

    /* renamed from: a */
    public abstract <T extends C4554ec> T mo16413a(C4565en<T> enVar, C4499ch chVar) throws IOException;

    /* renamed from: a */
    public abstract void mo16414a(int i) throws C4526db;

    /* renamed from: b */
    public abstract double mo16415b() throws IOException;

    /* renamed from: b */
    public abstract boolean mo16416b(int i) throws IOException;

    /* renamed from: c */
    public abstract float mo16417c() throws IOException;

    /* renamed from: d */
    public abstract int mo16419d(int i) throws C4526db;

    /* renamed from: d */
    public abstract long mo16420d() throws IOException;

    /* renamed from: e */
    public abstract long mo16421e() throws IOException;

    /* renamed from: e */
    public abstract void mo16422e(int i);

    /* renamed from: f */
    public abstract int mo16423f() throws IOException;

    /* renamed from: f */
    public abstract void mo16424f(int i) throws IOException;

    /* renamed from: g */
    public abstract long mo16425g() throws IOException;

    /* renamed from: h */
    public abstract int mo16426h() throws IOException;

    /* renamed from: i */
    public abstract boolean mo16427i() throws IOException;

    /* renamed from: j */
    public abstract String mo16428j() throws IOException;

    /* renamed from: k */
    public abstract String mo16429k() throws IOException;

    /* renamed from: l */
    public abstract C4469bj mo16430l() throws IOException;

    /* renamed from: m */
    public abstract int mo16431m() throws IOException;

    /* renamed from: n */
    public abstract int mo16432n() throws IOException;

    /* renamed from: o */
    public abstract int mo16433o() throws IOException;

    /* renamed from: p */
    public abstract long mo16434p() throws IOException;

    /* renamed from: q */
    public abstract int mo16435q() throws IOException;

    /* renamed from: r */
    public abstract long mo16436r() throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public abstract long mo16437s() throws IOException;

    /* renamed from: t */
    public abstract boolean mo16438t() throws IOException;

    /* renamed from: u */
    public abstract int mo16439u();

    /* renamed from: a */
    static C4481bv m18998a(byte[] bArr, int i, int i2, boolean z) {
        C4483bx bxVar = new C4483bx(bArr, i, i2, false);
        try {
            bxVar.mo16419d(i2);
            return bxVar;
        } catch (C4526db e) {
            throw new IllegalArgumentException(e);
        }
    }

    private C4481bv() {
        this.f14712b = 100;
        this.f14714d = Integer.MAX_VALUE;
        this.f14715e = false;
    }

    /* renamed from: c */
    public final int mo16418c(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("Recursion limit cannot be negative: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int i2 = this.f14712b;
        this.f14712b = i;
        return i2;
    }
}

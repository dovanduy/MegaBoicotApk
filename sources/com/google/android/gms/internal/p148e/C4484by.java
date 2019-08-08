package com.google.android.gms.internal.p148e;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.e.by */
final class C4484by implements C4570es {

    /* renamed from: a */
    private final C4481bv f14724a;

    /* renamed from: b */
    private int f14725b;

    /* renamed from: c */
    private int f14726c;

    /* renamed from: d */
    private int f14727d = 0;

    /* renamed from: a */
    public static C4484by m19060a(C4481bv bvVar) {
        if (bvVar.f14713c != null) {
            return bvVar.f14713c;
        }
        return new C4484by(bvVar);
    }

    private C4484by(C4481bv bvVar) {
        this.f14724a = (C4481bv) C4520cw.m19448a(bvVar, "input");
        this.f14724a.f14713c = this;
    }

    /* renamed from: a */
    public final int mo16440a() throws IOException {
        if (this.f14727d != 0) {
            this.f14725b = this.f14727d;
            this.f14727d = 0;
        } else {
            this.f14725b = this.f14724a.mo16412a();
        }
        if (this.f14725b == 0 || this.f14725b == this.f14726c) {
            return Integer.MAX_VALUE;
        }
        return this.f14725b >>> 3;
    }

    /* renamed from: b */
    public final int mo16445b() {
        return this.f14725b;
    }

    /* renamed from: c */
    public final boolean mo16450c() throws IOException {
        if (this.f14724a.mo16438t() || this.f14725b == this.f14726c) {
            return false;
        }
        return this.f14724a.mo16416b(this.f14725b);
    }

    /* renamed from: a */
    private final void m19062a(int i) throws IOException {
        if ((this.f14725b & 7) != i) {
            throw C4526db.m19462e();
        }
    }

    /* renamed from: d */
    public final double mo16451d() throws IOException {
        m19062a(1);
        return this.f14724a.mo16415b();
    }

    /* renamed from: e */
    public final float mo16453e() throws IOException {
        m19062a(5);
        return this.f14724a.mo16417c();
    }

    /* renamed from: f */
    public final long mo16455f() throws IOException {
        m19062a(0);
        return this.f14724a.mo16420d();
    }

    /* renamed from: g */
    public final long mo16457g() throws IOException {
        m19062a(0);
        return this.f14724a.mo16421e();
    }

    /* renamed from: h */
    public final int mo16459h() throws IOException {
        m19062a(0);
        return this.f14724a.mo16423f();
    }

    /* renamed from: i */
    public final long mo16461i() throws IOException {
        m19062a(1);
        return this.f14724a.mo16425g();
    }

    /* renamed from: j */
    public final int mo16463j() throws IOException {
        m19062a(5);
        return this.f14724a.mo16426h();
    }

    /* renamed from: k */
    public final boolean mo16466k() throws IOException {
        m19062a(0);
        return this.f14724a.mo16427i();
    }

    /* renamed from: l */
    public final String mo16467l() throws IOException {
        m19062a(2);
        return this.f14724a.mo16428j();
    }

    /* renamed from: m */
    public final String mo16469m() throws IOException {
        m19062a(2);
        return this.f14724a.mo16429k();
    }

    /* renamed from: a */
    public final <T> T mo16441a(C4571et<T> etVar, C4499ch chVar) throws IOException {
        m19062a(2);
        return m19065c(etVar, chVar);
    }

    /* renamed from: b */
    public final <T> T mo16446b(C4571et<T> etVar, C4499ch chVar) throws IOException {
        m19062a(3);
        return m19067d(etVar, chVar);
    }

    /* renamed from: c */
    private final <T> T m19065c(C4571et<T> etVar, C4499ch chVar) throws IOException {
        int m = this.f14724a.mo16431m();
        if (this.f14724a.f14711a >= this.f14724a.f14712b) {
            throw C4526db.m19463f();
        }
        int d = this.f14724a.mo16419d(m);
        T a = etVar.mo16685a();
        this.f14724a.f14711a++;
        etVar.mo16686a(a, this, chVar);
        etVar.mo16691c(a);
        this.f14724a.mo16414a(0);
        this.f14724a.f14711a--;
        this.f14724a.mo16422e(d);
        return a;
    }

    /* renamed from: d */
    private final <T> T m19067d(C4571et<T> etVar, C4499ch chVar) throws IOException {
        int i = this.f14726c;
        this.f14726c = ((this.f14725b >>> 3) << 3) | 4;
        try {
            T a = etVar.mo16685a();
            etVar.mo16686a(a, this, chVar);
            etVar.mo16691c(a);
            if (this.f14725b == this.f14726c) {
                return a;
            }
            throw C4526db.m19464g();
        } finally {
            this.f14726c = i;
        }
    }

    /* renamed from: n */
    public final C4469bj mo16471n() throws IOException {
        m19062a(2);
        return this.f14724a.mo16430l();
    }

    /* renamed from: o */
    public final int mo16473o() throws IOException {
        m19062a(0);
        return this.f14724a.mo16431m();
    }

    /* renamed from: p */
    public final int mo16475p() throws IOException {
        m19062a(0);
        return this.f14724a.mo16432n();
    }

    /* renamed from: q */
    public final int mo16477q() throws IOException {
        m19062a(5);
        return this.f14724a.mo16433o();
    }

    /* renamed from: r */
    public final long mo16479r() throws IOException {
        m19062a(1);
        return this.f14724a.mo16434p();
    }

    /* renamed from: s */
    public final int mo16480s() throws IOException {
        m19062a(0);
        return this.f14724a.mo16435q();
    }

    /* renamed from: t */
    public final long mo16481t() throws IOException {
        m19062a(0);
        return this.f14724a.mo16436r();
    }

    /* renamed from: a */
    public final void mo16442a(List<Double> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4495cd) {
            C4495cd cdVar = (C4495cd) list;
            switch (this.f14725b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f14724a.mo16431m();
                    m19064b(m);
                    int u = this.f14724a.mo16439u() + m;
                    do {
                        cdVar.mo16561a(this.f14724a.mo16415b());
                    } while (this.f14724a.mo16439u() < u);
                    return;
                default:
                    throw C4526db.m19462e();
            }
            do {
                cdVar.mo16561a(this.f14724a.mo16415b());
                if (!this.f14724a.mo16438t()) {
                    a2 = this.f14724a.mo16412a();
                } else {
                    return;
                }
            } while (a2 == this.f14725b);
            this.f14727d = a2;
            return;
        }
        switch (this.f14725b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f14724a.mo16431m();
                m19064b(m2);
                int u2 = this.f14724a.mo16439u() + m2;
                do {
                    list.add(Double.valueOf(this.f14724a.mo16415b()));
                } while (this.f14724a.mo16439u() < u2);
                return;
            default:
                throw C4526db.m19462e();
        }
        do {
            list.add(Double.valueOf(this.f14724a.mo16415b()));
            if (!this.f14724a.mo16438t()) {
                a = this.f14724a.mo16412a();
            } else {
                return;
            }
        } while (a == this.f14725b);
        this.f14727d = a;
    }

    /* renamed from: b */
    public final void mo16447b(List<Float> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4510cr) {
            C4510cr crVar = (C4510cr) list;
            int i = this.f14725b & 7;
            if (i == 2) {
                int m = this.f14724a.mo16431m();
                m19066c(m);
                int u = this.f14724a.mo16439u() + m;
                do {
                    crVar.mo16599a(this.f14724a.mo16417c());
                } while (this.f14724a.mo16439u() < u);
            } else if (i != 5) {
                throw C4526db.m19462e();
            } else {
                do {
                    crVar.mo16599a(this.f14724a.mo16417c());
                    if (!this.f14724a.mo16438t()) {
                        a2 = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14725b);
                this.f14727d = a2;
            }
        } else {
            int i2 = this.f14725b & 7;
            if (i2 == 2) {
                int m2 = this.f14724a.mo16431m();
                m19066c(m2);
                int u2 = this.f14724a.mo16439u() + m2;
                do {
                    list.add(Float.valueOf(this.f14724a.mo16417c()));
                } while (this.f14724a.mo16439u() < u2);
            } else if (i2 != 5) {
                throw C4526db.m19462e();
            } else {
                do {
                    list.add(Float.valueOf(this.f14724a.mo16417c()));
                    if (!this.f14724a.mo16438t()) {
                        a = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a == this.f14725b);
                this.f14727d = a;
            }
        }
    }

    /* renamed from: c */
    public final void mo16449c(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4541dq) {
            C4541dq dqVar = (C4541dq) list;
            int i = this.f14725b & 7;
            if (i == 0) {
                do {
                    dqVar.mo16656a(this.f14724a.mo16420d());
                    if (!this.f14724a.mo16438t()) {
                        a2 = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14725b);
                this.f14727d = a2;
            } else if (i != 2) {
                throw C4526db.m19462e();
            } else {
                int u = this.f14724a.mo16439u() + this.f14724a.mo16431m();
                do {
                    dqVar.mo16656a(this.f14724a.mo16420d());
                } while (this.f14724a.mo16439u() < u);
                m19068d(u);
            }
        } else {
            int i2 = this.f14725b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f14724a.mo16420d()));
                    if (!this.f14724a.mo16438t()) {
                        a = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a == this.f14725b);
                this.f14727d = a;
            } else if (i2 != 2) {
                throw C4526db.m19462e();
            } else {
                int u2 = this.f14724a.mo16439u() + this.f14724a.mo16431m();
                do {
                    list.add(Long.valueOf(this.f14724a.mo16420d()));
                } while (this.f14724a.mo16439u() < u2);
                m19068d(u2);
            }
        }
    }

    /* renamed from: d */
    public final void mo16452d(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4541dq) {
            C4541dq dqVar = (C4541dq) list;
            int i = this.f14725b & 7;
            if (i == 0) {
                do {
                    dqVar.mo16656a(this.f14724a.mo16421e());
                    if (!this.f14724a.mo16438t()) {
                        a2 = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14725b);
                this.f14727d = a2;
            } else if (i != 2) {
                throw C4526db.m19462e();
            } else {
                int u = this.f14724a.mo16439u() + this.f14724a.mo16431m();
                do {
                    dqVar.mo16656a(this.f14724a.mo16421e());
                } while (this.f14724a.mo16439u() < u);
                m19068d(u);
            }
        } else {
            int i2 = this.f14725b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f14724a.mo16421e()));
                    if (!this.f14724a.mo16438t()) {
                        a = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a == this.f14725b);
                this.f14727d = a;
            } else if (i2 != 2) {
                throw C4526db.m19462e();
            } else {
                int u2 = this.f14724a.mo16439u() + this.f14724a.mo16431m();
                do {
                    list.add(Long.valueOf(this.f14724a.mo16421e()));
                } while (this.f14724a.mo16439u() < u2);
                m19068d(u2);
            }
        }
    }

    /* renamed from: e */
    public final void mo16454e(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4519cv) {
            C4519cv cvVar = (C4519cv) list;
            int i = this.f14725b & 7;
            if (i == 0) {
                do {
                    cvVar.mo16625c(this.f14724a.mo16423f());
                    if (!this.f14724a.mo16438t()) {
                        a2 = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14725b);
                this.f14727d = a2;
            } else if (i != 2) {
                throw C4526db.m19462e();
            } else {
                int u = this.f14724a.mo16439u() + this.f14724a.mo16431m();
                do {
                    cvVar.mo16625c(this.f14724a.mo16423f());
                } while (this.f14724a.mo16439u() < u);
                m19068d(u);
            }
        } else {
            int i2 = this.f14725b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f14724a.mo16423f()));
                    if (!this.f14724a.mo16438t()) {
                        a = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a == this.f14725b);
                this.f14727d = a;
            } else if (i2 != 2) {
                throw C4526db.m19462e();
            } else {
                int u2 = this.f14724a.mo16439u() + this.f14724a.mo16431m();
                do {
                    list.add(Integer.valueOf(this.f14724a.mo16423f()));
                } while (this.f14724a.mo16439u() < u2);
                m19068d(u2);
            }
        }
    }

    /* renamed from: f */
    public final void mo16456f(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4541dq) {
            C4541dq dqVar = (C4541dq) list;
            switch (this.f14725b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f14724a.mo16431m();
                    m19064b(m);
                    int u = this.f14724a.mo16439u() + m;
                    do {
                        dqVar.mo16656a(this.f14724a.mo16425g());
                    } while (this.f14724a.mo16439u() < u);
                    return;
                default:
                    throw C4526db.m19462e();
            }
            do {
                dqVar.mo16656a(this.f14724a.mo16425g());
                if (!this.f14724a.mo16438t()) {
                    a2 = this.f14724a.mo16412a();
                } else {
                    return;
                }
            } while (a2 == this.f14725b);
            this.f14727d = a2;
            return;
        }
        switch (this.f14725b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f14724a.mo16431m();
                m19064b(m2);
                int u2 = this.f14724a.mo16439u() + m2;
                do {
                    list.add(Long.valueOf(this.f14724a.mo16425g()));
                } while (this.f14724a.mo16439u() < u2);
                return;
            default:
                throw C4526db.m19462e();
        }
        do {
            list.add(Long.valueOf(this.f14724a.mo16425g()));
            if (!this.f14724a.mo16438t()) {
                a = this.f14724a.mo16412a();
            } else {
                return;
            }
        } while (a == this.f14725b);
        this.f14727d = a;
    }

    /* renamed from: g */
    public final void mo16458g(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4519cv) {
            C4519cv cvVar = (C4519cv) list;
            int i = this.f14725b & 7;
            if (i == 2) {
                int m = this.f14724a.mo16431m();
                m19066c(m);
                int u = this.f14724a.mo16439u() + m;
                do {
                    cvVar.mo16625c(this.f14724a.mo16426h());
                } while (this.f14724a.mo16439u() < u);
            } else if (i != 5) {
                throw C4526db.m19462e();
            } else {
                do {
                    cvVar.mo16625c(this.f14724a.mo16426h());
                    if (!this.f14724a.mo16438t()) {
                        a2 = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14725b);
                this.f14727d = a2;
            }
        } else {
            int i2 = this.f14725b & 7;
            if (i2 == 2) {
                int m2 = this.f14724a.mo16431m();
                m19066c(m2);
                int u2 = this.f14724a.mo16439u() + m2;
                do {
                    list.add(Integer.valueOf(this.f14724a.mo16426h()));
                } while (this.f14724a.mo16439u() < u2);
            } else if (i2 != 5) {
                throw C4526db.m19462e();
            } else {
                do {
                    list.add(Integer.valueOf(this.f14724a.mo16426h()));
                    if (!this.f14724a.mo16438t()) {
                        a = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a == this.f14725b);
                this.f14727d = a;
            }
        }
    }

    /* renamed from: h */
    public final void mo16460h(List<Boolean> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4467bh) {
            C4467bh bhVar = (C4467bh) list;
            int i = this.f14725b & 7;
            if (i == 0) {
                do {
                    bhVar.mo16383a(this.f14724a.mo16427i());
                    if (!this.f14724a.mo16438t()) {
                        a2 = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14725b);
                this.f14727d = a2;
            } else if (i != 2) {
                throw C4526db.m19462e();
            } else {
                int u = this.f14724a.mo16439u() + this.f14724a.mo16431m();
                do {
                    bhVar.mo16383a(this.f14724a.mo16427i());
                } while (this.f14724a.mo16439u() < u);
                m19068d(u);
            }
        } else {
            int i2 = this.f14725b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f14724a.mo16427i()));
                    if (!this.f14724a.mo16438t()) {
                        a = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a == this.f14725b);
                this.f14727d = a;
            } else if (i2 != 2) {
                throw C4526db.m19462e();
            } else {
                int u2 = this.f14724a.mo16439u() + this.f14724a.mo16431m();
                do {
                    list.add(Boolean.valueOf(this.f14724a.mo16427i()));
                } while (this.f14724a.mo16439u() < u2);
                m19068d(u2);
            }
        }
    }

    /* renamed from: i */
    public final void mo16462i(List<String> list) throws IOException {
        m19063a(list, false);
    }

    /* renamed from: j */
    public final void mo16464j(List<String> list) throws IOException {
        m19063a(list, true);
    }

    /* renamed from: a */
    private final void m19063a(List<String> list, boolean z) throws IOException {
        int a;
        int a2;
        if ((this.f14725b & 7) != 2) {
            throw C4526db.m19462e();
        } else if (!(list instanceof C4536dl) || z) {
            do {
                list.add(z ? mo16469m() : mo16467l());
                if (!this.f14724a.mo16438t()) {
                    a = this.f14724a.mo16412a();
                } else {
                    return;
                }
            } while (a == this.f14725b);
            this.f14727d = a;
        } else {
            C4536dl dlVar = (C4536dl) list;
            do {
                dlVar.mo16647a(mo16471n());
                if (!this.f14724a.mo16438t()) {
                    a2 = this.f14724a.mo16412a();
                } else {
                    return;
                }
            } while (a2 == this.f14725b);
            this.f14727d = a2;
        }
    }

    /* renamed from: a */
    public final <T> void mo16443a(List<T> list, C4571et<T> etVar, C4499ch chVar) throws IOException {
        int a;
        if ((this.f14725b & 7) != 2) {
            throw C4526db.m19462e();
        }
        int i = this.f14725b;
        do {
            list.add(m19065c(etVar, chVar));
            if (!this.f14724a.mo16438t() && this.f14727d == 0) {
                a = this.f14724a.mo16412a();
            } else {
                return;
            }
        } while (a == i);
        this.f14727d = a;
    }

    /* renamed from: b */
    public final <T> void mo16448b(List<T> list, C4571et<T> etVar, C4499ch chVar) throws IOException {
        int a;
        if ((this.f14725b & 7) != 3) {
            throw C4526db.m19462e();
        }
        int i = this.f14725b;
        do {
            list.add(m19067d(etVar, chVar));
            if (!this.f14724a.mo16438t() && this.f14727d == 0) {
                a = this.f14724a.mo16412a();
            } else {
                return;
            }
        } while (a == i);
        this.f14727d = a;
    }

    /* renamed from: k */
    public final void mo16465k(List<C4469bj> list) throws IOException {
        int a;
        if ((this.f14725b & 7) != 2) {
            throw C4526db.m19462e();
        }
        do {
            list.add(mo16471n());
            if (!this.f14724a.mo16438t()) {
                a = this.f14724a.mo16412a();
            } else {
                return;
            }
        } while (a == this.f14725b);
        this.f14727d = a;
    }

    /* renamed from: l */
    public final void mo16468l(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4519cv) {
            C4519cv cvVar = (C4519cv) list;
            int i = this.f14725b & 7;
            if (i == 0) {
                do {
                    cvVar.mo16625c(this.f14724a.mo16431m());
                    if (!this.f14724a.mo16438t()) {
                        a2 = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14725b);
                this.f14727d = a2;
            } else if (i != 2) {
                throw C4526db.m19462e();
            } else {
                int u = this.f14724a.mo16439u() + this.f14724a.mo16431m();
                do {
                    cvVar.mo16625c(this.f14724a.mo16431m());
                } while (this.f14724a.mo16439u() < u);
                m19068d(u);
            }
        } else {
            int i2 = this.f14725b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f14724a.mo16431m()));
                    if (!this.f14724a.mo16438t()) {
                        a = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a == this.f14725b);
                this.f14727d = a;
            } else if (i2 != 2) {
                throw C4526db.m19462e();
            } else {
                int u2 = this.f14724a.mo16439u() + this.f14724a.mo16431m();
                do {
                    list.add(Integer.valueOf(this.f14724a.mo16431m()));
                } while (this.f14724a.mo16439u() < u2);
                m19068d(u2);
            }
        }
    }

    /* renamed from: m */
    public final void mo16470m(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4519cv) {
            C4519cv cvVar = (C4519cv) list;
            int i = this.f14725b & 7;
            if (i == 0) {
                do {
                    cvVar.mo16625c(this.f14724a.mo16432n());
                    if (!this.f14724a.mo16438t()) {
                        a2 = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14725b);
                this.f14727d = a2;
            } else if (i != 2) {
                throw C4526db.m19462e();
            } else {
                int u = this.f14724a.mo16439u() + this.f14724a.mo16431m();
                do {
                    cvVar.mo16625c(this.f14724a.mo16432n());
                } while (this.f14724a.mo16439u() < u);
                m19068d(u);
            }
        } else {
            int i2 = this.f14725b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f14724a.mo16432n()));
                    if (!this.f14724a.mo16438t()) {
                        a = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a == this.f14725b);
                this.f14727d = a;
            } else if (i2 != 2) {
                throw C4526db.m19462e();
            } else {
                int u2 = this.f14724a.mo16439u() + this.f14724a.mo16431m();
                do {
                    list.add(Integer.valueOf(this.f14724a.mo16432n()));
                } while (this.f14724a.mo16439u() < u2);
                m19068d(u2);
            }
        }
    }

    /* renamed from: n */
    public final void mo16472n(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4519cv) {
            C4519cv cvVar = (C4519cv) list;
            int i = this.f14725b & 7;
            if (i == 2) {
                int m = this.f14724a.mo16431m();
                m19066c(m);
                int u = this.f14724a.mo16439u() + m;
                do {
                    cvVar.mo16625c(this.f14724a.mo16433o());
                } while (this.f14724a.mo16439u() < u);
            } else if (i != 5) {
                throw C4526db.m19462e();
            } else {
                do {
                    cvVar.mo16625c(this.f14724a.mo16433o());
                    if (!this.f14724a.mo16438t()) {
                        a2 = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14725b);
                this.f14727d = a2;
            }
        } else {
            int i2 = this.f14725b & 7;
            if (i2 == 2) {
                int m2 = this.f14724a.mo16431m();
                m19066c(m2);
                int u2 = this.f14724a.mo16439u() + m2;
                do {
                    list.add(Integer.valueOf(this.f14724a.mo16433o()));
                } while (this.f14724a.mo16439u() < u2);
            } else if (i2 != 5) {
                throw C4526db.m19462e();
            } else {
                do {
                    list.add(Integer.valueOf(this.f14724a.mo16433o()));
                    if (!this.f14724a.mo16438t()) {
                        a = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a == this.f14725b);
                this.f14727d = a;
            }
        }
    }

    /* renamed from: o */
    public final void mo16474o(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4541dq) {
            C4541dq dqVar = (C4541dq) list;
            switch (this.f14725b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f14724a.mo16431m();
                    m19064b(m);
                    int u = this.f14724a.mo16439u() + m;
                    do {
                        dqVar.mo16656a(this.f14724a.mo16434p());
                    } while (this.f14724a.mo16439u() < u);
                    return;
                default:
                    throw C4526db.m19462e();
            }
            do {
                dqVar.mo16656a(this.f14724a.mo16434p());
                if (!this.f14724a.mo16438t()) {
                    a2 = this.f14724a.mo16412a();
                } else {
                    return;
                }
            } while (a2 == this.f14725b);
            this.f14727d = a2;
            return;
        }
        switch (this.f14725b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f14724a.mo16431m();
                m19064b(m2);
                int u2 = this.f14724a.mo16439u() + m2;
                do {
                    list.add(Long.valueOf(this.f14724a.mo16434p()));
                } while (this.f14724a.mo16439u() < u2);
                return;
            default:
                throw C4526db.m19462e();
        }
        do {
            list.add(Long.valueOf(this.f14724a.mo16434p()));
            if (!this.f14724a.mo16438t()) {
                a = this.f14724a.mo16412a();
            } else {
                return;
            }
        } while (a == this.f14725b);
        this.f14727d = a;
    }

    /* renamed from: p */
    public final void mo16476p(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4519cv) {
            C4519cv cvVar = (C4519cv) list;
            int i = this.f14725b & 7;
            if (i == 0) {
                do {
                    cvVar.mo16625c(this.f14724a.mo16435q());
                    if (!this.f14724a.mo16438t()) {
                        a2 = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14725b);
                this.f14727d = a2;
            } else if (i != 2) {
                throw C4526db.m19462e();
            } else {
                int u = this.f14724a.mo16439u() + this.f14724a.mo16431m();
                do {
                    cvVar.mo16625c(this.f14724a.mo16435q());
                } while (this.f14724a.mo16439u() < u);
                m19068d(u);
            }
        } else {
            int i2 = this.f14725b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f14724a.mo16435q()));
                    if (!this.f14724a.mo16438t()) {
                        a = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a == this.f14725b);
                this.f14727d = a;
            } else if (i2 != 2) {
                throw C4526db.m19462e();
            } else {
                int u2 = this.f14724a.mo16439u() + this.f14724a.mo16431m();
                do {
                    list.add(Integer.valueOf(this.f14724a.mo16435q()));
                } while (this.f14724a.mo16439u() < u2);
                m19068d(u2);
            }
        }
    }

    /* renamed from: q */
    public final void mo16478q(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4541dq) {
            C4541dq dqVar = (C4541dq) list;
            int i = this.f14725b & 7;
            if (i == 0) {
                do {
                    dqVar.mo16656a(this.f14724a.mo16436r());
                    if (!this.f14724a.mo16438t()) {
                        a2 = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a2 == this.f14725b);
                this.f14727d = a2;
            } else if (i != 2) {
                throw C4526db.m19462e();
            } else {
                int u = this.f14724a.mo16439u() + this.f14724a.mo16431m();
                do {
                    dqVar.mo16656a(this.f14724a.mo16436r());
                } while (this.f14724a.mo16439u() < u);
                m19068d(u);
            }
        } else {
            int i2 = this.f14725b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f14724a.mo16436r()));
                    if (!this.f14724a.mo16438t()) {
                        a = this.f14724a.mo16412a();
                    } else {
                        return;
                    }
                } while (a == this.f14725b);
                this.f14727d = a;
            } else if (i2 != 2) {
                throw C4526db.m19462e();
            } else {
                int u2 = this.f14724a.mo16439u() + this.f14724a.mo16431m();
                do {
                    list.add(Long.valueOf(this.f14724a.mo16436r()));
                } while (this.f14724a.mo16439u() < u2);
                m19068d(u2);
            }
        }
    }

    /* renamed from: b */
    private static void m19064b(int i) throws IOException {
        if ((i & 7) != 0) {
            throw C4526db.m19464g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (mo16450c() == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        throw new com.google.android.gms.internal.p148e.C4526db("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x004e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void mo16444a(java.util.Map<K, V> r6, com.google.android.gms.internal.p148e.C4546dv<K, V> r7, com.google.android.gms.internal.p148e.C4499ch r8) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 2
            r5.m19062a(r0)
            com.google.android.gms.internal.e.bv r0 = r5.f14724a
            int r0 = r0.mo16431m()
            com.google.android.gms.internal.e.bv r1 = r5.f14724a
            int r0 = r1.mo16419d(r0)
            K r1 = r7.f14902b
            V r2 = r7.f14904d
        L_0x0014:
            int r3 = r5.mo16440a()     // Catch:{ all -> 0x0065 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L_0x005c
            com.google.android.gms.internal.e.bv r4 = r5.f14724a     // Catch:{ all -> 0x0065 }
            boolean r4 = r4.mo16438t()     // Catch:{ all -> 0x0065 }
            if (r4 != 0) goto L_0x005c
            switch(r3) {
                case 1: goto L_0x003b;
                case 2: goto L_0x002d;
                default: goto L_0x0028;
            }
        L_0x0028:
            boolean r3 = r5.mo16450c()     // Catch:{ dc -> 0x004e }
            goto L_0x0044
        L_0x002d:
            com.google.android.gms.internal.e.ga r3 = r7.f14903c     // Catch:{ dc -> 0x004e }
            V r4 = r7.f14904d     // Catch:{ dc -> 0x004e }
            java.lang.Class r4 = r4.getClass()     // Catch:{ dc -> 0x004e }
            java.lang.Object r3 = r5.m19061a(r3, r4, r8)     // Catch:{ dc -> 0x004e }
            r2 = r3
            goto L_0x0014
        L_0x003b:
            com.google.android.gms.internal.e.ga r3 = r7.f14901a     // Catch:{ dc -> 0x004e }
            r4 = 0
            java.lang.Object r3 = r5.m19061a(r3, r4, r4)     // Catch:{ dc -> 0x004e }
            r1 = r3
            goto L_0x0014
        L_0x0044:
            if (r3 != 0) goto L_0x0014
            com.google.android.gms.internal.e.db r3 = new com.google.android.gms.internal.e.db     // Catch:{ dc -> 0x004e }
            java.lang.String r4 = "Unable to parse map entry."
            r3.<init>(r4)     // Catch:{ dc -> 0x004e }
            throw r3     // Catch:{ dc -> 0x004e }
        L_0x004e:
            boolean r3 = r5.mo16450c()     // Catch:{ all -> 0x0065 }
            if (r3 != 0) goto L_0x0014
            com.google.android.gms.internal.e.db r6 = new com.google.android.gms.internal.e.db     // Catch:{ all -> 0x0065 }
            java.lang.String r7 = "Unable to parse map entry."
            r6.<init>(r7)     // Catch:{ all -> 0x0065 }
            throw r6     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r6.put(r1, r2)     // Catch:{ all -> 0x0065 }
            com.google.android.gms.internal.e.bv r6 = r5.f14724a
            r6.mo16422e(r0)
            return
        L_0x0065:
            r6 = move-exception
            com.google.android.gms.internal.e.bv r7 = r5.f14724a
            r7.mo16422e(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4484by.mo16444a(java.util.Map, com.google.android.gms.internal.e.dv, com.google.android.gms.internal.e.ch):void");
    }

    /* renamed from: a */
    private final Object m19061a(C4615ga gaVar, Class<?> cls, C4499ch chVar) throws IOException {
        switch (C4485bz.f14728a[gaVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo16466k());
            case 2:
                return mo16471n();
            case 3:
                return Double.valueOf(mo16451d());
            case 4:
                return Integer.valueOf(mo16475p());
            case 5:
                return Integer.valueOf(mo16463j());
            case 6:
                return Long.valueOf(mo16461i());
            case 7:
                return Float.valueOf(mo16453e());
            case 8:
                return Integer.valueOf(mo16459h());
            case 9:
                return Long.valueOf(mo16457g());
            case 10:
                m19062a(2);
                return m19065c(C4567ep.m19618a().mo16695a(cls), chVar);
            case 11:
                return Integer.valueOf(mo16477q());
            case 12:
                return Long.valueOf(mo16479r());
            case 13:
                return Integer.valueOf(mo16480s());
            case 14:
                return Long.valueOf(mo16481t());
            case 15:
                return mo16469m();
            case 16:
                return Integer.valueOf(mo16473o());
            case 17:
                return Long.valueOf(mo16455f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: c */
    private static void m19066c(int i) throws IOException {
        if ((i & 3) != 0) {
            throw C4526db.m19464g();
        }
    }

    /* renamed from: d */
    private final void m19068d(int i) throws IOException {
        if (this.f14724a.mo16439u() != i) {
            throw C4526db.m19458a();
        }
    }
}

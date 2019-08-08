package com.facebook.ads.internal.p077d;

import java.io.Serializable;

/* renamed from: com.facebook.ads.internal.d.c */
public class C1705c implements Serializable {

    /* renamed from: a */
    private C1706a f5332a;

    /* renamed from: b */
    private C1706a f5333b;

    /* renamed from: com.facebook.ads.internal.d.c$a */
    public static class C1706a implements Serializable {

        /* renamed from: a */
        private double f5334a;

        /* renamed from: b */
        private double f5335b;

        /* renamed from: c */
        private double f5336c;

        /* renamed from: d */
        private double f5337d;

        /* renamed from: e */
        private double f5338e;

        /* renamed from: f */
        private double f5339f;

        /* renamed from: g */
        private double f5340g;

        /* renamed from: h */
        private int f5341h;

        /* renamed from: i */
        private double f5342i;

        /* renamed from: j */
        private double f5343j;

        /* renamed from: k */
        private double f5344k;

        public C1706a(double d) {
            this.f5338e = d;
        }

        /* renamed from: a */
        public void mo7448a() {
            this.f5334a = 0.0d;
            this.f5336c = 0.0d;
            this.f5337d = 0.0d;
            this.f5339f = 0.0d;
            this.f5341h = 0;
            this.f5342i = 0.0d;
            this.f5343j = 1.0d;
            this.f5344k = 0.0d;
        }

        /* renamed from: a */
        public void mo7449a(double d, double d2) {
            this.f5341h++;
            this.f5342i += d;
            this.f5336c = d2;
            this.f5344k += d2 * d;
            this.f5334a = this.f5344k / this.f5342i;
            this.f5343j = Math.min(this.f5343j, d2);
            this.f5339f = Math.max(this.f5339f, d2);
            if (d2 >= this.f5338e) {
                this.f5337d += d;
                this.f5335b += d;
                this.f5340g = Math.max(this.f5340g, this.f5335b);
                return;
            }
            this.f5335b = 0.0d;
        }

        /* renamed from: b */
        public void mo7450b() {
            this.f5335b = 0.0d;
        }

        /* renamed from: c */
        public double mo7451c() {
            if (this.f5341h == 0) {
                return 0.0d;
            }
            return this.f5343j;
        }

        /* renamed from: d */
        public double mo7452d() {
            return this.f5334a;
        }

        /* renamed from: e */
        public double mo7453e() {
            return this.f5339f;
        }

        /* renamed from: f */
        public double mo7454f() {
            return this.f5342i;
        }

        /* renamed from: g */
        public double mo7455g() {
            return this.f5337d;
        }

        /* renamed from: h */
        public double mo7456h() {
            return this.f5340g;
        }
    }

    public C1705c() {
        this(0.5d, 0.5d);
    }

    public C1705c(double d) {
        this(d, 0.5d);
    }

    public C1705c(double d, double d2) {
        this.f5332a = new C1706a(d);
        this.f5333b = new C1706a(d2);
        mo7442a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7442a() {
        this.f5332a.mo7448a();
        this.f5333b.mo7448a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7443a(double d, double d2) {
        this.f5332a.mo7449a(d, d2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7444b() {
        this.f5332a.mo7450b();
        this.f5333b.mo7450b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7445b(double d, double d2) {
        this.f5333b.mo7449a(d, d2);
    }

    /* renamed from: c */
    public C1706a mo7446c() {
        return this.f5332a;
    }

    /* renamed from: d */
    public C1706a mo7447d() {
        return this.f5333b;
    }
}

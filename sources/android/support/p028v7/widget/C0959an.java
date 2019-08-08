package android.support.p028v7.widget;

/* renamed from: android.support.v7.widget.an */
/* compiled from: RtlSpacingHelper */
class C0959an {

    /* renamed from: a */
    private int f3152a = 0;

    /* renamed from: b */
    private int f3153b = 0;

    /* renamed from: c */
    private int f3154c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f3155d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f3156e = 0;

    /* renamed from: f */
    private int f3157f = 0;

    /* renamed from: g */
    private boolean f3158g = false;

    /* renamed from: h */
    private boolean f3159h = false;

    C0959an() {
    }

    /* renamed from: a */
    public int mo5016a() {
        return this.f3152a;
    }

    /* renamed from: b */
    public int mo5019b() {
        return this.f3153b;
    }

    /* renamed from: c */
    public int mo5021c() {
        return this.f3158g ? this.f3153b : this.f3152a;
    }

    /* renamed from: d */
    public int mo5022d() {
        return this.f3158g ? this.f3152a : this.f3153b;
    }

    /* renamed from: a */
    public void mo5017a(int i, int i2) {
        this.f3154c = i;
        this.f3155d = i2;
        this.f3159h = true;
        if (this.f3158g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f3152a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f3153b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f3152a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3153b = i2;
        }
    }

    /* renamed from: b */
    public void mo5020b(int i, int i2) {
        this.f3159h = false;
        if (i != Integer.MIN_VALUE) {
            this.f3156e = i;
            this.f3152a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3157f = i2;
            this.f3153b = i2;
        }
    }

    /* renamed from: a */
    public void mo5018a(boolean z) {
        if (z != this.f3158g) {
            this.f3158g = z;
            if (!this.f3159h) {
                this.f3152a = this.f3156e;
                this.f3153b = this.f3157f;
            } else if (z) {
                this.f3152a = this.f3155d != Integer.MIN_VALUE ? this.f3155d : this.f3156e;
                this.f3153b = this.f3154c != Integer.MIN_VALUE ? this.f3154c : this.f3157f;
            } else {
                this.f3152a = this.f3154c != Integer.MIN_VALUE ? this.f3154c : this.f3156e;
                this.f3153b = this.f3155d != Integer.MIN_VALUE ? this.f3155d : this.f3157f;
            }
        }
    }
}

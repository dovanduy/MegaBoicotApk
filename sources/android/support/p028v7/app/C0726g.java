package android.support.p028v7.app;

/* renamed from: android.support.v7.app.g */
/* compiled from: TwilightCalculator */
class C0726g {

    /* renamed from: d */
    private static C0726g f2019d;

    /* renamed from: a */
    public long f2020a;

    /* renamed from: b */
    public long f2021b;

    /* renamed from: c */
    public int f2022c;

    C0726g() {
    }

    /* renamed from: a */
    static C0726g m2943a() {
        if (f2019d == null) {
            f2019d = new C0726g();
        }
        return f2019d;
    }

    /* renamed from: a */
    public void mo2785a(long j, double d, double d2) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        float f2 = 6.24006f + (0.01720197f * f);
        double d3 = (double) f2;
        double sin = (0.03341960161924362d * Math.sin(d3)) + d3 + (3.4906598739326E-4d * Math.sin((double) (2.0f * f2))) + (5.236000106378924E-6d * Math.sin((double) (3.0f * f2))) + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double round = ((double) (((float) Math.round(((double) (f - 9.0E-4f)) - d4)) + 9.0E-4f)) + d4 + (0.0053d * Math.sin(d3)) + (-0.0069d * Math.sin(2.0d * sin));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d5 = 0.01745329238474369d * d;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d5) * Math.sin(asin))) / (Math.cos(d5) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f2022c = 1;
            this.f2020a = -1;
            this.f2021b = -1;
        } else if (sin2 <= -1.0d) {
            this.f2022c = 0;
            this.f2020a = -1;
            this.f2021b = -1;
        } else {
            double acos = (double) ((float) (Math.acos(sin2) / 6.283185307179586d));
            this.f2020a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            this.f2021b = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            if (this.f2021b >= j || this.f2020a <= j) {
                this.f2022c = 1;
            } else {
                this.f2022c = 0;
            }
        }
    }
}

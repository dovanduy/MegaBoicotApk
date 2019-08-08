package com.google.android.gms.internal.ads;

@C3718cm
final class ayn {

    /* renamed from: a */
    private static final ayk f12416a = ayk.m15729a();

    /* renamed from: b */
    private static final float f12417b = ((Float) aoq.m14620f().mo14695a(aru.f11860bf)).floatValue();

    /* renamed from: c */
    private static final long f12418c = ((Long) aoq.m14620f().mo14695a(aru.f11858bd)).longValue();

    /* renamed from: d */
    private static final float f12419d = ((Float) aoq.m14620f().mo14695a(aru.f11861bg)).floatValue();

    /* renamed from: e */
    private static final long f12420e = ((Long) aoq.m14620f().mo14695a(aru.f11859be)).longValue();

    /* renamed from: a */
    private static int m15776a(long j, int i) {
        return (int) ((j >>> (4 * (i % 16))) & 15);
    }

    /* renamed from: a */
    static boolean m15777a() {
        int h = f12416a.mo14982h();
        int i = f12416a.mo14983i();
        int g = f12416a.mo14981g() + f12416a.mo14980f();
        int i2 = Integer.MAX_VALUE;
        int i3 = (h >= 16 || f12420e == 0) ? f12419d != 0.0f ? ((int) (f12419d * ((float) h))) + 1 : Integer.MAX_VALUE : m15776a(f12420e, h);
        if (i <= i3) {
            if (h < 16 && f12418c != 0) {
                i2 = m15776a(f12418c, h);
            } else if (f12417b != 0.0f) {
                i2 = (int) (f12417b * ((float) h));
            }
            if (g <= i2) {
                return true;
            }
        }
        return false;
    }
}

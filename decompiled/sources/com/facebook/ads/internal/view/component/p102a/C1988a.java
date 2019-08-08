package com.facebook.ads.internal.view.component.p102a;

import com.facebook.ads.internal.adapters.p072b.C1601l;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.component.C1983a;

/* renamed from: com.facebook.ads.internal.view.component.a.a */
public class C1988a {

    /* renamed from: a */
    private static final int f6280a = C2342x.f7368a.heightPixels;

    /* renamed from: b */
    private static final int f6281b = C2342x.f7368a.widthPixels;

    /* renamed from: a */
    public static float m8173a(C1601l lVar) {
        int h = lVar.mo7198c().mo7134h();
        int i = lVar.mo7198c().mo7135i();
        if (i > 0) {
            return ((float) h) / ((float) i);
        }
        return -1.0f;
    }

    /* renamed from: a */
    public static boolean m8174a(double d) {
        return d < 0.9d;
    }

    /* renamed from: a */
    public static boolean m8175a(int i, int i2, double d) {
        if (i != 2) {
            if (!((f6280a - i2) - ((C2342x.m9080a(16) + (C1983a.f6383a * 2)) + (C2009f.f6311a * 2)) < ((int) (((double) (f6281b - (2 * C2009f.f6311a))) / d)))) {
                return false;
            }
        }
        return true;
    }
}

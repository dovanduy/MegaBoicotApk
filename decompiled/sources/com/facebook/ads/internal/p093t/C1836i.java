package com.facebook.ads.internal.p093t;

import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.t.i */
public class C1836i {

    /* renamed from: a */
    private final double f5831a;

    /* renamed from: b */
    private final double f5832b;

    public C1836i(double d, double d2) {
        this.f5831a = d;
        this.f5832b = d2;
    }

    /* renamed from: a */
    public static C1836i m7710a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        double optDouble = jSONObject.optDouble("value", 0.0d);
        double optDouble2 = jSONObject.optDouble("scale", 0.0d);
        if (optDouble == 0.0d || optDouble2 == 0.0d) {
            return null;
        }
        return new C1836i(optDouble, optDouble2);
    }

    /* renamed from: a */
    public double mo7783a() {
        return this.f5831a;
    }

    /* renamed from: b */
    public double mo7784b() {
        return this.f5832b;
    }
}

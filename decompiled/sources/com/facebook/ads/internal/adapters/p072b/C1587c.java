package com.facebook.ads.internal.adapters.p072b;

import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.b.c */
public class C1587c implements Serializable {
    private static final long serialVersionUID = -1165646029762217510L;

    /* renamed from: a */
    private final int f4860a;

    /* renamed from: b */
    private final int f4861b;

    /* renamed from: c */
    private final int f4862c;

    /* renamed from: d */
    private final boolean f4863d;

    private C1587c(int i, int i2, int i3, boolean z) {
        this.f4860a = i;
        this.f4861b = i2;
        this.f4862c = i3;
        this.f4863d = z;
    }

    /* renamed from: a */
    public static C1587c m6568a(JSONObject jSONObject) {
        return new C1587c(jSONObject.optInt("countdown_time_ms", 6000), jSONObject.optInt("pulse_animation_duration_ms", 600), jSONObject.optInt("default_ad_index"), jSONObject.optBoolean("should_show_rating", false));
    }

    /* renamed from: a */
    public int mo7122a() {
        return this.f4860a;
    }

    /* renamed from: b */
    public int mo7123b() {
        return this.f4862c;
    }

    /* renamed from: c */
    public int mo7124c() {
        return this.f4861b;
    }

    /* renamed from: d */
    public boolean mo7125d() {
        return this.f4863d;
    }
}

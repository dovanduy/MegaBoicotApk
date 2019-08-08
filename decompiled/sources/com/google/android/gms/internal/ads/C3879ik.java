package com.google.android.gms.internal.ads;

import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ik */
public final class C3879ik {

    /* renamed from: a */
    public final zzaef f13291a;

    /* renamed from: b */
    public final zzaej f13292b;

    /* renamed from: c */
    public final bbk f13293c;

    /* renamed from: d */
    public final zzjn f13294d;

    /* renamed from: e */
    public final int f13295e;

    /* renamed from: f */
    public final long f13296f;

    /* renamed from: g */
    public final long f13297g;

    /* renamed from: h */
    public final JSONObject f13298h;

    /* renamed from: i */
    public final amj f13299i;

    /* renamed from: j */
    public final boolean f13300j;

    public C3879ik(zzaef zzaef, zzaej zzaej, bbk bbk, zzjn zzjn, int i, long j, long j2, JSONObject jSONObject, amj amj, Boolean bool) {
        this.f13291a = zzaef;
        this.f13292b = zzaej;
        this.f13293c = bbk;
        this.f13294d = zzjn;
        this.f13295e = i;
        this.f13296f = j;
        this.f13297g = j2;
        this.f13298h = jSONObject;
        this.f13299i = amj;
        boolean z = bool != null ? bool.booleanValue() : C3967lr.m17352a(zzaef.f14404c);
        this.f13300j = z;
    }

    public C3879ik(zzaef zzaef, zzaej zzaej, bbk bbk, zzjn zzjn, int i, long j, long j2, JSONObject jSONObject, amo amo) {
        this.f13291a = zzaef;
        this.f13292b = zzaej;
        this.f13293c = null;
        this.f13294d = null;
        this.f13295e = i;
        this.f13296f = j;
        this.f13297g = j2;
        this.f13298h = null;
        this.f13299i = new amj(amo);
        this.f13300j = false;
    }
}

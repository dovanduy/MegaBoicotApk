package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C3504r;

/* renamed from: com.google.android.gms.internal.ads.kv */
public final class C3944kv {

    /* renamed from: a */
    public final String f13474a;

    /* renamed from: b */
    public final double f13475b;

    /* renamed from: c */
    public final int f13476c;

    /* renamed from: d */
    private final double f13477d;

    /* renamed from: e */
    private final double f13478e;

    public C3944kv(String str, double d, double d2, double d3, int i) {
        this.f13474a = str;
        this.f13478e = d;
        this.f13477d = d2;
        this.f13475b = d3;
        this.f13476c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3944kv)) {
            return false;
        }
        C3944kv kvVar = (C3944kv) obj;
        return C3504r.m12550a(this.f13474a, kvVar.f13474a) && this.f13477d == kvVar.f13477d && this.f13478e == kvVar.f13478e && this.f13476c == kvVar.f13476c && Double.compare(this.f13475b, kvVar.f13475b) == 0;
    }

    public final int hashCode() {
        return C3504r.m12548a(this.f13474a, Double.valueOf(this.f13477d), Double.valueOf(this.f13478e), Double.valueOf(this.f13475b), Integer.valueOf(this.f13476c));
    }

    public final String toString() {
        return C3504r.m12549a((Object) this).mo13613a("name", this.f13474a).mo13613a("minBound", Double.valueOf(this.f13478e)).mo13613a("maxBound", Double.valueOf(this.f13477d)).mo13613a("percent", Double.valueOf(this.f13475b)).mo13613a("count", Integer.valueOf(this.f13476c)).toString();
    }
}

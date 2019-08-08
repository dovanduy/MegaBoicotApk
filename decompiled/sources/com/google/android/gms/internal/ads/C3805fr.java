package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C3504r;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.fr */
public final class C3805fr extends C3811fx {

    /* renamed from: a */
    private final String f13124a;

    /* renamed from: b */
    private final int f13125b;

    public C3805fr(String str, int i) {
        this.f13124a = str;
        this.f13125b = i;
    }

    /* renamed from: a */
    public final String mo15307a() {
        return this.f13124a;
    }

    /* renamed from: b */
    public final int mo15308b() {
        return this.f13125b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C3805fr)) {
            return false;
        }
        C3805fr frVar = (C3805fr) obj;
        if (C3504r.m12550a(this.f13124a, frVar.f13124a) && C3504r.m12550a(Integer.valueOf(this.f13125b), Integer.valueOf(frVar.f13125b))) {
            return true;
        }
        return false;
    }
}

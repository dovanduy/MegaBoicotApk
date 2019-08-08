package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.C3516w;
import com.google.android.gms.common.util.C3567s;

/* renamed from: com.google.firebase.c */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
public final class C4935c {

    /* renamed from: a */
    private final String f16105a;

    /* renamed from: b */
    private final String f16106b;

    /* renamed from: c */
    private final String f16107c;

    /* renamed from: d */
    private final String f16108d;

    /* renamed from: e */
    private final String f16109e;

    /* renamed from: f */
    private final String f16110f;

    /* renamed from: g */
    private final String f16111g;

    private C4935c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C3513t.m12632a(!C3567s.m12779a(str), (Object) "ApplicationId must be set.");
        this.f16106b = str;
        this.f16105a = str2;
        this.f16107c = str3;
        this.f16108d = str4;
        this.f16109e = str5;
        this.f16110f = str6;
        this.f16111g = str7;
    }

    /* renamed from: a */
    public static C4935c m21515a(Context context) {
        C3516w wVar = new C3516w(context);
        String a = wVar.mo13617a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        C4935c cVar = new C4935c(a, wVar.mo13617a("google_api_key"), wVar.mo13617a("firebase_database_url"), wVar.mo13617a("ga_trackingId"), wVar.mo13617a("gcm_defaultSenderId"), wVar.mo13617a("google_storage_bucket"), wVar.mo13617a("project_id"));
        return cVar;
    }

    /* renamed from: a */
    public final String mo17842a() {
        return this.f16106b;
    }

    /* renamed from: b */
    public final String mo17843b() {
        return this.f16109e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4935c)) {
            return false;
        }
        C4935c cVar = (C4935c) obj;
        if (!C3504r.m12550a(this.f16106b, cVar.f16106b) || !C3504r.m12550a(this.f16105a, cVar.f16105a) || !C3504r.m12550a(this.f16107c, cVar.f16107c) || !C3504r.m12550a(this.f16108d, cVar.f16108d) || !C3504r.m12550a(this.f16109e, cVar.f16109e) || !C3504r.m12550a(this.f16110f, cVar.f16110f) || !C3504r.m12550a(this.f16111g, cVar.f16111g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C3504r.m12548a(this.f16106b, this.f16105a, this.f16107c, this.f16108d, this.f16109e, this.f16110f, this.f16111g);
    }

    public final String toString() {
        return C3504r.m12549a((Object) this).mo13613a("applicationId", this.f16106b).mo13613a("apiKey", this.f16105a).mo13613a("databaseUrl", this.f16107c).mo13613a("gcmSenderId", this.f16109e).mo13613a("storageBucket", this.f16110f).mo13613a("projectId", this.f16111g).toString();
    }
}

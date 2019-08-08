package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C3991mo;
import com.google.android.gms.internal.ads.C3996mt;
import com.google.android.gms.internal.ads.C4008ne;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.f */
final /* synthetic */ class C3056f implements C3991mo {

    /* renamed from: a */
    static final C3991mo f8937a = new C3056f();

    private C3056f() {
    }

    /* renamed from: a */
    public final C4008ne mo12596a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            C3025aw.m10921i().mo15449l().mo15503f(jSONObject.getString("appSettingsJson"));
        }
        return C3996mt.m17448a(null);
    }
}

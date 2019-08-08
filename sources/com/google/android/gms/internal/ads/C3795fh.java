package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.fh */
public final class C3795fh extends C3797fj {

    /* renamed from: a */
    private final Object f13107a = new Object();

    /* renamed from: b */
    private final Context f13108b;

    /* renamed from: c */
    private SharedPreferences f13109c;

    /* renamed from: d */
    private final bar<JSONObject, JSONObject> f13110d;

    public C3795fh(Context context, bar<JSONObject, JSONObject> bar) {
        this.f13108b = context.getApplicationContext();
        this.f13110d = bar;
    }

    /* renamed from: a */
    public final C4008ne<Void> mo15290a() {
        synchronized (this.f13107a) {
            if (this.f13109c == null) {
                this.f13109c = this.f13108b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (C3025aw.m10924l().mo13694a() - this.f13109c.getLong("js_last_update", 0) < ((Long) aoq.m14620f().mo14695a(aru.f11849bU)).longValue()) {
            return C3996mt.m17448a(null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzang.m18792a().f14505a);
            jSONObject.put("mf", aoq.m14620f().mo14695a(aru.f11850bV));
            jSONObject.put("cl", "193400285");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("dynamite_version", ModuleDescriptor.MODULE_VERSION);
            return C3996mt.m17451a(this.f13110d.mo15044b(jSONObject), (C3992mp<A, B>) new C3796fi<A,B>(this), C4014nk.f13618b);
        } catch (JSONException e) {
            C3900je.m17430b("Unable to populate SDK Core Constants parameters.", e);
            return C3996mt.m17448a(null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo15291a(JSONObject jSONObject) {
        aru.m15025a(this.f13108b, 1, jSONObject);
        this.f13109c.edit().putLong("js_last_update", C3025aw.m10924l().mo13694a()).apply();
        return null;
    }
}

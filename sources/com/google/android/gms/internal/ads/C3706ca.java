package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ca */
final class C3706ca implements C3067ae<C4089qe> {

    /* renamed from: a */
    private final /* synthetic */ C4089qe f12782a;

    /* renamed from: b */
    private final /* synthetic */ C4019np f12783b;

    /* renamed from: c */
    private final /* synthetic */ C3699bu f12784c;

    C3706ca(C3699bu buVar, C4089qe qeVar, C4019np npVar) {
        this.f12784c = buVar;
        this.f12782a = qeVar;
        this.f12783b = npVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        boolean z;
        JSONObject jSONObject;
        try {
            String str = (String) map.get("success");
            String str2 = (String) map.get("failure");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject(str2);
                z = false;
            } else {
                JSONObject jSONObject2 = new JSONObject(str);
                z = true;
                jSONObject = jSONObject2;
            }
            if (this.f12784c.f12771h.equals(jSONObject.optString("ads_id", ""))) {
                this.f12782a.mo15884b("/nativeAdPreProcess", this);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("success", z);
                jSONObject3.put("json", jSONObject);
                this.f12783b.mo15686b(jSONObject3);
            }
        } catch (Throwable th) {
            C3900je.m17430b("Error while preprocessing json.", th);
            this.f12783b.mo15685a(th);
        }
    }
}

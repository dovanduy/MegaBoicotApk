package com.google.android.gms.internal.ads;

import android.support.p017v4.p023d.C0398m;
import com.appnext.base.p046b.C1245d;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.bt */
public final class C3698bt implements C3686bh<atd> {

    /* renamed from: a */
    private final boolean f12763a;

    public C3698bt(boolean z) {
        this.f12763a = z;
    }

    /* renamed from: a */
    public final /* synthetic */ atn mo15198a(C3676ay ayVar, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        C0398m mVar = new C0398m();
        C0398m mVar2 = new C0398m();
        C4008ne a = ayVar.mo14945a(jSONObject);
        C4008ne a2 = ayVar.mo14946a(jSONObject, "video");
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString(C1245d.f3961jd);
            if ("string".equals(string)) {
                mVar2.put(jSONObject2.getString("name"), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                mVar.put(jSONObject2.getString("name"), ayVar.mo14949a(jSONObject2, "image_value", this.f12763a));
            } else {
                String str = "Unknown custom asset type: ";
                String valueOf = String.valueOf(string);
                C3900je.m17435e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        C4089qe a3 = C3676ay.m15676a(a2);
        String string2 = jSONObject.getString("custom_template_id");
        C0398m mVar3 = new C0398m();
        for (int i2 = 0; i2 < mVar.size(); i2++) {
            mVar3.put(mVar.mo1399b(i2), ((Future) mVar.mo1400c(i2)).get());
        }
        atd atd = new atd(string2, mVar3, mVar2, (asu) a.get(), a3 != null ? a3.mo15799b() : null, a3 != null ? a3.getView() : null);
        return atd;
    }
}

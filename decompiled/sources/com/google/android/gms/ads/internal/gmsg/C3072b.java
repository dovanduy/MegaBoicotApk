package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C4019np;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.gmsg.b */
public final class C3072b implements C3067ae<Object> {

    /* renamed from: a */
    private final HashMap<String, C4019np<JSONObject>> f8958a = new HashMap<>();

    /* renamed from: a */
    public final Future<JSONObject> mo12615a(String str) {
        C4019np npVar = new C4019np();
        this.f8958a.put(str, npVar);
        return npVar;
    }

    /* renamed from: b */
    public final void mo12616b(String str) {
        C4019np npVar = (C4019np) this.f8958a.get(str);
        if (npVar == null) {
            C3900je.m17431c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!npVar.isDone()) {
            npVar.cancel(true);
        }
        this.f8958a.remove(str);
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = (String) map.get("fetched_ad");
        C3900je.m17429b("Received ad from the cache.");
        C4019np npVar = (C4019np) this.f8958a.get(str);
        if (npVar == null) {
            C3900je.m17431c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            npVar.mo15686b(new JSONObject(str2));
        } catch (JSONException e) {
            C3900je.m17430b("Failed constructing JSON object from value passed from javascript", e);
            npVar.mo15686b(null);
        } finally {
            this.f8958a.remove(str);
        }
    }
}

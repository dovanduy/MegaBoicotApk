package com.google.android.gms.ads.internal.gmsg;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3900je;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.gmsg.a */
public final class C3062a implements C3067ae<Object> {

    /* renamed from: a */
    private final C3081k f8951a;

    public C3062a(C3081k kVar) {
        this.f8951a = kVar;
    }

    /* renamed from: a */
    private static Bundle m11076a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            Bundle bundle = new Bundle();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                Object obj = jSONObject.get(str2);
                if (obj != null) {
                    if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Double) obj).doubleValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        bundle.putString(str2, (String) obj);
                    } else {
                        String str3 = "Unsupported type for key:";
                        String valueOf = String.valueOf(str2);
                        C3900je.m17435e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                }
            }
            return bundle;
        } catch (JSONException e) {
            C3900je.m17430b("Failed to convert ad metadata to JSON.", e);
            return null;
        }
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (this.f8951a != null) {
            String str = (String) map.get("name");
            if (str == null) {
                C3900je.m17433d("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle a = m11076a((String) map.get("info"));
            if (a == null) {
                C3900je.m17431c("Failed to convert ad metadata to Bundle.");
            } else {
                this.f8951a.mo12421a(str, a);
            }
        }
    }
}

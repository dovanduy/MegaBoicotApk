package com.appnext.base.p046b;

import android.os.Bundle;
import android.os.PersistableBundle;
import com.appnext.base.p042a.p044b.C1231c;
import org.json.JSONObject;

/* renamed from: com.appnext.base.b.c */
public final class C1244c {
    public static final String DATA = "data";
    public static final String KEY = "key";
    public static final String STATUS = "status";

    /* renamed from: iC */
    public static final String f3933iC = "cycle";

    /* renamed from: iD */
    public static final String f3934iD = "cycle_type";

    /* renamed from: iE */
    public static final String f3935iE = "sample";

    /* renamed from: iF */
    public static final String f3936iF = "sample_type";

    /* renamed from: iG */
    public static final String f3937iG = "service_key";

    /* renamed from: e */
    public static Bundle m5268e(C1231c cVar) {
        Bundle bundle = new Bundle();
        try {
            bundle.putString("key", cVar.getKey());
            bundle.putString(f3933iC, cVar.mo5908be());
            bundle.putString(f3934iD, cVar.mo5909bf());
            bundle.putString(f3935iE, cVar.mo5906bc());
            bundle.putString(f3936iF, cVar.mo5907bd());
            bundle.putString("service_key", cVar.mo5910bg());
            bundle.putString(STATUS, cVar.mo5905bb());
            if (cVar.mo5911bh() != null) {
                bundle.putString("data", cVar.mo5911bh().toString());
            }
            JSONObject bh = cVar.mo5911bh();
            if (bh != null) {
                bundle.putString("data", bh.toString());
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    /* renamed from: b */
    public static C1231c m5265b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("key", "");
        String string2 = bundle.getString(f3933iC, "");
        String string3 = bundle.getString(f3934iD, "");
        C1231c cVar = new C1231c(bundle.getString(STATUS, ""), bundle.getString(f3935iE, ""), bundle.getString(f3936iF, ""), string2, string3, string, bundle.getString("service_key", ""), bundle.getString("data", null));
        return cVar;
    }

    /* renamed from: f */
    public static PersistableBundle m5269f(C1231c cVar) {
        PersistableBundle persistableBundle = new PersistableBundle();
        try {
            persistableBundle.putString("key", cVar.getKey() != null ? cVar.getKey() : "");
            persistableBundle.putString(f3933iC, cVar.mo5908be() != null ? cVar.mo5908be() : "");
            persistableBundle.putString(f3934iD, cVar.mo5909bf() != null ? cVar.mo5909bf() : "");
            String str = f3935iE;
            cVar.mo5906bc();
            persistableBundle.putString(str, cVar.mo5906bc());
            persistableBundle.putString(f3936iF, cVar.mo5907bd() != null ? cVar.mo5907bd() : "");
            persistableBundle.putString("service_key", cVar.mo5910bg() != null ? cVar.mo5910bg() : "");
            persistableBundle.putString(STATUS, cVar.mo5905bb() != null ? cVar.mo5905bb() : "");
            if (cVar.mo5911bh() != null) {
                persistableBundle.putString("data", cVar.mo5911bh().toString());
            }
            JSONObject bh = cVar.mo5911bh();
            if (bh != null) {
                persistableBundle.putString("data", bh.toString());
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return persistableBundle;
    }

    /* renamed from: b */
    public static C1231c m5266b(PersistableBundle persistableBundle) {
        if (persistableBundle == null) {
            return null;
        }
        String string = persistableBundle.getString("key", "");
        String string2 = persistableBundle.getString(f3933iC, "");
        String string3 = persistableBundle.getString(f3934iD, "");
        C1231c cVar = new C1231c(persistableBundle.getString(STATUS, ""), persistableBundle.getString(f3935iE, ""), persistableBundle.getString(f3936iF, ""), string2, string3, string, persistableBundle.getString("service_key", ""), persistableBundle.getString("data", null));
        return cVar;
    }

    /* renamed from: c */
    public static C1231c m5267c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.has("key") ? jSONObject.getString("key") : null;
            String string2 = jSONObject.has(f3933iC) ? jSONObject.getString(f3933iC) : null;
            String string3 = jSONObject.has(f3934iD) ? jSONObject.getString(f3934iD) : null;
            C1231c cVar = new C1231c(jSONObject.has(STATUS) ? jSONObject.getString(STATUS) : null, jSONObject.has(f3935iE) ? jSONObject.getString(f3935iE) : null, jSONObject.has(f3936iF) ? jSONObject.getString(f3936iF) : null, string2, string3, string, jSONObject.has("service_key") ? jSONObject.getString("service_key") : null, jSONObject.has("data") ? jSONObject.getString("data") : null);
            return cVar;
        } catch (Throwable unused) {
            return null;
        }
    }
}

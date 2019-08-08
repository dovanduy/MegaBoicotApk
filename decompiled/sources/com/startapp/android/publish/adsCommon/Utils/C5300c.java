package com.startapp.android.publish.adsCommon.Utils;

import com.startapp.common.C5552e;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.android.publish.adsCommon.Utils.c */
/* compiled from: StartAppSDK */
public class C5300c extends C5302e {

    /* renamed from: a */
    private JSONObject f17033a;

    public C5300c() {
        this.f17033a = null;
        this.f17033a = new JSONObject();
    }

    /* renamed from: a */
    public void mo19620a(String str, Object obj, boolean z, boolean z2) {
        if (z && obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Required key: [");
            sb.append(str);
            sb.append("] is missing");
            throw new C5552e(sb.toString(), null);
        } else if (obj != null && !obj.toString().equals("")) {
            try {
                this.f17033a.put(str, obj);
            } catch (JSONException e) {
                if (z) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("failed converting to json object value: [");
                    sb2.append(obj);
                    sb2.append("]");
                    throw new C5552e(sb2.toString(), e);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19621a(String str, Set<String> set, boolean z, boolean z2) {
        if (z && (set == null || set.size() == 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Required key: [");
            sb.append(str);
            sb.append("] is missing");
            throw new C5552e(sb.toString(), null);
        } else if (set != null && set.size() > 0) {
            try {
                this.f17033a.put(str, new JSONArray(set));
            } catch (JSONException e) {
                if (z) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("failed converting to json array values: [");
                    sb2.append(set);
                    sb2.append("]");
                    throw new C5552e(sb2.toString(), e);
                }
            }
        }
    }

    public String toString() {
        return this.f17033a.toString();
    }
}

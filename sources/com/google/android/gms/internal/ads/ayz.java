package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3025aw;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class ayz {
    /* renamed from: a */
    public static void m15801a(ayy ayy, String str, String str2) {
        StringBuilder sb = new StringBuilder(3 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        ayy.mo14993b(sb.toString());
    }

    /* renamed from: a */
    public static void m15802a(ayy ayy, String str, Map map) {
        try {
            ayy.mo14987a(str, C3025aw.m10917e().mo15514a(map));
        } catch (JSONException unused) {
            C3900je.m17435e("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: a */
    public static void m15803a(ayy ayy, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        ayy.mo14991a(str, jSONObject.toString());
    }

    /* renamed from: b */
    public static void m15804b(ayy ayy, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String str2 = "Dispatching AFMA event: ";
        String valueOf = String.valueOf(sb.toString());
        C3900je.m17429b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        ayy.mo14993b(sb.toString());
    }
}

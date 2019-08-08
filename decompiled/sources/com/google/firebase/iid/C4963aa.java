package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.aa */
final class C4963aa {

    /* renamed from: b */
    private static final long f16171b = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    final String f16172a;

    /* renamed from: c */
    private final String f16173c;

    /* renamed from: d */
    private final long f16174d;

    private C4963aa(String str, String str2, long j) {
        this.f16172a = str;
        this.f16173c = str2;
        this.f16174d = j;
    }

    /* renamed from: a */
    static C4963aa m21618a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C4963aa(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C4963aa(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(23 + String.valueOf(valueOf).length());
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    static String m21620a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(24 + String.valueOf(valueOf).length());
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    static String m21619a(C4963aa aaVar) {
        if (aaVar == null) {
            return null;
        }
        return aaVar.f16172a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo17905b(String str) {
        return System.currentTimeMillis() > this.f16174d + f16171b || !str.equals(this.f16173c);
    }
}

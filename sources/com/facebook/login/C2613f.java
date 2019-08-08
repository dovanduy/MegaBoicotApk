package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.C2436g;
import com.facebook.login.LoginClient.Request;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.f */
/* compiled from: LoginLogger */
class C2613f {

    /* renamed from: a */
    private final C2436g f8148a;

    /* renamed from: b */
    private String f8149b;

    /* renamed from: c */
    private String f8150c;

    C2613f(Context context, String str) {
        this.f8149b = str;
        this.f8148a = C2436g.m9325b(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0);
                if (packageInfo != null) {
                    this.f8150c = packageInfo.versionName;
                }
            }
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public String mo9235a() {
        return this.f8149b;
    }

    /* renamed from: a */
    static Bundle m10005a(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    /* renamed from: a */
    public void mo9236a(Request request) {
        Bundle a = m10005a(request.mo9186e());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("login_behavior", request.mo9182b().toString());
            jSONObject.put("request_code", LoginClient.m9884d());
            jSONObject.put("permissions", TextUtils.join(",", request.mo9178a()));
            jSONObject.put("default_audience", request.mo9183c().toString());
            jSONObject.put("isReauthorize", request.mo9187f());
            if (this.f8150c != null) {
                jSONObject.put("facebookVersion", this.f8150c);
            }
            a.putString("6_extras", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.f8148a.mo8855a("fb_mobile_login_start", (Double) null, a);
    }

    /* renamed from: a */
    public void mo9240a(String str, Map<String, String> map, C2600a aVar, Map<String, String> map2, Exception exc) {
        Bundle a = m10005a(str);
        if (aVar != null) {
            a.putString("2_result", aVar.mo9202a());
        }
        if (!(exc == null || exc.getMessage() == null)) {
            a.putString("5_error_message", exc.getMessage());
        }
        JSONObject jSONObject = !map.isEmpty() ? new JSONObject(map) : null;
        if (map2 != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                for (Entry entry : map2.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            a.putString("6_extras", jSONObject.toString());
        }
        this.f8148a.mo8855a("fb_mobile_login_complete", (Double) null, a);
    }

    /* renamed from: a */
    public void mo9237a(String str, String str2) {
        Bundle a = m10005a(str);
        a.putString("3_method", str2);
        this.f8148a.mo8855a("fb_mobile_login_method_start", (Double) null, a);
    }

    /* renamed from: a */
    public void mo9239a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Bundle a = m10005a(str);
        if (str3 != null) {
            a.putString("2_result", str3);
        }
        if (str4 != null) {
            a.putString("5_error_message", str4);
        }
        if (str5 != null) {
            a.putString("4_error_code", str5);
        }
        if (map != null && !map.isEmpty()) {
            a.putString("6_extras", new JSONObject(map).toString());
        }
        a.putString("3_method", str2);
        this.f8148a.mo8855a("fb_mobile_login_method_complete", (Double) null, a);
    }

    /* renamed from: b */
    public void mo9241b(String str, String str2) {
        Bundle a = m10005a(str);
        a.putString("3_method", str2);
        this.f8148a.mo8855a("fb_mobile_login_method_not_tried", (Double) null, a);
    }

    /* renamed from: c */
    public void mo9242c(String str, String str2) {
        mo9238a(str, str2, "");
    }

    /* renamed from: a */
    public void mo9238a(String str, String str2, String str3) {
        Bundle a = m10005a("");
        a.putString("2_result", C2600a.ERROR.mo9202a());
        a.putString("5_error_message", str2);
        a.putString("3_method", str3);
        this.f8148a.mo8855a(str, (Double) null, a);
    }
}

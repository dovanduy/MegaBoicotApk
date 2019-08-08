package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C2453c;
import com.facebook.C2579j;
import com.facebook.appevents.C2436g;
import com.facebook.internal.C2479ad;
import com.facebook.login.LoginClient.Request;
import com.google.android.exoplayer2.C2793C;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: a */
    Map<String, String> f8111a;

    /* renamed from: b */
    protected LoginClient f8112b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract String mo9091a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9092a(JSONObject jSONObject) throws JSONException {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9093a(int i, int i2, Intent intent) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo9094a(Request request);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9137b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo9210d() {
        return false;
    }

    LoginMethodHandler(LoginClient loginClient) {
        this.f8112b = loginClient;
    }

    LoginMethodHandler(Parcel parcel) {
        this.f8111a = C2479ad.m9439a(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9207a(LoginClient loginClient) {
        if (this.f8112b != null) {
            throw new C2579j("Can't set LoginClient if it is already set.");
        }
        this.f8112b = loginClient;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo9206a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo9091a());
            mo9092a(jSONObject);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating client state json: ");
            sb.append(e.getMessage());
            Log.w("LoginMethodHandler", sb.toString());
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9208a(String str, Object obj) {
        if (this.f8111a == null) {
            this.f8111a = new HashMap();
        }
        this.f8111a.put(str, obj == null ? null : obj.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9209b(String str) {
        String d = this.f8112b.mo9161c().mo9184d();
        C2436g b = C2436g.m9325b(this.f8112b.mo9158b(), d);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", d);
        b.mo8855a("fb_dialogs_web_login_dialog_complete", (Double) null, bundle);
    }

    /* renamed from: a */
    static AccessToken m9937a(Bundle bundle, C2453c cVar, String str) {
        Date a = C2479ad.m9436a(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        ArrayList stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (C2479ad.m9456a(string)) {
            return null;
        }
        AccessToken accessToken = new AccessToken(string, str, bundle.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, cVar, a, new Date());
        return accessToken;
    }

    /* renamed from: a */
    public static AccessToken m9938a(Collection<String> collection, Bundle bundle, C2453c cVar, String str) throws C2579j {
        Date a = C2479ad.m9436a(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        String string2 = bundle.getString("granted_scopes");
        if (!C2479ad.m9456a(string2)) {
            collection = new ArrayList<>(Arrays.asList(string2.split(",")));
        }
        Collection<String> collection2 = collection;
        String string3 = bundle.getString("denied_scopes");
        Collection arrayList = !C2479ad.m9456a(string3) ? new ArrayList(Arrays.asList(string3.split(","))) : null;
        if (C2479ad.m9456a(string)) {
            return null;
        }
        AccessToken accessToken = new AccessToken(string, str, m9939c(bundle.getString("signed_request")), collection2, arrayList, cVar, a, new Date());
        return accessToken;
    }

    /* renamed from: c */
    static String m9939c(String str) throws C2579j {
        if (str == null || str.isEmpty()) {
            throw new C2579j("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), C2793C.UTF8_NAME)).getString("user_id");
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new C2579j("Failed to retrieve user_id from signed_request");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C2479ad.m9443a(parcel, this.f8111a);
    }
}

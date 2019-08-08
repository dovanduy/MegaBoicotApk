package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.C2484ae;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.v */
/* compiled from: ProfileCache */
final class C2758v {

    /* renamed from: a */
    private final SharedPreferences f8562a = C2649m.m10133f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    C2758v() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Profile mo9597a() {
        String string = this.f8562a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9598a(Profile profile) {
        C2484ae.m9489a((Object) profile, "profile");
        JSONObject d = profile.mo6717d();
        if (d != null) {
            this.f8562a.edit().putString("com.facebook.ProfileManager.CachedProfile", d.toString()).apply();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9599b() {
        this.f8562a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }
}

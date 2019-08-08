package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.C2484ae;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a */
/* compiled from: AccessTokenCache */
class C1510a {

    /* renamed from: a */
    private final SharedPreferences f4581a;

    /* renamed from: b */
    private final C1511a f4582b;

    /* renamed from: c */
    private C2756t f4583c;

    /* renamed from: com.facebook.a$a */
    /* compiled from: AccessTokenCache */
    static class C1511a {
        C1511a() {
        }

        /* renamed from: a */
        public C2756t mo6731a() {
            return new C2756t(C2649m.m10133f());
        }
    }

    C1510a(SharedPreferences sharedPreferences, C1511a aVar) {
        this.f4581a = sharedPreferences;
        this.f4582b = aVar;
    }

    public C1510a() {
        this(C2649m.m10133f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new C1511a());
    }

    /* renamed from: a */
    public AccessToken mo6728a() {
        if (m6298c()) {
            return m6299d();
        }
        if (!m6300e()) {
            return null;
        }
        AccessToken f = m6301f();
        if (f == null) {
            return f;
        }
        mo6729a(f);
        m6302g().mo9596b();
        return f;
    }

    /* renamed from: a */
    public void mo6729a(AccessToken accessToken) {
        C2484ae.m9489a((Object) accessToken, "accessToken");
        try {
            this.f4581a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.mo6626m().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    public void mo6730b() {
        this.f4581a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m6300e()) {
            m6302g().mo9596b();
        }
    }

    /* renamed from: c */
    private boolean m6298c() {
        return this.f4581a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    /* renamed from: d */
    private AccessToken m6299d() {
        String string = this.f4581a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.m6163a(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private boolean m6300e() {
        return C2649m.m10130c();
    }

    /* renamed from: f */
    private AccessToken m6301f() {
        Bundle a = m6302g().mo9595a();
        if (a == null || !C2756t.m10498a(a)) {
            return null;
        }
        return AccessToken.m6162a(a);
    }

    /* renamed from: g */
    private C2756t m6302g() {
        if (this.f4583c == null) {
            synchronized (this) {
                if (this.f4583c == null) {
                    this.f4583c = this.f4582b.mo6731a();
                }
            }
        }
        return this.f4583c;
    }
}

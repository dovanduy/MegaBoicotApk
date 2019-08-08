package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.C2453c;
import com.facebook.C2579j;
import com.facebook.C2581l;
import com.facebook.C2649m;
import com.facebook.C2656o;
import com.facebook.FacebookRequestError;
import com.facebook.internal.C2479ad;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.Collection;
import java.util.Locale;

abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: c */
    private String f8113c;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo9095c() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c_ */
    public abstract C2453c mo9096c_();

    /* renamed from: e */
    private static final String m9958e() {
        StringBuilder sb = new StringBuilder();
        sb.append("fb");
        sb.append(C2649m.m10137j());
        sb.append("://authorize");
        return sb.toString();
    }

    WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Bundle mo9214b(Request request) {
        Bundle bundle = new Bundle();
        if (!C2479ad.m9457a((Collection<T>) request.mo9178a())) {
            String join = TextUtils.join(",", request.mo9178a());
            bundle.putString("scope", join);
            mo9208a("scope", join);
        }
        bundle.putString("default_audience", request.mo9183c().mo9224a());
        bundle.putString("state", mo9206a(request.mo9186e()));
        AccessToken a = AccessToken.m6161a();
        String d = a != null ? a.mo6614d() : null;
        if (d == null || !d.equals(m9959f())) {
            C2479ad.m9462b((Context) this.f8112b.mo9158b());
            mo9208a("access_token", "0");
        } else {
            bundle.putString("access_token", d);
            mo9208a("access_token", "1");
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo9212a(Bundle bundle, Request request) {
        bundle.putString("redirect_uri", m9958e());
        bundle.putString("client_id", request.mo9184d());
        LoginClient loginClient = this.f8112b;
        bundle.putString("e2e", LoginClient.m9886m());
        bundle.putString("response_type", "token,signed_request");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", request.mo9189h());
        if (mo9095c() != null) {
            bundle.putString("sso", mo9095c());
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9213a(Request request, Bundle bundle, C2579j jVar) {
        Result result;
        String str;
        this.f8113c = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f8113c = bundle.getString("e2e");
            }
            try {
                AccessToken a = m9938a(request.mo9178a(), bundle, mo9096c_(), request.mo9184d());
                result = Result.m9927a(this.f8112b.mo9161c(), a);
                CookieSyncManager.createInstance(this.f8112b.mo9158b()).sync();
                m9957d(a.mo6614d());
            } catch (C2579j e) {
                result = Result.m9929a(this.f8112b.mo9161c(), null, e.getMessage());
            }
        } else if (jVar instanceof C2581l) {
            result = Result.m9928a(this.f8112b.mo9161c(), "User canceled log in.");
        } else {
            this.f8113c = null;
            String message = jVar.getMessage();
            if (jVar instanceof C2656o) {
                FacebookRequestError a2 = ((C2656o) jVar).mo9338a();
                str = String.format(Locale.ROOT, "%d", new Object[]{Integer.valueOf(a2.mo6657b())});
                message = a2.toString();
            } else {
                str = null;
            }
            result = Result.m9930a(this.f8112b.mo9161c(), null, message, str);
        }
        if (!C2479ad.m9456a(this.f8113c)) {
            mo9209b(this.f8113c);
        }
        this.f8112b.mo9154a(result);
    }

    /* renamed from: f */
    private String m9959f() {
        return this.f8112b.mo9158b().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    /* renamed from: d */
    private void m9957d(String str) {
        this.f8112b.mo9158b().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }
}

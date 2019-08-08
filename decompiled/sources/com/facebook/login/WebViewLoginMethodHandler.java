package com.facebook.login;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p017v4.app.FragmentActivity;
import com.facebook.C2453c;
import com.facebook.C2579j;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2485af;
import com.facebook.internal.C2485af.C2490a;
import com.facebook.internal.C2485af.C2492c;
import com.facebook.internal.C2517g;
import com.facebook.login.LoginClient.Request;

class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Creator<WebViewLoginMethodHandler> CREATOR = new Creator<WebViewLoginMethodHandler>() {
        /* renamed from: a */
        public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }

        /* renamed from: a */
        public WebViewLoginMethodHandler[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }
    };

    /* renamed from: c */
    private C2485af f8114c;

    /* renamed from: d */
    private String f8115d;

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    static class C2605a extends C2490a {

        /* renamed from: a */
        private String f8118a;

        /* renamed from: b */
        private String f8119b;

        /* renamed from: c */
        private String f8120c = "fbconnect://success";

        public C2605a(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }

        /* renamed from: a */
        public C2605a mo9221a(String str) {
            this.f8118a = str;
            return this;
        }

        /* renamed from: a */
        public C2605a mo9222a(boolean z) {
            this.f8120c = z ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        /* renamed from: b */
        public C2605a mo9223b(String str) {
            this.f8119b = str;
            return this;
        }

        /* renamed from: a */
        public C2485af mo8949a() {
            Bundle e = mo8953e();
            e.putString("redirect_uri", this.f8120c);
            e.putString("client_id", mo8950b());
            e.putString("e2e", this.f8118a);
            e.putString("response_type", "token,signed_request");
            e.putString("return_scopes", "true");
            e.putString("auth_type", this.f8119b);
            return C2485af.m9500a(mo8951c(), "oauth", e, mo8952d(), mo8954f());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo9091a() {
        return "web_view";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo9210d() {
        return true;
    }

    public int describeContents() {
        return 0;
    }

    WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c_ */
    public C2453c mo9096c_() {
        return C2453c.WEB_VIEW;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9137b() {
        if (this.f8114c != null) {
            this.f8114c.cancel();
            this.f8114c = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9094a(final Request request) {
        Bundle b = mo9214b(request);
        C26031 r1 = new C2492c() {
            /* renamed from: a */
            public void mo8960a(Bundle bundle, C2579j jVar) {
                WebViewLoginMethodHandler.this.mo9215b(request, bundle, jVar);
            }
        };
        this.f8115d = LoginClient.m9886m();
        mo9208a("e2e", this.f8115d);
        FragmentActivity b2 = this.f8112b.mo9158b();
        this.f8114c = new C2605a(b2, request.mo9184d(), b).mo9221a(this.f8115d).mo9222a(C2479ad.m9479f(b2)).mo9223b(request.mo9189h()).mo8948a(r1).mo8949a();
        C2517g gVar = new C2517g();
        gVar.mo604e(true);
        gVar.mo8991a((Dialog) this.f8114c);
        gVar.mo827a(b2.mo670f(), "FacebookDialogFragment");
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9215b(Request request, Bundle bundle, C2579j jVar) {
        super.mo9213a(request, bundle, jVar);
    }

    WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f8115d = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8115d);
    }
}

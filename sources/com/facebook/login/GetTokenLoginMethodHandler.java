package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.C2453c;
import com.facebook.C2579j;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2479ad.C2482a;
import com.facebook.internal.C2575y.C2577a;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Creator<GetTokenLoginMethodHandler> CREATOR = new Creator() {
        /* renamed from: a */
        public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
            return new GetTokenLoginMethodHandler(parcel);
        }

        /* renamed from: a */
        public GetTokenLoginMethodHandler[] newArray(int i) {
            return new GetTokenLoginMethodHandler[i];
        }
    };

    /* renamed from: c */
    private C2608c f8077c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo9091a() {
        return "get_token";
    }

    public int describeContents() {
        return 0;
    }

    GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9137b() {
        if (this.f8077c != null) {
            this.f8077c.mo9086b();
            this.f8077c.mo9084a((C2577a) null);
            this.f8077c = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9094a(final Request request) {
        this.f8077c = new C2608c(this.f8112b.mo9158b(), request.mo9184d());
        if (!this.f8077c.mo9085a()) {
            return false;
        }
        this.f8112b.mo9171k();
        this.f8077c.mo9084a((C2577a) new C2577a() {
            /* renamed from: a */
            public void mo9090a(Bundle bundle) {
                GetTokenLoginMethodHandler.this.mo9136a(request, bundle);
            }
        });
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9136a(Request request, Bundle bundle) {
        if (this.f8077c != null) {
            this.f8077c.mo9084a((C2577a) null);
        }
        this.f8077c = null;
        this.f8112b.mo9172l();
        if (bundle != null) {
            ArrayList stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> a = request.mo9178a();
            if (stringArrayList == null || (a != null && !stringArrayList.containsAll(a))) {
                HashSet hashSet = new HashSet();
                for (String str : a) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    mo9208a("new_permissions", TextUtils.join(",", hashSet));
                }
                request.mo9180a((Set<String>) hashSet);
            } else {
                mo9139c(request, bundle);
                return;
            }
        }
        this.f8112b.mo9169i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9138b(Request request, Bundle bundle) {
        this.f8112b.mo9154a(Result.m9927a(this.f8112b.mo9161c(), m9937a(bundle, C2453c.FACEBOOK_APPLICATION_SERVICE, request.mo9184d())));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo9139c(final Request request, final Bundle bundle) {
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string == null || string.isEmpty()) {
            this.f8112b.mo9171k();
            C2479ad.m9446a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), (C2482a) new C2482a() {
                /* renamed from: a */
                public void mo6723a(JSONObject jSONObject) {
                    try {
                        bundle.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString(TtmlNode.ATTR_ID));
                        GetTokenLoginMethodHandler.this.mo9138b(request, bundle);
                    } catch (JSONException e) {
                        GetTokenLoginMethodHandler.this.f8112b.mo9160b(Result.m9929a(GetTokenLoginMethodHandler.this.f8112b.mo9161c(), "Caught exception", e.getMessage()));
                    }
                }

                /* renamed from: a */
                public void mo6722a(C2579j jVar) {
                    GetTokenLoginMethodHandler.this.f8112b.mo9160b(Result.m9929a(GetTokenLoginMethodHandler.this.f8112b.mo9161c(), "Caught exception", jVar.getMessage()));
                }
            });
            return;
        }
        mo9138b(request, bundle);
    }

    GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}

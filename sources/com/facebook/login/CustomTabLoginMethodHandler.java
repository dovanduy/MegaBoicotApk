package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p017v4.app.FragmentActivity;
import com.facebook.C2453c;
import com.facebook.C2581l;
import com.facebook.C2649m;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2484ae;
import com.facebook.internal.C2527k;
import com.facebook.internal.C2529l;
import com.facebook.login.LoginClient.Request;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Creator<CustomTabLoginMethodHandler> CREATOR = new Creator() {
        /* renamed from: a */
        public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }

        /* renamed from: a */
        public CustomTabLoginMethodHandler[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }
    };

    /* renamed from: c */
    private static final String[] f8045c = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* renamed from: d */
    private String f8046d;

    /* renamed from: e */
    private String f8047e;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo9091a() {
        return "custom_tab";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo9095c() {
        return "chrome_custom_tab";
    }

    public int describeContents() {
        return 0;
    }

    CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f8047e = C2479ad.m9425a(20);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c_ */
    public C2453c mo9096c_() {
        return C2453c.CHROME_CUSTOM_TAB;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9094a(Request request) {
        if (!m9796e()) {
            return false;
        }
        Bundle a = mo9212a(mo9214b(request), request);
        Intent intent = new Intent(this.f8112b.mo9158b(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f4509a, a);
        intent.putExtra(CustomTabMainActivity.f4510b, m9798g());
        this.f8112b.mo9151a().startActivityForResult(intent, 1);
        return true;
    }

    /* renamed from: e */
    private boolean m9796e() {
        return m9797f() && m9798g() != null && m9799h() && C2484ae.m9492a(C2649m.m10133f());
    }

    /* renamed from: f */
    private boolean m9797f() {
        C2527k a = C2529l.m9632a(C2479ad.m9426a((Context) this.f8112b.mo9158b()));
        return a != null && a.mo8998d();
    }

    /* renamed from: g */
    private String m9798g() {
        if (this.f8046d != null) {
            return this.f8046d;
        }
        FragmentActivity b = this.f8112b.mo9158b();
        List<ResolveInfo> queryIntentServices = b.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices != null) {
            HashSet hashSet = new HashSet(Arrays.asList(f8045c));
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    this.f8046d = serviceInfo.packageName;
                    return this.f8046d;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    private boolean m9799h() {
        return !C2479ad.m9477e((Context) this.f8112b.mo9158b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9093a(int i, int i2, Intent intent) {
        if (i != 1) {
            return super.mo9093a(i, i2, intent);
        }
        Request c = this.f8112b.mo9161c();
        if (i2 == -1) {
            m9794a(intent.getStringExtra(CustomTabMainActivity.f4511c), c);
            return true;
        }
        super.mo9213a(c, null, new C2581l());
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9794a(java.lang.String r7, com.facebook.login.LoginClient.Request r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00b3
            java.lang.String r0 = com.facebook.CustomTabMainActivity.m6185a()
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x00b3
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = com.facebook.internal.C2479ad.m9465c(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = com.facebook.internal.C2479ad.m9465c(r7)
            r0.putAll(r7)
            boolean r7 = r6.m9795a(r0)
            r1 = 0
            if (r7 != 0) goto L_0x0035
            com.facebook.j r7 = new com.facebook.j
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>(r0)
            super.mo9213a(r8, r1, r7)
            return
        L_0x0035:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L_0x0043
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L_0x0043:
            java.lang.String r2 = "error_msg"
            java.lang.String r2 = r0.getString(r2)
            if (r2 != 0) goto L_0x0051
            java.lang.String r2 = "error_message"
            java.lang.String r2 = r0.getString(r2)
        L_0x0051:
            if (r2 != 0) goto L_0x0059
            java.lang.String r2 = "error_description"
            java.lang.String r2 = r0.getString(r2)
        L_0x0059:
            java.lang.String r3 = "error_code"
            java.lang.String r3 = r0.getString(r3)
            boolean r4 = com.facebook.internal.C2479ad.m9456a(r3)
            r5 = -1
            if (r4 != 0) goto L_0x006b
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r3 = r5
        L_0x006c:
            boolean r4 = com.facebook.internal.C2479ad.m9456a(r7)
            if (r4 == 0) goto L_0x007e
            boolean r4 = com.facebook.internal.C2479ad.m9456a(r2)
            if (r4 == 0) goto L_0x007e
            if (r3 != r5) goto L_0x007e
            super.mo9213a(r8, r0, r1)
            goto L_0x00b3
        L_0x007e:
            if (r7 == 0) goto L_0x0099
            java.lang.String r0 = "access_denied"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0090
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0099
        L_0x0090:
            com.facebook.l r7 = new com.facebook.l
            r7.<init>()
            super.mo9213a(r8, r1, r7)
            goto L_0x00b3
        L_0x0099:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r3 != r0) goto L_0x00a6
            com.facebook.l r7 = new com.facebook.l
            r7.<init>()
            super.mo9213a(r8, r1, r7)
            goto L_0x00b3
        L_0x00a6:
            com.facebook.FacebookRequestError r0 = new com.facebook.FacebookRequestError
            r0.<init>(r3, r7, r2)
            com.facebook.o r7 = new com.facebook.o
            r7.<init>(r0, r2)
            super.mo9213a(r8, r1, r7)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.m9794a(java.lang.String, com.facebook.login.LoginClient$Request):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9092a(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f8047e);
    }

    /* renamed from: a */
    private boolean m9795a(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.f8047e);
        } catch (JSONException unused) {
            return false;
        }
    }

    CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f8047e = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8047e);
    }
}

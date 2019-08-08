package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p017v4.app.Fragment;
import android.support.p017v4.app.FragmentActivity;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.C2579j;
import com.facebook.common.C2454a.C2460f;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2484ae;
import com.facebook.internal.C2512d.C2514b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class LoginClient implements Parcelable {
    public static final Creator<LoginClient> CREATOR = new Creator<LoginClient>() {
        /* renamed from: a */
        public LoginClient createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }

        /* renamed from: a */
        public LoginClient[] newArray(int i) {
            return new LoginClient[i];
        }
    };

    /* renamed from: a */
    LoginMethodHandler[] f8083a;

    /* renamed from: b */
    int f8084b = -1;

    /* renamed from: c */
    Fragment f8085c;

    /* renamed from: d */
    C2602b f8086d;

    /* renamed from: e */
    C2601a f8087e;

    /* renamed from: f */
    boolean f8088f;

    /* renamed from: g */
    Request f8089g;

    /* renamed from: h */
    Map<String, String> f8090h;

    /* renamed from: i */
    private C2613f f8091i;

    public static class Request implements Parcelable {
        public static final Creator<Request> CREATOR = new Creator<Request>() {
            /* renamed from: a */
            public Request createFromParcel(Parcel parcel) {
                return new Request(parcel);
            }

            /* renamed from: a */
            public Request[] newArray(int i) {
                return new Request[i];
            }
        };

        /* renamed from: a */
        private final C2609d f8092a;

        /* renamed from: b */
        private Set<String> f8093b;

        /* renamed from: c */
        private final C2606a f8094c;

        /* renamed from: d */
        private final String f8095d;

        /* renamed from: e */
        private final String f8096e;

        /* renamed from: f */
        private boolean f8097f;

        /* renamed from: g */
        private String f8098g;

        /* renamed from: h */
        private String f8099h;

        public int describeContents() {
            return 0;
        }

        Request(C2609d dVar, Set<String> set, C2606a aVar, String str, String str2, String str3) {
            this.f8097f = false;
            this.f8092a = dVar;
            if (set == null) {
                set = new HashSet<>();
            }
            this.f8093b = set;
            this.f8094c = aVar;
            this.f8099h = str;
            this.f8095d = str2;
            this.f8096e = str3;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Set<String> mo9178a() {
            return this.f8093b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9180a(Set<String> set) {
            C2484ae.m9489a((Object) set, "permissions");
            this.f8093b = set;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C2609d mo9182b() {
            return this.f8092a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C2606a mo9183c() {
            return this.f8094c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public String mo9184d() {
            return this.f8095d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public String mo9186e() {
            return this.f8096e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo9187f() {
            return this.f8097f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9181a(boolean z) {
            this.f8097f = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public String mo9188g() {
            return this.f8098g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9179a(String str) {
            this.f8098g = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public String mo9189h() {
            return this.f8099h;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public boolean mo9190i() {
            for (String b : this.f8093b) {
                if (C2614g.m10026b(b)) {
                    return true;
                }
            }
            return false;
        }

        private Request(Parcel parcel) {
            boolean z = false;
            this.f8097f = false;
            String readString = parcel.readString();
            C2606a aVar = null;
            this.f8092a = readString != null ? C2609d.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f8093b = new HashSet(arrayList);
            String readString2 = parcel.readString();
            if (readString2 != null) {
                aVar = C2606a.valueOf(readString2);
            }
            this.f8094c = aVar;
            this.f8095d = parcel.readString();
            this.f8096e = parcel.readString();
            if (parcel.readByte() != 0) {
                z = true;
            }
            this.f8097f = z;
            this.f8098g = parcel.readString();
            this.f8099h = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            String str = null;
            parcel.writeString(this.f8092a != null ? this.f8092a.name() : null);
            parcel.writeStringList(new ArrayList(this.f8093b));
            if (this.f8094c != null) {
                str = this.f8094c.name();
            }
            parcel.writeString(str);
            parcel.writeString(this.f8095d);
            parcel.writeString(this.f8096e);
            parcel.writeByte(this.f8097f ? (byte) 1 : 0);
            parcel.writeString(this.f8098g);
            parcel.writeString(this.f8099h);
        }
    }

    public static class Result implements Parcelable {
        public static final Creator<Result> CREATOR = new Creator<Result>() {
            /* renamed from: a */
            public Result createFromParcel(Parcel parcel) {
                return new Result(parcel);
            }

            /* renamed from: a */
            public Result[] newArray(int i) {
                return new Result[i];
            }
        };

        /* renamed from: a */
        final C2600a f8100a;

        /* renamed from: b */
        final AccessToken f8101b;

        /* renamed from: c */
        final String f8102c;

        /* renamed from: d */
        final String f8103d;

        /* renamed from: e */
        final Request f8104e;

        /* renamed from: f */
        public Map<String, String> f8105f;

        /* renamed from: com.facebook.login.LoginClient$Result$a */
        enum C2600a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            

            /* renamed from: d */
            private final String f8110d;

            private C2600a(String str) {
                this.f8110d = str;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public String mo9202a() {
                return this.f8110d;
            }
        }

        public int describeContents() {
            return 0;
        }

        Result(Request request, C2600a aVar, AccessToken accessToken, String str, String str2) {
            C2484ae.m9489a((Object) aVar, "code");
            this.f8104e = request;
            this.f8101b = accessToken;
            this.f8102c = str;
            this.f8100a = aVar;
            this.f8103d = str2;
        }

        /* renamed from: a */
        static Result m9927a(Request request, AccessToken accessToken) {
            Result result = new Result(request, C2600a.SUCCESS, accessToken, null, null);
            return result;
        }

        /* renamed from: a */
        static Result m9928a(Request request, String str) {
            Result result = new Result(request, C2600a.CANCEL, null, str, null);
            return result;
        }

        /* renamed from: a */
        static Result m9929a(Request request, String str, String str2) {
            return m9930a(request, str, str2, null);
        }

        /* renamed from: a */
        static Result m9930a(Request request, String str, String str2, String str3) {
            Request request2 = request;
            Result result = new Result(request2, C2600a.ERROR, null, TextUtils.join(": ", C2479ad.m9460b((T[]) new String[]{str, str2})), str3);
            return result;
        }

        private Result(Parcel parcel) {
            this.f8100a = C2600a.valueOf(parcel.readString());
            this.f8101b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f8102c = parcel.readString();
            this.f8103d = parcel.readString();
            this.f8104e = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f8105f = C2479ad.m9439a(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f8100a.name());
            parcel.writeParcelable(this.f8101b, i);
            parcel.writeString(this.f8102c);
            parcel.writeString(this.f8103d);
            parcel.writeParcelable(this.f8104e, i);
            C2479ad.m9443a(parcel, this.f8105f);
        }
    }

    /* renamed from: com.facebook.login.LoginClient$a */
    interface C2601a {
        /* renamed from: a */
        void mo9203a();

        /* renamed from: b */
        void mo9204b();
    }

    /* renamed from: com.facebook.login.LoginClient$b */
    public interface C2602b {
        /* renamed from: a */
        void mo9205a(Result result);
    }

    public int describeContents() {
        return 0;
    }

    public LoginClient(Fragment fragment) {
        this.f8085c = fragment;
    }

    /* renamed from: a */
    public Fragment mo9151a() {
        return this.f8085c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9152a(Fragment fragment) {
        if (this.f8085c != null) {
            throw new C2579j("Can't set fragment once it is already set.");
        }
        this.f8085c = fragment;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public FragmentActivity mo9158b() {
        return this.f8085c.mo626m();
    }

    /* renamed from: c */
    public Request mo9161c() {
        return this.f8089g;
    }

    /* renamed from: d */
    public static int m9884d() {
        return C2514b.Login.mo8989a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9153a(Request request) {
        if (!mo9165e()) {
            mo9159b(request);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9159b(Request request) {
        if (request != null) {
            if (this.f8089g != null) {
                throw new C2579j("Attempted to authorize while a request is pending.");
            } else if (!AccessToken.m6168b() || mo9168h()) {
                this.f8089g = request;
                this.f8083a = mo9163c(request);
                mo9169i();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo9165e() {
        return this.f8089g != null && this.f8084b >= 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo9166f() {
        if (this.f8084b >= 0) {
            mo9167g().mo9137b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public LoginMethodHandler mo9167g() {
        if (this.f8084b >= 0) {
            return this.f8083a[this.f8084b];
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo9157a(int i, int i2, Intent intent) {
        if (this.f8089g != null) {
            return mo9167g().mo9093a(i, i2, intent);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public LoginMethodHandler[] mo9163c(Request request) {
        ArrayList arrayList = new ArrayList();
        C2609d b = request.mo9182b();
        if (b.mo9228a()) {
            arrayList.add(new GetTokenLoginMethodHandler(this));
        }
        if (b.mo9229b()) {
            arrayList.add(new KatanaProxyLoginMethodHandler(this));
        }
        if (b.mo9233f()) {
            arrayList.add(new FacebookLiteLoginMethodHandler(this));
        }
        if (b.mo9232e()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (b.mo9230c()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (b.mo9231d()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
        arrayList.toArray(loginMethodHandlerArr);
        return loginMethodHandlerArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo9168h() {
        if (this.f8088f) {
            return true;
        }
        if (mo9150a("android.permission.INTERNET") != 0) {
            FragmentActivity b = mo9158b();
            mo9160b(Result.m9929a(this.f8089g, b.getString(C2460f.com_facebook_internet_permission_error_title), b.getString(C2460f.com_facebook_internet_permission_error_message)));
            return false;
        }
        this.f8088f = true;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo9169i() {
        if (this.f8084b >= 0) {
            m9882a(mo9167g().mo9091a(), "skipped", null, null, mo9167g().f8111a);
        }
        while (this.f8083a != null && this.f8084b < this.f8083a.length - 1) {
            this.f8084b++;
            if (mo9170j()) {
                return;
            }
        }
        if (this.f8089g != null) {
            m9887n();
        }
    }

    /* renamed from: n */
    private void m9887n() {
        mo9160b(Result.m9929a(this.f8089g, "Login attempt failed.", null));
    }

    /* renamed from: a */
    private void m9883a(String str, String str2, boolean z) {
        if (this.f8090h == null) {
            this.f8090h = new HashMap();
        }
        if (this.f8090h.containsKey(str) && z) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.f8090h.get(str));
            sb.append(",");
            sb.append(str2);
            str2 = sb.toString();
        }
        this.f8090h.put(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo9170j() {
        LoginMethodHandler g = mo9167g();
        if (!g.mo9210d() || mo9168h()) {
            boolean a = g.mo9094a(this.f8089g);
            if (a) {
                m9888o().mo9237a(this.f8089g.mo9186e(), g.mo9091a());
            } else {
                m9888o().mo9241b(this.f8089g.mo9186e(), g.mo9091a());
                m9883a("not_tried", g.mo9091a(), true);
            }
            return a;
        }
        m9883a("no_internet_permission", "1", false);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9154a(Result result) {
        if (result.f8101b == null || !AccessToken.m6168b()) {
            mo9160b(result);
        } else {
            mo9162c(result);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9160b(Result result) {
        LoginMethodHandler g = mo9167g();
        if (g != null) {
            m9881a(g.mo9091a(), result, g.f8111a);
        }
        if (this.f8090h != null) {
            result.f8105f = this.f8090h;
        }
        this.f8083a = null;
        this.f8084b = -1;
        this.f8089g = null;
        this.f8090h = null;
        m9885d(result);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9156a(C2602b bVar) {
        this.f8086d = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9155a(C2601a aVar) {
        this.f8087e = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo9150a(String str) {
        return mo9158b().checkCallingOrSelfPermission(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo9162c(Result result) {
        Result result2;
        if (result.f8101b == null) {
            throw new C2579j("Can't validate without a token");
        }
        AccessToken a = AccessToken.m6161a();
        AccessToken accessToken = result.f8101b;
        if (!(a == null || accessToken == null)) {
            try {
                if (a.mo6624k().equals(accessToken.mo6624k())) {
                    result2 = Result.m9927a(this.f8089g, result.f8101b);
                    mo9160b(result2);
                }
            } catch (Exception e) {
                mo9160b(Result.m9929a(this.f8089g, "Caught exception", e.getMessage()));
                return;
            }
        }
        result2 = Result.m9929a(this.f8089g, "User logged in as different Facebook user.", null);
        mo9160b(result2);
    }

    /* renamed from: o */
    private C2613f m9888o() {
        if (this.f8091i == null || !this.f8091i.mo9235a().equals(this.f8089g.mo9184d())) {
            this.f8091i = new C2613f(mo9158b(), this.f8089g.mo9184d());
        }
        return this.f8091i;
    }

    /* renamed from: d */
    private void m9885d(Result result) {
        if (this.f8086d != null) {
            this.f8086d.mo9205a(result);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo9171k() {
        if (this.f8087e != null) {
            this.f8087e.mo9203a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo9172l() {
        if (this.f8087e != null) {
            this.f8087e.mo9204b();
        }
    }

    /* renamed from: a */
    private void m9881a(String str, Result result, Map<String, String> map) {
        m9882a(str, result.f8100a.mo9202a(), result.f8102c, result.f8103d, map);
    }

    /* renamed from: a */
    private void m9882a(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.f8089g == null) {
            m9888o().mo9238a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            m9888o().mo9239a(this.f8089g.mo9186e(), str, str2, str3, str4, map);
        }
    }

    /* renamed from: m */
    static String m9886m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public LoginClient(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.f8083a = new LoginMethodHandler[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            this.f8083a[i] = (LoginMethodHandler) readParcelableArray[i];
            this.f8083a[i].mo9207a(this);
        }
        this.f8084b = parcel.readInt();
        this.f8089g = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.f8090h = C2479ad.m9439a(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.f8083a, i);
        parcel.writeInt(this.f8084b);
        parcel.writeParcelable(this.f8089g, i);
        C2479ad.m9443a(parcel, this.f8090h);
    }
}

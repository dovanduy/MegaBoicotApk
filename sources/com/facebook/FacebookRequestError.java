package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.appnext.base.p046b.C1245d;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2520h;
import com.facebook.internal.C2527k;
import com.facebook.internal.C2529l;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError implements Parcelable {
    public static final Creator<FacebookRequestError> CREATOR = new Creator<FacebookRequestError>() {
        /* renamed from: a */
        public FacebookRequestError createFromParcel(Parcel parcel) {
            return new FacebookRequestError(parcel);
        }

        /* renamed from: a */
        public FacebookRequestError[] newArray(int i) {
            return new FacebookRequestError[i];
        }
    };

    /* renamed from: a */
    static final C1496b f4521a = new C1496b(200, 299);

    /* renamed from: b */
    private final C1495a f4522b;

    /* renamed from: c */
    private final int f4523c;

    /* renamed from: d */
    private final int f4524d;

    /* renamed from: e */
    private final int f4525e;

    /* renamed from: f */
    private final String f4526f;

    /* renamed from: g */
    private final String f4527g;

    /* renamed from: h */
    private final String f4528h;

    /* renamed from: i */
    private final String f4529i;

    /* renamed from: j */
    private final String f4530j;

    /* renamed from: k */
    private final JSONObject f4531k;

    /* renamed from: l */
    private final JSONObject f4532l;

    /* renamed from: m */
    private final Object f4533m;

    /* renamed from: n */
    private final HttpURLConnection f4534n;

    /* renamed from: o */
    private final C2579j f4535o;

    /* renamed from: com.facebook.FacebookRequestError$a */
    public enum C1495a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* renamed from: com.facebook.FacebookRequestError$b */
    private static class C1496b {

        /* renamed from: a */
        private final int f4540a;

        /* renamed from: b */
        private final int f4541b;

        private C1496b(int i, int i2) {
            this.f4540a = i;
            this.f4541b = i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo6670a(int i) {
            return this.f4540a <= i && i <= this.f4541b;
        }
    }

    public int describeContents() {
        return 0;
    }

    private FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, C2579j jVar) {
        boolean z2;
        C1495a aVar;
        this.f4523c = i;
        this.f4524d = i2;
        this.f4525e = i3;
        this.f4526f = str;
        this.f4527g = str2;
        this.f4532l = jSONObject;
        this.f4531k = jSONObject2;
        this.f4533m = obj;
        this.f4534n = httpURLConnection;
        this.f4528h = str3;
        this.f4529i = str4;
        if (jVar != null) {
            this.f4535o = jVar;
            z2 = true;
        } else {
            this.f4535o = new C2656o(this, str2);
            z2 = false;
        }
        C2520h h = m6194h();
        if (z2) {
            aVar = C1495a.OTHER;
        } else {
            aVar = h.mo8992a(i2, i3, z);
        }
        this.f4522b = aVar;
        this.f4530j = h.mo8993a(this.f4522b);
    }

    FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        Exception exc2 = exc;
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpURLConnection, exc2 instanceof C2579j ? (C2579j) exc2 : new C2579j((Throwable) exc2));
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, false, null, null, null, null, null);
    }

    /* renamed from: a */
    public int mo6656a() {
        return this.f4523c;
    }

    /* renamed from: b */
    public int mo6657b() {
        return this.f4524d;
    }

    /* renamed from: c */
    public int mo6658c() {
        return this.f4525e;
    }

    /* renamed from: d */
    public String mo6659d() {
        return this.f4526f;
    }

    /* renamed from: e */
    public String mo6661e() {
        if (this.f4527g != null) {
            return this.f4527g;
        }
        return this.f4535o.getLocalizedMessage();
    }

    /* renamed from: f */
    public JSONObject mo6662f() {
        return this.f4531k;
    }

    /* renamed from: g */
    public C2579j mo6663g() {
        return this.f4535o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{HttpStatus: ");
        sb.append(this.f4523c);
        sb.append(", errorCode: ");
        sb.append(this.f4524d);
        sb.append(", subErrorCode: ");
        sb.append(this.f4525e);
        sb.append(", errorType: ");
        sb.append(this.f4526f);
        sb.append(", errorMessage: ");
        sb.append(mo6661e());
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    static FacebookRequestError m6193a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        int i;
        JSONObject jSONObject2 = jSONObject;
        try {
            if (jSONObject2.has("code")) {
                int i2 = jSONObject2.getInt("code");
                Object a = C2479ad.m9424a(jSONObject2, TtmlNode.TAG_BODY, "FACEBOOK_NON_JSON_RESULT");
                if (a != null && (a instanceof JSONObject)) {
                    JSONObject jSONObject3 = (JSONObject) a;
                    boolean z2 = true;
                    int i3 = -1;
                    if (jSONObject3.has("error")) {
                        JSONObject jSONObject4 = (JSONObject) C2479ad.m9424a(jSONObject3, "error", (String) null);
                        str4 = jSONObject4.optString(C1245d.f3961jd, null);
                        str3 = jSONObject4.optString("message", null);
                        int optInt = jSONObject4.optInt("code", -1);
                        int optInt2 = jSONObject4.optInt("error_subcode", -1);
                        String optString = jSONObject4.optString("error_user_msg", null);
                        str = jSONObject4.optString("error_user_title", null);
                        i = optInt2;
                        i3 = optInt;
                        str2 = optString;
                        z = jSONObject4.optBoolean("is_transient", false);
                    } else {
                        if (!jSONObject3.has("error_code") && !jSONObject3.has("error_msg")) {
                            if (!jSONObject3.has("error_reason")) {
                                z2 = false;
                                z = false;
                                i = -1;
                                str4 = null;
                                str3 = null;
                                str2 = null;
                                str = null;
                            }
                        }
                        String optString2 = jSONObject3.optString("error_reason", null);
                        String optString3 = jSONObject3.optString("error_msg", null);
                        int optInt3 = jSONObject3.optInt("error_code", -1);
                        z = false;
                        i = jSONObject3.optInt("error_subcode", -1);
                        i3 = optInt3;
                        str2 = null;
                        str = null;
                        str3 = optString3;
                        str4 = optString2;
                    }
                    if (z2) {
                        FacebookRequestError facebookRequestError = new FacebookRequestError(i2, i3, i, str4, str3, str, str2, z, jSONObject3, jSONObject2, obj, httpURLConnection, null);
                        return facebookRequestError;
                    }
                }
                if (!f4521a.mo6670a(i2)) {
                    FacebookRequestError facebookRequestError2 = new FacebookRequestError(i2, -1, -1, null, null, null, null, false, jSONObject2.has(TtmlNode.TAG_BODY) ? (JSONObject) C2479ad.m9424a(jSONObject2, TtmlNode.TAG_BODY, "FACEBOOK_NON_JSON_RESULT") : null, jSONObject2, obj, httpURLConnection, null);
                    return facebookRequestError2;
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* renamed from: h */
    static synchronized C2520h m6194h() {
        synchronized (FacebookRequestError.class) {
            C2527k a = C2529l.m9632a(C2649m.m10137j());
            if (a == null) {
                C2520h a2 = C2520h.m9605a();
                return a2;
            }
            C2520h h = a.mo9002h();
            return h;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4523c);
        parcel.writeInt(this.f4524d);
        parcel.writeInt(this.f4525e);
        parcel.writeString(this.f4526f);
        parcel.writeString(this.f4527g);
        parcel.writeString(this.f4528h);
        parcel.writeString(this.f4529i);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, null, null, null, null, null);
    }
}

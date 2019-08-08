package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2484ae;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AccessToken implements Parcelable {
    public static final Creator<AccessToken> CREATOR = new Creator() {
        /* renamed from: a */
        public AccessToken createFromParcel(Parcel parcel) {
            return new AccessToken(parcel);
        }

        /* renamed from: a */
        public AccessToken[] newArray(int i) {
            return new AccessToken[i];
        }
    };

    /* renamed from: a */
    private static final Date f4493a = new Date(Long.MAX_VALUE);

    /* renamed from: b */
    private static final Date f4494b = f4493a;

    /* renamed from: c */
    private static final Date f4495c = new Date();

    /* renamed from: d */
    private static final C2453c f4496d = C2453c.FACEBOOK_APPLICATION_WEB;

    /* renamed from: e */
    private final Date f4497e;

    /* renamed from: f */
    private final Set<String> f4498f;

    /* renamed from: g */
    private final Set<String> f4499g;

    /* renamed from: h */
    private final String f4500h;

    /* renamed from: i */
    private final C2453c f4501i;

    /* renamed from: j */
    private final Date f4502j;

    /* renamed from: k */
    private final String f4503k;

    /* renamed from: l */
    private final String f4504l;

    /* renamed from: com.facebook.AccessToken$a */
    public interface C1491a {
        /* renamed from: a */
        void mo6633a(AccessToken accessToken);

        /* renamed from: a */
        void mo6634a(C2579j jVar);
    }

    public int describeContents() {
        return 0;
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, C2453c cVar, Date date, Date date2) {
        C2484ae.m9490a(str, "accessToken");
        C2484ae.m9490a(str2, "applicationId");
        C2484ae.m9490a(str3, "userId");
        if (date == null) {
            date = f4494b;
        }
        this.f4497e = date;
        this.f4498f = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        this.f4499g = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        this.f4500h = str;
        if (cVar == null) {
            cVar = f4496d;
        }
        this.f4501i = cVar;
        if (date2 == null) {
            date2 = f4495c;
        }
        this.f4502j = date2;
        this.f4503k = str2;
        this.f4504l = str3;
    }

    /* renamed from: a */
    public static AccessToken m6161a() {
        return C2447b.m9350a().mo8871b();
    }

    /* renamed from: b */
    public static boolean m6168b() {
        AccessToken b = C2447b.m9350a().mo8871b();
        return b != null && !b.mo6625l();
    }

    /* renamed from: c */
    static void m6169c() {
        AccessToken b = C2447b.m9350a().mo8871b();
        if (b != null) {
            m6165a(m6167b(b));
        }
    }

    /* renamed from: a */
    public static void m6165a(AccessToken accessToken) {
        C2447b.m9350a().mo8870a(accessToken);
    }

    /* renamed from: d */
    public String mo6614d() {
        return this.f4500h;
    }

    /* renamed from: e */
    public Date mo6616e() {
        return this.f4497e;
    }

    /* renamed from: f */
    public Set<String> mo6618f() {
        return this.f4498f;
    }

    /* renamed from: g */
    public Set<String> mo6619g() {
        return this.f4499g;
    }

    /* renamed from: h */
    public C2453c mo6620h() {
        return this.f4501i;
    }

    /* renamed from: i */
    public Date mo6622i() {
        return this.f4502j;
    }

    /* renamed from: j */
    public String mo6623j() {
        return this.f4503k;
    }

    /* renamed from: k */
    public String mo6624k() {
        return this.f4504l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(m6170n());
        m6166a(sb);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (!this.f4497e.equals(accessToken.f4497e) || !this.f4498f.equals(accessToken.f4498f) || !this.f4499g.equals(accessToken.f4499g) || !this.f4500h.equals(accessToken.f4500h) || this.f4501i != accessToken.f4501i || !this.f4502j.equals(accessToken.f4502j) || (this.f4503k != null ? !this.f4503k.equals(accessToken.f4503k) : accessToken.f4503k != null) || !this.f4504l.equals(accessToken.f4504l)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f4497e.hashCode()) * 31) + this.f4498f.hashCode()) * 31) + this.f4499g.hashCode()) * 31) + this.f4500h.hashCode()) * 31) + this.f4501i.hashCode()) * 31) + this.f4502j.hashCode()) * 31) + (this.f4503k == null ? 0 : this.f4503k.hashCode())) * 31) + this.f4504l.hashCode();
    }

    /* renamed from: b */
    static AccessToken m6167b(AccessToken accessToken) {
        AccessToken accessToken2 = new AccessToken(accessToken.f4500h, accessToken.f4503k, accessToken.mo6624k(), accessToken.mo6618f(), accessToken.mo6619g(), accessToken.f4501i, new Date(), new Date());
        return accessToken2;
    }

    /* renamed from: a */
    static AccessToken m6162a(Bundle bundle) {
        List a = m6164a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List a2 = m6164a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        String d = C2756t.m10501d(bundle);
        if (C2479ad.m9456a(d)) {
            d = C2649m.m10137j();
        }
        String str = d;
        String b = C2756t.m10499b(bundle);
        try {
            AccessToken accessToken = new AccessToken(b, str, C2479ad.m9472d(b).getString(TtmlNode.ATTR_ID), a, a2, C2756t.m10500c(bundle), C2756t.m10496a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), C2756t.m10496a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
            return accessToken;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static List<String> m6164a(Bundle bundle, String str) {
        ArrayList stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(stringArrayList));
    }

    /* renamed from: l */
    public boolean mo6625l() {
        return new Date().after(this.f4497e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public JSONObject mo6626m() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f4500h);
        jSONObject.put("expires_at", this.f4497e.getTime());
        jSONObject.put("permissions", new JSONArray(this.f4498f));
        jSONObject.put("declined_permissions", new JSONArray(this.f4499g));
        jSONObject.put("last_refresh", this.f4502j.getTime());
        jSONObject.put("source", this.f4501i.name());
        jSONObject.put("application_id", this.f4503k);
        jSONObject.put("user_id", this.f4504l);
        return jSONObject;
    }

    /* renamed from: a */
    static AccessToken m6163a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getInt("version") > 1) {
            throw new C2579j("Unknown AccessToken serialization format.");
        }
        String string = jSONObject.getString("token");
        Date date = new Date(jSONObject.getLong("expires_at"));
        JSONArray jSONArray = jSONObject.getJSONArray("permissions");
        JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
        Date date2 = new Date(jSONObject.getLong("last_refresh"));
        AccessToken accessToken = new AccessToken(string, jSONObject.getString("application_id"), jSONObject.getString("user_id"), C2479ad.m9437a(jSONArray), C2479ad.m9437a(jSONArray2), C2453c.valueOf(jSONObject.getString("source")), date, date2);
        return accessToken;
    }

    /* renamed from: n */
    private String m6170n() {
        if (this.f4500h == null) {
            return "null";
        }
        return C2649m.m10125a(C2757u.f8554b) ? this.f4500h : "ACCESS_TOKEN_REMOVED";
    }

    /* renamed from: a */
    private void m6166a(StringBuilder sb) {
        sb.append(" permissions:");
        if (this.f4498f == null) {
            sb.append("null");
            return;
        }
        sb.append("[");
        sb.append(TextUtils.join(", ", this.f4498f));
        sb.append("]");
    }

    AccessToken(Parcel parcel) {
        this.f4497e = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f4498f = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f4499g = Collections.unmodifiableSet(new HashSet(arrayList));
        this.f4500h = parcel.readString();
        this.f4501i = C2453c.valueOf(parcel.readString());
        this.f4502j = new Date(parcel.readLong());
        this.f4503k = parcel.readString();
        this.f4504l = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f4497e.getTime());
        parcel.writeStringList(new ArrayList(this.f4498f));
        parcel.writeStringList(new ArrayList(this.f4499g));
        parcel.writeString(this.f4500h);
        parcel.writeString(this.f4501i.name());
        parcel.writeLong(this.f4502j.getTime());
        parcel.writeString(this.f4503k);
        parcel.writeString(this.f4504l);
    }
}

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.common.util.C3553e;
import com.google.android.gms.common.util.C3556h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<GoogleSignInAccount> CREATOR = new C3204f();

    /* renamed from: a */
    private static C3553e f9343a = C3556h.m12745d();

    /* renamed from: b */
    private final int f9344b;

    /* renamed from: c */
    private String f9345c;

    /* renamed from: d */
    private String f9346d;

    /* renamed from: e */
    private String f9347e;

    /* renamed from: f */
    private String f9348f;

    /* renamed from: g */
    private Uri f9349g;

    /* renamed from: h */
    private String f9350h;

    /* renamed from: i */
    private long f9351i;

    /* renamed from: j */
    private String f9352j;

    /* renamed from: k */
    private List<Scope> f9353k;

    /* renamed from: l */
    private String f9354l;

    /* renamed from: m */
    private String f9355m;

    /* renamed from: n */
    private Set<Scope> f9356n = new HashSet();

    /* renamed from: a */
    public static GoogleSignInAccount m11457a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount a = m11458a(jSONObject.optString(TtmlNode.ATTR_ID), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a.f9350h = jSONObject.optString("serverAuthCode", null);
        return a;
    }

    /* renamed from: a */
    private static GoogleSignInAccount m11458a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, (l == null ? Long.valueOf(f9343a.mo13694a() / 1000) : l).longValue(), C3513t.m12627a(str7), new ArrayList((Collection) C3513t.m12625a(set)), str5, str6);
        return googleSignInAccount;
    }

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f9344b = i;
        this.f9345c = str;
        this.f9346d = str2;
        this.f9347e = str3;
        this.f9348f = str4;
        this.f9349g = uri;
        this.f9350h = str5;
        this.f9351i = j;
        this.f9352j = str6;
        this.f9353k = list;
        this.f9354l = str7;
        this.f9355m = str8;
    }

    /* renamed from: a */
    public String mo12947a() {
        return this.f9345c;
    }

    /* renamed from: b */
    public String mo12948b() {
        return this.f9346d;
    }

    /* renamed from: c */
    public String mo12949c() {
        return this.f9347e;
    }

    /* renamed from: d */
    public Account mo12950d() {
        if (this.f9347e == null) {
            return null;
        }
        return new Account(this.f9347e, "com.google");
    }

    /* renamed from: e */
    public String mo12951e() {
        return this.f9348f;
    }

    /* renamed from: f */
    public String mo12953f() {
        return this.f9354l;
    }

    /* renamed from: g */
    public String mo12954g() {
        return this.f9355m;
    }

    /* renamed from: h */
    public Uri mo12955h() {
        return this.f9349g;
    }

    /* renamed from: i */
    public String mo12957i() {
        return this.f9350h;
    }

    /* renamed from: j */
    public final String mo12958j() {
        return this.f9352j;
    }

    /* renamed from: k */
    public Set<Scope> mo12959k() {
        HashSet hashSet = new HashSet(this.f9353k);
        hashSet.addAll(this.f9356n);
        return hashSet;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9344b);
        C3511b.m12609a(parcel, 2, mo12947a(), false);
        C3511b.m12609a(parcel, 3, mo12948b(), false);
        C3511b.m12609a(parcel, 4, mo12949c(), false);
        C3511b.m12609a(parcel, 5, mo12951e(), false);
        C3511b.m12604a(parcel, 6, (Parcelable) mo12955h(), i, false);
        C3511b.m12609a(parcel, 7, mo12957i(), false);
        C3511b.m12600a(parcel, 8, this.f9351i);
        C3511b.m12609a(parcel, 9, this.f9352j, false);
        C3511b.m12621c(parcel, 10, this.f9353k, false);
        C3511b.m12609a(parcel, 11, mo12953f(), false);
        C3511b.m12609a(parcel, 12, mo12954g(), false);
        C3511b.m12596a(parcel, a);
    }

    public int hashCode() {
        return ((527 + this.f9352j.hashCode()) * 31) + mo12959k().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f9352j.equals(this.f9352j) && googleSignInAccount.mo12959k().equals(mo12959k());
    }

    /* renamed from: l */
    public final String mo12960l() {
        JSONObject m = m11459m();
        m.remove("serverAuthCode");
        return m.toString();
    }

    /* renamed from: m */
    private final JSONObject m11459m() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (mo12947a() != null) {
                jSONObject.put(TtmlNode.ATTR_ID, mo12947a());
            }
            if (mo12948b() != null) {
                jSONObject.put("tokenId", mo12948b());
            }
            if (mo12949c() != null) {
                jSONObject.put("email", mo12949c());
            }
            if (mo12951e() != null) {
                jSONObject.put("displayName", mo12951e());
            }
            if (mo12953f() != null) {
                jSONObject.put("givenName", mo12953f());
            }
            if (mo12954g() != null) {
                jSONObject.put("familyName", mo12954g());
            }
            if (mo12955h() != null) {
                jSONObject.put("photoUrl", mo12955h().toString());
            }
            if (mo12957i() != null) {
                jSONObject.put("serverAuthCode", mo12957i());
            }
            jSONObject.put("expirationTime", this.f9351i);
            jSONObject.put("obfuscatedIdentifier", this.f9352j);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.f9353k.toArray(new Scope[this.f9353k.size()]);
            Arrays.sort(scopeArr, C3203e.f9395a);
            for (Scope a : scopeArr) {
                jSONArray.put(a.mo13073a());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.C3209a;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.C3244a.C3248d.C3253e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends AbstractSafeParcelable implements C3253e, ReflectedParcelable {
    public static final Creator<GoogleSignInOptions> CREATOR = new C3206h();

    /* renamed from: a */
    public static final Scope f9357a = new Scope("profile");

    /* renamed from: b */
    public static final Scope f9358b = new Scope("email");

    /* renamed from: c */
    public static final Scope f9359c = new Scope("openid");

    /* renamed from: d */
    public static final Scope f9360d = new Scope("https://www.googleapis.com/auth/games_lite");

    /* renamed from: e */
    public static final Scope f9361e = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: f */
    public static final GoogleSignInOptions f9362f = new C3196a().mo12973a().mo12975b().mo12976c();

    /* renamed from: g */
    public static final GoogleSignInOptions f9363g = new C3196a().mo12974a(f9360d, new Scope[0]).mo12976c();

    /* renamed from: r */
    private static Comparator<Scope> f9364r = new C3205g();

    /* renamed from: h */
    private final int f9365h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ArrayList<Scope> f9366i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Account f9367j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f9368k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final boolean f9369l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final boolean f9370m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f9371n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f9372o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> f9373p;

    /* renamed from: q */
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> f9374q;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C3196a {

        /* renamed from: a */
        private Set<Scope> f9375a = new HashSet();

        /* renamed from: b */
        private boolean f9376b;

        /* renamed from: c */
        private boolean f9377c;

        /* renamed from: d */
        private boolean f9378d;

        /* renamed from: e */
        private String f9379e;

        /* renamed from: f */
        private Account f9380f;

        /* renamed from: g */
        private String f9381g;

        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f9382h = new HashMap();

        public C3196a() {
        }

        public C3196a(GoogleSignInOptions googleSignInOptions) {
            C3513t.m12625a(googleSignInOptions);
            this.f9375a = new HashSet(googleSignInOptions.f9366i);
            this.f9376b = googleSignInOptions.f9369l;
            this.f9377c = googleSignInOptions.f9370m;
            this.f9378d = googleSignInOptions.f9368k;
            this.f9379e = googleSignInOptions.f9371n;
            this.f9380f = googleSignInOptions.f9367j;
            this.f9381g = googleSignInOptions.f9372o;
            this.f9382h = GoogleSignInOptions.m11475b((List<GoogleSignInOptionsExtensionParcelable>) googleSignInOptions.f9373p);
        }

        /* renamed from: a */
        public final C3196a mo12973a() {
            this.f9375a.add(GoogleSignInOptions.f9359c);
            return this;
        }

        /* renamed from: b */
        public final C3196a mo12975b() {
            this.f9375a.add(GoogleSignInOptions.f9357a);
            return this;
        }

        /* renamed from: a */
        public final C3196a mo12974a(Scope scope, Scope... scopeArr) {
            this.f9375a.add(scope);
            this.f9375a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: c */
        public final GoogleSignInOptions mo12976c() {
            if (this.f9375a.contains(GoogleSignInOptions.f9361e) && this.f9375a.contains(GoogleSignInOptions.f9360d)) {
                this.f9375a.remove(GoogleSignInOptions.f9360d);
            }
            if (this.f9378d && (this.f9380f == null || !this.f9375a.isEmpty())) {
                mo12973a();
            }
            GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList(this.f9375a), this.f9380f, this.f9378d, this.f9376b, this.f9377c, this.f9379e, this.f9381g, this.f9382h, null);
            return googleSignInOptions;
        }
    }

    /* renamed from: a */
    public static GoogleSignInOptions m11472a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.optString("accountName", null);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList<>(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), (Map<Integer, GoogleSignInOptionsExtensionParcelable>) new HashMap<Integer,GoogleSignInOptionsExtensionParcelable>());
        return googleSignInOptions;
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2) {
        this(i, arrayList, account, z, z2, z3, str, str2, m11475b((List<GoogleSignInOptionsExtensionParcelable>) arrayList2));
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map) {
        this.f9365h = i;
        this.f9366i = arrayList;
        this.f9367j = account;
        this.f9368k = z;
        this.f9369l = z2;
        this.f9370m = z3;
        this.f9371n = str;
        this.f9372o = str2;
        this.f9373p = new ArrayList<>(map.values());
        this.f9374q = map;
    }

    /* renamed from: a */
    public ArrayList<Scope> mo12962a() {
        return new ArrayList<>(this.f9366i);
    }

    /* renamed from: b */
    public Account mo12963b() {
        return this.f9367j;
    }

    /* renamed from: c */
    public boolean mo12964c() {
        return this.f9368k;
    }

    /* renamed from: d */
    public boolean mo12965d() {
        return this.f9369l;
    }

    /* renamed from: e */
    public boolean mo12966e() {
        return this.f9370m;
    }

    /* renamed from: f */
    public String mo12968f() {
        return this.f9371n;
    }

    /* renamed from: g */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> mo12969g() {
        return this.f9373p;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> m11475b(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.mo12991a()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9365h);
        C3511b.m12621c(parcel, 2, mo12962a(), false);
        C3511b.m12604a(parcel, 3, (Parcelable) mo12963b(), i, false);
        C3511b.m12612a(parcel, 4, mo12964c());
        C3511b.m12612a(parcel, 5, mo12965d());
        C3511b.m12612a(parcel, 6, mo12966e());
        C3511b.m12609a(parcel, 7, mo12968f(), false);
        C3511b.m12609a(parcel, 8, this.f9372o, false);
        C3511b.m12621c(parcel, 9, mo12969g(), false);
        C3511b.m12596a(parcel, a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r3.f9367j.equals(r4.mo12963b()) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r3.f9371n.equals(r4.mo12968f()) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0088 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f9373p     // Catch:{ ClassCastException -> 0x0088 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 > 0) goto L_0x0087
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f9373p     // Catch:{ ClassCastException -> 0x0088 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0087
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f9366i     // Catch:{ ClassCastException -> 0x0088 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0088 }
            java.util.ArrayList r2 = r4.mo12962a()     // Catch:{ ClassCastException -> 0x0088 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 != r2) goto L_0x0086
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f9366i     // Catch:{ ClassCastException -> 0x0088 }
            java.util.ArrayList r2 = r4.mo12962a()     // Catch:{ ClassCastException -> 0x0088 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0086
        L_0x0035:
            android.accounts.Account r1 = r3.f9367j     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo12963b()     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 != 0) goto L_0x0085
            goto L_0x004c
        L_0x0040:
            android.accounts.Account r1 = r3.f9367j     // Catch:{ ClassCastException -> 0x0088 }
            android.accounts.Account r2 = r4.mo12963b()     // Catch:{ ClassCastException -> 0x0088 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 == 0) goto L_0x0085
        L_0x004c:
            java.lang.String r1 = r3.f9371n     // Catch:{ ClassCastException -> 0x0088 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r4.mo12968f()     // Catch:{ ClassCastException -> 0x0088 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 == 0) goto L_0x0085
            goto L_0x006b
        L_0x005f:
            java.lang.String r1 = r3.f9371n     // Catch:{ ClassCastException -> 0x0088 }
            java.lang.String r2 = r4.mo12968f()     // Catch:{ ClassCastException -> 0x0088 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 == 0) goto L_0x0085
        L_0x006b:
            boolean r1 = r3.f9370m     // Catch:{ ClassCastException -> 0x0088 }
            boolean r2 = r4.mo12966e()     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 != r2) goto L_0x0085
            boolean r1 = r3.f9368k     // Catch:{ ClassCastException -> 0x0088 }
            boolean r2 = r4.mo12964c()     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 != r2) goto L_0x0085
            boolean r1 = r3.f9369l     // Catch:{ ClassCastException -> 0x0088 }
            boolean r4 = r4.mo12965d()     // Catch:{ ClassCastException -> 0x0088 }
            if (r1 != r4) goto L_0x0085
            r4 = 1
            return r4
        L_0x0085:
            return r0
        L_0x0086:
            return r0
        L_0x0087:
            return r0
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f9366i;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Scope) obj).mo13073a());
        }
        Collections.sort(arrayList);
        return new C3209a().mo12999a((Object) arrayList).mo12999a((Object) this.f9367j).mo12999a((Object) this.f9371n).mo13000a(this.f9370m).mo13000a(this.f9368k).mo13000a(this.f9369l).mo12998a();
    }

    /* renamed from: h */
    public final String mo12970h() {
        return m11483i().toString();
    }

    /* renamed from: i */
    private final JSONObject m11483i() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f9366i, f9364r);
            ArrayList arrayList = this.f9366i;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((Scope) obj).mo13073a());
            }
            jSONObject.put("scopes", jSONArray);
            if (this.f9367j != null) {
                jSONObject.put("accountName", this.f9367j.name);
            }
            jSONObject.put("idTokenRequested", this.f9368k);
            jSONObject.put("forceCodeForRefreshToken", this.f9370m);
            jSONObject.put("serverAuthRequested", this.f9369l);
            if (!TextUtils.isEmpty(this.f9371n)) {
                jSONObject.put("serverClientId", this.f9371n);
            }
            if (!TextUtils.isEmpty(this.f9372o)) {
                jSONObject.put("hostedDomain", this.f9372o);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, C3205g gVar) {
        this(3, arrayList, account, z, z2, z3, str, str2, map);
    }
}

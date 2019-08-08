package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.k */
/* compiled from: FetchedAppSettings */
public final class C2527k {

    /* renamed from: a */
    private boolean f7914a;

    /* renamed from: b */
    private String f7915b;

    /* renamed from: c */
    private boolean f7916c;

    /* renamed from: d */
    private boolean f7917d;

    /* renamed from: e */
    private int f7918e;

    /* renamed from: f */
    private EnumSet<C2477ab> f7919f;

    /* renamed from: g */
    private Map<String, Map<String, C2528a>> f7920g;

    /* renamed from: h */
    private boolean f7921h;

    /* renamed from: i */
    private C2520h f7922i;

    /* renamed from: j */
    private String f7923j;

    /* renamed from: k */
    private String f7924k;

    /* renamed from: l */
    private boolean f7925l;

    /* renamed from: m */
    private boolean f7926m;

    /* renamed from: n */
    private String f7927n;

    /* renamed from: o */
    private JSONArray f7928o;

    /* renamed from: com.facebook.internal.k$a */
    /* compiled from: FetchedAppSettings */
    public static class C2528a {

        /* renamed from: a */
        private String f7929a;

        /* renamed from: b */
        private String f7930b;

        /* renamed from: c */
        private Uri f7931c;

        /* renamed from: d */
        private int[] f7932d;

        /* renamed from: a */
        public static C2528a m9628a(JSONObject jSONObject) {
            String optString = jSONObject.optString("name");
            Uri uri = null;
            if (C2479ad.m9456a(optString)) {
                return null;
            }
            String[] split = optString.split("\\|");
            if (split.length != 2) {
                return null;
            }
            String str = split[0];
            String str2 = split[1];
            if (C2479ad.m9456a(str) || C2479ad.m9456a(str2)) {
                return null;
            }
            String optString2 = jSONObject.optString("url");
            if (!C2479ad.m9456a(optString2)) {
                uri = Uri.parse(optString2);
            }
            return new C2528a(str, str2, uri, m9629a(jSONObject.optJSONArray("versions")));
        }

        /* renamed from: a */
        private static int[] m9629a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int optInt = jSONArray.optInt(i, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i);
                    if (!C2479ad.m9456a(optString)) {
                        try {
                            optInt = Integer.parseInt(optString);
                        } catch (NumberFormatException e) {
                            C2479ad.m9447a("FacebookSDK", (Exception) e);
                            optInt = -1;
                        }
                    }
                }
                iArr[i] = optInt;
            }
            return iArr;
        }

        private C2528a(String str, String str2, Uri uri, int[] iArr) {
            this.f7929a = str;
            this.f7930b = str2;
            this.f7931c = uri;
            this.f7932d = iArr;
        }

        /* renamed from: a */
        public String mo9007a() {
            return this.f7929a;
        }

        /* renamed from: b */
        public String mo9008b() {
            return this.f7930b;
        }
    }

    public C2527k(boolean z, String str, boolean z2, boolean z3, int i, EnumSet<C2477ab> enumSet, Map<String, Map<String, C2528a>> map, boolean z4, C2520h hVar, String str2, String str3, boolean z5, boolean z6, JSONArray jSONArray, String str4) {
        this.f7914a = z;
        this.f7915b = str;
        this.f7916c = z2;
        this.f7917d = z3;
        this.f7920g = map;
        this.f7922i = hVar;
        this.f7918e = i;
        this.f7921h = z4;
        this.f7919f = enumSet;
        this.f7923j = str2;
        this.f7924k = str3;
        this.f7925l = z5;
        this.f7926m = z6;
        this.f7928o = jSONArray;
        this.f7927n = str4;
    }

    /* renamed from: a */
    public boolean mo8995a() {
        return this.f7914a;
    }

    /* renamed from: b */
    public String mo8996b() {
        return this.f7915b;
    }

    /* renamed from: c */
    public boolean mo8997c() {
        return this.f7916c;
    }

    /* renamed from: d */
    public boolean mo8998d() {
        return this.f7917d;
    }

    /* renamed from: e */
    public int mo8999e() {
        return this.f7918e;
    }

    /* renamed from: f */
    public boolean mo9000f() {
        return this.f7921h;
    }

    /* renamed from: g */
    public EnumSet<C2477ab> mo9001g() {
        return this.f7919f;
    }

    /* renamed from: h */
    public C2520h mo9002h() {
        return this.f7922i;
    }

    /* renamed from: i */
    public boolean mo9003i() {
        return this.f7925l;
    }

    /* renamed from: j */
    public boolean mo9004j() {
        return this.f7926m;
    }

    /* renamed from: k */
    public JSONArray mo9005k() {
        return this.f7928o;
    }

    /* renamed from: l */
    public String mo9006l() {
        return this.f7927n;
    }
}

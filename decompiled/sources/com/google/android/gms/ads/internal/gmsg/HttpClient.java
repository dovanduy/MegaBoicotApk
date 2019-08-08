package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3907jl;
import com.google.android.gms.internal.ads.ayo;
import com.google.android.gms.internal.ads.zzang;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
@KeepName
@C3718cm
public class HttpClient implements C3067ae<ayo> {
    private final Context mContext;
    private final zzang zzyf;

    @C3718cm
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$a */
    static class C3058a {

        /* renamed from: a */
        private final String f8938a;

        /* renamed from: b */
        private final String f8939b;

        public C3058a(String str, String str2) {
            this.f8938a = str;
            this.f8939b = str2;
        }

        /* renamed from: a */
        public final String mo12598a() {
            return this.f8938a;
        }

        /* renamed from: b */
        public final String mo12599b() {
            return this.f8939b;
        }
    }

    @C3718cm
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$b */
    static class C3059b {

        /* renamed from: a */
        private final String f8940a;

        /* renamed from: b */
        private final URL f8941b;

        /* renamed from: c */
        private final ArrayList<C3058a> f8942c;

        /* renamed from: d */
        private final String f8943d;

        C3059b(String str, URL url, ArrayList<C3058a> arrayList, String str2) {
            this.f8940a = str;
            this.f8941b = url;
            this.f8942c = arrayList;
            this.f8943d = str2;
        }

        /* renamed from: a */
        public final String mo12600a() {
            return this.f8940a;
        }

        /* renamed from: b */
        public final URL mo12601b() {
            return this.f8941b;
        }

        /* renamed from: c */
        public final ArrayList<C3058a> mo12602c() {
            return this.f8942c;
        }

        /* renamed from: d */
        public final String mo12603d() {
            return this.f8943d;
        }
    }

    @C3718cm
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$c */
    class C3060c {

        /* renamed from: a */
        private final C3061d f8944a;

        /* renamed from: b */
        private final boolean f8945b;

        /* renamed from: c */
        private final String f8946c;

        public C3060c(HttpClient httpClient, boolean z, C3061d dVar, String str) {
            this.f8945b = z;
            this.f8944a = dVar;
            this.f8946c = str;
        }

        /* renamed from: a */
        public final String mo12604a() {
            return this.f8946c;
        }

        /* renamed from: b */
        public final C3061d mo12605b() {
            return this.f8944a;
        }

        /* renamed from: c */
        public final boolean mo12606c() {
            return this.f8945b;
        }
    }

    @C3718cm
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$d */
    static class C3061d {

        /* renamed from: a */
        private final String f8947a;

        /* renamed from: b */
        private final int f8948b;

        /* renamed from: c */
        private final List<C3058a> f8949c;

        /* renamed from: d */
        private final String f8950d;

        C3061d(String str, int i, List<C3058a> list, String str2) {
            this.f8947a = str;
            this.f8948b = i;
            this.f8949c = list;
            this.f8950d = str2;
        }

        /* renamed from: a */
        public final String mo12607a() {
            return this.f8947a;
        }

        /* renamed from: b */
        public final int mo12608b() {
            return this.f8948b;
        }

        /* renamed from: c */
        public final Iterable<C3058a> mo12609c() {
            return this.f8949c;
        }

        /* renamed from: d */
        public final String mo12610d() {
            return this.f8950d;
        }
    }

    public HttpClient(Context context, zzang zzang) {
        this.mContext = context;
        this.zzyf = zzang;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.ads.internal.gmsg.HttpClient.C3060c zza(com.google.android.gms.ads.internal.gmsg.HttpClient.C3059b r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
            java.net.URL r2 = r13.mo12601b()     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            com.google.android.gms.internal.ads.jn r3 = com.google.android.gms.ads.internal.C3025aw.m10917e()     // Catch:{ Exception -> 0x00eb }
            android.content.Context r4 = r12.mContext     // Catch:{ Exception -> 0x00eb }
            com.google.android.gms.internal.ads.zzang r5 = r12.zzyf     // Catch:{ Exception -> 0x00eb }
            java.lang.String r5 = r5.f14505a     // Catch:{ Exception -> 0x00eb }
            r3.mo15517a(r4, r5, r0, r2)     // Catch:{ Exception -> 0x00eb }
            java.util.ArrayList r3 = r13.mo12602c()     // Catch:{ Exception -> 0x00eb }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ Exception -> 0x00eb }
            int r4 = r3.size()     // Catch:{ Exception -> 0x00eb }
            r5 = r0
        L_0x0024:
            if (r5 >= r4) goto L_0x003a
            java.lang.Object r6 = r3.get(r5)     // Catch:{ Exception -> 0x00eb }
            int r5 = r5 + 1
            com.google.android.gms.ads.internal.gmsg.HttpClient$a r6 = (com.google.android.gms.ads.internal.gmsg.HttpClient.C3058a) r6     // Catch:{ Exception -> 0x00eb }
            java.lang.String r7 = r6.mo12598a()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r6 = r6.mo12599b()     // Catch:{ Exception -> 0x00eb }
            r2.addRequestProperty(r7, r6)     // Catch:{ Exception -> 0x00eb }
            goto L_0x0024
        L_0x003a:
            java.lang.String r3 = r13.mo12603d()     // Catch:{ Exception -> 0x00eb }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00eb }
            r4 = 1
            if (r3 != 0) goto L_0x0064
            r2.setDoOutput(r4)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r3 = r13.mo12603d()     // Catch:{ Exception -> 0x00eb }
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x00eb }
            int r5 = r3.length     // Catch:{ Exception -> 0x00eb }
            r2.setFixedLengthStreamingMode(r5)     // Catch:{ Exception -> 0x00eb }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00eb }
            java.io.OutputStream r6 = r2.getOutputStream()     // Catch:{ Exception -> 0x00eb }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00eb }
            r5.write(r3)     // Catch:{ Exception -> 0x00eb }
            r5.close()     // Catch:{ Exception -> 0x00eb }
            goto L_0x0065
        L_0x0064:
            r3 = r1
        L_0x0065:
            com.google.android.gms.internal.ads.md r5 = new com.google.android.gms.internal.ads.md     // Catch:{ Exception -> 0x00eb }
            r5.<init>()     // Catch:{ Exception -> 0x00eb }
            r5.mo15630a(r2, r3)     // Catch:{ Exception -> 0x00eb }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00eb }
            r3.<init>()     // Catch:{ Exception -> 0x00eb }
            java.util.Map r6 = r2.getHeaderFields()     // Catch:{ Exception -> 0x00eb }
            if (r6 == 0) goto L_0x00b5
            java.util.Map r6 = r2.getHeaderFields()     // Catch:{ Exception -> 0x00eb }
            java.util.Set r6 = r6.entrySet()     // Catch:{ Exception -> 0x00eb }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x00eb }
        L_0x0084:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x00eb }
            if (r7 == 0) goto L_0x00b5
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x00eb }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Exception -> 0x00eb }
            java.lang.Object r8 = r7.getValue()     // Catch:{ Exception -> 0x00eb }
            java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x00eb }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x00eb }
        L_0x009a:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x00eb }
            if (r9 == 0) goto L_0x0084
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00eb }
            com.google.android.gms.ads.internal.gmsg.HttpClient$a r10 = new com.google.android.gms.ads.internal.gmsg.HttpClient$a     // Catch:{ Exception -> 0x00eb }
            java.lang.Object r11 = r7.getKey()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x00eb }
            r10.<init>(r11, r9)     // Catch:{ Exception -> 0x00eb }
            r3.add(r10)     // Catch:{ Exception -> 0x00eb }
            goto L_0x009a
        L_0x00b5:
            com.google.android.gms.ads.internal.gmsg.HttpClient$d r6 = new com.google.android.gms.ads.internal.gmsg.HttpClient$d     // Catch:{ Exception -> 0x00eb }
            java.lang.String r13 = r13.mo12600a()     // Catch:{ Exception -> 0x00eb }
            int r7 = r2.getResponseCode()     // Catch:{ Exception -> 0x00eb }
            com.google.android.gms.ads.internal.C3025aw.m10917e()     // Catch:{ Exception -> 0x00eb }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00eb }
            java.io.InputStream r9 = r2.getInputStream()     // Catch:{ Exception -> 0x00eb }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r8 = com.google.android.gms.internal.ads.C3909jn.m17131a(r8)     // Catch:{ Exception -> 0x00eb }
            r6.<init>(r13, r7, r3, r8)     // Catch:{ Exception -> 0x00eb }
            int r13 = r6.mo12608b()     // Catch:{ Exception -> 0x00eb }
            r5.mo15629a(r2, r13)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r13 = r6.mo12610d()     // Catch:{ Exception -> 0x00eb }
            r5.mo15627a(r13)     // Catch:{ Exception -> 0x00eb }
            com.google.android.gms.ads.internal.gmsg.HttpClient$c r13 = new com.google.android.gms.ads.internal.gmsg.HttpClient$c     // Catch:{ Exception -> 0x00eb }
            r13.<init>(r12, r4, r6, r1)     // Catch:{ Exception -> 0x00eb }
            if (r2 == 0) goto L_0x00ea
            r2.disconnect()
        L_0x00ea:
            return r13
        L_0x00eb:
            r13 = move-exception
            goto L_0x00f2
        L_0x00ed:
            r13 = move-exception
            r2 = r1
            goto L_0x0102
        L_0x00f0:
            r13 = move-exception
            r2 = r1
        L_0x00f2:
            com.google.android.gms.ads.internal.gmsg.HttpClient$c r3 = new com.google.android.gms.ads.internal.gmsg.HttpClient$c     // Catch:{ all -> 0x0101 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0101 }
            r3.<init>(r12, r0, r1, r13)     // Catch:{ all -> 0x0101 }
            if (r2 == 0) goto L_0x0100
            r2.disconnect()
        L_0x0100:
            return r3
        L_0x0101:
            r13 = move-exception
        L_0x0102:
            if (r2 == 0) goto L_0x0107
            r2.disconnect()
        L_0x0107:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.HttpClient.zza(com.google.android.gms.ads.internal.gmsg.HttpClient$b):com.google.android.gms.ads.internal.gmsg.HttpClient$c");
    }

    private static JSONObject zza(C3061d dVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", dVar.mo12607a());
            if (dVar.mo12610d() != null) {
                jSONObject.put(TtmlNode.TAG_BODY, dVar.mo12610d());
            }
            JSONArray jSONArray = new JSONArray();
            for (C3058a aVar : dVar.mo12609c()) {
                jSONArray.put(new JSONObject().put("key", aVar.mo12598a()).put("value", aVar.mo12599b()));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", dVar.mo12608b());
            return jSONObject;
        } catch (JSONException e) {
            C3900je.m17430b("Error constructing JSON for http response.", e);
            return jSONObject;
        }
    }

    private static C3059b zzc(JSONObject jSONObject) {
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        URL url = null;
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (MalformedURLException e) {
            C3900je.m17430b("Error constructing http request.", e);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new C3058a(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new C3059b(optString, url, arrayList, optString3);
    }

    @Keep
    @KeepName
    public JSONObject send(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2 = new JSONObject();
        try {
            str = jSONObject.optString("http_request_id");
            try {
                C3060c zza = zza(zzc(jSONObject));
                if (zza.mo12606c()) {
                    jSONObject2.put("response", zza(zza.mo12605b()));
                    jSONObject2.put("success", true);
                    return jSONObject2;
                }
                jSONObject2.put("response", new JSONObject().put("http_request_id", str));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", zza.mo12604a());
                return jSONObject2;
            } catch (Exception e) {
                e = e;
                C3900je.m17430b("Error executing http request.", e);
                try {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", str));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", e.toString());
                    return jSONObject2;
                } catch (JSONException e2) {
                    C3900je.m17430b("Error executing http request.", e2);
                    return jSONObject2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
            C3900je.m17430b("Error executing http request.", e);
            jSONObject2.put("response", new JSONObject().put("http_request_id", str));
            jSONObject2.put("success", false);
            jSONObject2.put("reason", e.toString());
            return jSONObject2;
        }
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3907jl.m17118a((Runnable) new C3068af(this, map, (ayo) obj));
    }
}

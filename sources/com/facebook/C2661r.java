package com.facebook;

import android.util.Log;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2563u;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.r */
/* compiled from: GraphResponse */
public class C2661r {

    /* renamed from: a */
    private static final String f8270a = "r";

    /* renamed from: b */
    private final HttpURLConnection f8271b;

    /* renamed from: c */
    private final JSONObject f8272c;

    /* renamed from: d */
    private final JSONArray f8273d;

    /* renamed from: e */
    private final FacebookRequestError f8274e;

    /* renamed from: f */
    private final String f8275f;

    /* renamed from: g */
    private final GraphRequest f8276g;

    C2661r(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
    }

    C2661r(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
    }

    C2661r(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
    }

    C2661r(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.f8276g = graphRequest;
        this.f8271b = httpURLConnection;
        this.f8275f = str;
        this.f8272c = jSONObject;
        this.f8273d = jSONArray;
        this.f8274e = facebookRequestError;
    }

    /* renamed from: a */
    public final FacebookRequestError mo9370a() {
        return this.f8274e;
    }

    /* renamed from: b */
    public final JSONObject mo9371b() {
        return this.f8272c;
    }

    public String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            String str2 = "%d";
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(this.f8271b != null ? this.f8271b.getResponseCode() : 200);
            str = String.format(locale, str2, objArr);
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{Response: ");
        sb.append(" responseCode: ");
        sb.append(str);
        sb.append(", graphObject: ");
        sb.append(this.f8272c);
        sb.append(", error: ");
        sb.append(this.f8274e);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    static List<C2661r> m10172a(HttpURLConnection httpURLConnection, C2658q qVar) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            if (httpURLConnection.getResponseCode() >= 400) {
                inputStream = httpURLConnection.getErrorStream();
            } else {
                inputStream = httpURLConnection.getInputStream();
            }
            inputStream2 = inputStream;
            return m10170a(inputStream2, httpURLConnection, qVar);
        } catch (C2579j e) {
            C2563u.m9722a(C2757u.REQUESTS, "Response", "Response <Error>: %s", e);
            return m10174a((List<GraphRequest>) qVar, httpURLConnection, e);
        } catch (Exception e2) {
            C2563u.m9722a(C2757u.REQUESTS, "Response", "Response <Error>: %s", e2);
            return m10174a((List<GraphRequest>) qVar, httpURLConnection, new C2579j((Throwable) e2));
        } finally {
            C2479ad.m9444a(inputStream2);
        }
    }

    /* renamed from: a */
    static List<C2661r> m10170a(InputStream inputStream, HttpURLConnection httpURLConnection, C2658q qVar) throws C2579j, JSONException, IOException {
        String a = C2479ad.m9427a(inputStream);
        C2563u.m9722a(C2757u.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(a.length()), a);
        return m10171a(a, httpURLConnection, qVar);
    }

    /* renamed from: a */
    static List<C2661r> m10171a(String str, HttpURLConnection httpURLConnection, C2658q qVar) throws C2579j, JSONException, IOException {
        List<C2661r> a = m10173a(httpURLConnection, (List<GraphRequest>) qVar, new JSONTokener(str).nextValue());
        C2563u.m9722a(C2757u.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", qVar.mo9355b(), Integer.valueOf(str.length()), a);
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.facebook.C2661r> m10173a(java.net.HttpURLConnection r7, java.util.List<com.facebook.GraphRequest> r8, java.lang.Object r9) throws com.facebook.C2579j, org.json.JSONException {
        /*
            int r0 = r8.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x0051
            java.lang.Object r3 = r8.get(r2)
            com.facebook.GraphRequest r3 = (com.facebook.GraphRequest) r3
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r4.<init>()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            java.lang.String r5 = "body"
            r4.put(r5, r9)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            if (r7 == 0) goto L_0x0024
            int r5 = r7.getResponseCode()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            goto L_0x0026
        L_0x0024:
            r5 = 200(0xc8, float:2.8E-43)
        L_0x0026:
            java.lang.String r6 = "code"
            r4.put(r6, r5)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r5.<init>()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r5.put(r4)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            goto L_0x0052
        L_0x0034:
            r4 = move-exception
            com.facebook.r r5 = new com.facebook.r
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>(r7, r4)
            r5.<init>(r3, r7, r6)
            r1.add(r5)
            goto L_0x0051
        L_0x0043:
            r4 = move-exception
            com.facebook.r r5 = new com.facebook.r
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>(r7, r4)
            r5.<init>(r3, r7, r6)
            r1.add(r5)
        L_0x0051:
            r5 = r9
        L_0x0052:
            boolean r3 = r5 instanceof org.json.JSONArray
            if (r3 == 0) goto L_0x0098
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            int r3 = r5.length()
            if (r3 == r0) goto L_0x005f
            goto L_0x0098
        L_0x005f:
            int r0 = r5.length()
            if (r2 >= r0) goto L_0x0097
            java.lang.Object r0 = r8.get(r2)
            com.facebook.GraphRequest r0 = (com.facebook.GraphRequest) r0
            java.lang.Object r3 = r5.get(r2)     // Catch:{ JSONException -> 0x0086, j -> 0x0077 }
            com.facebook.r r3 = m10169a(r0, r7, r3, r9)     // Catch:{ JSONException -> 0x0086, j -> 0x0077 }
            r1.add(r3)     // Catch:{ JSONException -> 0x0086, j -> 0x0077 }
            goto L_0x0094
        L_0x0077:
            r3 = move-exception
            com.facebook.r r4 = new com.facebook.r
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>(r7, r3)
            r4.<init>(r0, r7, r6)
            r1.add(r4)
            goto L_0x0094
        L_0x0086:
            r3 = move-exception
            com.facebook.r r4 = new com.facebook.r
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>(r7, r3)
            r4.<init>(r0, r7, r6)
            r1.add(r4)
        L_0x0094:
            int r2 = r2 + 1
            goto L_0x005f
        L_0x0097:
            return r1
        L_0x0098:
            com.facebook.j r7 = new com.facebook.j
            java.lang.String r8 = "Unexpected number of results"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C2661r.m10173a(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
    }

    /* renamed from: a */
    private static C2661r m10169a(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            FacebookRequestError a = FacebookRequestError.m6193a(jSONObject, obj2, httpURLConnection);
            if (a != null) {
                Log.e(f8270a, a.toString());
                if (a.mo6657b() == 190 && C2479ad.m9454a(graphRequest.mo6683f())) {
                    if (a.mo6658c() != 493) {
                        AccessToken.m6165a((AccessToken) null);
                    } else if (!AccessToken.m6161a().mo6625l()) {
                        AccessToken.m6169c();
                    }
                }
                return new C2661r(graphRequest, httpURLConnection, a);
            }
            Object a2 = C2479ad.m9424a(jSONObject, TtmlNode.TAG_BODY, "FACEBOOK_NON_JSON_RESULT");
            if (a2 instanceof JSONObject) {
                return new C2661r(graphRequest, httpURLConnection, a2.toString(), (JSONObject) a2);
            }
            if (a2 instanceof JSONArray) {
                return new C2661r(graphRequest, httpURLConnection, a2.toString(), (JSONArray) a2);
            }
            obj = JSONObject.NULL;
        }
        if (obj == JSONObject.NULL) {
            return new C2661r(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Got unexpected object type in response, class: ");
        sb.append(obj.getClass().getSimpleName());
        throw new C2579j(sb.toString());
    }

    /* renamed from: a */
    static List<C2661r> m10174a(List<GraphRequest> list, HttpURLConnection httpURLConnection, C2579j jVar) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C2661r((GraphRequest) list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) jVar)));
        }
        return arrayList;
    }
}

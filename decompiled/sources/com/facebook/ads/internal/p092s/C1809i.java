package com.facebook.ads.internal.p092s;

import android.content.Context;
import android.database.Cursor;
import com.appnext.base.p046b.C1245d;
import com.facebook.ads.internal.p083j.C1743d;
import com.facebook.ads.internal.p084k.C1756e;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p092s.C1798b.C1801a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.s.i */
public class C1809i implements C1801a {

    /* renamed from: a */
    private static final String f5728a = "i";

    /* renamed from: b */
    private Context f5729b;

    /* renamed from: c */
    private C1743d f5730c;

    public C1809i(Context context, C1743d dVar) {
        this.f5729b = context;
        this.f5730c = dVar;
    }

    /* renamed from: a */
    private static JSONArray m7568a(JSONArray jSONArray, JSONArray jSONArray2, int i) {
        JSONArray jSONArray3 = jSONArray;
        JSONArray jSONArray4 = jSONArray2;
        if (jSONArray3 == null) {
            return jSONArray4;
        }
        if (jSONArray4 == null) {
            return jSONArray3;
        }
        int length = jSONArray.length();
        int length2 = jSONArray2.length();
        JSONArray jSONArray5 = new JSONArray();
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        double d = Double.MAX_VALUE;
        double d2 = Double.MAX_VALUE;
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        while (true) {
            if ((i2 < length || i4 < length2) && i3 > 0) {
                if (i2 < length && jSONObject == null) {
                    try {
                        jSONObject = jSONArray3.getJSONObject(i2);
                        d = jSONObject.getDouble(C1245d.f3955iX);
                    } catch (JSONException unused) {
                        d = Double.MAX_VALUE;
                        jSONObject = null;
                    }
                    i2++;
                }
                if (i4 < length2 && jSONObject2 == null) {
                    try {
                        jSONObject2 = jSONArray4.getJSONObject(i4);
                        d2 = jSONObject2.getDouble(C1245d.f3955iX);
                    } catch (JSONException unused2) {
                        d2 = Double.MAX_VALUE;
                        jSONObject2 = null;
                    }
                    i4++;
                }
                if (jSONObject != null || jSONObject2 != null) {
                    if (jSONObject == null || d2 < d) {
                        jSONArray5.put(jSONObject2);
                        d2 = Double.MAX_VALUE;
                        jSONObject2 = null;
                    } else {
                        jSONArray5.put(jSONObject);
                        d = Double.MAX_VALUE;
                        jSONObject = null;
                    }
                    i3--;
                }
            }
        }
        if (i3 > 0) {
            if (jSONObject != null) {
                jSONArray5.put(jSONObject);
                return jSONArray5;
            } else if (jSONObject2 != null) {
                jSONArray5.put(jSONObject2);
            }
        }
        return jSONArray5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m7569a(int r10) {
        /*
            r9 = this;
            r0 = 0
            com.facebook.ads.internal.j.d r1 = r9.f5730c     // Catch:{ JSONException -> 0x00e7, all -> 0x00d9 }
            android.database.Cursor r1 = r1.mo7544d()     // Catch:{ JSONException -> 0x00e7, all -> 0x00d9 }
            com.facebook.ads.internal.j.d r2 = r9.f5730c     // Catch:{ JSONException -> 0x00d7, all -> 0x00d4 }
            android.database.Cursor r2 = r2.mo7536a(r10)     // Catch:{ JSONException -> 0x00d7, all -> 0x00d4 }
            int r3 = r2.getCount()     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            if (r3 <= 0) goto L_0x0096
            org.json.JSONObject r3 = r9.m7570a(r2)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            r4.<init>()     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            r5 = -1
            r2.moveToPosition(r5)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
        L_0x0020:
            boolean r5 = r2.moveToNext()     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            if (r5 == 0) goto L_0x0098
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            r5.<init>()     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            java.lang.String r6 = "id"
            r7 = 2
            java.lang.String r7 = r2.getString(r7)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            java.lang.String r6 = "token_id"
            r7 = 0
            java.lang.String r7 = r2.getString(r7)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            java.lang.String r6 = "type"
            r7 = 4
            java.lang.String r7 = r2.getString(r7)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            java.lang.String r6 = "time"
            r7 = 5
            double r7 = r2.getDouble(r7)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            java.lang.String r7 = com.facebook.ads.internal.p115w.p117b.C2339v.m9068a(r7)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            java.lang.String r6 = "session_time"
            r7 = 6
            double r7 = r2.getDouble(r7)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            java.lang.String r7 = com.facebook.ads.internal.p115w.p117b.C2339v.m9068a(r7)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            java.lang.String r6 = "session_id"
            r7 = 7
            java.lang.String r7 = r2.getString(r7)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            r6 = 8
            java.lang.String r6 = r2.getString(r6)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            java.lang.String r7 = "data"
            if (r6 == 0) goto L_0x007f
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            r8.<init>(r6)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            goto L_0x0084
        L_0x007f:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            r8.<init>()     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
        L_0x0084:
            r5.put(r7, r8)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            java.lang.String r6 = "attempt"
            r7 = 9
            java.lang.String r7 = r2.getString(r7)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            r4.put(r5)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            goto L_0x0020
        L_0x0096:
            r3 = r0
            r4 = r3
        L_0x0098:
            android.content.Context r5 = r9.f5729b     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            boolean r5 = com.facebook.ads.internal.p091r.C1795a.m7457p(r5)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            if (r5 == 0) goto L_0x00b2
            android.content.Context r5 = r9.f5729b     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            org.json.JSONArray r5 = com.facebook.ads.internal.p084k.C1756e.m7280a(r5, r10)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            if (r5 == 0) goto L_0x00b2
            int r6 = r5.length()     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            if (r6 <= 0) goto L_0x00b2
            org.json.JSONArray r4 = m7568a(r5, r4, r10)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
        L_0x00b2:
            if (r4 == 0) goto L_0x00c6
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            r10.<init>()     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            if (r3 == 0) goto L_0x00c0
            java.lang.String r5 = "tokens"
            r10.put(r5, r3)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
        L_0x00c0:
            java.lang.String r3 = "events"
            r10.put(r3, r4)     // Catch:{ JSONException -> 0x00e9, all -> 0x00d2 }
            goto L_0x00c7
        L_0x00c6:
            r10 = r0
        L_0x00c7:
            if (r1 == 0) goto L_0x00cc
            r1.close()
        L_0x00cc:
            if (r2 == 0) goto L_0x00d1
            r2.close()
        L_0x00d1:
            return r10
        L_0x00d2:
            r10 = move-exception
            goto L_0x00dc
        L_0x00d4:
            r10 = move-exception
            r2 = r0
            goto L_0x00dc
        L_0x00d7:
            r2 = r0
            goto L_0x00e9
        L_0x00d9:
            r10 = move-exception
            r1 = r0
            r2 = r1
        L_0x00dc:
            if (r1 == 0) goto L_0x00e1
            r1.close()
        L_0x00e1:
            if (r2 == 0) goto L_0x00e6
            r2.close()
        L_0x00e6:
            throw r10
        L_0x00e7:
            r1 = r0
            r2 = r1
        L_0x00e9:
            if (r1 == 0) goto L_0x00ee
            r1.close()
        L_0x00ee:
            if (r2 == 0) goto L_0x00f3
            r2.close()
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p092s.C1809i.m7569a(int):org.json.JSONObject");
    }

    /* renamed from: a */
    private JSONObject m7570a(Cursor cursor) {
        JSONObject jSONObject = new JSONObject();
        while (cursor.moveToNext()) {
            jSONObject.put(cursor.getString(0), cursor.getString(1));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private void m7571a(String str) {
        if (C1756e.m7287c(str)) {
            C1756e.m7282a(str);
        } else {
            this.f5730c.mo7540a(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011e  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m7572e() {
        /*
            r10 = this;
            r0 = 0
            com.facebook.ads.internal.j.d r1 = r10.f5730c     // Catch:{ JSONException -> 0x0115, all -> 0x0106 }
            android.database.Cursor r1 = r1.mo7546f()     // Catch:{ JSONException -> 0x0115, all -> 0x0106 }
            com.facebook.ads.internal.j.d r2 = r10.f5730c     // Catch:{ JSONException -> 0x0104, all -> 0x00ff }
            android.database.Cursor r2 = r2.mo7545e()     // Catch:{ JSONException -> 0x0104, all -> 0x00ff }
            int r3 = r1.getCount()     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            if (r3 <= 0) goto L_0x00b3
            int r3 = r2.getCount()     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            if (r3 <= 0) goto L_0x00b3
            org.json.JSONObject r3 = r10.m7570a(r1)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            r4.<init>()     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            r5 = -1
            r2.moveToPosition(r5)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
        L_0x0026:
            boolean r5 = r2.moveToNext()     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            if (r5 == 0) goto L_0x00b5
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            r5.<init>()     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            java.lang.String r6 = "id"
            com.facebook.ads.internal.j.b r7 = com.facebook.ads.internal.p083j.C1742c.f5441a     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            int r7 = r7.f5438a     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            java.lang.String r7 = r2.getString(r7)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            java.lang.String r6 = "token_id"
            com.facebook.ads.internal.j.b r7 = com.facebook.ads.internal.p083j.C1742c.f5442b     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            int r7 = r7.f5438a     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            java.lang.String r7 = r2.getString(r7)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            java.lang.String r6 = "type"
            com.facebook.ads.internal.j.b r7 = com.facebook.ads.internal.p083j.C1742c.f5444d     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            int r7 = r7.f5438a     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            java.lang.String r7 = r2.getString(r7)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            java.lang.String r6 = "time"
            com.facebook.ads.internal.j.b r7 = com.facebook.ads.internal.p083j.C1742c.f5445e     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            int r7 = r7.f5438a     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            double r7 = r2.getDouble(r7)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            java.lang.String r7 = com.facebook.ads.internal.p115w.p117b.C2339v.m9068a(r7)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            java.lang.String r6 = "session_time"
            com.facebook.ads.internal.j.b r7 = com.facebook.ads.internal.p083j.C1742c.f5446f     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            int r7 = r7.f5438a     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            double r7 = r2.getDouble(r7)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            java.lang.String r7 = com.facebook.ads.internal.p115w.p117b.C2339v.m9068a(r7)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            java.lang.String r6 = "session_id"
            com.facebook.ads.internal.j.b r7 = com.facebook.ads.internal.p083j.C1742c.f5447g     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            int r7 = r7.f5438a     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            java.lang.String r7 = r2.getString(r7)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            com.facebook.ads.internal.j.b r6 = com.facebook.ads.internal.p083j.C1742c.f5448h     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            int r6 = r6.f5438a     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            java.lang.String r6 = r2.getString(r6)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            java.lang.String r7 = "data"
            if (r6 == 0) goto L_0x0099
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            r8.<init>(r6)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            goto L_0x009e
        L_0x0099:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            r8.<init>()     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
        L_0x009e:
            r5.put(r7, r8)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            java.lang.String r6 = "attempt"
            com.facebook.ads.internal.j.b r7 = com.facebook.ads.internal.p083j.C1742c.f5449i     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            int r7 = r7.f5438a     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            java.lang.String r7 = r2.getString(r7)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            r4.put(r5)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            goto L_0x0026
        L_0x00b3:
            r3 = r0
            r4 = r3
        L_0x00b5:
            android.content.Context r5 = r10.f5729b     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            boolean r5 = com.facebook.ads.internal.p091r.C1795a.m7457p(r5)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            if (r5 == 0) goto L_0x00de
            android.content.Context r5 = r10.f5729b     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            org.json.JSONArray r5 = com.facebook.ads.internal.p084k.C1756e.m7279a(r5)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            if (r5 == 0) goto L_0x00de
            int r6 = r5.length()     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            if (r6 <= 0) goto L_0x00de
            r6 = 0
            if (r5 == 0) goto L_0x00d3
            int r7 = r5.length()     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            int r6 = r6 + r7
        L_0x00d3:
            if (r4 == 0) goto L_0x00da
            int r7 = r4.length()     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            int r6 = r6 + r7
        L_0x00da:
            org.json.JSONArray r4 = m7568a(r5, r4, r6)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
        L_0x00de:
            if (r4 == 0) goto L_0x00f2
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            r5.<init>()     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            if (r3 == 0) goto L_0x00ec
            java.lang.String r6 = "tokens"
            r5.put(r6, r3)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
        L_0x00ec:
            java.lang.String r3 = "events"
            r5.put(r3, r4)     // Catch:{ JSONException -> 0x0117, all -> 0x00fd }
            r0 = r5
        L_0x00f2:
            if (r1 == 0) goto L_0x00f7
            r1.close()
        L_0x00f7:
            if (r2 == 0) goto L_0x00fc
            r2.close()
        L_0x00fc:
            return r0
        L_0x00fd:
            r0 = move-exception
            goto L_0x010a
        L_0x00ff:
            r2 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
            goto L_0x010a
        L_0x0104:
            r2 = r0
            goto L_0x0117
        L_0x0106:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L_0x010a:
            if (r1 == 0) goto L_0x010f
            r1.close()
        L_0x010f:
            if (r2 == 0) goto L_0x0114
            r2.close()
        L_0x0114:
            throw r0
        L_0x0115:
            r1 = r0
            r2 = r1
        L_0x0117:
            if (r1 == 0) goto L_0x011c
            r1.close()
        L_0x011c:
            if (r2 == 0) goto L_0x0121
            r2.close()
        L_0x0121:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p092s.C1809i.m7572e():org.json.JSONObject");
    }

    /* renamed from: a */
    public JSONObject mo7679a() {
        int x = C1795a.m7465x(this.f5729b);
        return x > 0 ? m7569a(x) : m7572e();
    }

    /* renamed from: a */
    public boolean mo7680a(JSONArray jSONArray) {
        boolean p = C1795a.m7457p(this.f5729b);
        boolean z = true;
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString(TtmlNode.ATTR_ID);
                int i2 = jSONObject.getInt("code");
                if (i2 == 1) {
                    if (!this.f5730c.mo7542b(string)) {
                        if (!p) {
                        }
                    }
                } else if (i2 < 1000 || i2 >= 2000) {
                    if (i2 >= 2000) {
                        if (i2 < 3000) {
                            if (!this.f5730c.mo7542b(string)) {
                                if (!p) {
                                }
                            }
                        }
                    }
                } else {
                    m7571a(string);
                    z = false;
                }
                C1756e.m7285b(string);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    /* renamed from: b */
    public void mo7681b() {
        this.f5730c.mo7547g();
        this.f5730c.mo7541b();
        C1756e.m7288d(this.f5729b);
    }

    /* renamed from: b */
    public void mo7682b(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                m7571a(jSONArray.getJSONObject(i).getString(TtmlNode.ATTR_ID));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: c */
    public void mo7683c() {
        this.f5730c.mo7548h();
        C1756e.m7283b(this.f5729b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0035  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7684d() {
        /*
            r6 = this;
            android.content.Context r0 = r6.f5729b
            int r0 = com.facebook.ads.internal.p091r.C1795a.m7465x(r0)
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x000b
            return r2
        L_0x000b:
            r3 = 0
            com.facebook.ads.internal.j.d r4 = r6.f5730c     // Catch:{ all -> 0x0031 }
            android.database.Cursor r4 = r4.mo7544d()     // Catch:{ all -> 0x0031 }
            boolean r3 = r4.moveToFirst()     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x001d
            int r3 = r4.getInt(r2)     // Catch:{ all -> 0x002f }
            goto L_0x001e
        L_0x001d:
            r3 = r2
        L_0x001e:
            android.content.Context r5 = r6.f5729b     // Catch:{ all -> 0x002f }
            int r5 = com.facebook.ads.internal.p084k.C1756e.m7286c(r5)     // Catch:{ all -> 0x002f }
            int r3 = r3 + r5
            if (r3 <= r0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r1 = r2
        L_0x0029:
            if (r4 == 0) goto L_0x002e
            r4.close()
        L_0x002e:
            return r1
        L_0x002f:
            r0 = move-exception
            goto L_0x0033
        L_0x0031:
            r0 = move-exception
            r4 = r3
        L_0x0033:
            if (r4 == 0) goto L_0x0038
            r4.close()
        L_0x0038:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p092s.C1809i.mo7684d():boolean");
    }
}

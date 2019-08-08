package com.facebook.ads.internal.p070a;

import android.content.Context;
import android.net.Uri;
import com.facebook.ads.internal.p092s.C1802c;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.a.c */
public class C1564c {

    /* renamed from: a */
    private static final String f4808a = "c";

    /* renamed from: a */
    public static C1563b m6493a(Context context, C1802c cVar, String str, Uri uri, Map<String, String> map) {
        return m6494a(context, cVar, str, uri, map, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.ads.internal.p070a.C1563b m6494a(android.content.Context r11, com.facebook.ads.internal.p092s.C1802c r12, java.lang.String r13, android.net.Uri r14, java.util.Map<java.lang.String, java.lang.String> r15, boolean r16, boolean r17) {
        /*
            r3 = r12
            r5 = r14
            r1 = 0
            if (r5 == 0) goto L_0x00c8
            java.lang.String r2 = r5.getAuthority()
            if (r2 != 0) goto L_0x000c
            return r1
        L_0x000c:
            java.lang.String r2 = r5.getAuthority()
            java.lang.String r4 = "video_url"
            java.lang.String r4 = r5.getQueryParameter(r4)
            java.lang.String r6 = "data"
            java.lang.String r6 = r5.getQueryParameter(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0053
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r7 = "data"
            java.lang.String r7 = r5.getQueryParameter(r7)     // Catch:{ JSONException -> 0x0048 }
            r6.<init>(r7)     // Catch:{ JSONException -> 0x0048 }
            java.util.Iterator r7 = r6.keys()     // Catch:{ JSONException -> 0x0048 }
        L_0x0031:
            boolean r8 = r7.hasNext()     // Catch:{ JSONException -> 0x0048 }
            if (r8 == 0) goto L_0x0053
            java.lang.Object r8 = r7.next()     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r9 = r6.getString(r8)     // Catch:{ JSONException -> 0x0048 }
            r10 = r15
            r10.put(r8, r9)     // Catch:{ JSONException -> 0x0046 }
            goto L_0x0031
        L_0x0046:
            r0 = move-exception
            goto L_0x004a
        L_0x0048:
            r0 = move-exception
            r10 = r15
        L_0x004a:
            r6 = r0
            java.lang.String r7 = f4808a
            java.lang.String r8 = "Unable to parse json data in AdActionFactory."
            android.util.Log.w(r7, r8, r6)
            goto L_0x0054
        L_0x0053:
            r10 = r15
        L_0x0054:
            android.app.Activity r6 = com.facebook.ads.internal.p115w.p116a.C2305b.m9012a()
            com.facebook.ads.internal.a.m r7 = com.facebook.ads.internal.p070a.C1575m.m6524a(r3, r6)
            r6 = -1
            int r8 = r2.hashCode()
            r9 = -1458789996(0xffffffffa90ca194, float:-3.122639E-14)
            if (r8 == r9) goto L_0x0085
            r9 = 109770977(0x68af8e1, float:5.2275525E-35)
            if (r8 == r9) goto L_0x007b
            r9 = 1546100943(0x5c27a0cf, float:1.88732528E17)
            if (r8 == r9) goto L_0x0071
            goto L_0x008e
        L_0x0071:
            java.lang.String r8 = "open_link"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x008e
            r6 = 1
            goto L_0x008e
        L_0x007b:
            java.lang.String r8 = "store"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x008e
            r6 = 0
            goto L_0x008e
        L_0x0085:
            java.lang.String r8 = "passthrough"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x008e
            r6 = 2
        L_0x008e:
            switch(r6) {
                case 0: goto L_0x00b9;
                case 1: goto L_0x00a3;
                case 2: goto L_0x0099;
                default: goto L_0x0091;
            }
        L_0x0091:
            com.facebook.ads.internal.a.l r1 = new com.facebook.ads.internal.a.l
            r2 = r11
            r4 = r13
            r1.<init>(r2, r3, r4, r5)
            return r1
        L_0x0099:
            com.facebook.ads.internal.a.k r7 = new com.facebook.ads.internal.a.k
            r1 = r7
            r2 = r11
            r4 = r13
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r7
        L_0x00a3:
            if (r17 == 0) goto L_0x00af
            com.facebook.ads.internal.a.i r7 = new com.facebook.ads.internal.a.i
            r1 = r7
            r2 = r11
            r4 = r13
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r7
        L_0x00af:
            com.facebook.ads.internal.a.j r8 = new com.facebook.ads.internal.a.j
            r1 = r8
            r2 = r11
            r4 = r13
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
        L_0x00b9:
            if (r4 == 0) goto L_0x00bc
            return r1
        L_0x00bc:
            com.facebook.ads.internal.a.f r9 = new com.facebook.ads.internal.a.f
            r1 = r9
            r2 = r11
            r4 = r13
            r6 = r10
            r8 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r9
        L_0x00c8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p070a.C1564c.m6494a(android.content.Context, com.facebook.ads.internal.s.c, java.lang.String, android.net.Uri, java.util.Map, boolean, boolean):com.facebook.ads.internal.a.b");
    }

    /* renamed from: a */
    public static boolean m6495a(String str) {
        return "store".equalsIgnoreCase(str) || "open_link".equalsIgnoreCase(str);
    }
}

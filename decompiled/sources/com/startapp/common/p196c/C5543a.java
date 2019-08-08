package com.startapp.common.p196c;

import com.startapp.common.p193a.C5518g;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.startapp.common.c.a */
/* compiled from: StartAppSDK */
public class C5543a extends InputStream {

    /* renamed from: a */
    public static Map<String, Class> f17623a = new HashMap();

    /* renamed from: b */
    private InputStream f17624b = null;

    /* renamed from: c */
    private String f17625c;

    @Deprecated
    public final int read() {
        return 0;
    }

    public C5543a(String str) {
        this.f17625c = str;
    }

    public void close() {
        super.close();
        if (this.f17624b != null) {
            this.f17624b.close();
        }
    }

    /* renamed from: a */
    public final <T> T mo20528a(Class<T> cls, JSONObject jSONObject) {
        try {
            return m23662b(cls, jSONObject);
        } catch (C5546d e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error while trying to parse object ");
            sb.append(cls.toString());
            C5518g.m23564a("JSONInputStream", 6, sb.toString(), e);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r13v1 */
    /* JADX WARNING: type inference failed for: r12v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r17v0 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r1v60 */
    /* JADX WARNING: type inference failed for: r17v1 */
    /* JADX WARNING: type inference failed for: r17v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v66 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r12v18 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r1v78 */
    /* JADX WARNING: type inference failed for: r17v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02cd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d8, code lost:
        throw new com.startapp.common.p196c.C5546d("Unknown error occurred ", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x014e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014f, code lost:
        r1 = r0;
        r12 = r4;
        r16 = r6;
        r11 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d3, code lost:
        if (java.util.Collection.class.isAssignableFrom(r2) != false) goto L_0x01d5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
      assigns: []
      uses: []
      mth insns count: 331
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02cf A[ExcHandler: Throwable (r0v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:65:0x0110] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016b A[SYNTHETIC, Splitter:B:81:0x016b] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ab A[Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }] */
    /* JADX WARNING: Unknown variable types count: 15 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> T m23662b(java.lang.Class<T> r21, org.json.JSONObject r22) {
        /*
            r20 = this;
            r8 = r20
            r1 = r21
            java.io.InputStream r2 = r8.f17624b
            if (r2 != 0) goto L_0x0014
            java.lang.String r2 = r8.f17625c
            if (r2 != 0) goto L_0x0014
            com.startapp.common.c.d r1 = new com.startapp.common.c.d
            java.lang.String r2 = "Can't read object, the input is null."
            r1.<init>(r2)
            throw r1
        L_0x0014:
            java.lang.String r2 = r8.f17625c
            r9 = 0
            if (r2 != 0) goto L_0x002c
            java.io.InputStream r2 = r8.f17624b     // Catch:{ Exception -> 0x0022 }
            java.lang.String r2 = m23657a(r2, r9)     // Catch:{ Exception -> 0x0022 }
            r8.f17625c = r2     // Catch:{ Exception -> 0x0022 }
            goto L_0x002c
        L_0x0022:
            r0 = move-exception
            r1 = r0
            com.startapp.common.c.d r2 = new com.startapp.common.c.d
            java.lang.String r3 = "Can't read input stream."
            r2.<init>(r3, r1)
            throw r2
        L_0x002c:
            if (r22 != 0) goto L_0x0041
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0037 }
            java.lang.String r3 = r8.f17625c     // Catch:{ JSONException -> 0x0037 }
            r2.<init>(r3)     // Catch:{ JSONException -> 0x0037 }
            r10 = r2
            goto L_0x0043
        L_0x0037:
            r0 = move-exception
            r1 = r0
            com.startapp.common.c.d r2 = new com.startapp.common.c.d
            java.lang.String r3 = "Can't deserialize the object. Failed to create JSON object."
            r2.<init>(r3, r1)
            throw r2
        L_0x0041:
            r10 = r22
        L_0x0043:
            java.lang.Class<com.startapp.common.c.e> r2 = com.startapp.common.p196c.C5547e.class
            java.lang.annotation.Annotation r2 = r1.getAnnotation(r2)     // Catch:{ Exception -> 0x0306 }
            com.startapp.common.c.e r2 = (com.startapp.common.p196c.C5547e) r2     // Catch:{ Exception -> 0x0306 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0306 }
            r4 = 9
            r11 = 2
            r12 = 1
            r13 = 0
            if (r3 < r4) goto L_0x0074
            java.lang.Class<java.net.HttpCookie> r3 = java.net.HttpCookie.class
            boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x0306 }
            if (r3 == 0) goto L_0x0074
            java.lang.reflect.Constructor[] r3 = r21.getDeclaredConstructors()     // Catch:{ Exception -> 0x0306 }
            r3 = r3[r13]     // Catch:{ Exception -> 0x0306 }
            r3.setAccessible(r12)     // Catch:{ Exception -> 0x0306 }
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0306 }
            java.lang.String r5 = "name"
            r4[r13] = r5     // Catch:{ Exception -> 0x0306 }
            java.lang.String r5 = "value"
            r4[r12] = r5     // Catch:{ Exception -> 0x0306 }
            java.lang.Object r3 = r3.newInstance(r4)     // Catch:{ Exception -> 0x0306 }
            goto L_0x00e2
        L_0x0074:
            boolean r3 = r21.isPrimitive()     // Catch:{ Exception -> 0x0306 }
            if (r3 == 0) goto L_0x007f
            java.lang.Object r1 = r21.newInstance()     // Catch:{ Exception -> 0x0306 }
            return r1
        L_0x007f:
            java.lang.Class<com.startapp.common.c.e> r3 = com.startapp.common.p196c.C5547e.class
            java.lang.annotation.Annotation r3 = r1.getAnnotation(r3)     // Catch:{ Exception -> 0x0306 }
            if (r3 == 0) goto L_0x00d3
            boolean r3 = r2.mo20533c()     // Catch:{ Exception -> 0x0306 }
            if (r3 == 0) goto L_0x008e
            goto L_0x00d3
        L_0x008e:
            boolean r3 = r2.mo20533c()     // Catch:{ Exception -> 0x0306 }
            if (r3 != 0) goto L_0x00d1
            java.lang.String r1 = r2.mo20531a()     // Catch:{ ClassNotFoundException -> 0x00c7, JSONException -> 0x00bd }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ ClassNotFoundException -> 0x00c7, JSONException -> 0x00bd }
            java.lang.String r2 = r2.mo20532b()     // Catch:{ ClassNotFoundException -> 0x00c7, JSONException -> 0x00bd }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x00c7, JSONException -> 0x00bd }
            r3.<init>()     // Catch:{ ClassNotFoundException -> 0x00c7, JSONException -> 0x00bd }
            r3.append(r2)     // Catch:{ ClassNotFoundException -> 0x00c7, JSONException -> 0x00bd }
            java.lang.String r2 = "."
            r3.append(r2)     // Catch:{ ClassNotFoundException -> 0x00c7, JSONException -> 0x00bd }
            r3.append(r1)     // Catch:{ ClassNotFoundException -> 0x00c7, JSONException -> 0x00bd }
            java.lang.String r1 = r3.toString()     // Catch:{ ClassNotFoundException -> 0x00c7, JSONException -> 0x00bd }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00c7, JSONException -> 0x00bd }
            java.lang.Object r1 = r8.m23662b(r1, r10)     // Catch:{ ClassNotFoundException -> 0x00c7, JSONException -> 0x00bd }
            return r1
        L_0x00bd:
            r0 = move-exception
            r1 = r0
            com.startapp.common.c.d r2 = new com.startapp.common.c.d     // Catch:{ Exception -> 0x0306 }
            java.lang.String r3 = "Problem instantiating object class "
            r2.<init>(r3, r1)     // Catch:{ Exception -> 0x0306 }
            throw r2     // Catch:{ Exception -> 0x0306 }
        L_0x00c7:
            r0 = move-exception
            r1 = r0
            com.startapp.common.c.d r2 = new com.startapp.common.c.d     // Catch:{ Exception -> 0x0306 }
            java.lang.String r3 = "Problem instantiating object class "
            r2.<init>(r3, r1)     // Catch:{ Exception -> 0x0306 }
            throw r2     // Catch:{ Exception -> 0x0306 }
        L_0x00d1:
            r14 = r9
            goto L_0x00e3
        L_0x00d3:
            java.lang.Class[] r3 = new java.lang.Class[r13]     // Catch:{ Exception -> 0x0306 }
            java.lang.reflect.Constructor r3 = r1.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0306 }
            r3.setAccessible(r12)     // Catch:{ Exception -> 0x0306 }
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0306 }
            java.lang.Object r3 = r3.newInstance(r4)     // Catch:{ Exception -> 0x0306 }
        L_0x00e2:
            r14 = r3
        L_0x00e3:
            java.lang.reflect.Field[] r3 = r21.getDeclaredFields()
            if (r2 == 0) goto L_0x00f3
            boolean r2 = r2.mo20533c()
            if (r2 == 0) goto L_0x00f3
            java.lang.reflect.Field[] r3 = r8.m23661a(r1, r3)
        L_0x00f3:
            r15 = r3
            int r7 = r15.length
            r6 = r13
        L_0x00f6:
            if (r6 >= r7) goto L_0x0305
            r5 = r15[r6]
            int r1 = r5.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r1)
            if (r2 != 0) goto L_0x02f9
            boolean r1 = java.lang.reflect.Modifier.isTransient(r1)
            if (r1 == 0) goto L_0x010c
            goto L_0x02f9
        L_0x010c:
            java.lang.String r4 = com.startapp.common.p196c.C5545c.m23670a(r5)
            boolean r1 = r10.has(r4)     // Catch:{ Exception -> 0x02d9, Throwable -> 0x02cf }
            if (r1 == 0) goto L_0x02a9
            r5.setAccessible(r12)     // Catch:{ Exception -> 0x02d9, Throwable -> 0x02cf }
            java.lang.annotation.Annotation[] r1 = r5.getDeclaredAnnotations()     // Catch:{ Exception -> 0x02d9, Throwable -> 0x02cf }
            int r1 = r1.length     // Catch:{ Exception -> 0x02d9, Throwable -> 0x02cf }
            if (r1 <= 0) goto L_0x0156
            java.lang.annotation.Annotation[] r1 = r5.getDeclaredAnnotations()     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            r1 = r1[r13]     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            java.lang.Class r2 = r1.annotationType()     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            java.lang.Class<com.startapp.common.c.f> r3 = com.startapp.common.p196c.C5548f.class
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            if (r2 == 0) goto L_0x0156
            com.startapp.common.c.f r1 = (com.startapp.common.p196c.C5548f) r1     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            java.lang.Class r2 = r1.mo20535b()     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            java.lang.Class r3 = r1.mo20537d()     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            java.lang.Class r16 = r1.mo20536c()     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            boolean r17 = r1.mo20534a()     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            java.lang.Class r1 = r1.mo20538e()     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            r18 = r16
            r16 = r1
            r1 = r12
            goto L_0x015f
        L_0x014e:
            r0 = move-exception
            r1 = r0
            r12 = r4
            r16 = r6
            r11 = r7
            goto L_0x02df
        L_0x0156:
            r2 = r9
            r3 = r2
            r16 = r3
            r18 = r16
            r1 = r13
            r17 = r1
        L_0x015f:
            java.lang.Class r11 = r5.getType()     // Catch:{ Exception -> 0x02d9, Throwable -> 0x02cf }
            java.lang.Class<com.startapp.common.c.e> r13 = com.startapp.common.p196c.C5547e.class
            java.lang.annotation.Annotation r11 = r11.getAnnotation(r13)     // Catch:{ Exception -> 0x02d9, Throwable -> 0x02cf }
            if (r11 == 0) goto L_0x01ab
            java.lang.Class r1 = r5.getType()     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            java.lang.Class<com.startapp.common.c.e> r2 = com.startapp.common.p196c.C5547e.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r2)     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            com.startapp.common.c.e r1 = (com.startapp.common.p196c.C5547e) r1     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            org.json.JSONObject r2 = r10.getJSONObject(r4)     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            java.lang.String r3 = r1.mo20531a()     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            java.lang.String r1 = r1.mo20532b()     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            r3.<init>()     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            r3.append(r1)     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            java.lang.String r1 = "."
            r3.append(r1)     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            r3.append(r2)     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            org.json.JSONObject r2 = r10.getJSONObject(r4)     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            java.lang.Object r1 = r8.m23662b(r1, r2)     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            r5.set(r14, r1)     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            goto L_0x01bc
        L_0x01ab:
            if (r17 == 0) goto L_0x01c3
            java.lang.Class r1 = r5.getType()     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            org.json.JSONObject r2 = r10.getJSONObject(r4)     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            java.lang.Object r1 = r8.m23662b(r1, r2)     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            r5.set(r14, r1)     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
        L_0x01bc:
            r16 = r6
            r11 = r7
            r5 = 2
            r7 = 0
            goto L_0x02fe
        L_0x01c3:
            if (r1 == 0) goto L_0x0246
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r2)     // Catch:{ Exception -> 0x02d9, Throwable -> 0x02cf }
            if (r1 != 0) goto L_0x01d5
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r1 = r1.isAssignableFrom(r2)     // Catch:{ Exception -> 0x014e, Throwable -> 0x02cf }
            if (r1 == 0) goto L_0x0246
        L_0x01d5:
            java.lang.Class<java.util.HashMap> r1 = java.util.HashMap.class
            boolean r1 = r2.equals(r1)     // Catch:{ Exception -> 0x02d9, Throwable -> 0x02cf }
            if (r1 == 0) goto L_0x01fe
            org.json.JSONObject r11 = r10.getJSONObject(r4)     // Catch:{ Exception -> 0x02d9, Throwable -> 0x02cf }
            java.util.Iterator r13 = r11.keys()     // Catch:{ Exception -> 0x02d9, Throwable -> 0x02cf }
            r1 = r8
            r2 = r3
            r3 = r18
            r12 = r4
            r4 = r16
            r19 = r5
            r16 = r6
            r6 = r11
            r11 = r7
            r7 = r13
            java.util.Map r1 = r1.m23658a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            r3 = r19
            r3.set(r14, r1)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            goto L_0x02c9
        L_0x01fe:
            r12 = r4
            r3 = r5
            r16 = r6
            r11 = r7
            java.lang.Class<java.util.ArrayList> r1 = java.util.ArrayList.class
            boolean r1 = r2.equals(r1)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            if (r1 == 0) goto L_0x021a
            org.json.JSONArray r1 = r10.getJSONArray(r12)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            r4 = r18
            java.util.List r1 = r8.m23663b(r4, r3, r1)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            r3.set(r14, r1)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            goto L_0x02c9
        L_0x021a:
            r4 = r18
            java.lang.Class<java.util.HashSet> r1 = java.util.HashSet.class
            boolean r1 = r2.equals(r1)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            if (r1 == 0) goto L_0x0231
            org.json.JSONArray r1 = r10.getJSONArray(r12)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            java.util.Set r1 = r8.m23660a(r4, r1)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            r3.set(r14, r1)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            goto L_0x02c9
        L_0x0231:
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            boolean r1 = r2.equals(r1)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            if (r1 == 0) goto L_0x02c9
            org.json.JSONArray r1 = r10.getJSONArray(r12)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            java.util.Set r1 = r8.m23659a(r4, r3, r1)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            r3.set(r14, r1)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            goto L_0x02c9
        L_0x0246:
            r12 = r4
            r3 = r5
            r16 = r6
            r11 = r7
            java.lang.Class r1 = r3.getType()     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            boolean r1 = r1.isEnum()     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            if (r1 == 0) goto L_0x0263
            java.lang.Object r1 = r10.get(r12)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            java.lang.Enum r1 = r8.m23652a(r1, r2)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            r3.set(r14, r1)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            goto L_0x02c9
        L_0x0263:
            java.lang.Class r1 = r3.getType()     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            boolean r1 = r1.isPrimitive()     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            if (r1 == 0) goto L_0x027d
            java.lang.Object r1 = r10.get(r12)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            java.lang.Class r2 = r3.getType()     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            java.lang.Object r1 = m23656a(r10, r3, r1, r2)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            r3.set(r14, r1)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            goto L_0x02c9
        L_0x027d:
            java.lang.Class r1 = r3.getType()     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            boolean r1 = r1.isArray()     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            if (r1 == 0) goto L_0x028f
            java.lang.Object r1 = r8.m23654a(r10, r2, r3)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            r3.set(r14, r1)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            goto L_0x02c9
        L_0x028f:
            java.lang.Object r1 = r10.get(r12)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            java.lang.Class r2 = r3.getType()     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            java.lang.Object r1 = m23653a(r1, r2)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            boolean r2 = r1.equals(r9)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            if (r2 == 0) goto L_0x02a5
            r3.set(r14, r9)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            goto L_0x02c9
        L_0x02a5:
            r3.set(r14, r1)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            goto L_0x02c9
        L_0x02a9:
            r12 = r4
            r16 = r6
            r11 = r7
            java.lang.Boolean r1 = com.startapp.common.Constants.m23468a()     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            if (r1 == 0) goto L_0x02c9
            java.lang.String r1 = "JSONInputStream"
            r2 = 4
            java.lang.String r3 = "Field [%s] doesn't exist. Keeping default value."
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            r4 = 0
            r5[r4] = r12     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            java.lang.String r3 = java.lang.String.format(r3, r5)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
            com.startapp.common.p193a.C5518g.m23563a(r1, r2, r3)     // Catch:{ Exception -> 0x02cd, Throwable -> 0x02cf }
        L_0x02c9:
            r5 = 2
            r7 = 0
            r12 = 1
            goto L_0x02fe
        L_0x02cd:
            r0 = move-exception
            goto L_0x02de
        L_0x02cf:
            r0 = move-exception
            r1 = r0
            com.startapp.common.c.d r2 = new com.startapp.common.c.d
            java.lang.String r3 = "Unknown error occurred "
            r2.<init>(r3, r1)
            throw r2
        L_0x02d9:
            r0 = move-exception
            r12 = r4
            r16 = r6
            r11 = r7
        L_0x02de:
            r1 = r0
        L_0x02df:
            java.lang.String r2 = "JSONInputStream"
            r3 = 6
            java.lang.String r4 = "Failed to get field [%s] %s"
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r12
            java.lang.String r1 = r1.toString()
            r12 = 1
            r6[r12] = r1
            java.lang.String r1 = java.lang.String.format(r4, r6)
            com.startapp.common.p193a.C5518g.m23563a(r2, r3, r1)
            goto L_0x02fe
        L_0x02f9:
            r16 = r6
            r5 = r11
            r11 = r7
            r7 = r13
        L_0x02fe:
            int r6 = r16 + 1
            r13 = r7
            r7 = r11
            r11 = r5
            goto L_0x00f6
        L_0x0305:
            return r14
        L_0x0306:
            r0 = move-exception
            r1 = r0
            com.startapp.common.c.d r2 = new com.startapp.common.c.d
            java.lang.String r3 = "Can't deserialize the object. Failed to instantiate object."
            r2.<init>(r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.common.p196c.C5543a.m23662b(java.lang.Class, org.json.JSONObject):java.lang.Object");
    }

    /* renamed from: a */
    private <T> Field[] m23661a(Class<T> cls, Field[] fieldArr) {
        int length = fieldArr.length;
        Field[] declaredFields = cls.getSuperclass().getDeclaredFields();
        int length2 = declaredFields.length;
        Field[] fieldArr2 = new Field[(length + length2)];
        System.arraycopy(fieldArr, 0, fieldArr2, 0, length);
        System.arraycopy(declaredFields, 0, fieldArr2, length, length2);
        return fieldArr2;
    }

    /* renamed from: a */
    private Enum<?> m23652a(String str, Class cls) {
        return Enum.valueOf(cls, str);
    }

    /* renamed from: a */
    private Object m23655a(JSONObject jSONObject, Field field) {
        Object obj;
        JSONArray jSONArray = jSONObject.getJSONArray(C5545c.m23670a(field));
        int length = jSONArray.length();
        Class cls = (Class) f17623a.get(field.getType().getSimpleName());
        Object newInstance = Array.newInstance((Class) cls.getField("TYPE").get(null), length);
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            Class<String> cls2 = String.class;
            if (cls.equals(Character.class)) {
                cls2 = Character.TYPE;
            }
            Constructor constructor = cls.getConstructor(new Class[]{cls2});
            if (cls.equals(Character.class)) {
                obj = constructor.newInstance(new Object[]{Character.valueOf(string.charAt(0))});
            } else {
                obj = constructor.newInstance(new Object[]{string});
            }
            Array.set(newInstance, i, obj);
        }
        return newInstance;
    }

    /* renamed from: a */
    private <T> Object m23654a(JSONObject jSONObject, Class<T> cls, Field field) {
        if (cls != null) {
            return m23664b(jSONObject, cls, field);
        }
        return m23655a(jSONObject, field);
    }

    /* renamed from: b */
    private <T> T[] m23664b(JSONObject jSONObject, Class<T> cls, Field field) {
        JSONArray jSONArray = jSONObject.getJSONArray(C5545c.m23670a(field));
        int length = jSONArray.length();
        Object newInstance = Array.newInstance(cls, length);
        for (int i = 0; i < length; i++) {
            Array.set(newInstance, i, m23662b(cls, jSONArray.getJSONObject(i)));
        }
        return (Object[]) newInstance;
    }

    /* renamed from: a */
    private <K, V> Map<K, V> m23658a(Class<K> cls, Class<V> cls2, Class cls3, Field field, JSONObject jSONObject, Iterator<K> it) {
        HashMap hashMap = new HashMap();
        while (it.hasNext()) {
            Object next = it.next();
            Object cast = cls.equals(Integer.class) ? cls.cast(Integer.valueOf(Integer.parseInt((String) next))) : next;
            if (cls.isEnum()) {
                cast = m23652a(cast.toString(), (Class) cls);
            }
            String str = (String) next;
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                JSONArray optJSONArray = jSONObject.optJSONArray(str);
                if (optJSONArray != null) {
                    hashMap.put(cast, m23660a(cls3, optJSONArray));
                } else if (cls2.isEnum()) {
                    hashMap.put(cast, m23652a((String) jSONObject.get(str), (Class) cls2));
                } else {
                    hashMap.put(cast, jSONObject.get(str));
                }
            } else {
                hashMap.put(cast, m23662b(cls2, optJSONObject));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private <V> Set<V> m23660a(Class<V> cls, JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                hashSet.add(jSONArray.get(i));
            } else {
                hashSet.add(m23662b(cls, optJSONObject));
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    private <V> Set m23659a(Class<V> cls, Field field, JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(m23652a(jSONArray.getString(i), (Class) cls));
        }
        return hashSet;
    }

    /* renamed from: b */
    private <V> List<V> m23663b(Class<V> cls, Field field, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                arrayList.add(jSONArray.get(i));
            } else {
                arrayList.add(m23662b(cls, optJSONObject));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Object m23653a(Object obj, Class<?> cls) {
        if (obj.getClass().equals(cls)) {
            return obj;
        }
        if (!cls.equals(Integer.class)) {
            return (!cls.equals(Long.class) || !obj.getClass().equals(Integer.class)) ? obj : Long.valueOf(((Integer) obj).longValue());
        }
        if (obj.getClass().equals(Double.class)) {
            return Integer.valueOf(((Double) obj).intValue());
        }
        if (obj.getClass().equals(Long.class)) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        return obj;
    }

    /* renamed from: a */
    private static Object m23656a(JSONObject jSONObject, Field field, Object obj, Class<?> cls) {
        if (obj.getClass().equals(cls)) {
            return obj;
        }
        if (obj.getClass().equals(String.class)) {
            if (cls.equals(Integer.TYPE)) {
                return Integer.valueOf(jSONObject.getInt(C5545c.m23670a(field)));
            }
            return obj;
        } else if (cls.equals(Integer.TYPE)) {
            return Integer.valueOf(((Number) obj).intValue());
        } else {
            if (cls.equals(Float.TYPE)) {
                return Float.valueOf(((Number) obj).floatValue());
            }
            if (cls.equals(Long.TYPE)) {
                return Long.valueOf(((Number) obj).longValue());
            }
            return cls.equals(Double.TYPE) ? Double.valueOf(((Number) obj).doubleValue()) : obj;
        }
    }

    /* renamed from: a */
    private static String m23657a(InputStream inputStream, String str) {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
            } catch (Exception e) {
                C5518g.m23563a("JSONInputStream", 6, String.format("Can't create BufferedReader [%s]", new Object[]{e.toString()}));
                throw e;
            }
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        }
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return sb.toString();
                }
                sb.append(readLine);
            } catch (IOException e2) {
                C5518g.m23563a("JSONInputStream", 6, String.format("Can't Can't read input stream [%s]", new Object[]{e2.toString()}));
                throw e2;
            }
        }
    }

    static {
        f17623a.put("int[]", Integer.class);
        f17623a.put("long[]", Long.class);
        f17623a.put("double[]", Double.class);
        f17623a.put("float[]", Float.class);
        f17623a.put("bool[]", Boolean.class);
        f17623a.put("char[]", Character.class);
        f17623a.put("byte[]", Byte.class);
        f17623a.put("void[]", Void.class);
        f17623a.put("short[]", Short.class);
    }
}

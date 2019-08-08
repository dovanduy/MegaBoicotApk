package com.facebook.ads.internal.p084k;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.appnext.base.p046b.C1245d;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p115w.p117b.C2327o;
import com.facebook.ads.internal.p115w.p117b.C2332s;
import com.facebook.ads.internal.p115w.p117b.C2339v;
import com.facebook.ads.internal.p115w.p121f.C2362a;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.k.e */
public class C1756e {

    /* renamed from: a */
    private static final String f5501a = "com.facebook.ads.internal.k.e";

    /* renamed from: b */
    private static final Object f5502b = new Object();

    /* renamed from: c */
    private static final Set<String> f5503c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d */
    private static final Map<String, Integer> f5504d = Collections.synchronizedMap(new HashMap());

    /* renamed from: e */
    private static AtomicInteger f5505e = new AtomicInteger();

    /* renamed from: a */
    public static C1755d m7278a(Exception exc, Context context, Map<String, String> map) {
        C1755d dVar;
        try {
            dVar = new C1755d(C2327o.m9053b(), C2327o.m9054c(), new C1753b(C2332s.m9057a((Throwable) exc), map, true).mo7570a());
            try {
                m7281a(dVar, context);
                return dVar;
            } catch (Exception unused) {
                return dVar;
            }
        } catch (Exception unused2) {
            dVar = null;
            return dVar;
        }
    }

    /* renamed from: a */
    public static JSONArray m7279a(Context context) {
        return m7280a(context, -1);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [int] */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r9v5, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r9v9, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r9v14, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13, types: [java.io.Reader, java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r9v16, types: [int] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r9v18, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: type inference failed for: r9v20, types: [int] */
    /* JADX WARNING: type inference failed for: r9v22 */
    /* JADX WARNING: type inference failed for: r9v23 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r9v24 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r9v25 */
    /* JADX WARNING: type inference failed for: r9v26 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r9v27 */
    /* JADX WARNING: type inference failed for: r9v28 */
    /* JADX WARNING: type inference failed for: r9v29 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r9v30 */
    /* JADX WARNING: type inference failed for: r9v31 */
    /* JADX WARNING: type inference failed for: r9v32 */
    /* JADX WARNING: type inference failed for: r9v33 */
    /* JADX WARNING: type inference failed for: r9v34 */
    /* JADX WARNING: type inference failed for: r9v35 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=null, for r9v0, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v2
      assigns: []
      uses: []
      mth insns count: 149
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
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e9 A[SYNTHETIC, Splitter:B:64:0x00e9] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f1 A[Catch:{ IOException -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f6 A[Catch:{ IOException -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0105 A[SYNTHETIC, Splitter:B:79:0x0105] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010f A[Catch:{ IOException -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0114 A[Catch:{ IOException -> 0x010b }] */
    /* JADX WARNING: Unknown variable types count: 21 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONArray m7280a(android.content.Context r8, int r9) {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Object r1 = f5502b
            monitor-enter(r1)
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ IOException | JSONException -> 0x00dd, all -> 0x00d8 }
            java.io.File r4 = r8.getFilesDir()     // Catch:{ IOException | JSONException -> 0x00dd, all -> 0x00d8 }
            java.lang.String r5 = "debuglogs"
            java.lang.String r5 = com.facebook.ads.internal.p115w.p121f.C2362a.m9138a(r5, r8)     // Catch:{ IOException | JSONException -> 0x00dd, all -> 0x00d8 }
            r3.<init>(r4, r5)     // Catch:{ IOException | JSONException -> 0x00dd, all -> 0x00d8 }
            boolean r3 = r3.exists()     // Catch:{ IOException | JSONException -> 0x00dd, all -> 0x00d8 }
            if (r3 == 0) goto L_0x00bb
            java.lang.String r3 = "debuglogs"
            java.lang.String r3 = com.facebook.ads.internal.p115w.p121f.C2362a.m9138a(r3, r8)     // Catch:{ IOException | JSONException -> 0x00dd, all -> 0x00d8 }
            java.io.FileInputStream r8 = r8.openFileInput(r3)     // Catch:{ IOException | JSONException -> 0x00dd, all -> 0x00d8 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException | JSONException -> 0x00b8, all -> 0x00b5 }
            r3.<init>(r8)     // Catch:{ IOException | JSONException -> 0x00b8, all -> 0x00b5 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException | JSONException -> 0x00b3 }
            r4.<init>(r3)     // Catch:{ IOException | JSONException -> 0x00b3 }
        L_0x0032:
            java.lang.String r2 = r4.readLine()     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            if (r2 == 0) goto L_0x00ab
            if (r9 == 0) goto L_0x00ab
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            r5.<init>(r2)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            java.lang.String r2 = "attempt"
            boolean r2 = r5.has(r2)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            if (r2 != 0) goto L_0x0051
            java.lang.String r2 = "attempt"
            r6 = 0
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            r5.put(r2, r6)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
        L_0x0051:
            java.lang.String r2 = "id"
            java.lang.String r2 = r5.getString(r2)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            java.util.Set<java.lang.String> r6 = f5503c     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            boolean r6 = r6.contains(r2)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            if (r6 != 0) goto L_0x0032
            java.lang.String r6 = "attempt"
            int r6 = r5.getInt(r6)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            java.util.Map<java.lang.String, java.lang.Integer> r7 = f5504d     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            boolean r7 = r7.containsKey(r2)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            if (r7 == 0) goto L_0x007d
            java.lang.String r6 = "attempt"
            java.util.Map<java.lang.String, java.lang.Integer> r7 = f5504d     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            java.lang.Object r2 = r7.get(r2)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            r5.put(r6, r2)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            goto L_0x00a3
        L_0x007d:
            java.util.Set<java.lang.String> r7 = f5503c     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            boolean r7 = r7.contains(r2)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            if (r7 == 0) goto L_0x008d
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            java.lang.String r2 = "finished event should not be updated to OngoingEvent."
            r9.<init>(r2)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            throw r9     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
        L_0x008d:
            java.util.Map<java.lang.String, java.lang.Integer> r7 = f5504d     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            boolean r7 = r7.containsKey(r2)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            if (r7 == 0) goto L_0x009a
            java.util.Map<java.lang.String, java.lang.Integer> r7 = f5504d     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            r7.remove(r2)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
        L_0x009a:
            java.util.Map<java.lang.String, java.lang.Integer> r7 = f5504d     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            r7.put(r2, r6)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
        L_0x00a3:
            r0.put(r5)     // Catch:{ IOException | JSONException -> 0x00b0, all -> 0x00ad }
            if (r9 <= 0) goto L_0x0032
            int r9 = r9 + -1
            goto L_0x0032
        L_0x00ab:
            r2 = r4
            goto L_0x00bd
        L_0x00ad:
            r9 = move-exception
            goto L_0x0103
        L_0x00b0:
            r9 = move-exception
            r2 = r4
            goto L_0x00e0
        L_0x00b3:
            r9 = move-exception
            goto L_0x00e0
        L_0x00b5:
            r9 = move-exception
            r3 = r2
            goto L_0x00db
        L_0x00b8:
            r9 = move-exception
            r3 = r2
            goto L_0x00e0
        L_0x00bb:
            r8 = r2
            r3 = r8
        L_0x00bd:
            if (r2 == 0) goto L_0x00c5
            r2.close()     // Catch:{ IOException -> 0x00c3 }
            goto L_0x00c5
        L_0x00c3:
            r8 = move-exception
            goto L_0x00d0
        L_0x00c5:
            if (r3 == 0) goto L_0x00ca
            r3.close()     // Catch:{ IOException -> 0x00c3 }
        L_0x00ca:
            if (r8 == 0) goto L_0x00ff
            r8.close()     // Catch:{ IOException -> 0x00c3 }
            goto L_0x00ff
        L_0x00d0:
            java.lang.String r9 = f5501a     // Catch:{ all -> 0x0109 }
            java.lang.String r2 = "Failed to close buffers"
        L_0x00d4:
            android.util.Log.e(r9, r2, r8)     // Catch:{ all -> 0x0109 }
            goto L_0x00ff
        L_0x00d8:
            r9 = move-exception
            r8 = r2
            r3 = r8
        L_0x00db:
            r4 = r3
            goto L_0x0103
        L_0x00dd:
            r9 = move-exception
            r8 = r2
            r3 = r8
        L_0x00e0:
            java.lang.String r4 = f5501a     // Catch:{ all -> 0x0101 }
            java.lang.String r5 = "Failed to read crashes"
            android.util.Log.e(r4, r5, r9)     // Catch:{ all -> 0x0101 }
            if (r2 == 0) goto L_0x00ef
            r2.close()     // Catch:{ IOException -> 0x00ed }
            goto L_0x00ef
        L_0x00ed:
            r8 = move-exception
            goto L_0x00fa
        L_0x00ef:
            if (r3 == 0) goto L_0x00f4
            r3.close()     // Catch:{ IOException -> 0x00ed }
        L_0x00f4:
            if (r8 == 0) goto L_0x00ff
            r8.close()     // Catch:{ IOException -> 0x00ed }
            goto L_0x00ff
        L_0x00fa:
            java.lang.String r9 = f5501a     // Catch:{ all -> 0x0109 }
            java.lang.String r2 = "Failed to close buffers"
            goto L_0x00d4
        L_0x00ff:
            monitor-exit(r1)     // Catch:{ all -> 0x0109 }
            return r0
        L_0x0101:
            r9 = move-exception
            r4 = r2
        L_0x0103:
            if (r4 == 0) goto L_0x010d
            r4.close()     // Catch:{ IOException -> 0x010b }
            goto L_0x010d
        L_0x0109:
            r8 = move-exception
            goto L_0x0120
        L_0x010b:
            r8 = move-exception
            goto L_0x0118
        L_0x010d:
            if (r3 == 0) goto L_0x0112
            r3.close()     // Catch:{ IOException -> 0x010b }
        L_0x0112:
            if (r8 == 0) goto L_0x011f
            r8.close()     // Catch:{ IOException -> 0x010b }
            goto L_0x011f
        L_0x0118:
            java.lang.String r0 = f5501a     // Catch:{ all -> 0x0109 }
            java.lang.String r2 = "Failed to close buffers"
            android.util.Log.e(r0, r2, r8)     // Catch:{ all -> 0x0109 }
        L_0x011f:
            throw r9     // Catch:{ all -> 0x0109 }
        L_0x0120:
            monitor-exit(r1)     // Catch:{ all -> 0x0109 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p084k.C1756e.m7280a(android.content.Context, int):org.json.JSONArray");
    }

    /* renamed from: a */
    public static void m7281a(C1755d dVar, Context context) {
        if (dVar != null && context != null) {
            synchronized (f5502b) {
                try {
                    String a = C2362a.m9138a("debuglogs", context);
                    File file = new File(context.getFilesDir(), a);
                    if (file.exists()) {
                        int ae = C1795a.m7439ae(context);
                        long length = file.length();
                        if (ae > 0 && length > ((long) ae)) {
                            boolean delete = file.delete();
                            m7284b(context, 0);
                            f5503c.clear();
                            f5504d.clear();
                            if (!delete) {
                                Log.e(AudienceNetworkAds.TAG, "Can't delete debug events file.");
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Purge debug events file. File size: ");
                                sb.append(length);
                                sb.append(", DropCounter: ");
                                sb.append(f5505e.getAndIncrement());
                                m7278a(new Exception(sb.toString()), context, new HashMap());
                                return;
                            }
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TtmlNode.ATTR_ID, UUID.randomUUID().toString());
                    jSONObject.put(C1245d.f3961jd, dVar.mo7569a());
                    jSONObject.put(C1245d.f3955iX, C2339v.m9068a(dVar.mo7572b()));
                    jSONObject.put("session_time", C2339v.m9068a(dVar.mo7573c()));
                    jSONObject.put("session_id", dVar.mo7574d());
                    jSONObject.put("data", dVar.mo7575e() != null ? new JSONObject(dVar.mo7575e()) : new JSONObject());
                    jSONObject.put("attempt", String.valueOf(0));
                    FileOutputStream openFileOutput = context.openFileOutput(a, 32768);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(jSONObject.toString());
                    sb2.append("\n");
                    openFileOutput.write(sb2.toString().getBytes());
                    openFileOutput.close();
                    m7284b(context, context.getApplicationContext().getSharedPreferences(C2362a.m9138a("DEBUG_PREF", context), 0).getInt("EventCount", 0) + 1);
                } catch (Exception e) {
                    Log.e(f5501a, "Failed to store crash", e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m7282a(String str) {
        Integer num = (Integer) f5504d.get(str);
        if (num == null) {
            num = Integer.valueOf(0);
        } else {
            f5504d.remove(str);
        }
        f5504d.put(str, Integer.valueOf(num.intValue() + 1));
    }

    /* renamed from: b */
    public static void m7283b(Context context) {
        synchronized (f5502b) {
            File file = new File(context.getFilesDir(), C2362a.m9138a("debuglogs", context));
            if (file.exists()) {
                file.delete();
            }
            m7284b(context, 0);
            f5503c.clear();
            f5504d.clear();
        }
    }

    /* renamed from: b */
    private static void m7284b(Context context, int i) {
        Editor edit = context.getApplicationContext().getSharedPreferences(C2362a.m9138a("DEBUG_PREF", context), 0).edit();
        String str = "EventCount";
        if (i < 0) {
            i = 0;
        }
        edit.putInt(str, i).apply();
    }

    /* renamed from: b */
    public static void m7285b(String str) {
        if (f5504d.containsKey(str)) {
            f5504d.remove(str);
        }
        f5503c.add(str);
    }

    /* renamed from: c */
    public static int m7286c(Context context) {
        return context.getApplicationContext().getSharedPreferences(C2362a.m9138a("DEBUG_PREF", context), 0).getInt("EventCount", 0) - f5503c.size();
    }

    /* renamed from: c */
    public static boolean m7287c(String str) {
        return f5503c.contains(str) || f5504d.containsKey(str);
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v7, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.io.Reader, java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v9, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v17, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v1
      assigns: []
      uses: []
      mth insns count: 176
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
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0144 A[Catch:{ IOException -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0102 A[SYNTHETIC, Splitter:B:70:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010a A[Catch:{ IOException -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x010f A[Catch:{ IOException -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0114 A[Catch:{ IOException -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0130 A[SYNTHETIC, Splitter:B:89:0x0130] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013a A[Catch:{ IOException -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x013f A[Catch:{ IOException -> 0x0136 }] */
    /* JADX WARNING: Unknown variable types count: 20 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m7288d(android.content.Context r11) {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Object r1 = f5502b
            monitor-enter(r1)
            r2 = 0
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch:{ IOException | JSONException -> 0x00f5, all -> 0x00f0 }
            java.io.File r5 = r11.getFilesDir()     // Catch:{ IOException | JSONException -> 0x00f5, all -> 0x00f0 }
            java.lang.String r6 = "debuglogs"
            java.lang.String r6 = com.facebook.ads.internal.p115w.p121f.C2362a.m9138a(r6, r11)     // Catch:{ IOException | JSONException -> 0x00f5, all -> 0x00f0 }
            r4.<init>(r5, r6)     // Catch:{ IOException | JSONException -> 0x00f5, all -> 0x00f0 }
            boolean r4 = r4.exists()     // Catch:{ IOException | JSONException -> 0x00f5, all -> 0x00f0 }
            if (r4 == 0) goto L_0x00b8
            java.lang.String r4 = "debuglogs"
            java.lang.String r4 = com.facebook.ads.internal.p115w.p121f.C2362a.m9138a(r4, r11)     // Catch:{ IOException | JSONException -> 0x00f5, all -> 0x00f0 }
            java.io.FileInputStream r4 = r11.openFileInput(r4)     // Catch:{ IOException | JSONException -> 0x00f5, all -> 0x00f0 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException | JSONException -> 0x00b4, all -> 0x00b1 }
            r5.<init>(r4)     // Catch:{ IOException | JSONException -> 0x00b4, all -> 0x00b1 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ IOException | JSONException -> 0x00ae, all -> 0x00aa }
            r6.<init>(r5)     // Catch:{ IOException | JSONException -> 0x00ae, all -> 0x00aa }
        L_0x0033:
            java.lang.String r7 = r6.readLine()     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            if (r7 == 0) goto L_0x0067
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            r8.<init>(r7)     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            java.lang.String r7 = "id"
            java.lang.String r7 = r8.getString(r7)     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            java.util.Set<java.lang.String> r9 = f5503c     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            boolean r9 = r9.contains(r7)     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            if (r9 != 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Integer> r9 = f5504d     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            boolean r9 = r9.containsKey(r7)     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            if (r9 == 0) goto L_0x0063
            java.lang.String r9 = "attempt"
            java.util.Map<java.lang.String, java.lang.Integer> r10 = f5504d     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            java.lang.Object r7 = r10.get(r7)     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            r8.put(r9, r7)     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
        L_0x0063:
            r0.put(r8)     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            goto L_0x0033
        L_0x0067:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            r7.<init>()     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            int r8 = r0.length()     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            r9 = r2
        L_0x0071:
            if (r9 >= r8) goto L_0x0086
            org.json.JSONObject r10 = r0.getJSONObject(r9)     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            r7.append(r10)     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            r10 = 10
            r7.append(r10)     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            int r9 = r9 + 1
            goto L_0x0071
        L_0x0086:
            java.lang.String r0 = "debuglogs"
            java.lang.String r0 = com.facebook.ads.internal.p115w.p121f.C2362a.m9138a(r0, r11)     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            java.io.FileOutputStream r0 = r11.openFileOutput(r0, r2)     // Catch:{ IOException | JSONException -> 0x00a5, all -> 0x00a2 }
            java.lang.String r3 = r7.toString()     // Catch:{ IOException | JSONException -> 0x00a0, all -> 0x009d }
            byte[] r3 = r3.getBytes()     // Catch:{ IOException | JSONException -> 0x00a0, all -> 0x009d }
            r0.write(r3)     // Catch:{ IOException | JSONException -> 0x00a0, all -> 0x009d }
            r3 = r6
            goto L_0x00bb
        L_0x009d:
            r11 = move-exception
            goto L_0x012d
        L_0x00a0:
            r11 = move-exception
            goto L_0x00a7
        L_0x00a2:
            r11 = move-exception
            goto L_0x012e
        L_0x00a5:
            r11 = move-exception
            r0 = r3
        L_0x00a7:
            r3 = r6
            goto L_0x00f9
        L_0x00aa:
            r11 = move-exception
            r6 = r3
            goto L_0x012e
        L_0x00ae:
            r11 = move-exception
            r0 = r3
            goto L_0x00f9
        L_0x00b1:
            r11 = move-exception
            r5 = r3
            goto L_0x00f3
        L_0x00b4:
            r11 = move-exception
            r0 = r3
            r5 = r0
            goto L_0x00f9
        L_0x00b8:
            r0 = r3
            r4 = r0
            r5 = r4
        L_0x00bb:
            int r6 = m7286c(r11)     // Catch:{ IOException | JSONException -> 0x00ee }
            m7284b(r11, r6)     // Catch:{ IOException | JSONException -> 0x00ee }
            if (r3 == 0) goto L_0x00ca
            r3.close()     // Catch:{ IOException -> 0x00c8 }
            goto L_0x00ca
        L_0x00c8:
            r11 = move-exception
            goto L_0x00da
        L_0x00ca:
            if (r5 == 0) goto L_0x00cf
            r5.close()     // Catch:{ IOException -> 0x00c8 }
        L_0x00cf:
            if (r4 == 0) goto L_0x00d4
            r4.close()     // Catch:{ IOException -> 0x00c8 }
        L_0x00d4:
            if (r0 == 0) goto L_0x00e1
            r0.close()     // Catch:{ IOException -> 0x00c8 }
            goto L_0x00e1
        L_0x00da:
            java.lang.String r0 = f5501a     // Catch:{ all -> 0x0134 }
            java.lang.String r2 = "Failed to close buffers"
            android.util.Log.e(r0, r2, r11)     // Catch:{ all -> 0x0134 }
        L_0x00e1:
            java.util.Set<java.lang.String> r11 = f5503c     // Catch:{ all -> 0x0134 }
            r11.clear()     // Catch:{ all -> 0x0134 }
            java.util.Map<java.lang.String, java.lang.Integer> r11 = f5504d     // Catch:{ all -> 0x0134 }
            r11.clear()     // Catch:{ all -> 0x0134 }
            monitor-exit(r1)     // Catch:{ all -> 0x0134 }
            r11 = 1
            return r11
        L_0x00ee:
            r11 = move-exception
            goto L_0x00f9
        L_0x00f0:
            r11 = move-exception
            r4 = r3
            r5 = r4
        L_0x00f3:
            r6 = r5
            goto L_0x012e
        L_0x00f5:
            r11 = move-exception
            r0 = r3
            r4 = r0
            r5 = r4
        L_0x00f9:
            java.lang.String r6 = f5501a     // Catch:{ all -> 0x012b }
            java.lang.String r7 = "Failed to rewrite File."
            android.util.Log.e(r6, r7, r11)     // Catch:{ all -> 0x012b }
            if (r3 == 0) goto L_0x0108
            r3.close()     // Catch:{ IOException -> 0x0106 }
            goto L_0x0108
        L_0x0106:
            r11 = move-exception
            goto L_0x0118
        L_0x0108:
            if (r5 == 0) goto L_0x010d
            r5.close()     // Catch:{ IOException -> 0x0106 }
        L_0x010d:
            if (r4 == 0) goto L_0x0112
            r4.close()     // Catch:{ IOException -> 0x0106 }
        L_0x0112:
            if (r0 == 0) goto L_0x011f
            r0.close()     // Catch:{ IOException -> 0x0106 }
            goto L_0x011f
        L_0x0118:
            java.lang.String r0 = f5501a     // Catch:{ all -> 0x0134 }
            java.lang.String r3 = "Failed to close buffers"
            android.util.Log.e(r0, r3, r11)     // Catch:{ all -> 0x0134 }
        L_0x011f:
            java.util.Set<java.lang.String> r11 = f5503c     // Catch:{ all -> 0x0134 }
            r11.clear()     // Catch:{ all -> 0x0134 }
            java.util.Map<java.lang.String, java.lang.Integer> r11 = f5504d     // Catch:{ all -> 0x0134 }
            r11.clear()     // Catch:{ all -> 0x0134 }
            monitor-exit(r1)     // Catch:{ all -> 0x0134 }
            return r2
        L_0x012b:
            r11 = move-exception
            r6 = r3
        L_0x012d:
            r3 = r0
        L_0x012e:
            if (r6 == 0) goto L_0x0138
            r6.close()     // Catch:{ IOException -> 0x0136 }
            goto L_0x0138
        L_0x0134:
            r11 = move-exception
            goto L_0x015a
        L_0x0136:
            r0 = move-exception
            goto L_0x0148
        L_0x0138:
            if (r5 == 0) goto L_0x013d
            r5.close()     // Catch:{ IOException -> 0x0136 }
        L_0x013d:
            if (r4 == 0) goto L_0x0142
            r4.close()     // Catch:{ IOException -> 0x0136 }
        L_0x0142:
            if (r3 == 0) goto L_0x014f
            r3.close()     // Catch:{ IOException -> 0x0136 }
            goto L_0x014f
        L_0x0148:
            java.lang.String r2 = f5501a     // Catch:{ all -> 0x0134 }
            java.lang.String r3 = "Failed to close buffers"
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x0134 }
        L_0x014f:
            java.util.Set<java.lang.String> r0 = f5503c     // Catch:{ all -> 0x0134 }
            r0.clear()     // Catch:{ all -> 0x0134 }
            java.util.Map<java.lang.String, java.lang.Integer> r0 = f5504d     // Catch:{ all -> 0x0134 }
            r0.clear()     // Catch:{ all -> 0x0134 }
            throw r11     // Catch:{ all -> 0x0134 }
        L_0x015a:
            monitor-exit(r1)     // Catch:{ all -> 0x0134 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p084k.C1756e.m7288d(android.content.Context):boolean");
    }
}

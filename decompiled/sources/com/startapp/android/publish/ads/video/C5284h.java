package com.startapp.android.publish.ads.video;

import android.content.Context;
import com.startapp.android.publish.ads.video.p171a.C5210a;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.C5414k;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.activities.FullScreenActivity;
import com.startapp.android.publish.cache.C5436a;
import com.startapp.android.publish.cache.C5450g;

/* renamed from: com.startapp.android.publish.ads.video.h */
/* compiled from: StartAppSDK */
public class C5284h {

    /* renamed from: com.startapp.android.publish.ads.video.h$a */
    /* compiled from: StartAppSDK */
    public enum C5285a {
        ELIGIBLE(""),
        INELIGIBLE_NO_STORAGE("Not enough storage for video"),
        INELIGIBLE_MISSING_ACTIVITY("FullScreenActivity not declared in AndroidManifest.xml"),
        INELIGIBLE_ERRORS_THRESHOLD_REACHED("Video errors threshold reached.");
        
        private String desctiption;

        private C5285a(String str) {
            this.desctiption = str;
        }

        /* renamed from: a */
        public String mo19410a() {
            return this.desctiption;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.DataInputStream, java.io.FileOutputStream, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.io.DataInputStream] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.DataInputStream] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8, types: [java.io.DataInputStream] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v8, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [java.io.DataInputStream, java.io.FileOutputStream, java.io.InputStream]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [?[OBJECT, ARRAY], java.io.InputStream, java.io.DataInputStream, java.io.FileOutputStream]
      mth insns count: 105
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 20 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m22595a(android.content.Context r9, java.net.URL r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "StartAppWall.VideoUtil"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Downloading video from "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r2 = 3
            com.startapp.common.p193a.C5518g.m23563a(r0, r2, r1)
            r0 = 0
            java.lang.String r1 = m22594a(r9, r11)     // Catch:{ Exception -> 0x0099, all -> 0x0094 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0099, all -> 0x0094 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0099, all -> 0x0094 }
            boolean r3 = r2.exists()     // Catch:{ Exception -> 0x0099, all -> 0x0094 }
            if (r3 == 0) goto L_0x0031
            r0.close()     // Catch:{ Exception -> 0x0030 }
            r0.close()     // Catch:{ Exception -> 0x0030 }
            r0.close()     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            return r1
        L_0x0031:
            java.io.InputStream r3 = r10.openStream()     // Catch:{ Exception -> 0x0099, all -> 0x0094 }
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r6.<init>()     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r6.append(r11)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            java.lang.String r7 = ".temp"
            r6.append(r7)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r7 = 0
            java.io.FileOutputStream r6 = r9.openFileOutput(r6, r7)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
        L_0x0054:
            int r8 = r4.read(r5)     // Catch:{ Exception -> 0x0086 }
            if (r8 <= 0) goto L_0x005e
            r6.write(r5, r7, r8)     // Catch:{ Exception -> 0x0086 }
            goto L_0x0054
        L_0x005e:
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0086 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0086 }
            r7.<init>()     // Catch:{ Exception -> 0x0086 }
            r7.append(r11)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r8 = ".temp"
            r7.append(r8)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r7 = m22594a(r9, r7)     // Catch:{ Exception -> 0x0086 }
            r5.<init>(r7)     // Catch:{ Exception -> 0x0086 }
            r5.renameTo(r2)     // Catch:{ Exception -> 0x0086 }
            r3.close()     // Catch:{ Exception -> 0x0084 }
            r4.close()     // Catch:{ Exception -> 0x0084 }
            r6.close()     // Catch:{ Exception -> 0x0084 }
        L_0x0084:
            r0 = r1
            goto L_0x00d9
        L_0x0086:
            r1 = move-exception
            goto L_0x009d
        L_0x0088:
            r9 = move-exception
            r6 = r0
            goto L_0x00db
        L_0x008b:
            r1 = move-exception
            r6 = r0
            goto L_0x009d
        L_0x008e:
            r9 = move-exception
            r4 = r0
            goto L_0x0097
        L_0x0091:
            r1 = move-exception
            r4 = r0
            goto L_0x009c
        L_0x0094:
            r9 = move-exception
            r3 = r0
            r4 = r3
        L_0x0097:
            r6 = r4
            goto L_0x00db
        L_0x0099:
            r1 = move-exception
            r3 = r0
            r4 = r3
        L_0x009c:
            r6 = r4
        L_0x009d:
            java.lang.String r2 = "StartAppWall.VideoUtil"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            r5.<init>()     // Catch:{ all -> 0x00da }
            java.lang.String r7 = "Error downloading video from "
            r5.append(r7)     // Catch:{ all -> 0x00da }
            r5.append(r10)     // Catch:{ all -> 0x00da }
            java.lang.String r10 = r5.toString()     // Catch:{ all -> 0x00da }
            android.util.Log.e(r2, r10, r1)     // Catch:{ all -> 0x00da }
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x00da }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            r1.<init>()     // Catch:{ all -> 0x00da }
            r1.append(r11)     // Catch:{ all -> 0x00da }
            java.lang.String r11 = ".temp"
            r1.append(r11)     // Catch:{ all -> 0x00da }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x00da }
            java.lang.String r9 = m22594a(r9, r11)     // Catch:{ all -> 0x00da }
            r10.<init>(r9)     // Catch:{ all -> 0x00da }
            r10.delete()     // Catch:{ all -> 0x00da }
            r3.close()     // Catch:{ Exception -> 0x00d9 }
            r4.close()     // Catch:{ Exception -> 0x00d9 }
            r6.close()     // Catch:{ Exception -> 0x00d9 }
        L_0x00d9:
            return r0
        L_0x00da:
            r9 = move-exception
        L_0x00db:
            r3.close()     // Catch:{ Exception -> 0x00e4 }
            r4.close()     // Catch:{ Exception -> 0x00e4 }
            r6.close()     // Catch:{ Exception -> 0x00e4 }
        L_0x00e4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.publish.ads.video.C5284h.m22595a(android.content.Context, java.net.URL, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static C5285a m22593a(Context context) {
        C5285a aVar = C5285a.ELIGIBLE;
        if (m22599c(context)) {
            aVar = C5285a.INELIGIBLE_ERRORS_THRESHOLD_REACHED;
        }
        if (!C5307i.m22676a(context, FullScreenActivity.class)) {
            aVar = C5285a.INELIGIBLE_MISSING_ACTIVITY;
        }
        return !m22600d(context) ? C5285a.INELIGIBLE_NO_STORAGE : aVar;
    }

    /* renamed from: b */
    public static void m22598b(Context context) {
        C5414k.m23101b(context, "videoErrorsCount", Integer.valueOf(C5414k.m23094a(context, "videoErrorsCount", Integer.valueOf(0)).intValue() + 1));
    }

    /* renamed from: a */
    public static void m22596a(Context context, C5210a aVar) {
        if (aVar != null) {
            for (String b : aVar.mo19247a()) {
                C5349c.m22875b(context, b);
            }
        }
    }

    /* renamed from: a */
    public static boolean m22597a(String str) {
        for (C5450g gVar : C5436a.m23246a().mo20088d()) {
            if (gVar.mo20119b() instanceof C5253e) {
                C5253e eVar = (C5253e) gVar.mo20119b();
                if (!(eVar.mo19363d() == null || eVar.mo19363d().getLocalVideoPath() == null || !eVar.mo19363d().getLocalVideoPath().equals(str))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static String m22594a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir());
        sb.append("/");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    private static boolean m22599c(Context context) {
        boolean z = false;
        if (C5344b.m22784a().mo19756H().mo20036e() < 0) {
            return false;
        }
        if (C5414k.m23094a(context, "videoErrorsCount", Integer.valueOf(0)).intValue() >= C5344b.m22784a().mo19756H().mo20036e()) {
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    private static boolean m22600d(Context context) {
        long a = C5307i.m22653a(context.getFilesDir(), -1);
        boolean z = false;
        if (a < 0) {
            return false;
        }
        if (a / 1024 > C5344b.m22784a().mo19756H().mo20034c() * 1024) {
            z = true;
        }
        return z;
    }
}

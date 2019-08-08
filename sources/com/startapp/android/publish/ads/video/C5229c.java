package com.startapp.android.publish.ads.video;

import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.ads.video.p172b.C5220c.C5223c;
import java.io.File;

/* renamed from: com.startapp.android.publish.ads.video.c */
/* compiled from: StartAppSDK */
public class C5229c {

    /* renamed from: a */
    private boolean f16765a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5223c f16766b;

    /* renamed from: c */
    private String f16767c;

    /* renamed from: com.startapp.android.publish.ads.video.c$a */
    /* compiled from: StartAppSDK */
    public interface C5232a {
        /* renamed from: a */
        void mo19256a(String str);
    }

    /* renamed from: com.startapp.android.publish.ads.video.c$b */
    /* compiled from: StartAppSDK */
    private static class C5233b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C5229c f16773a = new C5229c();
    }

    private C5229c() {
        this.f16765a = true;
        this.f16766b = null;
        this.f16767c = null;
    }

    /* renamed from: a */
    public static C5229c m22374a() {
        return C5233b.f16773a;
    }

    /* renamed from: a */
    public void mo19285a(C5223c cVar) {
        this.f16766b = cVar;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.io.DataInputStream, java.io.FileOutputStream, java.lang.String, java.io.InputStream] */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0154, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0155, code lost:
        r5 = r4;
        r9 = r12;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x015a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015b, code lost:
        r2 = r0;
        r6 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v0, types: [java.io.DataInputStream, java.io.FileOutputStream, java.lang.String, java.io.InputStream]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [java.lang.String, java.io.InputStream, java.io.DataInputStream, java.io.FileOutputStream]
      mth insns count: 194
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
    /* JADX WARNING: Removed duplicated region for block: B:83:0x015a A[ExcHandler: all (r0v6 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:13:0x0068] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo19284a(android.content.Context r27, java.net.URL r28, java.lang.String r29, com.startapp.android.publish.ads.video.C5229c.C5232a r30) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            java.lang.String r6 = "StartAppWall.ProgressiveVideoManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Downloading video from "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            r8 = 3
            com.startapp.common.p193a.C5518g.m23563a(r6, r8, r7)
            java.lang.String r6 = r28.toString()
            r1.f16767c = r6
            r6 = 1
            r1.f16765a = r6
            com.startapp.android.publish.adsCommon.b r7 = com.startapp.android.publish.adsCommon.C5344b.m22784a()
            com.startapp.android.publish.adsCommon.n r7 = r7.mo19756H()
            int r7 = r7.mo20045l()
            r9 = 0
            java.lang.String r10 = com.startapp.android.publish.ads.video.C5284h.m22594a(r2, r4)     // Catch:{ Exception -> 0x0174, all -> 0x016e }
            java.io.File r11 = new java.io.File     // Catch:{ Exception -> 0x0174, all -> 0x016e }
            r11.<init>(r10)     // Catch:{ Exception -> 0x0174, all -> 0x016e }
            boolean r12 = r11.exists()     // Catch:{ Exception -> 0x0174, all -> 0x016e }
            if (r12 == 0) goto L_0x0052
            r1.f16767c = r9     // Catch:{ Exception -> 0x0051 }
            r9.close()     // Catch:{ Exception -> 0x0051 }
            r9.close()     // Catch:{ Exception -> 0x0051 }
            r9.close()     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            return r10
        L_0x0052:
            java.net.URLConnection r12 = r28.openConnection()     // Catch:{ Exception -> 0x0174, all -> 0x016e }
            r12.connect()     // Catch:{ Exception -> 0x0174, all -> 0x016e }
            int r13 = r12.getContentLength()     // Catch:{ Exception -> 0x0174, all -> 0x016e }
            java.io.InputStream r12 = r12.getInputStream()     // Catch:{ Exception -> 0x0174, all -> 0x016e }
            java.io.DataInputStream r14 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0168, all -> 0x0164 }
            r14.<init>(r12)     // Catch:{ Exception -> 0x0168, all -> 0x0164 }
            r15 = 4096(0x1000, float:5.74E-42)
            byte[] r15 = new byte[r15]     // Catch:{ Exception -> 0x015e, all -> 0x015a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e, all -> 0x015a }
            r6.<init>()     // Catch:{ Exception -> 0x015e, all -> 0x015a }
            r6.append(r4)     // Catch:{ Exception -> 0x015e, all -> 0x015a }
            java.lang.String r4 = ".temp"
            r6.append(r4)     // Catch:{ Exception -> 0x015e, all -> 0x015a }
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x015e, all -> 0x015a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0154, all -> 0x015a }
            r6.<init>()     // Catch:{ Exception -> 0x0154, all -> 0x015a }
            r6.append(r10)     // Catch:{ Exception -> 0x0154, all -> 0x015a }
            java.lang.String r9 = ".temp"
            r6.append(r9)     // Catch:{ Exception -> 0x0154, all -> 0x015a }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0154, all -> 0x015a }
            r9 = 0
            java.io.FileOutputStream r8 = r2.openFileOutput(r4, r9)     // Catch:{ Exception -> 0x0154, all -> 0x015a }
            r17 = r9
            r18 = r17
            r19 = r18
        L_0x0097:
            int r9 = r14.read(r15)     // Catch:{ Exception -> 0x014f, all -> 0x014a }
            if (r9 <= 0) goto L_0x00ed
            r20 = r10
            boolean r10 = r1.f16765a     // Catch:{ Exception -> 0x00e4, all -> 0x00dc }
            if (r10 == 0) goto L_0x00d9
            r10 = 0
            r8.write(r15, r10, r9)     // Catch:{ Exception -> 0x00e4, all -> 0x00dc }
            int r9 = r17 + r9
            r21 = r11
            double r10 = (double) r9
            r22 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r10 = r10 * r22
            r24 = r8
            r25 = r9
            double r8 = (double) r13
            double r10 = r10 / r8
            int r8 = (int) r10
            if (r8 < r7) goto L_0x00d0
            if (r18 != 0) goto L_0x00c7
            if (r5 == 0) goto L_0x00c7
            r1.m22377a(r5, r6)     // Catch:{ Exception -> 0x00c5, all -> 0x00c3 }
            r18 = 1
            goto L_0x00c7
        L_0x00c3:
            r0 = move-exception
            goto L_0x00df
        L_0x00c5:
            r0 = move-exception
            goto L_0x00e7
        L_0x00c7:
            int r9 = r19 + 1
            if (r8 < r9) goto L_0x00d0
            r1.m22375a(r8)     // Catch:{ Exception -> 0x00c5, all -> 0x00c3 }
            r19 = r8
        L_0x00d0:
            r10 = r20
            r11 = r21
            r8 = r24
            r17 = r25
            goto L_0x0097
        L_0x00d9:
            r24 = r8
            goto L_0x00f1
        L_0x00dc:
            r0 = move-exception
            r24 = r8
        L_0x00df:
            r2 = r0
            r6 = r24
            goto L_0x01af
        L_0x00e4:
            r0 = move-exception
            r24 = r8
        L_0x00e7:
            r5 = r4
            r9 = r12
            r6 = r24
            goto L_0x0158
        L_0x00ed:
            r24 = r8
            r20 = r10
        L_0x00f1:
            r21 = r11
            boolean r5 = r1.f16765a     // Catch:{ Exception -> 0x0146, all -> 0x0142 }
            if (r5 != 0) goto L_0x011e
            if (r9 <= 0) goto L_0x011e
            java.lang.String r5 = "StartAppWall.ProgressiveVideoManager"
            java.lang.String r6 = "Video downloading disabled"
            r7 = 3
            com.startapp.common.p193a.C5518g.m23563a(r5, r7, r6)     // Catch:{ Exception -> 0x0146, all -> 0x0142 }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0146, all -> 0x0142 }
            java.lang.String r6 = com.startapp.android.publish.ads.video.C5284h.m22594a(r2, r4)     // Catch:{ Exception -> 0x0146, all -> 0x0142 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0146, all -> 0x0142 }
            r5.delete()     // Catch:{ Exception -> 0x0146, all -> 0x0142 }
            java.lang.String r5 = "downloadInterrupted"
            r2 = 0
            r1.f16767c = r2     // Catch:{ Exception -> 0x011d }
            r12.close()     // Catch:{ Exception -> 0x011d }
            r14.close()     // Catch:{ Exception -> 0x011d }
            r6 = r24
            r6.close()     // Catch:{ Exception -> 0x011d }
        L_0x011d:
            return r5
        L_0x011e:
            r6 = r24
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0140, all -> 0x013e }
            java.lang.String r7 = com.startapp.android.publish.ads.video.C5284h.m22594a(r2, r4)     // Catch:{ Exception -> 0x0140, all -> 0x013e }
            r5.<init>(r7)     // Catch:{ Exception -> 0x0140, all -> 0x013e }
            r7 = r21
            r1.m22376a(r2, r5, r7)     // Catch:{ Exception -> 0x0140, all -> 0x013e }
            r5 = 0
            r1.f16767c = r5     // Catch:{ Exception -> 0x013a }
            r12.close()     // Catch:{ Exception -> 0x013a }
            r14.close()     // Catch:{ Exception -> 0x013a }
            r6.close()     // Catch:{ Exception -> 0x013a }
        L_0x013a:
            r16 = r20
            goto L_0x01ab
        L_0x013e:
            r0 = move-exception
            goto L_0x014c
        L_0x0140:
            r0 = move-exception
            goto L_0x0151
        L_0x0142:
            r0 = move-exception
            r6 = r24
            goto L_0x014c
        L_0x0146:
            r0 = move-exception
            r6 = r24
            goto L_0x0151
        L_0x014a:
            r0 = move-exception
            r6 = r8
        L_0x014c:
            r2 = r0
            goto L_0x01af
        L_0x014f:
            r0 = move-exception
            r6 = r8
        L_0x0151:
            r5 = r4
            r9 = r12
            goto L_0x0158
        L_0x0154:
            r0 = move-exception
            r5 = r4
            r9 = r12
            r6 = 0
        L_0x0158:
            r4 = r0
            goto L_0x017a
        L_0x015a:
            r0 = move-exception
            r2 = r0
            r6 = 0
            goto L_0x01af
        L_0x015e:
            r0 = move-exception
            r4 = r0
            r9 = r12
            r5 = 0
            r6 = 0
            goto L_0x017a
        L_0x0164:
            r0 = move-exception
            r2 = r0
            r6 = 0
            goto L_0x0172
        L_0x0168:
            r0 = move-exception
            r4 = r0
            r9 = r12
            r5 = 0
            r6 = 0
            goto L_0x0179
        L_0x016e:
            r0 = move-exception
            r2 = r0
            r6 = 0
            r12 = 0
        L_0x0172:
            r14 = 0
            goto L_0x01af
        L_0x0174:
            r0 = move-exception
            r4 = r0
            r5 = 0
            r6 = 0
            r9 = 0
        L_0x0179:
            r14 = 0
        L_0x017a:
            java.lang.String r7 = "StartAppWall.ProgressiveVideoManager"
            r8 = 6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ac }
            r10.<init>()     // Catch:{ all -> 0x01ac }
            java.lang.String r11 = "Error downloading video from "
            r10.append(r11)     // Catch:{ all -> 0x01ac }
            r10.append(r3)     // Catch:{ all -> 0x01ac }
            java.lang.String r3 = r10.toString()     // Catch:{ all -> 0x01ac }
            com.startapp.common.p193a.C5518g.m23564a(r7, r8, r3, r4)     // Catch:{ all -> 0x01ac }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x01ac }
            java.lang.String r2 = com.startapp.android.publish.ads.video.C5284h.m22594a(r2, r5)     // Catch:{ all -> 0x01ac }
            r3.<init>(r2)     // Catch:{ all -> 0x01ac }
            r3.delete()     // Catch:{ all -> 0x01ac }
            r2 = 0
            r1.f16767c = r2     // Catch:{ Exception -> 0x01a9 }
            r9.close()     // Catch:{ Exception -> 0x01a9 }
            r14.close()     // Catch:{ Exception -> 0x01a9 }
            r6.close()     // Catch:{ Exception -> 0x01a9 }
        L_0x01a9:
            r16 = 0
        L_0x01ab:
            return r16
        L_0x01ac:
            r0 = move-exception
            r2 = r0
            r12 = r9
        L_0x01af:
            r3 = 0
            r1.f16767c = r3     // Catch:{ Exception -> 0x01bb }
            r12.close()     // Catch:{ Exception -> 0x01bb }
            r14.close()     // Catch:{ Exception -> 0x01bb }
            r6.close()     // Catch:{ Exception -> 0x01bb }
        L_0x01bb:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.publish.ads.video.C5229c.mo19284a(android.content.Context, java.net.URL, java.lang.String, com.startapp.android.publish.ads.video.c$a):java.lang.String");
    }

    /* renamed from: a */
    private void m22377a(final C5232a aVar, final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                aVar.mo19256a(str);
            }
        });
    }

    /* renamed from: a */
    private void m22375a(final int i) {
        if (this.f16766b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C5229c.this.f16766b != null) {
                        C5229c.this.f16766b.mo19277a(i);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo19286a(String str) {
        if (str != null && str.equals(this.f16767c)) {
            this.f16765a = false;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0034 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22376a(android.content.Context r4, java.io.File r5, java.io.File r6) {
        /*
            r3 = this;
            r4 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0033, all -> 0x002a }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0033, all -> 0x002a }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0034, all -> 0x0028 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0034, all -> 0x0028 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0026, all -> 0x0021 }
        L_0x000f:
            int r6 = r0.read(r4)     // Catch:{ Exception -> 0x0026, all -> 0x0021 }
            if (r6 <= 0) goto L_0x001a
            r1 = 0
            r5.write(r4, r1, r6)     // Catch:{ Exception -> 0x0026, all -> 0x0021 }
            goto L_0x000f
        L_0x001a:
            r0.close()     // Catch:{ Exception -> 0x003a }
            r5.close()     // Catch:{ Exception -> 0x003a }
            goto L_0x003a
        L_0x0021:
            r4 = move-exception
            r2 = r5
            r5 = r4
            r4 = r2
            goto L_0x002c
        L_0x0026:
            r4 = r5
            goto L_0x0034
        L_0x0028:
            r5 = move-exception
            goto L_0x002c
        L_0x002a:
            r5 = move-exception
            r0 = r4
        L_0x002c:
            r0.close()     // Catch:{ Exception -> 0x0032 }
            r4.close()     // Catch:{ Exception -> 0x0032 }
        L_0x0032:
            throw r5
        L_0x0033:
            r0 = r4
        L_0x0034:
            r0.close()     // Catch:{ Exception -> 0x003a }
            r4.close()     // Catch:{ Exception -> 0x003a }
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.publish.ads.video.C5229c.m22376a(android.content.Context, java.io.File, java.io.File):void");
    }

    /* renamed from: b */
    public boolean mo19287b(String str) {
        return str != null && str.endsWith(".temp");
    }

    /* renamed from: c */
    public void mo19288c(String str) {
        if (mo19287b(str)) {
            new File(str).delete();
        }
    }
}

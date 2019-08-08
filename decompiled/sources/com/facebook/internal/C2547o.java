package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.C2495ag.C2497a;
import com.facebook.internal.C2553p.C2556b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.internal.o */
/* compiled from: ImageDownloader */
public class C2547o {

    /* renamed from: a */
    private static Handler f7973a;

    /* renamed from: b */
    private static C2495ag f7974b = new C2495ag(8);

    /* renamed from: c */
    private static C2495ag f7975c = new C2495ag(2);

    /* renamed from: d */
    private static final Map<C2552d, C2551c> f7976d = new HashMap();

    /* renamed from: com.facebook.internal.o$a */
    /* compiled from: ImageDownloader */
    private static class C2549a implements Runnable {

        /* renamed from: a */
        private Context f7982a;

        /* renamed from: b */
        private C2552d f7983b;

        /* renamed from: c */
        private boolean f7984c;

        C2549a(Context context, C2552d dVar, boolean z) {
            this.f7982a = context;
            this.f7983b = dVar;
            this.f7984c = z;
        }

        public void run() {
            C2547o.m9687b(this.f7983b, this.f7982a, this.f7984c);
        }
    }

    /* renamed from: com.facebook.internal.o$b */
    /* compiled from: ImageDownloader */
    private static class C2550b implements Runnable {

        /* renamed from: a */
        private Context f7985a;

        /* renamed from: b */
        private C2552d f7986b;

        C2550b(Context context, C2552d dVar) {
            this.f7985a = context;
            this.f7986b = dVar;
        }

        public void run() {
            C2547o.m9686b(this.f7986b, this.f7985a);
        }
    }

    /* renamed from: com.facebook.internal.o$c */
    /* compiled from: ImageDownloader */
    private static class C2551c {

        /* renamed from: a */
        C2497a f7987a;

        /* renamed from: b */
        C2553p f7988b;

        /* renamed from: c */
        boolean f7989c;

        private C2551c() {
        }
    }

    /* renamed from: com.facebook.internal.o$d */
    /* compiled from: ImageDownloader */
    private static class C2552d {

        /* renamed from: a */
        Uri f7990a;

        /* renamed from: b */
        Object f7991b;

        C2552d(Uri uri, Object obj) {
            this.f7990a = uri;
            this.f7991b = obj;
        }

        public int hashCode() {
            return ((1073 + this.f7990a.hashCode()) * 37) + this.f7991b.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C2552d)) {
                return false;
            }
            C2552d dVar = (C2552d) obj;
            if (dVar.f7990a == this.f7990a && dVar.f7991b == this.f7991b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static void m9682a(C2553p pVar) {
        if (pVar != null) {
            C2552d dVar = new C2552d(pVar.mo9055b(), pVar.mo9058e());
            synchronized (f7976d) {
                C2551c cVar = (C2551c) f7976d.get(dVar);
                if (cVar != null) {
                    cVar.f7988b = pVar;
                    cVar.f7989c = false;
                    cVar.f7987a.mo8969b();
                } else {
                    m9685a(pVar, dVar, pVar.mo9057d());
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m9688b(C2553p pVar) {
        boolean z;
        C2552d dVar = new C2552d(pVar.mo9055b(), pVar.mo9058e());
        synchronized (f7976d) {
            C2551c cVar = (C2551c) f7976d.get(dVar);
            z = true;
            if (cVar == null) {
                z = false;
            } else if (cVar.f7987a.mo8968a()) {
                f7976d.remove(dVar);
            } else {
                cVar.f7989c = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    private static void m9685a(C2553p pVar, C2552d dVar, boolean z) {
        m9684a(pVar, dVar, f7975c, (Runnable) new C2549a(pVar.mo9054a(), dVar, z));
    }

    /* renamed from: a */
    private static void m9683a(C2553p pVar, C2552d dVar) {
        m9684a(pVar, dVar, f7974b, (Runnable) new C2550b(pVar.mo9054a(), dVar));
    }

    /* renamed from: a */
    private static void m9684a(C2553p pVar, C2552d dVar, C2495ag agVar, Runnable runnable) {
        synchronized (f7976d) {
            C2551c cVar = new C2551c();
            cVar.f7988b = pVar;
            f7976d.put(dVar, cVar);
            cVar.f7987a = agVar.mo8965a(runnable);
        }
    }

    /* renamed from: a */
    private static void m9681a(C2552d dVar, Exception exc, Bitmap bitmap, boolean z) {
        C2551c a = m9678a(dVar);
        if (a != null && !a.f7989c) {
            final C2553p pVar = a.f7988b;
            final C2556b c = pVar.mo9056c();
            if (c != null) {
                Handler a2 = m9677a();
                final Exception exc2 = exc;
                final boolean z2 = z;
                final Bitmap bitmap2 = bitmap;
                C25481 r1 = new Runnable() {
                    public void run() {
                        c.mo9063a(new C2557q(pVar, exc2, z2, bitmap2));
                    }
                };
                a2.post(r1);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9687b(com.facebook.internal.C2547o.C2552d r2, android.content.Context r3, boolean r4) {
        /*
            r0 = 0
            r1 = 0
            if (r4 == 0) goto L_0x0014
            android.net.Uri r4 = r2.f7990a
            android.net.Uri r4 = com.facebook.internal.C2478ac.m9416a(r4)
            if (r4 == 0) goto L_0x0014
            java.io.InputStream r4 = com.facebook.internal.C2558r.m9711a(r4, r3)
            if (r4 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r4 = r1
        L_0x0015:
            if (r0 != 0) goto L_0x001d
            android.net.Uri r4 = r2.f7990a
            java.io.InputStream r4 = com.facebook.internal.C2558r.m9711a(r4, r3)
        L_0x001d:
            if (r4 == 0) goto L_0x002a
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r4)
            com.facebook.internal.C2479ad.m9444a(r4)
            m9681a(r2, r1, r3, r0)
            goto L_0x0039
        L_0x002a:
            com.facebook.internal.o$c r3 = m9678a(r2)
            if (r3 == 0) goto L_0x0039
            boolean r4 = r3.f7989c
            if (r4 != 0) goto L_0x0039
            com.facebook.internal.p r3 = r3.f7988b
            m9683a(r3, r2)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2547o.m9687b(com.facebook.internal.o$d, android.content.Context, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r10v5, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r10v7 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r4v11, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r10v13, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.facebook.j] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r10v14 */
    /* JADX WARNING: type inference failed for: r10v15 */
    /* JADX WARNING: type inference failed for: r10v16 */
    /* JADX WARNING: type inference failed for: r10v17 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r10v18 */
    /* JADX WARNING: type inference failed for: r10v19 */
    /* JADX WARNING: type inference failed for: r10v20 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
        r10 = 0;
        r2 = false;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009d, code lost:
        r9 = th;
        r0 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v4
      assigns: []
      uses: []
      mth insns count: 96
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
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 17 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9686b(com.facebook.internal.C2547o.C2552d r9, android.content.Context r10) {
        /*
            r0 = 0
            r1 = 0
            r2 = 1
            java.net.URL r3 = new java.net.URL     // Catch:{ IOException -> 0x00ab, all -> 0x00a2 }
            android.net.Uri r4 = r9.f7990a     // Catch:{ IOException -> 0x00ab, all -> 0x00a2 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00ab, all -> 0x00a2 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00ab, all -> 0x00a2 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x00ab, all -> 0x00a2 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x00ab, all -> 0x00a2 }
            r3.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x009f, all -> 0x009d }
            int r4 = r3.getResponseCode()     // Catch:{ IOException -> 0x009f, all -> 0x009d }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == r5) goto L_0x008e
            switch(r4) {
                case 301: goto L_0x005b;
                case 302: goto L_0x005b;
                default: goto L_0x0022;
            }     // Catch:{ IOException -> 0x009f, all -> 0x009d }
        L_0x0022:
            java.io.InputStream r10 = r3.getErrorStream()     // Catch:{ IOException -> 0x009f, all -> 0x009d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            r4.<init>()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            if (r10 == 0) goto L_0x0045
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            r5.<init>(r10)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            r6 = 128(0x80, float:1.794E-43)
            char[] r6 = new char[r6]     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
        L_0x0036:
            int r7 = r6.length     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            int r7 = r5.read(r6, r1, r7)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            if (r7 <= 0) goto L_0x0041
            r4.append(r6, r1, r7)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            goto L_0x0036
        L_0x0041:
            com.facebook.internal.C2479ad.m9444a(r5)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            goto L_0x004a
        L_0x0045:
            java.lang.String r5 = "Unexpected error while downloading an image."
            r4.append(r5)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
        L_0x004a:
            com.facebook.j r5 = new com.facebook.j     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            r4 = r0
            r0 = r5
            goto L_0x0096
        L_0x0056:
            r9 = move-exception
            r0 = r10
            goto L_0x00a4
        L_0x0059:
            r4 = move-exception
            goto L_0x00ae
        L_0x005b:
            java.lang.String r10 = "location"
            java.lang.String r10 = r3.getHeaderField(r10)     // Catch:{ IOException -> 0x008a, all -> 0x009d }
            boolean r2 = com.facebook.internal.C2479ad.m9456a(r10)     // Catch:{ IOException -> 0x008a, all -> 0x009d }
            if (r2 != 0) goto L_0x0086
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch:{ IOException -> 0x008a, all -> 0x009d }
            android.net.Uri r2 = r9.f7990a     // Catch:{ IOException -> 0x008a, all -> 0x009d }
            com.facebook.internal.C2478ac.m9418a(r2, r10)     // Catch:{ IOException -> 0x008a, all -> 0x009d }
            com.facebook.internal.o$c r2 = m9678a(r9)     // Catch:{ IOException -> 0x008a, all -> 0x009d }
            if (r2 == 0) goto L_0x0086
            boolean r4 = r2.f7989c     // Catch:{ IOException -> 0x008a, all -> 0x009d }
            if (r4 != 0) goto L_0x0086
            com.facebook.internal.p r2 = r2.f7988b     // Catch:{ IOException -> 0x008a, all -> 0x009d }
            com.facebook.internal.o$d r4 = new com.facebook.internal.o$d     // Catch:{ IOException -> 0x008a, all -> 0x009d }
            java.lang.Object r5 = r9.f7991b     // Catch:{ IOException -> 0x008a, all -> 0x009d }
            r4.<init>(r10, r5)     // Catch:{ IOException -> 0x008a, all -> 0x009d }
            m9685a(r2, r4, r1)     // Catch:{ IOException -> 0x008a, all -> 0x009d }
        L_0x0086:
            r10 = r0
            r4 = r10
            r2 = r1
            goto L_0x0096
        L_0x008a:
            r4 = move-exception
            r10 = r0
            r2 = r1
            goto L_0x00ae
        L_0x008e:
            java.io.InputStream r10 = com.facebook.internal.C2558r.m9710a(r10, r3)     // Catch:{ IOException -> 0x009f, all -> 0x009d }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r10)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
        L_0x0096:
            com.facebook.internal.C2479ad.m9444a(r10)
            com.facebook.internal.C2479ad.m9449a(r3)
            goto L_0x00b7
        L_0x009d:
            r9 = move-exception
            goto L_0x00a4
        L_0x009f:
            r4 = move-exception
            r10 = r0
            goto L_0x00ae
        L_0x00a2:
            r9 = move-exception
            r3 = r0
        L_0x00a4:
            com.facebook.internal.C2479ad.m9444a(r0)
            com.facebook.internal.C2479ad.m9449a(r3)
            throw r9
        L_0x00ab:
            r4 = move-exception
            r10 = r0
            r3 = r10
        L_0x00ae:
            com.facebook.internal.C2479ad.m9444a(r10)
            com.facebook.internal.C2479ad.m9449a(r3)
            r8 = r4
            r4 = r0
            r0 = r8
        L_0x00b7:
            if (r2 == 0) goto L_0x00bc
            m9681a(r9, r0, r4, r1)
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2547o.m9686b(com.facebook.internal.o$d, android.content.Context):void");
    }

    /* renamed from: a */
    private static synchronized Handler m9677a() {
        Handler handler;
        synchronized (C2547o.class) {
            if (f7973a == null) {
                f7973a = new Handler(Looper.getMainLooper());
            }
            handler = f7973a;
        }
        return handler;
    }

    /* renamed from: a */
    private static C2551c m9678a(C2552d dVar) {
        C2551c cVar;
        synchronized (f7976d) {
            cVar = (C2551c) f7976d.remove(dVar);
        }
        return cVar;
    }
}

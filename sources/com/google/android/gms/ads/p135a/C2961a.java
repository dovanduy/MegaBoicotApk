package com.google.android.gms.ads.p135a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C3242a;
import com.google.android.gms.common.C3407d;
import com.google.android.gms.common.C3412e;
import com.google.android.gms.common.C3413f;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.stats.C3541a;
import com.google.android.gms.internal.p144a.C3628e;
import com.google.android.gms.internal.p144a.C3629f;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.ads.a.a */
public class C2961a {
    @GuardedBy("this")

    /* renamed from: a */
    private C3242a f8661a;
    @GuardedBy("this")

    /* renamed from: b */
    private C3628e f8662b;
    @GuardedBy("this")

    /* renamed from: c */
    private boolean f8663c;

    /* renamed from: d */
    private final Object f8664d;
    @GuardedBy("mAutoDisconnectTaskLock")

    /* renamed from: e */
    private C2963b f8665e;
    @GuardedBy("this")

    /* renamed from: f */
    private final Context f8666f;

    /* renamed from: g */
    private final boolean f8667g;

    /* renamed from: h */
    private final long f8668h;

    /* renamed from: com.google.android.gms.ads.a.a$a */
    public static final class C2962a {

        /* renamed from: a */
        private final String f8669a;

        /* renamed from: b */
        private final boolean f8670b;

        public C2962a(String str, boolean z) {
            this.f8669a = str;
            this.f8670b = z;
        }

        /* renamed from: a */
        public final String mo12186a() {
            return this.f8669a;
        }

        /* renamed from: b */
        public final boolean mo12187b() {
            return this.f8670b;
        }

        public final String toString() {
            String str = this.f8669a;
            boolean z = this.f8670b;
            StringBuilder sb = new StringBuilder(7 + String.valueOf(str).length());
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* renamed from: com.google.android.gms.ads.a.a$b */
    static class C2963b extends Thread {

        /* renamed from: a */
        CountDownLatch f8671a = new CountDownLatch(1);

        /* renamed from: b */
        boolean f8672b = false;

        /* renamed from: c */
        private WeakReference<C2961a> f8673c;

        /* renamed from: d */
        private long f8674d;

        public C2963b(C2961a aVar, long j) {
            this.f8673c = new WeakReference<>(aVar);
            this.f8674d = j;
            start();
        }

        /* renamed from: a */
        private final void m10607a() {
            C2961a aVar = (C2961a) this.f8673c.get();
            if (aVar != null) {
                aVar.mo12184c();
                this.f8672b = true;
            }
        }

        public final void run() {
            try {
                if (!this.f8671a.await(this.f8674d, TimeUnit.MILLISECONDS)) {
                    m10607a();
                }
            } catch (InterruptedException unused) {
                m10607a();
            }
        }
    }

    public C2961a(Context context) {
        this(context, 30000, false, false);
    }

    private C2961a(Context context, long j, boolean z, boolean z2) {
        this.f8664d = new Object();
        C3513t.m12625a(context);
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
        }
        this.f8666f = context;
        this.f8663c = false;
        this.f8668h = j;
        this.f8667g = z2;
    }

    /* renamed from: a */
    public static C2962a m10593a(Context context) throws IOException, IllegalStateException, C3412e, C3413f {
        C2965c cVar = new C2965c(context);
        boolean a = cVar.mo12193a("gads:ad_id_app_context:enabled", false);
        float a2 = cVar.mo12191a("gads:ad_id_app_context:ping_ratio", 0.0f);
        String a3 = cVar.mo12192a("gads:ad_id_use_shared_preference:experiment_id", "");
        C2961a aVar = new C2961a(context, -1, a, cVar.mo12193a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.m10598b(false);
            C2962a b = aVar.mo12183b();
            aVar.m10597a(b, a, a2, SystemClock.elapsedRealtime() - elapsedRealtime, a3, null);
            aVar.mo12184c();
            return b;
        } catch (Throwable th) {
            aVar.mo12184c();
            throw th;
        }
    }

    /* renamed from: a */
    private static C3242a m10594a(Context context, boolean z) throws IOException, C3412e, C3413f {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int b = C3407d.m12253b().mo13408b(context, (int) C3415h.f9877b);
            if (b == 0 || b == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                C3242a aVar = new C3242a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (C3541a.m12711a().mo13686a(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (NameNotFoundException unused) {
            throw new C3412e(9);
        }
    }

    /* renamed from: a */
    private static C3628e m10595a(Context context, C3242a aVar) throws IOException {
        try {
            return C3629f.m12920a(aVar.mo13063a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* renamed from: a */
    public static void m10596a(boolean z) {
    }

    /* renamed from: a */
    private final boolean m10597a(C2962a aVar, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", z ? "1" : "0");
        if (aVar != null) {
            hashMap.put("limit_ad_tracking", aVar.mo12187b() ? "1" : "0");
        }
        if (!(aVar == null || aVar.mo12186a() == null)) {
            hashMap.put("ad_id_size", Integer.toString(aVar.mo12186a().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C2964b(this, hashMap).start();
        return true;
    }

    /* renamed from: b */
    private final void m10598b(boolean z) throws IOException, IllegalStateException, C3412e, C3413f {
        C3513t.m12638c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f8663c) {
                mo12184c();
            }
            this.f8661a = m10594a(this.f8666f, this.f8667g);
            this.f8662b = m10595a(this.f8666f, this.f8661a);
            this.f8663c = true;
            if (z) {
                m10600d();
            }
        }
    }

    /* renamed from: b */
    public static boolean m10599b(Context context) throws IOException, C3412e, C3413f {
        C2965c cVar = new C2965c(context);
        C2961a aVar = new C2961a(context, -1, cVar.mo12193a("gads:ad_id_app_context:enabled", false), cVar.mo12193a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            aVar.m10598b(false);
            return aVar.m10601e();
        } finally {
            aVar.mo12184c();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10600d() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f8664d
            monitor-enter(r0)
            com.google.android.gms.ads.a.a$b r1 = r6.f8665e     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0013
            com.google.android.gms.ads.a.a$b r1 = r6.f8665e     // Catch:{ all -> 0x0026 }
            java.util.concurrent.CountDownLatch r1 = r1.f8671a     // Catch:{ all -> 0x0026 }
            r1.countDown()     // Catch:{ all -> 0x0026 }
            com.google.android.gms.ads.a.a$b r1 = r6.f8665e     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            long r1 = r6.f8668h     // Catch:{ all -> 0x0026 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0024
            com.google.android.gms.ads.a.a$b r1 = new com.google.android.gms.ads.a.a$b     // Catch:{ all -> 0x0026 }
            long r2 = r6.f8668h     // Catch:{ all -> 0x0026 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0026 }
            r6.f8665e = r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.p135a.C2961a.m10600d():void");
    }

    /* renamed from: e */
    private final boolean m10601e() throws IOException {
        boolean b;
        C3513t.m12638c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f8663c) {
                synchronized (this.f8664d) {
                    if (this.f8665e != null) {
                        if (!this.f8665e.f8672b) {
                        }
                    }
                    throw new IOException("AdvertisingIdClient is not connected.");
                }
                try {
                    m10598b(false);
                    if (!this.f8663c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C3513t.m12625a(this.f8661a);
            C3513t.m12625a(this.f8662b);
            b = this.f8662b.mo13763b();
        }
        m10600d();
        return b;
    }

    /* renamed from: a */
    public void mo12182a() throws IOException, IllegalStateException, C3412e, C3413f {
        m10598b(true);
    }

    /* renamed from: b */
    public C2962a mo12183b() throws IOException {
        C2962a aVar;
        C3513t.m12638c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f8663c) {
                synchronized (this.f8664d) {
                    if (this.f8665e != null) {
                        if (!this.f8665e.f8672b) {
                        }
                    }
                    throw new IOException("AdvertisingIdClient is not connected.");
                }
                try {
                    m10598b(false);
                    if (!this.f8663c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C3513t.m12625a(this.f8661a);
            C3513t.m12625a(this.f8662b);
            aVar = new C2962a(this.f8662b.mo13761a(), this.f8662b.mo13762a(true));
        }
        m10600d();
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12184c() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C3513t.m12638c(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f8666f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.common.a r0 = r3.f8661a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f8663c     // Catch:{ Throwable -> 0x001f }
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C3541a.m12711a()     // Catch:{ Throwable -> 0x001f }
            android.content.Context r1 = r3.f8666f     // Catch:{ Throwable -> 0x001f }
            com.google.android.gms.common.a r2 = r3.f8661a     // Catch:{ Throwable -> 0x001f }
            r0.mo13685a(r1, r2)     // Catch:{ Throwable -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f8663c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f8662b = r0     // Catch:{ all -> 0x0033 }
            r3.f8661a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.p135a.C2961a.mo12184c():void");
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        mo12184c();
        super.finalize();
    }
}

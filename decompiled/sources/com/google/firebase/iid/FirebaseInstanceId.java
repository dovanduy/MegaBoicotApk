package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Looper;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.common.util.p142a.C3547b;
import com.google.android.gms.p143d.C3579c;
import com.google.android.gms.p143d.C3583g;
import com.google.android.gms.p143d.C3584h;
import com.google.android.gms.p143d.C3587j;
import com.google.firebase.C4917a;
import com.google.firebase.C4928b;
import com.google.firebase.p149a.C4919b;
import com.google.firebase.p149a.C4921d;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;

public class FirebaseInstanceId {

    /* renamed from: a */
    private static final long f16151a = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: b */
    private static C5014z f16152b;
    @GuardedBy("FirebaseInstanceId.class")

    /* renamed from: c */
    private static ScheduledThreadPoolExecutor f16153c;

    /* renamed from: d */
    private final Executor f16154d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C4928b f16155e;

    /* renamed from: f */
    private final C5005q f16156f;

    /* renamed from: g */
    private C4989b f16157g;

    /* renamed from: h */
    private final C5008t f16158h;

    /* renamed from: i */
    private final C4966ad f16159i;
    @GuardedBy("this")

    /* renamed from: j */
    private boolean f16160j;

    /* renamed from: k */
    private final C4959a f16161k;

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    private class C4959a {

        /* renamed from: b */
        private final boolean f16163b = m21608c();

        /* renamed from: c */
        private final C4921d f16164c;
        @GuardedBy("this")

        /* renamed from: d */
        private C4919b<C4917a> f16165d;
        @GuardedBy("this")

        /* renamed from: e */
        private Boolean f16166e = m21607b();

        C4959a(C4921d dVar) {
            this.f16164c = dVar;
            if (this.f16166e == null && this.f16163b) {
                this.f16165d = new C4980ar(this);
                dVar.mo17820a(C4917a.class, this.f16165d);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final synchronized boolean mo17899a() {
            if (this.f16166e == null) {
                return this.f16163b && FirebaseInstanceId.this.f16155e.mo17833e();
            }
            return this.f16166e.booleanValue();
        }

        /* renamed from: b */
        private final Boolean m21607b() {
            Context a = FirebaseInstanceId.this.f16155e.mo17829a();
            SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = a.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled"))) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
            return null;
        }

        /* renamed from: c */
        private final boolean m21608c() {
            try {
                Class.forName("com.google.firebase.messaging.a");
                return true;
            } catch (ClassNotFoundException unused) {
                Context a = FirebaseInstanceId.this.f16155e.mo17829a();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(a.getPackageName());
                ResolveInfo resolveService = a.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }
    }

    /* renamed from: a */
    public static FirebaseInstanceId m21578a() {
        return getInstance(C4928b.m21499d());
    }

    @Keep
    public static FirebaseInstanceId getInstance(C4928b bVar) {
        return (FirebaseInstanceId) bVar.mo17830a(FirebaseInstanceId.class);
    }

    FirebaseInstanceId(C4928b bVar, C4921d dVar) {
        this(bVar, new C5005q(bVar.mo17829a()), C4973ak.m21640b(), C4973ak.m21640b(), dVar);
    }

    private FirebaseInstanceId(C4928b bVar, C5005q qVar, Executor executor, Executor executor2, C4921d dVar) {
        this.f16160j = false;
        if (C5005q.m21717a(bVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (f16152b == null) {
                f16152b = new C5014z(bVar.mo17829a());
            }
        }
        this.f16155e = bVar;
        this.f16156f = qVar;
        if (this.f16157g == null) {
            C4989b bVar2 = (C4989b) bVar.mo17830a(C4989b.class);
            if (bVar2 == null || !bVar2.mo17933b()) {
                this.f16157g = new C4981as(bVar, qVar, executor);
            } else {
                this.f16157g = bVar2;
            }
        }
        this.f16157g = this.f16157g;
        this.f16154d = executor2;
        this.f16159i = new C4966ad(f16152b);
        this.f16161k = new C4959a(dVar);
        this.f16158h = new C5008t(executor);
        if (this.f16161k.mo17899a()) {
            m21586m();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m21586m() {
        C4963aa e = mo17892e();
        if (!mo17896j() || e == null || e.mo17905b(this.f16156f.mo17964b()) || this.f16159i.mo17911a()) {
            m21587n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C4928b mo17888b() {
        return this.f16155e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo17887a(boolean z) {
        this.f16160j = z;
    }

    /* renamed from: n */
    private final synchronized void m21587n() {
        if (!this.f16160j) {
            mo17883a(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo17883a(long j) {
        C4964ab abVar = new C4964ab(this, this.f16156f, this.f16159i, Math.min(Math.max(30, j << 1), f16151a));
        m21580a((Runnable) abVar, j);
        this.f16160j = true;
    }

    /* renamed from: a */
    static void m21580a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f16153c == null) {
                f16153c = new ScheduledThreadPoolExecutor(1, new C3547b("FirebaseInstanceId"));
            }
            f16153c.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: c */
    public String mo17890c() {
        m21586m();
        return m21588o();
    }

    /* renamed from: o */
    private static String m21588o() {
        return C5005q.m21718a(f16152b.mo17977b("").mo17939a());
    }

    /* renamed from: b */
    private final C3583g<C4961a> m21581b(String str, String str2) {
        String c = m21584c(str2);
        C3584h hVar = new C3584h();
        Executor executor = this.f16154d;
        C4977ao aoVar = new C4977ao(this, str, str2, hVar, c);
        executor.execute(aoVar);
        return hVar.mo13720a();
    }

    @Deprecated
    /* renamed from: d */
    public String mo17891d() {
        C4963aa e = mo17892e();
        if (e == null || e.mo17905b(this.f16156f.mo17964b())) {
            m21587n();
        }
        if (e != null) {
            return e.f16172a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final C4963aa mo17892e() {
        return m21583c(C5005q.m21717a(this.f16155e), "*");
    }

    /* renamed from: c */
    private static C4963aa m21583c(String str, String str2) {
        return f16152b.mo17973a("", str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final String mo17893f() throws IOException {
        return mo17882a(C5005q.m21717a(this.f16155e), "*");
    }

    /* renamed from: a */
    public String mo17882a(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((C4961a) m21579a(m21581b(str, str2))).mo17904a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* renamed from: a */
    private final <T> T m21579a(C3583g<T> gVar) throws IOException {
        try {
            return C3587j.m12819a(gVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    mo17894h();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17884a(String str) throws IOException {
        C4963aa e = mo17892e();
        if (e == null || e.mo17905b(this.f16156f.mo17964b())) {
            throw new IOException("token not available");
        }
        m21579a(this.f16157g.mo17928a(m21588o(), e.f16172a, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo17889b(String str) throws IOException {
        C4963aa e = mo17892e();
        if (e == null || e.mo17905b(this.f16156f.mo17964b())) {
            throw new IOException("token not available");
        }
        m21579a(this.f16157g.mo17932b(m21588o(), e.f16172a, str));
    }

    /* renamed from: g */
    static boolean m21585g() {
        return Log.isLoggable("FirebaseInstanceId", 3) || (VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final synchronized void mo17894h() {
        f16152b.mo17978b();
        if (this.f16161k.mo17899a()) {
            m21587n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo17895i() {
        return this.f16157g.mo17933b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final boolean mo17896j() {
        return this.f16157g.mo17931a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final void mo17897k() throws IOException {
        m21579a(this.f16157g.mo17927a(m21588o(), C4963aa.m21619a(mo17892e())));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final void mo17898l() {
        f16152b.mo17979c("");
        m21587n();
    }

    /* renamed from: c */
    private static String m21584c(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo17885a(String str, String str2, C3584h hVar, String str3) {
        String o = m21588o();
        C4963aa c = m21583c(str, str2);
        if (c == null || c.mo17905b(this.f16156f.mo17964b())) {
            String a = C4963aa.m21619a(c);
            C5008t tVar = this.f16158h;
            C4978ap apVar = new C4978ap(this, o, a, str, str3);
            C3583g a2 = tVar.mo17968a(str, str3, apVar);
            Executor executor = this.f16154d;
            C4979aq aqVar = new C4979aq(this, str, str3, hVar, o);
            a2.mo13710a(executor, (C3579c<TResult>) aqVar);
            return;
        }
        hVar.mo13722a(new C4987ay(o, c.f16172a));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo17886a(String str, String str2, C3584h hVar, String str3, C3583g gVar) {
        if (gVar.mo13716b()) {
            String str4 = (String) gVar.mo13718d();
            f16152b.mo17976a("", str, str2, str4, this.f16156f.mo17964b());
            hVar.mo13722a(new C4987ay(str3, str4));
            return;
        }
        hVar.mo13721a(gVar.mo13719e());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C3583g mo17881a(String str, String str2, String str3, String str4) {
        return this.f16157g.mo17929a(str, str2, str3, str4);
    }
}

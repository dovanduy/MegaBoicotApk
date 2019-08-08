package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.Looper;
import android.support.p017v4.content.C0356c;
import android.support.p017v4.p023d.C0376a;
import android.util.Log;
import com.google.android.gms.common.api.internal.C3304b;
import com.google.android.gms.common.api.internal.C3304b.C3305a;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.util.C3563o;
import com.google.android.gms.common.util.C3565q;
import com.google.firebase.components.C4937a;
import com.google.firebase.components.C4937a.C49381;
import com.google.firebase.components.C4951m;
import com.google.firebase.p149a.C4920c;
import com.google.firebase.p151c.C4936a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.b */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
public class C4928b {
    @GuardedBy("LOCK")

    /* renamed from: a */
    static final Map<String, C4928b> f16080a = new C0376a();

    /* renamed from: b */
    private static final List<String> f16081b = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});

    /* renamed from: c */
    private static final List<String> f16082c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");

    /* renamed from: d */
    private static final List<String> f16083d = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});

    /* renamed from: e */
    private static final List<String> f16084e = Arrays.asList(new String[0]);

    /* renamed from: f */
    private static final Set<String> f16085f = Collections.emptySet();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Object f16086g = new Object();

    /* renamed from: h */
    private static final Executor f16087h = new C4932d(0);

    /* renamed from: i */
    private final Context f16088i;

    /* renamed from: j */
    private final String f16089j;

    /* renamed from: k */
    private final C4935c f16090k;

    /* renamed from: l */
    private final C4951m f16091l;

    /* renamed from: m */
    private final SharedPreferences f16092m;

    /* renamed from: n */
    private final C4920c f16093n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final AtomicBoolean f16094o = new AtomicBoolean(false);

    /* renamed from: p */
    private final AtomicBoolean f16095p = new AtomicBoolean();

    /* renamed from: q */
    private final AtomicBoolean f16096q;

    /* renamed from: r */
    private final List<Object> f16097r = new CopyOnWriteArrayList();

    /* renamed from: s */
    private final List<C4929a> f16098s = new CopyOnWriteArrayList();

    /* renamed from: t */
    private final List<Object> f16099t = new CopyOnWriteArrayList();

    /* renamed from: u */
    private C4930b f16100u;

    /* renamed from: com.google.firebase.b$a */
    /* compiled from: com.google.firebase:firebase-common@@16.0.2 */
    public interface C4929a {
        /* renamed from: a */
        void mo17838a(boolean z);
    }

    @Deprecated
    /* renamed from: com.google.firebase.b$b */
    /* compiled from: com.google.firebase:firebase-common@@16.0.2 */
    public interface C4930b {
    }

    @TargetApi(14)
    /* renamed from: com.google.firebase.b$c */
    /* compiled from: com.google.firebase:firebase-common@@16.0.2 */
    static class C4931c implements C3305a {

        /* renamed from: a */
        private static AtomicReference<C4931c> f16101a = new AtomicReference<>();

        private C4931c() {
        }

        /* renamed from: a */
        public final void mo13226a(boolean z) {
            synchronized (C4928b.f16086g) {
                Iterator it = new ArrayList(C4928b.f16080a.values()).iterator();
                while (it.hasNext()) {
                    C4928b bVar = (C4928b) it.next();
                    if (bVar.f16094o.get()) {
                        bVar.m21497a(z);
                    }
                }
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m21511a(Context context) {
            if (C3563o.m12763b() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f16101a.get() == null) {
                    C4931c cVar = new C4931c();
                    if (f16101a.compareAndSet(null, cVar)) {
                        C3304b.m11809a(application);
                        C3304b.m11808a().mo13228a((C3305a) cVar);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.b$d */
    /* compiled from: com.google.firebase:firebase-common@@16.0.2 */
    static class C4932d implements Executor {

        /* renamed from: a */
        private static final Handler f16102a = new Handler(Looper.getMainLooper());

        private C4932d() {
        }

        /* synthetic */ C4932d(byte b) {
            this();
        }

        public final void execute(Runnable runnable) {
            f16102a.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: com.google.firebase.b$e */
    /* compiled from: com.google.firebase:firebase-common@@16.0.2 */
    static class C4933e extends BroadcastReceiver {

        /* renamed from: a */
        private static AtomicReference<C4933e> f16103a = new AtomicReference<>();

        /* renamed from: b */
        private final Context f16104b;

        private C4933e(Context context) {
            this.f16104b = context;
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (C4928b.f16086g) {
                for (C4928b a : C4928b.f16080a.values()) {
                    a.m21503j();
                }
            }
            this.f16104b.unregisterReceiver(this);
        }

        /* renamed from: a */
        static /* synthetic */ void m21513a(Context context) {
            if (f16103a.get() == null) {
                C4933e eVar = new C4933e(context);
                if (f16103a.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }
    }

    /* renamed from: a */
    public Context mo17829a() {
        m21502i();
        return this.f16088i;
    }

    /* renamed from: b */
    public String mo17831b() {
        m21502i();
        return this.f16089j;
    }

    /* renamed from: c */
    public C4935c mo17832c() {
        m21502i();
        return this.f16090k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4928b)) {
            return false;
        }
        return this.f16089j.equals(((C4928b) obj).mo17831b());
    }

    public int hashCode() {
        return this.f16089j.hashCode();
    }

    public String toString() {
        return C3504r.m12549a((Object) this).mo13613a("name", this.f16089j).mo13613a("options", this.f16090k).toString();
    }

    /* renamed from: d */
    public static C4928b m21499d() {
        C4928b bVar;
        synchronized (f16086g) {
            bVar = (C4928b) f16080a.get("[DEFAULT]");
            if (bVar == null) {
                StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                sb.append(C3565q.m12776a());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public static C4928b m21491a(Context context) {
        synchronized (f16086g) {
            if (f16080a.containsKey("[DEFAULT]")) {
                C4928b d = m21499d();
                return d;
            }
            C4935c a = C4935c.m21515a(context);
            if (a == null) {
                Log.d("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            C4928b a2 = m21492a(context, a);
            return a2;
        }
    }

    /* renamed from: a */
    public static C4928b m21492a(Context context, C4935c cVar) {
        return m21493a(context, cVar, "[DEFAULT]");
    }

    /* renamed from: a */
    public static C4928b m21493a(Context context, C4935c cVar, String str) {
        C4928b bVar;
        C4931c.m21511a(context);
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f16086g) {
            boolean z = !f16080a.containsKey(trim);
            StringBuilder sb = new StringBuilder("FirebaseApp name ");
            sb.append(trim);
            sb.append(" already exists!");
            C3513t.m12632a(z, (Object) sb.toString());
            C3513t.m12626a(context, (Object) "Application context cannot be null.");
            bVar = new C4928b(context, trim, cVar);
            f16080a.put(trim, bVar);
        }
        bVar.m21503j();
        return bVar;
    }

    /* renamed from: a */
    public <T> T mo17830a(Class<T> cls) {
        m21502i();
        return this.f16091l.mo17861a((Class) cls);
    }

    /* renamed from: e */
    public boolean mo17833e() {
        m21502i();
        return this.f16096q.get();
    }

    private C4928b(Context context, String str, C4935c cVar) {
        this.f16088i = (Context) C3513t.m12625a(context);
        this.f16089j = C3513t.m12627a(str);
        this.f16090k = (C4935c) C3513t.m12625a(cVar);
        this.f16100u = new C4936a();
        this.f16092m = context.getSharedPreferences("com.google.firebase.common.prefs", 0);
        this.f16096q = new AtomicBoolean(m21501h());
        List a = C49381.m21528a(context).mo17855a();
        this.f16091l = new C4951m(f16087h, a, C4937a.m21520a(context, Context.class, new Class[0]), C4937a.m21520a(this, C4928b.class, new Class[0]), C4937a.m21520a(cVar, C4935c.class, new Class[0]));
        this.f16093n = (C4920c) this.f16091l.mo17861a(C4920c.class);
    }

    /* renamed from: h */
    private boolean m21501h() {
        if (this.f16092m.contains("firebase_data_collection_default_enabled")) {
            return this.f16092m.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f16088i.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.f16088i.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                    return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return true;
    }

    /* renamed from: i */
    private void m21502i() {
        C3513t.m12632a(!this.f16095p.get(), (Object) "FirebaseApp was deleted");
    }

    /* renamed from: f */
    public boolean mo17835f() {
        return "[DEFAULT]".equals(mo17831b());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m21497a(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (C4929a a : this.f16098s) {
            a.mo17838a(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m21503j() {
        boolean c = C0356c.m1322c(this.f16088i);
        if (c) {
            C4933e.m21513a(this.f16088i);
        } else {
            this.f16091l.mo17870a(mo17835f());
        }
        m21496a(C4928b.class, this, f16081b, c);
        if (mo17835f()) {
            m21496a(C4928b.class, this, f16082c, c);
            m21496a(Context.class, this.f16088i, f16083d, c);
        }
    }

    /* renamed from: a */
    private static <T> void m21496a(Class<T> cls, T t, Iterable<String> iterable, boolean z) {
        for (String str : iterable) {
            if (z) {
                try {
                    if (f16084e.contains(str)) {
                    }
                } catch (ClassNotFoundException unused) {
                    if (f16085f.contains(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(" is missing, but is required. Check if it has been removed by Proguard.");
                        throw new IllegalStateException(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(" is not linked. Skipping initialization.");
                    Log.d("FirebaseApp", sb2.toString());
                } catch (NoSuchMethodException unused2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append("#getInstance has been removed by Proguard. Add keep rule to prevent it.");
                    throw new IllegalStateException(sb3.toString());
                } catch (InvocationTargetException e) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e);
                } catch (IllegalAccessException e2) {
                    StringBuilder sb4 = new StringBuilder("Failed to initialize ");
                    sb4.append(str);
                    Log.wtf("FirebaseApp", sb4.toString(), e2);
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, new Object[]{t});
            }
        }
    }
}

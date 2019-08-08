package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.C3563o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.b */
public final class C3304b implements ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a */
    private static final C3304b f9600a = new C3304b();

    /* renamed from: b */
    private final AtomicBoolean f9601b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f9602c = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: d */
    private final ArrayList<C3305a> f9603d = new ArrayList<>();
    @GuardedBy("sInstance")

    /* renamed from: e */
    private boolean f9604e = false;

    /* renamed from: com.google.android.gms.common.api.internal.b$a */
    public interface C3305a {
        /* renamed from: a */
        void mo13226a(boolean z);
    }

    private C3304b() {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    /* renamed from: a */
    public static C3304b m11808a() {
        return f9600a;
    }

    /* renamed from: a */
    public static void m11809a(Application application) {
        synchronized (f9600a) {
            if (!f9600a.f9604e) {
                application.registerActivityLifecycleCallbacks(f9600a);
                application.registerComponentCallbacks(f9600a);
                f9600a.f9604e = true;
            }
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public final boolean mo13229a(boolean z) {
        if (!this.f9602c.get()) {
            if (!C3563o.m12765d()) {
                return z;
            }
            RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f9602c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f9601b.set(true);
            }
        }
        return mo13230b();
    }

    /* renamed from: b */
    public final boolean mo13230b() {
        return this.f9601b.get();
    }

    /* renamed from: a */
    public final void mo13228a(C3305a aVar) {
        synchronized (f9600a) {
            this.f9603d.add(aVar);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f9601b.compareAndSet(true, false);
        this.f9602c.set(true);
        if (compareAndSet) {
            m11810b(false);
        }
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f9601b.compareAndSet(true, false);
        this.f9602c.set(true);
        if (compareAndSet) {
            m11810b(false);
        }
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f9601b.compareAndSet(false, true)) {
            this.f9602c.set(true);
            m11810b(true);
        }
    }

    /* renamed from: b */
    private final void m11810b(boolean z) {
        synchronized (f9600a) {
            ArrayList arrayList = this.f9603d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((C3305a) obj).mo13226a(z);
            }
        }
    }
}

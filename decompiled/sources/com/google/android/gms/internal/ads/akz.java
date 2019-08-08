package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

@TargetApi(14)
final class akz implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private Activity f11318a;

    /* renamed from: b */
    private Context f11319b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f11320c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f11321d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f11322e = false;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: f */
    public final List<alb> f11323f = new ArrayList();
    @GuardedBy("mLock")

    /* renamed from: g */
    private final List<alo> f11324g = new ArrayList();

    /* renamed from: h */
    private Runnable f11325h;

    /* renamed from: i */
    private boolean f11326i = false;

    /* renamed from: j */
    private long f11327j;

    akz() {
    }

    /* renamed from: a */
    private final void m14363a(Activity activity) {
        synchronized (this.f11320c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f11318a = activity;
            }
        }
    }

    /* renamed from: a */
    public final Activity mo14464a() {
        return this.f11318a;
    }

    /* renamed from: a */
    public final void mo14465a(Application application, Context context) {
        if (!this.f11326i) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                m14363a((Activity) context);
            }
            this.f11319b = application;
            this.f11327j = ((Long) aoq.m14620f().mo14695a(aru.f11783aH)).longValue();
            this.f11326i = true;
        }
    }

    /* renamed from: a */
    public final void mo14466a(alb alb) {
        synchronized (this.f11320c) {
            this.f11323f.add(alb);
        }
    }

    /* renamed from: b */
    public final Context mo14467b() {
        return this.f11319b;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f11320c) {
            if (this.f11318a != null) {
                if (this.f11318a.equals(activity)) {
                    this.f11318a = null;
                }
                Iterator it = this.f11324g.iterator();
                while (it.hasNext()) {
                    try {
                        if (((alo) it.next()).mo14501c(activity)) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        C3025aw.m10921i().mo15436a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        C3987mk.m17430b("", e);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m14363a(activity);
        synchronized (this.f11320c) {
            for (alo b : this.f11324g) {
                try {
                    b.mo14500b(activity);
                } catch (Exception e) {
                    C3025aw.m10921i().mo15436a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    C3987mk.m17430b("", e);
                }
            }
        }
        this.f11322e = true;
        if (this.f11325h != null) {
            C3909jn.f13411a.removeCallbacks(this.f11325h);
        }
        Handler handler = C3909jn.f13411a;
        ala ala = new ala(this);
        this.f11325h = ala;
        handler.postDelayed(ala, this.f11327j);
    }

    public final void onActivityResumed(Activity activity) {
        m14363a(activity);
        this.f11322e = false;
        boolean z = !this.f11321d;
        this.f11321d = true;
        if (this.f11325h != null) {
            C3909jn.f13411a.removeCallbacks(this.f11325h);
        }
        synchronized (this.f11320c) {
            for (alo a : this.f11324g) {
                try {
                    a.mo14499a(activity);
                } catch (Exception e) {
                    C3025aw.m10921i().mo15436a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    C3987mk.m17430b("", e);
                }
            }
            if (z) {
                for (alb a2 : this.f11323f) {
                    try {
                        a2.mo14477a(true);
                    } catch (Exception e2) {
                        C3987mk.m17430b("", e2);
                    }
                }
            } else {
                C3900je.m17429b("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m14363a(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}

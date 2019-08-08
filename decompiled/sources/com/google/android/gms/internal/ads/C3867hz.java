package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.appnext.base.p046b.C1245d;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.hz */
public final class C3867hz {

    /* renamed from: a */
    private final AtomicReference<ThreadPoolExecutor> f13228a = new AtomicReference<>(null);

    /* renamed from: b */
    private final Object f13229b = new Object();
    @GuardedBy("mGmpAppIdLock")

    /* renamed from: c */
    private String f13230c = null;

    /* renamed from: d */
    private final AtomicBoolean f13231d = new AtomicBoolean(false);

    /* renamed from: e */
    private final AtomicInteger f13232e = new AtomicInteger(-1);

    /* renamed from: f */
    private final AtomicReference<Object> f13233f = new AtomicReference<>(null);

    /* renamed from: g */
    private final AtomicReference<Object> f13234g = new AtomicReference<>(null);

    /* renamed from: h */
    private ConcurrentMap<String, Method> f13235h = new ConcurrentHashMap(9);

    /* renamed from: a */
    private static Bundle m16910a(Context context, String str, boolean z) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String str2 = "Invalid event ID: ";
            String valueOf = String.valueOf(str);
            C3900je.m17430b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        }
        if (z) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    /* renamed from: a */
    private final Object m16911a(String str, Context context) {
        if (!m16914a(context, "com.google.android.gms.measurement.AppMeasurement", this.f13233f, true)) {
            return null;
        }
        try {
            return m16917h(context, str).invoke(this.f13233f.get(), new Object[0]);
        } catch (Exception e) {
            m16913a(e, str, true);
            return null;
        }
    }

    /* renamed from: a */
    private final void m16912a(Context context, String str, Bundle bundle) {
        if (mo15388a(context) && m16914a(context, "com.google.android.gms.measurement.AppMeasurement", this.f13233f, true)) {
            Method l = m16919l(context);
            try {
                l.invoke(this.f13233f.get(), new Object[]{"am", str, bundle});
            } catch (Exception e) {
                m16913a(e, "logEventInternal", true);
            }
        }
    }

    /* renamed from: a */
    private final void m16913a(Exception exc, String str, boolean z) {
        if (!this.f13231d.get()) {
            StringBuilder sb = new StringBuilder(30 + String.valueOf(str).length());
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            C3900je.m17435e(sb.toString());
            if (z) {
                C3900je.m17435e("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f13231d.set(true);
            }
        }
    }

    /* renamed from: a */
    private final boolean m16914a(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{context}));
            return true;
        } catch (Exception e) {
            m16913a(e, "getInstance", z);
            return false;
        }
    }

    /* renamed from: b */
    private final void m16915b(Context context, String str, String str2) {
        if (m16914a(context, "com.google.android.gms.measurement.AppMeasurement", this.f13233f, true)) {
            Method g = m16916g(context, str2);
            try {
                g.invoke(this.f13233f.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(37 + String.valueOf(str2).length() + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                C3900je.m17043a(sb.toString());
            } catch (Exception e) {
                m16913a(e, str2, false);
            }
        }
    }

    /* renamed from: g */
    private final Method m16916g(Context context, String str) {
        Method method = (Method) this.f13235h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.f13235h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m16913a(e, str, false);
            return null;
        }
    }

    /* renamed from: h */
    private final Method m16917h(Context context, String str) {
        Method method = (Method) this.f13235h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f13235h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m16913a(e, str, false);
            return null;
        }
    }

    /* renamed from: i */
    private final Method m16918i(Context context, String str) {
        Method method = (Method) this.f13235h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.f13235h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m16913a(e, str, false);
            return null;
        }
    }

    /* renamed from: l */
    private final Method m16919l(Context context) {
        Method method = (Method) this.f13235h.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
            this.f13235h.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m16913a(e, "logEventInternal", true);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo15385a(Context context, String str) {
        if (mo15388a(context)) {
            m16915b(context, str, "beginAdUnitExposure");
        }
    }

    /* renamed from: a */
    public final void mo15386a(Context context, String str, String str2) {
        if (mo15388a(context)) {
            m16912a(context, str, m16910a(context, str2, "_ac".equals(str)));
        }
    }

    /* renamed from: a */
    public final void mo15387a(Context context, String str, String str2, String str3, int i) {
        if (mo15388a(context)) {
            Bundle a = m16910a(context, str, false);
            a.putString("_ai", str2);
            a.putString(C1245d.f3961jd, str3);
            a.putInt("value", i);
            m16912a(context, "_ar", a);
            StringBuilder sb = new StringBuilder(75 + String.valueOf(str3).length());
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            C3900je.m17043a(sb.toString());
        }
    }

    /* renamed from: a */
    public final boolean mo15388a(Context context) {
        if (!((Boolean) aoq.m14620f().mo14695a(aru.f11813al)).booleanValue() || this.f13231d.get()) {
            return false;
        }
        if (this.f13232e.get() == -1) {
            aoq.m14615a();
            if (!C3975lz.m17385c(context)) {
                aoq.m14615a();
                if (C3975lz.m17388f(context)) {
                    C3900je.m17435e("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                    this.f13232e.set(0);
                }
            }
            this.f13232e.set(1);
        }
        return this.f13232e.get() == 1;
    }

    /* renamed from: b */
    public final void mo15389b(Context context, String str) {
        if (mo15388a(context)) {
            m16915b(context, str, "endAdUnitExposure");
        }
    }

    /* renamed from: b */
    public final boolean mo15390b(Context context) {
        return ((Boolean) aoq.m14620f().mo14695a(aru.f11814am)).booleanValue() && mo15388a(context);
    }

    /* renamed from: c */
    public final void mo15391c(Context context, String str) {
        if (mo15388a(context) && (context instanceof Activity) && m16914a(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f13234g, false)) {
            Method i = m16918i(context, "setCurrentScreen");
            try {
                Activity activity = (Activity) context;
                i.invoke(this.f13234g.get(), new Object[]{activity, str, context.getPackageName()});
            } catch (Exception e) {
                m16913a(e, "setCurrentScreen", false);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo15392c(Context context) {
        return ((Boolean) aoq.m14620f().mo14695a(aru.f11815an)).booleanValue() && mo15388a(context);
    }

    /* renamed from: d */
    public final void mo15393d(Context context, String str) {
        mo15386a(context, "_ac", str);
    }

    /* renamed from: d */
    public final boolean mo15394d(Context context) {
        return ((Boolean) aoq.m14620f().mo14695a(aru.f11816ao)).booleanValue() && mo15388a(context);
    }

    /* renamed from: e */
    public final void mo15395e(Context context, String str) {
        mo15386a(context, "_ai", str);
    }

    /* renamed from: e */
    public final boolean mo15396e(Context context) {
        return ((Boolean) aoq.m14620f().mo14695a(aru.f11817ap)).booleanValue() && mo15388a(context);
    }

    /* renamed from: f */
    public final void mo15397f(Context context, String str) {
        mo15386a(context, "_aq", str);
    }

    /* renamed from: f */
    public final boolean mo15398f(Context context) {
        return ((Boolean) aoq.m14620f().mo14695a(aru.f11820as)).booleanValue() && mo15388a(context);
    }

    /* renamed from: g */
    public final String mo15399g(Context context) {
        if (!mo15388a(context)) {
            return "";
        }
        if (!m16914a(context, "com.google.android.gms.measurement.AppMeasurement", this.f13233f, true)) {
            return "";
        }
        try {
            String str = (String) m16917h(context, "getCurrentScreenName").invoke(this.f13233f.get(), new Object[0]);
            if (str == null) {
                str = (String) m16917h(context, "getCurrentScreenClass").invoke(this.f13233f.get(), new Object[0]);
            }
            return str != null ? str : "";
        } catch (Exception e) {
            m16913a(e, "getCurrentScreenName", false);
            return "";
        }
    }

    /* renamed from: h */
    public final String mo15400h(Context context) {
        if (!mo15388a(context)) {
            return null;
        }
        synchronized (this.f13229b) {
            if (this.f13230c != null) {
                String str = this.f13230c;
                return str;
            }
            this.f13230c = (String) m16911a("getGmpAppId", context);
            String str2 = this.f13230c;
            return str2;
        }
    }

    /* renamed from: i */
    public final String mo15401i(Context context) {
        if (!mo15388a(context)) {
            return null;
        }
        long longValue = ((Long) aoq.m14620f().mo14695a(aru.f11823av)).longValue();
        if (longValue < 0) {
            return (String) m16911a("getAppInstanceId", context);
        }
        if (this.f13228a.get() == null) {
            AtomicReference<ThreadPoolExecutor> atomicReference = this.f13228a;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) aoq.m14620f().mo14695a(aru.f11824aw)).intValue(), ((Integer) aoq.m14620f().mo14695a(aru.f11824aw)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new C3871ic(this));
            atomicReference.compareAndSet(null, threadPoolExecutor);
        }
        Future submit = ((ThreadPoolExecutor) this.f13228a.get()).submit(new C3869ia(this, context));
        try {
            return (String) submit.get(longValue, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            submit.cancel(true);
            if (e instanceof TimeoutException) {
                return "TIME_OUT";
            }
            return null;
        }
    }

    /* renamed from: j */
    public final String mo15402j(Context context) {
        if (!mo15388a(context)) {
            return null;
        }
        Object a = m16911a("generateEventId", context);
        if (a != null) {
            return a.toString();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ String mo15403k(Context context) throws Exception {
        return (String) m16911a("getAppInstanceId", context);
    }
}

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.p140b.C3404c;
import com.google.android.gms.common.util.C3553e;
import com.google.android.gms.common.util.C3565q;
import com.google.android.gms.measurement.internal.C4882h.C4883a;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.et */
public final class C4870et extends C4787bs {

    /* renamed from: a */
    private Boolean f15826a;

    /* renamed from: b */
    private C4872ev f15827b = C4871eu.f15829a;

    /* renamed from: c */
    private Boolean f15828c;

    C4870et(C4764aw awVar) {
        super(awVar);
        C4882h.m21221a(awVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17638a(C4872ev evVar) {
        this.f15827b = evVar;
    }

    /* renamed from: e */
    static String m21095e() {
        return (String) C4882h.f15911i.mo17726b();
    }

    /* renamed from: a */
    public final int mo17636a(String str) {
        return mo17640b(str, C4882h.f15925w);
    }

    /* renamed from: f */
    public final long mo17647f() {
        mo17161u();
        return 14710;
    }

    /* renamed from: g */
    public final boolean mo17649g() {
        if (this.f15828c == null) {
            synchronized (this) {
                if (this.f15828c == null) {
                    ApplicationInfo applicationInfo = mo17154n().getApplicationInfo();
                    String a = C3565q.m12776a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f15828c = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.f15828c == null) {
                        this.f15828c = Boolean.TRUE;
                        mo17158r().mo17761y_().mo17763a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f15828c.booleanValue();
    }

    /* renamed from: a */
    public final long mo17637a(String str, C4883a<Long> aVar) {
        if (str == null) {
            return ((Long) aVar.mo17726b()).longValue();
        }
        String a = this.f15827b.mo17203a(str, aVar.mo17725a());
        if (TextUtils.isEmpty(a)) {
            return ((Long) aVar.mo17726b()).longValue();
        }
        try {
            return ((Long) aVar.mo17724a(Long.valueOf(Long.parseLong(a)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) aVar.mo17726b()).longValue();
        }
    }

    /* renamed from: b */
    public final int mo17640b(String str, C4883a<Integer> aVar) {
        if (str == null) {
            return ((Integer) aVar.mo17726b()).intValue();
        }
        String a = this.f15827b.mo17203a(str, aVar.mo17725a());
        if (TextUtils.isEmpty(a)) {
            return ((Integer) aVar.mo17726b()).intValue();
        }
        try {
            return ((Integer) aVar.mo17724a(Integer.valueOf(Integer.parseInt(a)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) aVar.mo17726b()).intValue();
        }
    }

    /* renamed from: c */
    public final boolean mo17643c(String str, C4883a<Boolean> aVar) {
        if (str == null) {
            return ((Boolean) aVar.mo17726b()).booleanValue();
        }
        String a = this.f15827b.mo17203a(str, aVar.mo17725a());
        if (TextUtils.isEmpty(a)) {
            return ((Boolean) aVar.mo17726b()).booleanValue();
        }
        return ((Boolean) aVar.mo17724a(Boolean.valueOf(Boolean.parseBoolean(a)))).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo17645d(String str, C4883a<Boolean> aVar) {
        return mo17643c(str, aVar);
    }

    /* renamed from: a */
    public final boolean mo17639a(C4883a<Boolean> aVar) {
        return mo17643c(null, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Boolean mo17641b(String str) {
        C3513t.m12627a(str);
        try {
            if (mo17154n().getPackageManager() == null) {
                mo17158r().mo17761y_().mo17763a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = C3404c.m12230a(mo17154n()).mo13390a(mo17154n().getPackageName(), 128);
            if (a == null) {
                mo17158r().mo17761y_().mo17763a("Failed to load metadata: ApplicationInfo is null");
                return null;
            } else if (a.metaData == null) {
                mo17158r().mo17761y_().mo17763a("Failed to load metadata: Metadata bundle is null");
                return null;
            } else if (!a.metaData.containsKey(str)) {
                return null;
            } else {
                return Boolean.valueOf(a.metaData.getBoolean(str));
            }
        } catch (NameNotFoundException e) {
            mo17158r().mo17761y_().mo17764a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: h */
    public final boolean mo17651h() {
        mo17161u();
        Boolean b = mo17641b("firebase_analytics_collection_deactivated");
        return b != null && b.booleanValue();
    }

    /* renamed from: i */
    public final Boolean mo17653i() {
        mo17161u();
        return mo17641b("firebase_analytics_collection_enabled");
    }

    /* renamed from: j */
    public static long m21096j() {
        return ((Long) C4882h.f15861L.mo17726b()).longValue();
    }

    /* renamed from: k */
    public static long m21097k() {
        return ((Long) C4882h.f15914l.mo17726b()).longValue();
    }

    /* renamed from: v */
    public final String mo17666v() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{"debug.firebase.analytics.app", ""});
        } catch (ClassNotFoundException e) {
            mo17158r().mo17761y_().mo17764a("Could not find SystemProperties class", e);
            return "";
        } catch (NoSuchMethodException e2) {
            mo17158r().mo17761y_().mo17764a("Could not find SystemProperties.get() method", e2);
            return "";
        } catch (IllegalAccessException e3) {
            mo17158r().mo17761y_().mo17764a("Could not access SystemProperties.get()", e3);
            return "";
        } catch (InvocationTargetException e4) {
            mo17158r().mo17761y_().mo17764a("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    /* renamed from: w */
    public static boolean m21098w() {
        return ((Boolean) C4882h.f15910h.mo17726b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo17642c(String str) {
        return "1".equals(this.f15827b.mo17203a(str, "gaia_collection_enabled"));
    }

    /* renamed from: d */
    public final boolean mo17644d(String str) {
        return "1".equals(this.f15827b.mo17203a(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo17646e(String str) {
        return mo17643c(str, C4882h.f15871V);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo17648f(String str) {
        return mo17643c(str, C4882h.f15873X);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo17650g(String str) {
        return mo17643c(str, C4882h.f15874Y);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo17652h(String str) {
        return mo17643c(str, C4882h.f15865P);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo17654i(String str) {
        return mo17643c(str, C4882h.f15875Z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final boolean mo17655j(String str) {
        return mo17643c(str, C4882h.f15878aa);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final boolean mo17656k(String str) {
        return mo17643c(str, C4882h.f15880ac);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final boolean mo17657l(String str) {
        return mo17643c(str, C4882h.f15881ad);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final boolean mo17658m(String str) {
        return mo17643c(str, C4882h.f15882ae);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final boolean mo17659n(String str) {
        return mo17643c(str, C4882h.f15884ag);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final boolean mo17667x() {
        if (this.f15826a == null) {
            this.f15826a = mo17641b("app_measurement_lite");
            if (this.f15826a == null) {
                this.f15826a = Boolean.valueOf(false);
            }
        }
        if (this.f15826a.booleanValue() || !this.f15564q.mo17255v()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final boolean mo17660o(String str) {
        return mo17643c(str, C4882h.f15883af);
    }

    /* renamed from: y */
    static boolean m21099y() {
        return ((Boolean) C4882h.f15885ah.mo17726b()).booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final boolean mo17661p(String str) {
        return mo17643c(str, C4882h.f15886ai);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final boolean mo17662q(String str) {
        return mo17643c(str, C4882h.f15887aj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final boolean mo17663r(String str) {
        return mo17643c(str, C4882h.f15888ak);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final boolean mo17664s(String str) {
        return mo17643c(str, C4882h.f15889al);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final boolean mo17665t(String str) {
        return mo17643c(str, C4882h.f15891an);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17138a() {
        super.mo17138a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17141b() {
        super.mo17141b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo17143c() {
        super.mo17143c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo17144d() {
        super.mo17144d();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C4768b mo17152l() {
        return super.mo17152l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C3553e mo17153m() {
        return super.mo17153m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo17154n() {
        return super.mo17154n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C4891p mo17155o() {
        return super.mo17155o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C4862el mo17156p() {
        return super.mo17156p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C4759ar mo17157q() {
        return super.mo17157q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C4893r mo17158r() {
        return super.mo17158r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4745ad mo17159s() {
        return super.mo17159s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C4870et mo17160t() {
        return super.mo17160t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C4868er mo17161u() {
        return super.mo17161u();
    }
}

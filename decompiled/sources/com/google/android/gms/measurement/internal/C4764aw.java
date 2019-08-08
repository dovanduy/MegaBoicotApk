package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C3364e;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.p140b.C3404c;
import com.google.android.gms.common.util.C3553e;
import com.google.android.gms.common.util.C3556h;
import com.google.android.gms.internal.p148e.C4451as;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.aw */
public class C4764aw implements C4789bu {

    /* renamed from: a */
    private static volatile C4764aw f15466a;

    /* renamed from: A */
    private long f15467A;

    /* renamed from: B */
    private volatile Boolean f15468B;

    /* renamed from: C */
    private Boolean f15469C;

    /* renamed from: D */
    private Boolean f15470D;

    /* renamed from: E */
    private int f15471E;

    /* renamed from: F */
    private AtomicInteger f15472F = new AtomicInteger(0);

    /* renamed from: G */
    private final long f15473G;

    /* renamed from: b */
    private final Context f15474b;

    /* renamed from: c */
    private final String f15475c;

    /* renamed from: d */
    private final String f15476d;

    /* renamed from: e */
    private final String f15477e;

    /* renamed from: f */
    private final boolean f15478f;

    /* renamed from: g */
    private final C4868er f15479g;

    /* renamed from: h */
    private final C4870et f15480h;

    /* renamed from: i */
    private final C4745ad f15481i;

    /* renamed from: j */
    private final C4893r f15482j;

    /* renamed from: k */
    private final C4759ar f15483k;

    /* renamed from: l */
    private final C4840dr f15484l;

    /* renamed from: m */
    private final AppMeasurement f15485m;

    /* renamed from: n */
    private final C4862el f15486n;

    /* renamed from: o */
    private final C4891p f15487o;

    /* renamed from: p */
    private final C3553e f15488p;

    /* renamed from: q */
    private final C4811cp f15489q;

    /* renamed from: r */
    private final C4798cc f15490r;

    /* renamed from: s */
    private final C4741a f15491s;

    /* renamed from: t */
    private C4889n f15492t;

    /* renamed from: u */
    private C4815ct f15493u;

    /* renamed from: v */
    private C4768b f15494v;

    /* renamed from: w */
    private C4887l f15495w;

    /* renamed from: x */
    private C4751aj f15496x;

    /* renamed from: y */
    private boolean f15497y = false;

    /* renamed from: z */
    private Boolean f15498z;

    private C4764aw(C4796ca caVar) {
        C3513t.m12625a(caVar);
        this.f15479g = new C4868er(caVar.f15578a);
        C4882h.m21222a(this.f15479g);
        this.f15474b = caVar.f15578a;
        this.f15475c = caVar.f15579b;
        this.f15476d = caVar.f15580c;
        this.f15477e = caVar.f15581d;
        this.f15478f = caVar.f15582e;
        this.f15468B = caVar.f15583f;
        C4888m mVar = caVar.f15584g;
        if (!(mVar == null || mVar.f15950g == null)) {
            Object obj = mVar.f15950g.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f15469C = (Boolean) obj;
            }
            Object obj2 = mVar.f15950g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f15470D = (Boolean) obj2;
            }
        }
        C4451as.m18908a(this.f15474b);
        this.f15488p = C3556h.m12745d();
        this.f15473G = this.f15488p.mo13694a();
        this.f15480h = new C4870et(this);
        C4745ad adVar = new C4745ad(this);
        adVar.mo17301B();
        this.f15481i = adVar;
        C4893r rVar = new C4893r(this);
        rVar.mo17301B();
        this.f15482j = rVar;
        C4862el elVar = new C4862el(this);
        elVar.mo17301B();
        this.f15486n = elVar;
        C4891p pVar = new C4891p(this);
        pVar.mo17301B();
        this.f15487o = pVar;
        this.f15491s = new C4741a(this);
        C4811cp cpVar = new C4811cp(this);
        cpVar.mo17409F();
        this.f15489q = cpVar;
        C4798cc ccVar = new C4798cc(this);
        ccVar.mo17409F();
        this.f15490r = ccVar;
        this.f15485m = new AppMeasurement(this);
        C4840dr drVar = new C4840dr(this);
        drVar.mo17409F();
        this.f15484l = drVar;
        C4759ar arVar = new C4759ar(this);
        arVar.mo17301B();
        this.f15483k = arVar;
        C4868er erVar = this.f15479g;
        if (this.f15474b.getApplicationContext() instanceof Application) {
            C4798cc h = mo17246h();
            if (h.mo17154n().getApplicationContext() instanceof Application) {
                Application application = (Application) h.mo17154n().getApplicationContext();
                if (h.f15587a == null) {
                    h.f15587a = new C4807cl(h, null);
                }
                application.unregisterActivityLifecycleCallbacks(h.f15587a);
                application.registerActivityLifecycleCallbacks(h.f15587a);
                h.mo17158r().mo17759x().mo17763a("Registered activity lifecycle callback");
            }
        } else {
            mo17158r().mo17754i().mo17763a("Application context is not an Application");
        }
        this.f15483k.mo17219a((Runnable) new C4765ax(this, caVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20474a(C4796ca caVar) {
        String str;
        C4895t tVar;
        mo17157q().mo17144d();
        C4870et.m21095e();
        C4768b bVar = new C4768b(this);
        bVar.mo17301B();
        this.f15494v = bVar;
        C4887l lVar = new C4887l(this);
        lVar.mo17409F();
        this.f15495w = lVar;
        C4889n nVar = new C4889n(this);
        nVar.mo17409F();
        this.f15492t = nVar;
        C4815ct ctVar = new C4815ct(this);
        ctVar.mo17409F();
        this.f15493u = ctVar;
        this.f15486n.mo17302C();
        this.f15481i.mo17302C();
        this.f15496x = new C4751aj(this);
        this.f15495w.mo17410G();
        mo17158r().mo17757v().mo17764a("App measurement is starting up, version", Long.valueOf(this.f15480h.mo17647f()));
        C4868er erVar = this.f15479g;
        mo17158r().mo17757v().mo17763a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        C4868er erVar2 = this.f15479g;
        String x = lVar.mo17730x();
        if (TextUtils.isEmpty(this.f15475c)) {
            if (mo17248j().mo17502f(x)) {
                tVar = mo17158r().mo17757v();
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                tVar = mo17158r().mo17757v();
                String str2 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
                String valueOf = String.valueOf(x);
                str = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            tVar.mo17763a(str);
        }
        mo17158r().mo17758w().mo17763a("Debug-level message logging enabled");
        if (this.f15471E != this.f15472F.get()) {
            mo17158r().mo17761y_().mo17765a("Not all components initialized", Integer.valueOf(this.f15471E), Integer.valueOf(this.f15472F.get()));
        }
        this.f15497y = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17236a() {
        mo17157q().mo17144d();
        if (mo17241c().f15386c.mo17188a() == 0) {
            mo17241c().f15386c.mo17189a(this.f15488p.mo13694a());
        }
        if (Long.valueOf(mo17241c().f15391h.mo17188a()).longValue() == 0) {
            mo17158r().mo17759x().mo17764a("Persisting first open", Long.valueOf(this.f15473G));
            mo17241c().f15391h.mo17189a(this.f15473G);
        }
        if (mo17235H()) {
            C4868er erVar = this.f15479g;
            if (!TextUtils.isEmpty(mo17259z().mo17731y()) || !TextUtils.isEmpty(mo17259z().mo17732z())) {
                mo17248j();
                if (C4862el.m20970a(mo17259z().mo17731y(), mo17241c().mo17178g(), mo17259z().mo17732z(), mo17241c().mo17179h())) {
                    mo17158r().mo17757v().mo17763a("Rechecking which service to use due to a GMP App Id change");
                    mo17241c().mo17181j();
                    mo17250l().mo17737x();
                    this.f15493u.mo17361C();
                    this.f15493u.mo17359A();
                    mo17241c().f15391h.mo17189a(this.f15473G);
                    mo17241c().f15393j.mo17193a(null);
                }
                mo17241c().mo17172c(mo17259z().mo17731y());
                mo17241c().mo17174d(mo17259z().mo17732z());
                if (this.f15480h.mo17663r(mo17259z().mo17730x())) {
                    this.f15484l.mo17414a(this.f15473G);
                }
            }
            mo17246h().mo17316a(mo17241c().f15393j.mo17192a());
            C4868er erVar2 = this.f15479g;
            if (!TextUtils.isEmpty(mo17259z().mo17731y()) || !TextUtils.isEmpty(mo17259z().mo17732z())) {
                boolean C = mo17230C();
                if (!mo17241c().mo17185x() && !this.f15480h.mo17651h()) {
                    mo17241c().mo17175d(!C);
                }
                if (!this.f15480h.mo17655j(mo17259z().mo17730x()) || C) {
                    mo17246h().mo17330y();
                }
                mo17257x().mo17368a(new AtomicReference<>());
            }
        } else if (mo17230C()) {
            if (!mo17248j().mo17501d("android.permission.INTERNET")) {
                mo17158r().mo17761y_().mo17763a("App is missing INTERNET permission");
            }
            if (!mo17248j().mo17501d("android.permission.ACCESS_NETWORK_STATE")) {
                mo17158r().mo17761y_().mo17763a("App is missing ACCESS_NETWORK_STATE permission");
            }
            C4868er erVar3 = this.f15479g;
            if (!C3404c.m12230a(this.f15474b).mo13392a() && !this.f15480h.mo17667x()) {
                if (!C4754am.m20401a(this.f15474b)) {
                    mo17158r().mo17761y_().mo17763a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C4862el.m20965a(this.f15474b, false)) {
                    mo17158r().mo17761y_().mo17763a("AppMeasurementService not registered/enabled");
                }
            }
            mo17158r().mo17761y_().mo17763a("Uploading is not possible. App measurement disabled");
        }
    }

    /* renamed from: u */
    public final C4868er mo17161u() {
        return this.f15479g;
    }

    /* renamed from: b */
    public final C4870et mo17240b() {
        return this.f15480h;
    }

    /* renamed from: c */
    public final C4745ad mo17241c() {
        m20473a((C4787bs) this.f15481i);
        return this.f15481i;
    }

    /* renamed from: r */
    public final C4893r mo17158r() {
        m20475b((C4788bt) this.f15482j);
        return this.f15482j;
    }

    /* renamed from: d */
    public final C4893r mo17242d() {
        if (this.f15482j == null || !this.f15482j.mo17303z()) {
            return null;
        }
        return this.f15482j;
    }

    /* renamed from: q */
    public final C4759ar mo17157q() {
        m20475b((C4788bt) this.f15483k);
        return this.f15483k;
    }

    /* renamed from: e */
    public final C4840dr mo17243e() {
        m20476b((C4836dn) this.f15484l);
        return this.f15484l;
    }

    /* renamed from: f */
    public final C4751aj mo17244f() {
        return this.f15496x;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final C4759ar mo17245g() {
        return this.f15483k;
    }

    /* renamed from: h */
    public final C4798cc mo17246h() {
        m20476b((C4836dn) this.f15490r);
        return this.f15490r;
    }

    /* renamed from: i */
    public final AppMeasurement mo17247i() {
        return this.f15485m;
    }

    /* renamed from: j */
    public final C4862el mo17248j() {
        m20473a((C4787bs) this.f15486n);
        return this.f15486n;
    }

    /* renamed from: k */
    public final C4891p mo17249k() {
        m20473a((C4787bs) this.f15487o);
        return this.f15487o;
    }

    /* renamed from: l */
    public final C4889n mo17250l() {
        m20476b((C4836dn) this.f15492t);
        return this.f15492t;
    }

    /* renamed from: n */
    public final Context mo17154n() {
        return this.f15474b;
    }

    /* renamed from: o */
    public final boolean mo17251o() {
        return TextUtils.isEmpty(this.f15475c);
    }

    /* renamed from: p */
    public final String mo17252p() {
        return this.f15475c;
    }

    /* renamed from: s */
    public final String mo17253s() {
        return this.f15476d;
    }

    /* renamed from: t */
    public final String mo17254t() {
        return this.f15477e;
    }

    /* renamed from: v */
    public final boolean mo17255v() {
        return this.f15478f;
    }

    /* renamed from: m */
    public final C3553e mo17153m() {
        return this.f15488p;
    }

    /* renamed from: w */
    public final C4811cp mo17256w() {
        m20476b((C4836dn) this.f15489q);
        return this.f15489q;
    }

    /* renamed from: x */
    public final C4815ct mo17257x() {
        m20476b((C4836dn) this.f15493u);
        return this.f15493u;
    }

    /* renamed from: y */
    public final C4768b mo17258y() {
        m20475b((C4788bt) this.f15494v);
        return this.f15494v;
    }

    /* renamed from: z */
    public final C4887l mo17259z() {
        m20476b((C4836dn) this.f15495w);
        return this.f15495w;
    }

    /* renamed from: A */
    public final C4741a mo17228A() {
        if (this.f15491s != null) {
            return this.f15491s;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: a */
    public static C4764aw m20471a(Context context, C4888m mVar) {
        if (mVar != null && (mVar.f15948e == null || mVar.f15949f == null)) {
            C4888m mVar2 = new C4888m(mVar.f15944a, mVar.f15945b, mVar.f15946c, mVar.f15947d, null, null, mVar.f15950g);
            mVar = mVar2;
        }
        C3513t.m12625a(context);
        C3513t.m12625a(context.getApplicationContext());
        if (f15466a == null) {
            synchronized (C4764aw.class) {
                if (f15466a == null) {
                    f15466a = new C4764aw(new C4796ca(context, mVar));
                }
            }
        } else if (!(mVar == null || mVar.f15950g == null || !mVar.f15950g.containsKey("dataCollectionDefaultEnabled"))) {
            f15466a.mo17239a(mVar.f15950g.getBoolean("dataCollectionDefaultEnabled"));
        }
        return f15466a;
    }

    /* renamed from: I */
    private final void m20470I() {
        if (!this.f15497y) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    /* renamed from: b */
    private static void m20475b(C4788bt btVar) {
        if (btVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!btVar.mo17303z()) {
            String valueOf = String.valueOf(btVar.getClass());
            StringBuilder sb = new StringBuilder(27 + String.valueOf(valueOf).length());
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private static void m20476b(C4836dn dnVar) {
        if (dnVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!dnVar.mo17407D()) {
            String valueOf = String.valueOf(dnVar.getClass());
            StringBuilder sb = new StringBuilder(27 + String.valueOf(valueOf).length());
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m20473a(C4787bs bsVar) {
        if (bsVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17239a(boolean z) {
        this.f15468B = Boolean.valueOf(z);
    }

    /* renamed from: B */
    public final boolean mo17229B() {
        return this.f15468B != null && this.f15468B.booleanValue();
    }

    /* renamed from: C */
    public final boolean mo17230C() {
        boolean z;
        mo17157q().mo17144d();
        m20470I();
        if (this.f15480h.mo17639a(C4882h.f15894aq)) {
            if (this.f15480h.mo17651h()) {
                return false;
            }
            if (this.f15470D != null && this.f15470D.booleanValue()) {
                return false;
            }
            Boolean k = mo17241c().mo17182k();
            if (k != null) {
                return k.booleanValue();
            }
            Boolean i = this.f15480h.mo17653i();
            if (i != null) {
                return i.booleanValue();
            }
            if (this.f15469C != null) {
                return this.f15469C.booleanValue();
            }
            if (C3364e.m12107b()) {
                return false;
            }
            if (!this.f15480h.mo17639a(C4882h.f15890am) || this.f15468B == null) {
                return true;
            }
            return this.f15468B.booleanValue();
        } else if (this.f15480h.mo17651h()) {
            return false;
        } else {
            Boolean i2 = this.f15480h.mo17653i();
            if (i2 != null) {
                z = i2.booleanValue();
            } else {
                z = !C3364e.m12107b();
                if (z && this.f15468B != null && ((Boolean) C4882h.f15890am.mo17726b()).booleanValue()) {
                    z = this.f15468B.booleanValue();
                }
            }
            return mo17241c().mo17173c(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public final long mo17231D() {
        Long valueOf = Long.valueOf(mo17241c().f15391h.mo17188a());
        if (valueOf.longValue() == 0) {
            return this.f15473G;
        }
        return Math.min(this.f15473G, valueOf.longValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public final void mo17232E() {
        C4868er erVar = this.f15479g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final void mo17233F() {
        C4868er erVar = this.f15479g;
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17237a(C4788bt btVar) {
        this.f15471E++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17238a(C4836dn dnVar) {
        this.f15471E++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public final void mo17234G() {
        this.f15472F.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final boolean mo17235H() {
        m20470I();
        mo17157q().mo17144d();
        if (this.f15498z == null || this.f15467A == 0 || (this.f15498z != null && !this.f15498z.booleanValue() && Math.abs(this.f15488p.mo13695b() - this.f15467A) > 1000)) {
            this.f15467A = this.f15488p.mo13695b();
            C4868er erVar = this.f15479g;
            boolean z = true;
            this.f15498z = Boolean.valueOf(mo17248j().mo17501d("android.permission.INTERNET") && mo17248j().mo17501d("android.permission.ACCESS_NETWORK_STATE") && (C3404c.m12230a(this.f15474b).mo13392a() || this.f15480h.mo17667x() || (C4754am.m20401a(this.f15474b) && C4862el.m20965a(this.f15474b, false))));
            if (this.f15498z.booleanValue()) {
                if (!mo17248j().mo17498b(mo17259z().mo17731y(), mo17259z().mo17732z()) && TextUtils.isEmpty(mo17259z().mo17732z())) {
                    z = false;
                }
                this.f15498z = Boolean.valueOf(z);
            }
        }
        return this.f15498z.booleanValue();
    }
}

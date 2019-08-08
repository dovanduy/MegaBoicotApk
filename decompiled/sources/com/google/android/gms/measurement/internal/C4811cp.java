package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p017v4.p023d.C0376a;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.util.C3553e;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.cp */
public final class C4811cp extends C4836dn {

    /* renamed from: a */
    protected C4810co f15631a;

    /* renamed from: b */
    private volatile C4810co f15632b;

    /* renamed from: c */
    private C4810co f15633c;

    /* renamed from: d */
    private final Map<Activity, C4810co> f15634d = new C0376a();

    /* renamed from: e */
    private C4810co f15635e;

    /* renamed from: f */
    private String f15636f;

    public C4811cp(C4764aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo17328v() {
        return false;
    }

    /* renamed from: x */
    public final C4810co mo17355x() {
        mo17408E();
        mo17144d();
        return this.f15631a;
    }

    /* renamed from: a */
    public final void mo17350a(Activity activity, String str, String str2) {
        if (this.f15632b == null) {
            mo17158r().mo17754i().mo17763a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f15634d.get(activity) == null) {
            mo17158r().mo17754i().mo17763a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = m20647a(activity.getClass().getCanonicalName());
            }
            boolean equals = this.f15632b.f15628b.equals(str2);
            boolean c = C4862el.m20976c(this.f15632b.f15627a, str);
            if (equals && c) {
                mo17158r().mo17756k().mo17763a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                mo17158r().mo17754i().mo17764a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                mo17158r().mo17759x().mo17765a("Setting current screen to name, class", str == null ? "null" : str, str2);
                C4810co coVar = new C4810co(str, str2, mo17156p().mo17503g());
                this.f15634d.put(activity, coVar);
                m20648a(activity, coVar, true);
            } else {
                mo17158r().mo17754i().mo17764a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* renamed from: y */
    public final C4810co mo17356y() {
        mo17141b();
        return this.f15632b;
    }

    /* renamed from: a */
    private final void m20648a(Activity activity, C4810co coVar, boolean z) {
        C4810co coVar2 = this.f15632b == null ? this.f15633c : this.f15632b;
        if (coVar.f15628b == null) {
            coVar = new C4810co(coVar.f15627a, m20647a(activity.getClass().getCanonicalName()), coVar.f15629c);
        }
        this.f15633c = this.f15632b;
        this.f15632b = coVar;
        mo17157q().mo17219a((Runnable) new C4812cq(this, z, coVar2, coVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20650a(C4810co coVar, boolean z) {
        mo17145e().mo17139a(mo17153m().mo13695b());
        if (mo17151k().mo17416a(coVar.f15630d, z)) {
            coVar.f15630d = false;
        }
    }

    /* renamed from: a */
    public static void m20649a(C4810co coVar, Bundle bundle, boolean z) {
        if (bundle == null || coVar == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && coVar == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
            }
            return;
        }
        if (coVar.f15627a != null) {
            bundle.putString("_sn", coVar.f15627a);
        } else {
            bundle.remove("_sn");
        }
        bundle.putString("_sc", coVar.f15628b);
        bundle.putLong("_si", coVar.f15629c);
    }

    /* renamed from: a */
    public final void mo17351a(String str, C4810co coVar) {
        mo17144d();
        synchronized (this) {
            if (this.f15636f == null || this.f15636f.equals(str) || coVar != null) {
                this.f15636f = str;
                this.f15635e = coVar;
            }
        }
    }

    /* renamed from: a */
    private static String m20647a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    /* renamed from: d */
    private final C4810co m20652d(Activity activity) {
        C3513t.m12625a(activity);
        C4810co coVar = (C4810co) this.f15634d.get(activity);
        if (coVar != null) {
            return coVar;
        }
        C4810co coVar2 = new C4810co(null, m20647a(activity.getClass().getCanonicalName()), mo17156p().mo17503g());
        this.f15634d.put(activity, coVar2);
        return coVar2;
    }

    /* renamed from: a */
    public final void mo17349a(Activity activity, Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("com.google.app_measurement.screen_service");
            if (bundle2 != null) {
                this.f15634d.put(activity, new C4810co(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(TtmlNode.ATTR_ID)));
            }
        }
    }

    /* renamed from: a */
    public final void mo17348a(Activity activity) {
        m20648a(activity, m20652d(activity), false);
        C4741a e = mo17145e();
        e.mo17157q().mo17219a((Runnable) new C4797cb(e, e.mo17153m().mo13695b()));
    }

    /* renamed from: b */
    public final void mo17352b(Activity activity) {
        C4810co d = m20652d(activity);
        this.f15633c = this.f15632b;
        this.f15632b = null;
        mo17157q().mo17219a((Runnable) new C4814cs(this, d));
    }

    /* renamed from: b */
    public final void mo17353b(Activity activity, Bundle bundle) {
        if (bundle != null) {
            C4810co coVar = (C4810co) this.f15634d.get(activity);
            if (coVar != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong(TtmlNode.ATTR_ID, coVar.f15629c);
                bundle2.putString("name", coVar.f15627a);
                bundle2.putString("referrer_name", coVar.f15628b);
                bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
            }
        }
    }

    /* renamed from: c */
    public final void mo17354c(Activity activity) {
        this.f15634d.remove(activity);
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

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C4741a mo17145e() {
        return super.mo17145e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C4798cc mo17146f() {
        return super.mo17146f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4887l mo17147g() {
        return super.mo17147g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C4815ct mo17148h() {
        return super.mo17148h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4811cp mo17149i() {
        return super.mo17149i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C4889n mo17150j() {
        return super.mo17150j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C4840dr mo17151k() {
        return super.mo17151k();
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

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.p017v4.p023d.C0376a;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.util.C3553e;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.a */
public final class C4741a extends C4813cr {

    /* renamed from: a */
    private final Map<String, Long> f15369a = new C0376a();

    /* renamed from: b */
    private final Map<String, Integer> f15370b = new C0376a();

    /* renamed from: c */
    private long f15371c;

    public C4741a(C4764aw awVar) {
        super(awVar);
    }

    /* renamed from: a */
    public final void mo17140a(String str, long j) {
        if (str == null || str.length() == 0) {
            mo17158r().mo17761y_().mo17763a("Ad unit id must be a non-empty string");
        } else {
            mo17157q().mo17219a((Runnable) new C4901z(this, str, j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m20337c(String str, long j) {
        mo17141b();
        mo17144d();
        C3513t.m12627a(str);
        if (this.f15370b.isEmpty()) {
            this.f15371c = j;
        }
        Integer num = (Integer) this.f15370b.get(str);
        if (num != null) {
            this.f15370b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f15370b.size() >= 100) {
            mo17158r().mo17754i().mo17763a("Too many ads visible");
        } else {
            this.f15370b.put(str, Integer.valueOf(1));
            this.f15369a.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public final void mo17142b(String str, long j) {
        if (str == null || str.length() == 0) {
            mo17158r().mo17761y_().mo17763a("Ad unit id must be a non-empty string");
        } else {
            mo17157q().mo17219a((Runnable) new C4769ba(this, str, j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m20338d(String str, long j) {
        mo17141b();
        mo17144d();
        C3513t.m12627a(str);
        Integer num = (Integer) this.f15370b.get(str);
        if (num != null) {
            C4810co x = mo17149i().mo17355x();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f15370b.remove(str);
                Long l = (Long) this.f15369a.get(str);
                if (l == null) {
                    mo17158r().mo17761y_().mo17763a("First ad unit exposure time was never set");
                } else {
                    long longValue = j - l.longValue();
                    this.f15369a.remove(str);
                    m20334a(str, longValue, x);
                }
                if (this.f15370b.isEmpty()) {
                    if (this.f15371c == 0) {
                        mo17158r().mo17761y_().mo17763a("First ad exposure time was never set");
                        return;
                    } else {
                        m20331a(j - this.f15371c, x);
                        this.f15371c = 0;
                    }
                }
                return;
            }
            this.f15370b.put(str, Integer.valueOf(intValue));
            return;
        }
        mo17158r().mo17761y_().mo17764a("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: a */
    private final void m20331a(long j, C4810co coVar) {
        if (coVar == null) {
            mo17158r().mo17759x().mo17763a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            mo17158r().mo17759x().mo17764a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C4811cp.m20649a(coVar, bundle, true);
            mo17146f().mo17318a("am", "_xa", bundle);
        }
    }

    /* renamed from: a */
    private final void m20334a(String str, long j, C4810co coVar) {
        if (coVar == null) {
            mo17158r().mo17759x().mo17763a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            mo17158r().mo17759x().mo17764a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C4811cp.m20649a(coVar, bundle, true);
            mo17146f().mo17318a("am", "_xu", bundle);
        }
    }

    /* renamed from: a */
    public final void mo17139a(long j) {
        C4810co x = mo17149i().mo17355x();
        for (String str : this.f15369a.keySet()) {
            m20334a(str, j - ((Long) this.f15369a.get(str)).longValue(), x);
        }
        if (!this.f15369a.isEmpty()) {
            m20331a(j - this.f15371c, x);
        }
        m20335b(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m20335b(long j) {
        for (String put : this.f15369a.keySet()) {
            this.f15369a.put(put, Long.valueOf(j));
        }
        if (!this.f15369a.isEmpty()) {
            this.f15371c = j;
        }
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

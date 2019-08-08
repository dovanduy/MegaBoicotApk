package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.C3553e;
import com.google.android.gms.internal.p148e.C4524d;

/* renamed from: com.google.android.gms.measurement.internal.dr */
public final class C4840dr extends C4836dn {

    /* renamed from: a */
    private Handler f15722a;

    /* renamed from: b */
    private long f15723b = mo17153m().mo13695b();

    /* renamed from: c */
    private long f15724c = this.f15723b;

    /* renamed from: d */
    private final C4879fb f15725d = new C4841ds(this, this.f15564q);

    /* renamed from: e */
    private final C4879fb f15726e = new C4842dt(this, this.f15564q);

    /* renamed from: f */
    private final C4879fb f15727f = new C4843du(this, this.f15564q);

    C4840dr(C4764aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo17328v() {
        return false;
    }

    /* renamed from: z */
    private final void m20785z() {
        synchronized (this) {
            if (this.f15722a == null) {
                this.f15722a = new C4524d(Looper.getMainLooper());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m20781b(long j) {
        mo17144d();
        m20785z();
        mo17158r().mo17759x().mo17764a("Activity resumed, time", Long.valueOf(j));
        this.f15723b = j;
        this.f15724c = this.f15723b;
        if (mo17160t().mo17663r(mo17147g().mo17730x())) {
            mo17414a(mo17153m().mo13694a());
            return;
        }
        this.f15725d.mo17720c();
        this.f15726e.mo17720c();
        if (mo17160t().mo17661p(mo17147g().mo17730x()) || mo17160t().mo17662q(mo17147g().mo17730x())) {
            this.f15727f.mo17720c();
        }
        if (mo17159s().mo17169a(mo17153m().mo13694a())) {
            mo17159s().f15396m.mo17186a(true);
            mo17159s().f15398o.mo17189a(0);
        }
        if (mo17159s().f15396m.mo17187a()) {
            this.f15725d.mo17718a(Math.max(0, mo17159s().f15394k.mo17188a() - mo17159s().f15398o.mo17188a()));
        } else {
            this.f15726e.mo17718a(Math.max(0, 3600000 - mo17159s().f15398o.mo17188a()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17414a(long j) {
        mo17144d();
        m20785z();
        mo17415a(j, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17415a(long j, boolean z) {
        mo17144d();
        m20785z();
        this.f15725d.mo17720c();
        this.f15726e.mo17720c();
        if (mo17160t().mo17661p(mo17147g().mo17730x()) || mo17160t().mo17662q(mo17147g().mo17730x())) {
            this.f15727f.mo17720c();
        }
        if (mo17159s().mo17169a(j)) {
            mo17159s().f15396m.mo17186a(true);
            mo17159s().f15398o.mo17189a(0);
        }
        if (mo17159s().f15396m.mo17187a()) {
            m20784d(j);
            return;
        }
        this.f15726e.mo17718a(Math.max(0, 3600000 - mo17159s().f15398o.mo17188a()));
        if (z && mo17160t().mo17664s(mo17147g().mo17730x())) {
            mo17159s().f15397n.mo17189a(j);
            if (mo17160t().mo17661p(mo17147g().mo17730x()) || mo17160t().mo17662q(mo17147g().mo17730x())) {
                this.f15727f.mo17720c();
                this.f15727f.mo17718a(mo17159s().f15395l.mo17188a());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m20783c(long j) {
        mo17144d();
        m20785z();
        this.f15725d.mo17720c();
        this.f15726e.mo17720c();
        if (mo17160t().mo17661p(mo17147g().mo17730x()) || mo17160t().mo17662q(mo17147g().mo17730x())) {
            this.f15727f.mo17720c();
            this.f15727f.mo17718a(mo17159s().f15395l.mo17188a());
        }
        mo17158r().mo17759x().mo17764a("Activity paused, time", Long.valueOf(j));
        if (this.f15723b != 0) {
            mo17159s().f15398o.mo17189a(mo17159s().f15398o.mo17188a() + (j - this.f15723b));
        }
    }

    /* renamed from: d */
    private final void m20784d(long j) {
        mo17144d();
        mo17158r().mo17759x().mo17764a("Session started, time", Long.valueOf(mo17153m().mo13695b()));
        Long l = null;
        Long valueOf = mo17160t().mo17661p(mo17147g().mo17730x()) ? Long.valueOf(j / 1000) : null;
        if (mo17160t().mo17662q(mo17147g().mo17730x())) {
            l = Long.valueOf(-1);
        }
        long j2 = j;
        mo17146f().mo17320a("auto", "_sid", (Object) valueOf, j2);
        mo17146f().mo17320a("auto", "_sno", (Object) l, j2);
        mo17159s().f15396m.mo17186a(false);
        Bundle bundle = new Bundle();
        if (mo17160t().mo17661p(mo17147g().mo17730x())) {
            bundle.putLong("_sid", valueOf.longValue());
        }
        mo17146f().mo17317a("auto", "_s", j, bundle);
        mo17159s().f15397n.mo17189a(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo17417x() {
        mo17144d();
        m20784d(mo17153m().mo13694a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final long mo17418y() {
        long b = mo17153m().mo13695b();
        long j = b - this.f15724c;
        this.f15724c = b;
        return j;
    }

    /* renamed from: a */
    public final boolean mo17416a(boolean z, boolean z2) {
        mo17144d();
        mo17408E();
        long b = mo17153m().mo13695b();
        mo17159s().f15397n.mo17189a(mo17153m().mo13694a());
        long j = b - this.f15723b;
        if (z || j >= 1000) {
            mo17159s().f15398o.mo17189a(j);
            mo17158r().mo17759x().mo17764a("Recording user engagement, ms", Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            C4811cp.m20649a(mo17149i().mo17355x(), bundle, true);
            if (mo17160t().mo17665t(mo17147g().mo17730x())) {
                if (mo17160t().mo17645d(mo17147g().mo17730x(), C4882h.f15892ao)) {
                    if (!z2) {
                        mo17418y();
                    }
                } else if (z2) {
                    bundle.putLong("_fr", 1);
                } else {
                    mo17418y();
                }
            }
            if (!mo17160t().mo17645d(mo17147g().mo17730x(), C4882h.f15892ao) || !z2) {
                mo17146f().mo17318a("auto", "_e", bundle);
            }
            this.f15723b = b;
            this.f15726e.mo17720c();
            this.f15726e.mo17718a(Math.max(0, 3600000 - mo17159s().f15398o.mo17188a()));
            return true;
        }
        mo17158r().mo17759x().mo17764a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m20778A() {
        mo17144d();
        mo17416a(false, false);
        mo17145e().mo17139a(mo17153m().mo13695b());
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

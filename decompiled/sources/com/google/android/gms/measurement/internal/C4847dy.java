package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.appnext.base.p046b.C1245d;
import com.google.android.gms.common.util.C3553e;
import com.google.android.gms.internal.p148e.C4432a;

/* renamed from: com.google.android.gms.measurement.internal.dy */
public final class C4847dy extends C4851eb {

    /* renamed from: b */
    private final AlarmManager f15737b = ((AlarmManager) mo17154n().getSystemService("alarm"));

    /* renamed from: c */
    private final C4879fb f15738c;

    /* renamed from: d */
    private Integer f15739d;

    protected C4847dy(C4852ec ecVar) {
        super(ecVar);
        this.f15738c = new C4848dz(this, ecVar.mo17462p(), ecVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo17212e() {
        this.f15737b.cancel(m20821y());
        if (VERSION.SDK_INT >= 24) {
            m20819w();
        }
        return false;
    }

    @TargetApi(24)
    /* renamed from: w */
    private final void m20819w() {
        JobScheduler jobScheduler = (JobScheduler) mo17154n().getSystemService("jobscheduler");
        int x = m20820x();
        mo17158r().mo17759x().mo17764a("Cancelling job. JobID", Integer.valueOf(x));
        jobScheduler.cancel(x);
    }

    /* renamed from: a */
    public final void mo17424a(long j) {
        mo17430k();
        mo17161u();
        Context n = mo17154n();
        if (!C4754am.m20401a(n)) {
            mo17158r().mo17758w().mo17763a("Receiver not registered/enabled");
        }
        if (!C4862el.m20965a(n, false)) {
            mo17158r().mo17758w().mo17763a("Service not registered/enabled");
        }
        mo17425f();
        long b = mo17153m().mo13695b() + j;
        if (j < Math.max(0, ((Long) C4882h.f15855F.mo17726b()).longValue()) && !this.f15738c.mo17719b()) {
            mo17158r().mo17759x().mo17763a("Scheduling upload with DelayedRunnable");
            this.f15738c.mo17718a(j);
        }
        mo17161u();
        if (VERSION.SDK_INT >= 24) {
            mo17158r().mo17759x().mo17763a("Scheduling upload with JobScheduler");
            Context n2 = mo17154n();
            ComponentName componentName = new ComponentName(n2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int x = m20820x();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString(C1245d.f3959jb, "com.google.android.gms.measurement.UPLOAD");
            JobInfo build = new Builder(x, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            mo17158r().mo17759x().mo17764a("Scheduling job. JobID", Integer.valueOf(x));
            C4432a.m18858a(n2, build, "com.google.android.gms", "UploadAlarm");
            return;
        }
        mo17158r().mo17759x().mo17763a("Scheduling upload with AlarmManager");
        this.f15737b.setInexactRepeating(2, b, Math.max(((Long) C4882h.f15850A.mo17726b()).longValue(), j), m20821y());
    }

    /* renamed from: x */
    private final int m20820x() {
        if (this.f15739d == null) {
            String str = "measurement";
            String valueOf = String.valueOf(mo17154n().getPackageName());
            this.f15739d = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.f15739d.intValue();
    }

    /* renamed from: f */
    public final void mo17425f() {
        mo17430k();
        this.f15737b.cancel(m20821y());
        this.f15738c.mo17720c();
        if (VERSION.SDK_INT >= 24) {
            m20819w();
        }
    }

    /* renamed from: y */
    private final PendingIntent m20821y() {
        Context n = mo17154n();
        return PendingIntent.getBroadcast(n, 0, new Intent().setClassName(n, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4859ei mo17214g() {
        return super.mo17214g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C4867eq mo17216h() {
        return super.mo17216h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4873ew mo17217i() {
        return super.mo17217i();
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

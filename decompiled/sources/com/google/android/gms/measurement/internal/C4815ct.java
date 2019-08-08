package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.stats.C3541a;
import com.google.android.gms.common.util.C3553e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.ct */
public final class C4815ct extends C4836dn {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4828df f15643a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4884i f15644b;

    /* renamed from: c */
    private volatile Boolean f15645c;

    /* renamed from: d */
    private final C4879fb f15646d;

    /* renamed from: e */
    private final C4846dx f15647e;

    /* renamed from: f */
    private final List<Runnable> f15648f = new ArrayList();

    /* renamed from: g */
    private final C4879fb f15649g;

    protected C4815ct(C4764aw awVar) {
        super(awVar);
        this.f15647e = new C4846dx(awVar.mo17153m());
        this.f15643a = new C4828df(this);
        this.f15646d = new C4816cu(this, awVar);
        this.f15649g = new C4820cy(this, awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo17328v() {
        return false;
    }

    /* renamed from: x */
    public final boolean mo17371x() {
        mo17144d();
        mo17408E();
        return this.f15644b != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo17372y() {
        mo17144d();
        mo17408E();
        m20704a((Runnable) new C4821cz(this, m20701a(true)));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17364a(com.google.android.gms.measurement.internal.C4884i r12, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r13, com.google.android.gms.measurement.internal.zzk r14) {
        /*
            r11 = this;
            r11.mo17144d()
            r11.mo17141b()
            r11.mo17408E()
            boolean r0 = r11.m20695H()
            r1 = 0
            r2 = 100
            r3 = r1
            r4 = r2
        L_0x0012:
            r5 = 1001(0x3e9, float:1.403E-42)
            if (r3 >= r5) goto L_0x00a8
            if (r4 != r2) goto L_0x00a8
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.measurement.internal.n r5 = r11.mo17150j()
            java.util.List r5 = r5.mo17733a(r2)
            if (r5 == 0) goto L_0x0031
            r4.addAll(r5)
            int r5 = r5.size()
            goto L_0x0032
        L_0x0031:
            r5 = r1
        L_0x0032:
            if (r13 == 0) goto L_0x0039
            if (r5 >= r2) goto L_0x0039
            r4.add(r13)
        L_0x0039:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r6 = r4.size()
            r7 = r1
        L_0x0040:
            if (r7 >= r6) goto L_0x00a3
            java.lang.Object r8 = r4.get(r7)
            int r7 = r7 + 1
            com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r8 = (com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable) r8
            boolean r9 = r8 instanceof com.google.android.gms.measurement.internal.zzag
            if (r9 == 0) goto L_0x0063
            com.google.android.gms.measurement.internal.zzag r8 = (com.google.android.gms.measurement.internal.zzag) r8     // Catch:{ RemoteException -> 0x0054 }
            r12.mo17267a(r8, r14)     // Catch:{ RemoteException -> 0x0054 }
            goto L_0x0040
        L_0x0054:
            r8 = move-exception
            com.google.android.gms.measurement.internal.r r9 = r11.mo17158r()
            com.google.android.gms.measurement.internal.t r9 = r9.mo17761y_()
            java.lang.String r10 = "Failed to send event to the service"
            r9.mo17764a(r10, r8)
            goto L_0x0040
        L_0x0063:
            boolean r9 = r8 instanceof com.google.android.gms.measurement.internal.zzfv
            if (r9 == 0) goto L_0x007c
            com.google.android.gms.measurement.internal.zzfv r8 = (com.google.android.gms.measurement.internal.zzfv) r8     // Catch:{ RemoteException -> 0x006d }
            r12.mo17269a(r8, r14)     // Catch:{ RemoteException -> 0x006d }
            goto L_0x0040
        L_0x006d:
            r8 = move-exception
            com.google.android.gms.measurement.internal.r r9 = r11.mo17158r()
            com.google.android.gms.measurement.internal.t r9 = r9.mo17761y_()
            java.lang.String r10 = "Failed to send attribute to the service"
            r9.mo17764a(r10, r8)
            goto L_0x0040
        L_0x007c:
            boolean r9 = r8 instanceof com.google.android.gms.measurement.internal.zzo
            if (r9 == 0) goto L_0x0095
            com.google.android.gms.measurement.internal.zzo r8 = (com.google.android.gms.measurement.internal.zzo) r8     // Catch:{ RemoteException -> 0x0086 }
            r12.mo17272a(r8, r14)     // Catch:{ RemoteException -> 0x0086 }
            goto L_0x0040
        L_0x0086:
            r8 = move-exception
            com.google.android.gms.measurement.internal.r r9 = r11.mo17158r()
            com.google.android.gms.measurement.internal.t r9 = r9.mo17761y_()
            java.lang.String r10 = "Failed to send conditional property to the service"
            r9.mo17764a(r10, r8)
            goto L_0x0040
        L_0x0095:
            com.google.android.gms.measurement.internal.r r8 = r11.mo17158r()
            com.google.android.gms.measurement.internal.t r8 = r8.mo17761y_()
            java.lang.String r9 = "Discarding data. Unrecognized parcel type."
            r8.mo17763a(r9)
            goto L_0x0040
        L_0x00a3:
            int r3 = r3 + 1
            r4 = r5
            goto L_0x0012
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4815ct.mo17364a(com.google.android.gms.measurement.internal.i, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, com.google.android.gms.measurement.internal.zzk):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17365a(zzag zzag, String str) {
        C3513t.m12625a(zzag);
        mo17144d();
        mo17408E();
        boolean H = m20695H();
        C4823da daVar = new C4823da(this, H, H && mo17150j().mo17734a(zzag), zzag, m20701a(true), str);
        m20704a((Runnable) daVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17367a(zzo zzo) {
        C3513t.m12625a(zzo);
        mo17144d();
        mo17408E();
        mo17161u();
        C4824db dbVar = new C4824db(this, true, mo17150j().mo17736a(zzo), new zzo(zzo), m20701a(true), zzo);
        m20704a((Runnable) dbVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17369a(AtomicReference<List<zzo>> atomicReference, String str, String str2, String str3) {
        mo17144d();
        mo17408E();
        C4825dc dcVar = new C4825dc(this, atomicReference, str, str2, str3, m20701a(false));
        m20704a((Runnable) dcVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17370a(AtomicReference<List<zzfv>> atomicReference, String str, String str2, String str3, boolean z) {
        mo17144d();
        mo17408E();
        C4826dd ddVar = new C4826dd(this, atomicReference, str, str2, str3, z, m20701a(false));
        m20704a((Runnable) ddVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17366a(zzfv zzfv) {
        mo17144d();
        mo17408E();
        m20704a((Runnable) new C4827de(this, m20695H() && mo17150j().mo17735a(zzfv), zzfv, m20701a(true)));
    }

    /* renamed from: H */
    private final boolean m20695H() {
        mo17161u();
        return true;
    }

    /* renamed from: a */
    public final void mo17368a(AtomicReference<String> atomicReference) {
        mo17144d();
        mo17408E();
        m20704a((Runnable) new C4817cv(this, atomicReference, m20701a(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo17373z() {
        mo17144d();
        mo17408E();
        m20704a((Runnable) new C4818cw(this, m20701a(true)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17362a(C4810co coVar) {
        mo17144d();
        mo17408E();
        m20704a((Runnable) new C4819cx(this, coVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public final void m20696I() {
        mo17144d();
        this.f15647e.mo17421a();
        this.f15646d.mo17718a(((Long) C4882h.f15864O.mo17726b()).longValue());
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00be, code lost:
        r0 = false;
        r3 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0109  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17359A() {
        /*
            r6 = this;
            r6.mo17144d()
            r6.mo17408E()
            boolean r0 = r6.mo17371x()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Boolean r0 = r6.f15645c
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0116
            r6.mo17144d()
            r6.mo17408E()
            com.google.android.gms.measurement.internal.ad r0 = r6.mo17159s()
            java.lang.Boolean r0 = r0.mo17180i()
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002c
            r0 = r2
            goto L_0x0110
        L_0x002c:
            r6.mo17161u()
            com.google.android.gms.measurement.internal.l r0 = r6.mo17147g()
            int r0 = r0.mo17728B()
            if (r0 != r2) goto L_0x003d
        L_0x0039:
            r0 = r2
        L_0x003a:
            r3 = r0
            goto L_0x00ed
        L_0x003d:
            com.google.android.gms.measurement.internal.r r0 = r6.mo17158r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo17759x()
            java.lang.String r3 = "Checking service availability"
            r0.mo17763a(r3)
            com.google.android.gms.measurement.internal.el r0 = r6.mo17156p()
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r0 = r0.mo17482a(r3)
            r3 = 9
            if (r0 == r3) goto L_0x00df
            r3 = 18
            if (r0 == r3) goto L_0x00d0
            switch(r0) {
                case 0: goto L_0x00c1;
                case 1: goto L_0x00b1;
                case 2: goto L_0x0081;
                case 3: goto L_0x0073;
                default: goto L_0x0060;
            }
        L_0x0060:
            com.google.android.gms.measurement.internal.r r3 = r6.mo17158r()
            com.google.android.gms.measurement.internal.t r3 = r3.mo17754i()
            java.lang.String r4 = "Unexpected service status"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.mo17764a(r4, r0)
        L_0x0071:
            r0 = r1
            goto L_0x003a
        L_0x0073:
            com.google.android.gms.measurement.internal.r r0 = r6.mo17158r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo17754i()
            java.lang.String r3 = "Service disabled"
            r0.mo17763a(r3)
            goto L_0x0071
        L_0x0081:
            com.google.android.gms.measurement.internal.r r0 = r6.mo17158r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo17758w()
            java.lang.String r3 = "Service container out of date"
            r0.mo17763a(r3)
            com.google.android.gms.measurement.internal.el r0 = r6.mo17156p()
            int r0 = r0.mo17505j()
            r3 = 14500(0x38a4, float:2.0319E-41)
            if (r0 >= r3) goto L_0x009b
            goto L_0x00be
        L_0x009b:
            com.google.android.gms.measurement.internal.ad r0 = r6.mo17159s()
            java.lang.Boolean r0 = r0.mo17180i()
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            r0 = r1
            goto L_0x00af
        L_0x00ae:
            r0 = r2
        L_0x00af:
            r3 = r1
            goto L_0x00ed
        L_0x00b1:
            com.google.android.gms.measurement.internal.r r0 = r6.mo17158r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo17759x()
            java.lang.String r3 = "Service missing"
            r0.mo17763a(r3)
        L_0x00be:
            r0 = r1
            r3 = r2
            goto L_0x00ed
        L_0x00c1:
            com.google.android.gms.measurement.internal.r r0 = r6.mo17158r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo17759x()
            java.lang.String r3 = "Service available"
            r0.mo17763a(r3)
            goto L_0x0039
        L_0x00d0:
            com.google.android.gms.measurement.internal.r r0 = r6.mo17158r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo17754i()
            java.lang.String r3 = "Service updating"
            r0.mo17763a(r3)
            goto L_0x0039
        L_0x00df:
            com.google.android.gms.measurement.internal.r r0 = r6.mo17158r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo17754i()
            java.lang.String r3 = "Service invalid"
            r0.mo17763a(r3)
            goto L_0x0071
        L_0x00ed:
            if (r0 != 0) goto L_0x0107
            com.google.android.gms.measurement.internal.et r4 = r6.mo17160t()
            boolean r4 = r4.mo17667x()
            if (r4 == 0) goto L_0x0107
            com.google.android.gms.measurement.internal.r r3 = r6.mo17158r()
            com.google.android.gms.measurement.internal.t r3 = r3.mo17761y_()
            java.lang.String r4 = "No way to upload. Consider using the full version of Analytics"
            r3.mo17763a(r4)
            r3 = r1
        L_0x0107:
            if (r3 == 0) goto L_0x0110
            com.google.android.gms.measurement.internal.ad r3 = r6.mo17159s()
            r3.mo17168a(r0)
        L_0x0110:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f15645c = r0
        L_0x0116:
            java.lang.Boolean r0 = r6.f15645c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0124
            com.google.android.gms.measurement.internal.df r0 = r6.f15643a
            r0.mo17389b()
            return
        L_0x0124:
            com.google.android.gms.measurement.internal.et r0 = r6.mo17160t()
            boolean r0 = r0.mo17667x()
            if (r0 != 0) goto L_0x0184
            r6.mo17161u()
            android.content.Context r0 = r6.mo17154n()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Context r4 = r6.mo17154n()
            java.lang.String r5 = "com.google.android.gms.measurement.AppMeasurementService"
            android.content.Intent r3 = r3.setClassName(r4, r5)
            r4 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r0.queryIntentServices(r3, r4)
            if (r0 == 0) goto L_0x0157
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0157
            r1 = r2
        L_0x0157:
            if (r1 == 0) goto L_0x0177
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.measurement.START"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r2 = r6.mo17154n()
            r6.mo17161u()
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementService"
            r1.<init>(r2, r3)
            r0.setComponent(r1)
            com.google.android.gms.measurement.internal.df r1 = r6.f15643a
            r1.mo17388a(r0)
            return
        L_0x0177:
            com.google.android.gms.measurement.internal.r r0 = r6.mo17158r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo17761y_()
            java.lang.String r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"
            r0.mo17763a(r1)
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4815ct.mo17359A():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public final Boolean mo17360B() {
        return this.f15645c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17363a(C4884i iVar) {
        mo17144d();
        C3513t.m12625a(iVar);
        this.f15644b = iVar;
        m20696I();
        m20698K();
    }

    /* renamed from: C */
    public final void mo17361C() {
        mo17144d();
        mo17408E();
        this.f15643a.mo17387a();
        try {
            C3541a.m12711a().mo13685a(mo17154n(), this.f15643a);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f15644b = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20702a(ComponentName componentName) {
        mo17144d();
        if (this.f15644b != null) {
            this.f15644b = null;
            mo17158r().mo17759x().mo17764a("Disconnected from device MeasurementService", componentName);
            mo17144d();
            mo17359A();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final void m20697J() {
        mo17144d();
        if (mo17371x()) {
            mo17158r().mo17759x().mo17763a("Inactivity, disconnecting from the service");
            mo17361C();
        }
    }

    /* renamed from: a */
    private final void m20704a(Runnable runnable) throws IllegalStateException {
        mo17144d();
        if (mo17371x()) {
            runnable.run();
        } else if (((long) this.f15648f.size()) >= 1000) {
            mo17158r().mo17761y_().mo17763a("Discarding data. Max runnable queue size reached");
        } else {
            this.f15648f.add(runnable);
            this.f15649g.mo17718a(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            mo17359A();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final void m20698K() {
        mo17144d();
        mo17158r().mo17759x().mo17764a("Processing queued up service tasks", Integer.valueOf(this.f15648f.size()));
        for (Runnable run : this.f15648f) {
            try {
                run.run();
            } catch (Exception e) {
                mo17158r().mo17761y_().mo17764a("Task exception while flushing queue", e);
            }
        }
        this.f15648f.clear();
        this.f15649g.mo17720c();
    }

    /* renamed from: a */
    private final zzk m20701a(boolean z) {
        mo17161u();
        return mo17147g().mo17729a(z ? mo17158r().mo17760y() : null);
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

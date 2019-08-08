package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.C3553e;

/* renamed from: com.google.android.gms.measurement.internal.l */
public final class C4887l extends C4836dn {

    /* renamed from: a */
    private String f15934a;

    /* renamed from: b */
    private String f15935b;

    /* renamed from: c */
    private int f15936c;

    /* renamed from: d */
    private String f15937d;

    /* renamed from: e */
    private String f15938e;

    /* renamed from: f */
    private long f15939f;

    /* renamed from: g */
    private long f15940g;

    /* renamed from: h */
    private int f15941h;

    /* renamed from: i */
    private String f15942i;

    /* renamed from: j */
    private String f15943j;

    C4887l(C4764aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo17328v() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019f A[Catch:{ IllegalStateException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a2 A[Catch:{ IllegalStateException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ab A[Catch:{ IllegalStateException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01be A[Catch:{ IllegalStateException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f3  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17411w() {
        /*
            r10 = this;
            java.lang.String r0 = "unknown"
            java.lang.String r1 = "Unknown"
            java.lang.String r2 = "Unknown"
            android.content.Context r3 = r10.mo17154n()
            java.lang.String r3 = r3.getPackageName()
            android.content.Context r4 = r10.mo17154n()
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.r r4 = r10.mo17158r()
            com.google.android.gms.measurement.internal.t r4 = r4.mo17761y_()
            java.lang.String r7 = "PackageManager is null, app identity information might be inaccurate. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4893r.m21360a(r3)
            r4.mo17764a(r7, r8)
            goto L_0x008b
        L_0x002d:
            java.lang.String r7 = r4.getInstallerPackageName(r3)     // Catch:{ IllegalArgumentException -> 0x0033 }
            r0 = r7
            goto L_0x0044
        L_0x0033:
            com.google.android.gms.measurement.internal.r r7 = r10.mo17158r()
            com.google.android.gms.measurement.internal.t r7 = r7.mo17761y_()
            java.lang.String r8 = "Error retrieving app installer package name. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4893r.m21360a(r3)
            r7.mo17764a(r8, r9)
        L_0x0044:
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "manual_install"
            goto L_0x0053
        L_0x0049:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0053
            java.lang.String r0 = ""
        L_0x0053:
            android.content.Context r7 = r10.mo17154n()     // Catch:{ NameNotFoundException -> 0x007a }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x007a }
            android.content.pm.PackageInfo r7 = r4.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x007a }
            if (r7 == 0) goto L_0x008b
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x007a }
            java.lang.CharSequence r4 = r4.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x007a }
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ NameNotFoundException -> 0x007a }
            if (r8 != 0) goto L_0x0072
            java.lang.String r4 = r4.toString()     // Catch:{ NameNotFoundException -> 0x007a }
            r2 = r4
        L_0x0072:
            java.lang.String r4 = r7.versionName     // Catch:{ NameNotFoundException -> 0x007a }
            int r1 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0079 }
            r6 = r1
            r1 = r4
            goto L_0x008b
        L_0x0079:
            r1 = r4
        L_0x007a:
            com.google.android.gms.measurement.internal.r r4 = r10.mo17158r()
            com.google.android.gms.measurement.internal.t r4 = r4.mo17761y_()
            java.lang.String r7 = "Error retrieving package info. appId, appName"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4893r.m21360a(r3)
            r4.mo17765a(r7, r8, r2)
        L_0x008b:
            r10.f15934a = r3
            r10.f15937d = r0
            r10.f15935b = r1
            r10.f15936c = r6
            r10.f15938e = r2
            r0 = 0
            r10.f15939f = r0
            r10.mo17161u()
            android.content.Context r2 = r10.mo17154n()
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.internal.C3364e.m12104a(r2)
            r4 = 1
            if (r2 == 0) goto L_0x00af
            boolean r6 = r2.mo13080d()
            if (r6 == 0) goto L_0x00af
            r6 = r4
            goto L_0x00b0
        L_0x00af:
            r6 = r5
        L_0x00b0:
            com.google.android.gms.measurement.internal.aw r7 = r10.f15564q
            java.lang.String r7 = r7.mo17252p()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00cc
            java.lang.String r7 = "am"
            com.google.android.gms.measurement.internal.aw r8 = r10.f15564q
            java.lang.String r8 = r8.mo17253s()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00cc
            r7 = r4
            goto L_0x00cd
        L_0x00cc:
            r7 = r5
        L_0x00cd:
            r6 = r6 | r7
            if (r6 != 0) goto L_0x00f9
            if (r2 != 0) goto L_0x00e0
            com.google.android.gms.measurement.internal.r r2 = r10.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17761y_()
            java.lang.String r7 = "GoogleService failed to initialize (no status)"
            r2.mo17763a(r7)
            goto L_0x00f9
        L_0x00e0:
            com.google.android.gms.measurement.internal.r r7 = r10.mo17158r()
            com.google.android.gms.measurement.internal.t r7 = r7.mo17761y_()
            java.lang.String r8 = "GoogleService failed to initialize, status"
            int r9 = r2.mo13081e()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = r2.mo13078a()
            r7.mo17765a(r8, r9, r2)
        L_0x00f9:
            if (r6 == 0) goto L_0x0165
            com.google.android.gms.measurement.internal.et r2 = r10.mo17160t()
            java.lang.Boolean r2 = r2.mo17653i()
            com.google.android.gms.measurement.internal.et r6 = r10.mo17160t()
            boolean r6 = r6.mo17651h()
            if (r6 == 0) goto L_0x0123
            com.google.android.gms.measurement.internal.aw r2 = r10.f15564q
            boolean r2 = r2.mo17251o()
            if (r2 == 0) goto L_0x0165
            com.google.android.gms.measurement.internal.r r2 = r10.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17757v()
            java.lang.String r4 = "Collection disabled with firebase_analytics_collection_deactivated=1"
            r2.mo17763a(r4)
            goto L_0x0165
        L_0x0123:
            if (r2 == 0) goto L_0x0141
            boolean r6 = r2.booleanValue()
            if (r6 != 0) goto L_0x0141
            com.google.android.gms.measurement.internal.aw r2 = r10.f15564q
            boolean r2 = r2.mo17251o()
            if (r2 == 0) goto L_0x0165
            com.google.android.gms.measurement.internal.r r2 = r10.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17757v()
            java.lang.String r4 = "Collection disabled with firebase_analytics_collection_enabled=0"
            r2.mo17763a(r4)
            goto L_0x0165
        L_0x0141:
            if (r2 != 0) goto L_0x0157
            boolean r2 = com.google.android.gms.common.api.internal.C3364e.m12107b()
            if (r2 == 0) goto L_0x0157
            com.google.android.gms.measurement.internal.r r2 = r10.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17757v()
            java.lang.String r4 = "Collection disabled with google_app_measurement_enable=0"
            r2.mo17763a(r4)
            goto L_0x0165
        L_0x0157:
            com.google.android.gms.measurement.internal.r r2 = r10.mo17158r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo17759x()
            java.lang.String r6 = "Collection enabled"
            r2.mo17763a(r6)
            goto L_0x0166
        L_0x0165:
            r4 = r5
        L_0x0166:
            java.lang.String r2 = ""
            r10.f15942i = r2
            java.lang.String r2 = ""
            r10.f15943j = r2
            r10.f15940g = r0
            r10.mo17161u()
            com.google.android.gms.measurement.internal.aw r0 = r10.f15564q
            java.lang.String r0 = r0.mo17252p()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0195
            java.lang.String r0 = "am"
            com.google.android.gms.measurement.internal.aw r1 = r10.f15564q
            java.lang.String r1 = r1.mo17253s()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0195
            com.google.android.gms.measurement.internal.aw r0 = r10.f15564q
            java.lang.String r0 = r0.mo17252p()
            r10.f15943j = r0
        L_0x0195:
            java.lang.String r0 = com.google.android.gms.common.api.internal.C3364e.m12106a()     // Catch:{ IllegalStateException -> 0x01d0 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalStateException -> 0x01d0 }
            if (r1 == 0) goto L_0x01a2
            java.lang.String r1 = ""
            goto L_0x01a3
        L_0x01a2:
            r1 = r0
        L_0x01a3:
            r10.f15942i = r1     // Catch:{ IllegalStateException -> 0x01d0 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalStateException -> 0x01d0 }
            if (r0 != 0) goto L_0x01bc
            com.google.android.gms.common.internal.w r0 = new com.google.android.gms.common.internal.w     // Catch:{ IllegalStateException -> 0x01d0 }
            android.content.Context r1 = r10.mo17154n()     // Catch:{ IllegalStateException -> 0x01d0 }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x01d0 }
            java.lang.String r1 = "admob_app_id"
            java.lang.String r0 = r0.mo13617a(r1)     // Catch:{ IllegalStateException -> 0x01d0 }
            r10.f15943j = r0     // Catch:{ IllegalStateException -> 0x01d0 }
        L_0x01bc:
            if (r4 == 0) goto L_0x01e2
            com.google.android.gms.measurement.internal.r r0 = r10.mo17158r()     // Catch:{ IllegalStateException -> 0x01d0 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo17759x()     // Catch:{ IllegalStateException -> 0x01d0 }
            java.lang.String r1 = "App package, google app id"
            java.lang.String r2 = r10.f15934a     // Catch:{ IllegalStateException -> 0x01d0 }
            java.lang.String r4 = r10.f15942i     // Catch:{ IllegalStateException -> 0x01d0 }
            r0.mo17765a(r1, r2, r4)     // Catch:{ IllegalStateException -> 0x01d0 }
            goto L_0x01e2
        L_0x01d0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r1 = r10.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17761y_()
            java.lang.String r2 = "getGoogleAppId or isMeasurementEnabled failed with exception. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4893r.m21360a(r3)
            r1.mo17765a(r2, r3, r0)
        L_0x01e2:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x01f3
            android.content.Context r0 = r10.mo17154n()
            boolean r0 = com.google.android.gms.common.p140b.C3402a.m12220a(r0)
            r10.f15941h = r0
            return
        L_0x01f3:
            r10.f15941h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4887l.mo17411w():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final zzk mo17729a(String str) {
        String str2;
        mo17144d();
        mo17141b();
        String x = mo17730x();
        String y = mo17731y();
        mo17408E();
        String str3 = this.f15935b;
        long A = (long) mo17727A();
        mo17408E();
        String str4 = this.f15937d;
        long f = mo17160t().mo17647f();
        mo17408E();
        mo17144d();
        if (this.f15939f == 0) {
            this.f15939f = this.f15564q.mo17248j().mo17483a(mo17154n(), mo17154n().getPackageName());
        }
        long j = this.f15939f;
        boolean C = this.f15564q.mo17230C();
        boolean z = !mo17159s().f15399p;
        mo17144d();
        mo17141b();
        if (!mo17160t().mo17654i(this.f15934a) || this.f15564q.mo17230C()) {
            str2 = m21268C();
        } else {
            str2 = null;
        }
        String str5 = str2;
        mo17408E();
        boolean z2 = z;
        String str6 = str5;
        long j2 = this.f15940g;
        long D = this.f15564q.mo17231D();
        int B = mo17728B();
        C4870et t = mo17160t();
        t.mo17141b();
        Boolean b = t.mo17641b("google_analytics_adid_collection_enabled");
        boolean booleanValue = Boolean.valueOf(b == null || b.booleanValue()).booleanValue();
        C4870et t2 = mo17160t();
        t2.mo17141b();
        Boolean b2 = t2.mo17641b("google_analytics_ssaid_collection_enabled");
        zzk zzk = new zzk(x, y, str3, A, str4, f, j, str, C, z2, str6, j2, D, B, booleanValue, Boolean.valueOf(b2 == null || b2.booleanValue()).booleanValue(), mo17159s().mo17184w(), mo17732z());
        return zzk;
    }

    /* renamed from: C */
    private final String m21268C() {
        try {
            Class loadClass = mo17154n().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{mo17154n()});
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    mo17158r().mo17756k().mo17763a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                mo17158r().mo17755j().mo17763a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final String mo17730x() {
        mo17408E();
        return this.f15934a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final String mo17731y() {
        mo17408E();
        return this.f15942i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public final String mo17732z() {
        mo17408E();
        return this.f15943j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public final int mo17727A() {
        mo17408E();
        return this.f15936c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public final int mo17728B() {
        mo17408E();
        return this.f15941h;
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

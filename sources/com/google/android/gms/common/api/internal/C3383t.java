package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.support.p017v4.p023d.C0378b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.common.api.internal.t */
public class C3383t extends C3341cf {

    /* renamed from: e */
    private final C0378b<C3337cc<?>> f9800e = new C0378b<>();

    /* renamed from: f */
    private C3360d f9801f;

    /* renamed from: a */
    public static void m12143a(Activity activity, C3360d dVar, C3337cc<?> ccVar) {
        C3368h a = m11705a(activity);
        C3383t tVar = (C3383t) a.mo13296a("ConnectionlessLifecycleHelper", C3383t.class);
        if (tVar == null) {
            tVar = new C3383t(a);
        }
        tVar.f9801f = dVar;
        C3513t.m12626a(ccVar, (Object) "ApiKey cannot be null");
        tVar.f9800e.add(ccVar);
        dVar.mo13313a(tVar);
    }

    private C3383t(C3368h hVar) {
        super(hVar);
        this.f9525a.mo13297a("ConnectionlessLifecycleHelper", (LifecycleCallback) this);
    }

    /* renamed from: b */
    public void mo13174b() {
        super.mo13174b();
        m12144i();
    }

    /* renamed from: c */
    public void mo13176c() {
        super.mo13176c();
        m12144i();
    }

    /* renamed from: d */
    public void mo13177d() {
        super.mo13177d();
        this.f9801f.mo13316b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13277a(ConnectionResult connectionResult, int i) {
        this.f9801f.mo13315b(connectionResult, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo13278f() {
        this.f9801f.mo13318d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final C0378b<C3337cc<?>> mo13368g() {
        return this.f9800e;
    }

    /* renamed from: i */
    private final void m12144i() {
        if (!this.f9800e.isEmpty()) {
            this.f9801f.mo13313a(this);
        }
    }
}

package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C3405c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.p145b.C4415f;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.cf */
public abstract class C3341cf extends LifecycleCallback implements OnCancelListener {

    /* renamed from: b */
    protected volatile boolean f9671b;

    /* renamed from: c */
    protected final AtomicReference<C3342cg> f9672c;

    /* renamed from: d */
    protected final C3405c f9673d;

    /* renamed from: e */
    private final Handler f9674e;

    protected C3341cf(C3368h hVar) {
        this(hVar, C3405c.m12234a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13277a(ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo13278f();

    private C3341cf(C3368h hVar, C3405c cVar) {
        super(hVar);
        this.f9672c = new AtomicReference<>(null);
        this.f9674e = new C4415f(Looper.getMainLooper());
        this.f9673d = cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        mo13277a(new ConnectionResult(13, null), m11915a((C3342cg) this.f9672c.get()));
        mo13283h();
    }

    /* renamed from: a */
    public void mo13172a(Bundle bundle) {
        super.mo13172a(bundle);
        if (bundle != null) {
            this.f9672c.set(bundle.getBoolean("resolving_error", false) ? new C3342cg(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* renamed from: b */
    public void mo13175b(Bundle bundle) {
        super.mo13175b(bundle);
        C3342cg cgVar = (C3342cg) this.f9672c.get();
        if (cgVar != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", cgVar.mo13285a());
            bundle.putInt("failed_status", cgVar.mo13286b().mo13043c());
            bundle.putParcelable("failed_resolution", cgVar.mo13286b().mo13044d());
        }
    }

    /* renamed from: b */
    public void mo13174b() {
        super.mo13174b();
        this.f9671b = true;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13171a(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.cg> r0 = r3.f9672c
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.cg r0 = (com.google.android.gms.common.api.internal.C3342cg) r0
            r1 = 1
            r2 = 0
            switch(r4) {
                case 1: goto L_0x002e;
                case 2: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0053
        L_0x000e:
            com.google.android.gms.common.c r4 = r3.f9673d
            android.app.Activity r5 = r3.mo13170a()
            int r4 = r4.mo13397a(r5)
            if (r4 != 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = r2
        L_0x001c:
            if (r0 != 0) goto L_0x001f
            return
        L_0x001f:
            com.google.android.gms.common.ConnectionResult r5 = r0.mo13286b()
            int r5 = r5.mo13043c()
            r6 = 18
            if (r5 != r6) goto L_0x0054
            if (r4 != r6) goto L_0x0054
            return
        L_0x002e:
            r4 = -1
            if (r5 != r4) goto L_0x0032
            goto L_0x0054
        L_0x0032:
            if (r5 != 0) goto L_0x0053
            r4 = 13
            if (r6 == 0) goto L_0x003e
            java.lang.String r5 = "<<ResolutionFailureErrorDetail>>"
            int r4 = r6.getIntExtra(r5, r4)
        L_0x003e:
            com.google.android.gms.common.api.internal.cg r5 = new com.google.android.gms.common.api.internal.cg
            com.google.android.gms.common.ConnectionResult r6 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            r6.<init>(r4, r1)
            int r4 = m11915a(r0)
            r5.<init>(r6, r4)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.cg> r4 = r3.f9672c
            r4.set(r5)
            r0 = r5
        L_0x0053:
            r1 = r2
        L_0x0054:
            if (r1 == 0) goto L_0x005a
            r3.mo13283h()
            return
        L_0x005a:
            if (r0 == 0) goto L_0x0067
            com.google.android.gms.common.ConnectionResult r4 = r0.mo13286b()
            int r5 = r0.mo13285a()
            r3.mo13277a(r4, r5)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C3341cf.mo13171a(int, int, android.content.Intent):void");
    }

    /* renamed from: d */
    public void mo13177d() {
        super.mo13177d();
        this.f9671b = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo13283h() {
        this.f9672c.set(null);
        mo13278f();
    }

    /* renamed from: b */
    public final void mo13282b(ConnectionResult connectionResult, int i) {
        C3342cg cgVar = new C3342cg(connectionResult, i);
        if (this.f9672c.compareAndSet(null, cgVar)) {
            this.f9674e.post(new C3343ch(this, cgVar));
        }
    }

    /* renamed from: a */
    private static int m11915a(C3342cg cgVar) {
        if (cgVar == null) {
            return -1;
        }
        return cgVar.mo13285a();
    }
}

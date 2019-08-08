package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.exoplayer2.extractor.p132ts.TsExtractor;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3469d.C3470a;
import com.google.android.gms.common.internal.C3469d.C3471b;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.stats.C3541a;

/* renamed from: com.google.android.gms.measurement.internal.df */
public final class C4828df implements ServiceConnection, C3470a, C3471b {

    /* renamed from: a */
    final /* synthetic */ C4815ct f15700a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile boolean f15701b;

    /* renamed from: c */
    private volatile C4892q f15702c;

    protected C4828df(C4815ct ctVar) {
        this.f15700a = ctVar;
    }

    /* renamed from: a */
    public final void mo17388a(Intent intent) {
        this.f15700a.mo17144d();
        Context n = this.f15700a.mo17154n();
        C3541a a = C3541a.m12711a();
        synchronized (this) {
            if (this.f15701b) {
                this.f15700a.mo17158r().mo17759x().mo17763a("Connection attempt already in progress");
                return;
            }
            this.f15700a.mo17158r().mo17759x().mo17763a("Using local app measurement service");
            this.f15701b = true;
            a.mo13686a(n, intent, this.f15700a.f15643a, TsExtractor.TS_STREAM_TYPE_AC3);
        }
    }

    /* renamed from: a */
    public final void mo17387a() {
        if (this.f15702c != null && (this.f15702c.mo13542h() || this.f15702c.mo13543i())) {
            this.f15702c.mo13541g();
        }
        this.f15702c = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.f15700a.mo17158r().mo17761y_().mo17763a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C3513t.m12634b(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f15701b = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.ct r4 = r3.f15700a     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.r r4 = r4.mo17158r()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.t r4 = r4.mo17761y_()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo17763a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x009a
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0063 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0063 }
            if (r2 == 0) goto L_0x0053
            if (r5 != 0) goto L_0x002f
            goto L_0x0043
        L_0x002f:
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0063 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.C4884i     // Catch:{ RemoteException -> 0x0063 }
            if (r2 == 0) goto L_0x003d
            com.google.android.gms.measurement.internal.i r1 = (com.google.android.gms.measurement.internal.C4884i) r1     // Catch:{ RemoteException -> 0x0063 }
        L_0x003b:
            r0 = r1
            goto L_0x0043
        L_0x003d:
            com.google.android.gms.measurement.internal.k r1 = new com.google.android.gms.measurement.internal.k     // Catch:{ RemoteException -> 0x0063 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0063 }
            goto L_0x003b
        L_0x0043:
            com.google.android.gms.measurement.internal.ct r5 = r3.f15700a     // Catch:{ RemoteException -> 0x0063 }
            com.google.android.gms.measurement.internal.r r5 = r5.mo17158r()     // Catch:{ RemoteException -> 0x0063 }
            com.google.android.gms.measurement.internal.t r5 = r5.mo17759x()     // Catch:{ RemoteException -> 0x0063 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo17763a(r1)     // Catch:{ RemoteException -> 0x0063 }
            goto L_0x0072
        L_0x0053:
            com.google.android.gms.measurement.internal.ct r5 = r3.f15700a     // Catch:{ RemoteException -> 0x0063 }
            com.google.android.gms.measurement.internal.r r5 = r5.mo17158r()     // Catch:{ RemoteException -> 0x0063 }
            com.google.android.gms.measurement.internal.t r5 = r5.mo17761y_()     // Catch:{ RemoteException -> 0x0063 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo17764a(r2, r1)     // Catch:{ RemoteException -> 0x0063 }
            goto L_0x0072
        L_0x0063:
            com.google.android.gms.measurement.internal.ct r5 = r3.f15700a     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.r r5 = r5.mo17158r()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.t r5 = r5.mo17761y_()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo17763a(r1)     // Catch:{ all -> 0x001c }
        L_0x0072:
            if (r0 != 0) goto L_0x008a
            r3.f15701b = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.common.stats.a r4 = com.google.android.gms.common.stats.C3541a.m12711a()     // Catch:{ IllegalArgumentException -> 0x0098 }
            com.google.android.gms.measurement.internal.ct r5 = r3.f15700a     // Catch:{ IllegalArgumentException -> 0x0098 }
            android.content.Context r5 = r5.mo17154n()     // Catch:{ IllegalArgumentException -> 0x0098 }
            com.google.android.gms.measurement.internal.ct r0 = r3.f15700a     // Catch:{ IllegalArgumentException -> 0x0098 }
            com.google.android.gms.measurement.internal.df r0 = r0.f15643a     // Catch:{ IllegalArgumentException -> 0x0098 }
            r4.mo13685a(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0098 }
            goto L_0x0098
        L_0x008a:
            com.google.android.gms.measurement.internal.ct r4 = r3.f15700a     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.ar r4 = r4.mo17157q()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.dg r5 = new com.google.android.gms.measurement.internal.dg     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.mo17219a(r5)     // Catch:{ all -> 0x001c }
        L_0x0098:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x009a:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4828df.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C3513t.m12634b("MeasurementServiceConnection.onServiceDisconnected");
        this.f15700a.mo17158r().mo17758w().mo17763a("Service disconnected");
        this.f15700a.mo17157q().mo17219a((Runnable) new C4830dh(this, componentName));
    }

    /* renamed from: b */
    public final void mo17389b() {
        this.f15700a.mo17144d();
        Context n = this.f15700a.mo17154n();
        synchronized (this) {
            if (this.f15701b) {
                this.f15700a.mo17158r().mo17759x().mo17763a("Connection attempt already in progress");
            } else if (this.f15702c == null || (!this.f15702c.mo13543i() && !this.f15702c.mo13542h())) {
                this.f15702c = new C4892q(n, Looper.getMainLooper(), this, this);
                this.f15700a.mo17158r().mo17759x().mo17763a("Connecting to remote service");
                this.f15701b = true;
                this.f15702c.mo13551q();
            } else {
                this.f15700a.mo17158r().mo17759x().mo17763a("Already awaiting connection attempt");
            }
        }
    }

    /* renamed from: a */
    public final void mo13484a(Bundle bundle) {
        C3513t.m12634b("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f15700a.mo17157q().mo17219a((Runnable) new C4831di(this, (C4884i) this.f15702c.mo13557w()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f15702c = null;
                this.f15701b = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo13483a(int i) {
        C3513t.m12634b("MeasurementServiceConnection.onConnectionSuspended");
        this.f15700a.mo17158r().mo17758w().mo17763a("Service connection suspended");
        this.f15700a.mo17157q().mo17219a((Runnable) new C4832dj(this));
    }

    /* renamed from: a */
    public final void mo13485a(ConnectionResult connectionResult) {
        C3513t.m12634b("MeasurementServiceConnection.onConnectionFailed");
        C4893r d = this.f15700a.f15564q.mo17242d();
        if (d != null) {
            d.mo17754i().mo17764a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f15701b = false;
            this.f15702c = null;
        }
        this.f15700a.mo17157q().mo17219a((Runnable) new C4833dk(this));
    }
}

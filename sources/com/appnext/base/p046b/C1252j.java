package com.appnext.base.p046b;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.C3266f.C3267a;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.api.C3392l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C4718g;
import com.google.android.gms.location.C4719h;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsRequest.C4697a;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.appnext.base.b.j */
public class C1252j {
    protected static final String TAG = "j";

    /* renamed from: jF */
    private static final long f3989jF = 1000;

    /* renamed from: jG */
    private static final long f3990jG = 500;
    /* access modifiers changed from: private */

    /* renamed from: jH */
    public C3266f f3991jH;
    /* access modifiers changed from: private */

    /* renamed from: jI */
    public C1256a f3992jI;

    /* renamed from: jJ */
    private LocationSettingsRequest f3993jJ;
    /* access modifiers changed from: private */

    /* renamed from: jK */
    public C1257b f3994jK;

    /* renamed from: jL */
    private boolean f3995jL;

    /* renamed from: jM */
    private C1258c f3996jM;

    /* renamed from: com.appnext.base.b.j$a */
    private class C1256a implements C3268b, C3269c {
        private C1256a() {
        }

        @SuppressLint({"all"})
        public final void onConnected(Bundle bundle) {
            synchronized (C1252j.this) {
                C1252j.m5312b(C1252j.this);
            }
        }

        public final void onConnectionSuspended(int i) {
            synchronized (C1252j.this) {
                C1252j.this.m5324ct();
                C1252j.this.m5311aD("Connection suspended");
            }
        }

        public final void onConnectionFailed(ConnectionResult connectionResult) {
            new StringBuilder("Connection failed: ConnectionResult.getErrorCode() = ").append(connectionResult.mo13043c());
            synchronized (C1252j.this) {
                C1252j.this.m5324ct();
                C1252j.this.m5311aD(connectionResult.mo13045e());
            }
        }
    }

    /* renamed from: com.appnext.base.b.j$b */
    private class C1257b implements C4718g {
        private C1257b() {
        }

        public final void onLocationChanged(Location location) {
            synchronized (C1252j.this) {
                C1252j.this.m5324ct();
                C1252j.m5307a(C1252j.this, location);
            }
        }
    }

    /* renamed from: com.appnext.base.b.j$c */
    public interface C1258c {
        /* renamed from: a */
        void mo5985a(Location location);

        void onError(String str);
    }

    /* renamed from: a */
    public final void mo5974a(C1258c cVar) {
        this.f3996jM = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void init() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = m5315bz()     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "no location permissions"
            r2.m5311aD(r0)     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            return
        L_0x000e:
            r0 = 0
            r2.f3995jL = r0     // Catch:{ all -> 0x0035 }
            boolean r0 = r2.m5319co()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x001d
            com.google.android.gms.common.api.f r0 = r2.f3991jH     // Catch:{ all -> 0x0035 }
            r0.mo13140e()     // Catch:{ all -> 0x0035 }
            goto L_0x0033
        L_0x001d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0035 }
            r0.<init>()     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = TAG     // Catch:{ all -> 0x0035 }
            r0.append(r1)     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "  Google Api LocationServices not available"
            r0.append(r1)     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0035 }
            r2.m5311aD(r0)     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.base.p046b.C1252j.init():void");
    }

    /* renamed from: cl */
    public final void mo5975cl() {
        synchronized (this) {
            this.f3995jL = true;
            if (this.f3994jK != null) {
                m5324ct();
            }
        }
    }

    /* renamed from: cm */
    public static Location m5317cm() {
        try {
            if (!m5315bz()) {
                return null;
            }
            LocationManager locationManager = (LocationManager) C1247e.getContext().getSystemService("location");
            Location location = null;
            for (String lastKnownLocation : locationManager.getProviders(true)) {
                Location lastKnownLocation2 = locationManager.getLastKnownLocation(lastKnownLocation);
                if (lastKnownLocation2 != null && (location == null || lastKnownLocation2.getAccuracy() < location.getAccuracy())) {
                    location = lastKnownLocation2;
                }
            }
            return location;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: cn */
    private void m5318cn() {
        if (m5319co()) {
            this.f3991jH.mo13140e();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append("  Google Api LocationServices not available");
        m5311aD(sb.toString());
    }

    /* renamed from: co */
    private boolean m5319co() {
        try {
            this.f3992jI = new C1256a();
            this.f3991jH = new C3267a(C1247e.getContext()).mo13149a((C3268b) this.f3992jI).mo13150a((C3269c) this.f3992jI).mo13147a(C4719h.f15339a).mo13152b();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: cp */
    private static LocationRequest m5320cp() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo17012a(1000);
        locationRequest.mo17013b(f3990jG);
        locationRequest.mo17011a(100);
        return locationRequest;
    }

    /* renamed from: cq */
    private void m5321cq() {
        C4697a aVar = new C4697a();
        aVar.mo17024a(m5320cp());
        this.f3993jJ = aVar.mo17025a();
    }

    /* renamed from: cr */
    private void m5322cr() {
        if (this.f3995jL) {
            m5324ct();
            return;
        }
        try {
            C4697a aVar = new C4697a();
            aVar.mo17024a(m5320cp());
            this.f3993jJ = aVar.mo17025a();
            C4719h.f15342d.mo16909a(this.f3991jH, this.f3993jJ).mo13156a((C3392l<? super R>) new C3392l<LocationSettingsResult>() {
                public final void onResult(LocationSettingsResult locationSettingsResult) {
                    synchronized (C1252j.this) {
                        C1252j.m5308a(C1252j.this, locationSettingsResult.mo12984b());
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m5310a(Status status) {
        if (this.f3995jL) {
            m5324ct();
            return;
        }
        if (status.mo13081e() != 0) {
            m5324ct();
            m5311aD(status.mo13078a());
        } else if (this.f3995jL) {
            m5324ct();
        } else {
            try {
                this.f3994jK = new C1257b();
                C4719h.f15340b.mo16918a(this.f3991jH, m5320cp(), this.f3994jK).mo13156a((C3392l<? super R>) new C3392l<Status>() {
                    public final void onResult(Status status) {
                        synchronized (C1252j.this) {
                            C1252j.m5313b(C1252j.this, status);
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    @SuppressLint({"all"})
    /* renamed from: cs */
    private void m5323cs() {
        if (this.f3995jL) {
            m5324ct();
            return;
        }
        try {
            this.f3994jK = new C1257b();
            C4719h.f15340b.mo16918a(this.f3991jH, m5320cp(), this.f3994jK).mo13156a((C3392l<? super R>) new C3392l<Status>() {
                public final void onResult(Status status) {
                    synchronized (C1252j.this) {
                        C1252j.m5313b(C1252j.this, status);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private void m5314b(Status status) {
        if (this.f3995jL) {
            m5324ct();
            return;
        }
        if (!status.mo13080d()) {
            m5324ct();
            m5311aD(status.mo13078a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ct */
    public void m5324ct() {
        try {
            if (this.f3994jK != null) {
                C4719h.f15340b.mo16919a(this.f3991jH, this.f3994jK).mo13156a((C3392l<? super R>) new C3392l<Status>() {
                    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0033 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void onResult(com.google.android.gms.common.api.Status r3) {
                        /*
                            r2 = this;
                            com.appnext.base.b.j r3 = com.appnext.base.p046b.C1252j.this
                            monitor-enter(r3)
                            com.appnext.base.b.j r0 = com.appnext.base.p046b.C1252j.this     // Catch:{ Throwable -> 0x0033 }
                            com.google.android.gms.common.api.f r0 = r0.f3991jH     // Catch:{ Throwable -> 0x0033 }
                            if (r0 == 0) goto L_0x0020
                            com.appnext.base.b.j r0 = com.appnext.base.p046b.C1252j.this     // Catch:{ Throwable -> 0x0033 }
                            com.google.android.gms.common.api.f r0 = r0.f3991jH     // Catch:{ Throwable -> 0x0033 }
                            boolean r0 = r0.mo13145j()     // Catch:{ Throwable -> 0x0033 }
                            if (r0 == 0) goto L_0x0020
                            com.appnext.base.b.j r0 = com.appnext.base.p046b.C1252j.this     // Catch:{ Throwable -> 0x0033 }
                            com.google.android.gms.common.api.f r0 = r0.f3991jH     // Catch:{ Throwable -> 0x0033 }
                            r0.mo13142g()     // Catch:{ Throwable -> 0x0033 }
                        L_0x0020:
                            com.appnext.base.b.j r0 = com.appnext.base.p046b.C1252j.this     // Catch:{ Throwable -> 0x0033 }
                            r1 = 0
                            r0.f3991jH = null     // Catch:{ Throwable -> 0x0033 }
                            com.appnext.base.b.j r0 = com.appnext.base.p046b.C1252j.this     // Catch:{ Throwable -> 0x0033 }
                            r0.f3992jI = null     // Catch:{ Throwable -> 0x0033 }
                            com.appnext.base.b.j r0 = com.appnext.base.p046b.C1252j.this     // Catch:{ Throwable -> 0x0033 }
                            r0.f3994jK = null     // Catch:{ Throwable -> 0x0033 }
                            goto L_0x0033
                        L_0x0031:
                            r0 = move-exception
                            goto L_0x0035
                        L_0x0033:
                            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                            return
                        L_0x0035:
                            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.appnext.base.p046b.C1252j.C12553.onResult(com.google.android.gms.common.api.Status):void");
                    }
                });
                return;
            }
            if (this.f3991jH != null) {
                this.f3991jH.mo13142g();
                this.f3991jH = null;
                this.f3992jI = null;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bz */
    private static boolean m5315bz() {
        return C1248f.m5280g(C1247e.getContext(), "android.permission.ACCESS_FINE_LOCATION") || C1248f.m5280g(C1247e.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
    }

    /* renamed from: e */
    private void m5325e(Location location) {
        if (this.f3996jM != null) {
            this.f3996jM.mo5985a(location);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aD */
    public void m5311aD(String str) {
        if (this.f3996jM != null) {
            this.f3996jM.onError(str);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m5308a(C1252j jVar, Status status) {
        if (jVar.f3995jL) {
            jVar.m5324ct();
            return;
        }
        if (status.mo13081e() != 0) {
            jVar.m5324ct();
            jVar.m5311aD(status.mo13078a());
        } else if (jVar.f3995jL) {
            jVar.m5324ct();
        } else {
            try {
                jVar.f3994jK = new C1257b();
                C4719h.f15340b.mo16918a(jVar.f3991jH, m5320cp(), jVar.f3994jK).mo13156a((C3392l<? super R>) new C3392l<Status>() {
                    public final void onResult(Status status) {
                        synchronized (C1252j.this) {
                            C1252j.m5313b(C1252j.this, status);
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m5313b(C1252j jVar, Status status) {
        if (jVar.f3995jL) {
            jVar.m5324ct();
            return;
        }
        if (!status.mo13080d()) {
            jVar.m5324ct();
            jVar.m5311aD(status.mo13078a());
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m5312b(C1252j jVar) {
        if (jVar.f3995jL) {
            jVar.m5324ct();
            return;
        }
        try {
            C4697a aVar = new C4697a();
            aVar.mo17024a(m5320cp());
            jVar.f3993jJ = aVar.mo17025a();
            C4719h.f15342d.mo16909a(jVar.f3991jH, jVar.f3993jJ).mo13156a((C3392l<? super R>) new C3392l<LocationSettingsResult>() {
                public final void onResult(LocationSettingsResult locationSettingsResult) {
                    synchronized (C1252j.this) {
                        C1252j.m5308a(C1252j.this, locationSettingsResult.mo12984b());
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m5307a(C1252j jVar, Location location) {
        if (jVar.f3996jM != null) {
            jVar.f3996jM.mo5985a(location);
        }
    }
}

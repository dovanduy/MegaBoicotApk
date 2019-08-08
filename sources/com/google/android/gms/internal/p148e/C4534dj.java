package com.google.android.gms.internal.p148e;

/* renamed from: com.google.android.gms.internal.e.dj */
public class C4534dj {

    /* renamed from: a */
    private static final C4499ch f14885a = C4499ch.m19340a();

    /* renamed from: b */
    private C4469bj f14886b;

    /* renamed from: c */
    private volatile C4554ec f14887c;

    /* renamed from: d */
    private volatile C4469bj f14888d;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4534dj)) {
            return false;
        }
        C4534dj djVar = (C4534dj) obj;
        C4554ec ecVar = this.f14887c;
        C4554ec ecVar2 = djVar.f14887c;
        if (ecVar == null && ecVar2 == null) {
            return mo16646c().equals(djVar.mo16646c());
        }
        if (ecVar != null && ecVar2 != null) {
            return ecVar.equals(ecVar2);
        }
        if (ecVar != null) {
            return ecVar.equals(djVar.m19471b(ecVar.mo16615l()));
        }
        return m19471b(ecVar2.mo16615l()).equals(ecVar2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.p148e.C4554ec m19471b(com.google.android.gms.internal.p148e.C4554ec r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.e.ec r0 = r1.f14887c
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.e.ec r0 = r1.f14887c     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f14887c = r2     // Catch:{ db -> 0x0012 }
            com.google.android.gms.internal.e.bj r0 = com.google.android.gms.internal.p148e.C4469bj.f14699a     // Catch:{ db -> 0x0012 }
            r1.f14888d = r0     // Catch:{ db -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f14887c = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.e.bj r2 = com.google.android.gms.internal.p148e.C4469bj.f14699a     // Catch:{ all -> 0x001a }
            r1.f14888d = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.e.ec r2 = r1.f14887c
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4534dj.m19471b(com.google.android.gms.internal.e.ec):com.google.android.gms.internal.e.ec");
    }

    /* renamed from: a */
    public final C4554ec mo16644a(C4554ec ecVar) {
        C4554ec ecVar2 = this.f14887c;
        this.f14886b = null;
        this.f14888d = null;
        this.f14887c = ecVar;
        return ecVar2;
    }

    /* renamed from: b */
    public final int mo16645b() {
        if (this.f14888d != null) {
            return this.f14888d.mo16389a();
        }
        if (this.f14887c != null) {
            return this.f14887c.mo16611h();
        }
        return 0;
    }

    /* renamed from: c */
    public final C4469bj mo16646c() {
        if (this.f14888d != null) {
            return this.f14888d;
        }
        synchronized (this) {
            if (this.f14888d != null) {
                C4469bj bjVar = this.f14888d;
                return bjVar;
            }
            if (this.f14887c == null) {
                this.f14888d = C4469bj.f14699a;
            } else {
                this.f14888d = this.f14887c.mo16361d();
            }
            C4469bj bjVar2 = this.f14888d;
            return bjVar2;
        }
    }
}

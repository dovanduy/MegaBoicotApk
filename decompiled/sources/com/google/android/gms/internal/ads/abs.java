package com.google.android.gms.internal.ads;

public class abs {

    /* renamed from: a */
    private static final aar f10462a = aar.m13215a();

    /* renamed from: b */
    private C4386zw f10463b;

    /* renamed from: c */
    private volatile acl f10464c;

    /* renamed from: d */
    private volatile C4386zw f10465d;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.acl m13347b(com.google.android.gms.internal.ads.acl r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.acl r0 = r1.f10464c
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            com.google.android.gms.internal.ads.acl r0 = r1.f10464c     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.f10464c = r2     // Catch:{ abk -> 0x0012 }
            com.google.android.gms.internal.ads.zw r0 = com.google.android.gms.internal.ads.C4386zw.f14365a     // Catch:{ abk -> 0x0012 }
            r1.f10465d = r0     // Catch:{ abk -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.f10464c = r2     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.ads.zw r2 = com.google.android.gms.internal.ads.C4386zw.f14365a     // Catch:{ all -> 0x0019 }
            r1.f10465d = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            com.google.android.gms.internal.ads.acl r2 = r1.f10464c
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abs.m13347b(com.google.android.gms.internal.ads.acl):com.google.android.gms.internal.ads.acl");
    }

    /* renamed from: a */
    public final acl mo14020a(acl acl) {
        acl acl2 = this.f10464c;
        this.f10463b = null;
        this.f10465d = null;
        this.f10464c = acl;
        return acl2;
    }

    /* renamed from: b */
    public final int mo14021b() {
        if (this.f10465d != null) {
            return this.f10465d.mo13769a();
        }
        if (this.f10464c != null) {
            return this.f10464c.mo13986l();
        }
        return 0;
    }

    /* renamed from: c */
    public final C4386zw mo14022c() {
        if (this.f10465d != null) {
            return this.f10465d;
        }
        synchronized (this) {
            if (this.f10465d != null) {
                C4386zw zwVar = this.f10465d;
                return zwVar;
            }
            this.f10465d = this.f10464c == null ? C4386zw.f14365a : this.f10464c.mo14067h();
            C4386zw zwVar2 = this.f10465d;
            return zwVar2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abs)) {
            return false;
        }
        abs abs = (abs) obj;
        acl acl = this.f10464c;
        acl acl2 = abs.f10464c;
        return (acl == null && acl2 == null) ? mo14022c().equals(abs.mo14022c()) : (acl == null || acl2 == null) ? acl != null ? acl.equals(abs.m13347b(acl.mo13989p())) : m13347b(acl2.mo13989p()).equals(acl2) : acl.equals(acl2);
    }

    public int hashCode() {
        return 1;
    }
}

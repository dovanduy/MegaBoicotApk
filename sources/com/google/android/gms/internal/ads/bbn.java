package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@C3718cm
public final class bbn extends bch {

    /* renamed from: a */
    private final Object f12587a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private bbs f12588b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private bbl f12589c;

    /* renamed from: a */
    public final void mo15056a() {
        synchronized (this.f12587a) {
            if (this.f12589c != null) {
                this.f12589c.mo12468U();
            }
        }
    }

    /* renamed from: a */
    public final void mo15057a(int i) {
        synchronized (this.f12587a) {
            if (this.f12588b != null) {
                this.f12588b.mo15072a(i == 3 ? 1 : 2);
                this.f12588b = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo15058a(ave ave, String str) {
        synchronized (this.f12587a) {
            if (this.f12589c != null) {
                this.f12589c.mo12545a(ave, str);
            }
        }
    }

    /* renamed from: a */
    public final void mo15059a(bbl bbl) {
        synchronized (this.f12587a) {
            this.f12589c = bbl;
        }
    }

    /* renamed from: a */
    public final void mo15060a(bbs bbs) {
        synchronized (this.f12587a) {
            this.f12588b = bbs;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15061a(com.google.android.gms.internal.ads.bcj r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f12587a
            monitor-enter(r0)
            com.google.android.gms.internal.ads.bbs r1 = r3.f12588b     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.bbs r1 = r3.f12588b     // Catch:{ all -> 0x001d }
            r2 = 0
            r1.mo15073a(r2, r4)     // Catch:{ all -> 0x001d }
            r4 = 0
            r3.f12588b = r4     // Catch:{ all -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x0012:
            com.google.android.gms.internal.ads.bbl r4 = r3.f12589c     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x001b
            com.google.android.gms.internal.ads.bbl r4 = r3.f12589c     // Catch:{ all -> 0x001d }
            r4.mo12550ab()     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bbn.mo15061a(com.google.android.gms.internal.ads.bcj):void");
    }

    /* renamed from: a */
    public final void mo15062a(String str) {
    }

    /* renamed from: a */
    public final void mo15063a(String str, String str2) {
        synchronized (this.f12587a) {
            if (this.f12589c != null) {
                this.f12589c.mo12553b(str, str2);
            }
        }
    }

    /* renamed from: b */
    public final void mo15064b() {
        synchronized (this.f12587a) {
            if (this.f12589c != null) {
                this.f12589c.mo12543Y();
            }
        }
    }

    /* renamed from: c */
    public final void mo15065c() {
        synchronized (this.f12587a) {
            if (this.f12589c != null) {
                this.f12589c.mo12544Z();
            }
        }
    }

    /* renamed from: d */
    public final void mo15066d() {
        synchronized (this.f12587a) {
            if (this.f12589c != null) {
                this.f12589c.mo12549aa();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15067e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f12587a
            monitor-enter(r0)
            com.google.android.gms.internal.ads.bbs r1 = r3.f12588b     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.bbs r1 = r3.f12588b     // Catch:{ all -> 0x001d }
            r2 = 0
            r1.mo15072a(r2)     // Catch:{ all -> 0x001d }
            r1 = 0
            r3.f12588b = r1     // Catch:{ all -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x0012:
            com.google.android.gms.internal.ads.bbl r1 = r3.f12589c     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001b
            com.google.android.gms.internal.ads.bbl r1 = r3.f12589c     // Catch:{ all -> 0x001d }
            r1.mo12550ab()     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bbn.mo15067e():void");
    }

    /* renamed from: f */
    public final void mo15068f() {
        synchronized (this.f12587a) {
            if (this.f12589c != null) {
                this.f12589c.mo12469V();
            }
        }
    }

    /* renamed from: g */
    public final void mo15069g() {
        synchronized (this.f12587a) {
            if (this.f12589c != null) {
                this.f12589c.mo12470W();
            }
        }
    }
}

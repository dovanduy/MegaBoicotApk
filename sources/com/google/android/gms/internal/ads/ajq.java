package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class ajq implements axi {

    /* renamed from: a */
    private final Map<String, List<avm<?>>> f11220a = new HashMap();

    /* renamed from: b */
    private final aho f11221b;

    ajq(aho aho) {
        this.f11221b = aho;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean m14288b(com.google.android.gms.internal.ads.avm<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.mo14904e()     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.avm<?>>> r1 = r5.f11220a     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0052 }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x003a
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.avm<?>>> r1 = r5.f11220a     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0052 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            r1.<init>()     // Catch:{ all -> 0x0052 }
        L_0x001e:
            java.lang.String r4 = "waiting-for-response"
            r6.mo14899b(r4)     // Catch:{ all -> 0x0052 }
            r1.add(r6)     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.avm<?>>> r6 = r5.f11220a     // Catch:{ all -> 0x0052 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.C3761eb.f12916a     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0038
            java.lang.String r6 = "Request for cacheKey=%s is in flight, putting on hold."
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x0052 }
            r1[r2] = r0     // Catch:{ all -> 0x0052 }
            com.google.android.gms.internal.ads.C3761eb.m16554b(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x0038:
            monitor-exit(r5)
            return r3
        L_0x003a:
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.avm<?>>> r1 = r5.f11220a     // Catch:{ all -> 0x0052 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0052 }
            r6.mo14893a(r5)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.C3761eb.f12916a     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0050
            java.lang.String r6 = "new request, sending to network %s"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x0052 }
            r1[r2] = r0     // Catch:{ all -> 0x0052 }
            com.google.android.gms.internal.ads.C3761eb.m16554b(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r5)
            return r2
        L_0x0052:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ajq.m14288b(com.google.android.gms.internal.ads.avm):boolean");
    }

    /* renamed from: a */
    public final synchronized void mo14404a(avm<?> avm) {
        String e = avm.mo14904e();
        List list = (List) this.f11220a.remove(e);
        if (list != null && !list.isEmpty()) {
            if (C3761eb.f12916a) {
                C3761eb.m16552a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), e);
            }
            avm avm2 = (avm) list.remove(0);
            this.f11220a.put(e, list);
            avm2.mo14893a((axi) this);
            try {
                this.f11221b.f11078c.put(avm2);
            } catch (InterruptedException e2) {
                C3761eb.m16555c("Couldn't add request to queue. %s", e2.toString());
                Thread.currentThread().interrupt();
                this.f11221b.mo14320a();
            }
        }
    }

    /* renamed from: a */
    public final void mo14405a(avm<?> avm, bbm<?> bbm) {
        List<avm> list;
        if (bbm.f12584b == null || bbm.f12584b.mo14276a()) {
            mo14404a(avm);
            return;
        }
        String e = avm.mo14904e();
        synchronized (this) {
            list = (List) this.f11220a.remove(e);
        }
        if (list != null) {
            if (C3761eb.f12916a) {
                C3761eb.m16552a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), e);
            }
            for (avm a : list) {
                this.f11221b.f11080e.mo14523a(a, bbm);
            }
        }
    }
}

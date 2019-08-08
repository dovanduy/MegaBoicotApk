package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

@C3718cm
public final class bbu implements bbi {

    /* renamed from: a */
    private final zzaef f12620a;

    /* renamed from: b */
    private final bca f12621b;

    /* renamed from: c */
    private final Context f12622c;

    /* renamed from: d */
    private final bbk f12623d;

    /* renamed from: e */
    private final boolean f12624e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final long f12625f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final long f12626g;

    /* renamed from: h */
    private final int f12627h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f12628i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f12629j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Map<C4008ne<bbr>, bbo> f12630k = new HashMap();

    /* renamed from: l */
    private final boolean f12631l;

    /* renamed from: m */
    private final String f12632m;

    /* renamed from: n */
    private List<bbr> f12633n = new ArrayList();

    /* renamed from: o */
    private final boolean f12634o;

    public bbu(Context context, zzaef zzaef, bca bca, bbk bbk, boolean z, boolean z2, String str, long j, long j2, int i, boolean z3) {
        this.f12622c = context;
        this.f12620a = zzaef;
        this.f12621b = bca;
        this.f12623d = bbk;
        this.f12624e = z;
        this.f12631l = z2;
        this.f12632m = str;
        this.f12625f = j;
        this.f12626g = j2;
        this.f12627h = 2;
        this.f12634o = z3;
    }

    /* renamed from: a */
    private final void m15974a(C4008ne<bbr> neVar) {
        C3909jn.f13411a.post(new bbw(this, neVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r4.hasNext() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        r0 = (com.google.android.gms.internal.ads.C4008ne) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1 = (com.google.android.gms.internal.ads.bbr) r0.get();
        r3.f12633n.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r1.f12613a != 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        m15974a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        com.google.android.gms.internal.ads.C3900je.m17432c("Exception while processing an adapter; continuing with other adapters", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        m15974a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        return new com.google.android.gms.internal.ads.bbr(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r4 = r4.iterator();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.bbr m15975b(java.util.List<com.google.android.gms.internal.ads.C4008ne<com.google.android.gms.internal.ads.bbr>> r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f12628i
            monitor-enter(r0)
            boolean r1 = r3.f12629j     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.bbr r4 = new com.google.android.gms.internal.ads.bbr     // Catch:{ all -> 0x0047 }
            r1 = -1
            r4.<init>(r1)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return r4
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            java.util.Iterator r4 = r4.iterator()
        L_0x0014:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r4.next()
            com.google.android.gms.internal.ads.ne r0 = (com.google.android.gms.internal.ads.C4008ne) r0
            java.lang.Object r1 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            com.google.android.gms.internal.ads.bbr r1 = (com.google.android.gms.internal.ads.bbr) r1     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            java.util.List<com.google.android.gms.internal.ads.bbr> r2 = r3.f12633n     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            r2.add(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            if (r1 == 0) goto L_0x0014
            int r2 = r1.f12613a     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            if (r2 != 0) goto L_0x0014
            r3.m15974a(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            return r1
        L_0x0035:
            r0 = move-exception
            java.lang.String r1 = "Exception while processing an adapter; continuing with other adapters"
            com.google.android.gms.internal.ads.C3900je.m17432c(r1, r0)
            goto L_0x0014
        L_0x003c:
            r4 = 0
            r3.m15974a(r4)
            com.google.android.gms.internal.ads.bbr r4 = new com.google.android.gms.internal.ads.bbr
            r0 = 1
            r4.<init>(r0)
            return r4
        L_0x0047:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bbu.m15975b(java.util.List):com.google.android.gms.internal.ads.bbr");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r14.f12623d.f12576n == -1) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r0 = r14.f12623d.f12576n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r0 = 10000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r15 = r15.iterator();
        r3 = null;
        r4 = -1;
        r1 = r0;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r15.hasNext() == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r5 = (com.google.android.gms.internal.ads.C4008ne) r15.next();
        r6 = com.google.android.gms.ads.internal.C3025aw.m10924l().mo13694a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r1 != 0) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r5.isDone() == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r10 = r5.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        r10 = (com.google.android.gms.internal.ads.bbr) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
        r10 = r5.get(r1, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        r14.f12633n.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        if (r10 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r10.f12613a != 0) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        r11 = r10.f12618f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0068, code lost:
        if (r11 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006e, code lost:
        if (r11.mo15075a() <= r4) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0074, code lost:
        r3 = r5;
        r0 = r10;
        r4 = r11.mo15075a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        com.google.android.gms.internal.ads.C3900je.m17432c("Exception while processing an adapter; continuing with other adapters", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008e, code lost:
        java.lang.Math.max(r1 - (com.google.android.gms.ads.internal.C3025aw.m10924l().mo13694a() - r6), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        throw r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009e, code lost:
        m15974a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a1, code lost:
        if (r0 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a9, code lost:
        return new com.google.android.gms.internal.ads.bbr(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00aa, code lost:
        return r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.bbr m15978c(java.util.List<com.google.android.gms.internal.ads.C4008ne<com.google.android.gms.internal.ads.bbr>> r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f12628i
            monitor-enter(r0)
            boolean r1 = r14.f12629j     // Catch:{ all -> 0x00ab }
            r2 = -1
            if (r1 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.bbr r15 = new com.google.android.gms.internal.ads.bbr     // Catch:{ all -> 0x00ab }
            r15.<init>(r2)     // Catch:{ all -> 0x00ab }
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            return r15
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ads.bbk r0 = r14.f12623d
            long r0 = r0.f12576n
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.bbk r0 = r14.f12623d
            long r0 = r0.f12576n
            goto L_0x0021
        L_0x001f:
            r0 = 10000(0x2710, double:4.9407E-320)
        L_0x0021:
            java.util.Iterator r15 = r15.iterator()
            r3 = 0
            r4 = r2
            r1 = r0
            r0 = r3
        L_0x0029:
            boolean r5 = r15.hasNext()
            if (r5 == 0) goto L_0x009e
            java.lang.Object r5 = r15.next()
            com.google.android.gms.internal.ads.ne r5 = (com.google.android.gms.internal.ads.C4008ne) r5
            com.google.android.gms.common.util.e r6 = com.google.android.gms.ads.internal.C3025aw.m10924l()
            long r6 = r6.mo13694a()
            r8 = 0
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0054
            boolean r10 = r5.isDone()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r10 == 0) goto L_0x0054
            java.lang.Object r10 = r5.get()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
        L_0x004d:
            com.google.android.gms.internal.ads.bbr r10 = (com.google.android.gms.internal.ads.bbr) r10     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            goto L_0x005b
        L_0x0050:
            r15 = move-exception
            goto L_0x008e
        L_0x0052:
            r5 = move-exception
            goto L_0x0078
        L_0x0054:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            java.lang.Object r10 = r5.get(r1, r10)     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            goto L_0x004d
        L_0x005b:
            java.util.List<com.google.android.gms.internal.ads.bbr> r11 = r14.f12633n     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            r11.add(r10)     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r10 == 0) goto L_0x007d
            int r11 = r10.f12613a     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r11 != 0) goto L_0x007d
            com.google.android.gms.internal.ads.bcj r11 = r10.f12618f     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r11 == 0) goto L_0x007d
            int r12 = r11.mo15075a()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r12 <= r4) goto L_0x007d
            int r11 = r11.mo15075a()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            r3 = r5
            r0 = r10
            r4 = r11
            goto L_0x007d
        L_0x0078:
            java.lang.String r10 = "Exception while processing an adapter; continuing with other adapters"
            com.google.android.gms.internal.ads.C3900je.m17432c(r10, r5)     // Catch:{ all -> 0x0050 }
        L_0x007d:
            com.google.android.gms.common.util.e r5 = com.google.android.gms.ads.internal.C3025aw.m10924l()
            long r10 = r5.mo13694a()
            long r12 = r10 - r6
            long r5 = r1 - r12
            long r1 = java.lang.Math.max(r5, r8)
            goto L_0x0029
        L_0x008e:
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.C3025aw.m10924l()
            long r3 = r0.mo13694a()
            long r10 = r3 - r6
            long r3 = r1 - r10
            java.lang.Math.max(r3, r8)
            throw r15
        L_0x009e:
            r14.m15974a(r3)
            if (r0 != 0) goto L_0x00aa
            com.google.android.gms.internal.ads.bbr r15 = new com.google.android.gms.internal.ads.bbr
            r0 = 1
            r15.<init>(r0)
            return r15
        L_0x00aa:
            return r0
        L_0x00ab:
            r15 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bbu.m15978c(java.util.List):com.google.android.gms.internal.ads.bbr");
    }

    /* renamed from: a */
    public final bbr mo15051a(List<bbj> list) {
        C3900je.m17429b("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        zzjn zzjn = this.f12620a.f14405d;
        int[] iArr = new int[2];
        if (zzjn.f14549g != null) {
            C3025aw.m10936x();
            if (bbt.m15972a(this.f12632m, iArr)) {
                int i = 0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                zzjn[] zzjnArr = zzjn.f14549g;
                int length = zzjnArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    zzjn zzjn2 = zzjnArr[i];
                    if (i2 == zzjn2.f14547e && i3 == zzjn2.f14544b) {
                        zzjn = zzjn2;
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bbj bbj = (bbj) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(bbj.f12543b);
            C3900je.m17433d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            Iterator it2 = bbj.f12544c.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                Context context = this.f12622c;
                bca bca = this.f12621b;
                bbk bbk = this.f12623d;
                zzjj zzjj = this.f12620a.f14404c;
                zzang zzang = this.f12620a.f14412k;
                boolean z = this.f12624e;
                Iterator it3 = it;
                Iterator it4 = it2;
                ArrayList arrayList2 = arrayList;
                boolean z2 = z;
                bbj bbj2 = bbj;
                zzjn zzjn3 = zzjn;
                zzang zzang2 = zzang;
                bbo bbo = new bbo(context, str2, bca, bbk, bbj2, zzjj, zzjn3, zzang2, z2, this.f12631l, this.f12620a.f14426y, this.f12620a.f14415n, this.f12620a.f14427z, this.f12620a.f14396X, this.f12634o);
                C4008ne a = C3907jl.m17119a((Callable<T>) new bbv<T>(this, bbo));
                this.f12630k.put(a, bbo);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(a);
                arrayList = arrayList3;
                it = it3;
                it2 = it4;
            }
        }
        ArrayList arrayList4 = arrayList;
        return this.f12627h != 2 ? m15975b((List<C4008ne<bbr>>) arrayList4) : m15978c((List<C4008ne<bbr>>) arrayList4);
    }

    /* renamed from: a */
    public final void mo15052a() {
        synchronized (this.f12628i) {
            this.f12629j = true;
            for (bbo a : this.f12630k.values()) {
                a.mo15071a();
            }
        }
    }

    /* renamed from: b */
    public final List<bbr> mo15053b() {
        return this.f12633n;
    }
}

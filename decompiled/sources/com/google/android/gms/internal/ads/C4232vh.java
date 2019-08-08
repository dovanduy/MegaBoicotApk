package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe.C3636a;
import com.google.android.gms.internal.ads.abe.C3640e;

/* renamed from: com.google.android.gms.internal.ads.vh */
public final class C4232vh extends abe<C4232vh, C4233a> implements acn {
    private static volatile acx<C4232vh> zzakh;
    /* access modifiers changed from: private */
    public static final C4232vh zzdiw = new C4232vh();
    private int zzdih;
    private C4386zw zzdip = C4386zw.f14365a;
    private C4239vm zzdiv;

    /* renamed from: com.google.android.gms.internal.ads.vh$a */
    public static final class C4233a extends C3636a<C4232vh, C4233a> implements acn {
        private C4233a() {
            super(C4232vh.zzdiw);
        }

        /* synthetic */ C4233a(C4234vi viVar) {
            this();
        }

        /* renamed from: a */
        public final C4233a mo16117a(int i) {
            mo13994b();
            ((C4232vh) this.f10414a).m18361b(0);
            return this;
        }

        /* renamed from: a */
        public final C4233a mo16118a(C4239vm vmVar) {
            mo13994b();
            ((C4232vh) this.f10414a).m18360a(vmVar);
            return this;
        }

        /* renamed from: a */
        public final C4233a mo16119a(C4386zw zwVar) {
            mo13994b();
            ((C4232vh) this.f10414a).m18362b(zwVar);
            return this;
        }
    }

    static {
        abe.m13287a(C4232vh.class, zzdiw);
    }

    private C4232vh() {
    }

    /* renamed from: a */
    public static C4232vh m18356a(C4386zw zwVar) throws abk {
        return (C4232vh) abe.m13281a(zzdiw, zwVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18360a(C4239vm vmVar) {
        if (vmVar == null) {
            throw new NullPointerException();
        }
        this.zzdiv = vmVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m18361b(int i) {
        this.zzdih = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m18362b(C4386zw zwVar) {
        if (zwVar == null) {
            throw new NullPointerException();
        }
        this.zzdip = zwVar;
    }

    /* renamed from: d */
    public static C4233a m18363d() {
        return (C4233a) ((C3636a) zzdiw.mo13979a(C3640e.f10422e, (Object) null, (Object) null));
    }

    /* renamed from: a */
    public final int mo16114a() {
        return this.zzdih;
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vh>] */
    /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v13, types: [com.google.android.gms.internal.ads.abe$b, com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vh>] */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13, types: [com.google.android.gms.internal.ads.abe$b, com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vh>]
      assigns: [com.google.android.gms.internal.ads.abe$b]
      uses: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vh>]
      mth insns count: 41
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo13979a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            r1 = this;
            int[] r3 = com.google.android.gms.internal.ads.C4234vi.f14121a
            r4 = 1
            int r2 = r2 - r4
            r2 = r3[r2]
            r3 = 0
            switch(r2) {
                case 1: goto L_0x0053;
                case 2: goto L_0x004d;
                case 3: goto L_0x0033;
                case 4: goto L_0x0030;
                case 5: goto L_0x0016;
                case 6: goto L_0x0011;
                case 7: goto L_0x0010;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        L_0x0010:
            return r3
        L_0x0011:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            return r2
        L_0x0016:
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vh> r2 = zzakh
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.vh> r3 = com.google.android.gms.internal.ads.C4232vh.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vh> r2 = zzakh     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.abe$b r2 = new com.google.android.gms.internal.ads.abe$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.vh r4 = zzdiw     // Catch:{ all -> 0x002c }
            r2.<init>(r4)     // Catch:{ all -> 0x002c }
            zzakh = r2     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            return r2
        L_0x002c:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            throw r2
        L_0x002f:
            return r2
        L_0x0030:
            com.google.android.gms.internal.ads.vh r2 = zzdiw
            return r2
        L_0x0033:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzdih"
            r2[r3] = r0
            java.lang.String r3 = "zzdiv"
            r2[r4] = r3
            r3 = 2
            java.lang.String r4 = "zzdip"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n"
            com.google.android.gms.internal.ads.vh r4 = zzdiw
            java.lang.Object r2 = m13285a(r4, r3, r2)
            return r2
        L_0x004d:
            com.google.android.gms.internal.ads.vh$a r2 = new com.google.android.gms.internal.ads.vh$a
            r2.<init>(r3)
            return r2
        L_0x0053:
            com.google.android.gms.internal.ads.vh r2 = new com.google.android.gms.internal.ads.vh
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4232vh.mo13979a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public final C4239vm mo16115b() {
        return this.zzdiv == null ? C4239vm.m18380b() : this.zzdiv;
    }

    /* renamed from: c */
    public final C4386zw mo16116c() {
        return this.zzdip;
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe.C3636a;
import com.google.android.gms.internal.ads.abe.C3640e;

/* renamed from: com.google.android.gms.internal.ads.ux */
public final class C4216ux extends abe<C4216ux, C4217a> implements acn {
    private static volatile acx<C4216ux> zzakh;
    /* access modifiers changed from: private */
    public static final C4216ux zzdik = new C4216ux();
    private int zzdih;
    private C4223vb zzdii;
    private C4277wn zzdij;

    /* renamed from: com.google.android.gms.internal.ads.ux$a */
    public static final class C4217a extends C3636a<C4216ux, C4217a> implements acn {
        private C4217a() {
            super(C4216ux.zzdik);
        }

        /* synthetic */ C4217a(C4218uy uyVar) {
            this();
        }

        /* renamed from: a */
        public final C4217a mo16100a(int i) {
            mo13994b();
            ((C4216ux) this.f10414a).m18313b(i);
            return this;
        }

        /* renamed from: a */
        public final C4217a mo16101a(C4223vb vbVar) {
            mo13994b();
            ((C4216ux) this.f10414a).m18311a(vbVar);
            return this;
        }

        /* renamed from: a */
        public final C4217a mo16102a(C4277wn wnVar) {
            mo13994b();
            ((C4216ux) this.f10414a).m18312a(wnVar);
            return this;
        }
    }

    static {
        abe.m13287a(C4216ux.class, zzdik);
    }

    private C4216ux() {
    }

    /* renamed from: a */
    public static C4216ux m18307a(C4386zw zwVar) throws abk {
        return (C4216ux) abe.m13281a(zzdik, zwVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18311a(C4223vb vbVar) {
        if (vbVar == null) {
            throw new NullPointerException();
        }
        this.zzdii = vbVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18312a(C4277wn wnVar) {
        if (wnVar == null) {
            throw new NullPointerException();
        }
        this.zzdij = wnVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m18313b(int i) {
        this.zzdih = i;
    }

    /* renamed from: d */
    public static C4217a m18314d() {
        return (C4217a) ((C3636a) zzdik.mo13979a(C3640e.f10422e, (Object) null, (Object) null));
    }

    /* renamed from: a */
    public final int mo16097a() {
        return this.zzdih;
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.ux>] */
    /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v13, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.ux>, com.google.android.gms.internal.ads.abe$b] */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.ux>, com.google.android.gms.internal.ads.abe$b]
      assigns: [com.google.android.gms.internal.ads.abe$b]
      uses: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.ux>]
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
            int[] r3 = com.google.android.gms.internal.ads.C4218uy.f14116a
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
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.ux> r2 = zzakh
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.ux> r3 = com.google.android.gms.internal.ads.C4216ux.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.ux> r2 = zzakh     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.abe$b r2 = new com.google.android.gms.internal.ads.abe$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.ux r4 = zzdik     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.ads.ux r2 = zzdik
            return r2
        L_0x0033:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzdih"
            r2[r3] = r0
            java.lang.String r3 = "zzdii"
            r2[r4] = r3
            r3 = 2
            java.lang.String r4 = "zzdij"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t"
            com.google.android.gms.internal.ads.ux r4 = zzdik
            java.lang.Object r2 = m13285a(r4, r3, r2)
            return r2
        L_0x004d:
            com.google.android.gms.internal.ads.ux$a r2 = new com.google.android.gms.internal.ads.ux$a
            r2.<init>(r3)
            return r2
        L_0x0053:
            com.google.android.gms.internal.ads.ux r2 = new com.google.android.gms.internal.ads.ux
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4216ux.mo13979a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public final C4223vb mo16098b() {
        return this.zzdii == null ? C4223vb.m18337e() : this.zzdii;
    }

    /* renamed from: c */
    public final C4277wn mo16099c() {
        return this.zzdij == null ? C4277wn.m18490e() : this.zzdij;
    }
}

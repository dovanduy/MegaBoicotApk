package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe.C3636a;

/* renamed from: com.google.android.gms.internal.ads.vy */
public final class C4256vy extends abe<C4256vy, C4257a> implements acn {
    private static volatile acx<C4256vy> zzakh;
    /* access modifiers changed from: private */
    public static final C4256vy zzdjk = new C4256vy();
    private C4260wa zzdjj;

    /* renamed from: com.google.android.gms.internal.ads.vy$a */
    public static final class C4257a extends C3636a<C4256vy, C4257a> implements acn {
        private C4257a() {
            super(C4256vy.zzdjk);
        }

        /* synthetic */ C4257a(C4258vz vzVar) {
            this();
        }
    }

    static {
        abe.m13287a(C4256vy.class, zzdjk);
    }

    private C4256vy() {
    }

    /* renamed from: a */
    public static C4256vy m18419a(C4386zw zwVar) throws abk {
        return (C4256vy) abe.m13281a(zzdjk, zwVar);
    }

    /* renamed from: a */
    public final C4260wa mo16133a() {
        return this.zzdjj == null ? C4260wa.m18424d() : this.zzdjj;
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vy>] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v12, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vy>, com.google.android.gms.internal.ads.abe$b] */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v12, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vy>, com.google.android.gms.internal.ads.abe$b]
      assigns: [com.google.android.gms.internal.ads.abe$b]
      uses: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vy>]
      mth insns count: 37
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
    public final java.lang.Object mo13979a(int r1, java.lang.Object r2, java.lang.Object r3) {
        /*
            r0 = this;
            int[] r2 = com.google.android.gms.internal.ads.C4258vz.f14145a
            r3 = 1
            int r1 = r1 - r3
            r1 = r2[r1]
            r2 = 0
            switch(r1) {
                case 1: goto L_0x0049;
                case 2: goto L_0x0043;
                case 3: goto L_0x0033;
                case 4: goto L_0x0030;
                case 5: goto L_0x0016;
                case 6: goto L_0x0011;
                case 7: goto L_0x0010;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
        L_0x0010:
            return r2
        L_0x0011:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r3)
            return r1
        L_0x0016:
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vy> r1 = zzakh
            if (r1 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.vy> r2 = com.google.android.gms.internal.ads.C4256vy.class
            monitor-enter(r2)
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vy> r1 = zzakh     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.abe$b r1 = new com.google.android.gms.internal.ads.abe$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.vy r3 = zzdjk     // Catch:{ all -> 0x002c }
            r1.<init>(r3)     // Catch:{ all -> 0x002c }
            zzakh = r1     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            return r1
        L_0x002c:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            throw r1
        L_0x002f:
            return r1
        L_0x0030:
            com.google.android.gms.internal.ads.vy r1 = zzdjk
            return r1
        L_0x0033:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r2 = 0
            java.lang.String r3 = "zzdjj"
            r1[r2] = r3
            java.lang.String r2 = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0000\u0000\u0001\t"
            com.google.android.gms.internal.ads.vy r3 = zzdjk
            java.lang.Object r1 = m13285a(r3, r2, r1)
            return r1
        L_0x0043:
            com.google.android.gms.internal.ads.vy$a r1 = new com.google.android.gms.internal.ads.vy$a
            r1.<init>(r2)
            return r1
        L_0x0049:
            com.google.android.gms.internal.ads.vy r1 = new com.google.android.gms.internal.ads.vy
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4256vy.mo13979a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}

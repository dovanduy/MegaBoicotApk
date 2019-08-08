package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe.C3636a;

/* renamed from: com.google.android.gms.internal.ads.vq */
public final class C4245vq extends abe<C4245vq, C4246a> implements acn {
    private static volatile acx<C4245vq> zzakh;
    /* access modifiers changed from: private */
    public static final C4245vq zzdja = new C4245vq();
    private int zzdir;

    /* renamed from: com.google.android.gms.internal.ads.vq$a */
    public static final class C4246a extends C3636a<C4245vq, C4246a> implements acn {
        private C4246a() {
            super(C4245vq.zzdja);
        }

        /* synthetic */ C4246a(C4247vr vrVar) {
            this();
        }
    }

    static {
        abe.m13287a(C4245vq.class, zzdja);
    }

    private C4245vq() {
    }

    /* renamed from: a */
    public static C4245vq m18396a(C4386zw zwVar) throws abk {
        return (C4245vq) abe.m13281a(zzdja, zwVar);
    }

    /* renamed from: a */
    public final int mo16127a() {
        return this.zzdir;
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vq>] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v12, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vq>, com.google.android.gms.internal.ads.abe$b] */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v12, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vq>, com.google.android.gms.internal.ads.abe$b]
      assigns: [com.google.android.gms.internal.ads.abe$b]
      uses: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vq>]
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
            int[] r2 = com.google.android.gms.internal.ads.C4247vr.f14135a
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
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vq> r1 = zzakh
            if (r1 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.vq> r2 = com.google.android.gms.internal.ads.C4245vq.class
            monitor-enter(r2)
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vq> r1 = zzakh     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.abe$b r1 = new com.google.android.gms.internal.ads.abe$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.vq r3 = zzdja     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.ads.vq r1 = zzdja
            return r1
        L_0x0033:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r2 = 0
            java.lang.String r3 = "zzdir"
            r1[r2] = r3
            java.lang.String r2 = "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0003\u0000\u0000\u0000\u0002\u000b"
            com.google.android.gms.internal.ads.vq r3 = zzdja
            java.lang.Object r1 = m13285a(r3, r2, r1)
            return r1
        L_0x0043:
            com.google.android.gms.internal.ads.vq$a r1 = new com.google.android.gms.internal.ads.vq$a
            r1.<init>(r2)
            return r1
        L_0x0049:
            com.google.android.gms.internal.ads.vq r1 = new com.google.android.gms.internal.ads.vq
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4245vq.mo13979a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}

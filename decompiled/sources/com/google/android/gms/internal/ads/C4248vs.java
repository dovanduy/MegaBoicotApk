package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe.C3636a;
import com.google.android.gms.internal.ads.abe.C3640e;

/* renamed from: com.google.android.gms.internal.ads.vs */
public final class C4248vs extends abe<C4248vs, C4249a> implements acn {
    private static volatile acx<C4248vs> zzakh;
    /* access modifiers changed from: private */
    public static final C4248vs zzdjb = new C4248vs();
    private int zzdih;
    private C4386zw zzdip = C4386zw.f14365a;

    /* renamed from: com.google.android.gms.internal.ads.vs$a */
    public static final class C4249a extends C3636a<C4248vs, C4249a> implements acn {
        private C4249a() {
            super(C4248vs.zzdjb);
        }

        /* synthetic */ C4249a(C4250vt vtVar) {
            this();
        }

        /* renamed from: a */
        public final C4249a mo16130a(int i) {
            mo13994b();
            ((C4248vs) this.f10414a).m18403b(0);
            return this;
        }

        /* renamed from: a */
        public final C4249a mo16131a(C4386zw zwVar) {
            mo13994b();
            ((C4248vs) this.f10414a).m18404b(zwVar);
            return this;
        }
    }

    static {
        abe.m13287a(C4248vs.class, zzdjb);
    }

    private C4248vs() {
    }

    /* renamed from: a */
    public static C4248vs m18400a(C4386zw zwVar) throws abk {
        return (C4248vs) abe.m13281a(zzdjb, zwVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m18403b(int i) {
        this.zzdih = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m18404b(C4386zw zwVar) {
        if (zwVar == null) {
            throw new NullPointerException();
        }
        this.zzdip = zwVar;
    }

    /* renamed from: c */
    public static C4249a m18405c() {
        return (C4249a) ((C3636a) zzdjb.mo13979a(C3640e.f10422e, (Object) null, (Object) null));
    }

    /* renamed from: a */
    public final int mo16128a() {
        return this.zzdih;
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vs>] */
    /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v13, types: [com.google.android.gms.internal.ads.abe$b, com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vs>] */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13, types: [com.google.android.gms.internal.ads.abe$b, com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vs>]
      assigns: [com.google.android.gms.internal.ads.abe$b]
      uses: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vs>]
      mth insns count: 39
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
            int[] r3 = com.google.android.gms.internal.ads.C4250vt.f14136a
            r4 = 1
            int r2 = r2 - r4
            r2 = r3[r2]
            r3 = 0
            switch(r2) {
                case 1: goto L_0x004e;
                case 2: goto L_0x0048;
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
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vs> r2 = zzakh
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.vs> r3 = com.google.android.gms.internal.ads.C4248vs.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.vs> r2 = zzakh     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.abe$b r2 = new com.google.android.gms.internal.ads.abe$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.vs r4 = zzdjb     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.ads.vs r2 = zzdjb
            return r2
        L_0x0033:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzdih"
            r2[r3] = r0
            java.lang.String r3 = "zzdip"
            r2[r4] = r3
            java.lang.String r3 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n"
            com.google.android.gms.internal.ads.vs r4 = zzdjb
            java.lang.Object r2 = m13285a(r4, r3, r2)
            return r2
        L_0x0048:
            com.google.android.gms.internal.ads.vs$a r2 = new com.google.android.gms.internal.ads.vs$a
            r2.<init>(r3)
            return r2
        L_0x004e:
            com.google.android.gms.internal.ads.vs r2 = new com.google.android.gms.internal.ads.vs
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4248vs.mo13979a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public final C4386zw mo16129b() {
        return this.zzdip;
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe.C3636a;
import com.google.android.gms.internal.ads.abe.C3640e;

/* renamed from: com.google.android.gms.internal.ads.wt */
public final class C4286wt extends abe<C4286wt, C4287a> implements acn {
    private static volatile acx<C4286wt> zzakh;
    /* access modifiers changed from: private */
    public static final C4286wt zzdkv = new C4286wt();
    private String zzdks = "";
    private C4386zw zzdkt = C4386zw.f14365a;
    private int zzdku;

    /* renamed from: com.google.android.gms.internal.ads.wt$a */
    public static final class C4287a extends C3636a<C4286wt, C4287a> implements acn {
        private C4287a() {
            super(C4286wt.zzdkv);
        }

        /* synthetic */ C4287a(C4289wu wuVar) {
            this();
        }

        /* renamed from: a */
        public final C4287a mo16168a(C4288b bVar) {
            mo13994b();
            ((C4286wt) this.f10414a).m18510a(bVar);
            return this;
        }

        /* renamed from: a */
        public final C4287a mo16169a(C4386zw zwVar) {
            mo13994b();
            ((C4286wt) this.f10414a).m18514a(zwVar);
            return this;
        }

        /* renamed from: a */
        public final C4287a mo16170a(String str) {
            mo13994b();
            ((C4286wt) this.f10414a).m18515a(str);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.wt$b */
    public enum C4288b implements abh {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: g */
        private static final abi<C4288b> f14177g = null;

        /* renamed from: h */
        private final int f14179h;

        static {
            f14177g = new C4290wv();
        }

        private C4288b(int i) {
            this.f14179h = i;
        }

        /* renamed from: a */
        public static C4288b m18526a(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_KEYMATERIAL;
                case 1:
                    return SYMMETRIC;
                case 2:
                    return ASYMMETRIC_PRIVATE;
                case 3:
                    return ASYMMETRIC_PUBLIC;
                case 4:
                    return REMOTE;
                default:
                    return null;
            }
        }

        /* renamed from: a */
        public final int mo14004a() {
            if (this != UNRECOGNIZED) {
                return this.f14179h;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        abe.m13287a(C4286wt.class, zzdkv);
    }

    private C4286wt() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18510a(C4288b bVar) {
        if (bVar == null) {
            throw new NullPointerException();
        }
        this.zzdku = bVar.mo14004a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18514a(C4386zw zwVar) {
        if (zwVar == null) {
            throw new NullPointerException();
        }
        this.zzdkt = zwVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18515a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.zzdks = str;
    }

    /* renamed from: d */
    public static C4287a m18516d() {
        return (C4287a) ((C3636a) zzdkv.mo13979a(C3640e.f10422e, (Object) null, (Object) null));
    }

    /* renamed from: e */
    public static C4286wt m18517e() {
        return zzdkv;
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.wt>] */
    /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v13, types: [com.google.android.gms.internal.ads.abe$b, com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.wt>] */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13, types: [com.google.android.gms.internal.ads.abe$b, com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.wt>]
      assigns: [com.google.android.gms.internal.ads.abe$b]
      uses: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.wt>]
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
            int[] r3 = com.google.android.gms.internal.ads.C4289wu.f14180a
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
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.wt> r2 = zzakh
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.wt> r3 = com.google.android.gms.internal.ads.C4286wt.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.wt> r2 = zzakh     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.abe$b r2 = new com.google.android.gms.internal.ads.abe$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.wt r4 = zzdkv     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.ads.wt r2 = zzdkv
            return r2
        L_0x0033:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzdks"
            r2[r3] = r0
            java.lang.String r3 = "zzdkt"
            r2[r4] = r3
            r3 = 2
            java.lang.String r4 = "zzdku"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f"
            com.google.android.gms.internal.ads.wt r4 = zzdkv
            java.lang.Object r2 = m13285a(r4, r3, r2)
            return r2
        L_0x004d:
            com.google.android.gms.internal.ads.wt$a r2 = new com.google.android.gms.internal.ads.wt$a
            r2.<init>(r3)
            return r2
        L_0x0053:
            com.google.android.gms.internal.ads.wt r2 = new com.google.android.gms.internal.ads.wt
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4286wt.mo13979a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public final String mo16165a() {
        return this.zzdks;
    }

    /* renamed from: b */
    public final C4386zw mo16166b() {
        return this.zzdkt;
    }

    /* renamed from: c */
    public final C4288b mo16167c() {
        C4288b a = C4288b.m18526a(this.zzdku);
        return a == null ? C4288b.UNRECOGNIZED : a;
    }
}

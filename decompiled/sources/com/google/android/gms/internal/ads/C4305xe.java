package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe.C3636a;
import com.google.android.gms.internal.ads.abe.C3640e;

/* renamed from: com.google.android.gms.internal.ads.xe */
public final class C4305xe extends abe<C4305xe, C4306a> implements acn {
    private static volatile acx<C4305xe> zzakh;
    /* access modifiers changed from: private */
    public static final C4305xe zzdlz = new C4305xe();
    private int zzdlq;
    private int zzdlr;
    private abj<C4307b> zzdly = m13290m();

    /* renamed from: com.google.android.gms.internal.ads.xe$a */
    public static final class C4306a extends C3636a<C4305xe, C4306a> implements acn {
        private C4306a() {
            super(C4305xe.zzdlz);
        }

        /* synthetic */ C4306a(C4309xf xfVar) {
            this();
        }

        /* renamed from: a */
        public final C4306a mo16191a(int i) {
            mo13994b();
            ((C4305xe) this.f10414a).m18579b(i);
            return this;
        }

        /* renamed from: a */
        public final C4306a mo16192a(C4307b bVar) {
            mo13994b();
            ((C4305xe) this.f10414a).m18575a(bVar);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.xe$b */
    public static final class C4307b extends abe<C4307b, C4308a> implements acn {
        private static volatile acx<C4307b> zzakh;
        /* access modifiers changed from: private */
        public static final C4307b zzdma = new C4307b();
        private String zzdks = "";
        private int zzdlj;
        private int zzdlv;
        private int zzdlw;

        /* renamed from: com.google.android.gms.internal.ads.xe$b$a */
        public static final class C4308a extends C3636a<C4307b, C4308a> implements acn {
            private C4308a() {
                super(C4307b.zzdma);
            }

            /* synthetic */ C4308a(C4309xf xfVar) {
                this();
            }

            /* renamed from: a */
            public final C4308a mo16193a(int i) {
                mo13994b();
                ((C4307b) this.f10414a).m18592b(i);
                return this;
            }

            /* renamed from: a */
            public final C4308a mo16194a(C4291ww wwVar) {
                mo13994b();
                ((C4307b) this.f10414a).m18584a(wwVar);
                return this;
            }

            /* renamed from: a */
            public final C4308a mo16195a(C4323xp xpVar) {
                mo13994b();
                ((C4307b) this.f10414a).m18589a(xpVar);
                return this;
            }

            /* renamed from: a */
            public final C4308a mo16196a(String str) {
                mo13994b();
                ((C4307b) this.f10414a).m18590a(str);
                return this;
            }
        }

        static {
            abe.m13287a(C4307b.class, zzdma);
        }

        private C4307b() {
        }

        /* renamed from: a */
        public static C4308a m18583a() {
            return (C4308a) ((C3636a) zzdma.mo13979a(C3640e.f10422e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m18584a(C4291ww wwVar) {
            if (wwVar == null) {
                throw new NullPointerException();
            }
            this.zzdlv = wwVar.mo14004a();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m18589a(C4323xp xpVar) {
            if (xpVar == null) {
                throw new NullPointerException();
            }
            this.zzdlj = xpVar.mo14004a();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m18590a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.zzdks = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m18592b(int i) {
            this.zzdlw = i;
        }

        /* JADX WARNING: type inference failed for: r2v11, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xe$b>] */
        /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v13, types: [com.google.android.gms.internal.ads.abe$b, com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xe$b>] */
        /* JADX WARNING: type inference failed for: r2v16 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13, types: [com.google.android.gms.internal.ads.abe$b, com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xe$b>]
          assigns: [com.google.android.gms.internal.ads.abe$b]
          uses: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xe$b>]
          mth insns count: 43
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
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
                int[] r3 = com.google.android.gms.internal.ads.C4309xf.f14192a
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0058;
                    case 2: goto L_0x0052;
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
                com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xe$b> r2 = zzakh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.gms.internal.ads.xe$b> r3 = com.google.android.gms.internal.ads.C4305xe.C4307b.class
                monitor-enter(r3)
                com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xe$b> r2 = zzakh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.gms.internal.ads.abe$b r2 = new com.google.android.gms.internal.ads.abe$b     // Catch:{ all -> 0x002c }
                com.google.android.gms.internal.ads.xe$b r4 = zzdma     // Catch:{ all -> 0x002c }
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
                com.google.android.gms.internal.ads.xe$b r2 = zzdma
                return r2
            L_0x0033:
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzdks"
                r2[r3] = r0
                java.lang.String r3 = "zzdlv"
                r2[r4] = r3
                r3 = 2
                java.lang.String r4 = "zzdlw"
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zzdlj"
                r2[r3] = r4
                java.lang.String r3 = "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f"
                com.google.android.gms.internal.ads.xe$b r4 = zzdma
                java.lang.Object r2 = m13285a(r4, r3, r2)
                return r2
            L_0x0052:
                com.google.android.gms.internal.ads.xe$b$a r2 = new com.google.android.gms.internal.ads.xe$b$a
                r2.<init>(r3)
                return r2
            L_0x0058:
                com.google.android.gms.internal.ads.xe$b r2 = new com.google.android.gms.internal.ads.xe$b
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4305xe.C4307b.mo13979a(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    static {
        abe.m13287a(C4305xe.class, zzdlz);
    }

    private C4305xe() {
    }

    /* renamed from: a */
    public static C4306a m18574a() {
        return (C4306a) ((C3636a) zzdlz.mo13979a(C3640e.f10422e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18575a(C4307b bVar) {
        if (bVar == null) {
            throw new NullPointerException();
        }
        if (!this.zzdly.mo14006a()) {
            abj<C4307b> abj = this.zzdly;
            int size = abj.size();
            this.zzdly = abj.mo13924a(size == 0 ? 10 : size << 1);
        }
        this.zzdly.add(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m18579b(int i) {
        this.zzdlr = i;
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xe>] */
    /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v13, types: [com.google.android.gms.internal.ads.abe$b, com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xe>] */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13, types: [com.google.android.gms.internal.ads.abe$b, com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xe>]
      assigns: [com.google.android.gms.internal.ads.abe$b]
      uses: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xe>]
      mth insns count: 43
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
            int[] r3 = com.google.android.gms.internal.ads.C4309xf.f14192a
            r4 = 1
            int r2 = r2 - r4
            r2 = r3[r2]
            r3 = 0
            switch(r2) {
                case 1: goto L_0x0058;
                case 2: goto L_0x0052;
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
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xe> r2 = zzakh
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.xe> r3 = com.google.android.gms.internal.ads.C4305xe.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xe> r2 = zzakh     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.abe$b r2 = new com.google.android.gms.internal.ads.abe$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.xe r4 = zzdlz     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.ads.xe r2 = zzdlz
            return r2
        L_0x0033:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzdlq"
            r2[r3] = r0
            java.lang.String r3 = "zzdlr"
            r2[r4] = r3
            r3 = 2
            java.lang.String r4 = "zzdly"
            r2[r3] = r4
            r3 = 3
            java.lang.Class<com.google.android.gms.internal.ads.xe$b> r4 = com.google.android.gms.internal.ads.C4305xe.C4307b.class
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0001\u0000\u0001\u000b\u0002\u001b"
            com.google.android.gms.internal.ads.xe r4 = zzdlz
            java.lang.Object r2 = m13285a(r4, r3, r2)
            return r2
        L_0x0052:
            com.google.android.gms.internal.ads.xe$a r2 = new com.google.android.gms.internal.ads.xe$a
            r2.<init>(r3)
            return r2
        L_0x0058:
            com.google.android.gms.internal.ads.xe r2 = new com.google.android.gms.internal.ads.xe
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4305xe.mo13979a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}

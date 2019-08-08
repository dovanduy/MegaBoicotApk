package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe.C3636a;
import com.google.android.gms.internal.ads.abe.C3640e;

/* renamed from: com.google.android.gms.internal.ads.we */
public final class C4266we extends abe<C4266we, C4267a> implements acn {
    private static volatile acx<C4266we> zzakh;
    /* access modifiers changed from: private */
    public static final C4266we zzdjt = new C4266we();
    private int zzdih;
    private C4260wa zzdjj;
    private C4386zw zzdjr = C4386zw.f14365a;
    private C4386zw zzdjs = C4386zw.f14365a;

    /* renamed from: com.google.android.gms.internal.ads.we$a */
    public static final class C4267a extends C3636a<C4266we, C4267a> implements acn {
        private C4267a() {
            super(C4266we.zzdjt);
        }

        /* synthetic */ C4267a(C4268wf wfVar) {
            this();
        }

        /* renamed from: a */
        public final C4267a mo16148a(int i) {
            mo13994b();
            ((C4266we) this.f10414a).m18451b(0);
            return this;
        }

        /* renamed from: a */
        public final C4267a mo16149a(C4260wa waVar) {
            mo13994b();
            ((C4266we) this.f10414a).m18447a(waVar);
            return this;
        }

        /* renamed from: a */
        public final C4267a mo16150a(C4386zw zwVar) {
            mo13994b();
            ((C4266we) this.f10414a).m18453b(zwVar);
            return this;
        }

        /* renamed from: b */
        public final C4267a mo16151b(C4386zw zwVar) {
            mo13994b();
            ((C4266we) this.f10414a).m18454c(zwVar);
            return this;
        }
    }

    static {
        abe.m13287a(C4266we.class, zzdjt);
    }

    private C4266we() {
    }

    /* renamed from: a */
    public static C4266we m18446a(C4386zw zwVar) throws abk {
        return (C4266we) abe.m13281a(zzdjt, zwVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18447a(C4260wa waVar) {
        if (waVar == null) {
            throw new NullPointerException();
        }
        this.zzdjj = waVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m18451b(int i) {
        this.zzdih = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m18453b(C4386zw zwVar) {
        if (zwVar == null) {
            throw new NullPointerException();
        }
        this.zzdjr = zwVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m18454c(C4386zw zwVar) {
        if (zwVar == null) {
            throw new NullPointerException();
        }
        this.zzdjs = zwVar;
    }

    /* renamed from: e */
    public static C4267a m18455e() {
        return (C4267a) ((C3636a) zzdjt.mo13979a(C3640e.f10422e, (Object) null, (Object) null));
    }

    /* renamed from: f */
    public static C4266we m18456f() {
        return zzdjt;
    }

    /* renamed from: a */
    public final int mo16144a() {
        return this.zzdih;
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.we>] */
    /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v13, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.we>, com.google.android.gms.internal.ads.abe$b] */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.we>, com.google.android.gms.internal.ads.abe$b]
      assigns: [com.google.android.gms.internal.ads.abe$b]
      uses: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.we>]
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
            int[] r3 = com.google.android.gms.internal.ads.C4268wf.f14148a
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
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.we> r2 = zzakh
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.we> r3 = com.google.android.gms.internal.ads.C4266we.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.we> r2 = zzakh     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.abe$b r2 = new com.google.android.gms.internal.ads.abe$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.we r4 = zzdjt     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.ads.we r2 = zzdjt
            return r2
        L_0x0033:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzdih"
            r2[r3] = r0
            java.lang.String r3 = "zzdjj"
            r2[r4] = r3
            r3 = 2
            java.lang.String r4 = "zzdjr"
            r2[r3] = r4
            r3 = 3
            java.lang.String r4 = "zzdjs"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n"
            com.google.android.gms.internal.ads.we r4 = zzdjt
            java.lang.Object r2 = m13285a(r4, r3, r2)
            return r2
        L_0x0052:
            com.google.android.gms.internal.ads.we$a r2 = new com.google.android.gms.internal.ads.we$a
            r2.<init>(r3)
            return r2
        L_0x0058:
            com.google.android.gms.internal.ads.we r2 = new com.google.android.gms.internal.ads.we
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4266we.mo13979a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public final C4260wa mo16145b() {
        return this.zzdjj == null ? C4260wa.m18424d() : this.zzdjj;
    }

    /* renamed from: c */
    public final C4386zw mo16146c() {
        return this.zzdjr;
    }

    /* renamed from: d */
    public final C4386zw mo16147d() {
        return this.zzdjs;
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe.C3636a;
import com.google.android.gms.internal.ads.abe.C3640e;

/* renamed from: com.google.android.gms.internal.ads.xa */
public final class C4297xa extends abe<C4297xa, C4298a> implements acn {
    private static volatile acx<C4297xa> zzakh;
    /* access modifiers changed from: private */
    public static final C4297xa zzdlp = new C4297xa();
    private String zzdks = "";
    private String zzdll = "";
    private int zzdlm;
    private boolean zzdln;
    private String zzdlo = "";

    /* renamed from: com.google.android.gms.internal.ads.xa$a */
    public static final class C4298a extends C3636a<C4297xa, C4298a> implements acn {
        private C4298a() {
            super(C4297xa.zzdlp);
        }

        /* synthetic */ C4298a(C4299xb xbVar) {
            this();
        }

        /* renamed from: a */
        public final C4298a mo16178a(int i) {
            mo13994b();
            ((C4297xa) this.f10414a).m18543b(0);
            return this;
        }

        /* renamed from: a */
        public final C4298a mo16179a(String str) {
            mo13994b();
            ((C4297xa) this.f10414a).m18541a(str);
            return this;
        }

        /* renamed from: a */
        public final C4298a mo16180a(boolean z) {
            mo13994b();
            ((C4297xa) this.f10414a).m18542a(true);
            return this;
        }

        /* renamed from: b */
        public final C4298a mo16181b(String str) {
            mo13994b();
            ((C4297xa) this.f10414a).m18545b(str);
            return this;
        }

        /* renamed from: c */
        public final C4298a mo16182c(String str) {
            mo13994b();
            ((C4297xa) this.f10414a).m18547c(str);
            return this;
        }
    }

    static {
        abe.m13287a(C4297xa.class, zzdlp);
    }

    private C4297xa() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18541a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.zzdll = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18542a(boolean z) {
        this.zzdln = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m18543b(int i) {
        this.zzdlm = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m18545b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.zzdks = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m18547c(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.zzdlo = str;
    }

    /* renamed from: f */
    public static C4298a m18548f() {
        return (C4298a) ((C3636a) zzdlp.mo13979a(C3640e.f10422e, (Object) null, (Object) null));
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xa>] */
    /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v13, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xa>, com.google.android.gms.internal.ads.abe$b] */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xa>, com.google.android.gms.internal.ads.abe$b]
      assigns: [com.google.android.gms.internal.ads.abe$b]
      uses: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xa>]
      mth insns count: 45
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
            int[] r3 = com.google.android.gms.internal.ads.C4299xb.f14190a
            r4 = 1
            int r2 = r2 - r4
            r2 = r3[r2]
            r3 = 0
            switch(r2) {
                case 1: goto L_0x005d;
                case 2: goto L_0x0057;
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
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xa> r2 = zzakh
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.xa> r3 = com.google.android.gms.internal.ads.C4297xa.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xa> r2 = zzakh     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.abe$b r2 = new com.google.android.gms.internal.ads.abe$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.xa r4 = zzdlp     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.ads.xa r2 = zzdlp
            return r2
        L_0x0033:
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzdll"
            r2[r3] = r0
            java.lang.String r3 = "zzdks"
            r2[r4] = r3
            r3 = 2
            java.lang.String r4 = "zzdlm"
            r2[r3] = r4
            r3 = 3
            java.lang.String r4 = "zzdln"
            r2[r3] = r4
            r3 = 4
            java.lang.String r4 = "zzdlo"
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ"
            com.google.android.gms.internal.ads.xa r4 = zzdlp
            java.lang.Object r2 = m13285a(r4, r3, r2)
            return r2
        L_0x0057:
            com.google.android.gms.internal.ads.xa$a r2 = new com.google.android.gms.internal.ads.xa$a
            r2.<init>(r3)
            return r2
        L_0x005d:
            com.google.android.gms.internal.ads.xa r2 = new com.google.android.gms.internal.ads.xa
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4297xa.mo13979a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public final String mo16173a() {
        return this.zzdll;
    }

    /* renamed from: b */
    public final String mo16174b() {
        return this.zzdks;
    }

    /* renamed from: c */
    public final int mo16175c() {
        return this.zzdlm;
    }

    /* renamed from: d */
    public final boolean mo16176d() {
        return this.zzdln;
    }

    /* renamed from: e */
    public final String mo16177e() {
        return this.zzdlo;
    }
}
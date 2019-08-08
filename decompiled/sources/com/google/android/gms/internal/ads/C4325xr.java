package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe.C3636a;
import com.google.android.gms.internal.ads.abe.C3640e;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xr */
public final class C4325xr extends abe<C4325xr, C4326a> implements acn {
    private static volatile acx<C4325xr> zzakh;
    /* access modifiers changed from: private */
    public static final C4325xr zzdmt = new C4325xr();
    private int zzdlq;
    private String zzdmr = "";
    private abj<C4297xa> zzdms = m13290m();

    /* renamed from: com.google.android.gms.internal.ads.xr$a */
    public static final class C4326a extends C3636a<C4325xr, C4326a> implements acn {
        private C4326a() {
            super(C4325xr.zzdmt);
        }

        /* synthetic */ C4326a(C4327xs xsVar) {
            this();
        }

        /* renamed from: a */
        public final C4326a mo16209a(C4297xa xaVar) {
            mo13994b();
            ((C4325xr) this.f10414a).m18639a(xaVar);
            return this;
        }

        /* renamed from: a */
        public final C4326a mo16210a(String str) {
            mo13994b();
            ((C4325xr) this.f10414a).m18642a(str);
            return this;
        }
    }

    static {
        abe.m13287a(C4325xr.class, zzdmt);
    }

    private C4325xr() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18639a(C4297xa xaVar) {
        if (xaVar == null) {
            throw new NullPointerException();
        }
        if (!this.zzdms.mo14006a()) {
            abj<C4297xa> abj = this.zzdms;
            int size = abj.size();
            this.zzdms = abj.mo13924a(size == 0 ? 10 : size << 1);
        }
        this.zzdms.add(xaVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18642a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.zzdmr = str;
    }

    /* renamed from: b */
    public static C4326a m18643b() {
        return (C4326a) ((C3636a) zzdmt.mo13979a(C3640e.f10422e, (Object) null, (Object) null));
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xr>] */
    /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v13, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xr>, com.google.android.gms.internal.ads.abe$b] */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13, types: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xr>, com.google.android.gms.internal.ads.abe$b]
      assigns: [com.google.android.gms.internal.ads.abe$b]
      uses: [com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xr>]
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
            int[] r3 = com.google.android.gms.internal.ads.C4327xs.f14211a
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
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xr> r2 = zzakh
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.ads.xr> r3 = com.google.android.gms.internal.ads.C4325xr.class
            monitor-enter(r3)
            com.google.android.gms.internal.ads.acx<com.google.android.gms.internal.ads.xr> r2 = zzakh     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.abe$b r2 = new com.google.android.gms.internal.ads.abe$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.ads.xr r4 = zzdmt     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.ads.xr r2 = zzdmt
            return r2
        L_0x0033:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzdlq"
            r2[r3] = r0
            java.lang.String r3 = "zzdmr"
            r2[r4] = r3
            r3 = 2
            java.lang.String r4 = "zzdms"
            r2[r3] = r4
            r3 = 3
            java.lang.Class<com.google.android.gms.internal.ads.xa> r4 = com.google.android.gms.internal.ads.C4297xa.class
            r2[r3] = r4
            java.lang.String r3 = "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b"
            com.google.android.gms.internal.ads.xr r4 = zzdmt
            java.lang.Object r2 = m13285a(r4, r3, r2)
            return r2
        L_0x0052:
            com.google.android.gms.internal.ads.xr$a r2 = new com.google.android.gms.internal.ads.xr$a
            r2.<init>(r3)
            return r2
        L_0x0058:
            com.google.android.gms.internal.ads.xr r2 = new com.google.android.gms.internal.ads.xr
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4325xr.mo13979a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public final List<C4297xa> mo16208a() {
        return this.zzdms;
    }
}

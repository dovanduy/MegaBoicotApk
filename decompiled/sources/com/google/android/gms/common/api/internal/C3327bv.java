package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3244a.C3247c;
import com.google.android.gms.common.api.C3244a.C3255f;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.bv */
public final class C3327bv {

    /* renamed from: a */
    public static final Status f9643a = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: c */
    private static final BasePendingResult<?>[] f9644c = new BasePendingResult[0];

    /* renamed from: b */
    final Set<BasePendingResult<?>> f9645b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: d */
    private final C3330by f9646d = new C3328bw(this);

    /* renamed from: e */
    private final Map<C3247c<?>, C3255f> f9647e;

    public C3327bv(Map<C3247c<?>, C3255f> map) {
        this.f9647e = map;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13261a(BasePendingResult<? extends C3391k> basePendingResult) {
        this.f9645b.add(basePendingResult);
        basePendingResult.mo13161a(this.f9646d);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.common.api.l, com.google.android.gms.common.api.internal.bw, com.google.android.gms.common.api.internal.by, com.google.android.gms.common.api.r] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v0, types: [com.google.android.gms.common.api.l, com.google.android.gms.common.api.internal.bw, com.google.android.gms.common.api.internal.by, com.google.android.gms.common.api.r]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [com.google.android.gms.common.api.internal.by, com.google.android.gms.common.api.l, com.google.android.gms.common.api.r, com.google.android.gms.common.api.internal.bw]
      mth insns count: 47
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
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13260a() {
        /*
            r8 = this;
            java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> r0 = r8.f9645b
            com.google.android.gms.common.api.internal.BasePendingResult<?>[] r1 = f9644c
            java.lang.Object[] r0 = r0.toArray(r1)
            com.google.android.gms.common.api.internal.BasePendingResult[] r0 = (com.google.android.gms.common.api.internal.BasePendingResult[]) r0
            r1 = 0
            int r2 = r0.length
            r3 = r1
        L_0x000d:
            if (r3 >= r2) goto L_0x0088
            r4 = r0[r3]
            r5 = 0
            r4.mo13161a(r5)
            java.lang.Integer r6 = r4.mo13158c()
            if (r6 != 0) goto L_0x0027
            boolean r5 = r4.mo13165g()
            if (r5 == 0) goto L_0x0085
            java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> r5 = r8.f9645b
            r5.remove(r4)
            goto L_0x0085
        L_0x0027:
            r4.mo13156a(r5)
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.api.a$f> r6 = r8.f9647e
            r7 = r4
            com.google.android.gms.common.api.internal.c$a r7 = (com.google.android.gms.common.api.internal.C3332c.C3333a) r7
            com.google.android.gms.common.api.a$c r7 = r7.mo13270d()
            java.lang.Object r6 = r6.get(r7)
            com.google.android.gms.common.api.a$f r6 = (com.google.android.gms.common.api.C3244a.C3255f) r6
            android.os.IBinder r6 = r6.mo13103l()
            boolean r7 = r4.mo13164f()
            if (r7 == 0) goto L_0x004c
            com.google.android.gms.common.api.internal.bx r7 = new com.google.android.gms.common.api.internal.bx
            r7.<init>(r4, r5, r6, r5)
            r4.mo13161a(r7)
            goto L_0x0080
        L_0x004c:
            if (r6 == 0) goto L_0x006f
            boolean r7 = r6.isBinderAlive()
            if (r7 == 0) goto L_0x006f
            com.google.android.gms.common.api.internal.bx r7 = new com.google.android.gms.common.api.internal.bx
            r7.<init>(r4, r5, r6, r5)
            r4.mo13161a(r7)
            r6.linkToDeath(r7, r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x0080
        L_0x0060:
            r4.mo13154a()
            java.lang.Integer r6 = r4.mo13158c()
            int r6 = r6.intValue()
            r5.mo13380a(r6)
            goto L_0x0080
        L_0x006f:
            r4.mo13161a(r5)
            r4.mo13154a()
            java.lang.Integer r6 = r4.mo13158c()
            int r6 = r6.intValue()
            r5.mo13380a(r6)
        L_0x0080:
            java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> r5 = r8.f9645b
            r5.remove(r4)
        L_0x0085:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C3327bv.mo13260a():void");
    }

    /* renamed from: b */
    public final void mo13262b() {
        for (BasePendingResult c : (BasePendingResult[]) this.f9645b.toArray(f9644c)) {
            c.mo13163c(f9643a);
        }
    }
}

package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ao */
public final class C3663ao {
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, com.google.android.gms.internal.ads.kg] */
    /* JADX WARNING: type inference failed for: r7v1, types: [com.google.android.gms.internal.ads.ar] */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.aw] */
    /* JADX WARNING: type inference failed for: r7v3, types: [com.google.android.gms.internal.ads.aq] */
    /* JADX WARNING: type inference failed for: r7v4, types: [com.google.android.gms.internal.ads.at] */
    /* JADX WARNING: type inference failed for: r0v13, types: [com.google.android.gms.internal.ads.au] */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r0v14, types: [com.google.android.gms.internal.ads.aw] */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r0v15, types: [com.google.android.gms.internal.ads.au] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v6
      assigns: [com.google.android.gms.internal.ads.aw, com.google.android.gms.internal.ads.au]
      uses: [java.lang.Object, com.google.android.gms.internal.ads.kg, com.google.android.gms.internal.ads.aw, com.google.android.gms.internal.ads.au]
      mth insns count: 60
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
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.C3929kg m14575a(android.content.Context r8, com.google.android.gms.ads.internal.C3002a r9, com.google.android.gms.internal.ads.C3879ik r10, com.google.android.gms.internal.ads.agw r11, com.google.android.gms.internal.ads.C4089qe r12, com.google.android.gms.internal.ads.bca r13, com.google.android.gms.internal.ads.C3665ap r14, com.google.android.gms.internal.ads.ash r15) {
        /*
            com.google.android.gms.internal.ads.zzaej r2 = r10.f13292b
            boolean r4 = r2.f14458g
            if (r4 == 0) goto L_0x0013
            com.google.android.gms.internal.ads.au r7 = new com.google.android.gms.internal.ads.au
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x006e
        L_0x0013:
            boolean r4 = r2.f14470s
            if (r4 != 0) goto L_0x0052
            boolean r4 = r9 instanceof com.google.android.gms.ads.internal.C3006ad
            if (r4 == 0) goto L_0x001c
            goto L_0x0052
        L_0x001c:
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.aru.f11809ah
            com.google.android.gms.internal.ads.ars r2 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r0 = r2.mo14695a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004c
            boolean r0 = com.google.android.gms.common.util.C3563o.m12768g()
            if (r0 == 0) goto L_0x004c
            boolean r0 = com.google.android.gms.common.util.C3563o.m12770i()
            if (r0 != 0) goto L_0x004c
            if (r12 == 0) goto L_0x004c
            com.google.android.gms.internal.ads.rs r0 = r12.mo15917t()
            boolean r0 = r0.mo15997d()
            if (r0 == 0) goto L_0x004c
            com.google.android.gms.internal.ads.at r7 = new com.google.android.gms.internal.ads.at
            r7.<init>(r8, r10, r12, r14)
            goto L_0x006e
        L_0x004c:
            com.google.android.gms.internal.ads.aq r7 = new com.google.android.gms.internal.ads.aq
            r7.<init>(r8, r10, r12, r14)
            goto L_0x006e
        L_0x0052:
            boolean r2 = r2.f14470s
            if (r2 == 0) goto L_0x0069
            boolean r2 = r9 instanceof com.google.android.gms.ads.internal.C3006ad
            if (r2 == 0) goto L_0x0069
            com.google.android.gms.internal.ads.aw r7 = new com.google.android.gms.internal.ads.aw
            r2 = r9
            com.google.android.gms.ads.internal.ad r2 = (com.google.android.gms.ads.internal.C3006ad) r2
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x006e
        L_0x0069:
            com.google.android.gms.internal.ads.ar r7 = new com.google.android.gms.internal.ads.ar
            r7.<init>(r10, r14)
        L_0x006e:
            java.lang.String r0 = "AdRenderer: "
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x0087
            java.lang.String r0 = r0.concat(r1)
            goto L_0x008d
        L_0x0087:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x008d:
            com.google.android.gms.internal.ads.C3900je.m17429b(r0)
            r7.mo14344c()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3663ao.m14575a(android.content.Context, com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.ik, com.google.android.gms.internal.ads.agw, com.google.android.gms.internal.ads.qe, com.google.android.gms.internal.ads.bca, com.google.android.gms.internal.ads.ap, com.google.android.gms.internal.ads.ash):com.google.android.gms.internal.ads.kg");
    }
}

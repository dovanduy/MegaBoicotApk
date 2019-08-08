package com.google.android.gms.internal.ads;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.br */
public final class C3696br implements C3686bh<asz> {

    /* renamed from: a */
    private final boolean f12757a;

    /* renamed from: b */
    private final boolean f12758b;

    /* renamed from: c */
    private final boolean f12759c;

    public C3696br(boolean z, boolean z2, boolean z3) {
        this.f12757a = z;
        this.f12758b = z2;
        this.f12759c = z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00eb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.atn mo15198a(com.google.android.gms.internal.ads.C3676ay r22, org.json.JSONObject r23) throws org.json.JSONException, java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        /*
            r21 = this;
            r0 = r21
            r7 = r22
            r8 = r23
            java.lang.String r3 = "images"
            boolean r5 = r0.f12757a
            boolean r6 = r0.f12758b
            r4 = 0
            r1 = r7
            r2 = r8
            java.util.List r1 = r1.mo14948a(r2, r3, r4, r5, r6)
            java.lang.String r2 = "app_icon"
            boolean r3 = r0.f12757a
            r4 = 1
            com.google.android.gms.internal.ads.ne r2 = r7.mo14947a(r8, r2, r4, r3)
            java.lang.String r3 = "video"
            com.google.android.gms.internal.ads.ne r3 = r7.mo14946a(r8, r3)
            com.google.android.gms.internal.ads.ne r4 = r22.mo14945a(r23)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x002f:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r1.next()
            com.google.android.gms.internal.ads.ne r5 = (com.google.android.gms.internal.ads.C4008ne) r5
            java.lang.Object r5 = r5.get()
            com.google.android.gms.internal.ads.asy r5 = (com.google.android.gms.internal.ads.asy) r5
            r7.add(r5)
            goto L_0x002f
        L_0x0045:
            com.google.android.gms.internal.ads.qe r1 = com.google.android.gms.internal.ads.C3676ay.m15676a(r3)
            com.google.android.gms.internal.ads.asz r3 = new com.google.android.gms.internal.ads.asz
            java.lang.String r5 = "headline"
            java.lang.String r5 = r8.getString(r5)
            boolean r6 = r0.f12759c
            if (r6 == 0) goto L_0x00a3
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.aru.f11973dm
            com.google.android.gms.internal.ads.ars r9 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r6 = r9.mo14695a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00a3
            com.google.android.gms.internal.ads.io r6 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            android.content.res.Resources r6 = r6.mo15445h()
            if (r6 == 0) goto L_0x0078
            int r9 = com.google.android.gms.ads.p136b.C2969a.C2970a.f8688s7
            java.lang.String r6 = r6.getString(r9)
            goto L_0x007a
        L_0x0078:
            java.lang.String r6 = "Test Ad"
        L_0x007a:
            if (r5 == 0) goto L_0x00a4
            r9 = 3
            java.lang.String r10 = java.lang.String.valueOf(r6)
            int r10 = r10.length()
            int r9 = r9 + r10
            java.lang.String r10 = java.lang.String.valueOf(r5)
            int r10 = r10.length()
            int r9 = r9 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            r10.append(r6)
            java.lang.String r6 = " : "
            r10.append(r6)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
        L_0x00a3:
            r6 = r5
        L_0x00a4:
            java.lang.String r5 = "body"
            java.lang.String r9 = r8.getString(r5)
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.auh r2 = (com.google.android.gms.internal.ads.auh) r2
            java.lang.String r5 = "call_to_action"
            java.lang.String r10 = r8.getString(r5)
            java.lang.String r5 = "rating"
            r11 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r11 = r8.optDouble(r5, r11)
            java.lang.String r5 = "store"
            java.lang.String r13 = r8.optString(r5)
            java.lang.String r5 = "price"
            java.lang.String r14 = r8.optString(r5)
            java.lang.Object r4 = r4.get()
            r15 = r4
            com.google.android.gms.internal.ads.asu r15 = (com.google.android.gms.internal.ads.asu) r15
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r5 = 0
            if (r1 == 0) goto L_0x00e0
            com.google.android.gms.internal.ads.qu r8 = r1.mo15799b()
            r17 = r8
            goto L_0x00e2
        L_0x00e0:
            r17 = r5
        L_0x00e2:
            if (r1 == 0) goto L_0x00eb
            android.view.View r1 = r1.getView()
            r18 = r1
            goto L_0x00ed
        L_0x00eb:
            r18 = r5
        L_0x00ed:
            r19 = 0
            r20 = 0
            r5 = r3
            r8 = r9
            r9 = r2
            r16 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3696br.mo15198a(com.google.android.gms.internal.ads.ay, org.json.JSONObject):com.google.android.gms.internal.ads.atn");
    }
}

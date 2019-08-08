package com.google.android.gms.internal.ads;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.bs */
public final class C3697bs implements C3686bh<atb> {

    /* renamed from: a */
    private final boolean f12760a;

    /* renamed from: b */
    private final boolean f12761b;

    /* renamed from: c */
    private final boolean f12762c;

    public C3697bs(boolean z, boolean z2, boolean z3) {
        this.f12760a = z;
        this.f12761b = z2;
        this.f12762c = z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.atn mo15198a(com.google.android.gms.internal.ads.C3676ay r19, org.json.JSONObject r20) throws org.json.JSONException, java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        /*
            r18 = this;
            r0 = r18
            r7 = r19
            r8 = r20
            java.lang.String r3 = "images"
            boolean r5 = r0.f12760a
            boolean r6 = r0.f12761b
            r4 = 0
            r1 = r7
            r2 = r8
            java.util.List r1 = r1.mo14948a(r2, r3, r4, r5, r6)
            java.lang.String r2 = "secondary_image"
            boolean r3 = r0.f12760a
            com.google.android.gms.internal.ads.ne r2 = r7.mo14947a(r8, r2, r4, r3)
            com.google.android.gms.internal.ads.ne r3 = r19.mo14945a(r20)
            java.lang.String r4 = "video"
            com.google.android.gms.internal.ads.ne r4 = r7.mo14946a(r8, r4)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x002e:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r5 = r1.next()
            com.google.android.gms.internal.ads.ne r5 = (com.google.android.gms.internal.ads.C4008ne) r5
            java.lang.Object r5 = r5.get()
            com.google.android.gms.internal.ads.asy r5 = (com.google.android.gms.internal.ads.asy) r5
            r7.add(r5)
            goto L_0x002e
        L_0x0044:
            com.google.android.gms.internal.ads.qe r1 = com.google.android.gms.internal.ads.C3676ay.m15676a(r4)
            com.google.android.gms.internal.ads.atb r4 = new com.google.android.gms.internal.ads.atb
            java.lang.String r5 = "headline"
            java.lang.String r5 = r8.getString(r5)
            boolean r6 = r0.f12762c
            if (r6 == 0) goto L_0x00a2
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.aru.f11973dm
            com.google.android.gms.internal.ads.ars r9 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r6 = r9.mo14695a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00a2
            com.google.android.gms.internal.ads.io r6 = com.google.android.gms.ads.internal.C3025aw.m10921i()
            android.content.res.Resources r6 = r6.mo15445h()
            if (r6 == 0) goto L_0x0077
            int r9 = com.google.android.gms.ads.p136b.C2969a.C2970a.f8688s7
            java.lang.String r6 = r6.getString(r9)
            goto L_0x0079
        L_0x0077:
            java.lang.String r6 = "Test Ad"
        L_0x0079:
            if (r5 == 0) goto L_0x00a3
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
        L_0x00a2:
            r6 = r5
        L_0x00a3:
            java.lang.String r5 = "body"
            java.lang.String r9 = r8.getString(r5)
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.auh r2 = (com.google.android.gms.internal.ads.auh) r2
            java.lang.String r5 = "call_to_action"
            java.lang.String r10 = r8.getString(r5)
            java.lang.String r5 = "advertiser"
            java.lang.String r11 = r8.getString(r5)
            java.lang.Object r3 = r3.get()
            r12 = r3
            com.google.android.gms.internal.ads.asu r12 = (com.google.android.gms.internal.ads.asu) r12
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            r3 = 0
            if (r1 == 0) goto L_0x00d0
            com.google.android.gms.internal.ads.qu r5 = r1.mo15799b()
            r14 = r5
            goto L_0x00d1
        L_0x00d0:
            r14 = r3
        L_0x00d1:
            if (r1 == 0) goto L_0x00d9
            android.view.View r1 = r1.getView()
            r15 = r1
            goto L_0x00da
        L_0x00d9:
            r15 = r3
        L_0x00da:
            r16 = 0
            r17 = 0
            r5 = r4
            r8 = r9
            r9 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3697bs.mo15198a(com.google.android.gms.internal.ads.ay, org.json.JSONObject):com.google.android.gms.internal.ads.atn");
    }
}

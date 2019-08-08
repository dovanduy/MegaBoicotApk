package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class amt extends aew<amt> {

    /* renamed from: a */
    public Integer f11443a;

    /* renamed from: b */
    public amw f11444b;

    /* renamed from: c */
    private Integer f11445c;

    /* renamed from: d */
    private amv f11446d;

    /* renamed from: e */
    private amu[] f11447e;

    /* renamed from: f */
    private amx f11448f;

    /* renamed from: g */
    private ang f11449g;

    /* renamed from: h */
    private anf f11450h;

    /* renamed from: i */
    private anc f11451i;

    /* renamed from: j */
    private and f11452j;

    /* renamed from: k */
    private anm[] f11453k;

    public amt() {
        this.f11443a = null;
        this.f11445c = null;
        this.f11446d = null;
        this.f11444b = null;
        this.f11447e = amu.m14458b();
        this.f11448f = null;
        this.f11449g = null;
        this.f11450h = null;
        this.f11451i = null;
        this.f11452j = null;
        this.f11453k = anm.m14528b();
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.amt mo13937a(com.google.android.gms.internal.ads.aes r7) throws java.io.IOException {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.mo14217a()
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0142;
                case 56: goto L_0x010b;
                case 64: goto L_0x00f7;
                case 74: goto L_0x00e5;
                case 82: goto L_0x00d7;
                case 90: goto L_0x0097;
                case 98: goto L_0x0089;
                case 106: goto L_0x007b;
                case 114: goto L_0x006c;
                case 122: goto L_0x005d;
                case 130: goto L_0x004e;
                case 138: goto L_0x000f;
                default: goto L_0x0008;
            }
        L_0x0008:
            boolean r0 = super.mo14246a(r7, r0)
            if (r0 != 0) goto L_0x0000
            return r6
        L_0x000f:
            r0 = 138(0x8a, float:1.93E-43)
            int r0 = com.google.android.gms.internal.ads.aff.m13985a(r7, r0)
            com.google.android.gms.internal.ads.anm[] r2 = r6.f11453k
            if (r2 != 0) goto L_0x001b
            r2 = r1
            goto L_0x001e
        L_0x001b:
            com.google.android.gms.internal.ads.anm[] r2 = r6.f11453k
            int r2 = r2.length
        L_0x001e:
            int r0 = r0 + r2
            com.google.android.gms.internal.ads.anm[] r0 = new com.google.android.gms.internal.ads.anm[r0]
            if (r2 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.anm[] r3 = r6.f11453k
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x0028:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x003f
            com.google.android.gms.internal.ads.anm r1 = new com.google.android.gms.internal.ads.anm
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo14219a(r1)
            r7.mo14217a()
            int r2 = r2 + 1
            goto L_0x0028
        L_0x003f:
            com.google.android.gms.internal.ads.anm r1 = new com.google.android.gms.internal.ads.anm
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo14219a(r1)
            r6.f11453k = r0
            goto L_0x0000
        L_0x004e:
            com.google.android.gms.internal.ads.and r0 = r6.f11452j
            if (r0 != 0) goto L_0x0059
            com.google.android.gms.internal.ads.and r0 = new com.google.android.gms.internal.ads.and
            r0.<init>()
            r6.f11452j = r0
        L_0x0059:
            com.google.android.gms.internal.ads.and r0 = r6.f11452j
            goto L_0x00f2
        L_0x005d:
            com.google.android.gms.internal.ads.anc r0 = r6.f11451i
            if (r0 != 0) goto L_0x0068
            com.google.android.gms.internal.ads.anc r0 = new com.google.android.gms.internal.ads.anc
            r0.<init>()
            r6.f11451i = r0
        L_0x0068:
            com.google.android.gms.internal.ads.anc r0 = r6.f11451i
            goto L_0x00f2
        L_0x006c:
            com.google.android.gms.internal.ads.anf r0 = r6.f11450h
            if (r0 != 0) goto L_0x0077
            com.google.android.gms.internal.ads.anf r0 = new com.google.android.gms.internal.ads.anf
            r0.<init>()
            r6.f11450h = r0
        L_0x0077:
            com.google.android.gms.internal.ads.anf r0 = r6.f11450h
            goto L_0x00f2
        L_0x007b:
            com.google.android.gms.internal.ads.ang r0 = r6.f11449g
            if (r0 != 0) goto L_0x0086
            com.google.android.gms.internal.ads.ang r0 = new com.google.android.gms.internal.ads.ang
            r0.<init>()
            r6.f11449g = r0
        L_0x0086:
            com.google.android.gms.internal.ads.ang r0 = r6.f11449g
            goto L_0x00f2
        L_0x0089:
            com.google.android.gms.internal.ads.amx r0 = r6.f11448f
            if (r0 != 0) goto L_0x0094
            com.google.android.gms.internal.ads.amx r0 = new com.google.android.gms.internal.ads.amx
            r0.<init>()
            r6.f11448f = r0
        L_0x0094:
            com.google.android.gms.internal.ads.amx r0 = r6.f11448f
            goto L_0x00f2
        L_0x0097:
            r0 = 90
            int r0 = com.google.android.gms.internal.ads.aff.m13985a(r7, r0)
            com.google.android.gms.internal.ads.amu[] r2 = r6.f11447e
            if (r2 != 0) goto L_0x00a3
            r2 = r1
            goto L_0x00a6
        L_0x00a3:
            com.google.android.gms.internal.ads.amu[] r2 = r6.f11447e
            int r2 = r2.length
        L_0x00a6:
            int r0 = r0 + r2
            com.google.android.gms.internal.ads.amu[] r0 = new com.google.android.gms.internal.ads.amu[r0]
            if (r2 == 0) goto L_0x00b0
            com.google.android.gms.internal.ads.amu[] r3 = r6.f11447e
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x00b0:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x00c7
            com.google.android.gms.internal.ads.amu r1 = new com.google.android.gms.internal.ads.amu
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo14219a(r1)
            r7.mo14217a()
            int r2 = r2 + 1
            goto L_0x00b0
        L_0x00c7:
            com.google.android.gms.internal.ads.amu r1 = new com.google.android.gms.internal.ads.amu
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo14219a(r1)
            r6.f11447e = r0
            goto L_0x0000
        L_0x00d7:
            com.google.android.gms.internal.ads.amw r0 = r6.f11444b
            if (r0 != 0) goto L_0x00e2
            com.google.android.gms.internal.ads.amw r0 = new com.google.android.gms.internal.ads.amw
            r0.<init>()
            r6.f11444b = r0
        L_0x00e2:
            com.google.android.gms.internal.ads.amw r0 = r6.f11444b
            goto L_0x00f2
        L_0x00e5:
            com.google.android.gms.internal.ads.amv r0 = r6.f11446d
            if (r0 != 0) goto L_0x00f0
            com.google.android.gms.internal.ads.amv r0 = new com.google.android.gms.internal.ads.amv
            r0.<init>()
            r6.f11446d = r0
        L_0x00f0:
            com.google.android.gms.internal.ads.amv r0 = r6.f11446d
        L_0x00f2:
            r7.mo14219a(r0)
            goto L_0x0000
        L_0x00f7:
            int r1 = r7.mo14234j()
            int r2 = r7.mo14231g()     // Catch:{ IllegalArgumentException -> 0x013a }
            int r2 = com.google.android.gms.internal.ads.ams.m14452a(r2)     // Catch:{ IllegalArgumentException -> 0x013a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x013a }
            r6.f11445c = r2     // Catch:{ IllegalArgumentException -> 0x013a }
            goto L_0x0000
        L_0x010b:
            int r1 = r7.mo14234j()
            int r2 = r7.mo14231g()     // Catch:{ IllegalArgumentException -> 0x013a }
            if (r2 < 0) goto L_0x0121
            r3 = 9
            if (r2 > r3) goto L_0x0121
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x013a }
            r6.f11443a = r2     // Catch:{ IllegalArgumentException -> 0x013a }
            goto L_0x0000
        L_0x0121:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x013a }
            r4 = 43
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x013a }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x013a }
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x013a }
            java.lang.String r2 = " is not a valid enum AdInitiater"
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x013a }
            java.lang.String r2 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x013a }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x013a }
            throw r3     // Catch:{ IllegalArgumentException -> 0x013a }
        L_0x013a:
            r7.mo14229e(r1)
            r6.mo14246a(r7, r0)
            goto L_0x0000
        L_0x0142:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.amt.mo13937a(com.google.android.gms.internal.ads.aes):com.google.android.gms.internal.ads.amt");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f11443a != null) {
            a += aeu.m13934b(7, this.f11443a.intValue());
        }
        if (this.f11445c != null) {
            a += aeu.m13934b(8, this.f11445c.intValue());
        }
        if (this.f11446d != null) {
            a += aeu.m13935b(9, (afc) this.f11446d);
        }
        if (this.f11444b != null) {
            a += aeu.m13935b(10, (afc) this.f11444b);
        }
        if (this.f11447e != null && this.f11447e.length > 0) {
            int i = a;
            for (amu amu : this.f11447e) {
                if (amu != null) {
                    i += aeu.m13935b(11, (afc) amu);
                }
            }
            a = i;
        }
        if (this.f11448f != null) {
            a += aeu.m13935b(12, (afc) this.f11448f);
        }
        if (this.f11449g != null) {
            a += aeu.m13935b(13, (afc) this.f11449g);
        }
        if (this.f11450h != null) {
            a += aeu.m13935b(14, (afc) this.f11450h);
        }
        if (this.f11451i != null) {
            a += aeu.m13935b(15, (afc) this.f11451i);
        }
        if (this.f11452j != null) {
            a += aeu.m13935b(16, (afc) this.f11452j);
        }
        if (this.f11453k != null && this.f11453k.length > 0) {
            for (anm anm : this.f11453k) {
                if (anm != null) {
                    a += aeu.m13935b(17, (afc) anm);
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f11443a != null) {
            aeu.mo14236a(7, this.f11443a.intValue());
        }
        if (this.f11445c != null) {
            aeu.mo14236a(8, this.f11445c.intValue());
        }
        if (this.f11446d != null) {
            aeu.mo14238a(9, (afc) this.f11446d);
        }
        if (this.f11444b != null) {
            aeu.mo14238a(10, (afc) this.f11444b);
        }
        if (this.f11447e != null && this.f11447e.length > 0) {
            for (amu amu : this.f11447e) {
                if (amu != null) {
                    aeu.mo14238a(11, (afc) amu);
                }
            }
        }
        if (this.f11448f != null) {
            aeu.mo14238a(12, (afc) this.f11448f);
        }
        if (this.f11449g != null) {
            aeu.mo14238a(13, (afc) this.f11449g);
        }
        if (this.f11450h != null) {
            aeu.mo14238a(14, (afc) this.f11450h);
        }
        if (this.f11451i != null) {
            aeu.mo14238a(15, (afc) this.f11451i);
        }
        if (this.f11452j != null) {
            aeu.mo14238a(16, (afc) this.f11452j);
        }
        if (this.f11453k != null && this.f11453k.length > 0) {
            for (anm anm : this.f11453k) {
                if (anm != null) {
                    aeu.mo14238a(17, (afc) anm);
                }
            }
        }
        super.mo13938a(aeu);
    }
}

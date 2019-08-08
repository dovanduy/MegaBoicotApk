package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class afg extends aew<afg> {

    /* renamed from: a */
    public Integer f10704a;

    /* renamed from: b */
    public String f10705b;

    /* renamed from: c */
    public String f10706c;

    /* renamed from: d */
    public afh f10707d;

    /* renamed from: e */
    public afo[] f10708e;

    /* renamed from: f */
    public String f10709f;

    /* renamed from: g */
    public afn f10710g;

    /* renamed from: h */
    public afp f10711h;

    /* renamed from: i */
    public String[] f10712i;

    /* renamed from: j */
    public String[] f10713j;

    /* renamed from: k */
    private Integer f10714k;

    /* renamed from: l */
    private String f10715l;

    /* renamed from: m */
    private Boolean f10716m;

    /* renamed from: n */
    private String[] f10717n;

    /* renamed from: o */
    private String f10718o;

    /* renamed from: p */
    private Boolean f10719p;

    /* renamed from: q */
    private Boolean f10720q;

    /* renamed from: r */
    private byte[] f10721r;

    public afg() {
        this.f10704a = null;
        this.f10714k = null;
        this.f10705b = null;
        this.f10706c = null;
        this.f10715l = null;
        this.f10707d = null;
        this.f10708e = afo.m14014b();
        this.f10709f = null;
        this.f10710g = null;
        this.f10716m = null;
        this.f10717n = aff.f10694c;
        this.f10718o = null;
        this.f10719p = null;
        this.f10720q = null;
        this.f10721r = null;
        this.f10711h = null;
        this.f10712i = aff.f10694c;
        this.f10713j = aff.f10694c;
        this.f10676Y = null;
        this.f10689Z = -1;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e0, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.afg mo13937a(com.google.android.gms.internal.ads.aes r7) throws java.io.IOException {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.mo14217a()
            r1 = 0
            switch(r0) {
                case 0: goto L_0x01d0;
                case 10: goto L_0x01c8;
                case 18: goto L_0x01c0;
                case 26: goto L_0x01b8;
                case 34: goto L_0x0178;
                case 40: goto L_0x016c;
                case 50: goto L_0x0138;
                case 58: goto L_0x0130;
                case 64: goto L_0x0124;
                case 72: goto L_0x0118;
                case 80: goto L_0x00e1;
                case 88: goto L_0x00b3;
                case 98: goto L_0x00a1;
                case 106: goto L_0x0099;
                case 114: goto L_0x008b;
                case 122: goto L_0x0083;
                case 138: goto L_0x0075;
                case 162: goto L_0x0042;
                case 170: goto L_0x000f;
                default: goto L_0x0008;
            }
        L_0x0008:
            boolean r0 = super.mo14246a(r7, r0)
            if (r0 != 0) goto L_0x0000
            return r6
        L_0x000f:
            r0 = 170(0xaa, float:2.38E-43)
            int r0 = com.google.android.gms.internal.ads.aff.m13985a(r7, r0)
            java.lang.String[] r2 = r6.f10713j
            if (r2 != 0) goto L_0x001b
            r2 = r1
            goto L_0x001e
        L_0x001b:
            java.lang.String[] r2 = r6.f10713j
            int r2 = r2.length
        L_0x001e:
            int r0 = r0 + r2
            java.lang.String[] r0 = new java.lang.String[r0]
            if (r2 == 0) goto L_0x0028
            java.lang.String[] r3 = r6.f10713j
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x0028:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x0039
            java.lang.String r1 = r7.mo14228e()
            r0[r2] = r1
            r7.mo14217a()
            int r2 = r2 + 1
            goto L_0x0028
        L_0x0039:
            java.lang.String r1 = r7.mo14228e()
            r0[r2] = r1
            r6.f10713j = r0
            goto L_0x0000
        L_0x0042:
            r0 = 162(0xa2, float:2.27E-43)
            int r0 = com.google.android.gms.internal.ads.aff.m13985a(r7, r0)
            java.lang.String[] r2 = r6.f10712i
            if (r2 != 0) goto L_0x004e
            r2 = r1
            goto L_0x0051
        L_0x004e:
            java.lang.String[] r2 = r6.f10712i
            int r2 = r2.length
        L_0x0051:
            int r0 = r0 + r2
            java.lang.String[] r0 = new java.lang.String[r0]
            if (r2 == 0) goto L_0x005b
            java.lang.String[] r3 = r6.f10712i
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x005b:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x006c
            java.lang.String r1 = r7.mo14228e()
            r0[r2] = r1
            r7.mo14217a()
            int r2 = r2 + 1
            goto L_0x005b
        L_0x006c:
            java.lang.String r1 = r7.mo14228e()
            r0[r2] = r1
            r6.f10712i = r0
            goto L_0x0000
        L_0x0075:
            com.google.android.gms.internal.ads.afp r0 = r6.f10711h
            if (r0 != 0) goto L_0x0080
            com.google.android.gms.internal.ads.afp r0 = new com.google.android.gms.internal.ads.afp
            r0.<init>()
            r6.f10711h = r0
        L_0x0080:
            com.google.android.gms.internal.ads.afp r0 = r6.f10711h
            goto L_0x00ae
        L_0x0083:
            byte[] r0 = r7.mo14230f()
            r6.f10721r = r0
            goto L_0x0000
        L_0x008b:
            com.google.android.gms.internal.ads.afn r0 = r6.f10710g
            if (r0 != 0) goto L_0x0096
            com.google.android.gms.internal.ads.afn r0 = new com.google.android.gms.internal.ads.afn
            r0.<init>()
            r6.f10710g = r0
        L_0x0096:
            com.google.android.gms.internal.ads.afn r0 = r6.f10710g
            goto L_0x00ae
        L_0x0099:
            java.lang.String r0 = r7.mo14228e()
            r6.f10709f = r0
            goto L_0x0000
        L_0x00a1:
            com.google.android.gms.internal.ads.afh r0 = r6.f10707d
            if (r0 != 0) goto L_0x00ac
            com.google.android.gms.internal.ads.afh r0 = new com.google.android.gms.internal.ads.afh
            r0.<init>()
            r6.f10707d = r0
        L_0x00ac:
            com.google.android.gms.internal.ads.afh r0 = r6.f10707d
        L_0x00ae:
            r7.mo14219a(r0)
            goto L_0x0000
        L_0x00b3:
            int r1 = r7.mo14234j()
            int r2 = r7.mo14224c()     // Catch:{ IllegalArgumentException -> 0x0110 }
            if (r2 < 0) goto L_0x00c8
            r3 = 4
            if (r2 > r3) goto L_0x00c8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0110 }
            r6.f10714k = r2     // Catch:{ IllegalArgumentException -> 0x0110 }
            goto L_0x0000
        L_0x00c8:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0110 }
            r4 = 39
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0110 }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0110 }
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x0110 }
            java.lang.String r2 = " is not a valid enum Verdict"
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x0110 }
            java.lang.String r2 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x0110 }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0110 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0110 }
        L_0x00e1:
            int r1 = r7.mo14234j()
            int r2 = r7.mo14224c()     // Catch:{ IllegalArgumentException -> 0x0110 }
            if (r2 < 0) goto L_0x00f7
            r3 = 9
            if (r2 > r3) goto L_0x00f7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0110 }
            r6.f10704a = r2     // Catch:{ IllegalArgumentException -> 0x0110 }
            goto L_0x0000
        L_0x00f7:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0110 }
            r4 = 42
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0110 }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0110 }
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x0110 }
            java.lang.String r2 = " is not a valid enum ReportType"
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x0110 }
            java.lang.String r2 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x0110 }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0110 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0110 }
        L_0x0110:
            r7.mo14229e(r1)
            r6.mo14246a(r7, r0)
            goto L_0x0000
        L_0x0118:
            boolean r0 = r7.mo14227d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f10720q = r0
            goto L_0x0000
        L_0x0124:
            boolean r0 = r7.mo14227d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f10719p = r0
            goto L_0x0000
        L_0x0130:
            java.lang.String r0 = r7.mo14228e()
            r6.f10718o = r0
            goto L_0x0000
        L_0x0138:
            r0 = 50
            int r0 = com.google.android.gms.internal.ads.aff.m13985a(r7, r0)
            java.lang.String[] r2 = r6.f10717n
            if (r2 != 0) goto L_0x0144
            r2 = r1
            goto L_0x0147
        L_0x0144:
            java.lang.String[] r2 = r6.f10717n
            int r2 = r2.length
        L_0x0147:
            int r0 = r0 + r2
            java.lang.String[] r0 = new java.lang.String[r0]
            if (r2 == 0) goto L_0x0151
            java.lang.String[] r3 = r6.f10717n
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x0151:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x0162
            java.lang.String r1 = r7.mo14228e()
            r0[r2] = r1
            r7.mo14217a()
            int r2 = r2 + 1
            goto L_0x0151
        L_0x0162:
            java.lang.String r1 = r7.mo14228e()
            r0[r2] = r1
            r6.f10717n = r0
            goto L_0x0000
        L_0x016c:
            boolean r0 = r7.mo14227d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f10716m = r0
            goto L_0x0000
        L_0x0178:
            r0 = 34
            int r0 = com.google.android.gms.internal.ads.aff.m13985a(r7, r0)
            com.google.android.gms.internal.ads.afo[] r2 = r6.f10708e
            if (r2 != 0) goto L_0x0184
            r2 = r1
            goto L_0x0187
        L_0x0184:
            com.google.android.gms.internal.ads.afo[] r2 = r6.f10708e
            int r2 = r2.length
        L_0x0187:
            int r0 = r0 + r2
            com.google.android.gms.internal.ads.afo[] r0 = new com.google.android.gms.internal.ads.afo[r0]
            if (r2 == 0) goto L_0x0191
            com.google.android.gms.internal.ads.afo[] r3 = r6.f10708e
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x0191:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x01a8
            com.google.android.gms.internal.ads.afo r1 = new com.google.android.gms.internal.ads.afo
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo14219a(r1)
            r7.mo14217a()
            int r2 = r2 + 1
            goto L_0x0191
        L_0x01a8:
            com.google.android.gms.internal.ads.afo r1 = new com.google.android.gms.internal.ads.afo
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo14219a(r1)
            r6.f10708e = r0
            goto L_0x0000
        L_0x01b8:
            java.lang.String r0 = r7.mo14228e()
            r6.f10715l = r0
            goto L_0x0000
        L_0x01c0:
            java.lang.String r0 = r7.mo14228e()
            r6.f10706c = r0
            goto L_0x0000
        L_0x01c8:
            java.lang.String r0 = r7.mo14228e()
            r6.f10705b = r0
            goto L_0x0000
        L_0x01d0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.afg.mo13937a(com.google.android.gms.internal.ads.aes):com.google.android.gms.internal.ads.afg");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13936a() {
        int a = super.mo13936a();
        if (this.f10705b != null) {
            a += aeu.m13936b(1, this.f10705b);
        }
        if (this.f10706c != null) {
            a += aeu.m13936b(2, this.f10706c);
        }
        if (this.f10715l != null) {
            a += aeu.m13936b(3, this.f10715l);
        }
        if (this.f10708e != null && this.f10708e.length > 0) {
            int i = a;
            for (afo afo : this.f10708e) {
                if (afo != null) {
                    i += aeu.m13935b(4, (afc) afo);
                }
            }
            a = i;
        }
        if (this.f10716m != null) {
            this.f10716m.booleanValue();
            a += aeu.m13933b(5) + 1;
        }
        if (this.f10717n != null && this.f10717n.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f10717n) {
                if (str != null) {
                    i3++;
                    i2 += aeu.m13929a(str);
                }
            }
            a = a + i2 + (i3 * 1);
        }
        if (this.f10718o != null) {
            a += aeu.m13936b(7, this.f10718o);
        }
        if (this.f10719p != null) {
            this.f10719p.booleanValue();
            a += aeu.m13933b(8) + 1;
        }
        if (this.f10720q != null) {
            this.f10720q.booleanValue();
            a += aeu.m13933b(9) + 1;
        }
        if (this.f10704a != null) {
            a += aeu.m13934b(10, this.f10704a.intValue());
        }
        if (this.f10714k != null) {
            a += aeu.m13934b(11, this.f10714k.intValue());
        }
        if (this.f10707d != null) {
            a += aeu.m13935b(12, (afc) this.f10707d);
        }
        if (this.f10709f != null) {
            a += aeu.m13936b(13, this.f10709f);
        }
        if (this.f10710g != null) {
            a += aeu.m13935b(14, (afc) this.f10710g);
        }
        if (this.f10721r != null) {
            a += aeu.m13937b(15, this.f10721r);
        }
        if (this.f10711h != null) {
            a += aeu.m13935b(17, (afc) this.f10711h);
        }
        if (this.f10712i != null && this.f10712i.length > 0) {
            int i4 = 0;
            int i5 = 0;
            for (String str2 : this.f10712i) {
                if (str2 != null) {
                    i5++;
                    i4 += aeu.m13929a(str2);
                }
            }
            a = a + i4 + (i5 * 2);
        }
        if (this.f10713j == null || this.f10713j.length <= 0) {
            return a;
        }
        int i6 = 0;
        int i7 = 0;
        for (String str3 : this.f10713j) {
            if (str3 != null) {
                i7++;
                i6 += aeu.m13929a(str3);
            }
        }
        return a + i6 + (2 * i7);
    }

    /* renamed from: a */
    public final void mo13938a(aeu aeu) throws IOException {
        if (this.f10705b != null) {
            aeu.mo14239a(1, this.f10705b);
        }
        if (this.f10706c != null) {
            aeu.mo14239a(2, this.f10706c);
        }
        if (this.f10715l != null) {
            aeu.mo14239a(3, this.f10715l);
        }
        if (this.f10708e != null && this.f10708e.length > 0) {
            for (afo afo : this.f10708e) {
                if (afo != null) {
                    aeu.mo14238a(4, (afc) afo);
                }
            }
        }
        if (this.f10716m != null) {
            aeu.mo14240a(5, this.f10716m.booleanValue());
        }
        if (this.f10717n != null && this.f10717n.length > 0) {
            for (String str : this.f10717n) {
                if (str != null) {
                    aeu.mo14239a(6, str);
                }
            }
        }
        if (this.f10718o != null) {
            aeu.mo14239a(7, this.f10718o);
        }
        if (this.f10719p != null) {
            aeu.mo14240a(8, this.f10719p.booleanValue());
        }
        if (this.f10720q != null) {
            aeu.mo14240a(9, this.f10720q.booleanValue());
        }
        if (this.f10704a != null) {
            aeu.mo14236a(10, this.f10704a.intValue());
        }
        if (this.f10714k != null) {
            aeu.mo14236a(11, this.f10714k.intValue());
        }
        if (this.f10707d != null) {
            aeu.mo14238a(12, (afc) this.f10707d);
        }
        if (this.f10709f != null) {
            aeu.mo14239a(13, this.f10709f);
        }
        if (this.f10710g != null) {
            aeu.mo14238a(14, (afc) this.f10710g);
        }
        if (this.f10721r != null) {
            aeu.mo14241a(15, this.f10721r);
        }
        if (this.f10711h != null) {
            aeu.mo14238a(17, (afc) this.f10711h);
        }
        if (this.f10712i != null && this.f10712i.length > 0) {
            for (String str2 : this.f10712i) {
                if (str2 != null) {
                    aeu.mo14239a(20, str2);
                }
            }
        }
        if (this.f10713j != null && this.f10713j.length > 0) {
            for (String str3 : this.f10713j) {
                if (str3 != null) {
                    aeu.mo14239a(21, str3);
                }
            }
        }
        super.mo13938a(aeu);
    }
}

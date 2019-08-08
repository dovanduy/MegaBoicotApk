package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

final class aai implements add {

    /* renamed from: a */
    private final aaf f10290a;

    /* renamed from: b */
    private int f10291b;

    /* renamed from: c */
    private int f10292c;

    /* renamed from: d */
    private int f10293d = 0;

    private aai(aaf aaf) {
        this.f10290a = (aaf) abg.m13322a(aaf, "input");
        this.f10290a.f10279c = this;
    }

    /* renamed from: a */
    public static aai m13001a(aaf aaf) {
        return aaf.f10279c != null ? aaf.f10279c : new aai(aaf);
    }

    /* renamed from: a */
    private final Object m13002a(ael ael, Class<?> cls, aar aar) throws IOException {
        switch (ael) {
            case BOOL:
                return Boolean.valueOf(mo13831k());
            case BYTES:
                return mo13836n();
            case DOUBLE:
                return Double.valueOf(mo13816d());
            case ENUM:
                return Integer.valueOf(mo13840p());
            case FIXED32:
                return Integer.valueOf(mo13828j());
            case FIXED64:
                return Long.valueOf(mo13826i());
            case FLOAT:
                return Float.valueOf(mo13818e());
            case INT32:
                return Integer.valueOf(mo13824h());
            case INT64:
                return Long.valueOf(mo13822g());
            case MESSAGE:
                m13003a(2);
                return m13006c(acy.m13511a().mo14082a(cls), aar);
            case SFIXED32:
                return Integer.valueOf(mo13842q());
            case SFIXED64:
                return Long.valueOf(mo13844r());
            case SINT32:
                return Integer.valueOf(mo13845s());
            case SINT64:
                return Long.valueOf(mo13846t());
            case STRING:
                return mo13834m();
            case UINT32:
                return Integer.valueOf(mo13838o());
            case UINT64:
                return Long.valueOf(mo13820f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: a */
    private final void m13003a(int i) throws IOException {
        if ((this.f10291b & 7) != i) {
            throw abk.m13337f();
        }
    }

    /* renamed from: a */
    private final void m13004a(List<String> list, boolean z) throws IOException {
        int a;
        int a2;
        if ((this.f10291b & 7) != 2) {
            throw abk.m13337f();
        } else if (!(list instanceof abu) || z) {
            do {
                list.add(z ? mo13834m() : mo13832l());
                if (!this.f10290a.mo13803t()) {
                    a = this.f10290a.mo13779a();
                } else {
                    return;
                }
            } while (a == this.f10291b);
            this.f10293d = a;
        } else {
            abu abu = (abu) list;
            do {
                abu.mo14023a(mo13836n());
                if (!this.f10290a.mo13803t()) {
                    a2 = this.f10290a.mo13779a();
                } else {
                    return;
                }
            } while (a2 == this.f10291b);
            this.f10293d = a2;
        }
    }

    /* renamed from: b */
    private static void m13005b(int i) throws IOException {
        if ((i & 7) != 0) {
            throw abk.m13338g();
        }
    }

    /* renamed from: c */
    private final <T> T m13006c(ade<T> ade, aar aar) throws IOException {
        int m = this.f10290a.mo13796m();
        if (this.f10290a.f10277a >= this.f10290a.f10278b) {
            throw new abk("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int c = this.f10290a.mo13784c(m);
        T a = ade.mo14071a();
        this.f10290a.f10277a++;
        ade.mo14072a(a, this, aar);
        ade.mo14078c(a);
        this.f10290a.mo13780a(0);
        this.f10290a.f10277a--;
        this.f10290a.mo13786d(c);
        return a;
    }

    /* renamed from: c */
    private static void m13007c(int i) throws IOException {
        if ((i & 3) != 0) {
            throw abk.m13338g();
        }
    }

    /* renamed from: d */
    private final <T> T m13008d(ade<T> ade, aar aar) throws IOException {
        int i = this.f10292c;
        this.f10292c = ((this.f10291b >>> 3) << 3) | 4;
        try {
            T a = ade.mo14071a();
            ade.mo14072a(a, this, aar);
            ade.mo14078c(a);
            if (this.f10291b == this.f10292c) {
                return a;
            }
            throw abk.m13338g();
        } finally {
            this.f10292c = i;
        }
    }

    /* renamed from: d */
    private final void m13009d(int i) throws IOException {
        if (this.f10290a.mo13804u() != i) {
            throw abk.m13332a();
        }
    }

    /* renamed from: a */
    public final int mo13805a() throws IOException {
        if (this.f10293d != 0) {
            this.f10291b = this.f10293d;
            this.f10293d = 0;
        } else {
            this.f10291b = this.f10290a.mo13779a();
        }
        if (this.f10291b == 0 || this.f10291b == this.f10292c) {
            return Integer.MAX_VALUE;
        }
        return this.f10291b >>> 3;
    }

    /* renamed from: a */
    public final <T> T mo13806a(ade<T> ade, aar aar) throws IOException {
        m13003a(2);
        return m13006c(ade, aar);
    }

    /* renamed from: a */
    public final void mo13807a(List<Double> list) throws IOException {
        int a;
        int a2;
        if (list instanceof aan) {
            aan aan = (aan) list;
            switch (this.f10291b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f10290a.mo13796m();
                    m13005b(m);
                    int u = this.f10290a.mo13804u() + m;
                    do {
                        aan.mo13925a(this.f10290a.mo13781b());
                    } while (this.f10290a.mo13804u() < u);
                    return;
                default:
                    throw abk.m13337f();
            }
            do {
                aan.mo13925a(this.f10290a.mo13781b());
                if (!this.f10290a.mo13803t()) {
                    a2 = this.f10290a.mo13779a();
                } else {
                    return;
                }
            } while (a2 == this.f10291b);
            this.f10293d = a2;
            return;
        }
        switch (this.f10291b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f10290a.mo13796m();
                m13005b(m2);
                int u2 = this.f10290a.mo13804u() + m2;
                do {
                    list.add(Double.valueOf(this.f10290a.mo13781b()));
                } while (this.f10290a.mo13804u() < u2);
                return;
            default:
                throw abk.m13337f();
        }
        do {
            list.add(Double.valueOf(this.f10290a.mo13781b()));
            if (!this.f10290a.mo13803t()) {
                a = this.f10290a.mo13779a();
            } else {
                return;
            }
        } while (a == this.f10291b);
        this.f10293d = a;
    }

    /* renamed from: a */
    public final <T> void mo13808a(List<T> list, ade<T> ade, aar aar) throws IOException {
        if ((this.f10291b & 7) != 2) {
            throw abk.m13337f();
        }
        int i = this.f10291b;
        while (true) {
            list.add(m13006c(ade, aar));
            if (!this.f10290a.mo13803t() && this.f10293d == 0) {
                int a = this.f10290a.mo13779a();
                if (a != i) {
                    this.f10293d = a;
                    break;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (mo13815c() == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        throw new com.google.android.gms.internal.ads.abk("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x004e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void mo13809a(java.util.Map<K, V> r6, com.google.android.gms.internal.ads.ace<K, V> r7, com.google.android.gms.internal.ads.aar r8) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 2
            r5.m13003a(r0)
            com.google.android.gms.internal.ads.aaf r0 = r5.f10290a
            int r0 = r0.mo13796m()
            com.google.android.gms.internal.ads.aaf r1 = r5.f10290a
            int r0 = r1.mo13784c(r0)
            K r1 = r7.f10479b
            V r2 = r7.f10481d
        L_0x0014:
            int r3 = r5.mo13805a()     // Catch:{ all -> 0x0065 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L_0x005c
            com.google.android.gms.internal.ads.aaf r4 = r5.f10290a     // Catch:{ all -> 0x0065 }
            boolean r4 = r4.mo13803t()     // Catch:{ all -> 0x0065 }
            if (r4 != 0) goto L_0x005c
            switch(r3) {
                case 1: goto L_0x003b;
                case 2: goto L_0x002d;
                default: goto L_0x0028;
            }
        L_0x0028:
            boolean r3 = r5.mo13815c()     // Catch:{ abl -> 0x004e }
            goto L_0x0044
        L_0x002d:
            com.google.android.gms.internal.ads.ael r3 = r7.f10480c     // Catch:{ abl -> 0x004e }
            V r4 = r7.f10481d     // Catch:{ abl -> 0x004e }
            java.lang.Class r4 = r4.getClass()     // Catch:{ abl -> 0x004e }
            java.lang.Object r3 = r5.m13002a(r3, r4, r8)     // Catch:{ abl -> 0x004e }
            r2 = r3
            goto L_0x0014
        L_0x003b:
            com.google.android.gms.internal.ads.ael r3 = r7.f10478a     // Catch:{ abl -> 0x004e }
            r4 = 0
            java.lang.Object r3 = r5.m13002a(r3, r4, r4)     // Catch:{ abl -> 0x004e }
            r1 = r3
            goto L_0x0014
        L_0x0044:
            if (r3 != 0) goto L_0x0014
            com.google.android.gms.internal.ads.abk r3 = new com.google.android.gms.internal.ads.abk     // Catch:{ abl -> 0x004e }
            java.lang.String r4 = "Unable to parse map entry."
            r3.<init>(r4)     // Catch:{ abl -> 0x004e }
            throw r3     // Catch:{ abl -> 0x004e }
        L_0x004e:
            boolean r3 = r5.mo13815c()     // Catch:{ all -> 0x0065 }
            if (r3 != 0) goto L_0x0014
            com.google.android.gms.internal.ads.abk r6 = new com.google.android.gms.internal.ads.abk     // Catch:{ all -> 0x0065 }
            java.lang.String r7 = "Unable to parse map entry."
            r6.<init>(r7)     // Catch:{ all -> 0x0065 }
            throw r6     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r6.put(r1, r2)     // Catch:{ all -> 0x0065 }
            com.google.android.gms.internal.ads.aaf r6 = r5.f10290a
            r6.mo13786d(r0)
            return
        L_0x0065:
            r6 = move-exception
            com.google.android.gms.internal.ads.aaf r7 = r5.f10290a
            r7.mo13786d(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aai.mo13809a(java.util.Map, com.google.android.gms.internal.ads.ace, com.google.android.gms.internal.ads.aar):void");
    }

    /* renamed from: b */
    public final int mo13810b() {
        return this.f10291b;
    }

    /* renamed from: b */
    public final <T> T mo13811b(ade<T> ade, aar aar) throws IOException {
        m13003a(3);
        return m13008d(ade, aar);
    }

    /* renamed from: b */
    public final void mo13812b(List<Float> list) throws IOException {
        int a;
        int a2;
        if (list instanceof abc) {
            abc abc = (abc) list;
            int i = this.f10291b & 7;
            if (i == 2) {
                int m = this.f10290a.mo13796m();
                m13007c(m);
                int u = this.f10290a.mo13804u() + m;
                do {
                    abc.mo13973a(this.f10290a.mo13783c());
                } while (this.f10290a.mo13804u() < u);
            } else if (i != 5) {
                throw abk.m13337f();
            } else {
                do {
                    abc.mo13973a(this.f10290a.mo13783c());
                    if (!this.f10290a.mo13803t()) {
                        a2 = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a2 == this.f10291b);
                this.f10293d = a2;
            }
        } else {
            int i2 = this.f10291b & 7;
            if (i2 == 2) {
                int m2 = this.f10290a.mo13796m();
                m13007c(m2);
                int u2 = this.f10290a.mo13804u() + m2;
                do {
                    list.add(Float.valueOf(this.f10290a.mo13783c()));
                } while (this.f10290a.mo13804u() < u2);
            } else if (i2 != 5) {
                throw abk.m13337f();
            } else {
                do {
                    list.add(Float.valueOf(this.f10290a.mo13783c()));
                    if (!this.f10290a.mo13803t()) {
                        a = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a == this.f10291b);
                this.f10293d = a;
            }
        }
    }

    /* renamed from: b */
    public final <T> void mo13813b(List<T> list, ade<T> ade, aar aar) throws IOException {
        if ((this.f10291b & 7) != 3) {
            throw abk.m13337f();
        }
        int i = this.f10291b;
        while (true) {
            list.add(m13008d(ade, aar));
            if (!this.f10290a.mo13803t() && this.f10293d == 0) {
                int a = this.f10290a.mo13779a();
                if (a != i) {
                    this.f10293d = a;
                    break;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo13814c(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof abz) {
            abz abz = (abz) list;
            int i = this.f10291b & 7;
            if (i == 0) {
                do {
                    abz.mo14036a(this.f10290a.mo13785d());
                    if (!this.f10290a.mo13803t()) {
                        a2 = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a2 == this.f10291b);
                this.f10293d = a2;
            } else if (i != 2) {
                throw abk.m13337f();
            } else {
                int u = this.f10290a.mo13804u() + this.f10290a.mo13796m();
                do {
                    abz.mo14036a(this.f10290a.mo13785d());
                } while (this.f10290a.mo13804u() < u);
                m13009d(u);
            }
        } else {
            int i2 = this.f10291b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f10290a.mo13785d()));
                    if (!this.f10290a.mo13803t()) {
                        a = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a == this.f10291b);
                this.f10293d = a;
            } else if (i2 != 2) {
                throw abk.m13337f();
            } else {
                int u2 = this.f10290a.mo13804u() + this.f10290a.mo13796m();
                do {
                    list.add(Long.valueOf(this.f10290a.mo13785d()));
                } while (this.f10290a.mo13804u() < u2);
                m13009d(u2);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo13815c() throws IOException {
        if (this.f10290a.mo13803t() || this.f10291b == this.f10292c) {
            return false;
        }
        return this.f10290a.mo13782b(this.f10291b);
    }

    /* renamed from: d */
    public final double mo13816d() throws IOException {
        m13003a(1);
        return this.f10290a.mo13781b();
    }

    /* renamed from: d */
    public final void mo13817d(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof abz) {
            abz abz = (abz) list;
            int i = this.f10291b & 7;
            if (i == 0) {
                do {
                    abz.mo14036a(this.f10290a.mo13787e());
                    if (!this.f10290a.mo13803t()) {
                        a2 = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a2 == this.f10291b);
                this.f10293d = a2;
            } else if (i != 2) {
                throw abk.m13337f();
            } else {
                int u = this.f10290a.mo13804u() + this.f10290a.mo13796m();
                do {
                    abz.mo14036a(this.f10290a.mo13787e());
                } while (this.f10290a.mo13804u() < u);
                m13009d(u);
            }
        } else {
            int i2 = this.f10291b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f10290a.mo13787e()));
                    if (!this.f10290a.mo13803t()) {
                        a = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a == this.f10291b);
                this.f10293d = a;
            } else if (i2 != 2) {
                throw abk.m13337f();
            } else {
                int u2 = this.f10290a.mo13804u() + this.f10290a.mo13796m();
                do {
                    list.add(Long.valueOf(this.f10290a.mo13787e()));
                } while (this.f10290a.mo13804u() < u2);
                m13009d(u2);
            }
        }
    }

    /* renamed from: e */
    public final float mo13818e() throws IOException {
        m13003a(5);
        return this.f10290a.mo13783c();
    }

    /* renamed from: e */
    public final void mo13819e(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof abf) {
            abf abf = (abf) list;
            int i = this.f10291b & 7;
            if (i == 0) {
                do {
                    abf.mo14000c(this.f10290a.mo13789f());
                    if (!this.f10290a.mo13803t()) {
                        a2 = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a2 == this.f10291b);
                this.f10293d = a2;
            } else if (i != 2) {
                throw abk.m13337f();
            } else {
                int u = this.f10290a.mo13804u() + this.f10290a.mo13796m();
                do {
                    abf.mo14000c(this.f10290a.mo13789f());
                } while (this.f10290a.mo13804u() < u);
                m13009d(u);
            }
        } else {
            int i2 = this.f10291b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f10290a.mo13789f()));
                    if (!this.f10290a.mo13803t()) {
                        a = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a == this.f10291b);
                this.f10293d = a;
            } else if (i2 != 2) {
                throw abk.m13337f();
            } else {
                int u2 = this.f10290a.mo13804u() + this.f10290a.mo13796m();
                do {
                    list.add(Integer.valueOf(this.f10290a.mo13789f()));
                } while (this.f10290a.mo13804u() < u2);
                m13009d(u2);
            }
        }
    }

    /* renamed from: f */
    public final long mo13820f() throws IOException {
        m13003a(0);
        return this.f10290a.mo13785d();
    }

    /* renamed from: f */
    public final void mo13821f(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof abz) {
            abz abz = (abz) list;
            switch (this.f10291b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f10290a.mo13796m();
                    m13005b(m);
                    int u = this.f10290a.mo13804u() + m;
                    do {
                        abz.mo14036a(this.f10290a.mo13790g());
                    } while (this.f10290a.mo13804u() < u);
                    return;
                default:
                    throw abk.m13337f();
            }
            do {
                abz.mo14036a(this.f10290a.mo13790g());
                if (!this.f10290a.mo13803t()) {
                    a2 = this.f10290a.mo13779a();
                } else {
                    return;
                }
            } while (a2 == this.f10291b);
            this.f10293d = a2;
            return;
        }
        switch (this.f10291b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f10290a.mo13796m();
                m13005b(m2);
                int u2 = this.f10290a.mo13804u() + m2;
                do {
                    list.add(Long.valueOf(this.f10290a.mo13790g()));
                } while (this.f10290a.mo13804u() < u2);
                return;
            default:
                throw abk.m13337f();
        }
        do {
            list.add(Long.valueOf(this.f10290a.mo13790g()));
            if (!this.f10290a.mo13803t()) {
                a = this.f10290a.mo13779a();
            } else {
                return;
            }
        } while (a == this.f10291b);
        this.f10293d = a;
    }

    /* renamed from: g */
    public final long mo13822g() throws IOException {
        m13003a(0);
        return this.f10290a.mo13787e();
    }

    /* renamed from: g */
    public final void mo13823g(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof abf) {
            abf abf = (abf) list;
            int i = this.f10291b & 7;
            if (i == 2) {
                int m = this.f10290a.mo13796m();
                m13007c(m);
                int u = this.f10290a.mo13804u() + m;
                do {
                    abf.mo14000c(this.f10290a.mo13791h());
                } while (this.f10290a.mo13804u() < u);
            } else if (i != 5) {
                throw abk.m13337f();
            } else {
                do {
                    abf.mo14000c(this.f10290a.mo13791h());
                    if (!this.f10290a.mo13803t()) {
                        a2 = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a2 == this.f10291b);
                this.f10293d = a2;
            }
        } else {
            int i2 = this.f10291b & 7;
            if (i2 == 2) {
                int m2 = this.f10290a.mo13796m();
                m13007c(m2);
                int u2 = this.f10290a.mo13804u() + m2;
                do {
                    list.add(Integer.valueOf(this.f10290a.mo13791h()));
                } while (this.f10290a.mo13804u() < u2);
            } else if (i2 != 5) {
                throw abk.m13337f();
            } else {
                do {
                    list.add(Integer.valueOf(this.f10290a.mo13791h()));
                    if (!this.f10290a.mo13803t()) {
                        a = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a == this.f10291b);
                this.f10293d = a;
            }
        }
    }

    /* renamed from: h */
    public final int mo13824h() throws IOException {
        m13003a(0);
        return this.f10290a.mo13789f();
    }

    /* renamed from: h */
    public final void mo13825h(List<Boolean> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C4384zu) {
            C4384zu zuVar = (C4384zu) list;
            int i = this.f10291b & 7;
            if (i == 0) {
                do {
                    zuVar.mo16230a(this.f10290a.mo13792i());
                    if (!this.f10290a.mo13803t()) {
                        a2 = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a2 == this.f10291b);
                this.f10293d = a2;
            } else if (i != 2) {
                throw abk.m13337f();
            } else {
                int u = this.f10290a.mo13804u() + this.f10290a.mo13796m();
                do {
                    zuVar.mo16230a(this.f10290a.mo13792i());
                } while (this.f10290a.mo13804u() < u);
                m13009d(u);
            }
        } else {
            int i2 = this.f10291b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f10290a.mo13792i()));
                    if (!this.f10290a.mo13803t()) {
                        a = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a == this.f10291b);
                this.f10293d = a;
            } else if (i2 != 2) {
                throw abk.m13337f();
            } else {
                int u2 = this.f10290a.mo13804u() + this.f10290a.mo13796m();
                do {
                    list.add(Boolean.valueOf(this.f10290a.mo13792i()));
                } while (this.f10290a.mo13804u() < u2);
                m13009d(u2);
            }
        }
    }

    /* renamed from: i */
    public final long mo13826i() throws IOException {
        m13003a(1);
        return this.f10290a.mo13790g();
    }

    /* renamed from: i */
    public final void mo13827i(List<String> list) throws IOException {
        m13004a(list, false);
    }

    /* renamed from: j */
    public final int mo13828j() throws IOException {
        m13003a(5);
        return this.f10290a.mo13791h();
    }

    /* renamed from: j */
    public final void mo13829j(List<String> list) throws IOException {
        m13004a(list, true);
    }

    /* renamed from: k */
    public final void mo13830k(List<C4386zw> list) throws IOException {
        int a;
        if ((this.f10291b & 7) != 2) {
            throw abk.m13337f();
        }
        do {
            list.add(mo13836n());
            if (!this.f10290a.mo13803t()) {
                a = this.f10290a.mo13779a();
            } else {
                return;
            }
        } while (a == this.f10291b);
        this.f10293d = a;
    }

    /* renamed from: k */
    public final boolean mo13831k() throws IOException {
        m13003a(0);
        return this.f10290a.mo13792i();
    }

    /* renamed from: l */
    public final String mo13832l() throws IOException {
        m13003a(2);
        return this.f10290a.mo13793j();
    }

    /* renamed from: l */
    public final void mo13833l(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof abf) {
            abf abf = (abf) list;
            int i = this.f10291b & 7;
            if (i == 0) {
                do {
                    abf.mo14000c(this.f10290a.mo13796m());
                    if (!this.f10290a.mo13803t()) {
                        a2 = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a2 == this.f10291b);
                this.f10293d = a2;
            } else if (i != 2) {
                throw abk.m13337f();
            } else {
                int u = this.f10290a.mo13804u() + this.f10290a.mo13796m();
                do {
                    abf.mo14000c(this.f10290a.mo13796m());
                } while (this.f10290a.mo13804u() < u);
                m13009d(u);
            }
        } else {
            int i2 = this.f10291b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f10290a.mo13796m()));
                    if (!this.f10290a.mo13803t()) {
                        a = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a == this.f10291b);
                this.f10293d = a;
            } else if (i2 != 2) {
                throw abk.m13337f();
            } else {
                int u2 = this.f10290a.mo13804u() + this.f10290a.mo13796m();
                do {
                    list.add(Integer.valueOf(this.f10290a.mo13796m()));
                } while (this.f10290a.mo13804u() < u2);
                m13009d(u2);
            }
        }
    }

    /* renamed from: m */
    public final String mo13834m() throws IOException {
        m13003a(2);
        return this.f10290a.mo13794k();
    }

    /* renamed from: m */
    public final void mo13835m(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof abf) {
            abf abf = (abf) list;
            int i = this.f10291b & 7;
            if (i == 0) {
                do {
                    abf.mo14000c(this.f10290a.mo13797n());
                    if (!this.f10290a.mo13803t()) {
                        a2 = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a2 == this.f10291b);
                this.f10293d = a2;
            } else if (i != 2) {
                throw abk.m13337f();
            } else {
                int u = this.f10290a.mo13804u() + this.f10290a.mo13796m();
                do {
                    abf.mo14000c(this.f10290a.mo13797n());
                } while (this.f10290a.mo13804u() < u);
                m13009d(u);
            }
        } else {
            int i2 = this.f10291b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f10290a.mo13797n()));
                    if (!this.f10290a.mo13803t()) {
                        a = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a == this.f10291b);
                this.f10293d = a;
            } else if (i2 != 2) {
                throw abk.m13337f();
            } else {
                int u2 = this.f10290a.mo13804u() + this.f10290a.mo13796m();
                do {
                    list.add(Integer.valueOf(this.f10290a.mo13797n()));
                } while (this.f10290a.mo13804u() < u2);
                m13009d(u2);
            }
        }
    }

    /* renamed from: n */
    public final C4386zw mo13836n() throws IOException {
        m13003a(2);
        return this.f10290a.mo13795l();
    }

    /* renamed from: n */
    public final void mo13837n(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof abf) {
            abf abf = (abf) list;
            int i = this.f10291b & 7;
            if (i == 2) {
                int m = this.f10290a.mo13796m();
                m13007c(m);
                int u = this.f10290a.mo13804u() + m;
                do {
                    abf.mo14000c(this.f10290a.mo13798o());
                } while (this.f10290a.mo13804u() < u);
            } else if (i != 5) {
                throw abk.m13337f();
            } else {
                do {
                    abf.mo14000c(this.f10290a.mo13798o());
                    if (!this.f10290a.mo13803t()) {
                        a2 = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a2 == this.f10291b);
                this.f10293d = a2;
            }
        } else {
            int i2 = this.f10291b & 7;
            if (i2 == 2) {
                int m2 = this.f10290a.mo13796m();
                m13007c(m2);
                int u2 = this.f10290a.mo13804u() + m2;
                do {
                    list.add(Integer.valueOf(this.f10290a.mo13798o()));
                } while (this.f10290a.mo13804u() < u2);
            } else if (i2 != 5) {
                throw abk.m13337f();
            } else {
                do {
                    list.add(Integer.valueOf(this.f10290a.mo13798o()));
                    if (!this.f10290a.mo13803t()) {
                        a = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a == this.f10291b);
                this.f10293d = a;
            }
        }
    }

    /* renamed from: o */
    public final int mo13838o() throws IOException {
        m13003a(0);
        return this.f10290a.mo13796m();
    }

    /* renamed from: o */
    public final void mo13839o(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof abz) {
            abz abz = (abz) list;
            switch (this.f10291b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f10290a.mo13796m();
                    m13005b(m);
                    int u = this.f10290a.mo13804u() + m;
                    do {
                        abz.mo14036a(this.f10290a.mo13799p());
                    } while (this.f10290a.mo13804u() < u);
                    return;
                default:
                    throw abk.m13337f();
            }
            do {
                abz.mo14036a(this.f10290a.mo13799p());
                if (!this.f10290a.mo13803t()) {
                    a2 = this.f10290a.mo13779a();
                } else {
                    return;
                }
            } while (a2 == this.f10291b);
            this.f10293d = a2;
            return;
        }
        switch (this.f10291b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f10290a.mo13796m();
                m13005b(m2);
                int u2 = this.f10290a.mo13804u() + m2;
                do {
                    list.add(Long.valueOf(this.f10290a.mo13799p()));
                } while (this.f10290a.mo13804u() < u2);
                return;
            default:
                throw abk.m13337f();
        }
        do {
            list.add(Long.valueOf(this.f10290a.mo13799p()));
            if (!this.f10290a.mo13803t()) {
                a = this.f10290a.mo13779a();
            } else {
                return;
            }
        } while (a == this.f10291b);
        this.f10293d = a;
    }

    /* renamed from: p */
    public final int mo13840p() throws IOException {
        m13003a(0);
        return this.f10290a.mo13797n();
    }

    /* renamed from: p */
    public final void mo13841p(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof abf) {
            abf abf = (abf) list;
            int i = this.f10291b & 7;
            if (i == 0) {
                do {
                    abf.mo14000c(this.f10290a.mo13800q());
                    if (!this.f10290a.mo13803t()) {
                        a2 = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a2 == this.f10291b);
                this.f10293d = a2;
            } else if (i != 2) {
                throw abk.m13337f();
            } else {
                int u = this.f10290a.mo13804u() + this.f10290a.mo13796m();
                do {
                    abf.mo14000c(this.f10290a.mo13800q());
                } while (this.f10290a.mo13804u() < u);
                m13009d(u);
            }
        } else {
            int i2 = this.f10291b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f10290a.mo13800q()));
                    if (!this.f10290a.mo13803t()) {
                        a = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a == this.f10291b);
                this.f10293d = a;
            } else if (i2 != 2) {
                throw abk.m13337f();
            } else {
                int u2 = this.f10290a.mo13804u() + this.f10290a.mo13796m();
                do {
                    list.add(Integer.valueOf(this.f10290a.mo13800q()));
                } while (this.f10290a.mo13804u() < u2);
                m13009d(u2);
            }
        }
    }

    /* renamed from: q */
    public final int mo13842q() throws IOException {
        m13003a(5);
        return this.f10290a.mo13798o();
    }

    /* renamed from: q */
    public final void mo13843q(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof abz) {
            abz abz = (abz) list;
            int i = this.f10291b & 7;
            if (i == 0) {
                do {
                    abz.mo14036a(this.f10290a.mo13801r());
                    if (!this.f10290a.mo13803t()) {
                        a2 = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a2 == this.f10291b);
                this.f10293d = a2;
            } else if (i != 2) {
                throw abk.m13337f();
            } else {
                int u = this.f10290a.mo13804u() + this.f10290a.mo13796m();
                do {
                    abz.mo14036a(this.f10290a.mo13801r());
                } while (this.f10290a.mo13804u() < u);
                m13009d(u);
            }
        } else {
            int i2 = this.f10291b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f10290a.mo13801r()));
                    if (!this.f10290a.mo13803t()) {
                        a = this.f10290a.mo13779a();
                    } else {
                        return;
                    }
                } while (a == this.f10291b);
                this.f10293d = a;
            } else if (i2 != 2) {
                throw abk.m13337f();
            } else {
                int u2 = this.f10290a.mo13804u() + this.f10290a.mo13796m();
                do {
                    list.add(Long.valueOf(this.f10290a.mo13801r()));
                } while (this.f10290a.mo13804u() < u2);
                m13009d(u2);
            }
        }
    }

    /* renamed from: r */
    public final long mo13844r() throws IOException {
        m13003a(1);
        return this.f10290a.mo13799p();
    }

    /* renamed from: s */
    public final int mo13845s() throws IOException {
        m13003a(0);
        return this.f10290a.mo13800q();
    }

    /* renamed from: t */
    public final long mo13846t() throws IOException {
        m13003a(0);
        return this.f10290a.mo13801r();
    }
}

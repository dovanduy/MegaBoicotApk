package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

final class acs<T> implements ade<T> {

    /* renamed from: a */
    private final acl f10511a;

    /* renamed from: b */
    private final adx<?, ?> f10512b;

    /* renamed from: c */
    private final boolean f10513c;

    /* renamed from: d */
    private final aat<?> f10514d;

    private acs(adx<?, ?> adx, aat<?> aat, acl acl) {
        this.f10512b = adx;
        this.f10513c = aat.mo13950a(acl);
        this.f10514d = aat;
        this.f10511a = acl;
    }

    /* renamed from: a */
    static <T> acs<T> m13494a(adx<?, ?> adx, aat<?> aat, acl acl) {
        return new acs<>(adx, aat, acl);
    }

    /* renamed from: a */
    public final int mo14070a(T t) {
        int hashCode = this.f10512b.mo14164b(t).hashCode();
        return this.f10513c ? (hashCode * 53) + this.f10514d.mo13943a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: a */
    public final T mo14071a() {
        return this.f10511a.mo13988o().mo13997d();
    }

    /* renamed from: a */
    public final void mo14072a(T t, add add, aar aar) throws IOException {
        boolean z;
        adx<?, ?> adx = this.f10512b;
        aat<?> aat = this.f10514d;
        Object c = adx.mo14168c(t);
        aaw b = aat.mo13951b(t);
        do {
            try {
                if (add.mo13805a() == Integer.MAX_VALUE) {
                    adx.mo14167b((Object) t, c);
                    return;
                }
                int b2 = add.mo13810b();
                if (b2 == 11) {
                    Object obj = null;
                    int i = 0;
                    C4386zw zwVar = null;
                    while (add.mo13805a() != Integer.MAX_VALUE) {
                        int b3 = add.mo13810b();
                        if (b3 == 16) {
                            i = add.mo13838o();
                            obj = aat.mo13944a(aar, this.f10511a, i);
                        } else if (b3 == 26) {
                            if (obj != null) {
                                aat.mo13946a(add, obj, aar, b);
                            } else {
                                zwVar = add.mo13836n();
                            }
                        } else if (!add.mo13815c()) {
                            break;
                        }
                    }
                    if (add.mo13810b() != 12) {
                        throw abk.m13336e();
                    } else if (zwVar != null) {
                        if (obj != null) {
                            aat.mo13948a(zwVar, obj, aar, b);
                        } else {
                            adx.mo14158a(c, i, zwVar);
                        }
                    }
                } else if ((b2 & 7) == 2) {
                    Object a = aat.mo13944a(aar, this.f10511a, b2 >>> 3);
                    if (a != null) {
                        aat.mo13946a(add, a, aar, b);
                    } else {
                        z = adx.mo14163a(c, add);
                        continue;
                    }
                } else {
                    z = add.mo13815c();
                    continue;
                }
                z = true;
                continue;
            } finally {
                adx.mo14167b((Object) t, c);
            }
        } while (z);
    }

    /* renamed from: a */
    public final void mo14073a(T t, aer aer) throws IOException {
        int a;
        Object value;
        Iterator e = this.f10514d.mo13943a((Object) t).mo13958e();
        while (e.hasNext()) {
            Entry entry = (Entry) e.next();
            aay aay = (aay) entry.getKey();
            if (aay.mo13969c() != aeq.MESSAGE || aay.mo13970d() || aay.mo13971e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof abp) {
                a = aay.mo13965a();
                value = ((abp) entry).mo14013a().mo14022c();
            } else {
                a = aay.mo13965a();
                value = entry.getValue();
            }
            aer.mo13891a(a, value);
        }
        adx<?, ?> adx = this.f10512b;
        adx.mo14166b(adx.mo14164b(t), aer);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14074a(T r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.ads.C4383zt r11) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.abe r7 = (com.google.android.gms.internal.ads.abe) r7
            com.google.android.gms.internal.ads.ady r0 = r7.zzdtt
            com.google.android.gms.internal.ads.ady r1 = com.google.android.gms.internal.ads.ady.m13723a()
            if (r0 != r1) goto L_0x0010
            com.google.android.gms.internal.ads.ady r0 = com.google.android.gms.internal.ads.ady.m13726b()
            r7.zzdtt = r0
        L_0x0010:
            r7 = r0
        L_0x0011:
            if (r9 >= r10) goto L_0x0069
            int r2 = com.google.android.gms.internal.ads.C4382zs.m18747a(r8, r9, r11)
            int r0 = r11.f14359a
            r9 = 11
            r1 = 2
            if (r0 == r9) goto L_0x0030
            r9 = r0 & 7
            if (r9 != r1) goto L_0x002b
            r1 = r8
            r3 = r10
            r4 = r7
            r5 = r11
            int r9 = com.google.android.gms.internal.ads.C4382zs.m18742a(r0, r1, r2, r3, r4, r5)
            goto L_0x0011
        L_0x002b:
            int r9 = com.google.android.gms.internal.ads.C4382zs.m18743a(r0, r8, r2, r10, r11)
            goto L_0x0011
        L_0x0030:
            r9 = 0
            r0 = 0
        L_0x0032:
            if (r2 >= r10) goto L_0x005f
            int r2 = com.google.android.gms.internal.ads.C4382zs.m18747a(r8, r2, r11)
            int r3 = r11.f14359a
            int r4 = r3 >>> 3
            r5 = r3 & 7
            switch(r4) {
                case 2: goto L_0x004d;
                case 3: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0056
        L_0x0042:
            if (r5 != r1) goto L_0x0056
            int r2 = com.google.android.gms.internal.ads.C4382zs.m18754e(r8, r2, r11)
            java.lang.Object r0 = r11.f14361c
            com.google.android.gms.internal.ads.zw r0 = (com.google.android.gms.internal.ads.C4386zw) r0
            goto L_0x0032
        L_0x004d:
            if (r5 != 0) goto L_0x0056
            int r2 = com.google.android.gms.internal.ads.C4382zs.m18747a(r8, r2, r11)
            int r9 = r11.f14359a
            goto L_0x0032
        L_0x0056:
            r4 = 12
            if (r3 == r4) goto L_0x005f
            int r2 = com.google.android.gms.internal.ads.C4382zs.m18743a(r3, r8, r2, r10, r11)
            goto L_0x0032
        L_0x005f:
            if (r0 == 0) goto L_0x0067
            int r9 = r9 << 3
            r9 = r9 | r1
            r7.mo14173a(r9, r0)
        L_0x0067:
            r9 = r2
            goto L_0x0011
        L_0x0069:
            if (r9 == r10) goto L_0x0070
            com.google.android.gms.internal.ads.abk r7 = com.google.android.gms.internal.ads.abk.m13338g()
            throw r7
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.acs.mo14074a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zt):void");
    }

    /* renamed from: a */
    public final boolean mo14075a(T t, T t2) {
        if (!this.f10512b.mo14164b(t).equals(this.f10512b.mo14164b(t2))) {
            return false;
        }
        if (this.f10513c) {
            return this.f10514d.mo13943a((Object) t).equals(this.f10514d.mo13943a((Object) t2));
        }
        return true;
    }

    /* renamed from: b */
    public final int mo14076b(T t) {
        adx<?, ?> adx = this.f10512b;
        int e = 0 + adx.mo14171e(adx.mo14164b(t));
        return this.f10513c ? e + this.f10514d.mo13943a((Object) t).mo13964i() : e;
    }

    /* renamed from: b */
    public final void mo14077b(T t, T t2) {
        adg.m13626a(this.f10512b, t, t2);
        if (this.f10513c) {
            adg.m13624a(this.f10514d, t, t2);
        }
    }

    /* renamed from: c */
    public final void mo14078c(T t) {
        this.f10512b.mo14170d(t);
        this.f10514d.mo13952c(t);
    }

    /* renamed from: d */
    public final boolean mo14079d(T t) {
        return this.f10514d.mo13943a((Object) t).mo13961g();
    }
}

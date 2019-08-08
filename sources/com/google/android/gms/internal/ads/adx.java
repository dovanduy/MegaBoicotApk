package com.google.android.gms.internal.ads;

import java.io.IOException;

abstract class adx<T, B> {
    adx() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract B mo14154a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo14155a(B b);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo14156a(B b, int i, int i2);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo14157a(B b, int i, long j);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo14158a(B b, int i, C4386zw zwVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo14159a(B b, int i, T t);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo14160a(T t, aer aer) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo14161a(Object obj, T t);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo14162a(add add);

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14163a(B r7, com.google.android.gms.internal.ads.add r8) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r8.mo13810b()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            switch(r0) {
                case 0: goto L_0x0055;
                case 1: goto L_0x004d;
                case 2: goto L_0x0045;
                case 3: goto L_0x001b;
                case 4: goto L_0x0019;
                case 5: goto L_0x0011;
                default: goto L_0x000c;
            }
        L_0x000c:
            com.google.android.gms.internal.ads.abl r7 = com.google.android.gms.internal.ads.abk.m13337f()
            throw r7
        L_0x0011:
            int r8 = r8.mo13828j()
            r6.mo14156a((B) r7, r1, r8)
            return r2
        L_0x0019:
            r7 = 0
            return r7
        L_0x001b:
            java.lang.Object r0 = r6.mo14154a()
            int r3 = r1 << 3
            r3 = r3 | 4
        L_0x0023:
            int r4 = r8.mo13805a()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x0032
            boolean r4 = r6.mo14163a((B) r0, r8)
            if (r4 != 0) goto L_0x0023
        L_0x0032:
            int r8 = r8.mo13810b()
            if (r3 == r8) goto L_0x003d
            com.google.android.gms.internal.ads.abk r7 = com.google.android.gms.internal.ads.abk.m13336e()
            throw r7
        L_0x003d:
            java.lang.Object r8 = r6.mo14155a((B) r0)
            r6.mo14159a((B) r7, r1, (T) r8)
            return r2
        L_0x0045:
            com.google.android.gms.internal.ads.zw r8 = r8.mo13836n()
            r6.mo14158a((B) r7, r1, r8)
            return r2
        L_0x004d:
            long r3 = r8.mo13826i()
            r6.mo14165b(r7, r1, r3)
            return r2
        L_0x0055:
            long r3 = r8.mo13822g()
            r6.mo14157a((B) r7, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.adx.mo14163a(java.lang.Object, com.google.android.gms.internal.ads.add):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract T mo14164b(Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo14165b(B b, int i, long j);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo14166b(T t, aer aer) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo14167b(Object obj, B b);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract B mo14168c(Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract T mo14169c(T t, T t2);

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract void mo14170d(Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract int mo14171e(T t);

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract int mo14172f(T t);
}

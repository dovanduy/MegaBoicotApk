package com.google.android.gms.internal.p148e;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.e.bt */
class C4479bt extends C4478bs {

    /* renamed from: b */
    protected final byte[] f14710b;

    C4479bt(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException();
        }
        this.f14710b = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo16408e() {
        return 0;
    }

    /* renamed from: a */
    public byte mo16388a(int i) {
        return this.f14710b[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public byte mo16394b(int i) {
        return this.f14710b[i];
    }

    /* renamed from: a */
    public int mo16389a() {
        return this.f14710b.length;
    }

    /* renamed from: a */
    public final C4469bj mo16391a(int i, int i2) {
        int b = m18963b(0, i2, mo16389a());
        if (b == 0) {
            return C4469bj.f14699a;
        }
        return new C4474bo(this.f14710b, mo16408e(), b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16393a(C4468bi biVar) throws IOException {
        biVar.mo16387a(this.f14710b, mo16408e(), mo16389a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo16392a(Charset charset) {
        return new String(this.f14710b, mo16408e(), mo16389a(), charset);
    }

    /* renamed from: c */
    public final boolean mo16396c() {
        int e = mo16408e();
        return C4607ft.m19937a(this.f14710b, e, mo16389a() + e);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4469bj) || mo16389a() != ((C4469bj) obj).mo16389a()) {
            return false;
        }
        if (mo16389a() == 0) {
            return true;
        }
        if (!(obj instanceof C4479bt)) {
            return obj.equals(this);
        }
        C4479bt btVar = (C4479bt) obj;
        int d = mo16397d();
        int d2 = btVar.mo16397d();
        if (d == 0 || d2 == 0 || d == d2) {
            return mo16411a(btVar, 0, mo16389a());
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo16411a(C4469bj bjVar, int i, int i2) {
        if (i2 > bjVar.mo16389a()) {
            int a = mo16389a();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(a);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > bjVar.mo16389a()) {
            int a2 = bjVar.mo16389a();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(a2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(bjVar instanceof C4479bt)) {
            return bjVar.mo16391a(0, i2).equals(mo16391a(0, i2));
        } else {
            C4479bt btVar = (C4479bt) bjVar;
            byte[] bArr = this.f14710b;
            byte[] bArr2 = btVar.f14710b;
            int e = mo16408e() + i2;
            int e2 = mo16408e();
            int e3 = btVar.mo16408e();
            while (e2 < e) {
                if (bArr[e2] != bArr2[e3]) {
                    return false;
                }
                e2++;
                e3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo16390a(int i, int i2, int i3) {
        return C4520cw.m19443a(i, this.f14710b, mo16408e(), i3);
    }
}

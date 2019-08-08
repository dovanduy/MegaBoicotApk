package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;

class aad extends aac {

    /* renamed from: b */
    protected final byte[] f10275b;

    aad(byte[] bArr) {
        this.f10275b = bArr;
    }

    /* renamed from: a */
    public byte mo13768a(int i) {
        return this.f10275b[i];
    }

    /* renamed from: a */
    public int mo13769a() {
        return this.f10275b.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo13770a(int i, int i2, int i3) {
        return abg.m13317a(i, this.f10275b, mo13778g(), i3);
    }

    /* renamed from: a */
    public final C4386zw mo13771a(int i, int i2) {
        int b = m18764b(0, i2, mo13769a());
        return b == 0 ? C4386zw.f14365a : new C4389zz(this.f10275b, mo13778g(), b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo13772a(Charset charset) {
        return new String(this.f10275b, mo13778g(), mo13769a(), charset);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13773a(C4385zv zvVar) throws IOException {
        zvVar.mo13882a(this.f10275b, mo13778g(), mo13769a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13774a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f10275b, 0, bArr, 0, i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo13767a(C4386zw zwVar, int i, int i2) {
        if (i2 > zwVar.mo13769a()) {
            int a = mo13769a();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(a);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zwVar.mo13769a()) {
            int a2 = zwVar.mo13769a();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(a2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zwVar instanceof aad)) {
            return zwVar.mo13771a(0, i2).equals(mo13771a(0, i2));
        } else {
            aad aad = (aad) zwVar;
            byte[] bArr = this.f10275b;
            byte[] bArr2 = aad.f10275b;
            int g = mo13778g() + i2;
            int g2 = mo13778g();
            int g3 = aad.mo13778g();
            while (g2 < g) {
                if (bArr[g2] != bArr2[g3]) {
                    return false;
                }
                g2++;
                g3++;
            }
            return true;
        }
    }

    /* renamed from: d */
    public final boolean mo13775d() {
        int g = mo13778g();
        return aef.m13844a(this.f10275b, g, mo13769a() + g);
    }

    /* renamed from: e */
    public final aaf mo13776e() {
        return aaf.m12941a(this.f10275b, mo13778g(), mo13769a(), true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4386zw) || mo13769a() != ((C4386zw) obj).mo13769a()) {
            return false;
        }
        if (mo13769a() == 0) {
            return true;
        }
        if (!(obj instanceof aad)) {
            return obj.equals(this);
        }
        aad aad = (aad) obj;
        int f = mo16236f();
        int f2 = aad.mo16236f();
        if (f == 0 || f2 == 0 || f == f2) {
            return mo13767a(aad, 0, mo13769a());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo13778g() {
        return 0;
    }
}

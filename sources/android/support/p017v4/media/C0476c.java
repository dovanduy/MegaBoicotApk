package android.support.p017v4.media;

import java.util.Arrays;

/* renamed from: android.support.v4.media.c */
/* compiled from: AudioAttributesImplBase */
class C0476c implements C0472a {

    /* renamed from: a */
    int f1226a = 0;

    /* renamed from: b */
    int f1227b = 0;

    /* renamed from: c */
    int f1228c = 0;

    /* renamed from: d */
    int f1229d = -1;

    C0476c() {
    }

    /* renamed from: a */
    public int mo1658a() {
        if (this.f1229d != -1) {
            return this.f1229d;
        }
        return AudioAttributesCompat.m1614a(false, this.f1228c, this.f1226a);
    }

    /* renamed from: b */
    public int mo1659b() {
        return this.f1227b;
    }

    /* renamed from: c */
    public int mo1660c() {
        return this.f1226a;
    }

    /* renamed from: d */
    public int mo1661d() {
        int i = this.f1228c;
        int a = mo1658a();
        if (a == 6) {
            i |= 4;
        } else if (a == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1227b), Integer.valueOf(this.f1228c), Integer.valueOf(this.f1226a), Integer.valueOf(this.f1229d)});
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C0476c)) {
            return false;
        }
        C0476c cVar = (C0476c) obj;
        if (this.f1227b == cVar.mo1659b() && this.f1228c == cVar.mo1661d() && this.f1226a == cVar.mo1660c() && this.f1229d == cVar.f1229d) {
            z = true;
        }
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1229d != -1) {
            sb.append(" stream=");
            sb.append(this.f1229d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m1615a(this.f1226a));
        sb.append(" content=");
        sb.append(this.f1227b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1228c).toUpperCase());
        return sb.toString();
    }
}

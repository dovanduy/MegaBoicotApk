package com.google.android.gms.internal.p148e;

import com.google.android.gms.internal.p148e.C4513cu.C4518e;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.e.fm */
public final class C4596fm {

    /* renamed from: a */
    private static final C4596fm f14975a = new C4596fm(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f14976b;

    /* renamed from: c */
    private int[] f14977c;

    /* renamed from: d */
    private Object[] f14978d;

    /* renamed from: e */
    private int f14979e;

    /* renamed from: f */
    private boolean f14980f;

    /* renamed from: a */
    public static C4596fm m19805a() {
        return f14975a;
    }

    /* renamed from: b */
    static C4596fm m19808b() {
        return new C4596fm();
    }

    /* renamed from: a */
    static C4596fm m19806a(C4596fm fmVar, C4596fm fmVar2) {
        int i = fmVar.f14976b + fmVar2.f14976b;
        int[] copyOf = Arrays.copyOf(fmVar.f14977c, i);
        System.arraycopy(fmVar2.f14977c, 0, copyOf, fmVar.f14976b, fmVar2.f14976b);
        Object[] copyOf2 = Arrays.copyOf(fmVar.f14978d, i);
        System.arraycopy(fmVar2.f14978d, 0, copyOf2, fmVar.f14976b, fmVar2.f14976b);
        return new C4596fm(i, copyOf, copyOf2, true);
    }

    private C4596fm() {
        this(0, new int[8], new Object[8], true);
    }

    private C4596fm(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f14979e = -1;
        this.f14976b = i;
        this.f14977c = iArr;
        this.f14978d = objArr;
        this.f14980f = z;
    }

    /* renamed from: c */
    public final void mo16768c() {
        this.f14980f = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16765a(C4621gg ggVar) throws IOException {
        if (ggVar.mo16520a() == C4518e.f14855k) {
            for (int i = this.f14976b - 1; i >= 0; i--) {
                ggVar.mo16528a(this.f14977c[i] >>> 3, this.f14978d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f14976b; i2++) {
            ggVar.mo16528a(this.f14977c[i2] >>> 3, this.f14978d[i2]);
        }
    }

    /* renamed from: b */
    public final void mo16767b(C4621gg ggVar) throws IOException {
        if (this.f14976b != 0) {
            if (ggVar.mo16520a() == C4518e.f14854j) {
                for (int i = 0; i < this.f14976b; i++) {
                    m19807a(this.f14977c[i], this.f14978d[i], ggVar);
                }
                return;
            }
            for (int i2 = this.f14976b - 1; i2 >= 0; i2--) {
                m19807a(this.f14977c[i2], this.f14978d[i2], ggVar);
            }
        }
    }

    /* renamed from: a */
    private static void m19807a(int i, Object obj, C4621gg ggVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 5) {
            switch (i3) {
                case 0:
                    ggVar.mo16525a(i2, ((Long) obj).longValue());
                    return;
                case 1:
                    ggVar.mo16546d(i2, ((Long) obj).longValue());
                    return;
                case 2:
                    ggVar.mo16526a(i2, (C4469bj) obj);
                    return;
                case 3:
                    if (ggVar.mo16520a() == C4518e.f14854j) {
                        ggVar.mo16521a(i2);
                        ((C4596fm) obj).mo16767b(ggVar);
                        ggVar.mo16535b(i2);
                        return;
                    }
                    ggVar.mo16535b(i2);
                    ((C4596fm) obj).mo16767b(ggVar);
                    ggVar.mo16521a(i2);
                    return;
                default:
                    throw new RuntimeException(C4526db.m19462e());
            }
        } else {
            ggVar.mo16545d(i2, ((Integer) obj).intValue());
        }
    }

    /* renamed from: d */
    public final int mo16769d() {
        int i = this.f14979e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f14976b; i3++) {
            i2 += C4487ca.m19136d(this.f14977c[i3] >>> 3, (C4469bj) this.f14978d[i3]);
        }
        this.f14979e = i2;
        return i2;
    }

    /* renamed from: e */
    public final int mo16770e() {
        int i;
        int i2 = this.f14979e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f14976b; i4++) {
            int i5 = this.f14977c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 5) {
                switch (i7) {
                    case 0:
                        i = C4487ca.m19140e(i6, ((Long) this.f14978d[i4]).longValue());
                        break;
                    case 1:
                        i = C4487ca.m19148g(i6, ((Long) this.f14978d[i4]).longValue());
                        break;
                    case 2:
                        i = C4487ca.m19130c(i6, (C4469bj) this.f14978d[i4]);
                        break;
                    case 3:
                        i = (C4487ca.m19139e(i6) << 1) + ((C4596fm) this.f14978d[i4]).mo16770e();
                        break;
                    default:
                        throw new IllegalStateException(C4526db.m19462e());
                }
            } else {
                i = C4487ca.m19155i(i6, ((Integer) this.f14978d[i4]).intValue());
            }
            i3 += i;
        }
        this.f14979e = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4596fm)) {
            return false;
        }
        C4596fm fmVar = (C4596fm) obj;
        if (this.f14976b == fmVar.f14976b) {
            int[] iArr = this.f14977c;
            int[] iArr2 = fmVar.f14977c;
            int i = this.f14976b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f14978d;
                Object[] objArr2 = fmVar.f14978d;
                int i3 = this.f14976b;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = (527 + this.f14976b) * 31;
        int[] iArr = this.f14977c;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < this.f14976b; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i + i3) * 31;
        Object[] objArr = this.f14978d;
        for (int i6 = 0; i6 < this.f14976b; i6++) {
            i2 = (i2 * 31) + objArr[i6].hashCode();
        }
        return i5 + i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16766a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f14976b; i2++) {
            C4557ef.m19559a(sb, i, String.valueOf(this.f14977c[i2] >>> 3), this.f14978d[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16764a(int i, Object obj) {
        if (!this.f14980f) {
            throw new UnsupportedOperationException();
        }
        if (this.f14976b == this.f14977c.length) {
            int i2 = this.f14976b + (this.f14976b < 4 ? 8 : this.f14976b >> 1);
            this.f14977c = Arrays.copyOf(this.f14977c, i2);
            this.f14978d = Arrays.copyOf(this.f14978d, i2);
        }
        this.f14977c[this.f14976b] = i;
        this.f14978d[this.f14976b] = obj;
        this.f14976b++;
    }
}

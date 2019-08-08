package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe.C3640e;
import java.io.IOException;
import java.util.Arrays;

public final class ady {

    /* renamed from: a */
    private static final ady f10590a = new ady(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f10591b;

    /* renamed from: c */
    private int[] f10592c;

    /* renamed from: d */
    private Object[] f10593d;

    /* renamed from: e */
    private int f10594e;

    /* renamed from: f */
    private boolean f10595f;

    private ady() {
        this(0, new int[8], new Object[8], true);
    }

    private ady(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f10594e = -1;
        this.f10591b = i;
        this.f10592c = iArr;
        this.f10593d = objArr;
        this.f10595f = z;
    }

    /* renamed from: a */
    public static ady m13723a() {
        return f10590a;
    }

    /* renamed from: a */
    static ady m13724a(ady ady, ady ady2) {
        int i = ady.f10591b + ady2.f10591b;
        int[] copyOf = Arrays.copyOf(ady.f10592c, i);
        System.arraycopy(ady2.f10592c, 0, copyOf, ady.f10591b, ady2.f10591b);
        Object[] copyOf2 = Arrays.copyOf(ady.f10593d, i);
        System.arraycopy(ady2.f10593d, 0, copyOf2, ady.f10591b, ady2.f10591b);
        return new ady(i, copyOf, copyOf2, true);
    }

    /* renamed from: a */
    private static void m13725a(int i, Object obj, aer aer) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 5) {
            switch (i3) {
                case 0:
                    aer.mo13888a(i2, ((Long) obj).longValue());
                    return;
                case 1:
                    aer.mo13909d(i2, ((Long) obj).longValue());
                    return;
                case 2:
                    aer.mo13890a(i2, (C4386zw) obj);
                    return;
                case 3:
                    if (aer.mo13883a() == C3640e.f10427j) {
                        aer.mo13884a(i2);
                        ((ady) obj).mo14176b(aer);
                        aer.mo13898b(i2);
                        return;
                    }
                    aer.mo13898b(i2);
                    ((ady) obj).mo14176b(aer);
                    aer.mo13884a(i2);
                    return;
                default:
                    throw new RuntimeException(abk.m13337f());
            }
        } else {
            aer.mo13908d(i2, ((Integer) obj).intValue());
        }
    }

    /* renamed from: b */
    static ady m13726b() {
        return new ady();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14173a(int i, Object obj) {
        if (!this.f10595f) {
            throw new UnsupportedOperationException();
        }
        if (this.f10591b == this.f10592c.length) {
            int i2 = this.f10591b + (this.f10591b < 4 ? 8 : this.f10591b >> 1);
            this.f10592c = Arrays.copyOf(this.f10592c, i2);
            this.f10593d = Arrays.copyOf(this.f10593d, i2);
        }
        this.f10592c[this.f10591b] = i;
        this.f10593d[this.f10591b] = obj;
        this.f10591b++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14174a(aer aer) throws IOException {
        if (aer.mo13883a() == C3640e.f10428k) {
            for (int i = this.f10591b - 1; i >= 0; i--) {
                aer.mo13891a(this.f10592c[i] >>> 3, this.f10593d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f10591b; i2++) {
            aer.mo13891a(this.f10592c[i2] >>> 3, this.f10593d[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14175a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f10591b; i2++) {
            aco.m13439a(sb, i, String.valueOf(this.f10592c[i2] >>> 3), this.f10593d[i2]);
        }
    }

    /* renamed from: b */
    public final void mo14176b(aer aer) throws IOException {
        if (this.f10591b != 0) {
            if (aer.mo13883a() == C3640e.f10427j) {
                for (int i = 0; i < this.f10591b; i++) {
                    m13725a(this.f10592c[i], this.f10593d[i], aer);
                }
                return;
            }
            for (int i2 = this.f10591b - 1; i2 >= 0; i2--) {
                m13725a(this.f10592c[i2], this.f10593d[i2], aer);
            }
        }
    }

    /* renamed from: c */
    public final void mo14177c() {
        this.f10595f = false;
    }

    /* renamed from: d */
    public final int mo14178d() {
        int i = this.f10594e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f10591b; i3++) {
            i2 += aak.m13075d(this.f10592c[i3] >>> 3, (C4386zw) this.f10593d[i3]);
        }
        this.f10594e = i2;
        return i2;
    }

    /* renamed from: e */
    public final int mo14179e() {
        int i;
        int i2 = this.f10594e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f10591b; i4++) {
            int i5 = this.f10592c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 5) {
                switch (i7) {
                    case 0:
                        i = aak.m13078e(i6, ((Long) this.f10593d[i4]).longValue());
                        break;
                    case 1:
                        i = aak.m13086g(i6, ((Long) this.f10593d[i4]).longValue());
                        break;
                    case 2:
                        i = aak.m13071c(i6, (C4386zw) this.f10593d[i4]);
                        break;
                    case 3:
                        i = (aak.m13077e(i6) << 1) + ((ady) this.f10593d[i4]).mo14179e();
                        break;
                    default:
                        throw new IllegalStateException(abk.m13337f());
                }
            } else {
                i = aak.m13093i(i6, ((Integer) this.f10593d[i4]).intValue());
            }
            i3 += i;
        }
        this.f10594e = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ady)) {
            return false;
        }
        ady ady = (ady) obj;
        if (this.f10591b == ady.f10591b) {
            int[] iArr = this.f10592c;
            int[] iArr2 = ady.f10592c;
            int i = this.f10591b;
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
                Object[] objArr = this.f10593d;
                Object[] objArr2 = ady.f10593d;
                int i3 = this.f10591b;
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
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.f10591b) * 31;
        int[] iArr = this.f10592c;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < this.f10591b; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i + i3) * 31;
        Object[] objArr = this.f10593d;
        for (int i6 = 0; i6 < this.f10591b; i6++) {
            i2 = (i2 * 31) + objArr[i6].hashCode();
        }
        return i5 + i2;
    }
}

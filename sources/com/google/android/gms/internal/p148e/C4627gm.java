package com.google.android.gms.internal.p148e;

/* renamed from: com.google.android.gms.internal.e.gm */
public final class C4627gm implements Cloneable {

    /* renamed from: a */
    private static final C4628gn f15066a = new C4628gn();

    /* renamed from: b */
    private boolean f15067b;

    /* renamed from: c */
    private int[] f15068c;

    /* renamed from: d */
    private C4628gn[] f15069d;

    /* renamed from: e */
    private int f15070e;

    C4627gm() {
        this(10);
    }

    private C4627gm(int i) {
        this.f15067b = false;
        int c = m20080c(i);
        this.f15068c = new int[c];
        this.f15069d = new C4628gn[c];
        this.f15070e = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4628gn mo16853a(int i) {
        int d = m20081d(i);
        if (d < 0 || this.f15069d[d] == f15066a) {
            return null;
        }
        return this.f15069d[d];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16854a(int i, C4628gn gnVar) {
        int d = m20081d(i);
        if (d >= 0) {
            this.f15069d[d] = gnVar;
            return;
        }
        int i2 = d ^ -1;
        if (i2 >= this.f15070e || this.f15069d[i2] != f15066a) {
            if (this.f15070e >= this.f15068c.length) {
                int c = m20080c(this.f15070e + 1);
                int[] iArr = new int[c];
                C4628gn[] gnVarArr = new C4628gn[c];
                System.arraycopy(this.f15068c, 0, iArr, 0, this.f15068c.length);
                System.arraycopy(this.f15069d, 0, gnVarArr, 0, this.f15069d.length);
                this.f15068c = iArr;
                this.f15069d = gnVarArr;
            }
            if (this.f15070e - i2 != 0) {
                int i3 = i2 + 1;
                System.arraycopy(this.f15068c, i2, this.f15068c, i3, this.f15070e - i2);
                System.arraycopy(this.f15069d, i2, this.f15069d, i3, this.f15070e - i2);
            }
            this.f15068c[i2] = i;
            this.f15069d[i2] = gnVar;
            this.f15070e++;
            return;
        }
        this.f15068c[i2] = i;
        this.f15069d[i2] = gnVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo16852a() {
        return this.f15070e;
    }

    /* renamed from: b */
    public final boolean mo16856b() {
        return this.f15070e == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C4628gn mo16855b(int i) {
        return this.f15069d[i];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4627gm)) {
            return false;
        }
        C4627gm gmVar = (C4627gm) obj;
        if (this.f15070e != gmVar.f15070e) {
            return false;
        }
        int[] iArr = this.f15068c;
        int[] iArr2 = gmVar.f15068c;
        int i = this.f15070e;
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
            C4628gn[] gnVarArr = this.f15069d;
            C4628gn[] gnVarArr2 = gmVar.f15069d;
            int i3 = this.f15070e;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!gnVarArr[i4].equals(gnVarArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f15070e; i2++) {
            i = (((i * 31) + this.f15068c[i2]) * 31) + this.f15069d[i2].hashCode();
        }
        return i;
    }

    /* renamed from: c */
    private static int m20080c(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    /* renamed from: d */
    private final int m20081d(int i) {
        int i2 = this.f15070e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f15068c[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.f15070e;
        C4627gm gmVar = new C4627gm(i);
        System.arraycopy(this.f15068c, 0, gmVar.f15068c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f15069d[i2] != null) {
                gmVar.f15069d[i2] = (C4628gn) this.f15069d[i2].clone();
            }
        }
        gmVar.f15070e = i;
        return gmVar;
    }
}

package com.google.android.gms.internal.ads;

public final class aey implements Cloneable {

    /* renamed from: a */
    private static final aez f10678a = new aez();

    /* renamed from: b */
    private boolean f10679b;

    /* renamed from: c */
    private int[] f10680c;

    /* renamed from: d */
    private aez[] f10681d;

    /* renamed from: e */
    private int f10682e;

    aey() {
        this(10);
    }

    private aey(int i) {
        this.f10679b = false;
        int c = m13959c(i);
        this.f10680c = new int[c];
        this.f10681d = new aez[c];
        this.f10682e = 0;
    }

    /* renamed from: c */
    private static int m13959c(int i) {
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
    private final int m13960d(int i) {
        int i2 = this.f10682e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f10680c[i4];
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

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo14251a() {
        return this.f10682e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final aez mo14252a(int i) {
        int d = m13960d(i);
        if (d < 0 || this.f10681d[d] == f10678a) {
            return null;
        }
        return this.f10681d[d];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14253a(int i, aez aez) {
        int d = m13960d(i);
        if (d >= 0) {
            this.f10681d[d] = aez;
            return;
        }
        int i2 = d ^ -1;
        if (i2 >= this.f10682e || this.f10681d[i2] != f10678a) {
            if (this.f10682e >= this.f10680c.length) {
                int c = m13959c(this.f10682e + 1);
                int[] iArr = new int[c];
                aez[] aezArr = new aez[c];
                System.arraycopy(this.f10680c, 0, iArr, 0, this.f10680c.length);
                System.arraycopy(this.f10681d, 0, aezArr, 0, this.f10681d.length);
                this.f10680c = iArr;
                this.f10681d = aezArr;
            }
            if (this.f10682e - i2 != 0) {
                int i3 = i2 + 1;
                System.arraycopy(this.f10680c, i2, this.f10680c, i3, this.f10682e - i2);
                System.arraycopy(this.f10681d, i2, this.f10681d, i3, this.f10682e - i2);
            }
            this.f10680c[i2] = i;
            this.f10681d[i2] = aez;
            this.f10682e++;
            return;
        }
        this.f10680c[i2] = i;
        this.f10681d[i2] = aez;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final aez mo14254b(int i) {
        return this.f10681d[i];
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.f10682e;
        aey aey = new aey(i);
        System.arraycopy(this.f10680c, 0, aey.f10680c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f10681d[i2] != null) {
                aey.f10681d[i2] = (aez) this.f10681d[i2].clone();
            }
        }
        aey.f10682e = i;
        return aey;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aey)) {
            return false;
        }
        aey aey = (aey) obj;
        if (this.f10682e != aey.f10682e) {
            return false;
        }
        int[] iArr = this.f10680c;
        int[] iArr2 = aey.f10680c;
        int i = this.f10682e;
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
            aez[] aezArr = this.f10681d;
            aez[] aezArr2 = aey.f10681d;
            int i3 = this.f10682e;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!aezArr[i4].equals(aezArr2[i4])) {
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
        for (int i2 = 0; i2 < this.f10682e; i2++) {
            i = (((i * 31) + this.f10680c[i2]) * 31) + this.f10681d[i2].hashCode();
        }
        return i;
    }
}

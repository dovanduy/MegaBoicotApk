package com.google.android.gms.internal.p148e;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.e.cd */
final class C4495cd extends C4465bf<Double> implements C4525da<Double>, C4566eo, RandomAccess {

    /* renamed from: a */
    private static final C4495cd f14749a;

    /* renamed from: b */
    private double[] f14750b;

    /* renamed from: c */
    private int f14751c;

    C4495cd() {
        this(new double[10], 0);
    }

    private C4495cd(double[] dArr, int i) {
        this.f14750b = dArr;
        this.f14751c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo16373c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.f14750b, i2, this.f14750b, i, this.f14751c - i2);
        this.f14751c -= i2 - i;
        this.modCount++;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4495cd)) {
            return super.equals(obj);
        }
        C4495cd cdVar = (C4495cd) obj;
        if (this.f14751c != cdVar.f14751c) {
            return false;
        }
        double[] dArr = cdVar.f14750b;
        for (int i = 0; i < this.f14751c; i++) {
            if (Double.doubleToLongBits(this.f14750b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14751c; i2++) {
            i = (i * 31) + C4520cw.m19444a(Double.doubleToLongBits(this.f14750b[i2]));
        }
        return i;
    }

    public final int size() {
        return this.f14751c;
    }

    /* renamed from: a */
    public final void mo16561a(double d) {
        m19330a(this.f14751c, d);
    }

    /* renamed from: a */
    private final void m19330a(int i, double d) {
        mo16373c();
        if (i < 0 || i > this.f14751c) {
            throw new IndexOutOfBoundsException(m19332c(i));
        }
        if (this.f14751c < this.f14750b.length) {
            System.arraycopy(this.f14750b, i, this.f14750b, i + 1, this.f14751c - i);
        } else {
            double[] dArr = new double[(((this.f14751c * 3) / 2) + 1)];
            System.arraycopy(this.f14750b, 0, dArr, 0, i);
            System.arraycopy(this.f14750b, i, dArr, i + 1, this.f14751c - i);
            this.f14750b = dArr;
        }
        this.f14750b[i] = d;
        this.f14751c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo16373c();
        C4520cw.m19446a(collection);
        if (!(collection instanceof C4495cd)) {
            return super.addAll(collection);
        }
        C4495cd cdVar = (C4495cd) collection;
        if (cdVar.f14751c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f14751c < cdVar.f14751c) {
            throw new OutOfMemoryError();
        }
        int i = this.f14751c + cdVar.f14751c;
        if (i > this.f14750b.length) {
            this.f14750b = Arrays.copyOf(this.f14750b, i);
        }
        System.arraycopy(cdVar.f14750b, 0, this.f14750b, this.f14751c, cdVar.f14751c);
        this.f14751c = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        mo16373c();
        for (int i = 0; i < this.f14751c; i++) {
            if (obj.equals(Double.valueOf(this.f14750b[i]))) {
                System.arraycopy(this.f14750b, i + 1, this.f14750b, i, (this.f14751c - i) - 1);
                this.f14751c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m19331b(int i) {
        if (i < 0 || i >= this.f14751c) {
            throw new IndexOutOfBoundsException(m19332c(i));
        }
    }

    /* renamed from: c */
    private final String m19332c(int i) {
        int i2 = this.f14751c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo16373c();
        m19331b(i);
        double d = this.f14750b[i];
        this.f14750b[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ Object remove(int i) {
        mo16373c();
        m19331b(i);
        double d = this.f14750b[i];
        if (i < this.f14751c - 1) {
            System.arraycopy(this.f14750b, i + 1, this.f14750b, i, (this.f14751c - i) - 1);
        }
        this.f14751c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m19330a(i, ((Double) obj).doubleValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C4525da mo16382a(int i) {
        if (i >= this.f14751c) {
            return new C4495cd(Arrays.copyOf(this.f14750b, i), this.f14751c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m19331b(i);
        return Double.valueOf(this.f14750b[i]);
    }

    static {
        C4495cd cdVar = new C4495cd();
        f14749a = cdVar;
        cdVar.mo16372b();
    }
}

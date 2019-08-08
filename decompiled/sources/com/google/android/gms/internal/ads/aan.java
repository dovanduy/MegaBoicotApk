package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class aan extends C4380zq<Double> implements abj<Double>, RandomAccess {

    /* renamed from: a */
    private static final aan f10303a;

    /* renamed from: b */
    private double[] f10304b;

    /* renamed from: c */
    private int f10305c;

    static {
        aan aan = new aan();
        f10303a = aan;
        aan.mo14007b();
    }

    aan() {
        this(new double[10], 0);
    }

    private aan(double[] dArr, int i) {
        this.f10304b = dArr;
        this.f10305c = i;
    }

    /* renamed from: a */
    private final void m13203a(int i, double d) {
        mo16229c();
        if (i < 0 || i > this.f10305c) {
            throw new IndexOutOfBoundsException(m13205c(i));
        }
        if (this.f10305c < this.f10304b.length) {
            System.arraycopy(this.f10304b, i, this.f10304b, i + 1, this.f10305c - i);
        } else {
            double[] dArr = new double[(((this.f10305c * 3) / 2) + 1)];
            System.arraycopy(this.f10304b, 0, dArr, 0, i);
            System.arraycopy(this.f10304b, i, dArr, i + 1, this.f10305c - i);
            this.f10304b = dArr;
        }
        this.f10304b[i] = d;
        this.f10305c++;
        this.modCount++;
    }

    /* renamed from: b */
    private final void m13204b(int i) {
        if (i < 0 || i >= this.f10305c) {
            throw new IndexOutOfBoundsException(m13205c(i));
        }
    }

    /* renamed from: c */
    private final String m13205c(int i) {
        int i2 = this.f10305c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ abj mo13924a(int i) {
        if (i >= this.f10305c) {
            return new aan(Arrays.copyOf(this.f10304b, i), this.f10305c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo13925a(double d) {
        m13203a(this.f10305c, d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m13203a(i, ((Double) obj).doubleValue());
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo16229c();
        abg.m13320a(collection);
        if (!(collection instanceof aan)) {
            return super.addAll(collection);
        }
        aan aan = (aan) collection;
        if (aan.f10305c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f10305c < aan.f10305c) {
            throw new OutOfMemoryError();
        }
        int i = this.f10305c + aan.f10305c;
        if (i > this.f10304b.length) {
            this.f10304b = Arrays.copyOf(this.f10304b, i);
        }
        System.arraycopy(aan.f10304b, 0, this.f10304b, this.f10305c, aan.f10305c);
        this.f10305c = i;
        this.modCount++;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aan)) {
            return super.equals(obj);
        }
        aan aan = (aan) obj;
        if (this.f10305c != aan.f10305c) {
            return false;
        }
        double[] dArr = aan.f10304b;
        for (int i = 0; i < this.f10305c; i++) {
            if (this.f10304b[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m13204b(i);
        return Double.valueOf(this.f10304b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f10305c; i2++) {
            i = (i * 31) + abg.m13318a(Double.doubleToLongBits(this.f10304b[i2]));
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo16229c();
        m13204b(i);
        double d = this.f10304b[i];
        if (i < this.f10305c - 1) {
            System.arraycopy(this.f10304b, i + 1, this.f10304b, i, this.f10305c - i);
        }
        this.f10305c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean remove(Object obj) {
        mo16229c();
        for (int i = 0; i < this.f10305c; i++) {
            if (obj.equals(Double.valueOf(this.f10304b[i]))) {
                System.arraycopy(this.f10304b, i + 1, this.f10304b, i, this.f10305c - i);
                this.f10305c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo16229c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.f10304b, i2, this.f10304b, i, this.f10305c - i2);
        this.f10305c -= i2 - i;
        this.modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo16229c();
        m13204b(i);
        double d = this.f10304b[i];
        this.f10304b[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f10305c;
    }
}

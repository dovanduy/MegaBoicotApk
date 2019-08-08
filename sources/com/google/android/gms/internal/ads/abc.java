package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class abc extends C4380zq<Float> implements abj<Float>, RandomAccess {

    /* renamed from: a */
    private static final abc f10410a;

    /* renamed from: b */
    private float[] f10411b;

    /* renamed from: c */
    private int f10412c;

    static {
        abc abc = new abc();
        f10410a = abc;
        abc.mo14007b();
    }

    abc() {
        this(new float[10], 0);
    }

    private abc(float[] fArr, int i) {
        this.f10411b = fArr;
        this.f10412c = i;
    }

    /* renamed from: a */
    private final void m13272a(int i, float f) {
        mo16229c();
        if (i < 0 || i > this.f10412c) {
            throw new IndexOutOfBoundsException(m13274c(i));
        }
        if (this.f10412c < this.f10411b.length) {
            System.arraycopy(this.f10411b, i, this.f10411b, i + 1, this.f10412c - i);
        } else {
            float[] fArr = new float[(((this.f10412c * 3) / 2) + 1)];
            System.arraycopy(this.f10411b, 0, fArr, 0, i);
            System.arraycopy(this.f10411b, i, fArr, i + 1, this.f10412c - i);
            this.f10411b = fArr;
        }
        this.f10411b[i] = f;
        this.f10412c++;
        this.modCount++;
    }

    /* renamed from: b */
    private final void m13273b(int i) {
        if (i < 0 || i >= this.f10412c) {
            throw new IndexOutOfBoundsException(m13274c(i));
        }
    }

    /* renamed from: c */
    private final String m13274c(int i) {
        int i2 = this.f10412c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ abj mo13924a(int i) {
        if (i >= this.f10412c) {
            return new abc(Arrays.copyOf(this.f10411b, i), this.f10412c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo13973a(float f) {
        m13272a(this.f10412c, f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m13272a(i, ((Float) obj).floatValue());
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo16229c();
        abg.m13320a(collection);
        if (!(collection instanceof abc)) {
            return super.addAll(collection);
        }
        abc abc = (abc) collection;
        if (abc.f10412c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f10412c < abc.f10412c) {
            throw new OutOfMemoryError();
        }
        int i = this.f10412c + abc.f10412c;
        if (i > this.f10411b.length) {
            this.f10411b = Arrays.copyOf(this.f10411b, i);
        }
        System.arraycopy(abc.f10411b, 0, this.f10411b, this.f10412c, abc.f10412c);
        this.f10412c = i;
        this.modCount++;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abc)) {
            return super.equals(obj);
        }
        abc abc = (abc) obj;
        if (this.f10412c != abc.f10412c) {
            return false;
        }
        float[] fArr = abc.f10411b;
        for (int i = 0; i < this.f10412c; i++) {
            if (this.f10411b[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m13273b(i);
        return Float.valueOf(this.f10411b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f10412c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f10411b[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo16229c();
        m13273b(i);
        float f = this.f10411b[i];
        if (i < this.f10412c - 1) {
            System.arraycopy(this.f10411b, i + 1, this.f10411b, i, this.f10412c - i);
        }
        this.f10412c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final boolean remove(Object obj) {
        mo16229c();
        for (int i = 0; i < this.f10412c; i++) {
            if (obj.equals(Float.valueOf(this.f10411b[i]))) {
                System.arraycopy(this.f10411b, i + 1, this.f10411b, i, this.f10412c - i);
                this.f10412c--;
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
        System.arraycopy(this.f10411b, i2, this.f10411b, i, this.f10412c - i2);
        this.f10412c -= i2 - i;
        this.modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo16229c();
        m13273b(i);
        float f = this.f10411b[i];
        this.f10411b[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f10412c;
    }
}

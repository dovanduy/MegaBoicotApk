package com.google.android.gms.internal.p148e;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.e.cr */
final class C4510cr extends C4465bf<Float> implements C4525da<Float>, C4566eo, RandomAccess {

    /* renamed from: a */
    private static final C4510cr f14835a;

    /* renamed from: b */
    private float[] f14836b;

    /* renamed from: c */
    private int f14837c;

    C4510cr() {
        this(new float[10], 0);
    }

    private C4510cr(float[] fArr, int i) {
        this.f14836b = fArr;
        this.f14837c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo16373c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.f14836b, i2, this.f14836b, i, this.f14837c - i2);
        this.f14837c -= i2 - i;
        this.modCount++;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4510cr)) {
            return super.equals(obj);
        }
        C4510cr crVar = (C4510cr) obj;
        if (this.f14837c != crVar.f14837c) {
            return false;
        }
        float[] fArr = crVar.f14836b;
        for (int i = 0; i < this.f14837c; i++) {
            if (Float.floatToIntBits(this.f14836b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14837c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f14836b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f14837c;
    }

    /* renamed from: a */
    public final void mo16599a(float f) {
        m19397a(this.f14837c, f);
    }

    /* renamed from: a */
    private final void m19397a(int i, float f) {
        mo16373c();
        if (i < 0 || i > this.f14837c) {
            throw new IndexOutOfBoundsException(m19399c(i));
        }
        if (this.f14837c < this.f14836b.length) {
            System.arraycopy(this.f14836b, i, this.f14836b, i + 1, this.f14837c - i);
        } else {
            float[] fArr = new float[(((this.f14837c * 3) / 2) + 1)];
            System.arraycopy(this.f14836b, 0, fArr, 0, i);
            System.arraycopy(this.f14836b, i, fArr, i + 1, this.f14837c - i);
            this.f14836b = fArr;
        }
        this.f14836b[i] = f;
        this.f14837c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo16373c();
        C4520cw.m19446a(collection);
        if (!(collection instanceof C4510cr)) {
            return super.addAll(collection);
        }
        C4510cr crVar = (C4510cr) collection;
        if (crVar.f14837c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f14837c < crVar.f14837c) {
            throw new OutOfMemoryError();
        }
        int i = this.f14837c + crVar.f14837c;
        if (i > this.f14836b.length) {
            this.f14836b = Arrays.copyOf(this.f14836b, i);
        }
        System.arraycopy(crVar.f14836b, 0, this.f14836b, this.f14837c, crVar.f14837c);
        this.f14837c = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        mo16373c();
        for (int i = 0; i < this.f14837c; i++) {
            if (obj.equals(Float.valueOf(this.f14836b[i]))) {
                System.arraycopy(this.f14836b, i + 1, this.f14836b, i, (this.f14837c - i) - 1);
                this.f14837c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m19398b(int i) {
        if (i < 0 || i >= this.f14837c) {
            throw new IndexOutOfBoundsException(m19399c(i));
        }
    }

    /* renamed from: c */
    private final String m19399c(int i) {
        int i2 = this.f14837c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo16373c();
        m19398b(i);
        float f = this.f14836b[i];
        this.f14836b[i] = floatValue;
        return Float.valueOf(f);
    }

    public final /* synthetic */ Object remove(int i) {
        mo16373c();
        m19398b(i);
        float f = this.f14836b[i];
        if (i < this.f14837c - 1) {
            System.arraycopy(this.f14836b, i + 1, this.f14836b, i, (this.f14837c - i) - 1);
        }
        this.f14837c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m19397a(i, ((Float) obj).floatValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C4525da mo16382a(int i) {
        if (i >= this.f14837c) {
            return new C4510cr(Arrays.copyOf(this.f14836b, i), this.f14837c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m19398b(i);
        return Float.valueOf(this.f14836b[i]);
    }

    static {
        C4510cr crVar = new C4510cr();
        f14835a = crVar;
        crVar.mo16372b();
    }
}

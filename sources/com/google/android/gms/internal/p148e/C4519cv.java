package com.google.android.gms.internal.p148e;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.e.cv */
final class C4519cv extends C4465bf<Integer> implements C4525da<Integer>, C4566eo, RandomAccess {

    /* renamed from: a */
    private static final C4519cv f14859a;

    /* renamed from: b */
    private int[] f14860b;

    /* renamed from: c */
    private int f14861c;

    C4519cv() {
        this(new int[10], 0);
    }

    private C4519cv(int[] iArr, int i) {
        this.f14860b = iArr;
        this.f14861c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo16373c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.f14860b, i2, this.f14860b, i, this.f14861c - i2);
        this.f14861c -= i2 - i;
        this.modCount++;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4519cv)) {
            return super.equals(obj);
        }
        C4519cv cvVar = (C4519cv) obj;
        if (this.f14861c != cvVar.f14861c) {
            return false;
        }
        int[] iArr = cvVar.f14860b;
        for (int i = 0; i < this.f14861c; i++) {
            if (this.f14860b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14861c; i2++) {
            i = (i * 31) + this.f14860b[i2];
        }
        return i;
    }

    /* renamed from: b */
    public final int mo16624b(int i) {
        m19438d(i);
        return this.f14860b[i];
    }

    public final int size() {
        return this.f14861c;
    }

    /* renamed from: c */
    public final void mo16625c(int i) {
        m19437a(this.f14861c, i);
    }

    /* renamed from: a */
    private final void m19437a(int i, int i2) {
        mo16373c();
        if (i < 0 || i > this.f14861c) {
            throw new IndexOutOfBoundsException(m19439e(i));
        }
        if (this.f14861c < this.f14860b.length) {
            System.arraycopy(this.f14860b, i, this.f14860b, i + 1, this.f14861c - i);
        } else {
            int[] iArr = new int[(((this.f14861c * 3) / 2) + 1)];
            System.arraycopy(this.f14860b, 0, iArr, 0, i);
            System.arraycopy(this.f14860b, i, iArr, i + 1, this.f14861c - i);
            this.f14860b = iArr;
        }
        this.f14860b[i] = i2;
        this.f14861c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo16373c();
        C4520cw.m19446a(collection);
        if (!(collection instanceof C4519cv)) {
            return super.addAll(collection);
        }
        C4519cv cvVar = (C4519cv) collection;
        if (cvVar.f14861c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f14861c < cvVar.f14861c) {
            throw new OutOfMemoryError();
        }
        int i = this.f14861c + cvVar.f14861c;
        if (i > this.f14860b.length) {
            this.f14860b = Arrays.copyOf(this.f14860b, i);
        }
        System.arraycopy(cvVar.f14860b, 0, this.f14860b, this.f14861c, cvVar.f14861c);
        this.f14861c = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        mo16373c();
        for (int i = 0; i < this.f14861c; i++) {
            if (obj.equals(Integer.valueOf(this.f14860b[i]))) {
                System.arraycopy(this.f14860b, i + 1, this.f14860b, i, (this.f14861c - i) - 1);
                this.f14861c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private final void m19438d(int i) {
        if (i < 0 || i >= this.f14861c) {
            throw new IndexOutOfBoundsException(m19439e(i));
        }
    }

    /* renamed from: e */
    private final String m19439e(int i) {
        int i2 = this.f14861c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo16373c();
        m19438d(i);
        int i2 = this.f14860b[i];
        this.f14860b[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object remove(int i) {
        mo16373c();
        m19438d(i);
        int i2 = this.f14860b[i];
        if (i < this.f14861c - 1) {
            System.arraycopy(this.f14860b, i + 1, this.f14860b, i, (this.f14861c - i) - 1);
        }
        this.f14861c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m19437a(i, ((Integer) obj).intValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C4525da mo16382a(int i) {
        if (i >= this.f14861c) {
            return new C4519cv(Arrays.copyOf(this.f14860b, i), this.f14861c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo16624b(i));
    }

    static {
        C4519cv cvVar = new C4519cv();
        f14859a = cvVar;
        cvVar.mo16372b();
    }
}

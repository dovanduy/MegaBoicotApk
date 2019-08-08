package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class abf extends C4380zq<Integer> implements abj<Integer>, RandomAccess {

    /* renamed from: a */
    private static final abf f10432a;

    /* renamed from: b */
    private int[] f10433b;

    /* renamed from: c */
    private int f10434c;

    static {
        abf abf = new abf();
        f10432a = abf;
        abf.mo14007b();
    }

    abf() {
        this(new int[10], 0);
    }

    private abf(int[] iArr, int i) {
        this.f10433b = iArr;
        this.f10434c = i;
    }

    /* renamed from: a */
    private final void m13311a(int i, int i2) {
        mo16229c();
        if (i < 0 || i > this.f10434c) {
            throw new IndexOutOfBoundsException(m13313e(i));
        }
        if (this.f10434c < this.f10433b.length) {
            System.arraycopy(this.f10433b, i, this.f10433b, i + 1, this.f10434c - i);
        } else {
            int[] iArr = new int[(((this.f10434c * 3) / 2) + 1)];
            System.arraycopy(this.f10433b, 0, iArr, 0, i);
            System.arraycopy(this.f10433b, i, iArr, i + 1, this.f10434c - i);
            this.f10433b = iArr;
        }
        this.f10433b[i] = i2;
        this.f10434c++;
        this.modCount++;
    }

    /* renamed from: d */
    private final void m13312d(int i) {
        if (i < 0 || i >= this.f10434c) {
            throw new IndexOutOfBoundsException(m13313e(i));
        }
    }

    /* renamed from: e */
    private final String m13313e(int i) {
        int i2 = this.f10434c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ abj mo13924a(int i) {
        if (i >= this.f10434c) {
            return new abf(Arrays.copyOf(this.f10433b, i), this.f10434c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m13311a(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo16229c();
        abg.m13320a(collection);
        if (!(collection instanceof abf)) {
            return super.addAll(collection);
        }
        abf abf = (abf) collection;
        if (abf.f10434c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f10434c < abf.f10434c) {
            throw new OutOfMemoryError();
        }
        int i = this.f10434c + abf.f10434c;
        if (i > this.f10433b.length) {
            this.f10433b = Arrays.copyOf(this.f10433b, i);
        }
        System.arraycopy(abf.f10433b, 0, this.f10433b, this.f10434c, abf.f10434c);
        this.f10434c = i;
        this.modCount++;
        return true;
    }

    /* renamed from: b */
    public final int mo13999b(int i) {
        m13312d(i);
        return this.f10433b[i];
    }

    /* renamed from: c */
    public final void mo14000c(int i) {
        m13311a(this.f10434c, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abf)) {
            return super.equals(obj);
        }
        abf abf = (abf) obj;
        if (this.f10434c != abf.f10434c) {
            return false;
        }
        int[] iArr = abf.f10433b;
        for (int i = 0; i < this.f10434c; i++) {
            if (this.f10433b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo13999b(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f10434c; i2++) {
            i = (i * 31) + this.f10433b[i2];
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo16229c();
        m13312d(i);
        int i2 = this.f10433b[i];
        if (i < this.f10434c - 1) {
            System.arraycopy(this.f10433b, i + 1, this.f10433b, i, this.f10434c - i);
        }
        this.f10434c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        mo16229c();
        for (int i = 0; i < this.f10434c; i++) {
            if (obj.equals(Integer.valueOf(this.f10433b[i]))) {
                System.arraycopy(this.f10433b, i + 1, this.f10433b, i, this.f10434c - i);
                this.f10434c--;
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
        System.arraycopy(this.f10433b, i2, this.f10433b, i, this.f10434c - i2);
        this.f10434c -= i2 - i;
        this.modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo16229c();
        m13312d(i);
        int i2 = this.f10433b[i];
        this.f10433b[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f10434c;
    }
}

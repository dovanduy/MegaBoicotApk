package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class abz extends C4380zq<Long> implements abj<Long>, RandomAccess {

    /* renamed from: a */
    private static final abz f10472a;

    /* renamed from: b */
    private long[] f10473b;

    /* renamed from: c */
    private int f10474c;

    static {
        abz abz = new abz();
        f10472a = abz;
        abz.mo14007b();
    }

    abz() {
        this(new long[10], 0);
    }

    private abz(long[] jArr, int i) {
        this.f10473b = jArr;
        this.f10474c = i;
    }

    /* renamed from: a */
    private final void m13376a(int i, long j) {
        mo16229c();
        if (i < 0 || i > this.f10474c) {
            throw new IndexOutOfBoundsException(m13378d(i));
        }
        if (this.f10474c < this.f10473b.length) {
            System.arraycopy(this.f10473b, i, this.f10473b, i + 1, this.f10474c - i);
        } else {
            long[] jArr = new long[(((this.f10474c * 3) / 2) + 1)];
            System.arraycopy(this.f10473b, 0, jArr, 0, i);
            System.arraycopy(this.f10473b, i, jArr, i + 1, this.f10474c - i);
            this.f10473b = jArr;
        }
        this.f10473b[i] = j;
        this.f10474c++;
        this.modCount++;
    }

    /* renamed from: c */
    private final void m13377c(int i) {
        if (i < 0 || i >= this.f10474c) {
            throw new IndexOutOfBoundsException(m13378d(i));
        }
    }

    /* renamed from: d */
    private final String m13378d(int i) {
        int i2 = this.f10474c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ abj mo13924a(int i) {
        if (i >= this.f10474c) {
            return new abz(Arrays.copyOf(this.f10473b, i), this.f10474c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo14036a(long j) {
        m13376a(this.f10474c, j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m13376a(i, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo16229c();
        abg.m13320a(collection);
        if (!(collection instanceof abz)) {
            return super.addAll(collection);
        }
        abz abz = (abz) collection;
        if (abz.f10474c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f10474c < abz.f10474c) {
            throw new OutOfMemoryError();
        }
        int i = this.f10474c + abz.f10474c;
        if (i > this.f10473b.length) {
            this.f10473b = Arrays.copyOf(this.f10473b, i);
        }
        System.arraycopy(abz.f10473b, 0, this.f10473b, this.f10474c, abz.f10474c);
        this.f10474c = i;
        this.modCount++;
        return true;
    }

    /* renamed from: b */
    public final long mo14037b(int i) {
        m13377c(i);
        return this.f10473b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abz)) {
            return super.equals(obj);
        }
        abz abz = (abz) obj;
        if (this.f10474c != abz.f10474c) {
            return false;
        }
        long[] jArr = abz.f10473b;
        for (int i = 0; i < this.f10474c; i++) {
            if (this.f10473b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo14037b(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f10474c; i2++) {
            i = (i * 31) + abg.m13318a(this.f10473b[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo16229c();
        m13377c(i);
        long j = this.f10473b[i];
        if (i < this.f10474c - 1) {
            System.arraycopy(this.f10473b, i + 1, this.f10473b, i, this.f10474c - i);
        }
        this.f10474c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        mo16229c();
        for (int i = 0; i < this.f10474c; i++) {
            if (obj.equals(Long.valueOf(this.f10473b[i]))) {
                System.arraycopy(this.f10473b, i + 1, this.f10473b, i, this.f10474c - i);
                this.f10474c--;
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
        System.arraycopy(this.f10473b, i2, this.f10473b, i, this.f10474c - i2);
        this.f10474c -= i2 - i;
        this.modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo16229c();
        m13377c(i);
        long j = this.f10473b[i];
        this.f10473b[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f10474c;
    }
}

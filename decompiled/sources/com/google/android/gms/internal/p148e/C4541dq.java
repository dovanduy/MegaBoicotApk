package com.google.android.gms.internal.p148e;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.e.dq */
final class C4541dq extends C4465bf<Long> implements C4525da<Long>, C4566eo, RandomAccess {

    /* renamed from: a */
    private static final C4541dq f14895a;

    /* renamed from: b */
    private long[] f14896b;

    /* renamed from: c */
    private int f14897c;

    C4541dq() {
        this(new long[10], 0);
    }

    private C4541dq(long[] jArr, int i) {
        this.f14896b = jArr;
        this.f14897c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo16373c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.f14896b, i2, this.f14896b, i, this.f14897c - i2);
        this.f14897c -= i2 - i;
        this.modCount++;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4541dq)) {
            return super.equals(obj);
        }
        C4541dq dqVar = (C4541dq) obj;
        if (this.f14897c != dqVar.f14897c) {
            return false;
        }
        long[] jArr = dqVar.f14896b;
        for (int i = 0; i < this.f14897c; i++) {
            if (this.f14896b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14897c; i2++) {
            i = (i * 31) + C4520cw.m19444a(this.f14896b[i2]);
        }
        return i;
    }

    /* renamed from: b */
    public final long mo16657b(int i) {
        m19501c(i);
        return this.f14896b[i];
    }

    public final int size() {
        return this.f14897c;
    }

    /* renamed from: a */
    public final void mo16656a(long j) {
        m19500a(this.f14897c, j);
    }

    /* renamed from: a */
    private final void m19500a(int i, long j) {
        mo16373c();
        if (i < 0 || i > this.f14897c) {
            throw new IndexOutOfBoundsException(m19502d(i));
        }
        if (this.f14897c < this.f14896b.length) {
            System.arraycopy(this.f14896b, i, this.f14896b, i + 1, this.f14897c - i);
        } else {
            long[] jArr = new long[(((this.f14897c * 3) / 2) + 1)];
            System.arraycopy(this.f14896b, 0, jArr, 0, i);
            System.arraycopy(this.f14896b, i, jArr, i + 1, this.f14897c - i);
            this.f14896b = jArr;
        }
        this.f14896b[i] = j;
        this.f14897c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo16373c();
        C4520cw.m19446a(collection);
        if (!(collection instanceof C4541dq)) {
            return super.addAll(collection);
        }
        C4541dq dqVar = (C4541dq) collection;
        if (dqVar.f14897c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f14897c < dqVar.f14897c) {
            throw new OutOfMemoryError();
        }
        int i = this.f14897c + dqVar.f14897c;
        if (i > this.f14896b.length) {
            this.f14896b = Arrays.copyOf(this.f14896b, i);
        }
        System.arraycopy(dqVar.f14896b, 0, this.f14896b, this.f14897c, dqVar.f14897c);
        this.f14897c = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        mo16373c();
        for (int i = 0; i < this.f14897c; i++) {
            if (obj.equals(Long.valueOf(this.f14896b[i]))) {
                System.arraycopy(this.f14896b, i + 1, this.f14896b, i, (this.f14897c - i) - 1);
                this.f14897c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m19501c(int i) {
        if (i < 0 || i >= this.f14897c) {
            throw new IndexOutOfBoundsException(m19502d(i));
        }
    }

    /* renamed from: d */
    private final String m19502d(int i) {
        int i2 = this.f14897c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo16373c();
        m19501c(i);
        long j = this.f14896b[i];
        this.f14896b[i] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        mo16373c();
        m19501c(i);
        long j = this.f14896b[i];
        if (i < this.f14897c - 1) {
            System.arraycopy(this.f14896b, i + 1, this.f14896b, i, (this.f14897c - i) - 1);
        }
        this.f14897c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m19500a(i, ((Long) obj).longValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C4525da mo16382a(int i) {
        if (i >= this.f14897c) {
            return new C4541dq(Arrays.copyOf(this.f14896b, i), this.f14897c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo16657b(i));
    }

    static {
        C4541dq dqVar = new C4541dq();
        f14895a = dqVar;
        dqVar.mo16372b();
    }
}

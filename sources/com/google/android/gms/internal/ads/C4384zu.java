package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.zu */
final class C4384zu extends C4380zq<Boolean> implements abj<Boolean>, RandomAccess {

    /* renamed from: a */
    private static final C4384zu f14362a;

    /* renamed from: b */
    private boolean[] f14363b;

    /* renamed from: c */
    private int f14364c;

    static {
        C4384zu zuVar = new C4384zu();
        f14362a = zuVar;
        zuVar.mo14007b();
    }

    C4384zu() {
        this(new boolean[10], 0);
    }

    private C4384zu(boolean[] zArr, int i) {
        this.f14363b = zArr;
        this.f14364c = i;
    }

    /* renamed from: a */
    private final void m18755a(int i, boolean z) {
        mo16229c();
        if (i < 0 || i > this.f14364c) {
            throw new IndexOutOfBoundsException(m18757c(i));
        }
        if (this.f14364c < this.f14363b.length) {
            System.arraycopy(this.f14363b, i, this.f14363b, i + 1, this.f14364c - i);
        } else {
            boolean[] zArr = new boolean[(((this.f14364c * 3) / 2) + 1)];
            System.arraycopy(this.f14363b, 0, zArr, 0, i);
            System.arraycopy(this.f14363b, i, zArr, i + 1, this.f14364c - i);
            this.f14363b = zArr;
        }
        this.f14363b[i] = z;
        this.f14364c++;
        this.modCount++;
    }

    /* renamed from: b */
    private final void m18756b(int i) {
        if (i < 0 || i >= this.f14364c) {
            throw new IndexOutOfBoundsException(m18757c(i));
        }
    }

    /* renamed from: c */
    private final String m18757c(int i) {
        int i2 = this.f14364c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ abj mo13924a(int i) {
        if (i >= this.f14364c) {
            return new C4384zu(Arrays.copyOf(this.f14363b, i), this.f14364c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo16230a(boolean z) {
        m18755a(this.f14364c, z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m18755a(i, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo16229c();
        abg.m13320a(collection);
        if (!(collection instanceof C4384zu)) {
            return super.addAll(collection);
        }
        C4384zu zuVar = (C4384zu) collection;
        if (zuVar.f14364c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f14364c < zuVar.f14364c) {
            throw new OutOfMemoryError();
        }
        int i = this.f14364c + zuVar.f14364c;
        if (i > this.f14363b.length) {
            this.f14363b = Arrays.copyOf(this.f14363b, i);
        }
        System.arraycopy(zuVar.f14363b, 0, this.f14363b, this.f14364c, zuVar.f14364c);
        this.f14364c = i;
        this.modCount++;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4384zu)) {
            return super.equals(obj);
        }
        C4384zu zuVar = (C4384zu) obj;
        if (this.f14364c != zuVar.f14364c) {
            return false;
        }
        boolean[] zArr = zuVar.f14363b;
        for (int i = 0; i < this.f14364c; i++) {
            if (this.f14363b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m18756b(i);
        return Boolean.valueOf(this.f14363b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14364c; i2++) {
            i = (i * 31) + abg.m13319a(this.f14363b[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo16229c();
        m18756b(i);
        boolean z = this.f14363b[i];
        if (i < this.f14364c - 1) {
            System.arraycopy(this.f14363b, i + 1, this.f14363b, i, this.f14364c - i);
        }
        this.f14364c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        mo16229c();
        for (int i = 0; i < this.f14364c; i++) {
            if (obj.equals(Boolean.valueOf(this.f14363b[i]))) {
                System.arraycopy(this.f14363b, i + 1, this.f14363b, i, this.f14364c - i);
                this.f14364c--;
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
        System.arraycopy(this.f14363b, i2, this.f14363b, i, this.f14364c - i2);
        this.f14364c -= i2 - i;
        this.modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo16229c();
        m18756b(i);
        boolean z = this.f14363b[i];
        this.f14363b[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f14364c;
    }
}

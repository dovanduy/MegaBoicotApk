package com.google.android.gms.internal.p148e;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.e.bh */
final class C4467bh extends C4465bf<Boolean> implements C4525da<Boolean>, C4566eo, RandomAccess {

    /* renamed from: a */
    private static final C4467bh f14696a;

    /* renamed from: b */
    private boolean[] f14697b;

    /* renamed from: c */
    private int f14698c;

    C4467bh() {
        this(new boolean[10], 0);
    }

    private C4467bh(boolean[] zArr, int i) {
        this.f14697b = zArr;
        this.f14698c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo16373c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.f14697b, i2, this.f14697b, i, this.f14698c - i2);
        this.f14698c -= i2 - i;
        this.modCount++;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4467bh)) {
            return super.equals(obj);
        }
        C4467bh bhVar = (C4467bh) obj;
        if (this.f14698c != bhVar.f14698c) {
            return false;
        }
        boolean[] zArr = bhVar.f14697b;
        for (int i = 0; i < this.f14698c; i++) {
            if (this.f14697b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14698c; i2++) {
            i = (i * 31) + C4520cw.m19445a(this.f14697b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f14698c;
    }

    /* renamed from: a */
    public final void mo16383a(boolean z) {
        m18952a(this.f14698c, z);
    }

    /* renamed from: a */
    private final void m18952a(int i, boolean z) {
        mo16373c();
        if (i < 0 || i > this.f14698c) {
            throw new IndexOutOfBoundsException(m18954c(i));
        }
        if (this.f14698c < this.f14697b.length) {
            System.arraycopy(this.f14697b, i, this.f14697b, i + 1, this.f14698c - i);
        } else {
            boolean[] zArr = new boolean[(((this.f14698c * 3) / 2) + 1)];
            System.arraycopy(this.f14697b, 0, zArr, 0, i);
            System.arraycopy(this.f14697b, i, zArr, i + 1, this.f14698c - i);
            this.f14697b = zArr;
        }
        this.f14697b[i] = z;
        this.f14698c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo16373c();
        C4520cw.m19446a(collection);
        if (!(collection instanceof C4467bh)) {
            return super.addAll(collection);
        }
        C4467bh bhVar = (C4467bh) collection;
        if (bhVar.f14698c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.f14698c < bhVar.f14698c) {
            throw new OutOfMemoryError();
        }
        int i = this.f14698c + bhVar.f14698c;
        if (i > this.f14697b.length) {
            this.f14697b = Arrays.copyOf(this.f14697b, i);
        }
        System.arraycopy(bhVar.f14697b, 0, this.f14697b, this.f14698c, bhVar.f14698c);
        this.f14698c = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(Object obj) {
        mo16373c();
        for (int i = 0; i < this.f14698c; i++) {
            if (obj.equals(Boolean.valueOf(this.f14697b[i]))) {
                System.arraycopy(this.f14697b, i + 1, this.f14697b, i, (this.f14698c - i) - 1);
                this.f14698c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m18953b(int i) {
        if (i < 0 || i >= this.f14698c) {
            throw new IndexOutOfBoundsException(m18954c(i));
        }
    }

    /* renamed from: c */
    private final String m18954c(int i) {
        int i2 = this.f14698c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo16373c();
        m18953b(i);
        boolean z = this.f14697b[i];
        this.f14697b[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Object remove(int i) {
        mo16373c();
        m18953b(i);
        boolean z = this.f14697b[i];
        if (i < this.f14698c - 1) {
            System.arraycopy(this.f14697b, i + 1, this.f14697b, i, (this.f14698c - i) - 1);
        }
        this.f14698c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m18952a(i, ((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    public final /* synthetic */ C4525da mo16382a(int i) {
        if (i >= this.f14698c) {
            return new C4467bh(Arrays.copyOf(this.f14697b, i), this.f14698c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m18953b(i);
        return Boolean.valueOf(this.f14697b[i]);
    }

    static {
        C4467bh bhVar = new C4467bh();
        f14696a = bhVar;
        bhVar.mo16372b();
    }
}

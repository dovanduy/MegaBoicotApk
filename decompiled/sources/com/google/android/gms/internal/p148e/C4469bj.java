package com.google.android.gms.internal.p148e;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.e.bj */
public abstract class C4469bj implements Serializable, Iterable<Byte> {

    /* renamed from: a */
    public static final C4469bj f14699a = new C4479bt(C4520cw.f14863b);

    /* renamed from: b */
    private static final C4475bp f14700b = (C4466bg.m18950a() ? new C4480bu(null) : new C4473bn(null));

    /* renamed from: d */
    private static final Comparator<C4469bj> f14701d = new C4471bl();

    /* renamed from: c */
    private int f14702c = 0;

    C4469bj() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m18962b(byte b) {
        return b & 255;
    }

    /* renamed from: a */
    public abstract byte mo16388a(int i);

    /* renamed from: a */
    public abstract int mo16389a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo16390a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract C4469bj mo16391a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo16392a(Charset charset);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo16393a(C4468bi biVar) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract byte mo16394b(int i);

    /* renamed from: c */
    public abstract boolean mo16396c();

    public abstract boolean equals(Object obj);

    /* renamed from: a */
    public static C4469bj m18961a(byte[] bArr, int i, int i2) {
        m18963b(i, i + i2, bArr.length);
        return new C4479bt(f14700b.mo16407a(bArr, i, i2));
    }

    /* renamed from: a */
    static C4469bj m18960a(byte[] bArr) {
        return new C4479bt(bArr);
    }

    /* renamed from: a */
    public static C4469bj m18959a(String str) {
        return new C4479bt(str.getBytes(C4520cw.f14862a));
    }

    /* renamed from: b */
    public final String mo16395b() {
        return mo16389a() == 0 ? "" : mo16392a(C4520cw.f14862a);
    }

    public final int hashCode() {
        int i = this.f14702c;
        if (i == 0) {
            int a = mo16389a();
            i = mo16390a(a, 0, a);
            if (i == 0) {
                i = 1;
            }
            this.f14702c = i;
        }
        return i;
    }

    /* renamed from: c */
    static C4477br m18964c(int i) {
        return new C4477br(i, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo16397d() {
        return this.f14702c;
    }

    /* renamed from: b */
    static int m18963b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo16389a())});
    }

    public /* synthetic */ Iterator iterator() {
        return new C4470bk(this);
    }
}

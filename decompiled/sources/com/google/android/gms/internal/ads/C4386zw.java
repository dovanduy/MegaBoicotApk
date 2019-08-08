package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.zw */
public abstract class C4386zw implements Serializable, Iterable<Byte> {

    /* renamed from: a */
    public static final C4386zw f14365a = new aad(abg.f10436b);

    /* renamed from: b */
    private static final aaa f14366b = (C4381zr.m18739a() ? new aae(null) : new C4388zy(null));

    /* renamed from: c */
    private int f14367c = 0;

    C4386zw() {
    }

    /* renamed from: a */
    public static C4386zw m18761a(String str) {
        return new aad(str.getBytes(abg.f10435a));
    }

    /* renamed from: a */
    public static C4386zw m18762a(byte[] bArr) {
        return m18763a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C4386zw m18763a(byte[] bArr, int i, int i2) {
        return new aad(f14366b.mo13764a(bArr, i, i2));
    }

    /* renamed from: b */
    static int m18764b(int i, int i2, int i3) {
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

    /* renamed from: b */
    static aab m18765b(int i) {
        return new aab(i, null);
    }

    /* renamed from: b */
    static C4386zw m18766b(byte[] bArr) {
        return new aad(bArr);
    }

    /* renamed from: a */
    public abstract byte mo13768a(int i);

    /* renamed from: a */
    public abstract int mo13769a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo13770a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract C4386zw mo13771a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo13772a(Charset charset);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo13773a(C4385zv zvVar) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13774a(byte[] bArr, int i, int i2, int i3);

    /* renamed from: b */
    public final byte[] mo16234b() {
        int a = mo13769a();
        if (a == 0) {
            return abg.f10436b;
        }
        byte[] bArr = new byte[a];
        mo13774a(bArr, 0, 0, a);
        return bArr;
    }

    /* renamed from: c */
    public final String mo16235c() {
        return mo13769a() == 0 ? "" : mo13772a(abg.f10435a);
    }

    /* renamed from: d */
    public abstract boolean mo13775d();

    /* renamed from: e */
    public abstract aaf mo13776e();

    public abstract boolean equals(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo16236f() {
        return this.f14367c;
    }

    public final int hashCode() {
        int i = this.f14367c;
        if (i == 0) {
            int a = mo13769a();
            i = mo13770a(a, 0, a);
            if (i == 0) {
                i = 1;
            }
            this.f14367c = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new C4387zx(this);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo13769a())});
    }
}

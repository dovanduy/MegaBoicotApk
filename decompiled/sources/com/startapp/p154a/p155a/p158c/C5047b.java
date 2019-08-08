package com.startapp.p154a.p155a.p158c;

import java.util.Arrays;

/* renamed from: com.startapp.a.a.c.b */
/* compiled from: StartAppSDK */
public abstract class C5047b {

    /* renamed from: a */
    private final int f16347a;

    /* renamed from: b */
    protected final byte f16348b = 61;

    /* renamed from: c */
    protected final int f16349c;

    /* renamed from: d */
    private final int f16350d;

    /* renamed from: e */
    private final int f16351e;

    /* renamed from: com.startapp.a.a.c.b$a */
    /* compiled from: StartAppSDK */
    static class C5048a {

        /* renamed from: a */
        int f16352a;

        /* renamed from: b */
        long f16353b;

        /* renamed from: c */
        byte[] f16354c;

        /* renamed from: d */
        int f16355d;

        /* renamed from: e */
        int f16356e;

        /* renamed from: f */
        boolean f16357f;

        /* renamed from: g */
        int f16358g;

        /* renamed from: h */
        int f16359h;

        C5048a() {
        }

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", new Object[]{getClass().getSimpleName(), Arrays.toString(this.f16354c), Integer.valueOf(this.f16358g), Boolean.valueOf(this.f16357f), Integer.valueOf(this.f16352a), Long.valueOf(this.f16353b), Integer.valueOf(this.f16359h), Integer.valueOf(this.f16355d), Integer.valueOf(this.f16356e)});
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo18646a() {
        return 8192;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo18644a(byte[] bArr, int i, int i2, C5048a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo18645a(byte b);

    protected C5047b(int i, int i2, int i3, int i4) {
        this.f16347a = i;
        this.f16350d = i2;
        int i5 = 0;
        if (i3 > 0 && i4 > 0) {
            i5 = (i3 / i2) * i2;
        }
        this.f16349c = i5;
        this.f16351e = i4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo18647a(C5048a aVar) {
        if (aVar.f16354c != null) {
            return aVar.f16355d - aVar.f16356e;
        }
        return 0;
    }

    /* renamed from: b */
    private byte[] m21813b(C5048a aVar) {
        if (aVar.f16354c == null) {
            aVar.f16354c = new byte[mo18646a()];
            aVar.f16355d = 0;
            aVar.f16356e = 0;
        } else {
            byte[] bArr = new byte[(aVar.f16354c.length * 2)];
            System.arraycopy(aVar.f16354c, 0, bArr, 0, aVar.f16354c.length);
            aVar.f16354c = bArr;
        }
        return aVar.f16354c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] mo18648a(int i, C5048a aVar) {
        if (aVar.f16354c == null || aVar.f16354c.length < aVar.f16355d + i) {
            return m21813b(aVar);
        }
        return aVar.f16354c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo18649b(byte[] bArr, int i, int i2, C5048a aVar) {
        if (aVar.f16354c != null) {
            int min = Math.min(mo18647a(aVar), i2);
            System.arraycopy(aVar.f16354c, aVar.f16356e, bArr, i, min);
            aVar.f16356e += min;
            if (aVar.f16356e >= aVar.f16355d) {
                aVar.f16354c = null;
            }
            return min;
        }
        return aVar.f16357f ? -1 : 0;
    }

    /* renamed from: b */
    public byte[] mo18650b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        C5048a aVar = new C5048a();
        mo18644a(bArr, 0, bArr.length, aVar);
        mo18644a(bArr, 0, -1, aVar);
        byte[] bArr2 = new byte[(aVar.f16355d - aVar.f16356e)];
        mo18649b(bArr2, 0, bArr2.length, aVar);
        return bArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo18651c(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (61 == b || mo18645a(b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public long mo18652d(byte[] bArr) {
        long length = ((long) (((bArr.length + this.f16347a) - 1) / this.f16347a)) * ((long) this.f16350d);
        return this.f16349c > 0 ? length + ((((length + ((long) this.f16349c)) - 1) / ((long) this.f16349c)) * ((long) this.f16351e)) : length;
    }
}

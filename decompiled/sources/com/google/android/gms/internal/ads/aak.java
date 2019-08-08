package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class aak extends C4385zv {

    /* renamed from: b */
    private static final Logger f10295b = Logger.getLogger(aak.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f10296c = aed.m13771a();

    /* renamed from: a */
    aam f10297a = this;

    /* renamed from: com.google.android.gms.internal.ads.aak$a */
    static class C3633a extends aak {

        /* renamed from: b */
        private final byte[] f10298b;

        /* renamed from: c */
        private final int f10299c;

        /* renamed from: d */
        private final int f10300d;

        /* renamed from: e */
        private int f10301e;

        C3633a(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i2 + 0;
            if ((0 | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(0), Integer.valueOf(i2)}));
            }
            this.f10298b = bArr;
            this.f10299c = 0;
            this.f10301e = 0;
            this.f10300d = i3;
        }

        /* renamed from: a */
        public final int mo13847a() {
            return this.f10300d - this.f10301e;
        }

        /* renamed from: a */
        public final void mo13848a(byte b) throws IOException {
            try {
                byte[] bArr = this.f10298b;
                int i = this.f10301e;
                this.f10301e = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C3634b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10301e), Integer.valueOf(this.f10300d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo13851a(int i) throws IOException {
            if (i >= 0) {
                mo13868b(i);
            } else {
                mo13861a((long) i);
            }
        }

        /* renamed from: a */
        public final void mo13854a(int i, int i2) throws IOException {
            mo13868b((i << 3) | i2);
        }

        /* renamed from: a */
        public final void mo13855a(int i, long j) throws IOException {
            mo13854a(i, 0);
            mo13861a(j);
        }

        /* renamed from: a */
        public final void mo13856a(int i, acl acl) throws IOException {
            mo13854a(1, 3);
            mo13875c(2, i);
            mo13854a(3, 2);
            mo13862a(acl);
            mo13854a(1, 4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo13857a(int i, acl acl, ade ade) throws IOException {
            mo13854a(i, 2);
            C4375zl zlVar = (C4375zl) acl;
            int j = zlVar.mo13984j();
            if (j == -1) {
                j = ade.mo14076b(zlVar);
                zlVar.mo13980a(j);
            }
            mo13868b(j);
            ade.mo14073a(acl, (aer) this.f10297a);
        }

        /* renamed from: a */
        public final void mo13858a(int i, C4386zw zwVar) throws IOException {
            mo13854a(i, 2);
            mo13863a(zwVar);
        }

        /* renamed from: a */
        public final void mo13859a(int i, String str) throws IOException {
            mo13854a(i, 2);
            mo13864a(str);
        }

        /* renamed from: a */
        public final void mo13860a(int i, boolean z) throws IOException {
            mo13854a(i, 0);
            mo13848a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo13861a(long j) throws IOException {
            if (!aak.f10296c || mo13847a() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f10298b;
                    int i = this.f10301e;
                    this.f10301e = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f10298b;
                    int i2 = this.f10301e;
                    this.f10301e = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C3634b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10301e), Integer.valueOf(this.f10300d), Integer.valueOf(1)}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f10298b;
                    int i3 = this.f10301e;
                    this.f10301e = i3 + 1;
                    aed.m13770a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f10298b;
                int i4 = this.f10301e;
                this.f10301e = i4 + 1;
                aed.m13770a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: a */
        public final void mo13862a(acl acl) throws IOException {
            mo13868b(acl.mo13986l());
            acl.mo13981a(this);
        }

        /* renamed from: a */
        public final void mo13863a(C4386zw zwVar) throws IOException {
            mo13868b(zwVar.mo13769a());
            zwVar.mo13773a((C4385zv) this);
        }

        /* renamed from: a */
        public final void mo13864a(String str) throws IOException {
            int i = this.f10301e;
            try {
                int g = m13084g(str.length() * 3);
                int g2 = m13084g(str.length());
                if (g2 == g) {
                    this.f10301e = i + g2;
                    int a = aef.m13842a(str, this.f10298b, this.f10301e, mo13847a());
                    this.f10301e = i;
                    mo13868b((a - i) - g2);
                    this.f10301e = a;
                    return;
                }
                mo13868b(aef.m13841a((CharSequence) str));
                this.f10301e = aef.m13842a(str, this.f10298b, this.f10301e, mo13847a());
            } catch (aei e) {
                this.f10301e = i;
                mo13865a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C3634b(e2);
            }
        }

        /* renamed from: a */
        public final void mo13882a(byte[] bArr, int i, int i2) throws IOException {
            mo13873b(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo13868b(int i) throws IOException {
            if (!aak.f10296c || mo13847a() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f10298b;
                    int i2 = this.f10301e;
                    this.f10301e = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f10298b;
                    int i3 = this.f10301e;
                    this.f10301e = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C3634b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10301e), Integer.valueOf(this.f10300d), Integer.valueOf(1)}), e);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.f10298b;
                    int i4 = this.f10301e;
                    this.f10301e = i4 + 1;
                    aed.m13770a(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.f10298b;
                int i5 = this.f10301e;
                this.f10301e = i5 + 1;
                aed.m13770a(bArr4, (long) i5, (byte) i);
            }
        }

        /* renamed from: b */
        public final void mo13869b(int i, int i2) throws IOException {
            mo13854a(i, 0);
            mo13851a(i2);
        }

        /* renamed from: b */
        public final void mo13871b(int i, C4386zw zwVar) throws IOException {
            mo13854a(1, 3);
            mo13875c(2, i);
            mo13858a(3, zwVar);
            mo13854a(1, 4);
        }

        /* renamed from: b */
        public final void mo13873b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f10298b, this.f10301e, i2);
                this.f10301e += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C3634b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10301e), Integer.valueOf(this.f10300d), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: c */
        public final void mo13875c(int i, int i2) throws IOException {
            mo13854a(i, 0);
            mo13868b(i2);
        }

        /* renamed from: c */
        public final void mo13876c(int i, long j) throws IOException {
            mo13854a(i, 1);
            mo13877c(j);
        }

        /* renamed from: c */
        public final void mo13877c(long j) throws IOException {
            try {
                byte[] bArr = this.f10298b;
                int i = this.f10301e;
                this.f10301e = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f10298b;
                int i2 = this.f10301e;
                this.f10301e = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f10298b;
                int i3 = this.f10301e;
                this.f10301e = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f10298b;
                int i4 = this.f10301e;
                this.f10301e = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f10298b;
                int i5 = this.f10301e;
                this.f10301e = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f10298b;
                int i6 = this.f10301e;
                this.f10301e = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f10298b;
                int i7 = this.f10301e;
                this.f10301e = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f10298b;
                int i8 = this.f10301e;
                this.f10301e = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new C3634b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f10301e), Integer.valueOf(this.f10300d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: c */
        public final void mo13878c(byte[] bArr, int i, int i2) throws IOException {
            mo13868b(i2);
            mo13873b(bArr, 0, i2);
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [byte[]] */
        /* JADX WARNING: type inference failed for: r6v2, types: [byte, int] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r0v4, types: [byte[]] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=null, for r6v2, types: [byte, int] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo13879d(int r6) throws java.io.IOException {
            /*
                r5 = this;
                byte[] r0 = r5.f10298b     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r5.f10301e     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r5.f10301e = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte r2 = (byte) r6     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte[] r0 = r5.f10298b     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r5.f10301e     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r5.f10301e = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r6 >> 8
                byte r2 = (byte) r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte[] r0 = r5.f10298b     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r5.f10301e     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r5.f10301e = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r6 >> 16
                byte r2 = (byte) r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte[] r0 = r5.f10298b     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r5.f10301e     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r5.f10301e = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r6 = r6 >> 24
                r0[r1] = r6     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                return
            L_0x0032:
                r6 = move-exception
                com.google.android.gms.internal.ads.aak$b r0 = new com.google.android.gms.internal.ads.aak$b
                java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                int r4 = r5.f10301e
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r2[r3] = r4
                int r3 = r5.f10300d
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 1
                r2[r4] = r3
                r3 = 2
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r2[r3] = r4
                java.lang.String r1 = java.lang.String.format(r1, r2)
                r0.<init>(r1, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aak.C3633a.mo13879d(int):void");
        }

        /* renamed from: e */
        public final void mo13881e(int i, int i2) throws IOException {
            mo13854a(i, 5);
            mo13879d(i2);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.aak$b */
    public static class C3634b extends IOException {
        C3634b() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        C3634b(String str, Throwable th) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
            super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), th);
        }

        C3634b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private aak() {
    }

    /* renamed from: a */
    public static int m13052a(int i, abs abs) {
        int e = m13077e(i);
        int b = abs.mo14021b();
        return e + m13084g(b) + b;
    }

    /* renamed from: a */
    public static int m13053a(abs abs) {
        int b = abs.mo14021b();
        return m13084g(b) + b;
    }

    /* renamed from: a */
    static int m13054a(acl acl, ade ade) {
        C4375zl zlVar = (C4375zl) acl;
        int j = zlVar.mo13984j();
        if (j == -1) {
            j = ade.mo14076b(zlVar);
            zlVar.mo13980a(j);
        }
        return m13084g(j) + j;
    }

    /* renamed from: a */
    public static aak m13055a(byte[] bArr) {
        return new C3633a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m13056b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m13057b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m13058b(int i, double d) {
        return m13077e(i) + 8;
    }

    /* renamed from: b */
    public static int m13059b(int i, float f) {
        return m13077e(i) + 4;
    }

    /* renamed from: b */
    public static int m13060b(int i, abs abs) {
        return (m13077e(1) << 1) + m13085g(2, i) + m13052a(3, abs);
    }

    /* renamed from: b */
    public static int m13061b(int i, acl acl) {
        return (m13077e(1) << 1) + m13085g(2, i) + m13077e(3) + m13065b(acl);
    }

    /* renamed from: b */
    static int m13062b(int i, acl acl, ade ade) {
        return m13077e(i) + m13054a(acl, ade);
    }

    /* renamed from: b */
    public static int m13063b(int i, String str) {
        return m13077e(i) + m13067b(str);
    }

    /* renamed from: b */
    public static int m13064b(int i, boolean z) {
        return m13077e(i) + 1;
    }

    /* renamed from: b */
    public static int m13065b(acl acl) {
        int l = acl.mo13986l();
        return m13084g(l) + l;
    }

    /* renamed from: b */
    public static int m13066b(C4386zw zwVar) {
        int a = zwVar.mo13769a();
        return m13084g(a) + a;
    }

    /* renamed from: b */
    public static int m13067b(String str) {
        int i;
        try {
            i = aef.m13841a((CharSequence) str);
        } catch (aei unused) {
            i = str.getBytes(abg.f10435a).length;
        }
        return m13084g(i) + i;
    }

    /* renamed from: b */
    public static int m13068b(boolean z) {
        return 1;
    }

    /* renamed from: b */
    public static int m13069b(byte[] bArr) {
        int length = bArr.length;
        return m13084g(length) + length;
    }

    @Deprecated
    /* renamed from: c */
    static int m13070c(int i, acl acl, ade ade) {
        int e = m13077e(i) << 1;
        C4375zl zlVar = (C4375zl) acl;
        int j = zlVar.mo13984j();
        if (j == -1) {
            j = ade.mo14076b(zlVar);
            zlVar.mo13980a(j);
        }
        return e + j;
    }

    /* renamed from: c */
    public static int m13071c(int i, C4386zw zwVar) {
        int e = m13077e(i);
        int a = zwVar.mo13769a();
        return e + m13084g(a) + a;
    }

    @Deprecated
    /* renamed from: c */
    public static int m13072c(acl acl) {
        return acl.mo13986l();
    }

    /* renamed from: d */
    public static int m13074d(int i, long j) {
        return m13077e(i) + m13079e(j);
    }

    /* renamed from: d */
    public static int m13075d(int i, C4386zw zwVar) {
        return (m13077e(1) << 1) + m13085g(2, i) + m13071c(3, zwVar);
    }

    /* renamed from: d */
    public static int m13076d(long j) {
        return m13079e(j);
    }

    /* renamed from: e */
    public static int m13077e(int i) {
        return m13084g(i << 3);
    }

    /* renamed from: e */
    public static int m13078e(int i, long j) {
        return m13077e(i) + m13079e(j);
    }

    /* renamed from: e */
    public static int m13079e(long j) {
        int i;
        if ((j & -128) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((j & -34359738368L) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((j & -2097152) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    /* renamed from: f */
    public static int m13080f(int i) {
        if (i >= 0) {
            return m13084g(i);
        }
        return 10;
    }

    /* renamed from: f */
    public static int m13081f(int i, int i2) {
        return m13077e(i) + m13080f(i2);
    }

    /* renamed from: f */
    public static int m13082f(int i, long j) {
        return m13077e(i) + m13079e(m13094i(j));
    }

    /* renamed from: f */
    public static int m13083f(long j) {
        return m13079e(m13094i(j));
    }

    /* renamed from: g */
    public static int m13084g(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m13085g(int i, int i2) {
        return m13077e(i) + m13084g(i2);
    }

    /* renamed from: g */
    public static int m13086g(int i, long j) {
        return m13077e(i) + 8;
    }

    /* renamed from: g */
    public static int m13087g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m13088h(int i) {
        return m13084g(m13100m(i));
    }

    /* renamed from: h */
    public static int m13089h(int i, int i2) {
        return m13077e(i) + m13084g(m13100m(i2));
    }

    /* renamed from: h */
    public static int m13090h(int i, long j) {
        return m13077e(i) + 8;
    }

    /* renamed from: h */
    public static int m13091h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m13092i(int i) {
        return 4;
    }

    /* renamed from: i */
    public static int m13093i(int i, int i2) {
        return m13077e(i) + 4;
    }

    /* renamed from: i */
    private static long m13094i(long j) {
        return (j << 1) ^ (j >> 63);
    }

    /* renamed from: j */
    public static int m13095j(int i) {
        return 4;
    }

    /* renamed from: j */
    public static int m13096j(int i, int i2) {
        return m13077e(i) + 4;
    }

    /* renamed from: k */
    public static int m13097k(int i) {
        return m13080f(i);
    }

    /* renamed from: k */
    public static int m13098k(int i, int i2) {
        return m13077e(i) + m13080f(i2);
    }

    @Deprecated
    /* renamed from: l */
    public static int m13099l(int i) {
        return m13084g(i);
    }

    /* renamed from: m */
    private static int m13100m(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract int mo13847a();

    /* renamed from: a */
    public abstract void mo13848a(byte b) throws IOException;

    /* renamed from: a */
    public final void mo13849a(double d) throws IOException {
        mo13877c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo13850a(float f) throws IOException {
        mo13879d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public abstract void mo13851a(int i) throws IOException;

    /* renamed from: a */
    public final void mo13852a(int i, double d) throws IOException {
        mo13876c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo13853a(int i, float f) throws IOException {
        mo13881e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public abstract void mo13854a(int i, int i2) throws IOException;

    /* renamed from: a */
    public abstract void mo13855a(int i, long j) throws IOException;

    /* renamed from: a */
    public abstract void mo13856a(int i, acl acl) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo13857a(int i, acl acl, ade ade) throws IOException;

    /* renamed from: a */
    public abstract void mo13858a(int i, C4386zw zwVar) throws IOException;

    /* renamed from: a */
    public abstract void mo13859a(int i, String str) throws IOException;

    /* renamed from: a */
    public abstract void mo13860a(int i, boolean z) throws IOException;

    /* renamed from: a */
    public abstract void mo13861a(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo13862a(acl acl) throws IOException;

    /* renamed from: a */
    public abstract void mo13863a(C4386zw zwVar) throws IOException;

    /* renamed from: a */
    public abstract void mo13864a(String str) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13865a(String str, aei aei) throws IOException {
        f10295b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", aei);
        byte[] bytes = str.getBytes(abg.f10435a);
        try {
            mo13868b(bytes.length);
            mo13882a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C3634b(e);
        } catch (C3634b e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public final void mo13866a(boolean z) throws IOException {
        mo13848a(z ? (byte) 1 : 0);
    }

    /* renamed from: b */
    public final void mo13867b() {
        if (mo13847a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    public abstract void mo13868b(int i) throws IOException;

    /* renamed from: b */
    public abstract void mo13869b(int i, int i2) throws IOException;

    /* renamed from: b */
    public final void mo13870b(int i, long j) throws IOException {
        mo13855a(i, m13094i(j));
    }

    /* renamed from: b */
    public abstract void mo13871b(int i, C4386zw zwVar) throws IOException;

    /* renamed from: b */
    public final void mo13872b(long j) throws IOException {
        mo13861a(m13094i(j));
    }

    /* renamed from: b */
    public abstract void mo13873b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c */
    public final void mo13874c(int i) throws IOException {
        mo13868b(m13100m(i));
    }

    /* renamed from: c */
    public abstract void mo13875c(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo13876c(int i, long j) throws IOException;

    /* renamed from: c */
    public abstract void mo13877c(long j) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract void mo13878c(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: d */
    public abstract void mo13879d(int i) throws IOException;

    /* renamed from: d */
    public final void mo13880d(int i, int i2) throws IOException {
        mo13875c(i, m13100m(i2));
    }

    /* renamed from: e */
    public abstract void mo13881e(int i, int i2) throws IOException;
}

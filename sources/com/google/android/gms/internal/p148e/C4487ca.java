package com.google.android.gms.internal.p148e;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.e.ca */
public abstract class C4487ca extends C4468bi {

    /* renamed from: b */
    private static final Logger f14729b = Logger.getLogger(C4487ca.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f14730c = C4601fr.m19855a();

    /* renamed from: a */
    C4494cc f14731a = this;

    /* renamed from: com.google.android.gms.internal.e.ca$a */
    static class C4488a extends C4487ca {

        /* renamed from: b */
        private final byte[] f14732b;

        /* renamed from: c */
        private final int f14733c;

        /* renamed from: d */
        private final int f14734d;

        /* renamed from: e */
        private int f14735e;

        C4488a(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            this.f14732b = bArr;
            this.f14733c = i;
            this.f14735e = i;
            this.f14734d = i3;
        }

        /* renamed from: a */
        public void mo16482a() {
        }

        /* renamed from: a */
        public final void mo16489a(int i, int i2) throws IOException {
            mo16504b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo16505b(int i, int i2) throws IOException {
            mo16489a(i, 0);
            mo16486a(i2);
        }

        /* renamed from: c */
        public final void mo16512c(int i, int i2) throws IOException {
            mo16489a(i, 0);
            mo16504b(i2);
        }

        /* renamed from: e */
        public final void mo16518e(int i, int i2) throws IOException {
            mo16489a(i, 5);
            mo16516d(i2);
        }

        /* renamed from: a */
        public final void mo16490a(int i, long j) throws IOException {
            mo16489a(i, 0);
            mo16496a(j);
        }

        /* renamed from: c */
        public final void mo16513c(int i, long j) throws IOException {
            mo16489a(i, 1);
            mo16514c(j);
        }

        /* renamed from: a */
        public final void mo16495a(int i, boolean z) throws IOException {
            mo16489a(i, 0);
            mo16483a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo16494a(int i, String str) throws IOException {
            mo16489a(i, 2);
            mo16500a(str);
        }

        /* renamed from: a */
        public final void mo16491a(int i, C4469bj bjVar) throws IOException {
            mo16489a(i, 2);
            mo16497a(bjVar);
        }

        /* renamed from: a */
        public final void mo16497a(C4469bj bjVar) throws IOException {
            mo16504b(bjVar.mo16389a());
            bjVar.mo16393a((C4468bi) this);
        }

        /* renamed from: c */
        public final void mo16515c(byte[] bArr, int i, int i2) throws IOException {
            mo16504b(i2);
            mo16510b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo16492a(int i, C4554ec ecVar) throws IOException {
            mo16489a(i, 2);
            mo16498a(ecVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo16493a(int i, C4554ec ecVar, C4571et etVar) throws IOException {
            mo16489a(i, 2);
            C4461bb bbVar = (C4461bb) ecVar;
            int e = bbVar.mo16362e();
            if (e == -1) {
                e = etVar.mo16689b(bbVar);
                bbVar.mo16360a(e);
            }
            mo16504b(e);
            etVar.mo16687a(ecVar, (C4621gg) this.f14731a);
        }

        /* renamed from: b */
        public final void mo16508b(int i, C4554ec ecVar) throws IOException {
            mo16489a(1, 3);
            mo16512c(2, i);
            mo16492a(3, ecVar);
            mo16489a(1, 4);
        }

        /* renamed from: b */
        public final void mo16507b(int i, C4469bj bjVar) throws IOException {
            mo16489a(1, 3);
            mo16512c(2, i);
            mo16491a(3, bjVar);
            mo16489a(1, 4);
        }

        /* renamed from: a */
        public final void mo16498a(C4554ec ecVar) throws IOException {
            mo16504b(ecVar.mo16611h());
            ecVar.mo16607a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo16499a(C4554ec ecVar, C4571et etVar) throws IOException {
            C4461bb bbVar = (C4461bb) ecVar;
            int e = bbVar.mo16362e();
            if (e == -1) {
                e = etVar.mo16689b(bbVar);
                bbVar.mo16360a(e);
            }
            mo16504b(e);
            etVar.mo16687a(ecVar, (C4621gg) this.f14731a);
        }

        /* renamed from: a */
        public final void mo16483a(byte b) throws IOException {
            try {
                byte[] bArr = this.f14732b;
                int i = this.f14735e;
                this.f14735e = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C4490c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14735e), Integer.valueOf(this.f14734d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo16486a(int i) throws IOException {
            if (i >= 0) {
                mo16504b(i);
            } else {
                mo16496a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo16504b(int i) throws IOException {
            if (!C4487ca.f14730c || mo16503b() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f14732b;
                    int i2 = this.f14735e;
                    this.f14735e = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f14732b;
                    int i3 = this.f14735e;
                    this.f14735e = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C4490c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14735e), Integer.valueOf(this.f14734d), Integer.valueOf(1)}), e);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.f14732b;
                    int i4 = this.f14735e;
                    this.f14735e = i4 + 1;
                    C4601fr.m19853a(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.f14732b;
                int i5 = this.f14735e;
                this.f14735e = i5 + 1;
                C4601fr.m19853a(bArr4, (long) i5, (byte) i);
            }
        }

        /* renamed from: d */
        public final void mo16516d(int i) throws IOException {
            try {
                byte[] bArr = this.f14732b;
                int i2 = this.f14735e;
                this.f14735e = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f14732b;
                int i3 = this.f14735e;
                this.f14735e = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f14732b;
                int i4 = this.f14735e;
                this.f14735e = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f14732b;
                int i5 = this.f14735e;
                this.f14735e = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new C4490c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14735e), Integer.valueOf(this.f14734d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo16496a(long j) throws IOException {
            if (!C4487ca.f14730c || mo16503b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f14732b;
                    int i = this.f14735e;
                    this.f14735e = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f14732b;
                    int i2 = this.f14735e;
                    this.f14735e = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C4490c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14735e), Integer.valueOf(this.f14734d), Integer.valueOf(1)}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f14732b;
                    int i3 = this.f14735e;
                    this.f14735e = i3 + 1;
                    C4601fr.m19853a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f14732b;
                int i4 = this.f14735e;
                this.f14735e = i4 + 1;
                C4601fr.m19853a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: c */
        public final void mo16514c(long j) throws IOException {
            try {
                byte[] bArr = this.f14732b;
                int i = this.f14735e;
                this.f14735e = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f14732b;
                int i2 = this.f14735e;
                this.f14735e = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f14732b;
                int i3 = this.f14735e;
                this.f14735e = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f14732b;
                int i4 = this.f14735e;
                this.f14735e = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f14732b;
                int i5 = this.f14735e;
                this.f14735e = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f14732b;
                int i6 = this.f14735e;
                this.f14735e = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f14732b;
                int i7 = this.f14735e;
                this.f14735e = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f14732b;
                int i8 = this.f14735e;
                this.f14735e = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new C4490c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14735e), Integer.valueOf(this.f14734d), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: b */
        public final void mo16510b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f14732b, this.f14735e, i2);
                this.f14735e += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C4490c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f14735e), Integer.valueOf(this.f14734d), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: a */
        public final void mo16387a(byte[] bArr, int i, int i2) throws IOException {
            mo16510b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo16500a(String str) throws IOException {
            int i = this.f14735e;
            try {
                int g = m19146g(str.length() * 3);
                int g2 = m19146g(str.length());
                if (g2 == g) {
                    this.f14735e = i + g2;
                    int a = C4607ft.m19934a(str, this.f14732b, this.f14735e, mo16503b());
                    this.f14735e = i;
                    mo16504b((a - i) - g2);
                    this.f14735e = a;
                    return;
                }
                mo16504b(C4607ft.m19933a((CharSequence) str));
                this.f14735e = C4607ft.m19934a(str, this.f14732b, this.f14735e, mo16503b());
            } catch (C4611fx e) {
                this.f14735e = i;
                mo16501a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C4490c((Throwable) e2);
            }
        }

        /* renamed from: b */
        public final int mo16503b() {
            return this.f14734d - this.f14735e;
        }

        /* renamed from: d */
        public final int mo16519d() {
            return this.f14735e - this.f14733c;
        }
    }

    /* renamed from: com.google.android.gms.internal.e.ca$b */
    static final class C4489b extends C4488a {

        /* renamed from: b */
        private final ByteBuffer f14736b;

        /* renamed from: c */
        private int f14737c;

        C4489b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f14736b = byteBuffer;
            this.f14737c = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo16482a() {
            this.f14736b.position(this.f14737c + mo16519d());
        }
    }

    /* renamed from: com.google.android.gms.internal.e.ca$c */
    public static class C4490c extends IOException {
        C4490c() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        C4490c(String str) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
            super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }

        C4490c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        C4490c(String str, Throwable th) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
            super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), th);
        }
    }

    /* renamed from: com.google.android.gms.internal.e.ca$d */
    static final class C4491d extends C4487ca {

        /* renamed from: b */
        private final ByteBuffer f14738b;

        /* renamed from: c */
        private final ByteBuffer f14739c;

        /* renamed from: d */
        private final int f14740d;

        C4491d(ByteBuffer byteBuffer) {
            super();
            this.f14738b = byteBuffer;
            this.f14739c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f14740d = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo16489a(int i, int i2) throws IOException {
            mo16504b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo16505b(int i, int i2) throws IOException {
            mo16489a(i, 0);
            mo16486a(i2);
        }

        /* renamed from: c */
        public final void mo16512c(int i, int i2) throws IOException {
            mo16489a(i, 0);
            mo16504b(i2);
        }

        /* renamed from: e */
        public final void mo16518e(int i, int i2) throws IOException {
            mo16489a(i, 5);
            mo16516d(i2);
        }

        /* renamed from: a */
        public final void mo16490a(int i, long j) throws IOException {
            mo16489a(i, 0);
            mo16496a(j);
        }

        /* renamed from: c */
        public final void mo16513c(int i, long j) throws IOException {
            mo16489a(i, 1);
            mo16514c(j);
        }

        /* renamed from: a */
        public final void mo16495a(int i, boolean z) throws IOException {
            mo16489a(i, 0);
            mo16483a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo16494a(int i, String str) throws IOException {
            mo16489a(i, 2);
            mo16500a(str);
        }

        /* renamed from: a */
        public final void mo16491a(int i, C4469bj bjVar) throws IOException {
            mo16489a(i, 2);
            mo16497a(bjVar);
        }

        /* renamed from: a */
        public final void mo16492a(int i, C4554ec ecVar) throws IOException {
            mo16489a(i, 2);
            mo16498a(ecVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo16493a(int i, C4554ec ecVar, C4571et etVar) throws IOException {
            mo16489a(i, 2);
            mo16499a(ecVar, etVar);
        }

        /* renamed from: b */
        public final void mo16508b(int i, C4554ec ecVar) throws IOException {
            mo16489a(1, 3);
            mo16512c(2, i);
            mo16492a(3, ecVar);
            mo16489a(1, 4);
        }

        /* renamed from: b */
        public final void mo16507b(int i, C4469bj bjVar) throws IOException {
            mo16489a(1, 3);
            mo16512c(2, i);
            mo16491a(3, bjVar);
            mo16489a(1, 4);
        }

        /* renamed from: a */
        public final void mo16498a(C4554ec ecVar) throws IOException {
            mo16504b(ecVar.mo16611h());
            ecVar.mo16607a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo16499a(C4554ec ecVar, C4571et etVar) throws IOException {
            C4461bb bbVar = (C4461bb) ecVar;
            int e = bbVar.mo16362e();
            if (e == -1) {
                e = etVar.mo16689b(bbVar);
                bbVar.mo16360a(e);
            }
            mo16504b(e);
            etVar.mo16687a(ecVar, (C4621gg) this.f14731a);
        }

        /* renamed from: a */
        public final void mo16483a(byte b) throws IOException {
            try {
                this.f14739c.put(b);
            } catch (BufferOverflowException e) {
                throw new C4490c((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo16497a(C4469bj bjVar) throws IOException {
            mo16504b(bjVar.mo16389a());
            bjVar.mo16393a((C4468bi) this);
        }

        /* renamed from: c */
        public final void mo16515c(byte[] bArr, int i, int i2) throws IOException {
            mo16504b(i2);
            mo16510b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo16486a(int i) throws IOException {
            if (i >= 0) {
                mo16504b(i);
            } else {
                mo16496a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo16504b(int i) throws IOException {
            while ((i & -128) != 0) {
                this.f14739c.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f14739c.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new C4490c((Throwable) e);
            }
        }

        /* renamed from: d */
        public final void mo16516d(int i) throws IOException {
            try {
                this.f14739c.putInt(i);
            } catch (BufferOverflowException e) {
                throw new C4490c((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo16496a(long j) throws IOException {
            while ((j & -128) != 0) {
                this.f14739c.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f14739c.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new C4490c((Throwable) e);
            }
        }

        /* renamed from: c */
        public final void mo16514c(long j) throws IOException {
            try {
                this.f14739c.putLong(j);
            } catch (BufferOverflowException e) {
                throw new C4490c((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo16510b(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f14739c.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new C4490c((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new C4490c((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo16387a(byte[] bArr, int i, int i2) throws IOException {
            mo16510b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo16500a(String str) throws IOException {
            int position = this.f14739c.position();
            try {
                int g = m19146g(str.length() * 3);
                int g2 = m19146g(str.length());
                if (g2 == g) {
                    int position2 = this.f14739c.position() + g2;
                    this.f14739c.position(position2);
                    m19230c(str);
                    int position3 = this.f14739c.position();
                    this.f14739c.position(position);
                    mo16504b(position3 - position2);
                    this.f14739c.position(position3);
                    return;
                }
                mo16504b(C4607ft.m19933a((CharSequence) str));
                m19230c(str);
            } catch (C4611fx e) {
                this.f14739c.position(position);
                mo16501a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new C4490c((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo16482a() {
            this.f14738b.position(this.f14739c.position());
        }

        /* renamed from: b */
        public final int mo16503b() {
            return this.f14739c.remaining();
        }

        /* renamed from: c */
        private final void m19230c(String str) throws IOException {
            try {
                C4607ft.m19935a((CharSequence) str, this.f14739c);
            } catch (IndexOutOfBoundsException e) {
                throw new C4490c((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.e.ca$e */
    static final class C4492e extends C4487ca {

        /* renamed from: b */
        private final ByteBuffer f14741b;

        /* renamed from: c */
        private final ByteBuffer f14742c;

        /* renamed from: d */
        private final long f14743d;

        /* renamed from: e */
        private final long f14744e;

        /* renamed from: f */
        private final long f14745f;

        /* renamed from: g */
        private final long f14746g = (this.f14745f - 10);

        /* renamed from: h */
        private long f14747h = this.f14744e;

        C4492e(ByteBuffer byteBuffer) {
            super();
            this.f14741b = byteBuffer;
            this.f14742c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f14743d = C4601fr.m19842a(byteBuffer);
            this.f14744e = this.f14743d + ((long) byteBuffer.position());
            this.f14745f = this.f14743d + ((long) byteBuffer.limit());
        }

        /* renamed from: a */
        public final void mo16489a(int i, int i2) throws IOException {
            mo16504b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo16505b(int i, int i2) throws IOException {
            mo16489a(i, 0);
            mo16486a(i2);
        }

        /* renamed from: c */
        public final void mo16512c(int i, int i2) throws IOException {
            mo16489a(i, 0);
            mo16504b(i2);
        }

        /* renamed from: e */
        public final void mo16518e(int i, int i2) throws IOException {
            mo16489a(i, 5);
            mo16516d(i2);
        }

        /* renamed from: a */
        public final void mo16490a(int i, long j) throws IOException {
            mo16489a(i, 0);
            mo16496a(j);
        }

        /* renamed from: c */
        public final void mo16513c(int i, long j) throws IOException {
            mo16489a(i, 1);
            mo16514c(j);
        }

        /* renamed from: a */
        public final void mo16495a(int i, boolean z) throws IOException {
            mo16489a(i, 0);
            mo16483a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo16494a(int i, String str) throws IOException {
            mo16489a(i, 2);
            mo16500a(str);
        }

        /* renamed from: a */
        public final void mo16491a(int i, C4469bj bjVar) throws IOException {
            mo16489a(i, 2);
            mo16497a(bjVar);
        }

        /* renamed from: a */
        public final void mo16492a(int i, C4554ec ecVar) throws IOException {
            mo16489a(i, 2);
            mo16498a(ecVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo16493a(int i, C4554ec ecVar, C4571et etVar) throws IOException {
            mo16489a(i, 2);
            mo16499a(ecVar, etVar);
        }

        /* renamed from: b */
        public final void mo16508b(int i, C4554ec ecVar) throws IOException {
            mo16489a(1, 3);
            mo16512c(2, i);
            mo16492a(3, ecVar);
            mo16489a(1, 4);
        }

        /* renamed from: b */
        public final void mo16507b(int i, C4469bj bjVar) throws IOException {
            mo16489a(1, 3);
            mo16512c(2, i);
            mo16491a(3, bjVar);
            mo16489a(1, 4);
        }

        /* renamed from: a */
        public final void mo16498a(C4554ec ecVar) throws IOException {
            mo16504b(ecVar.mo16611h());
            ecVar.mo16607a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo16499a(C4554ec ecVar, C4571et etVar) throws IOException {
            C4461bb bbVar = (C4461bb) ecVar;
            int e = bbVar.mo16362e();
            if (e == -1) {
                e = etVar.mo16689b(bbVar);
                bbVar.mo16360a(e);
            }
            mo16504b(e);
            etVar.mo16687a(ecVar, (C4621gg) this.f14731a);
        }

        /* renamed from: a */
        public final void mo16483a(byte b) throws IOException {
            if (this.f14747h >= this.f14745f) {
                throw new C4490c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f14747h), Long.valueOf(this.f14745f), Integer.valueOf(1)}));
            }
            long j = this.f14747h;
            this.f14747h = j + 1;
            C4601fr.m19845a(j, b);
        }

        /* renamed from: a */
        public final void mo16497a(C4469bj bjVar) throws IOException {
            mo16504b(bjVar.mo16389a());
            bjVar.mo16393a((C4468bi) this);
        }

        /* renamed from: c */
        public final void mo16515c(byte[] bArr, int i, int i2) throws IOException {
            mo16504b(i2);
            mo16510b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo16486a(int i) throws IOException {
            if (i >= 0) {
                mo16504b(i);
            } else {
                mo16496a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo16504b(int i) throws IOException {
            if (this.f14747h <= this.f14746g) {
                while ((i & -128) != 0) {
                    long j = this.f14747h;
                    this.f14747h = j + 1;
                    C4601fr.m19845a(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.f14747h;
                this.f14747h = j2 + 1;
                C4601fr.m19845a(j2, (byte) i);
                return;
            }
            while (this.f14747h < this.f14745f) {
                if ((i & -128) == 0) {
                    long j3 = this.f14747h;
                    this.f14747h = j3 + 1;
                    C4601fr.m19845a(j3, (byte) i);
                    return;
                }
                long j4 = this.f14747h;
                this.f14747h = j4 + 1;
                C4601fr.m19845a(j4, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            throw new C4490c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f14747h), Long.valueOf(this.f14745f), Integer.valueOf(1)}));
        }

        /* renamed from: d */
        public final void mo16516d(int i) throws IOException {
            this.f14742c.putInt((int) (this.f14747h - this.f14743d), i);
            this.f14747h += 4;
        }

        /* renamed from: a */
        public final void mo16496a(long j) throws IOException {
            if (this.f14747h <= this.f14746g) {
                while ((j & -128) != 0) {
                    long j2 = this.f14747h;
                    this.f14747h = j2 + 1;
                    C4601fr.m19845a(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.f14747h;
                this.f14747h = j3 + 1;
                C4601fr.m19845a(j3, (byte) ((int) j));
                return;
            }
            while (this.f14747h < this.f14745f) {
                if ((j & -128) == 0) {
                    long j4 = this.f14747h;
                    this.f14747h = j4 + 1;
                    C4601fr.m19845a(j4, (byte) ((int) j));
                    return;
                }
                long j5 = this.f14747h;
                this.f14747h = j5 + 1;
                C4601fr.m19845a(j5, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            throw new C4490c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f14747h), Long.valueOf(this.f14745f), Integer.valueOf(1)}));
        }

        /* renamed from: c */
        public final void mo16514c(long j) throws IOException {
            this.f14742c.putLong((int) (this.f14747h - this.f14743d), j);
            this.f14747h += 8;
        }

        /* renamed from: b */
        public final void mo16510b(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                if (this.f14745f - j >= this.f14747h) {
                    C4601fr.m19854a(bArr, (long) i, this.f14747h, j);
                    this.f14747h += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new C4490c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f14747h), Long.valueOf(this.f14745f), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public final void mo16387a(byte[] bArr, int i, int i2) throws IOException {
            mo16510b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo16500a(String str) throws IOException {
            long j = this.f14747h;
            try {
                int g = m19146g(str.length() * 3);
                int g2 = m19146g(str.length());
                if (g2 == g) {
                    int i = ((int) (this.f14747h - this.f14743d)) + g2;
                    this.f14742c.position(i);
                    C4607ft.m19935a((CharSequence) str, this.f14742c);
                    int position = this.f14742c.position() - i;
                    mo16504b(position);
                    this.f14747h += (long) position;
                    return;
                }
                int a = C4607ft.m19933a((CharSequence) str);
                mo16504b(a);
                m19259i(this.f14747h);
                C4607ft.m19935a((CharSequence) str, this.f14742c);
                this.f14747h += (long) a;
            } catch (C4611fx e) {
                this.f14747h = j;
                m19259i(this.f14747h);
                mo16501a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new C4490c((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new C4490c((Throwable) e3);
            }
        }

        /* renamed from: a */
        public final void mo16482a() {
            this.f14741b.position((int) (this.f14747h - this.f14743d));
        }

        /* renamed from: b */
        public final int mo16503b() {
            return (int) (this.f14745f - this.f14747h);
        }

        /* renamed from: i */
        private final void m19259i(long j) {
            this.f14742c.position((int) (j - this.f14743d));
        }
    }

    /* renamed from: a */
    public static C4487ca m19115a(byte[] bArr) {
        return new C4488a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m19116b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m19117b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m19128b(boolean z) {
        return 1;
    }

    /* renamed from: e */
    public static int m19141e(long j) {
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

    /* renamed from: g */
    public static int m19146g(int i) {
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
    public static int m19149g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m19153h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m19154i(int i) {
        return 4;
    }

    /* renamed from: i */
    private static long m19156i(long j) {
        return (j << 1) ^ (j >> 63);
    }

    /* renamed from: j */
    public static int m19157j(int i) {
        return 4;
    }

    /* renamed from: m */
    private static int m19162m(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract void mo16482a() throws IOException;

    /* renamed from: a */
    public abstract void mo16483a(byte b) throws IOException;

    /* renamed from: a */
    public abstract void mo16486a(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo16489a(int i, int i2) throws IOException;

    /* renamed from: a */
    public abstract void mo16490a(int i, long j) throws IOException;

    /* renamed from: a */
    public abstract void mo16491a(int i, C4469bj bjVar) throws IOException;

    /* renamed from: a */
    public abstract void mo16492a(int i, C4554ec ecVar) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo16493a(int i, C4554ec ecVar, C4571et etVar) throws IOException;

    /* renamed from: a */
    public abstract void mo16494a(int i, String str) throws IOException;

    /* renamed from: a */
    public abstract void mo16495a(int i, boolean z) throws IOException;

    /* renamed from: a */
    public abstract void mo16496a(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo16497a(C4469bj bjVar) throws IOException;

    /* renamed from: a */
    public abstract void mo16498a(C4554ec ecVar) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo16499a(C4554ec ecVar, C4571et etVar) throws IOException;

    /* renamed from: a */
    public abstract void mo16500a(String str) throws IOException;

    /* renamed from: b */
    public abstract int mo16503b();

    /* renamed from: b */
    public abstract void mo16504b(int i) throws IOException;

    /* renamed from: b */
    public abstract void mo16505b(int i, int i2) throws IOException;

    /* renamed from: b */
    public abstract void mo16507b(int i, C4469bj bjVar) throws IOException;

    /* renamed from: b */
    public abstract void mo16508b(int i, C4554ec ecVar) throws IOException;

    /* renamed from: b */
    public abstract void mo16510b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo16512c(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo16513c(int i, long j) throws IOException;

    /* renamed from: c */
    public abstract void mo16514c(long j) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract void mo16515c(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: d */
    public abstract void mo16516d(int i) throws IOException;

    /* renamed from: e */
    public abstract void mo16518e(int i, int i2) throws IOException;

    /* renamed from: a */
    public static C4487ca m19114a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C4489b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (C4601fr.m19860b()) {
            return new C4492e(byteBuffer);
        } else {
            return new C4491d(byteBuffer);
        }
    }

    private C4487ca() {
    }

    /* renamed from: d */
    public final void mo16517d(int i, int i2) throws IOException {
        mo16512c(i, m19162m(i2));
    }

    /* renamed from: b */
    public final void mo16506b(int i, long j) throws IOException {
        mo16490a(i, m19156i(j));
    }

    /* renamed from: a */
    public final void mo16488a(int i, float f) throws IOException {
        mo16518e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo16487a(int i, double d) throws IOException {
        mo16513c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: c */
    public final void mo16511c(int i) throws IOException {
        mo16504b(m19162m(i));
    }

    /* renamed from: b */
    public final void mo16509b(long j) throws IOException {
        mo16496a(m19156i(j));
    }

    /* renamed from: a */
    public final void mo16485a(float f) throws IOException {
        mo16516d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo16484a(double d) throws IOException {
        mo16514c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo16502a(boolean z) throws IOException {
        mo16483a(z ? (byte) 1 : 0);
    }

    /* renamed from: f */
    public static int m19143f(int i, int i2) {
        return m19139e(i) + m19142f(i2);
    }

    /* renamed from: g */
    public static int m19147g(int i, int i2) {
        return m19139e(i) + m19146g(i2);
    }

    /* renamed from: h */
    public static int m19151h(int i, int i2) {
        return m19139e(i) + m19146g(m19162m(i2));
    }

    /* renamed from: i */
    public static int m19155i(int i, int i2) {
        return m19139e(i) + 4;
    }

    /* renamed from: j */
    public static int m19158j(int i, int i2) {
        return m19139e(i) + 4;
    }

    /* renamed from: d */
    public static int m19135d(int i, long j) {
        return m19139e(i) + m19141e(j);
    }

    /* renamed from: e */
    public static int m19140e(int i, long j) {
        return m19139e(i) + m19141e(j);
    }

    /* renamed from: f */
    public static int m19144f(int i, long j) {
        return m19139e(i) + m19141e(m19156i(j));
    }

    /* renamed from: g */
    public static int m19148g(int i, long j) {
        return m19139e(i) + 8;
    }

    /* renamed from: h */
    public static int m19152h(int i, long j) {
        return m19139e(i) + 8;
    }

    /* renamed from: b */
    public static int m19119b(int i, float f) {
        return m19139e(i) + 4;
    }

    /* renamed from: b */
    public static int m19118b(int i, double d) {
        return m19139e(i) + 8;
    }

    /* renamed from: b */
    public static int m19123b(int i, boolean z) {
        return m19139e(i) + 1;
    }

    /* renamed from: k */
    public static int m19160k(int i, int i2) {
        return m19139e(i) + m19142f(i2);
    }

    /* renamed from: b */
    public static int m19122b(int i, String str) {
        return m19139e(i) + m19127b(str);
    }

    /* renamed from: c */
    public static int m19130c(int i, C4469bj bjVar) {
        int e = m19139e(i);
        int a = bjVar.mo16389a();
        return e + m19146g(a) + a;
    }

    /* renamed from: a */
    public static int m19112a(int i, C4534dj djVar) {
        int e = m19139e(i);
        int b = djVar.mo16645b();
        return e + m19146g(b) + b;
    }

    /* renamed from: c */
    public static int m19131c(int i, C4554ec ecVar) {
        return m19139e(i) + m19125b(ecVar);
    }

    /* renamed from: b */
    static int m19121b(int i, C4554ec ecVar, C4571et etVar) {
        return m19139e(i) + m19126b(ecVar, etVar);
    }

    /* renamed from: d */
    public static int m19137d(int i, C4554ec ecVar) {
        return (m19139e(1) << 1) + m19147g(2, i) + m19131c(3, ecVar);
    }

    /* renamed from: d */
    public static int m19136d(int i, C4469bj bjVar) {
        return (m19139e(1) << 1) + m19147g(2, i) + m19130c(3, bjVar);
    }

    /* renamed from: b */
    public static int m19120b(int i, C4534dj djVar) {
        return (m19139e(1) << 1) + m19147g(2, i) + m19112a(3, djVar);
    }

    /* renamed from: e */
    public static int m19139e(int i) {
        return m19146g(i << 3);
    }

    /* renamed from: f */
    public static int m19142f(int i) {
        if (i >= 0) {
            return m19146g(i);
        }
        return 10;
    }

    /* renamed from: h */
    public static int m19150h(int i) {
        return m19146g(m19162m(i));
    }

    /* renamed from: d */
    public static int m19138d(long j) {
        return m19141e(j);
    }

    /* renamed from: f */
    public static int m19145f(long j) {
        return m19141e(m19156i(j));
    }

    /* renamed from: k */
    public static int m19159k(int i) {
        return m19142f(i);
    }

    /* renamed from: b */
    public static int m19127b(String str) {
        int i;
        try {
            i = C4607ft.m19933a((CharSequence) str);
        } catch (C4611fx unused) {
            i = str.getBytes(C4520cw.f14862a).length;
        }
        return m19146g(i) + i;
    }

    /* renamed from: a */
    public static int m19113a(C4534dj djVar) {
        int b = djVar.mo16645b();
        return m19146g(b) + b;
    }

    /* renamed from: b */
    public static int m19124b(C4469bj bjVar) {
        int a = bjVar.mo16389a();
        return m19146g(a) + a;
    }

    /* renamed from: b */
    public static int m19129b(byte[] bArr) {
        int length = bArr.length;
        return m19146g(length) + length;
    }

    /* renamed from: b */
    public static int m19125b(C4554ec ecVar) {
        int h = ecVar.mo16611h();
        return m19146g(h) + h;
    }

    /* renamed from: b */
    static int m19126b(C4554ec ecVar, C4571et etVar) {
        C4461bb bbVar = (C4461bb) ecVar;
        int e = bbVar.mo16362e();
        if (e == -1) {
            e = etVar.mo16689b(bbVar);
            bbVar.mo16360a(e);
        }
        return m19146g(e) + e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16501a(String str, C4611fx fxVar) throws IOException {
        f14729b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", fxVar);
        byte[] bytes = str.getBytes(C4520cw.f14862a);
        try {
            mo16504b(bytes.length);
            mo16387a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C4490c((Throwable) e);
        } catch (C4490c e2) {
            throw e2;
        }
    }

    @Deprecated
    /* renamed from: c */
    static int m19132c(int i, C4554ec ecVar, C4571et etVar) {
        int e = m19139e(i) << 1;
        C4461bb bbVar = (C4461bb) ecVar;
        int e2 = bbVar.mo16362e();
        if (e2 == -1) {
            e2 = etVar.mo16689b(bbVar);
            bbVar.mo16360a(e2);
        }
        return e + e2;
    }

    @Deprecated
    /* renamed from: c */
    public static int m19133c(C4554ec ecVar) {
        return ecVar.mo16611h();
    }

    @Deprecated
    /* renamed from: l */
    public static int m19161l(int i) {
        return m19146g(i);
    }
}

package com.google.android.gms.internal.p148e;

import com.google.android.exoplayer2.extractor.p132ts.PsExtractor;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: com.google.android.gms.internal.e.gi */
public final class C4623gi {

    /* renamed from: a */
    private final ByteBuffer f15058a;

    /* renamed from: b */
    private C4487ca f15059b;

    /* renamed from: c */
    private int f15060c;

    private C4623gi(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    public static int m20043a(long j) {
        if ((j & -128) == 0) {
            return 1;
        }
        if ((j & -16384) == 0) {
            return 2;
        }
        if ((j & -2097152) == 0) {
            return 3;
        }
        if ((j & -268435456) == 0) {
            return 4;
        }
        if ((j & -34359738368L) == 0) {
            return 5;
        }
        if ((j & -4398046511104L) == 0) {
            return 6;
        }
        if ((j & -562949953421312L) == 0) {
            return 7;
        }
        if ((j & -72057594037927936L) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: d */
    public static int m20056d(int i) {
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

    private C4623gi(ByteBuffer byteBuffer) {
        this.f15058a = byteBuffer;
        this.f15058a.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public static C4623gi m20046a(byte[] bArr) {
        return m20047a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C4623gi m20047a(byte[] bArr, int i, int i2) {
        return new C4623gi(bArr, 0, i2);
    }

    /* renamed from: b */
    private final C4487ca m20053b() throws IOException {
        if (this.f15059b == null) {
            this.f15059b = C4487ca.m19114a(this.f15058a);
            this.f15060c = this.f15058a.position();
        } else if (this.f15060c != this.f15058a.position()) {
            this.f15059b.mo16510b(this.f15058a.array(), this.f15060c, this.f15058a.position() - this.f15060c);
            this.f15060c = this.f15058a.position();
        }
        return this.f15059b;
    }

    /* renamed from: a */
    public final void mo16831a(int i, double d) throws IOException {
        mo16843c(i, 1);
        long doubleToLongBits = Double.doubleToLongBits(d);
        if (this.f15058a.remaining() < 8) {
            throw new C4624gj(this.f15058a.position(), this.f15058a.limit());
        }
        this.f15058a.putLong(doubleToLongBits);
    }

    /* renamed from: a */
    public final void mo16832a(int i, float f) throws IOException {
        mo16843c(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        if (this.f15058a.remaining() < 4) {
            throw new C4624gj(this.f15058a.position(), this.f15058a.limit());
        }
        this.f15058a.putInt(floatToIntBits);
    }

    /* renamed from: a */
    public final void mo16834a(int i, long j) throws IOException {
        mo16843c(i, 0);
        m20054b(j);
    }

    /* renamed from: b */
    public final void mo16840b(int i, long j) throws IOException {
        mo16843c(i, 0);
        m20054b(j);
    }

    /* renamed from: a */
    public final void mo16833a(int i, int i2) throws IOException {
        mo16843c(i, 0);
        if (i2 >= 0) {
            mo16842c(i2);
        } else {
            m20054b((long) i2);
        }
    }

    /* renamed from: a */
    public final void mo16838a(int i, boolean z) throws IOException {
        mo16843c(i, 0);
        byte b = z ? (byte) 1 : 0;
        if (!this.f15058a.hasRemaining()) {
            throw new C4624gj(this.f15058a.position(), this.f15058a.limit());
        }
        this.f15058a.put(b);
    }

    /* renamed from: a */
    public final void mo16837a(int i, String str) throws IOException {
        mo16843c(i, 2);
        try {
            int d = m20056d(str.length());
            if (d == m20056d(str.length() * 3)) {
                int position = this.f15058a.position();
                if (this.f15058a.remaining() < d) {
                    throw new C4624gj(position + d, this.f15058a.limit());
                }
                this.f15058a.position(position + d);
                m20048a((CharSequence) str, this.f15058a);
                int position2 = this.f15058a.position();
                this.f15058a.position(position);
                mo16842c((position2 - position) - d);
                this.f15058a.position(position2);
                return;
            }
            mo16842c(m20044a((CharSequence) str));
            m20048a((CharSequence) str, this.f15058a);
        } catch (BufferOverflowException e) {
            C4624gj gjVar = new C4624gj(this.f15058a.position(), this.f15058a.limit());
            gjVar.initCause(e);
            throw gjVar;
        }
    }

    /* renamed from: a */
    public final void mo16836a(int i, C4631gq gqVar) throws IOException {
        mo16843c(i, 2);
        mo16839a(gqVar);
    }

    /* renamed from: a */
    public final void mo16835a(int i, C4554ec ecVar) throws IOException {
        C4487ca b = m20053b();
        b.mo16492a(i, ecVar);
        b.mo16482a();
        this.f15060c = this.f15058a.position();
    }

    /* renamed from: a */
    private static int m20044a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = ((long) i3) + 4294967296L;
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    private static void m20048a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        CharSequence charSequence2 = charSequence;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c = 2048;
        if (byteBuffer.hasArray()) {
            try {
                byte[] array = byteBuffer.array();
                int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                int remaining = byteBuffer.remaining();
                int length = charSequence.length();
                int i4 = remaining + arrayOffset;
                int i5 = 0;
                while (i5 < length) {
                    int i6 = i5 + arrayOffset;
                    if (i6 >= i4) {
                        break;
                    }
                    char charAt = charSequence2.charAt(i5);
                    if (charAt >= 128) {
                        break;
                    }
                    array[i6] = (byte) charAt;
                    i5++;
                }
                if (i5 == length) {
                    i = arrayOffset + length;
                } else {
                    i = arrayOffset + i5;
                    while (i5 < length) {
                        char charAt2 = charSequence2.charAt(i5);
                        if (charAt2 >= 128 || i >= i4) {
                            if (charAt2 < c && i <= i4 - 2) {
                                int i7 = i + 1;
                                array[i] = (byte) (960 | (charAt2 >>> 6));
                                i2 = i7 + 1;
                                array[i7] = (byte) ((charAt2 & '?') | 128);
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i <= i4 - 3) {
                                int i8 = i + 1;
                                array[i] = (byte) (480 | (charAt2 >>> 12));
                                int i9 = i8 + 1;
                                array[i8] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i3 = i9 + 1;
                                array[i9] = (byte) ((charAt2 & '?') | 128);
                            } else if (i <= i4 - 4) {
                                int i10 = i5 + 1;
                                if (i10 != charSequence.length()) {
                                    char charAt3 = charSequence2.charAt(i10);
                                    if (!Character.isSurrogatePair(charAt2, charAt3)) {
                                        i5 = i10;
                                    } else {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i11 = i + 1;
                                        array[i] = (byte) (240 | (codePoint >>> 18));
                                        int i12 = i11 + 1;
                                        array[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i13 = i12 + 1;
                                        array[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i2 = i13 + 1;
                                        array[i13] = (byte) ((codePoint & 63) | 128);
                                        i5 = i10;
                                    }
                                }
                                int i14 = i5 - 1;
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i14);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i = i2;
                            i5++;
                            c = 2048;
                        } else {
                            i3 = i + 1;
                            array[i] = (byte) charAt2;
                        }
                        i = i3;
                        i5++;
                        c = 2048;
                    }
                }
                byteBuffer2.position(i - byteBuffer.arrayOffset());
            } catch (ArrayIndexOutOfBoundsException e) {
                ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = e;
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(arrayIndexOutOfBoundsException);
                throw bufferOverflowException;
            }
        } else {
            int length2 = charSequence.length();
            int i15 = 0;
            while (i15 < length2) {
                char charAt4 = charSequence2.charAt(i15);
                if (charAt4 < 128) {
                    byteBuffer2.put((byte) charAt4);
                } else if (charAt4 < 2048) {
                    byteBuffer2.put((byte) ((charAt4 >>> 6) | 960));
                    byteBuffer2.put((byte) ((charAt4 & '?') | 128));
                } else if (charAt4 < 55296 || 57343 < charAt4) {
                    byteBuffer2.put((byte) ((charAt4 >>> 12) | 480));
                    byteBuffer2.put((byte) (((charAt4 >>> 6) & 63) | 128));
                    byteBuffer2.put((byte) ((charAt4 & '?') | 128));
                    i15++;
                } else {
                    int i16 = i15 + 1;
                    if (i16 != charSequence.length()) {
                        char charAt5 = charSequence2.charAt(i16);
                        if (!Character.isSurrogatePair(charAt4, charAt5)) {
                            i15 = i16;
                        } else {
                            int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                            byteBuffer2.put((byte) ((codePoint2 >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                            byteBuffer2.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                            byteBuffer2.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                            byteBuffer2.put((byte) ((codePoint2 & 63) | 128));
                            i15 = i16;
                            i15++;
                        }
                    }
                    int i17 = i15 - 1;
                    StringBuilder sb3 = new StringBuilder(39);
                    sb3.append("Unpaired surrogate at index ");
                    sb3.append(i17);
                    throw new IllegalArgumentException(sb3.toString());
                }
                i15++;
            }
        }
    }

    /* renamed from: a */
    public final void mo16839a(C4631gq gqVar) throws IOException {
        mo16842c(gqVar.mo16866d());
        gqVar.mo16327a(this);
    }

    /* renamed from: c */
    public static int m20055c(int i, long j) {
        return m20049b(i) + m20043a(j);
    }

    /* renamed from: b */
    public static int m20050b(int i, int i2) {
        return m20049b(i) + m20042a(i2);
    }

    /* renamed from: b */
    public static int m20052b(int i, String str) {
        return m20049b(i) + m20045a(str);
    }

    /* renamed from: b */
    public static int m20051b(int i, C4631gq gqVar) {
        int b = m20049b(i);
        int e = gqVar.mo16867e();
        return b + m20056d(e) + e;
    }

    /* renamed from: a */
    public static int m20042a(int i) {
        if (i >= 0) {
            return m20056d(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int m20045a(String str) {
        int a = m20044a((CharSequence) str);
        return m20056d(a) + a;
    }

    /* renamed from: a */
    public final void mo16830a() {
        if (this.f15058a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f15058a.remaining())}));
        }
    }

    /* renamed from: e */
    private final void m20057e(int i) throws IOException {
        byte b = (byte) i;
        if (!this.f15058a.hasRemaining()) {
            throw new C4624gj(this.f15058a.position(), this.f15058a.limit());
        }
        this.f15058a.put(b);
    }

    /* renamed from: b */
    public final void mo16841b(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f15058a.remaining() >= length) {
            this.f15058a.put(bArr, 0, length);
            return;
        }
        throw new C4624gj(this.f15058a.position(), this.f15058a.limit());
    }

    /* renamed from: c */
    public final void mo16843c(int i, int i2) throws IOException {
        mo16842c((i << 3) | i2);
    }

    /* renamed from: b */
    public static int m20049b(int i) {
        return m20056d(i << 3);
    }

    /* renamed from: c */
    public final void mo16842c(int i) throws IOException {
        while ((i & -128) != 0) {
            m20057e((i & 127) | 128);
            i >>>= 7;
        }
        m20057e(i);
    }

    /* renamed from: b */
    private final void m20054b(long j) throws IOException {
        while ((j & -128) != 0) {
            m20057e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m20057e((int) j);
    }
}

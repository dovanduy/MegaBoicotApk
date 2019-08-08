package org.apache.p199a.p229k;

import java.io.Serializable;

/* renamed from: org.apache.a.k.a */
/* compiled from: ByteArrayBuffer */
public final class C6548a implements Serializable {

    /* renamed from: a */
    private byte[] f21261a;

    /* renamed from: b */
    private int f21262b;

    public C6548a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Buffer capacity may not be negative");
        }
        this.f21261a = new byte[i];
    }

    /* renamed from: d */
    private void m25921d(int i) {
        byte[] bArr = new byte[Math.max(this.f21261a.length << 1, i)];
        System.arraycopy(this.f21261a, 0, bArr, 0, this.f21262b);
        this.f21261a = bArr;
    }

    /* renamed from: a */
    public void mo23028a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0 && i <= bArr.length && i2 >= 0) {
                int i3 = i + i2;
                if (i3 >= 0 && i3 <= bArr.length) {
                    if (i2 != 0) {
                        int i4 = this.f21262b + i2;
                        if (i4 > this.f21261a.length) {
                            m25921d(i4);
                        }
                        System.arraycopy(bArr, i, this.f21261a, this.f21262b, i2);
                        this.f21262b = i4;
                        return;
                    }
                    return;
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("off: ");
            stringBuffer.append(i);
            stringBuffer.append(" len: ");
            stringBuffer.append(i2);
            stringBuffer.append(" b.length: ");
            stringBuffer.append(bArr.length);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
    }

    /* renamed from: a */
    public void mo23026a(int i) {
        int i2 = this.f21262b + 1;
        if (i2 > this.f21261a.length) {
            m25921d(i2);
        }
        this.f21261a[this.f21262b] = (byte) i;
        this.f21262b = i2;
    }

    /* renamed from: a */
    public void mo23029a(char[] cArr, int i, int i2) {
        if (cArr != null) {
            if (i >= 0 && i <= cArr.length && i2 >= 0) {
                int i3 = i + i2;
                if (i3 >= 0 && i3 <= cArr.length) {
                    if (i2 != 0) {
                        int i4 = this.f21262b;
                        int i5 = i2 + i4;
                        if (i5 > this.f21261a.length) {
                            m25921d(i5);
                        }
                        while (i4 < i5) {
                            this.f21261a[i4] = (byte) cArr[i];
                            i++;
                            i4++;
                        }
                        this.f21262b = i5;
                        return;
                    }
                    return;
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("off: ");
            stringBuffer.append(i);
            stringBuffer.append(" len: ");
            stringBuffer.append(i2);
            stringBuffer.append(" b.length: ");
            stringBuffer.append(cArr.length);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
    }

    /* renamed from: a */
    public void mo23027a(C6549b bVar, int i, int i2) {
        if (bVar != null) {
            mo23029a(bVar.mo23051b(), i, i2);
        }
    }

    /* renamed from: a */
    public void mo23025a() {
        this.f21262b = 0;
    }

    /* renamed from: b */
    public byte[] mo23031b() {
        byte[] bArr = new byte[this.f21262b];
        if (this.f21262b > 0) {
            System.arraycopy(this.f21261a, 0, bArr, 0, this.f21262b);
        }
        return bArr;
    }

    /* renamed from: b */
    public int mo23030b(int i) {
        return this.f21261a[i];
    }

    /* renamed from: c */
    public int mo23032c() {
        return this.f21261a.length;
    }

    /* renamed from: d */
    public int mo23034d() {
        return this.f21262b;
    }

    /* renamed from: e */
    public byte[] mo23035e() {
        return this.f21261a;
    }

    /* renamed from: c */
    public void mo23033c(int i) {
        if (i < 0 || i > this.f21261a.length) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("len: ");
            stringBuffer.append(i);
            stringBuffer.append(" < 0 or > buffer len: ");
            stringBuffer.append(this.f21261a.length);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        this.f21262b = i;
    }

    /* renamed from: f */
    public boolean mo23036f() {
        return this.f21262b == 0;
    }

    /* renamed from: g */
    public boolean mo23037g() {
        return this.f21262b == this.f21261a.length;
    }
}

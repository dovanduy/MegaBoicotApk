package org.apache.p199a.p229k;

import java.io.Serializable;
import org.apache.p199a.p228j.C6538d;

/* renamed from: org.apache.a.k.b */
/* compiled from: CharArrayBuffer */
public final class C6549b implements Serializable {

    /* renamed from: a */
    private char[] f21263a;

    /* renamed from: b */
    private int f21264b;

    public C6549b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Buffer capacity may not be negative");
        }
        this.f21263a = new char[i];
    }

    /* renamed from: d */
    private void m25935d(int i) {
        char[] cArr = new char[Math.max(this.f21263a.length << 1, i)];
        System.arraycopy(this.f21263a, 0, cArr, 0, this.f21264b);
        this.f21263a = cArr;
    }

    /* renamed from: a */
    public void mo23048a(char[] cArr, int i, int i2) {
        if (cArr != null) {
            if (i >= 0 && i <= cArr.length && i2 >= 0) {
                int i3 = i + i2;
                if (i3 >= 0 && i3 <= cArr.length) {
                    if (i2 != 0) {
                        int i4 = this.f21264b + i2;
                        if (i4 > this.f21263a.length) {
                            m25935d(i4);
                        }
                        System.arraycopy(cArr, i, this.f21263a, this.f21264b, i2);
                        this.f21264b = i4;
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
    public void mo23044a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.f21264b + length;
        if (i > this.f21263a.length) {
            m25935d(i);
        }
        str.getChars(0, length, this.f21263a, this.f21264b);
        this.f21264b = i;
    }

    /* renamed from: a */
    public void mo23046a(C6549b bVar, int i, int i2) {
        if (bVar != null) {
            mo23048a(bVar.f21263a, i, i2);
        }
    }

    /* renamed from: a */
    public void mo23042a(char c) {
        int i = this.f21264b + 1;
        if (i > this.f21263a.length) {
            m25935d(i);
        }
        this.f21263a[this.f21264b] = c;
        this.f21264b = i;
    }

    /* renamed from: a */
    public void mo23047a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0 && i <= bArr.length && i2 >= 0) {
                int i3 = i + i2;
                if (i3 >= 0 && i3 <= bArr.length) {
                    if (i2 != 0) {
                        int i4 = this.f21264b;
                        int i5 = i2 + i4;
                        if (i5 > this.f21263a.length) {
                            m25935d(i5);
                        }
                        while (i4 < i5) {
                            this.f21263a[i4] = (char) (bArr[i] & 255);
                            i++;
                            i4++;
                        }
                        this.f21264b = i5;
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
    public void mo23045a(C6548a aVar, int i, int i2) {
        if (aVar != null) {
            mo23047a(aVar.mo23035e(), i, i2);
        }
    }

    /* renamed from: a */
    public void mo23043a(Object obj) {
        mo23044a(String.valueOf(obj));
    }

    /* renamed from: a */
    public void mo23041a() {
        this.f21264b = 0;
    }

    /* renamed from: a */
    public char mo23038a(int i) {
        return this.f21263a[i];
    }

    /* renamed from: b */
    public char[] mo23051b() {
        return this.f21263a;
    }

    /* renamed from: c */
    public int mo23052c() {
        return this.f21264b;
    }

    /* renamed from: b */
    public void mo23050b(int i) {
        if (i > 0 && i > this.f21263a.length - this.f21264b) {
            m25935d(this.f21264b + i);
        }
    }

    /* renamed from: d */
    public boolean mo23054d() {
        return this.f21264b == 0;
    }

    /* renamed from: a */
    public int mo23039a(int i, int i2, int i3) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > this.f21264b) {
            i3 = this.f21264b;
        }
        if (i2 > i3) {
            return -1;
        }
        while (i2 < i3) {
            if (this.f21263a[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: c */
    public int mo23053c(int i) {
        return mo23039a(i, 0, this.f21264b);
    }

    /* renamed from: a */
    public String mo23040a(int i, int i2) {
        return new String(this.f21263a, i, i2 - i);
    }

    /* renamed from: b */
    public String mo23049b(int i, int i2) {
        if (i < 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Negative beginIndex: ");
            stringBuffer.append(i);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        } else if (i2 > this.f21264b) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("endIndex: ");
            stringBuffer2.append(i2);
            stringBuffer2.append(" > length: ");
            stringBuffer2.append(this.f21264b);
            throw new IndexOutOfBoundsException(stringBuffer2.toString());
        } else if (i > i2) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("beginIndex: ");
            stringBuffer3.append(i);
            stringBuffer3.append(" > endIndex: ");
            stringBuffer3.append(i2);
            throw new IndexOutOfBoundsException(stringBuffer3.toString());
        } else {
            while (i < i2 && C6538d.m25905a(this.f21263a[i])) {
                i++;
            }
            while (i2 > i && C6538d.m25905a(this.f21263a[i2 - 1])) {
                i2--;
            }
            return new String(this.f21263a, i, i2 - i);
        }
    }

    public String toString() {
        return new String(this.f21263a, 0, this.f21264b);
    }
}

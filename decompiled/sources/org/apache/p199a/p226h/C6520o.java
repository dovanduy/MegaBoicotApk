package org.apache.p199a.p226h;

import java.util.NoSuchElementException;
import org.apache.p199a.C6264ad;
import org.apache.p199a.C6376f;
import org.apache.p199a.C6567x;

/* renamed from: org.apache.a.h.o */
/* compiled from: BasicTokenIterator */
public class C6520o implements C6264ad {

    /* renamed from: a */
    protected final C6376f f21241a;

    /* renamed from: b */
    protected String f21242b;

    /* renamed from: c */
    protected String f21243c;

    /* renamed from: d */
    protected int f21244d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo22973a(char c) {
        return c == ',';
    }

    public C6520o(C6376f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("Header iterator must not be null.");
        }
        this.f21241a = fVar;
        this.f21244d = mo22971a(-1);
    }

    public boolean hasNext() {
        return this.f21243c != null;
    }

    /* renamed from: a */
    public String mo22432a() throws NoSuchElementException, C6567x {
        if (this.f21243c == null) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        String str = this.f21243c;
        this.f21244d = mo22971a(this.f21244d);
        return str;
    }

    public final Object next() throws NoSuchElementException, C6567x {
        return mo22432a();
    }

    public final void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo22971a(int i) throws C6567x {
        int i2;
        if (i >= 0) {
            i2 = mo22976c(i);
        } else if (!this.f21241a.hasNext()) {
            return -1;
        } else {
            this.f21242b = this.f21241a.mo22657a().mo22466d();
            i2 = 0;
        }
        int b = mo22974b(i2);
        if (b < 0) {
            this.f21243c = null;
            return -1;
        }
        int d = mo22978d(b);
        this.f21243c = mo22972a(this.f21242b, b, d);
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo22972a(String str, int i, int i2) {
        return str.substring(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo22974b(int i) {
        if (i < 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Search position must not be negative: ");
            stringBuffer.append(i);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        int i2 = i;
        boolean z = false;
        while (!z && this.f21242b != null) {
            int length = this.f21242b.length();
            while (!z && i2 < length) {
                char charAt = this.f21242b.charAt(i2);
                if (mo22973a(charAt) || mo22975b(charAt)) {
                    i2++;
                } else if (mo22977c(this.f21242b.charAt(i2))) {
                    z = true;
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Invalid character before token (pos ");
                    stringBuffer2.append(i2);
                    stringBuffer2.append("): ");
                    stringBuffer2.append(this.f21242b);
                    throw new C6567x(stringBuffer2.toString());
                }
            }
            if (!z) {
                if (this.f21241a.hasNext()) {
                    this.f21242b = this.f21241a.mo22657a().mo22466d();
                    i2 = 0;
                } else {
                    this.f21242b = null;
                }
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo22976c(int i) {
        if (i < 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Search position must not be negative: ");
            stringBuffer.append(i);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        boolean z = false;
        int length = this.f21242b.length();
        while (!z && i < length) {
            char charAt = this.f21242b.charAt(i);
            if (mo22973a(charAt)) {
                z = true;
            } else if (mo22975b(charAt)) {
                i++;
            } else if (mo22977c(charAt)) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Tokens without separator (pos ");
                stringBuffer2.append(i);
                stringBuffer2.append("): ");
                stringBuffer2.append(this.f21242b);
                throw new C6567x(stringBuffer2.toString());
            } else {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Invalid character after token (pos ");
                stringBuffer3.append(i);
                stringBuffer3.append("): ");
                stringBuffer3.append(this.f21242b);
                throw new C6567x(stringBuffer3.toString());
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo22978d(int i) {
        if (i < 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Token start position must not be negative: ");
            stringBuffer.append(i);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        int length = this.f21242b.length();
        int i2 = i + 1;
        while (i2 < length && mo22977c(this.f21242b.charAt(i2))) {
            i2++;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo22975b(char c) {
        return c == 9 || Character.isSpaceChar(c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo22977c(char c) {
        if (Character.isLetterOrDigit(c)) {
            return true;
        }
        if (!Character.isISOControl(c) && !mo22979d(c)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo22979d(char c) {
        return " ,;=()<>@:\\\"/[]?{}\t".indexOf(c) >= 0;
    }
}

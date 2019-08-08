package org.apache.p199a.p226h;

import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.h.u */
/* compiled from: ParserCursor */
public class C6526u {

    /* renamed from: a */
    private final int f21249a;

    /* renamed from: b */
    private final int f21250b;

    /* renamed from: c */
    private int f21251c;

    public C6526u(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        } else if (i > i2) {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        } else {
            this.f21249a = i;
            this.f21250b = i2;
            this.f21251c = i;
        }
    }

    /* renamed from: a */
    public int mo22996a() {
        return this.f21250b;
    }

    /* renamed from: b */
    public int mo22998b() {
        return this.f21251c;
    }

    /* renamed from: a */
    public void mo22997a(int i) {
        if (i < this.f21249a) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("pos: ");
            stringBuffer.append(i);
            stringBuffer.append(" < lowerBound: ");
            stringBuffer.append(this.f21249a);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        } else if (i > this.f21250b) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("pos: ");
            stringBuffer2.append(i);
            stringBuffer2.append(" > upperBound: ");
            stringBuffer2.append(this.f21250b);
            throw new IndexOutOfBoundsException(stringBuffer2.toString());
        } else {
            this.f21251c = i;
        }
    }

    /* renamed from: c */
    public boolean mo22999c() {
        return this.f21251c >= this.f21250b;
    }

    public String toString() {
        C6549b bVar = new C6549b(16);
        bVar.mo23042a('[');
        bVar.mo23044a(Integer.toString(this.f21249a));
        bVar.mo23042a('>');
        bVar.mo23044a(Integer.toString(this.f21251c));
        bVar.mo23042a('>');
        bVar.mo23044a(Integer.toString(this.f21250b));
        bVar.mo23042a(']');
        return bVar.toString();
    }
}

package org.apache.p199a;

import java.io.Serializable;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.z */
/* compiled from: ProtocolVersion */
public class C6569z implements Serializable, Cloneable {

    /* renamed from: d */
    protected final String f21279d;

    /* renamed from: e */
    protected final int f21280e;

    /* renamed from: f */
    protected final int f21281f;

    public C6569z(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Protocol name must not be null.");
        } else if (i < 0) {
            throw new IllegalArgumentException("Protocol major version number must not be negative.");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Protocol minor version number may not be negative");
        } else {
            this.f21279d = str;
            this.f21280e = i;
            this.f21281f = i2;
        }
    }

    /* renamed from: a */
    public final String mo23068a() {
        return this.f21279d;
    }

    /* renamed from: b */
    public final int mo23070b() {
        return this.f21280e;
    }

    /* renamed from: c */
    public final int mo23072c() {
        return this.f21281f;
    }

    /* renamed from: a */
    public C6569z mo23067a(int i, int i2) {
        if (i == this.f21280e && i2 == this.f21281f) {
            return this;
        }
        return new C6569z(this.f21279d, i, i2);
    }

    public final int hashCode() {
        return (this.f21279d.hashCode() ^ (this.f21280e * DefaultOggSeeker.MATCH_BYTE_RANGE)) ^ this.f21281f;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6569z)) {
            return false;
        }
        C6569z zVar = (C6569z) obj;
        if (!(this.f21279d.equals(zVar.f21279d) && this.f21280e == zVar.f21280e && this.f21281f == zVar.f21281f)) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo23069a(C6569z zVar) {
        return zVar != null && this.f21279d.equals(zVar.f21279d);
    }

    /* renamed from: b */
    public int mo23071b(C6569z zVar) {
        if (zVar == null) {
            throw new IllegalArgumentException("Protocol version must not be null.");
        } else if (!this.f21279d.equals(zVar.f21279d)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Versions for different protocols cannot be compared. ");
            stringBuffer.append(this);
            stringBuffer.append(" ");
            stringBuffer.append(zVar);
            throw new IllegalArgumentException(stringBuffer.toString());
        } else {
            int b = mo23070b() - zVar.mo23070b();
            return b == 0 ? mo23072c() - zVar.mo23072c() : b;
        }
    }

    /* renamed from: c */
    public final boolean mo23073c(C6569z zVar) {
        return mo23069a(zVar) && mo23071b(zVar) <= 0;
    }

    public String toString() {
        C6549b bVar = new C6549b(16);
        bVar.mo23044a(this.f21279d);
        bVar.mo23042a('/');
        bVar.mo23044a(Integer.toString(this.f21280e));
        bVar.mo23042a('.');
        bVar.mo23044a(Integer.toString(this.f21281f));
        return bVar.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

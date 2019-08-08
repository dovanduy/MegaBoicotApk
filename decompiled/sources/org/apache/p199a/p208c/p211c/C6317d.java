package org.apache.p199a.p208c.p211c;

import java.util.Locale;
import org.apache.p199a.p229k.C6553f;

/* renamed from: org.apache.a.c.c.d */
/* compiled from: Scheme */
public final class C6317d {

    /* renamed from: a */
    private final String f20853a;

    /* renamed from: b */
    private final C6319f f20854b;

    /* renamed from: c */
    private final int f20855c;

    /* renamed from: d */
    private final boolean f20856d;

    /* renamed from: e */
    private String f20857e;

    public C6317d(String str, int i, C6319f fVar) {
        if (str == null) {
            throw new IllegalArgumentException("Scheme name may not be null");
        } else if (i <= 0 || i > 65535) {
            StringBuilder sb = new StringBuilder();
            sb.append("Port is invalid: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (fVar == null) {
            throw new IllegalArgumentException("Socket factory may not be null");
        } else {
            this.f20853a = str.toLowerCase(Locale.ENGLISH);
            this.f20854b = fVar;
            this.f20855c = i;
            this.f20856d = fVar instanceof C6315b;
        }
    }

    /* renamed from: a */
    public final int mo22516a() {
        return this.f20855c;
    }

    /* renamed from: b */
    public final C6319f mo22518b() {
        return this.f20854b;
    }

    /* renamed from: c */
    public final String mo22519c() {
        return this.f20853a;
    }

    /* renamed from: d */
    public final boolean mo22520d() {
        return this.f20856d;
    }

    /* renamed from: a */
    public final int mo22517a(int i) {
        return i <= 0 ? this.f20855c : i;
    }

    public final String toString() {
        if (this.f20857e == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20853a);
            sb.append(':');
            sb.append(Integer.toString(this.f20855c));
            this.f20857e = sb.toString();
        }
        return this.f20857e;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6317d)) {
            return false;
        }
        C6317d dVar = (C6317d) obj;
        if (!(this.f20853a.equals(dVar.f20853a) && this.f20855c == dVar.f20855c && this.f20856d == dVar.f20856d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C6553f.m25967a(C6553f.m25966a(C6553f.m25965a(17, this.f20855c), (Object) this.f20853a), this.f20856d);
    }
}

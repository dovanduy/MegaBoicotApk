package org.apache.p199a.p200a;

import java.io.Serializable;
import java.security.Principal;
import org.apache.p199a.p229k.C6553f;

/* renamed from: org.apache.a.a.k */
/* compiled from: NTCredentials */
public class C6259k implements Serializable, C6256h {

    /* renamed from: a */
    private final C6260l f20809a;

    /* renamed from: b */
    private final String f20810b;

    /* renamed from: c */
    private final String f20811c;

    /* renamed from: a */
    public Principal mo22412a() {
        return this.f20809a;
    }

    /* renamed from: c */
    public String mo22414c() {
        return this.f20809a.mo22421b();
    }

    /* renamed from: b */
    public String mo22413b() {
        return this.f20810b;
    }

    /* renamed from: d */
    public String mo22415d() {
        return this.f20809a.mo22420a();
    }

    /* renamed from: e */
    public String mo22416e() {
        return this.f20811c;
    }

    public int hashCode() {
        return C6553f.m25966a(C6553f.m25966a(17, (Object) this.f20809a), (Object) this.f20811c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6259k) {
            C6259k kVar = (C6259k) obj;
            if (C6553f.m25968a((Object) this.f20809a, (Object) kVar.f20809a) && C6553f.m25968a((Object) this.f20811c, (Object) kVar.f20811c)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[principal: ");
        sb.append(this.f20809a);
        sb.append("][workstation: ");
        sb.append(this.f20811c);
        sb.append("]");
        return sb.toString();
    }
}

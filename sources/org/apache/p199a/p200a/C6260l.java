package org.apache.p199a.p200a;

import java.io.Serializable;
import java.security.Principal;
import org.apache.p199a.p229k.C6553f;

/* renamed from: org.apache.a.a.l */
/* compiled from: NTUserPrincipal */
public class C6260l implements Serializable, Principal {

    /* renamed from: a */
    private final String f20812a;

    /* renamed from: b */
    private final String f20813b;

    /* renamed from: c */
    private final String f20814c;

    public String getName() {
        return this.f20814c;
    }

    /* renamed from: a */
    public String mo22420a() {
        return this.f20813b;
    }

    /* renamed from: b */
    public String mo22421b() {
        return this.f20812a;
    }

    public int hashCode() {
        return C6553f.m25966a(C6553f.m25966a(17, (Object) this.f20812a), (Object) this.f20813b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6260l) {
            C6260l lVar = (C6260l) obj;
            if (C6553f.m25968a((Object) this.f20812a, (Object) lVar.f20812a) && C6553f.m25968a((Object) this.f20813b, (Object) lVar.f20813b)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.f20814c;
    }
}

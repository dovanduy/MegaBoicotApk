package org.apache.p199a.p218f.p222d;

import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6346e;
import org.apache.p199a.p214d.C6352k;
import org.apache.p199a.p214d.C6353l;

/* renamed from: org.apache.a.f.d.j */
/* compiled from: BasicSecureHandler */
public class C6457j extends C6440a {
    /* renamed from: a */
    public void mo22584a(C6353l lVar, String str) throws C6352k {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        lVar.mo22605a(true);
    }

    /* renamed from: b */
    public boolean mo22585b(C6343b bVar, C6346e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            return !bVar.mo22581f() || eVar.mo22591d();
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }
}

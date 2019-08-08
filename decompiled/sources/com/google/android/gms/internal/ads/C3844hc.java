package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6560q;
import org.apache.p199a.C6569z;
import org.apache.p199a.p215e.C6371b;
import org.apache.p199a.p226h.C6507b;
import org.apache.p199a.p226h.C6513h;
import org.apache.p199a.p226h.C6519n;

/* renamed from: com.google.android.gms.internal.ads.hc */
public abstract class C3844hc implements C4093qi {
    /* renamed from: a */
    public abstract C4065ph mo15318a(avm<?> avm, Map<String, String> map) throws IOException, C3631a;

    @Deprecated
    /* renamed from: b */
    public final C6560q mo15360b(avm<?> avm, Map<String, String> map) throws IOException, C3631a {
        C4065ph a = mo15318a(avm, map);
        C6513h hVar = new C6513h(new C6519n(new C6569z("HTTP", 1, 1), a.mo15826a(), ""));
        ArrayList arrayList = new ArrayList();
        for (C3667app app : a.mo15827b()) {
            arrayList.add(new C6507b(app.mo14558a(), app.mo14559b()));
        }
        hVar.mo22907a((C6301c[]) arrayList.toArray(new C6301c[arrayList.size()]));
        InputStream d = a.mo15829d();
        if (d != null) {
            C6371b bVar = new C6371b();
            bVar.mo22654a(d);
            bVar.mo22653a((long) a.mo15828c());
            hVar.mo22938a(bVar);
        }
        return hVar;
    }
}

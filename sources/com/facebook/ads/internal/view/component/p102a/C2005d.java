package com.facebook.ads.internal.view.component.p102a;

import android.net.Uri;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1601l;
import com.facebook.ads.internal.p070a.C1563b;
import com.facebook.ads.internal.p070a.C1564c;
import com.facebook.ads.internal.p070a.C1572j;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.view.component.a.d */
public final class C2005d {
    /* renamed from: a */
    public static C2004c m8222a(C2006e eVar) {
        C2004c cVar;
        boolean z = true;
        C1597h a = eVar.mo8190k() == 1 ? eVar.mo8186g().mo7188b().mo7120a() : eVar.mo8186g().mo7188b().mo7121b();
        C1601l lVar = (C1601l) eVar.mo8186g().mo7190d().get(0);
        double a2 = (double) C1988a.m8173a(lVar);
        boolean d = ((C1601l) eVar.mo8186g().mo7190d().get(0)).mo7199d();
        boolean a3 = C1988a.m8175a(eVar.mo8190k(), eVar.mo8189j(), a2);
        C1563b a4 = C1564c.m6493a(eVar.mo8180a(), eVar.mo8181b(), "", Uri.parse(((C1601l) eVar.mo8186g().mo7190d().get(0)).mo7197b().mo7178a()), new HashMap());
        if (d && a4 != null && (a4 instanceof C1572j)) {
            cVar = eVar.mo8190k() == 1 ? new C2016j(eVar, a) : new C2015i(eVar, a);
        } else if (a3) {
            if (eVar.mo8190k() != 2) {
                z = false;
            }
            cVar = new C2003b(eVar, a, z);
        } else {
            cVar = new C2009f(eVar, C1988a.m8174a(a2), a);
        }
        cVar.mo8173a(lVar, eVar.mo8186g().mo7189c(), a2);
        return cVar;
    }
}

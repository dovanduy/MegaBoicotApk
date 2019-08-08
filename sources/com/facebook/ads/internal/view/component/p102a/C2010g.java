package com.facebook.ads.internal.view.component.p102a;

import android.net.Uri;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1601l;
import com.facebook.ads.internal.p070a.C1563b;
import com.facebook.ads.internal.p070a.C1564c;
import com.facebook.ads.internal.p070a.C1571i;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.view.component.a.g */
public class C2010g {
    /* renamed from: a */
    public static C2018l m8254a(C2006e eVar, int i, int i2, boolean z) {
        C1597h a = eVar.mo8190k() == 1 ? eVar.mo8186g().mo7188b().mo7120a() : eVar.mo8186g().mo7188b().mo7121b();
        C1601l lVar = (C1601l) eVar.mo8186g().mo7190d().get(0);
        C1563b a2 = C1564c.m6494a(eVar.mo8180a(), eVar.mo8181b(), eVar.mo8186g().mo7189c(), Uri.parse(((C1601l) eVar.mo8186g().mo7190d().get(0)).mo7197b().mo7178a()), new HashMap(), false, true);
        if (!((C1601l) eVar.mo8186g().mo7190d().get(0)).mo7199d() || !(a2 instanceof C1571i)) {
            return null;
        }
        C2011h hVar = new C2011h(eVar, a, i, i2, (C1571i) a2, z);
        hVar.mo8198a(lVar);
        return hVar;
    }
}

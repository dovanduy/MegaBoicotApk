package com.facebook.ads.internal.adapters.p071a;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.internal.p093t.C1822e;
import com.facebook.ads.internal.p093t.C1833f;
import com.facebook.ads.internal.view.C1966c;
import com.facebook.ads.internal.view.C2038e;
import com.facebook.ads.internal.view.C2243j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.adapters.a.b */
public class C1582b extends C1578a {
    public C1582b(C2243j jVar, List<C1822e> list) {
        super(jVar, list);
    }

    /* renamed from: a */
    public C2038e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2038e(new C1966c(viewGroup.getContext()));
    }

    /* renamed from: a */
    public void onBindViewHolder(C2038e eVar, int i) {
        super.onBindViewHolder(eVar, i);
        C1966c cVar = (C1966c) eVar.mo8258a();
        mo7105a(cVar.getImageCardView(), i);
        cVar.setTitle(((C1822e) this.f4843a.get(i)).mo7732a("headline"));
        cVar.setSubtitle(((C1822e) this.f4843a.get(i)).mo7732a("link_description"));
        cVar.setButtonText(((C1822e) this.f4843a.get(i)).mo7732a("call_to_action"));
        C1822e eVar2 = (C1822e) this.f4843a.get(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        eVar2.mo7735a((View) cVar, (C1833f) cVar, (List<View>) arrayList);
    }
}

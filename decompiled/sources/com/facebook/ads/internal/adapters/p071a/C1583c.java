package com.facebook.ads.internal.adapters.p071a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.p093t.C1822e;
import com.facebook.ads.internal.p093t.C1833f;
import com.facebook.ads.internal.view.C2038e;
import com.facebook.ads.internal.view.C2243j;
import com.facebook.ads.internal.view.C2245k;
import com.facebook.ads.internal.view.C2295x;
import java.util.List;

/* renamed from: com.facebook.ads.internal.adapters.a.c */
public class C1583c extends C1578a {
    public C1583c(C2243j jVar, List<C1822e> list) {
        super(jVar, list);
    }

    /* renamed from: a */
    public C2038e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2038e(new C2245k(viewGroup.getContext()));
    }

    /* renamed from: a */
    public void onBindViewHolder(C2038e eVar, int i) {
        super.onBindViewHolder(eVar, i);
        C2245k kVar = (C2245k) eVar.mo8258a();
        C2295x xVar = (C2295x) kVar.getImageCardView();
        xVar.setImageDrawable(null);
        mo7105a((ImageView) xVar, i);
        ((C1822e) this.f4843a.get(i)).mo7734a((View) kVar, (C1833f) kVar);
    }
}

package com.facebook.ads.internal.view.p108g;

import android.support.p028v7.widget.RecyclerView.C0870a;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.List;

/* renamed from: com.facebook.ads.internal.view.g.d */
public class C2089d extends C0870a<C2091f> {

    /* renamed from: a */
    private final List<String> f6675a;

    /* renamed from: b */
    private final int f6676b;

    C2089d(List<String> list, int i) {
        this.f6675a = list;
        this.f6676b = i;
    }

    /* renamed from: a */
    public C2091f onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2091f(new C2090e(viewGroup.getContext()));
    }

    /* renamed from: a */
    public void onBindViewHolder(C2091f fVar, int i) {
        String str = (String) this.f6675a.get(i);
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-2, -1);
        marginLayoutParams.setMargins(i == 0 ? this.f6676b * 4 : this.f6676b, 0, i >= getItemCount() + -1 ? 4 * this.f6676b : this.f6676b, 0);
        fVar.mo8352a().setLayoutParams(marginLayoutParams);
        fVar.mo8352a().mo8351a(str);
    }

    public int getItemCount() {
        return this.f6675a.size();
    }
}

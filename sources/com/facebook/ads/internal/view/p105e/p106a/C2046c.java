package com.facebook.ads.internal.view.p105e.p106a;

import android.support.p028v7.widget.RecyclerView.C0870a;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.p081h.C1724b;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.component.p102a.C2006e.C2008a;
import com.facebook.ads.internal.view.component.p102a.p103a.C2001c;
import java.util.List;

/* renamed from: com.facebook.ads.internal.view.e.a.c */
public class C2046c extends C0870a<C2053f> {

    /* renamed from: a */
    private final C1802c f6477a;

    /* renamed from: b */
    private final C1724b f6478b;

    /* renamed from: c */
    private final C2376a f6479c;

    /* renamed from: d */
    private final C2341w f6480d;

    /* renamed from: e */
    private final C1597h f6481e;

    /* renamed from: f */
    private C1911a f6482f;

    /* renamed from: g */
    private int f6483g;

    /* renamed from: h */
    private int f6484h;

    /* renamed from: i */
    private String f6485i;

    /* renamed from: j */
    private int f6486j;

    /* renamed from: k */
    private int f6487k;

    /* renamed from: l */
    private List<C2045b> f6488l;

    /* renamed from: m */
    private final C2041a f6489m;

    /* renamed from: n */
    private final SparseBooleanArray f6490n = new SparseBooleanArray();

    /* renamed from: com.facebook.ads.internal.view.e.a.c$a */
    public interface C2047a {
        /* renamed from: a */
        void mo8274a(int i);
    }

    C2046c(List<C2045b> list, C1802c cVar, C1724b bVar, C2376a aVar, C2341w wVar, C1911a aVar2, C1597h hVar, String str, int i, int i2, int i3, int i4, C2041a aVar3) {
        this.f6477a = cVar;
        this.f6478b = bVar;
        this.f6479c = aVar;
        this.f6480d = wVar;
        this.f6482f = aVar2;
        this.f6488l = list;
        this.f6484h = i;
        this.f6481e = hVar;
        this.f6486j = i4;
        this.f6485i = str;
        this.f6483g = i3;
        this.f6487k = i2;
        this.f6489m = aVar3;
    }

    /* renamed from: a */
    public C2053f onCreateViewHolder(ViewGroup viewGroup, int i) {
        C2008a aVar = new C2008a(viewGroup.getContext(), this.f6477a, this.f6482f, null, null, this.f6479c, this.f6480d);
        C2053f fVar = new C2053f(C2001c.m8212a(aVar.mo8194a(), this.f6486j, this.f6481e, this.f6485i, this.f6489m), this.f6490n, this.f6479c, this.f6484h, this.f6483g, this.f6487k, this.f6488l.size());
        return fVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(C2053f fVar, int i) {
        fVar.mo8291a((C2045b) this.f6488l.get(i), this.f6477a, this.f6478b, this.f6480d, this.f6485i);
    }

    public int getItemCount() {
        return this.f6488l.size();
    }
}

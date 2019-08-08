package com.facebook.ads.internal.adapters.p071a;

import android.support.p028v7.widget.RecyclerView.C0870a;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.facebook.ads.internal.p093t.C1822e;
import com.facebook.ads.internal.p093t.C1833f;
import com.facebook.ads.internal.p093t.C1834g;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p125x.C2376a.C2377a;
import com.facebook.ads.internal.view.C2038e;
import com.facebook.ads.internal.view.C2243j;
import com.facebook.ads.internal.view.p101c.C1980d;
import com.facebook.ads.internal.view.p101c.C1981e;
import java.util.List;

/* renamed from: com.facebook.ads.internal.adapters.a.a */
public abstract class C1578a extends C0870a<C2038e> {

    /* renamed from: c */
    private static final int f4842c = ((int) (4.0f * C2342x.f7369b));

    /* renamed from: a */
    final List<C1822e> f4843a;

    /* renamed from: b */
    private final int f4844b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1581a f4845d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2377a f4846e = new C2377a() {
        /* renamed from: a */
        public void mo7108a() {
            if (C1578a.this.f4845d != null) {
                C1578a.this.f4845d.mo6850a();
            }
        }
    };

    /* renamed from: com.facebook.ads.internal.adapters.a.a$a */
    public interface C1581a {
        /* renamed from: a */
        void mo6850a();
    }

    C1578a(C2243j jVar, List<C1822e> list) {
        this.f4844b = jVar.getChildSpacing();
        this.f4843a = list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7105a(ImageView imageView, final int i) {
        final C1822e eVar = (C1822e) this.f4843a.get(i);
        C1834g j = eVar.mo7757j();
        if (j != null) {
            C1980d a = new C1980d(imageView).mo8114a();
            a.mo8116a((C1981e) new C1981e() {
                /* renamed from: a */
                public void mo6849a(boolean z) {
                    if (i == 0) {
                        eVar.mo7742a(C1578a.this.f4846e);
                    }
                    eVar.mo7744a(z, true);
                }
            });
            a.mo8118a(j.mo7780a());
        }
    }

    /* renamed from: a */
    public void mo7106a(C1581a aVar) {
        this.f4845d = aVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(C2038e eVar, int i) {
        C1833f a = eVar.mo8258a();
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-2, -1);
        marginLayoutParams.setMargins(i == 0 ? this.f4844b * 2 : this.f4844b, 0, i >= this.f4843a.size() + -1 ? this.f4844b * 2 : this.f4844b, 0);
        a.setLayoutParams(marginLayoutParams);
    }

    public int getItemCount() {
        return this.f4843a.size();
    }
}

package com.facebook.ads.internal.view.p105e.p106a;

import android.support.p028v7.widget.RecyclerView.C0901v;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup.MarginLayoutParams;
import com.facebook.ads.internal.p081h.C1724b;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.p125x.C2376a.C2377a;
import com.facebook.ads.internal.view.component.p102a.p103a.C1990b;
import com.facebook.ads.internal.view.component.p102a.p103a.C1990b.C1996a;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.e.a.f */
class C2053f extends C0901v {

    /* renamed from: a */
    private final C1990b f6518a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final SparseBooleanArray f6519b;

    /* renamed from: c */
    private final int f6520c;

    /* renamed from: d */
    private final int f6521d;

    /* renamed from: e */
    private final int f6522e;

    /* renamed from: f */
    private final int f6523f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2376a f6524g;

    /* renamed from: h */
    private C2377a f6525h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C2376a f6526i;

    C2053f(C1990b bVar, SparseBooleanArray sparseBooleanArray, C2376a aVar, int i, int i2, int i3, int i4) {
        super(bVar);
        this.f6518a = bVar;
        this.f6519b = sparseBooleanArray;
        this.f6526i = aVar;
        this.f6520c = i;
        this.f6521d = i2;
        this.f6522e = i3;
        this.f6523f = i4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8291a(final C2045b bVar, C1802c cVar, C1724b bVar2, C2341w wVar, String str) {
        int b = bVar.mo8270b();
        this.f6518a.setTag(-1593835536, Integer.valueOf(b));
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(this.f6520c, -2);
        marginLayoutParams.setMargins(b == 0 ? this.f6521d : this.f6522e, 0, b >= this.f6523f + -1 ? this.f6521d : this.f6522e, 0);
        String g = bVar.mo8271c().mo7198c().mo7133g();
        String a = bVar.mo8271c().mo7198c().mo7126a();
        this.f6518a.setIsVideo(!TextUtils.isEmpty(a));
        if (this.f6518a.mo8145f()) {
            this.f6518a.setVideoPlaceholderUrl(g);
            C1990b bVar3 = this.f6518a;
            String c = (bVar2 == null || a == null) ? "" : bVar2.mo7496c(a);
            if (TextUtils.isEmpty(c)) {
                c = a;
            }
            bVar3.setVideoUrl(c);
        } else {
            this.f6518a.setImageUrl(g);
        }
        this.f6518a.setLayoutParams(marginLayoutParams);
        this.f6518a.mo8142a(bVar.mo8271c().mo7196a().mo7147a(), bVar.mo8271c().mo7196a().mo7149c());
        this.f6518a.mo8141a(bVar.mo8271c().mo7197b(), bVar.mo8269a());
        this.f6518a.mo8143a(bVar.mo8269a());
        if (!this.f6519b.get(bVar.mo8270b())) {
            if (this.f6524g != null) {
                this.f6524g.mo8782c();
                this.f6524g = null;
            }
            final Map a2 = bVar.mo8269a();
            final String str2 = str;
            final C2045b bVar4 = bVar;
            final C2341w wVar2 = wVar;
            final C1802c cVar2 = cVar;
            C20541 r0 = new C2377a() {
                /* renamed from: a */
                public void mo7108a() {
                    if (!C2053f.this.f6526i.mo8781b() && !TextUtils.isEmpty(str2) && !C2053f.this.f6519b.get(bVar4.mo8270b())) {
                        if (C2053f.this.f6524g != null) {
                            C2053f.this.f6524g.mo8779a(a2);
                        }
                        a2.put("touch", C2323k.m9046a(wVar2.mo8743e()));
                        cVar2.mo7686a(str2, a2);
                        C2053f.this.f6519b.put(bVar4.mo8270b(), true);
                    }
                }
            };
            this.f6525h = r0;
            this.f6524g = new C2376a(this.f6518a, 10, this.f6525h);
            this.f6524g.mo8778a(100);
            this.f6524g.mo8780b(100);
            this.f6518a.setOnAssetsLoadedListener(new C1996a() {
                /* renamed from: a */
                public void mo8166a() {
                    if (bVar.mo8270b() == 0) {
                        C2053f.this.f6526i.mo8777a();
                    }
                    C2053f.this.f6524g.mo8777a();
                }
            });
        }
    }
}

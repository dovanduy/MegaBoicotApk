package com.facebook.ads.internal.view.p099a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import com.facebook.ads.internal.p079f.C1710a;
import com.facebook.ads.internal.p079f.C1711b.C1712a;
import com.facebook.ads.internal.p079f.C1713c;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p118c.C2347b;
import com.facebook.ads.internal.p115w.p118c.C2348c;
import com.facebook.ads.internal.view.p099a.C1912a.C1915a;

/* renamed from: com.facebook.ads.internal.view.a.k */
public class C1938k extends C1917c {

    /* renamed from: c */
    private static final int f6094c = ((int) (8.0f * C2342x.f7369b));

    /* renamed from: d */
    private static final int f6095d = ((int) (10.0f * C2342x.f7369b));

    /* renamed from: e */
    private static final int f6096e = ((int) (44.0f * C2342x.f7369b));

    /* renamed from: f */
    private final ScrollView f6097f;

    /* renamed from: g */
    private final LinearLayout f6098g;

    /* renamed from: h */
    private final ImageView f6099h = new ImageView(getContext());

    public C1938k(Context context, C1802c cVar, String str, int i, int i2) {
        super(context, cVar, str);
        this.f6099h.setPadding(f6095d, f6095d, f6095d, f6095d);
        this.f6099h.setColorFilter(-10459280);
        LayoutParams layoutParams = new LayoutParams(f6096e, f6096e);
        layoutParams.gravity = 3;
        this.f6099h.setLayoutParams(layoutParams);
        this.f6097f = new ScrollView(getContext());
        this.f6097f.setFillViewport(true);
        C2342x.m9082a((View) this.f6097f, -218103809);
        this.f6098g = new LinearLayout(getContext());
        this.f6098g.setOrientation(1);
        this.f6098g.setPadding(f6094c, f6094c, f6094c, f6094c);
        this.f6097f.addView(this.f6098g, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f6097f, new LayoutParams(i, i2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7974a(C1713c cVar, C1712a aVar) {
        C1935j jVar = new C1935j(getContext(), cVar, this.f6033b, aVar == C1712a.REPORT ? C2347b.REPORT_AD : C2347b.HIDE_AD);
        LayoutParams layoutParams = new LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.f6099h.setImageBitmap(C2348c.m9100a(C2347b.BACK_ARROW));
        this.f6099h.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1938k.this.f6033b.mo7982a();
            }
        });
        C2342x.m9085a((ViewGroup) this.f6098g);
        this.f6097f.fullScroll(33);
        this.f6098g.removeAllViews();
        this.f6098g.addView(this.f6099h);
        this.f6098g.addView(jVar, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7977b(C1713c cVar, C1712a aVar) {
        String str;
        int i;
        C2347b bVar;
        this.f6099h.setOnClickListener(null);
        if (aVar == C1712a.REPORT) {
            str = C1710a.m7140j(getContext());
            bVar = C2347b.REPORT_AD;
            i = -552389;
        } else {
            str = C1710a.m7131b(getContext());
            bVar = C2347b.HIDE_AD;
            i = -13272859;
        }
        C1912a a = new C1915a(getContext()).mo7959a(this.f6033b).mo7961a(str).mo7964b(C1710a.m7141k(getContext())).mo7966c(cVar.mo7479b()).mo7962a(false).mo7960a(bVar).mo7958a(i).mo7965b(false).mo7967c(false).mo7963a();
        LayoutParams layoutParams = new LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        C2342x.m9085a((ViewGroup) this.f6098g);
        this.f6097f.fullScroll(33);
        this.f6098g.removeAllViews();
        this.f6098g.addView(a, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo7978c() {
        C2342x.m9092c(this);
        C2342x.m9091b(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo7979d() {
        this.f6099h.setImageBitmap(C2348c.m9100a(C2347b.CROSS));
        this.f6099h.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1938k.this.f6033b.mo7982a();
            }
        });
        final C1921f fVar = new C1921f(getContext());
        fVar.mo7990a(C1710a.m7131b(getContext()), C2347b.HIDE_AD);
        fVar.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                fVar.mo7989a();
                C1938k.this.f6033b.mo7983a(C1712a.HIDE);
            }
        });
        final C1921f fVar2 = new C1921f(getContext());
        fVar2.mo7990a(C1710a.m7135e(getContext()), C2347b.REPORT_AD);
        fVar2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                fVar2.mo7989a();
                C1938k.this.f6033b.mo7983a(C1712a.REPORT);
            }
        });
        final C1921f fVar3 = new C1921f(getContext());
        fVar3.mo7990a(C1710a.m7142l(getContext()), C2347b.AD_CHOICES_ICON);
        fVar3.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                fVar3.mo7989a();
                C1938k.this.f6033b.mo7988d();
            }
        });
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.setMargins(f6094c, f6094c, f6094c, f6094c);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LayoutParams layoutParams2 = new LayoutParams(-2, 0);
        layoutParams2.gravity = 17;
        layoutParams2.weight = 1.0f;
        C2342x.m9085a((ViewGroup) this.f6098g);
        this.f6098g.removeAllViews();
        this.f6098g.addView(this.f6099h);
        this.f6098g.addView(linearLayout, layoutParams2);
        linearLayout.addView(fVar, layoutParams);
        linearLayout.addView(fVar2, layoutParams);
        linearLayout.addView(fVar3, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo7980e() {
        return true;
    }
}

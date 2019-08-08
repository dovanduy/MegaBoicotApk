package com.facebook.ads.internal.view.p099a;

import android.content.Context;
import android.os.Build.VERSION;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p079f.C1710a;
import com.facebook.ads.internal.p079f.C1711b.C1712a;
import com.facebook.ads.internal.p079f.C1713c;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p118c.C2347b;
import com.facebook.ads.internal.view.C1910a;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.p099a.C1912a.C1915a;

/* renamed from: com.facebook.ads.internal.view.a.g */
public class C1922g extends C1917c {

    /* renamed from: c */
    private static final int f6054c = ((int) (8.0f * C2342x.f7369b));

    /* renamed from: d */
    private final RelativeLayout f6055d = new RelativeLayout(getContext());

    C1922g(Context context, C1802c cVar, String str, C1910a aVar, C1911a aVar2) {
        super(context, cVar, str, aVar, aVar2);
        addView(this.f6055d, new LayoutParams(-1, -1));
        C2342x.m9082a((View) this.f6055d, -1728053248);
        this.f6055d.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1922g.this.f6033b.mo7985a(false);
            }
        });
    }

    /* renamed from: b */
    private static LayoutParams m8044b(boolean z) {
        LayoutParams layoutParams = new LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    /* renamed from: f */
    private void m8045f() {
        if (VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            C2342x.m9087a((ViewGroup) this, (Transition) transitionSet);
            return;
        }
        C2342x.m9085a((ViewGroup) this);
    }

    /* renamed from: a */
    public void mo7974a(C1713c cVar, C1712a aVar) {
        boolean z = aVar == C1712a.REPORT;
        C1935j jVar = new C1935j(getContext(), cVar, this.f6033b, z ? C1710a.m7135e(getContext()) : C1710a.m7131b(getContext()), z ? C2347b.REPORT_AD : C2347b.HIDE_AD);
        jVar.setClickable(true);
        C2342x.m9082a((View) jVar, -1);
        jVar.setPadding(f6054c * 2, f6054c, f6054c * 2, f6054c);
        m8045f();
        this.f6055d.removeAllViews();
        this.f6055d.addView(jVar, m8044b(false));
    }

    /* renamed from: b */
    public void mo7977b(C1713c cVar, C1712a aVar) {
        if (aVar != C1712a.NONE) {
            boolean z = aVar == C1712a.REPORT;
            C1912a a = new C1915a(getContext()).mo7959a(this.f6033b).mo7961a(z ? C1710a.m7140j(getContext()) : C1710a.m7139i(getContext())).mo7964b(C1710a.m7141k(getContext())).mo7966c(cVar.mo7479b()).mo7960a(z ? C2347b.REPORT_AD : C2347b.HIDE_AD).mo7958a(z ? -552389 : -13272859).mo7968d(this.f6032a).mo7963a();
            C2342x.m9082a((View) a, -1);
            C2342x.m9085a((ViewGroup) this);
            this.f6055d.removeAllViews();
            this.f6055d.addView(a, m8044b(true));
        }
    }

    /* renamed from: c */
    public void mo7978c() {
        C2342x.m9092c(this);
        this.f6055d.removeAllViews();
        C2342x.m9091b(this);
    }

    /* renamed from: d */
    public void mo7979d() {
        C1713c d = C1710a.m7134d(getContext());
        C1934i iVar = new C1934i(getContext());
        iVar.mo8002a(C2347b.HIDE_AD, C1710a.m7131b(getContext()), C1710a.m7133c(getContext()));
        iVar.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1922g.this.f6033b.mo7983a(C1712a.HIDE);
            }
        });
        C1713c g = C1710a.m7137g(getContext());
        C1934i iVar2 = new C1934i(getContext());
        iVar2.mo8002a(C2347b.REPORT_AD, C1710a.m7135e(getContext()), C1710a.m7136f(getContext()));
        iVar2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1922g.this.f6033b.mo7983a(C1712a.REPORT);
            }
        });
        C1934i iVar3 = new C1934i(getContext());
        iVar3.mo8002a(C2347b.AD_CHOICES_ICON, C1710a.m7142l(getContext()), "");
        iVar3.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1922g.this.f6033b.mo7988d();
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(f6054c * 2, f6054c, f6054c * 2, f6054c);
        C2342x.m9082a((View) linearLayout, -1);
        if (!d.mo7481d().isEmpty()) {
            linearLayout.addView(iVar, layoutParams);
        }
        if (!g.mo7481d().isEmpty()) {
            linearLayout.addView(iVar2, layoutParams);
        }
        linearLayout.addView(iVar3, layoutParams);
        m8045f();
        this.f6055d.removeAllViews();
        this.f6055d.addView(linearLayout, m8044b(false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo7980e() {
        return false;
    }
}

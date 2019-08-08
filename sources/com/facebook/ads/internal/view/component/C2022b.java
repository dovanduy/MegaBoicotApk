package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.internal.p093t.C1822e;
import com.facebook.ads.internal.p093t.C1837j;
import com.facebook.ads.internal.view.C2293v;
import com.facebook.ads.internal.view.C2294w;

/* renamed from: com.facebook.ads.internal.view.component.b */
public class C2022b extends LinearLayout {

    /* renamed from: a */
    private C2293v f6381a = new C2293v(getContext(), 2);

    /* renamed from: b */
    private int f6382b;

    public C2022b(Context context, C1822e eVar, C1837j jVar, AdOptionsView adOptionsView) {
        super(context);
        setOrientation(1);
        setVerticalGravity(16);
        this.f6381a.setMinTextSize((float) (jVar.mo7804h() - 2));
        this.f6381a.setText(eVar.mo7732a("headline"));
        jVar.mo7788a((TextView) this.f6381a);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LayoutParams layoutParams = new LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.f6381a, layoutParams);
        linearLayout.addView(adOptionsView, new LayoutParams(-2, -2));
        int i = 21;
        if (eVar.mo7732a("headline") != null) {
            i = Math.min(eVar.mo7732a("headline").length(), 21);
        }
        this.f6382b = i;
        addView(linearLayout, new LayoutParams(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        C2294w wVar = new C2294w(context);
        wVar.setText(eVar.mo7732a("social_context"));
        jVar.mo7792b((TextView) wVar);
        linearLayout2.addView(wVar);
        addView(linearLayout2);
    }

    public int getMinVisibleTitleCharacters() {
        return this.f6382b;
    }

    public TextView getTitleTextView() {
        return this.f6381a;
    }
}

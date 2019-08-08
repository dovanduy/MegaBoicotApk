package com.facebook.ads.internal.view.p109h;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.internal.p093t.C1822e;
import com.facebook.ads.internal.p093t.C1837j;

/* renamed from: com.facebook.ads.internal.view.h.a */
public class C2095a extends LinearLayout {
    public C2095a(Context context, C1822e eVar, C1837j jVar, AdOptionsView adOptionsView) {
        super(context);
        TextView textView = new TextView(getContext());
        jVar.mo7788a(textView);
        textView.setText(eVar.mo7732a("advertiser_name"));
        textView.setEllipsize(TruncateAt.END);
        textView.setMaxLines(1);
        TextView textView2 = new TextView(getContext());
        jVar.mo7792b(textView2);
        textView2.setText(eVar.mo7732a("social_context"));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LayoutParams layoutParams = new LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        linearLayout.addView(textView, layoutParams);
        linearLayout.addView(adOptionsView, new LayoutParams(-2, -2));
        setOrientation(1);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        addView(linearLayout, layoutParams2);
        addView(textView2, layoutParams2);
    }
}

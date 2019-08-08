package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.p093t.C1822e;
import com.facebook.ads.internal.p093t.C1837j;
import com.facebook.ads.internal.p115w.p117b.C2342x;

/* renamed from: com.facebook.ads.internal.view.component.h */
public class C2028h extends LinearLayout {
    public C2028h(Context context, C1822e eVar, C1837j jVar) {
        super(context);
        float f = C2342x.f7369b;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVerticalGravity(16);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        float f2 = 15.0f * f;
        layoutParams.setMargins(Math.round(f2), Math.round(f2), Math.round(f2), Math.round(f2));
        linearLayout.setLayoutParams(layoutParams);
        addView(linearLayout);
        String a = eVar.mo7732a("headline");
        TextView textView = new TextView(getContext());
        if (TextUtils.isEmpty(a)) {
            a = eVar.mo7732a("headline");
        }
        textView.setText(a);
        jVar.mo7788a(textView);
        textView.setEllipsize(TruncateAt.END);
        textView.setSingleLine(true);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(getContext());
        textView2.setText(eVar.mo7759l());
        jVar.mo7792b(textView2);
        textView2.setEllipsize(TruncateAt.END);
        textView2.setMaxLines(2);
        linearLayout.addView(textView2);
    }
}

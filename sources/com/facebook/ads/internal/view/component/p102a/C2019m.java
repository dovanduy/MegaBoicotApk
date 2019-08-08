package com.facebook.ads.internal.view.component.p102a;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1601l;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p118c.C2347b;
import com.facebook.ads.internal.p115w.p118c.C2348c;
import com.facebook.ads.internal.view.component.C1983a;
import com.facebook.ads.internal.view.component.C1983a.C1987a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.component.a.m */
public class C2019m extends FrameLayout {

    /* renamed from: a */
    private static final int f6367a = ((int) (C2342x.f7369b * 21.0f));

    /* renamed from: b */
    private static final int f6368b = ((int) (C2342x.f7369b * 8.0f));

    /* renamed from: c */
    private static final int f6369c = ((int) (C2342x.f7369b * 3.0f));

    /* renamed from: d */
    private final C1983a f6370d;

    public C2019m(C2006e eVar, String str, C1597h hVar, C1987a aVar) {
        super(eVar.mo8180a());
        LinearLayout linearLayout = new LinearLayout(eVar.mo8180a());
        addView(linearLayout, new LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setClickable(false);
        ImageView imageView = new ImageView(eVar.mo8180a());
        imageView.setImageBitmap(C2348c.m9100a(C2347b.BACK_ARROW));
        imageView.setRotation(90.0f);
        imageView.setClickable(false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        imageView.setBackgroundDrawable(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(f6367a, f6367a);
        layoutParams.bottomMargin = f6368b;
        imageView.setPadding(f6369c, f6369c, f6369c, f6369c);
        layoutParams.gravity = 1;
        linearLayout.addView(imageView, layoutParams);
        TextView textView = new TextView(eVar.mo8180a());
        textView.setTextSize(14.0f);
        textView.setText(str);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        textView.setTextColor(hVar.mo7170a(true));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.bottomMargin = f6368b;
        linearLayout.addView(textView, layoutParams2);
        textView.setClickable(false);
        C1983a aVar2 = new C1983a(eVar.mo8180a(), true, false, "com.facebook.ads.interstitial.clicked", null, eVar.mo8181b(), eVar.mo8182c(), eVar.mo8184e(), eVar.mo8185f());
        this.f6370d = aVar2;
        this.f6370d.mo8131a(((C1601l) eVar.mo8186g().mo7190d().get(0)).mo7197b(), eVar.mo8186g().mo7189c(), (Map<String, String>) new HashMap<String,String>(), aVar);
        addView(this.f6370d, new LayoutParams(-1, -1));
    }

    public boolean performClick() {
        return this.f6370d.performClick();
    }
}

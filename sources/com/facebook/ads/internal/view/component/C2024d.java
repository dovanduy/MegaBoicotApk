package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.internal.p093t.C1822e;
import com.facebook.ads.internal.p093t.C1837j;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.C2294w;

/* renamed from: com.facebook.ads.internal.view.component.d */
public class C2024d extends LinearLayout {

    /* renamed from: a */
    private MediaView f6388a;

    /* renamed from: b */
    private C2022b f6389b;

    /* renamed from: c */
    private TextView f6390c;

    /* renamed from: d */
    private LinearLayout f6391d = new LinearLayout(getContext());

    public C2024d(Context context, C1822e eVar, C1837j jVar, MediaView mediaView, AdOptionsView adOptionsView, boolean z, int i) {
        C1822e eVar2 = eVar;
        C1837j jVar2 = jVar;
        super(context);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        setVerticalGravity(16);
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.setMargins(Math.round(displayMetrics.density * 15.0f), Math.round(displayMetrics.density * 15.0f), Math.round(displayMetrics.density * 15.0f), Math.round(displayMetrics.density * 15.0f));
        linearLayout.setLayoutParams(layoutParams);
        addView(linearLayout);
        LayoutParams layoutParams2 = new LayoutParams(-1, 0);
        this.f6391d.setOrientation(0);
        this.f6391d.setGravity(16);
        layoutParams2.weight = 3.0f;
        this.f6391d.setLayoutParams(layoutParams2);
        linearLayout.addView(this.f6391d);
        this.f6388a = mediaView;
        double d = 3.0d / ((double) (true + (z ? 1 : 0)));
        float f = (float) ((int) (((double) (i - 30)) * d));
        LayoutParams layoutParams3 = new LayoutParams(Math.round(displayMetrics.density * f), Math.round(f * displayMetrics.density));
        layoutParams3.setMargins(0, 0, Math.round(displayMetrics.density * 15.0f), 0);
        this.f6388a.setLayoutParams(layoutParams3);
        this.f6391d.addView(this.f6388a);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setLayoutParams(new LayoutParams(-1, -1));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        this.f6391d.addView(linearLayout2);
        this.f6389b = new C2022b(getContext(), eVar2, jVar2, adOptionsView);
        LayoutParams layoutParams4 = new LayoutParams(-2, -1);
        layoutParams4.setMargins(0, 0, Math.round(15.0f * displayMetrics.density), 0);
        layoutParams4.weight = 0.5f;
        this.f6389b.setLayoutParams(layoutParams4);
        linearLayout2.addView(this.f6389b);
        this.f6390c = new TextView(getContext());
        this.f6390c.setPadding(Math.round(displayMetrics.density * 6.0f), Math.round(displayMetrics.density * 6.0f), Math.round(displayMetrics.density * 6.0f), Math.round(6.0f * displayMetrics.density));
        this.f6390c.setText(eVar2.mo7732a("call_to_action"));
        this.f6390c.setTextColor(jVar.mo7801f());
        this.f6390c.setTextSize(14.0f);
        this.f6390c.setTypeface(jVar.mo7785a(), 1);
        this.f6390c.setMaxLines(2);
        this.f6390c.setEllipsize(TruncateAt.END);
        this.f6390c.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(jVar.mo7799e());
        gradientDrawable.setCornerRadius(5.0f * displayMetrics.density);
        gradientDrawable.setStroke(1, jVar.mo7803g());
        C2342x.m9083a((View) this.f6390c, (Drawable) gradientDrawable);
        LayoutParams layoutParams5 = new LayoutParams(-2, -2);
        layoutParams5.weight = 0.25f;
        this.f6390c.setLayoutParams(layoutParams5);
        if (!eVar.mo7755h()) {
            this.f6390c.setVisibility(4);
        }
        linearLayout2.addView(this.f6390c);
        if (z) {
            C2294w wVar = new C2294w(getContext());
            wVar.setText(eVar.mo7759l());
            jVar2.mo7792b((TextView) wVar);
            wVar.setMinTextSize((float) (jVar.mo7805i() - 1));
            LayoutParams layoutParams6 = new LayoutParams(-1, 0);
            layoutParams6.weight = 1.0f;
            wVar.setLayoutParams(layoutParams6);
            wVar.setGravity(80);
            linearLayout.addView(wVar);
        }
    }

    public TextView getCallToActionView() {
        return this.f6390c;
    }

    public MediaView getIconView() {
        return this.f6388a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        TextView titleTextView = this.f6389b.getTitleTextView();
        if (titleTextView.getLayout().getLineEnd(titleTextView.getLineCount() - 1) < this.f6389b.getMinVisibleTitleCharacters()) {
            this.f6391d.removeView(this.f6388a);
            super.onMeasure(i, i2);
        }
    }
}

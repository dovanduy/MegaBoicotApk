package com.facebook.ads.internal.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p093t.C1833f;
import com.facebook.ads.internal.p115w.p117b.C2322j;
import com.facebook.ads.internal.p115w.p117b.C2342x;

/* renamed from: com.facebook.ads.internal.view.c */
public class C1966c extends C1833f {

    /* renamed from: a */
    public static final int f6176a = (((int) C2342x.f7369b) * 500);

    /* renamed from: b */
    private static final int f6177b = ((int) (C2342x.f7369b * 500.0f));

    /* renamed from: c */
    private static final int f6178c = ((int) (C2342x.f7369b * 4.0f));

    /* renamed from: d */
    private static final int f6179d = ((int) (C2342x.f7369b * 8.0f));

    /* renamed from: e */
    private static final int f6180e = ((int) (C2342x.f7369b * 8.0f));

    /* renamed from: f */
    private static final int f6181f = ((int) (C2342x.f7369b * 4.0f));

    /* renamed from: g */
    private static final int f6182g = ((int) C2342x.f7369b);

    /* renamed from: h */
    private static final int f6183h = ((int) (C2342x.f7369b * 4.0f));

    /* renamed from: i */
    private static final int f6184i = ((int) (((double) C2342x.f7369b) * 0.5d));

    /* renamed from: j */
    private final TextView f6185j;

    /* renamed from: k */
    private final TextView f6186k;

    /* renamed from: l */
    private final TextView f6187l;

    /* renamed from: m */
    private final RelativeLayout f6188m;

    /* renamed from: n */
    private final LinearLayout f6189n;

    /* renamed from: o */
    private final RelativeLayout f6190o;

    /* renamed from: p */
    private final C2288t f6191p;

    public C1966c(Context context) {
        super(context);
        this.f6185j = new TextView(context);
        this.f6186k = new TextView(context);
        this.f6187l = new TextView(context);
        this.f6188m = new RelativeLayout(context);
        this.f6189n = new LinearLayout(context);
        this.f6190o = new RelativeLayout(context);
        this.f6191p = new C2288t(context);
        setLayoutParams(new LayoutParams(-2, -1));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius((float) f6183h);
        gradientDrawable.setStroke(1, -10459280);
        setBackgroundDrawable(gradientDrawable);
        setPadding(f6184i, f6184i, f6184i, f6184i);
        this.f6189n.setOrientation(1);
        C2342x.m9081a((View) this.f6189n);
        addView(this.f6189n, new LinearLayout.LayoutParams(-2, -2));
        C2342x.m9081a((View) this.f6190o);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 1;
        this.f6189n.addView(this.f6190o, layoutParams);
        this.f6191p.setScaleType(ScaleType.FIT_XY);
        this.f6191p.setRadius(new float[]{(float) f6183h, (float) f6183h, (float) f6183h, (float) f6183h, 0.0f, 0.0f, 0.0f, 0.0f});
        this.f6191p.setAdjustViewBounds(true);
        C2322j.m9044a(this.f6191p, C2322j.INTERNAL_AD_MEDIA);
        C2342x.m9081a((View) this.f6191p);
        this.f6190o.addView(this.f6191p, new LinearLayout.LayoutParams(-2, -1));
        C2342x.m9081a((View) this.f6190o);
        this.f6187l.setPadding(f6182g, f6182g, f6182g, f6182g);
        this.f6187l.setTextSize(14.0f);
        C2342x.m9081a((View) this.f6187l);
        C2342x.m9081a((View) this.f6188m);
        this.f6185j.setTextSize(14.0f);
        C2342x.m9081a((View) this.f6185j);
        this.f6185j.setMaxLines(1);
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, f6181f);
        this.f6188m.addView(this.f6185j, layoutParams2);
        this.f6186k.setTextSize(12.0f);
        C2342x.m9081a((View) this.f6186k);
        this.f6186k.setMaxLines(1);
        LayoutParams layoutParams3 = new LayoutParams(-2, -2);
        layoutParams3.addRule(3, this.f6185j.getId());
        layoutParams3.setMargins(0, 0, 0, f6181f);
        this.f6188m.addView(this.f6186k, layoutParams3);
    }

    /* access modifiers changed from: protected */
    public View getAdContentsView() {
        return this.f6191p;
    }

    public TextView getCTAButton() {
        return this.f6187l;
    }

    public ImageView getImageCardView() {
        return this.f6191p;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (MeasureSpec.getSize(i2) >= ((int) C2342x.f7369b) * C1795a.m7459r(getContext()) || MeasureSpec.getMode(i2) == 0) {
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.addRule(3, this.f6186k.getId());
            C2342x.m9091b(this.f6187l);
            this.f6188m.addView(this.f6187l, layoutParams);
            LayoutParams layoutParams2 = new LayoutParams(-1, -2);
            this.f6188m.setPadding(f6180e, f6180e, f6180e, f6180e);
            C2342x.m9091b(this.f6188m);
            this.f6189n.addView(this.f6188m, layoutParams2);
            this.f6191p.setMaxWidth(f6177b);
            this.f6185j.setTextColor(-10459280);
            this.f6186k.setTextColor(-10459280);
            this.f6187l.setTextColor(-13272859);
            ((LinearLayout.LayoutParams) this.f6190o.getLayoutParams()).gravity = 1;
        } else {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.setMargins(f6179d, f6178c, f6179d, f6178c);
            C2342x.m9091b(this.f6187l);
            this.f6189n.addView(this.f6187l, layoutParams3);
            LayoutParams layoutParams4 = new LayoutParams(-2, -2);
            layoutParams4.addRule(8, this.f6191p.getId());
            layoutParams4.addRule(5, this.f6191p.getId());
            layoutParams4.addRule(7, this.f6191p.getId());
            this.f6188m.setPadding(f6180e, 0, f6180e, 0);
            this.f6188m.setBackgroundDrawable(new GradientDrawable(Orientation.BOTTOM_TOP, new int[]{-872415232, 0}));
            C2342x.m9091b(this.f6188m);
            this.f6190o.addView(this.f6188m, layoutParams4);
            this.f6185j.setTextColor(-1);
            this.f6186k.setTextColor(-1);
            this.f6187l.setTextColor(-13272859);
        }
        super.onMeasure(i, i2);
    }

    public void setButtonText(String str) {
        if (str == null || str.trim().isEmpty()) {
            this.f6187l.setVisibility(8);
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 0);
        this.f6187l.setText(spannableString);
    }

    public void setSubtitle(String str) {
        if (str == null || str.trim().isEmpty()) {
            this.f6186k.setVisibility(8);
        }
        this.f6186k.setText(str);
    }

    public void setTitle(String str) {
        if (str == null || str.trim().isEmpty()) {
            this.f6185j.setVisibility(8);
        }
        this.f6185j.setText(str);
    }
}

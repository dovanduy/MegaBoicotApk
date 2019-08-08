package com.facebook.ads.internal.view.p107f;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.appnext.base.p046b.C1245d;
import com.facebook.ads.internal.adapters.p072b.C1605n;
import com.facebook.ads.internal.adapters.p072b.C1606o;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.component.C2026f;
import com.facebook.ads.internal.view.component.C2030j;
import com.facebook.ads.internal.view.p101c.C1980d;
import com.facebook.ads.internal.view.p101c.C1981e;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.view.f.a */
public class C2066a extends RelativeLayout {

    /* renamed from: a */
    public static final int f6573a = ((int) (72.0f * C2342x.f7369b));

    /* renamed from: b */
    private static final int f6574b = ((int) (C2342x.f7369b * 16.0f));

    /* renamed from: c */
    private static final int f6575c = ((int) (16.0f * C2342x.f7369b));

    /* renamed from: d */
    private static final LayoutParams f6576d = new LayoutParams(-1, -1);

    /* renamed from: e */
    private final C1606o f6577e;

    /* renamed from: f */
    private C2026f f6578f = new C2026f(getContext());

    /* renamed from: g */
    private C2030j f6579g;

    /* renamed from: h */
    private LinearLayout f6580h;

    /* renamed from: com.facebook.ads.internal.view.f.a$a */
    private static class C2068a implements C1981e {

        /* renamed from: a */
        final WeakReference<ImageView> f6581a;

        private C2068a(ImageView imageView) {
            this.f6581a = new WeakReference<>(imageView);
        }

        /* renamed from: a */
        public void mo6849a(boolean z) {
            if (!z && this.f6581a.get() != null) {
                ((ImageView) this.f6581a.get()).setVisibility(8);
            }
        }
    }

    public C2066a(Context context, C1606o oVar) {
        super(context);
        this.f6577e = oVar;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        C2342x.m9082a((View) this.f6578f, 0);
        this.f6578f.setRadius(50);
        new C1980d((ImageView) this.f6578f).mo8114a().mo8118a(this.f6577e.mo7222b().mo7201b());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(f6573a, f6573a);
        C2030j jVar = new C2030j(getContext(), this.f6577e.mo7225e().mo7120a(), true, false, true);
        this.f6579g = jVar;
        this.f6579g.mo8234a(this.f6577e.mo7223c().mo7147a(), this.f6577e.mo7223c().mo7148b(), null, false, true);
        this.f6579g.getDescriptionTextView().setAlpha(0.8f);
        this.f6579g.setAlignment(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, f6575c, 0, f6575c / 2);
        this.f6580h = new LinearLayout(getContext());
        this.f6580h.setGravity(17);
        this.f6580h.setPadding(f6575c, f6575c / 2, f6575c, f6575c / 2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(0, f6575c / 2, 0, 0);
        C1605n j = this.f6577e.mo7226f().mo7136j();
        TextView textView = new TextView(getContext());
        textView.setTextColor(-1);
        C2342x.m9089a(textView, false, 16);
        textView.setText(j.mo7213d());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        ImageView imageView = new ImageView(getContext());
        new C1980d(imageView).mo8114a().mo8116a((C1981e) new C2068a(imageView)).mo8118a(j.mo7211b());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(f6574b, f6574b);
        layoutParams5.setMargins(0, 0, f6575c / 2, 0);
        this.f6580h.addView(imageView, layoutParams5);
        this.f6580h.addView(textView, layoutParams4);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(100.0f);
        gradientDrawable.setColor(469762047);
        C2342x.m9083a((View) this.f6580h, (Drawable) gradientDrawable);
        linearLayout.addView(this.f6578f, layoutParams);
        linearLayout.addView(this.f6579g, layoutParams2);
        linearLayout.addView(this.f6580h, layoutParams3);
        C2342x.m9082a((View) this, -14473425);
        addView(linearLayout, f6576d);
        m8408a(this.f6578f, C1245d.f3968jk);
        m8408a(this.f6579g, 170);
        m8408a(this.f6580h, 190);
    }

    /* renamed from: a */
    private void m8408a(View view, int i) {
        view.setTranslationY((float) i);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy((float) (-i)).scaleX(1.0f).scaleY(1.0f).setDuration(200).setInterpolator(new DecelerateInterpolator(2.0f));
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.p137b.C3238b;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class asx extends RelativeLayout {

    /* renamed from: a */
    private static final float[] f12118a = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: b */
    private AnimationDrawable f12119b;

    public asx(Context context, asu asu, LayoutParams layoutParams) {
        super(context);
        C3513t.m12625a(asu);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f12118a, null, null));
        shapeDrawable.getPaint().setColor(asu.mo14742d());
        setLayoutParams(layoutParams);
        C3025aw.m10919g().mo15540a((View) this, (Drawable) shapeDrawable);
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(asu.mo14739a())) {
            LayoutParams layoutParams3 = new LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(asu.mo14739a());
            textView.setTextColor(asu.mo14743e());
            textView.setTextSize((float) asu.mo14744f());
            aoq.m14615a();
            int a = C3975lz.m17369a(context, 4);
            aoq.m14615a();
            textView.setPadding(a, 0, C3975lz.m17369a(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<asy> c = asu.mo14741c();
        if (c != null && c.size() > 1) {
            this.f12119b = new AnimationDrawable();
            for (asy a2 : c) {
                try {
                    this.f12119b.addFrame((Drawable) C3238b.m11574a(a2.mo14753a()), asu.mo14745g());
                } catch (Exception e) {
                    C3900je.m17430b("Error while getting drawable.", e);
                }
            }
            C3025aw.m10919g().mo15540a((View) imageView, (Drawable) this.f12119b);
        } else if (c.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) C3238b.m11574a(((asy) c.get(0)).mo14753a()));
            } catch (Exception e2) {
                C3900je.m17430b("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        if (this.f12119b != null) {
            this.f12119b.start();
        }
        super.onAttachedToWindow();
    }
}

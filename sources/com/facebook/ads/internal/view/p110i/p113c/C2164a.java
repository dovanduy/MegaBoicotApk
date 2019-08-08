package com.facebook.ads.internal.view.p110i.p113c;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p118c.C2347b;
import com.facebook.ads.internal.p115w.p118c.C2348c;
import com.facebook.ads.internal.p115w.p120e.C2361g;
import com.facebook.ads.internal.view.p110i.p111a.C2118c;

/* renamed from: com.facebook.ads.internal.view.i.c.a */
public class C2164a extends C2118c {

    /* renamed from: a */
    private final C2165a f6842a;

    /* renamed from: com.facebook.ads.internal.view.i.c.a$a */
    public static class C2165a extends RelativeLayout {

        /* renamed from: a */
        private final String f6843a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f6844b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final String f6845c;

        /* renamed from: d */
        private final DisplayMetrics f6846d;

        /* renamed from: e */
        private ImageView f6847e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public TextView f6848f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f6849g = false;

        public C2165a(Context context, String str, String str2, float[] fArr, String str3) {
            super(context);
            this.f6843a = str;
            this.f6844b = str2;
            this.f6845c = str3;
            this.f6846d = context.getResources().getDisplayMetrics();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-16777216);
            gradientDrawable.setAlpha(178);
            gradientDrawable.setCornerRadii(new float[]{fArr[0] * this.f6846d.density, fArr[0] * this.f6846d.density, fArr[1] * this.f6846d.density, fArr[1] * this.f6846d.density, fArr[2] * this.f6846d.density, fArr[2] * this.f6846d.density, fArr[3] * this.f6846d.density, fArr[3] * this.f6846d.density});
            C2342x.m9083a((View) this, (Drawable) gradientDrawable);
            setOnTouchListener(new OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    if (!C2165a.this.f6849g) {
                        C2165a.m8650d(C2165a.this);
                    } else if (!TextUtils.isEmpty(C2165a.this.f6844b)) {
                        C2361g.m9129a(new C2361g(), C2165a.this.getContext(), Uri.parse(C2165a.this.f6844b), C2165a.this.f6845c);
                    }
                    return true;
                }
            });
            this.f6847e = new ImageView(getContext());
            this.f6847e.setImageBitmap(C2348c.m9100a(C2347b.IC_AD_CHOICES));
            addView(this.f6847e);
            LayoutParams layoutParams = new LayoutParams(Math.round(this.f6846d.density * 16.0f), Math.round(16.0f * this.f6846d.density));
            layoutParams.addRule(9);
            layoutParams.addRule(15, -1);
            layoutParams.setMargins(Math.round(4.0f * this.f6846d.density), Math.round(this.f6846d.density * 2.0f), Math.round(this.f6846d.density * 2.0f), Math.round(2.0f * this.f6846d.density));
            this.f6847e.setLayoutParams(layoutParams);
            this.f6848f = new TextView(getContext());
            addView(this.f6848f);
            LayoutParams layoutParams2 = new LayoutParams(-2, -2);
            layoutParams2.width = 0;
            layoutParams2.leftMargin = (int) (this.f6846d.density * 20.0f);
            layoutParams2.addRule(9);
            layoutParams2.addRule(15, -1);
            this.f6848f.setLayoutParams(layoutParams2);
            this.f6848f.setSingleLine();
            this.f6848f.setText(this.f6843a);
            this.f6848f.setTextSize(10.0f);
            this.f6848f.setTextColor(-4341303);
            setMinimumWidth(Math.round(20.0f * this.f6846d.density));
            setMinimumHeight(Math.round(18.0f * this.f6846d.density));
        }

        /* renamed from: d */
        static /* synthetic */ void m8650d(C2165a aVar) {
            Paint paint = new Paint();
            paint.setTextSize(aVar.f6848f.getTextSize());
            int round = Math.round(paint.measureText(aVar.f6843a) + (4.0f * aVar.f6846d.density));
            final int width = aVar.getWidth();
            final int i = round + width;
            aVar.f6849g = true;
            C21672 r3 = new Animation() {
                /* access modifiers changed from: protected */
                public void applyTransformation(float f, Transformation transformation) {
                    int i = (int) (((float) width) + (((float) (i - width)) * f));
                    C2165a.this.getLayoutParams().width = i;
                    C2165a.this.requestLayout();
                    C2165a.this.f6848f.getLayoutParams().width = i - width;
                    C2165a.this.f6848f.requestLayout();
                }

                public boolean willChangeBounds() {
                    return true;
                }
            };
            r3.setAnimationListener(new AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            if (C2165a.this.f6849g) {
                                C2165a.m8652f(C2165a.this);
                            }
                        }
                    }, 3000);
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            });
            r3.setDuration(300);
            r3.setFillAfter(true);
            aVar.startAnimation(r3);
        }

        /* renamed from: f */
        static /* synthetic */ void m8652f(C2165a aVar) {
            Paint paint = new Paint();
            paint.setTextSize(aVar.f6848f.getTextSize());
            int round = Math.round(paint.measureText(aVar.f6843a) + (4.0f * aVar.f6846d.density));
            final int width = aVar.getWidth();
            final int i = width - round;
            C21704 r2 = new Animation() {
                /* access modifiers changed from: protected */
                public void applyTransformation(float f, Transformation transformation) {
                    int i = (int) (((float) width) + (((float) (i - width)) * f));
                    C2165a.this.getLayoutParams().width = i;
                    C2165a.this.requestLayout();
                    C2165a.this.f6848f.getLayoutParams().width = i - i;
                    C2165a.this.f6848f.requestLayout();
                }

                public boolean willChangeBounds() {
                    return true;
                }
            };
            r2.setAnimationListener(new AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                    C2165a.this.f6849g = false;
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            });
            r2.setDuration(300);
            r2.setFillAfter(true);
            aVar.startAnimation(r2);
        }
    }

    public C2164a(Context context, String str, String str2, float[] fArr) {
        super(context);
        C2165a aVar = new C2165a(context, "AdChoices", str, fArr, str2);
        this.f6842a = aVar;
        addView(this.f6842a);
    }
}

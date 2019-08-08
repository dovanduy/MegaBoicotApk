package com.facebook.ads;

import android.content.Context;
import android.graphics.Paint;
import android.os.Handler;
import android.text.TextUtils;
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
import com.facebook.ads.internal.p093t.C1822e;
import com.facebook.ads.internal.p093t.C1834g;
import com.facebook.ads.internal.p115w.p117b.C2322j;
import com.facebook.ads.internal.p115w.p117b.C2342x;

@Deprecated
public class AdChoicesView extends RelativeLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final NativeAdBase f4594a;

    /* renamed from: b */
    private final float f4595b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f4596c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TextView f4597d;

    /* renamed from: e */
    private String f4598e;

    @Deprecated
    public AdChoicesView(Context context, NativeAdBase nativeAdBase) {
        this(context, nativeAdBase, false);
    }

    @Deprecated
    public AdChoicesView(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout) {
        this(context, nativeAdBase, false, nativeAdLayout);
    }

    @Deprecated
    public AdChoicesView(Context context, NativeAdBase nativeAdBase, boolean z) {
        this(context, nativeAdBase, z, null);
    }

    @Deprecated
    public AdChoicesView(Context context, NativeAdBase nativeAdBase, boolean z, NativeAdLayout nativeAdLayout) {
        super(context);
        boolean z2 = false;
        this.f4596c = false;
        this.f4594a = nativeAdBase;
        this.f4595b = C2342x.f7369b;
        this.f4594a.mo6927f().mo7736a(nativeAdLayout);
        if (!this.f4594a.isAdLoaded() || this.f4594a.mo6928g().mo7295g()) {
            this.f4598e = this.f4594a.getAdChoicesText();
            if (TextUtils.isEmpty(this.f4598e)) {
                this.f4598e = "AdChoices";
            }
            C1834g o = this.f4594a.mo6927f().mo7762o();
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            setOnTouchListener(new OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    if (AdChoicesView.this.f4596c) {
                        AdChoicesView.this.f4594a.mo6927f().mo7772y();
                    } else {
                        AdChoicesView.m6313c(AdChoicesView.this);
                    }
                    return true;
                }
            });
            this.f4597d = new TextView(getContext());
            addView(this.f4597d);
            LayoutParams layoutParams2 = new LayoutParams(-2, -2);
            if (!z || o == null) {
                z2 = true;
            } else {
                ImageView imageView = new ImageView(getContext());
                addView(imageView);
                LayoutParams layoutParams3 = new LayoutParams(Math.round(((float) o.mo7781b()) * this.f4595b), Math.round(((float) o.mo7782c()) * this.f4595b));
                layoutParams3.addRule(9);
                layoutParams3.addRule(15, -1);
                layoutParams3.setMargins(Math.round(4.0f * this.f4595b), Math.round(this.f4595b * 2.0f), Math.round(this.f4595b * 2.0f), Math.round(2.0f * this.f4595b));
                imageView.setLayoutParams(layoutParams3);
                C1822e.m7618a(o, imageView);
                layoutParams2.addRule(11, imageView.getId());
                layoutParams2.width = 0;
                layoutParams.width = Math.round(((float) (o.mo7781b() + 4)) * this.f4595b);
                layoutParams.height = Math.round(((float) (o.mo7782c() + 2)) * this.f4595b);
            }
            this.f4596c = z2;
            setLayoutParams(layoutParams);
            layoutParams2.addRule(15, -1);
            this.f4597d.setLayoutParams(layoutParams2);
            this.f4597d.setSingleLine();
            this.f4597d.setText(this.f4598e);
            this.f4597d.setTextSize(10.0f);
            this.f4597d.setTextColor(-4341303);
            C2322j.m9044a(this, C2322j.INTERNAL_AD_CHOICES_ICON);
            C2322j.m9044a(this.f4597d, C2322j.INTERNAL_AD_CHOICES_ICON);
            return;
        }
        setVisibility(8);
    }

    /* renamed from: c */
    static /* synthetic */ void m6313c(AdChoicesView adChoicesView) {
        Paint paint = new Paint();
        paint.setTextSize(adChoicesView.f4597d.getTextSize());
        int round = Math.round(paint.measureText(adChoicesView.f4598e) + (4.0f * adChoicesView.f4595b));
        final int width = adChoicesView.getWidth();
        final int i = round + width;
        adChoicesView.f4596c = true;
        C15162 r3 = new Animation() {
            /* access modifiers changed from: protected */
            public void applyTransformation(float f, Transformation transformation) {
                int i = (int) (((float) width) + (((float) (i - width)) * f));
                AdChoicesView.this.getLayoutParams().width = i;
                AdChoicesView.this.requestLayout();
                AdChoicesView.this.f4597d.getLayoutParams().width = i - width;
                AdChoicesView.this.f4597d.requestLayout();
            }

            public boolean willChangeBounds() {
                return true;
            }
        };
        r3.setAnimationListener(new AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        if (AdChoicesView.this.f4596c) {
                            AdChoicesView.m6315e(AdChoicesView.this);
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
        adChoicesView.startAnimation(r3);
    }

    /* renamed from: e */
    static /* synthetic */ void m6315e(AdChoicesView adChoicesView) {
        Paint paint = new Paint();
        paint.setTextSize(adChoicesView.f4597d.getTextSize());
        int round = Math.round(paint.measureText(adChoicesView.f4598e) + (4.0f * adChoicesView.f4595b));
        final int width = adChoicesView.getWidth();
        final int i = width - round;
        C15194 r2 = new Animation() {
            /* access modifiers changed from: protected */
            public void applyTransformation(float f, Transformation transformation) {
                int i = (int) (((float) width) + (((float) (i - width)) * f));
                AdChoicesView.this.getLayoutParams().width = i;
                AdChoicesView.this.requestLayout();
                AdChoicesView.this.f4597d.getLayoutParams().width = i - i;
                AdChoicesView.this.f4597d.requestLayout();
            }

            public boolean willChangeBounds() {
                return true;
            }
        };
        r2.setAnimationListener(new AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                AdChoicesView.this.f4596c = false;
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        r2.setDuration(300);
        r2.setFillAfter(true);
        adChoicesView.startAnimation(r2);
    }
}

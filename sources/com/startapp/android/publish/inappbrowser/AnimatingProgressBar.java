package com.startapp.android.publish.inappbrowser;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

/* compiled from: StartAppSDK */
public class AnimatingProgressBar extends ProgressBar {

    /* renamed from: a */
    private static final Interpolator f17495a = new AccelerateDecelerateInterpolator();

    /* renamed from: b */
    private ValueAnimator f17496b;

    /* renamed from: c */
    private boolean f17497c = false;

    public AnimatingProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        if (VERSION.SDK_INT >= 11) {
            z = true;
        }
        this.f17497c = z;
    }

    public void setProgress(int i) {
        if (!this.f17497c) {
            super.setProgress(i);
            return;
        }
        if (this.f17496b != null) {
            this.f17496b.cancel();
            if (getProgress() >= i) {
                return;
            }
        } else {
            this.f17496b = ValueAnimator.ofInt(new int[]{getProgress(), i});
            this.f17496b.setInterpolator(f17495a);
            this.f17496b.addUpdateListener(new AnimatorUpdateListener() {

                /* renamed from: a */
                Integer f17498a;

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f17498a = (Integer) valueAnimator.getAnimatedValue();
                    AnimatingProgressBar.super.setProgress(this.f17498a.intValue());
                }
            });
        }
        this.f17496b.setIntValues(new int[]{getProgress(), i});
        this.f17496b.start();
    }

    /* access modifiers changed from: protected */
    public ValueAnimator getAnimator() {
        return this.f17496b;
    }

    /* renamed from: a */
    public void mo20439a() {
        super.setProgress(0);
        if (this.f17496b != null) {
            this.f17496b.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f17496b != null) {
            this.f17496b.cancel();
        }
    }
}

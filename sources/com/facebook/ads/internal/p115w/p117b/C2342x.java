package com.facebook.ads.internal.p115w.p117b;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.w.b.x */
public class C2342x {

    /* renamed from: a */
    public static final DisplayMetrics f7368a = Resources.getSystem().getDisplayMetrics();

    /* renamed from: b */
    public static final float f7369b = f7368a.density;

    /* renamed from: c */
    private static final AtomicInteger f7370c = new AtomicInteger(1);

    /* renamed from: a */
    public static int m9079a() {
        int i;
        int i2;
        do {
            i = f7370c.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f7370c.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: a */
    public static int m9080a(int i) {
        return (int) TypedValue.applyDimension(2, (float) i, f7368a);
    }

    /* renamed from: a */
    public static void m9081a(View view) {
        view.setId(VERSION.SDK_INT >= 17 ? View.generateViewId() : m9079a());
    }

    /* renamed from: a */
    public static void m9082a(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(new ColorDrawable(i));
        } else {
            view.setBackgroundDrawable(new ColorDrawable(i));
        }
    }

    /* renamed from: a */
    public static void m9083a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m9084a(final View view, final View view2, final int i, final int i2) {
        if (view2 != null && view != null) {
            view.post(new Runnable() {
                public void run() {
                    Rect rect = new Rect();
                    view2.getHitRect(rect);
                    View view = (View) view2.getParent();
                    Rect rect2 = new Rect();
                    view.getGlobalVisibleRect(rect2);
                    Rect rect3 = new Rect();
                    view.getGlobalVisibleRect(rect3);
                    int i = rect2.left - rect3.left;
                    int i2 = rect2.top - rect3.top;
                    rect.left += i - i;
                    rect.top += i2 - i2;
                    rect.right += i + i;
                    rect.bottom += i2 + i2;
                    view.setTouchDelegate(new TouchDelegate(rect, view2));
                }
            });
        }
    }

    /* renamed from: a */
    public static void m9085a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT > 19) {
            m9086a(viewGroup, 200);
        }
    }

    /* renamed from: a */
    public static void m9086a(ViewGroup viewGroup, int i) {
        if (VERSION.SDK_INT > 19) {
            m9088a(viewGroup, (Transition) new AutoTransition(), i);
        }
    }

    /* renamed from: a */
    public static void m9087a(ViewGroup viewGroup, Transition transition) {
        if (VERSION.SDK_INT > 19) {
            m9088a(viewGroup, transition, 200);
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    private static void m9088a(ViewGroup viewGroup, Transition transition, int i) {
        transition.setDuration((long) i);
        transition.setInterpolator(new AccelerateDecelerateInterpolator());
        TransitionManager.beginDelayedTransition(viewGroup, transition);
    }

    /* renamed from: a */
    public static void m9089a(TextView textView, boolean z, int i) {
        Typeface typeface;
        Typeface typeface2;
        int i2 = 0;
        if (!z) {
            typeface2 = Typeface.SANS_SERIF;
        } else if (VERSION.SDK_INT >= 21) {
            typeface = Typeface.create("sans-serif-medium", 0);
            textView.setTypeface(typeface);
            textView.setTextSize(2, (float) i);
        } else {
            typeface2 = Typeface.SANS_SERIF;
            i2 = 1;
        }
        typeface = Typeface.create(typeface2, i2);
        textView.setTypeface(typeface);
        textView.setTextSize(2, (float) i);
    }

    /* renamed from: a */
    public static void m9090a(View... viewArr) {
        for (View b : viewArr) {
            m9091b(b);
        }
    }

    /* renamed from: b */
    public static void m9091b(View view) {
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }

    /* renamed from: c */
    public static void m9092c(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            m9085a((ViewGroup) parent);
        }
    }
}

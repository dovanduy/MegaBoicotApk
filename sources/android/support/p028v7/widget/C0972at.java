package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.p017v4.graphics.C0401a;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: android.support.v7.widget.at */
/* compiled from: ThemeUtils */
class C0972at {

    /* renamed from: a */
    static final int[] f3207a = {-16842910};

    /* renamed from: b */
    static final int[] f3208b = {16842908};

    /* renamed from: c */
    static final int[] f3209c = {16843518};

    /* renamed from: d */
    static final int[] f3210d = {16842919};

    /* renamed from: e */
    static final int[] f3211e = {16842912};

    /* renamed from: f */
    static final int[] f3212f = {16842913};

    /* renamed from: g */
    static final int[] f3213g = {-16842919, -16842908};

    /* renamed from: h */
    static final int[] f3214h = new int[0];

    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f3215i = new ThreadLocal<>();

    /* renamed from: j */
    private static final int[] f3216j = new int[1];

    /* renamed from: a */
    public static int m4355a(Context context, int i) {
        f3216j[0] = i;
        C0977ay a = C0977ay.m4366a(context, (AttributeSet) null, f3216j);
        try {
            return a.mo5089b(0, 0);
        } finally {
            a.mo5087a();
        }
    }

    /* renamed from: b */
    public static ColorStateList m4358b(Context context, int i) {
        f3216j[0] = i;
        C0977ay a = C0977ay.m4366a(context, (AttributeSet) null, f3216j);
        try {
            return a.mo5096e(0);
        } finally {
            a.mo5087a();
        }
    }

    /* renamed from: c */
    public static int m4359c(Context context, int i) {
        ColorStateList b = m4358b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f3207a, b.getDefaultColor());
        }
        TypedValue a = m4357a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m4356a(context, i, a.getFloat());
    }

    /* renamed from: a */
    private static TypedValue m4357a() {
        TypedValue typedValue = (TypedValue) f3215i.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f3215i.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    static int m4356a(Context context, int i, float f) {
        int a = m4355a(context, i);
        return C0401a.m1505b(a, Math.round(((float) Color.alpha(a)) * f));
    }
}

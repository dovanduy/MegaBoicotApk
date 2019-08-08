package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p017v4.content.p022a.C0350f;
import android.support.p017v4.content.p022a.C0350f.C0351a;
import android.support.p028v7.p031c.p032a.C0740a;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: android.support.v7.widget.ay */
/* compiled from: TintTypedArray */
public class C0977ay {

    /* renamed from: a */
    private final Context f3226a;

    /* renamed from: b */
    private final TypedArray f3227b;

    /* renamed from: c */
    private TypedValue f3228c;

    /* renamed from: a */
    public static C0977ay m4366a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0977ay(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0977ay m4367a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0977ay(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public static C0977ay m4365a(Context context, int i, int[] iArr) {
        return new C0977ay(context, context.obtainStyledAttributes(i, iArr));
    }

    private C0977ay(Context context, TypedArray typedArray) {
        this.f3226a = context;
        this.f3227b = typedArray;
    }

    /* renamed from: a */
    public Drawable mo5086a(int i) {
        if (this.f3227b.hasValue(i)) {
            int resourceId = this.f3227b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0740a.m3008b(this.f3226a, resourceId);
            }
        }
        return this.f3227b.getDrawable(i);
    }

    /* renamed from: b */
    public Drawable mo5090b(int i) {
        if (this.f3227b.hasValue(i)) {
            int resourceId = this.f3227b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C1007g.m4568a().mo5239a(this.f3226a, resourceId, true);
            }
        }
        return null;
    }

    /* renamed from: a */
    public Typeface mo5085a(int i, int i2, C0351a aVar) {
        int resourceId = this.f3227b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f3228c == null) {
            this.f3228c = new TypedValue();
        }
        return C0350f.m1293a(this.f3226a, resourceId, this.f3228c, i2, aVar);
    }

    /* renamed from: c */
    public CharSequence mo5092c(int i) {
        return this.f3227b.getText(i);
    }

    /* renamed from: d */
    public String mo5094d(int i) {
        return this.f3227b.getString(i);
    }

    /* renamed from: a */
    public boolean mo5088a(int i, boolean z) {
        return this.f3227b.getBoolean(i, z);
    }

    /* renamed from: a */
    public int mo5084a(int i, int i2) {
        return this.f3227b.getInt(i, i2);
    }

    /* renamed from: a */
    public float mo5083a(int i, float f) {
        return this.f3227b.getFloat(i, f);
    }

    /* renamed from: b */
    public int mo5089b(int i, int i2) {
        return this.f3227b.getColor(i, i2);
    }

    /* renamed from: e */
    public ColorStateList mo5096e(int i) {
        if (this.f3227b.hasValue(i)) {
            int resourceId = this.f3227b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C0740a.m3005a(this.f3226a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.f3227b.getColorStateList(i);
    }

    /* renamed from: c */
    public int mo5091c(int i, int i2) {
        return this.f3227b.getInteger(i, i2);
    }

    /* renamed from: d */
    public int mo5093d(int i, int i2) {
        return this.f3227b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: e */
    public int mo5095e(int i, int i2) {
        return this.f3227b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: f */
    public int mo5097f(int i, int i2) {
        return this.f3227b.getLayoutDimension(i, i2);
    }

    /* renamed from: g */
    public int mo5099g(int i, int i2) {
        return this.f3227b.getResourceId(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] mo5098f(int i) {
        return this.f3227b.getTextArray(i);
    }

    /* renamed from: g */
    public boolean mo5100g(int i) {
        return this.f3227b.hasValue(i);
    }

    /* renamed from: a */
    public void mo5087a() {
        this.f3227b.recycle();
    }
}

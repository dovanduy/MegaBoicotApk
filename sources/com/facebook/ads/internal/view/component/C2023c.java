package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p017v4.graphics.C0401a;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.view.component.c */
public class C2023c extends Button {

    /* renamed from: a */
    public static final int f6383a = ((int) (16.0f * C2342x.f7369b));

    /* renamed from: b */
    private static final int f6384b = ((int) (4.0f * C2342x.f7369b));

    /* renamed from: c */
    private final Paint f6385c;

    /* renamed from: d */
    private final RectF f6386d;

    /* renamed from: e */
    private final boolean f6387e;

    public C2023c(Context context, boolean z, boolean z2, C1597h hVar) {
        int i;
        int i2;
        super(context);
        this.f6387e = z;
        C2342x.m9089a((TextView) this, false, 16);
        setGravity(17);
        setPadding(f6383a, f6383a, f6383a, f6383a);
        if (hVar != null) {
            setTextColor(hVar.mo7176f(z2));
            i2 = hVar.mo7175e(z2);
            i = C0401a.m1503a(i2, -16777216, 0.1f);
        } else {
            setBackgroundColor(0);
            setTextColor(0);
            i2 = 0;
            i = 0;
        }
        this.f6385c = new Paint();
        setButtonColor(i2);
        this.f6386d = new RectF();
        if (!z) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(i));
            stateListDrawable.addState(new int[0], new ColorDrawable(i2));
            C2342x.m9083a((View) this, (Drawable) stateListDrawable);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f6387e) {
            this.f6386d.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            canvas.drawRoundRect(this.f6386d, (float) f6384b, (float) f6384b, this.f6385c);
        }
        super.onDraw(canvas);
    }

    public void setButtonColor(int i) {
        this.f6385c.setStyle(Style.FILL);
        this.f6385c.setColor(i);
    }

    public void setText(String str) {
        super.setText(str.toUpperCase(Locale.US));
    }
}

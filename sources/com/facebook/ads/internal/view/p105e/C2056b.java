package com.facebook.ads.internal.view.p105e;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.p115w.p117b.C2342x;

/* renamed from: com.facebook.ads.internal.view.e.b */
public class C2056b extends RelativeLayout {

    /* renamed from: a */
    private final Paint f6535a = new Paint();

    /* renamed from: b */
    private final RectF f6536b;

    public C2056b(Context context, String str) {
        super(context);
        float f = context.getResources().getDisplayMetrics().density;
        TextView textView = new TextView(context);
        textView.setTextColor(-16777216);
        textView.setTextSize(16.0f);
        textView.setText(str);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        int i = (int) (6.0f * f);
        textView.setPadding(i, i, i, i);
        addView(textView);
        this.f6535a.setStyle(Style.FILL);
        this.f6535a.setColor(-1);
        this.f6536b = new RectF();
        C2342x.m9082a((View) this, 0);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f6536b.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        float f2 = 10.0f * f;
        canvas.drawRoundRect(this.f6536b, f2, f2, this.f6535a);
        super.onDraw(canvas);
    }
}

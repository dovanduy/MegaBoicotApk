package com.facebook.share.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.common.C2454a.C2455a;
import com.facebook.common.C2454a.C2456b;

@Deprecated
/* renamed from: com.facebook.share.internal.b */
/* compiled from: LikeBoxCountView */
public class C2701b extends FrameLayout {

    /* renamed from: a */
    private TextView f8390a;

    /* renamed from: b */
    private C2703a f8391b = C2703a.LEFT;

    /* renamed from: c */
    private float f8392c;

    /* renamed from: d */
    private float f8393d;

    /* renamed from: e */
    private float f8394e;

    /* renamed from: f */
    private Paint f8395f;

    /* renamed from: g */
    private int f8396g;

    /* renamed from: h */
    private int f8397h;

    /* renamed from: com.facebook.share.internal.b$a */
    /* compiled from: LikeBoxCountView */
    public enum C2703a {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    @Deprecated
    public C2701b(Context context) {
        super(context);
        m10325a(context);
    }

    @Deprecated
    public void setText(String str) {
        this.f8390a.setText(str);
    }

    @Deprecated
    public void setCaretPosition(C2703a aVar) {
        this.f8391b = aVar;
        switch (aVar) {
            case LEFT:
                m10324a(this.f8397h, 0, 0, 0);
                return;
            case TOP:
                m10324a(0, this.f8397h, 0, 0);
                return;
            case RIGHT:
                m10324a(0, 0, this.f8397h, 0);
                return;
            case BOTTOM:
                m10324a(0, 0, 0, this.f8397h);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        switch (this.f8391b) {
            case LEFT:
                paddingLeft = (int) (((float) paddingLeft) + this.f8392c);
                break;
            case TOP:
                paddingTop = (int) (((float) paddingTop) + this.f8392c);
                break;
            case RIGHT:
                width = (int) (((float) width) - this.f8392c);
                break;
            case BOTTOM:
                height = (int) (((float) height) - this.f8392c);
                break;
        }
        m10326a(canvas, (float) paddingLeft, (float) paddingTop, (float) width, (float) height);
    }

    /* renamed from: a */
    private void m10325a(Context context) {
        setWillNotDraw(false);
        this.f8392c = getResources().getDimension(C2456b.com_facebook_likeboxcountview_caret_height);
        this.f8393d = getResources().getDimension(C2456b.com_facebook_likeboxcountview_caret_width);
        this.f8394e = getResources().getDimension(C2456b.com_facebook_likeboxcountview_border_radius);
        this.f8395f = new Paint();
        this.f8395f.setColor(getResources().getColor(C2455a.com_facebook_likeboxcountview_border_color));
        this.f8395f.setStrokeWidth(getResources().getDimension(C2456b.com_facebook_likeboxcountview_border_width));
        this.f8395f.setStyle(Style.STROKE);
        m10327b(context);
        addView(this.f8390a);
        setCaretPosition(this.f8391b);
    }

    /* renamed from: b */
    private void m10327b(Context context) {
        this.f8390a = new TextView(context);
        this.f8390a.setLayoutParams(new LayoutParams(-1, -1));
        this.f8390a.setGravity(17);
        this.f8390a.setTextSize(0, getResources().getDimension(C2456b.com_facebook_likeboxcountview_text_size));
        this.f8390a.setTextColor(getResources().getColor(C2455a.com_facebook_likeboxcountview_text_color));
        this.f8396g = getResources().getDimensionPixelSize(C2456b.com_facebook_likeboxcountview_text_padding);
        this.f8397h = getResources().getDimensionPixelSize(C2456b.com_facebook_likeboxcountview_caret_height);
    }

    /* renamed from: a */
    private void m10324a(int i, int i2, int i3, int i4) {
        this.f8390a.setPadding(this.f8396g + i, this.f8396g + i2, this.f8396g + i3, this.f8396g + i4);
    }

    /* renamed from: a */
    private void m10326a(Canvas canvas, float f, float f2, float f3, float f4) {
        Path path = new Path();
        float f5 = this.f8394e * 2.0f;
        float f6 = f + f5;
        float f7 = f2 + f5;
        path.addArc(new RectF(f, f2, f6, f7), -180.0f, 90.0f);
        if (this.f8391b == C2703a.TOP) {
            float f8 = f3 - f;
            path.lineTo(((f8 - this.f8393d) / 2.0f) + f, f2);
            path.lineTo((f8 / 2.0f) + f, f2 - this.f8392c);
            path.lineTo(((f8 + this.f8393d) / 2.0f) + f, f2);
        }
        path.lineTo(f3 - this.f8394e, f2);
        float f9 = f3 - f5;
        path.addArc(new RectF(f9, f2, f3, f7), -90.0f, 90.0f);
        if (this.f8391b == C2703a.RIGHT) {
            float f10 = f4 - f2;
            path.lineTo(f3, ((f10 - this.f8393d) / 2.0f) + f2);
            path.lineTo(this.f8392c + f3, (f10 / 2.0f) + f2);
            path.lineTo(f3, ((f10 + this.f8393d) / 2.0f) + f2);
        }
        path.lineTo(f3, f4 - this.f8394e);
        float f11 = f4 - f5;
        path.addArc(new RectF(f9, f11, f3, f4), 0.0f, 90.0f);
        if (this.f8391b == C2703a.BOTTOM) {
            float f12 = f3 - f;
            path.lineTo(((this.f8393d + f12) / 2.0f) + f, f4);
            path.lineTo((f12 / 2.0f) + f, this.f8392c + f4);
            path.lineTo(((f12 - this.f8393d) / 2.0f) + f, f4);
        }
        path.lineTo(this.f8394e + f, f4);
        path.addArc(new RectF(f, f11, f6, f4), 90.0f, 90.0f);
        if (this.f8391b == C2703a.LEFT) {
            float f13 = f4 - f2;
            path.lineTo(f, ((this.f8393d + f13) / 2.0f) + f2);
            path.lineTo(f - this.f8392c, (f13 / 2.0f) + f2);
            path.lineTo(f, ((f13 - this.f8393d) / 2.0f) + f2);
        }
        path.lineTo(f, f2 + this.f8394e);
        canvas.drawPath(path, this.f8395f);
    }
}

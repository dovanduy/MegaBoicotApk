package com.facebook.ads.internal.view.p110i.p113c;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.view.p110i.C2110a;
import com.facebook.ads.internal.view.p110i.p111a.C2117b;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2136d;
import com.facebook.ads.internal.view.p110i.p112b.C2145m;
import com.facebook.ads.internal.view.p110i.p112b.C2146n;
import com.facebook.ads.internal.view.p110i.p112b.C2147o;
import com.facebook.ads.internal.view.p110i.p112b.C2148p;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.view.i.c.j */
public class C2206j extends View implements C2117b {

    /* renamed from: a */
    private final Paint f6934a;

    /* renamed from: b */
    private final Paint f6935b;

    /* renamed from: c */
    private final Paint f6936c;

    /* renamed from: d */
    private C2210a f6937d = C2210a.CLOSE_BUTTON_MODE;

    /* renamed from: e */
    private final Paint f6938e;

    /* renamed from: f */
    private final RectF f6939f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2110a f6940g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f6941h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final AtomicInteger f6942i = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final AtomicBoolean f6943j = new AtomicBoolean(false);

    /* renamed from: k */
    private final C2146n f6944k = new C2146n() {
        /* renamed from: a */
        public void mo6895a(C2145m mVar) {
            C2206j.this.f6943j.set(true);
        }
    };

    /* renamed from: l */
    private final C2148p f6945l = new C2148p() {
        /* renamed from: a */
        public void mo6895a(C2147o oVar) {
            if (C2206j.this.f6940g != null) {
                int c = C2206j.this.f6941h;
                int duration = C2206j.this.f6940g.getDuration();
                if (c <= 0) {
                    C2206j.this.f6942i.set(0);
                } else {
                    int min = Math.min(duration, c * AdError.NETWORK_ERROR_CODE);
                    if (min != 0) {
                        C2206j.this.f6942i.set(((min - C2206j.this.f6940g.getCurrentPositionInMillis()) * 100) / min);
                    } else {
                        return;
                    }
                }
                C2206j.this.postInvalidate();
            }
        }
    };

    /* renamed from: m */
    private final C2136d f6946m = new C2136d() {
        /* renamed from: a */
        public void mo6895a(C2135c cVar) {
            C2206j.this.f6941h = 0;
            C2206j.this.f6942i.set(0);
            C2206j.this.postInvalidate();
        }
    };

    /* renamed from: com.facebook.ads.internal.view.i.c.j$a */
    public enum C2210a {
        CLOSE_BUTTON_MODE,
        SKIP_BUTTON_MODE
    }

    public C2206j(Context context, int i, int i2) {
        super(context);
        float f = getResources().getDisplayMetrics().density;
        this.f6941h = i;
        this.f6935b = new Paint();
        this.f6935b.setStyle(Style.FILL);
        this.f6935b.setColor(i2);
        this.f6936c = new Paint();
        this.f6936c.setColor(-1);
        this.f6936c.setAlpha(230);
        this.f6936c.setStyle(Style.FILL);
        this.f6936c.setStrokeWidth(1.0f * f);
        this.f6936c.setAntiAlias(true);
        this.f6934a = new Paint();
        this.f6934a.setColor(-16777216);
        this.f6934a.setStyle(Style.STROKE);
        this.f6934a.setAlpha(102);
        this.f6934a.setStrokeWidth(1.5f * f);
        this.f6934a.setAntiAlias(true);
        setLayerType(1, null);
        this.f6934a.setMaskFilter(new BlurMaskFilter(6.0f, Blur.NORMAL));
        this.f6938e = new Paint();
        this.f6938e.setColor(-10066330);
        this.f6938e.setStyle(Style.STROKE);
        this.f6938e.setStrokeWidth(2.0f * f);
        this.f6938e.setAntiAlias(true);
        this.f6939f = new RectF();
    }

    /* renamed from: a */
    public void mo8356a(C2110a aVar) {
        this.f6940g = aVar;
        this.f6940g.getEventBus().mo7626a((T[]) new C1779f[]{this.f6944k, this.f6945l, this.f6946m});
    }

    /* renamed from: a */
    public boolean mo8512a() {
        return this.f6940g != null && (this.f6941h <= 0 || this.f6942i.get() < 0);
    }

    /* renamed from: b */
    public void mo8360b(C2110a aVar) {
        this.f6940g.getEventBus().mo7628b((T[]) new C1779f[]{this.f6946m, this.f6945l, this.f6944k});
        this.f6940g = null;
    }

    public int getSkipSeconds() {
        return this.f6941h;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.f6943j.get()) {
            super.onDraw(canvas);
            return;
        }
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        int i = min / 2;
        float f = (float) i;
        canvas.drawCircle((float) (getPaddingLeft() + i), (float) (getPaddingTop() + i), f, this.f6934a);
        canvas.drawCircle((float) (getPaddingLeft() + i), (float) (getPaddingTop() + i), f, this.f6936c);
        if (this.f6942i.get() > 0) {
            this.f6939f.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
            canvas.drawArc(this.f6939f, -90.0f, ((float) (-(this.f6942i.get() * 360))) / 100.0f, true, this.f6935b);
        } else if (this.f6937d == C2210a.SKIP_BUTTON_MODE) {
            int i2 = min / 4;
            int i3 = min / 3;
            Path path = new Path();
            path.moveTo((float) (getPaddingLeft() + i2), (float) (getPaddingTop() + i3));
            path.lineTo((float) (getPaddingLeft() + i), (float) (getPaddingTop() + i));
            int i4 = i3 * 2;
            path.lineTo((float) (getPaddingLeft() + i2), (float) (getPaddingTop() + i4));
            canvas.drawPath(path, this.f6938e);
            Path path2 = new Path();
            path2.moveTo((float) (getPaddingLeft() + i), (float) (i3 + getPaddingTop()));
            path2.lineTo((float) ((i2 * 3) + getPaddingLeft()), (float) (getPaddingTop() + i));
            path2.lineTo((float) (i + getPaddingLeft()), (float) (i4 + getPaddingTop()));
            canvas.drawPath(path2, this.f6938e);
        } else {
            int i5 = min / 3;
            int i6 = i5 * 2;
            Canvas canvas2 = canvas;
            canvas2.drawLine((float) (getPaddingLeft() + i5), (float) (getPaddingTop() + i5), (float) (getPaddingLeft() + i6), (float) (getPaddingTop() + i6), this.f6938e);
            canvas.drawLine((float) (getPaddingLeft() + i6), (float) (getPaddingTop() + i5), (float) (i5 + getPaddingLeft()), (float) (i6 + getPaddingTop()), this.f6938e);
        }
        super.onDraw(canvas);
    }

    public void setButtonMode(C2210a aVar) {
        this.f6937d = aVar;
    }
}

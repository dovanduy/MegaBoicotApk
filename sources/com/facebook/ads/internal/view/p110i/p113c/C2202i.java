package com.facebook.ads.internal.view.p110i.p113c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.p110i.p111a.C2118c;
import com.facebook.ads.internal.view.p110i.p112b.C2147o;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.view.i.c.i */
public class C2202i extends C2118c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2205a f6923a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f6924b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f6925c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f6926d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f6927e;

    /* renamed from: f */
    private final C1779f<C2147o> f6928f = new C1779f<C2147o>() {
        /* renamed from: a */
        public Class<C2147o> mo7260a() {
            return C2147o.class;
        }

        /* renamed from: a */
        public void mo6895a(C2147o oVar) {
            if (!C2202i.this.f6927e.get() && C2202i.this.getVideoView() != null) {
                int c = C2202i.this.f6924b - (C2202i.this.getVideoView().getCurrentPositionInMillis() / AdError.NETWORK_ERROR_CODE);
                if (c > 0) {
                    C2205a f = C2202i.this.f6923a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C2202i.this.f6925c);
                    sb.append(' ');
                    sb.append(c);
                    f.setText(sb.toString());
                    return;
                }
                C2202i.this.f6923a.setText(C2202i.this.f6926d);
                C2202i.this.f6927e.set(true);
            }
        }
    };

    /* renamed from: com.facebook.ads.internal.view.i.c.i$a */
    private static class C2205a extends TextView {

        /* renamed from: a */
        private final Paint f6931a = new Paint();

        /* renamed from: b */
        private final Paint f6932b;

        /* renamed from: c */
        private final RectF f6933c;

        public C2205a(Context context) {
            super(context);
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            C2342x.m9082a((View) this, 0);
            setTextColor(-3355444);
            setPadding((int) (displayMetrics.density * 9.0f), (int) (displayMetrics.density * 5.0f), (int) (9.0f * displayMetrics.density), (int) (5.0f * displayMetrics.density));
            setTextSize(18.0f);
            this.f6931a.setStyle(Style.STROKE);
            this.f6931a.setColor(-10066330);
            this.f6931a.setStrokeWidth(1.0f);
            this.f6931a.setAntiAlias(true);
            this.f6932b = new Paint();
            this.f6932b.setStyle(Style.FILL);
            this.f6932b.setColor(-1895825408);
            this.f6933c = new RectF();
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            if (getText().length() != 0) {
                int width = getWidth();
                int height = getHeight();
                float f = (float) 0;
                this.f6933c.set(f, f, (float) width, (float) height);
                canvas.drawRoundRect(this.f6933c, 6.0f, 6.0f, this.f6932b);
                float f2 = (float) 2;
                this.f6933c.set(f2, f2, (float) (width - 2), (float) (height - 2));
                canvas.drawRoundRect(this.f6933c, 6.0f, 6.0f, this.f6931a);
                super.onDraw(canvas);
            }
        }
    }

    public C2202i(Context context, int i, String str, String str2) {
        super(context);
        this.f6924b = i;
        this.f6925c = str;
        this.f6926d = str2;
        this.f6927e = new AtomicBoolean(false);
        this.f6923a = new C2205a(context);
        C2205a aVar = this.f6923a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6925c);
        sb.append(' ');
        sb.append(i);
        aVar.setText(sb.toString());
        addView(this.f6923a, new LayoutParams(-2, -2));
    }

    /* renamed from: a */
    public void mo8425a() {
        super.mo8425a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo7627a(this.f6928f);
        }
        this.f6923a.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!C2202i.this.f6927e.get()) {
                    Log.i("SkipPlugin", "User clicked skip before the ads is allowed to skip.");
                    return;
                }
                if (C2202i.this.getVideoView() != null) {
                    C2202i.this.getVideoView().mo8387f();
                }
            }
        });
    }

    /* renamed from: b */
    public void mo8426b() {
        if (getVideoView() != null) {
            this.f6923a.setOnClickListener(null);
            getVideoView().getEventBus().mo7629b(this.f6928f);
        }
        super.mo8426b();
    }
}

package com.facebook.ads.internal.view.p110i.p113c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.p070a.C1563b;
import com.facebook.ads.internal.p070a.C1564c;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.p110i.p111a.C2118c;
import com.facebook.ads.internal.view.p110i.p112b.C2134b;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.view.i.c.e */
public class C2189e extends C2118c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f6896a;

    /* renamed from: b */
    private final TextView f6897b = new TextView(getContext());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1802c f6898c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f6899d;

    /* renamed from: e */
    private final Paint f6900e;

    /* renamed from: f */
    private final RectF f6901f;

    public C2189e(Context context, String str, C1802c cVar, String str2, String str3) {
        super(context);
        this.f6896a = str;
        this.f6898c = cVar;
        this.f6899d = str2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f6897b.setTextColor(-3355444);
        this.f6897b.setTextSize(16.0f);
        this.f6897b.setPadding((int) (displayMetrics.density * 6.0f), (int) (displayMetrics.density * 4.0f), (int) (6.0f * displayMetrics.density), (int) (4.0f * displayMetrics.density));
        this.f6900e = new Paint();
        this.f6900e.setStyle(Style.FILL);
        this.f6900e.setColor(-16777216);
        this.f6900e.setAlpha(178);
        this.f6901f = new RectF();
        C2342x.m9082a((View) this, 0);
        this.f6897b.setText(str3);
        addView(this.f6897b, new LayoutParams(-2, -2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8425a() {
        super.mo8425a();
        this.f6897b.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C2189e.this.getVideoView() != null) {
                    Uri parse = Uri.parse(C2189e.this.f6896a);
                    C2189e.this.getVideoView().getEventBus().mo7625a(new C2134b(parse));
                    C1563b a = C1564c.m6493a(C2189e.this.getContext(), C2189e.this.f6898c, C2189e.this.f6899d, parse, new HashMap());
                    if (a != null) {
                        a.mo7058a();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8426b() {
        this.f6897b.setOnClickListener(null);
        super.mo8426b();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f6901f.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        canvas.drawRoundRect(this.f6901f, 0.0f, 0.0f, this.f6900e);
        super.onDraw(canvas);
    }
}

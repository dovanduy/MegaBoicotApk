package com.facebook.ads.internal.view.p105e;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.p070a.C1563b;
import com.facebook.ads.internal.p070a.C1564c;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.p110i.C2110a;
import com.facebook.ads.internal.view.p110i.p112b.C2134b;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.view.e.a */
public class C2039a extends RelativeLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2341w f6447a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f6448b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2110a f6449c;

    /* renamed from: d */
    private final Paint f6450d = new Paint();

    /* renamed from: e */
    private final RectF f6451e;

    public C2039a(Context context, C2341w wVar, String str, String str2, int i, C2110a aVar, final C1802c cVar, final String str3) {
        super(context);
        this.f6447a = wVar;
        this.f6448b = str;
        this.f6449c = aVar;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(16.0f);
        textView.setText(str2);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        addView(textView);
        this.f6450d.setStyle(Style.FILL);
        this.f6450d.setColor(i);
        this.f6451e = new RectF();
        C2342x.m9082a((View) this, 0);
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                String str;
                String str2;
                try {
                    Uri parse = Uri.parse(C2039a.this.f6448b);
                    C2039a.this.f6449c.getEventBus().mo7625a(new C2134b(parse));
                    HashMap hashMap = new HashMap();
                    hashMap.put("touch", C2323k.m9046a(C2039a.this.f6447a.mo8743e()));
                    C1563b a = C1564c.m6493a(C2039a.this.getContext(), cVar, str3, parse, hashMap);
                    if (a != null) {
                        a.mo7058a();
                    }
                } catch (ActivityNotFoundException e) {
                    e = e;
                    str2 = String.valueOf(C2039a.class);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error while opening ");
                    sb.append(C2039a.this.f6448b);
                    str = sb.toString();
                    Log.e(str2, str, e);
                } catch (Exception e2) {
                    e = e2;
                    str2 = String.valueOf(C2039a.class);
                    str = "Error executing action";
                    Log.e(str2, str, e);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f6451e.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        float f2 = 10.0f * f;
        canvas.drawRoundRect(this.f6451e, f2, f2, this.f6450d);
        super.onDraw(canvas);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f6447a.mo8738a(motionEvent, getRootView(), this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}

package com.facebook.ads.internal.view.p110i.p113c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.facebook.ads.internal.p115w.p118c.C2347b;
import com.facebook.ads.internal.p115w.p118c.C2348c;
import com.facebook.ads.internal.view.p110i.C2110a;
import com.facebook.ads.internal.view.p110i.p111a.C2117b;
import com.facebook.ads.internal.view.p110i.p112b.C2155w;
import com.facebook.ads.internal.view.p110i.p112b.C2156x;

/* renamed from: com.facebook.ads.internal.view.i.c.f */
public class C2191f extends ImageView implements C2117b {

    /* renamed from: a */
    private static final int f6903a = ((int) (4.0f * Resources.getSystem().getDisplayMetrics().density));

    /* renamed from: b */
    private final Paint f6904b = new Paint();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2110a f6905c;

    /* renamed from: d */
    private final C2156x f6906d = new C2156x() {
        /* renamed from: a */
        public void mo6895a(C2155w wVar) {
            C2191f.this.mo8495a();
        }
    };

    public C2191f(Context context) {
        super(context);
        this.f6904b.setColor(-1728053248);
        setColorFilter(-1);
        setPadding(f6903a, f6903a, f6903a, f6903a);
        m8711c();
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C2110a a;
                float f;
                if (C2191f.this.f6905c != null) {
                    if (C2191f.this.m8709b()) {
                        a = C2191f.this.f6905c;
                        f = 1.0f;
                    } else {
                        a = C2191f.this.f6905c;
                        f = 0.0f;
                    }
                    a.setVolume(f);
                    C2191f.this.mo8495a();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m8709b() {
        return this.f6905c != null && this.f6905c.getVolume() == 0.0f;
    }

    /* renamed from: c */
    private void m8711c() {
        setImageBitmap(C2348c.m9100a(C2347b.SOUND_ON));
    }

    /* renamed from: a */
    public final void mo8495a() {
        if (this.f6905c != null) {
            if (m8709b()) {
                setImageBitmap(C2348c.m9100a(C2347b.SOUND_OFF));
            } else {
                m8711c();
            }
        }
    }

    /* renamed from: a */
    public void mo8356a(C2110a aVar) {
        this.f6905c = aVar;
        if (this.f6905c != null) {
            this.f6905c.getEventBus().mo7627a(this.f6906d);
        }
    }

    /* renamed from: b */
    public void mo8360b(C2110a aVar) {
        if (this.f6905c != null) {
            this.f6905c.getEventBus().mo7629b(this.f6906d);
        }
        this.f6905c = null;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        canvas.drawCircle((float) width, (float) height, (float) Math.min(width, height), this.f6904b);
        super.onDraw(canvas);
    }
}

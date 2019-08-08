package com.facebook.ads.internal.view.p110i.p113c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.view.View;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.view.p110i.C2110a;
import com.facebook.ads.internal.view.p110i.p111a.C2117b;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2136d;
import com.facebook.ads.internal.view.p110i.p112b.C2147o;
import com.facebook.ads.internal.view.p110i.p112b.C2148p;

/* renamed from: com.facebook.ads.internal.view.i.c.n */
public class C2221n extends View implements C2117b {

    /* renamed from: a */
    private final Paint f6972a = new Paint();

    /* renamed from: b */
    private final Rect f6973b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public float f6974c;

    /* renamed from: d */
    private final C2148p f6975d = new C2148p() {
        /* renamed from: a */
        public void mo6895a(C2147o oVar) {
            if (C2221n.this.f6977f != null) {
                int duration = C2221n.this.f6977f.getDuration();
                if (duration > 0) {
                    C2221n.this.f6974c = ((float) C2221n.this.f6977f.getCurrentPositionInMillis()) / ((float) duration);
                } else {
                    C2221n.this.f6974c = 0.0f;
                }
                C2221n.this.postInvalidate();
            }
        }
    };

    /* renamed from: e */
    private final C2136d f6976e = new C2136d() {
        /* renamed from: a */
        public void mo6895a(C2135c cVar) {
            if (C2221n.this.f6977f != null) {
                C2221n.this.f6974c = 0.0f;
                C2221n.this.postInvalidate();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2110a f6977f;

    public C2221n(Context context) {
        super(context);
        this.f6972a.setStyle(Style.FILL);
        this.f6972a.setColor(-9528840);
        this.f6973b = new Rect();
    }

    /* renamed from: a */
    public void mo8356a(C2110a aVar) {
        this.f6977f = aVar;
        aVar.getEventBus().mo7626a((T[]) new C1779f[]{this.f6975d, this.f6976e});
    }

    /* renamed from: b */
    public void mo8360b(C2110a aVar) {
        aVar.getEventBus().mo7628b((T[]) new C1779f[]{this.f6976e, this.f6975d});
        this.f6977f = null;
    }

    public void draw(Canvas canvas) {
        this.f6973b.set(0, 0, (int) (((float) getWidth()) * this.f6974c), getHeight());
        canvas.drawRect(this.f6973b, this.f6972a);
        super.draw(canvas);
    }
}

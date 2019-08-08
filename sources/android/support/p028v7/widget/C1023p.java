package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: android.support.v7.widget.p */
/* compiled from: CardViewBaseImpl */
class C1023p implements C1026r {

    /* renamed from: a */
    final RectF f3388a = new RectF();

    /* renamed from: g */
    public void mo5301g(C1025q qVar) {
    }

    C1023p() {
    }

    /* renamed from: a */
    public void mo5289a() {
        C0957am.f3134a = new C0958a() {
            /* renamed from: a */
            public void mo5015a(Canvas canvas, RectF rectF, float f, Paint paint) {
                Canvas canvas2 = canvas;
                RectF rectF2 = rectF;
                float f2 = 2.0f * f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = (rectF.height() - f2) - 1.0f;
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    float f4 = -f3;
                    C1023p.this.f3388a.set(f4, f4, f3, f3);
                    int save = canvas.save();
                    canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                    canvas2.drawArc(C1023p.this.f3388a, 180.0f, 90.0f, true, paint);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    Paint paint2 = paint;
                    canvas2.drawArc(C1023p.this.f3388a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(height, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas2.drawArc(C1023p.this.f3388a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas2.drawArc(C1023p.this.f3388a, 180.0f, 90.0f, true, paint2);
                    canvas2.restoreToCount(save);
                    canvas2.drawRect((rectF2.left + f3) - 1.0f, rectF2.top, (rectF2.right - f3) + 1.0f, rectF2.top + f3, paint);
                    canvas2.drawRect((rectF2.left + f3) - 1.0f, rectF2.bottom - f3, (rectF2.right - f3) + 1.0f, rectF2.bottom, paint);
                }
                canvas2.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
            }
        };
    }

    /* renamed from: a */
    public void mo5292a(C1025q qVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0957am a = m4688a(context, colorStateList, f, f2, f3);
        a.mo4999a(qVar.mo3786b());
        qVar.mo3784a(a);
        mo5304f(qVar);
    }

    /* renamed from: a */
    private C0957am m4688a(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0957am amVar = new C0957am(context.getResources(), colorStateList, f, f2, f3);
        return amVar;
    }

    /* renamed from: f */
    public void mo5304f(C1025q qVar) {
        Rect rect = new Rect();
        m4689j(qVar).mo4998a(rect);
        qVar.mo3782a((int) Math.ceil((double) mo5294b(qVar)), (int) Math.ceil((double) mo5296c(qVar)));
        qVar.mo3783a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: h */
    public void mo5302h(C1025q qVar) {
        m4689j(qVar).mo4999a(qVar.mo3786b());
        mo5304f(qVar);
    }

    /* renamed from: a */
    public void mo5293a(C1025q qVar, ColorStateList colorStateList) {
        m4689j(qVar).mo4997a(colorStateList);
    }

    /* renamed from: i */
    public ColorStateList mo5303i(C1025q qVar) {
        return m4689j(qVar).mo5007f();
    }

    /* renamed from: a */
    public void mo5291a(C1025q qVar, float f) {
        m4689j(qVar).mo4996a(f);
        mo5304f(qVar);
    }

    /* renamed from: d */
    public float mo5298d(C1025q qVar) {
        return m4689j(qVar).mo4995a();
    }

    /* renamed from: c */
    public void mo5297c(C1025q qVar, float f) {
        m4689j(qVar).mo5001b(f);
    }

    /* renamed from: e */
    public float mo5299e(C1025q qVar) {
        return m4689j(qVar).mo5000b();
    }

    /* renamed from: b */
    public void mo5295b(C1025q qVar, float f) {
        m4689j(qVar).mo5003c(f);
        mo5304f(qVar);
    }

    /* renamed from: a */
    public float mo5290a(C1025q qVar) {
        return m4689j(qVar).mo5002c();
    }

    /* renamed from: b */
    public float mo5294b(C1025q qVar) {
        return m4689j(qVar).mo5004d();
    }

    /* renamed from: c */
    public float mo5296c(C1025q qVar) {
        return m4689j(qVar).mo5006e();
    }

    /* renamed from: j */
    private C0957am m4689j(C1025q qVar) {
        return (C0957am) qVar.mo3787c();
    }
}

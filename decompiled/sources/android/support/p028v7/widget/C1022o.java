package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: android.support.v7.widget.o */
/* compiled from: CardViewApi21Impl */
class C1022o implements C1026r {
    /* renamed from: a */
    public void mo5289a() {
    }

    C1022o() {
    }

    /* renamed from: a */
    public void mo5292a(C1025q qVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        qVar.mo3784a(new C0956al(colorStateList, f));
        View d = qVar.mo3788d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        mo5295b(qVar, f3);
    }

    /* renamed from: a */
    public void mo5291a(C1025q qVar, float f) {
        m4672j(qVar).mo4980a(f);
    }

    /* renamed from: b */
    public void mo5295b(C1025q qVar, float f) {
        m4672j(qVar).mo4981a(f, qVar.mo3785a(), qVar.mo3786b());
        mo5300f(qVar);
    }

    /* renamed from: a */
    public float mo5290a(C1025q qVar) {
        return m4672j(qVar).mo4979a();
    }

    /* renamed from: b */
    public float mo5294b(C1025q qVar) {
        return mo5298d(qVar) * 2.0f;
    }

    /* renamed from: c */
    public float mo5296c(C1025q qVar) {
        return mo5298d(qVar) * 2.0f;
    }

    /* renamed from: d */
    public float mo5298d(C1025q qVar) {
        return m4672j(qVar).mo4983b();
    }

    /* renamed from: c */
    public void mo5297c(C1025q qVar, float f) {
        qVar.mo3788d().setElevation(f);
    }

    /* renamed from: e */
    public float mo5299e(C1025q qVar) {
        return qVar.mo3788d().getElevation();
    }

    /* renamed from: f */
    public void mo5300f(C1025q qVar) {
        if (!qVar.mo3785a()) {
            qVar.mo3783a(0, 0, 0, 0);
            return;
        }
        float a = mo5290a(qVar);
        float d = mo5298d(qVar);
        int ceil = (int) Math.ceil((double) C0957am.m4259b(a, d, qVar.mo3786b()));
        int ceil2 = (int) Math.ceil((double) C0957am.m4256a(a, d, qVar.mo3786b()));
        qVar.mo3783a(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: g */
    public void mo5301g(C1025q qVar) {
        mo5295b(qVar, mo5290a(qVar));
    }

    /* renamed from: h */
    public void mo5302h(C1025q qVar) {
        mo5295b(qVar, mo5290a(qVar));
    }

    /* renamed from: a */
    public void mo5293a(C1025q qVar, ColorStateList colorStateList) {
        m4672j(qVar).mo4982a(colorStateList);
    }

    /* renamed from: i */
    public ColorStateList mo5303i(C1025q qVar) {
        return m4672j(qVar).mo4984c();
    }

    /* renamed from: j */
    private C0956al m4672j(C1025q qVar) {
        return (C0956al) qVar.mo3787c();
    }
}

package android.support.p028v7.widget;

import android.support.p028v7.widget.RecyclerView.C0875f;
import android.support.p028v7.widget.RecyclerView.C0875f.C0878c;
import android.support.p028v7.widget.RecyclerView.C0901v;
import android.view.View;

/* renamed from: android.support.v7.widget.aq */
/* compiled from: SimpleItemAnimator */
public abstract class C0966aq extends C0875f {

    /* renamed from: h */
    boolean f3180h = true;

    /* renamed from: a */
    public abstract boolean mo5048a(C0901v vVar);

    /* renamed from: a */
    public abstract boolean mo5049a(C0901v vVar, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo5050a(C0901v vVar, C0901v vVar2, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract boolean mo5052b(C0901v vVar);

    /* renamed from: c */
    public void mo5053c(C0901v vVar, boolean z) {
    }

    /* renamed from: d */
    public void mo5054d(C0901v vVar, boolean z) {
    }

    /* renamed from: o */
    public void mo5061o(C0901v vVar) {
    }

    /* renamed from: p */
    public void mo5062p(C0901v vVar) {
    }

    /* renamed from: q */
    public void mo5063q(C0901v vVar) {
    }

    /* renamed from: r */
    public void mo5064r(C0901v vVar) {
    }

    /* renamed from: s */
    public void mo5065s(C0901v vVar) {
    }

    /* renamed from: t */
    public void mo5066t(C0901v vVar) {
    }

    /* renamed from: h */
    public boolean mo4265h(C0901v vVar) {
        return !this.f3180h || vVar.isInvalid();
    }

    /* renamed from: a */
    public boolean mo4251a(C0901v vVar, C0878c cVar, C0878c cVar2) {
        int i = cVar.f2775a;
        int i2 = cVar.f2776b;
        View view = vVar.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f2775a;
        int top = cVar2 == null ? view.getTop() : cVar2.f2776b;
        if (vVar.isRemoved() || (i == left && i2 == top)) {
            return mo5048a(vVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo5049a(vVar, i, i2, left, top);
    }

    /* renamed from: b */
    public boolean mo4255b(C0901v vVar, C0878c cVar, C0878c cVar2) {
        if (cVar == null || (cVar.f2775a == cVar2.f2775a && cVar.f2776b == cVar2.f2776b)) {
            return mo5052b(vVar);
        }
        return mo5049a(vVar, cVar.f2775a, cVar.f2776b, cVar2.f2775a, cVar2.f2776b);
    }

    /* renamed from: c */
    public boolean mo4256c(C0901v vVar, C0878c cVar, C0878c cVar2) {
        if (cVar.f2775a == cVar2.f2775a && cVar.f2776b == cVar2.f2776b) {
            mo5056j(vVar);
            return false;
        }
        return mo5049a(vVar, cVar.f2775a, cVar.f2776b, cVar2.f2775a, cVar2.f2776b);
    }

    /* renamed from: a */
    public boolean mo4252a(C0901v vVar, C0901v vVar2, C0878c cVar, C0878c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f2775a;
        int i4 = cVar.f2776b;
        if (vVar2.shouldIgnore()) {
            int i5 = cVar.f2775a;
            i = cVar.f2776b;
            i2 = i5;
        } else {
            i2 = cVar2.f2775a;
            i = cVar2.f2776b;
        }
        return mo5050a(vVar, vVar2, i3, i4, i2, i);
    }

    /* renamed from: i */
    public final void mo5055i(C0901v vVar) {
        mo5062p(vVar);
        mo4261f(vVar);
    }

    /* renamed from: j */
    public final void mo5056j(C0901v vVar) {
        mo5066t(vVar);
        mo4261f(vVar);
    }

    /* renamed from: k */
    public final void mo5057k(C0901v vVar) {
        mo5064r(vVar);
        mo4261f(vVar);
    }

    /* renamed from: a */
    public final void mo5047a(C0901v vVar, boolean z) {
        mo5054d(vVar, z);
        mo4261f(vVar);
    }

    /* renamed from: l */
    public final void mo5058l(C0901v vVar) {
        mo5061o(vVar);
    }

    /* renamed from: m */
    public final void mo5059m(C0901v vVar) {
        mo5065s(vVar);
    }

    /* renamed from: n */
    public final void mo5060n(C0901v vVar) {
        mo5063q(vVar);
    }

    /* renamed from: b */
    public final void mo5051b(C0901v vVar, boolean z) {
        mo5053c(vVar, z);
    }
}

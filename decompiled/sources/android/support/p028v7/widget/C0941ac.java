package android.support.p028v7.widget;

import android.support.p028v7.widget.RecyclerView.C0892o;
import android.support.p028v7.widget.RecyclerView.C0898s;
import android.view.View;

/* renamed from: android.support.v7.widget.ac */
/* compiled from: LayoutState */
class C0941ac {

    /* renamed from: a */
    boolean f3097a = true;

    /* renamed from: b */
    int f3098b;

    /* renamed from: c */
    int f3099c;

    /* renamed from: d */
    int f3100d;

    /* renamed from: e */
    int f3101e;

    /* renamed from: f */
    int f3102f = 0;

    /* renamed from: g */
    int f3103g = 0;

    /* renamed from: h */
    boolean f3104h;

    /* renamed from: i */
    boolean f3105i;

    C0941ac() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4882a(C0898s sVar) {
        return this.f3099c >= 0 && this.f3099c < sVar.mo4484e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo4881a(C0892o oVar) {
        View c = oVar.mo4437c(this.f3099c);
        this.f3099c += this.f3100d;
        return c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LayoutState{mAvailable=");
        sb.append(this.f3098b);
        sb.append(", mCurrentPosition=");
        sb.append(this.f3099c);
        sb.append(", mItemDirection=");
        sb.append(this.f3100d);
        sb.append(", mLayoutDirection=");
        sb.append(this.f3101e);
        sb.append(", mStartLine=");
        sb.append(this.f3102f);
        sb.append(", mEndLine=");
        sb.append(this.f3103g);
        sb.append('}');
        return sb.toString();
    }
}

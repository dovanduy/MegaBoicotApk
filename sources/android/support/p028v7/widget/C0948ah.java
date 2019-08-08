package android.support.p028v7.widget;

import android.graphics.Rect;
import android.support.p028v7.widget.RecyclerView.C0881i;
import android.support.p028v7.widget.RecyclerView.LayoutParams;
import android.view.View;

/* renamed from: android.support.v7.widget.ah */
/* compiled from: OrientationHelper */
public abstract class C0948ah {

    /* renamed from: a */
    protected final C0881i f3113a;

    /* renamed from: b */
    final Rect f3114b;

    /* renamed from: c */
    private int f3115c;

    /* renamed from: a */
    public abstract int mo4913a(View view);

    /* renamed from: a */
    public abstract void mo4915a(int i);

    /* renamed from: b */
    public abstract int mo4917b(View view);

    /* renamed from: c */
    public abstract int mo4918c();

    /* renamed from: c */
    public abstract int mo4919c(View view);

    /* renamed from: d */
    public abstract int mo4920d();

    /* renamed from: d */
    public abstract int mo4921d(View view);

    /* renamed from: e */
    public abstract int mo4922e();

    /* renamed from: e */
    public abstract int mo4923e(View view);

    /* renamed from: f */
    public abstract int mo4924f();

    /* renamed from: f */
    public abstract int mo4925f(View view);

    /* renamed from: g */
    public abstract int mo4926g();

    /* renamed from: h */
    public abstract int mo4927h();

    /* renamed from: i */
    public abstract int mo4928i();

    private C0948ah(C0881i iVar) {
        this.f3115c = Integer.MIN_VALUE;
        this.f3114b = new Rect();
        this.f3113a = iVar;
    }

    /* renamed from: a */
    public void mo4914a() {
        this.f3115c = mo4924f();
    }

    /* renamed from: b */
    public int mo4916b() {
        if (Integer.MIN_VALUE == this.f3115c) {
            return 0;
        }
        return mo4924f() - this.f3115c;
    }

    /* renamed from: a */
    public static C0948ah m4185a(C0881i iVar, int i) {
        switch (i) {
            case 0:
                return m4184a(iVar);
            case 1:
                return m4186b(iVar);
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
    }

    /* renamed from: a */
    public static C0948ah m4184a(C0881i iVar) {
        return new C0948ah(iVar) {
            /* renamed from: d */
            public int mo4920d() {
                return this.f3113a.getWidth() - this.f3113a.getPaddingRight();
            }

            /* renamed from: e */
            public int mo4922e() {
                return this.f3113a.getWidth();
            }

            /* renamed from: a */
            public void mo4915a(int i) {
                this.f3113a.offsetChildrenHorizontal(i);
            }

            /* renamed from: c */
            public int mo4918c() {
                return this.f3113a.getPaddingLeft();
            }

            /* renamed from: e */
            public int mo4923e(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return this.f3113a.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }

            /* renamed from: f */
            public int mo4925f(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return this.f3113a.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }

            /* renamed from: b */
            public int mo4917b(View view) {
                return this.f3113a.getDecoratedRight(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }

            /* renamed from: a */
            public int mo4913a(View view) {
                return this.f3113a.getDecoratedLeft(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: c */
            public int mo4919c(View view) {
                this.f3113a.getTransformedBoundingBox(view, true, this.f3114b);
                return this.f3114b.right;
            }

            /* renamed from: d */
            public int mo4921d(View view) {
                this.f3113a.getTransformedBoundingBox(view, true, this.f3114b);
                return this.f3114b.left;
            }

            /* renamed from: f */
            public int mo4924f() {
                return (this.f3113a.getWidth() - this.f3113a.getPaddingLeft()) - this.f3113a.getPaddingRight();
            }

            /* renamed from: g */
            public int mo4926g() {
                return this.f3113a.getPaddingRight();
            }

            /* renamed from: h */
            public int mo4927h() {
                return this.f3113a.getWidthMode();
            }

            /* renamed from: i */
            public int mo4928i() {
                return this.f3113a.getHeightMode();
            }
        };
    }

    /* renamed from: b */
    public static C0948ah m4186b(C0881i iVar) {
        return new C0948ah(iVar) {
            /* renamed from: d */
            public int mo4920d() {
                return this.f3113a.getHeight() - this.f3113a.getPaddingBottom();
            }

            /* renamed from: e */
            public int mo4922e() {
                return this.f3113a.getHeight();
            }

            /* renamed from: a */
            public void mo4915a(int i) {
                this.f3113a.offsetChildrenVertical(i);
            }

            /* renamed from: c */
            public int mo4918c() {
                return this.f3113a.getPaddingTop();
            }

            /* renamed from: e */
            public int mo4923e(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return this.f3113a.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }

            /* renamed from: f */
            public int mo4925f(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return this.f3113a.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }

            /* renamed from: b */
            public int mo4917b(View view) {
                return this.f3113a.getDecoratedBottom(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }

            /* renamed from: a */
            public int mo4913a(View view) {
                return this.f3113a.getDecoratedTop(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: c */
            public int mo4919c(View view) {
                this.f3113a.getTransformedBoundingBox(view, true, this.f3114b);
                return this.f3114b.bottom;
            }

            /* renamed from: d */
            public int mo4921d(View view) {
                this.f3113a.getTransformedBoundingBox(view, true, this.f3114b);
                return this.f3114b.top;
            }

            /* renamed from: f */
            public int mo4924f() {
                return (this.f3113a.getHeight() - this.f3113a.getPaddingTop()) - this.f3113a.getPaddingBottom();
            }

            /* renamed from: g */
            public int mo4926g() {
                return this.f3113a.getPaddingBottom();
            }

            /* renamed from: h */
            public int mo4927h() {
                return this.f3113a.getHeightMode();
            }

            /* renamed from: i */
            public int mo4928i() {
                return this.f3113a.getWidthMode();
            }
        };
    }
}

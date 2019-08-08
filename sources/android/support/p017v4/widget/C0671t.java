package android.support.p017v4.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: android.support.v4.widget.t */
/* compiled from: ViewGroupUtils */
public class C0671t {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f1775a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f1776b = new ThreadLocal<>();

    /* renamed from: a */
    static void m2680a(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = (Matrix) f1775a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f1775a.set(matrix);
        } else {
            matrix.reset();
        }
        m2681a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f1776b.get();
        if (rectF == null) {
            rectF = new RectF();
            f1776b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: b */
    public static void m2682b(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m2680a(viewGroup, view, rect);
    }

    /* renamed from: a */
    private static void m2681a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m2681a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}

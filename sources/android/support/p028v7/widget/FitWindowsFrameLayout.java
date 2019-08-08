package android.support.p028v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p028v7.widget.C1052z.C1053a;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.FitWindowsFrameLayout */
public class FitWindowsFrameLayout extends FrameLayout implements C1052z {

    /* renamed from: a */
    private C1053a f2661a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(C1053a aVar) {
        this.f2661a = aVar;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (this.f2661a != null) {
            this.f2661a.mo2705a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}

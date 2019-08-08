package android.support.p028v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p028v7.widget.C1052z.C1053a;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.widget.FitWindowsLinearLayout */
public class FitWindowsLinearLayout extends LinearLayout implements C1052z {

    /* renamed from: a */
    private C1053a f2662a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(C1053a aVar) {
        this.f2662a = aVar;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (this.f2662a != null) {
            this.f2662a.mo2705a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}

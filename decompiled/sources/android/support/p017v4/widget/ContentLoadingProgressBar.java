package android.support.p017v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: android.support.v4.widget.ContentLoadingProgressBar */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a */
    long f1462a = -1;

    /* renamed from: b */
    boolean f1463b = false;

    /* renamed from: c */
    boolean f1464c = false;

    /* renamed from: d */
    boolean f1465d = false;

    /* renamed from: e */
    private final Runnable f1466e = new Runnable() {
        public void run() {
            ContentLoadingProgressBar.this.f1463b = false;
            ContentLoadingProgressBar.this.f1462a = -1;
            ContentLoadingProgressBar.this.setVisibility(8);
        }
    };

    /* renamed from: f */
    private final Runnable f1467f = new Runnable() {
        public void run() {
            ContentLoadingProgressBar.this.f1464c = false;
            if (!ContentLoadingProgressBar.this.f1465d) {
                ContentLoadingProgressBar.this.f1462a = System.currentTimeMillis();
                ContentLoadingProgressBar.this.setVisibility(0);
            }
        }
    };

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2328a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2328a();
    }

    /* renamed from: a */
    private void m2328a() {
        removeCallbacks(this.f1466e);
        removeCallbacks(this.f1467f);
    }
}

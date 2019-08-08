package android.support.p028v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.b */
/* compiled from: ActionBarBackgroundDrawable */
class C0981b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f3251a;

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C0981b(ActionBarContainer actionBarContainer) {
        this.f3251a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        if (!this.f3251a.f2458d) {
            if (this.f3251a.f2455a != null) {
                this.f3251a.f2455a.draw(canvas);
            }
            if (this.f3251a.f2456b != null && this.f3251a.f2459e) {
                this.f3251a.f2456b.draw(canvas);
            }
        } else if (this.f3251a.f2457c != null) {
            this.f3251a.f2457c.draw(canvas);
        }
    }

    public void getOutline(Outline outline) {
        if (this.f3251a.f2458d) {
            if (this.f3251a.f2457c != null) {
                this.f3251a.f2457c.getOutline(outline);
            }
        } else if (this.f3251a.f2455a != null) {
            this.f3251a.f2455a.getOutline(outline);
        }
    }
}

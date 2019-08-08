package androidx.browser.browseractions;

import android.content.Context;
import android.support.customtabs.C0178j.C0179a;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a */
    private final int f3500a = getResources().getDimensionPixelOffset(C0179a.browser_actions_context_menu_min_padding);

    /* renamed from: b */
    private final int f3501b = getResources().getDimensionPixelOffset(C0179a.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (2 * this.f3500a), this.f3501b), 1073741824), i2);
    }
}

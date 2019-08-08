package android.support.p028v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.p028v7.p029a.C0672a.C0676d;
import android.support.p028v7.p029a.C0672a.C0678f;
import android.support.p028v7.p029a.C0672a.C0679g;
import android.support.p028v7.p029a.C0672a.C0681i;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.AdError;

/* renamed from: android.support.v7.widget.bc */
/* compiled from: TooltipPopup */
class C0986bc {

    /* renamed from: a */
    private final Context f3265a;

    /* renamed from: b */
    private final View f3266b;

    /* renamed from: c */
    private final TextView f3267c;

    /* renamed from: d */
    private final LayoutParams f3268d = new LayoutParams();

    /* renamed from: e */
    private final Rect f3269e = new Rect();

    /* renamed from: f */
    private final int[] f3270f = new int[2];

    /* renamed from: g */
    private final int[] f3271g = new int[2];

    C0986bc(Context context) {
        this.f3265a = context;
        this.f3266b = LayoutInflater.from(this.f3265a).inflate(C0679g.abc_tooltip, null);
        this.f3267c = (TextView) this.f3266b.findViewById(C0678f.message);
        this.f3268d.setTitle(getClass().getSimpleName());
        this.f3268d.packageName = this.f3265a.getPackageName();
        this.f3268d.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        this.f3268d.width = -2;
        this.f3268d.height = -2;
        this.f3268d.format = -3;
        this.f3268d.windowAnimations = C0681i.Animation_AppCompat_Tooltip;
        this.f3268d.flags = 24;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5154a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo5155b()) {
            mo5153a();
        }
        this.f3267c.setText(charSequence);
        m4442a(view, i, i2, z, this.f3268d);
        ((WindowManager) this.f3265a.getSystemService("window")).addView(this.f3266b, this.f3268d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5153a() {
        if (mo5155b()) {
            ((WindowManager) this.f3265a.getSystemService("window")).removeView(this.f3266b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5155b() {
        return this.f3266b.getParent() != null;
    }

    /* renamed from: a */
    private void m4442a(View view, int i, int i2, boolean z, LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f3265a.getResources().getDimensionPixelOffset(C0676d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f3265a.getResources().getDimensionPixelOffset(C0676d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f3265a.getResources().getDimensionPixelOffset(z ? C0676d.tooltip_y_offset_touch : C0676d.tooltip_y_offset_non_touch);
        View a = m4441a(view);
        if (a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a.getWindowVisibleDisplayFrame(this.f3269e);
        if (this.f3269e.left < 0 && this.f3269e.top < 0) {
            Resources resources = this.f3265a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f3269e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a.getLocationOnScreen(this.f3271g);
        view.getLocationOnScreen(this.f3270f);
        int[] iArr = this.f3270f;
        iArr[0] = iArr[0] - this.f3271g[0];
        int[] iArr2 = this.f3270f;
        iArr2[1] = iArr2[1] - this.f3271g[1];
        layoutParams.x = (this.f3270f[0] + i) - (a.getWidth() / 2);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        this.f3266b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f3266b.getMeasuredHeight();
        int i5 = ((this.f3270f[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i6 = this.f3270f[1] + i4 + dimensionPixelOffset3;
        if (z) {
            if (i5 >= 0) {
                layoutParams.y = i5;
            } else {
                layoutParams.y = i6;
            }
        } else if (measuredHeight + i6 <= this.f3269e.height()) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i5;
        }
    }

    /* renamed from: a */
    private static View m4441a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}

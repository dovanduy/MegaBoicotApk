package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p017v4.view.C0595r;
import android.support.p017v4.widget.C0658m;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.view.menu.C0812s;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.facebook.ads.AdError;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.ListPopupWindow */
public class ListPopupWindow implements C0812s {

    /* renamed from: a */
    private static Method f2716a;

    /* renamed from: b */
    private static Method f2717b;

    /* renamed from: h */
    private static Method f2718h;

    /* renamed from: A */
    private Drawable f2719A;

    /* renamed from: B */
    private OnItemClickListener f2720B;

    /* renamed from: C */
    private OnItemSelectedListener f2721C;

    /* renamed from: D */
    private final C0861d f2722D;

    /* renamed from: E */
    private final C0860c f2723E;

    /* renamed from: F */
    private final C0858a f2724F;

    /* renamed from: G */
    private Runnable f2725G;

    /* renamed from: H */
    private final Rect f2726H;

    /* renamed from: I */
    private Rect f2727I;

    /* renamed from: J */
    private boolean f2728J;

    /* renamed from: c */
    C1044x f2729c;

    /* renamed from: d */
    int f2730d;

    /* renamed from: e */
    final C0862e f2731e;

    /* renamed from: f */
    final Handler f2732f;

    /* renamed from: g */
    PopupWindow f2733g;

    /* renamed from: i */
    private Context f2734i;

    /* renamed from: j */
    private ListAdapter f2735j;

    /* renamed from: k */
    private int f2736k;

    /* renamed from: l */
    private int f2737l;

    /* renamed from: m */
    private int f2738m;

    /* renamed from: n */
    private int f2739n;

    /* renamed from: o */
    private int f2740o;

    /* renamed from: p */
    private boolean f2741p;

    /* renamed from: q */
    private boolean f2742q;

    /* renamed from: r */
    private boolean f2743r;

    /* renamed from: s */
    private boolean f2744s;

    /* renamed from: t */
    private int f2745t;

    /* renamed from: u */
    private boolean f2746u;

    /* renamed from: v */
    private boolean f2747v;

    /* renamed from: w */
    private View f2748w;

    /* renamed from: x */
    private int f2749x;

    /* renamed from: y */
    private DataSetObserver f2750y;

    /* renamed from: z */
    private View f2751z;

    /* renamed from: android.support.v7.widget.ListPopupWindow$a */
    private class C0858a implements Runnable {
        C0858a() {
        }

        public void run() {
            ListPopupWindow.this.mo3972m();
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$b */
    private class C0859b extends DataSetObserver {
        C0859b() {
        }

        public void onChanged() {
            if (ListPopupWindow.this.mo3124d()) {
                ListPopupWindow.this.mo3114a();
            }
        }

        public void onInvalidated() {
            ListPopupWindow.this.mo3121c();
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$c */
    private class C0860c implements OnScrollListener {
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        C0860c() {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.mo3973n() && ListPopupWindow.this.f2733g.getContentView() != null) {
                ListPopupWindow.this.f2732f.removeCallbacks(ListPopupWindow.this.f2731e);
                ListPopupWindow.this.f2731e.run();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$d */
    private class C0861d implements OnTouchListener {
        C0861d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && ListPopupWindow.this.f2733g != null && ListPopupWindow.this.f2733g.isShowing() && x >= 0 && x < ListPopupWindow.this.f2733g.getWidth() && y >= 0 && y < ListPopupWindow.this.f2733g.getHeight()) {
                ListPopupWindow.this.f2732f.postDelayed(ListPopupWindow.this.f2731e, 250);
            } else if (action == 1) {
                ListPopupWindow.this.f2732f.removeCallbacks(ListPopupWindow.this.f2731e);
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$e */
    private class C0862e implements Runnable {
        C0862e() {
        }

        public void run() {
            if (ListPopupWindow.this.f2729c != null && C0595r.m2276y(ListPopupWindow.this.f2729c) && ListPopupWindow.this.f2729c.getCount() > ListPopupWindow.this.f2729c.getChildCount() && ListPopupWindow.this.f2729c.getChildCount() <= ListPopupWindow.this.f2730d) {
                ListPopupWindow.this.f2733g.setInputMethodMode(2);
                ListPopupWindow.this.mo3114a();
            }
        }
    }

    static {
        try {
            f2716a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f2717b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f2718h = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, C0673a.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0673a.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2736k = -2;
        this.f2737l = -2;
        this.f2740o = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        this.f2742q = true;
        this.f2745t = 0;
        this.f2746u = false;
        this.f2747v = false;
        this.f2730d = Integer.MAX_VALUE;
        this.f2749x = 0;
        this.f2731e = new C0862e();
        this.f2722D = new C0861d();
        this.f2723E = new C0860c();
        this.f2724F = new C0858a();
        this.f2726H = new Rect();
        this.f2734i = context;
        this.f2732f = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0682j.ListPopupWindow, i, i2);
        this.f2738m = obtainStyledAttributes.getDimensionPixelOffset(C0682j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f2739n = obtainStyledAttributes.getDimensionPixelOffset(C0682j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f2739n != 0) {
            this.f2741p = true;
        }
        obtainStyledAttributes.recycle();
        this.f2733g = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.f2733g.setInputMethodMode(1);
    }

    /* renamed from: a */
    public void mo3722a(ListAdapter listAdapter) {
        if (this.f2750y == null) {
            this.f2750y = new C0859b();
        } else if (this.f2735j != null) {
            this.f2735j.unregisterDataSetObserver(this.f2750y);
        }
        this.f2735j = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2750y);
        }
        if (this.f2729c != null) {
            this.f2729c.setAdapter(this.f2735j);
        }
    }

    /* renamed from: a */
    public void mo3950a(int i) {
        this.f2749x = i;
    }

    /* renamed from: a */
    public void mo3955a(boolean z) {
        this.f2728J = z;
        this.f2733g.setFocusable(z);
    }

    /* renamed from: g */
    public boolean mo3964g() {
        return this.f2728J;
    }

    /* renamed from: h */
    public Drawable mo3965h() {
        return this.f2733g.getBackground();
    }

    /* renamed from: a */
    public void mo3952a(Drawable drawable) {
        this.f2733g.setBackgroundDrawable(drawable);
    }

    /* renamed from: b */
    public void mo3956b(int i) {
        this.f2733g.setAnimationStyle(i);
    }

    /* renamed from: i */
    public View mo3967i() {
        return this.f2751z;
    }

    /* renamed from: b */
    public void mo3957b(View view) {
        this.f2751z = view;
    }

    /* renamed from: j */
    public int mo3969j() {
        return this.f2738m;
    }

    /* renamed from: c */
    public void mo3959c(int i) {
        this.f2738m = i;
    }

    /* renamed from: k */
    public int mo3970k() {
        if (!this.f2741p) {
            return 0;
        }
        return this.f2739n;
    }

    /* renamed from: d */
    public void mo3960d(int i) {
        this.f2739n = i;
        this.f2741p = true;
    }

    /* renamed from: a */
    public void mo3951a(Rect rect) {
        this.f2727I = rect;
    }

    /* renamed from: e */
    public void mo3961e(int i) {
        this.f2745t = i;
    }

    /* renamed from: l */
    public int mo3971l() {
        return this.f2737l;
    }

    /* renamed from: f */
    public void mo3962f(int i) {
        this.f2737l = i;
    }

    /* renamed from: g */
    public void mo3963g(int i) {
        Drawable background = this.f2733g.getBackground();
        if (background != null) {
            background.getPadding(this.f2726H);
            this.f2737l = this.f2726H.left + this.f2726H.right + i;
            return;
        }
        mo3962f(i);
    }

    /* renamed from: a */
    public void mo3953a(OnItemClickListener onItemClickListener) {
        this.f2720B = onItemClickListener;
    }

    /* renamed from: a */
    public void mo3114a() {
        int i;
        int i2;
        int f = mo3726f();
        boolean n = mo3973n();
        C0658m.m2605a(this.f2733g, this.f2740o);
        boolean z = true;
        if (!this.f2733g.isShowing()) {
            if (this.f2737l == -1) {
                i = -1;
            } else if (this.f2737l == -2) {
                i = mo3967i().getWidth();
            } else {
                i = this.f2737l;
            }
            if (this.f2736k == -1) {
                f = -1;
            } else if (this.f2736k != -2) {
                f = this.f2736k;
            }
            this.f2733g.setWidth(i);
            this.f2733g.setHeight(f);
            mo4896c(true);
            this.f2733g.setOutsideTouchable(!this.f2747v && !this.f2746u);
            this.f2733g.setTouchInterceptor(this.f2722D);
            if (this.f2744s) {
                C0658m.m2607a(this.f2733g, this.f2743r);
            }
            if (f2718h != null) {
                try {
                    f2718h.invoke(this.f2733g, new Object[]{this.f2727I});
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
            C0658m.m2606a(this.f2733g, mo3967i(), this.f2738m, this.f2739n, this.f2745t);
            this.f2729c.setSelection(-1);
            if (!this.f2728J || this.f2729c.isInTouchMode()) {
                mo3972m();
            }
            if (!this.f2728J) {
                this.f2732f.post(this.f2724F);
            }
        } else if (C0595r.m2276y(mo3967i())) {
            if (this.f2737l == -1) {
                i2 = -1;
            } else if (this.f2737l == -2) {
                i2 = mo3967i().getWidth();
            } else {
                i2 = this.f2737l;
            }
            if (this.f2736k == -1) {
                if (!n) {
                    f = -1;
                }
                if (n) {
                    this.f2733g.setWidth(this.f2737l == -1 ? -1 : 0);
                    this.f2733g.setHeight(0);
                } else {
                    this.f2733g.setWidth(this.f2737l == -1 ? -1 : 0);
                    this.f2733g.setHeight(-1);
                }
            } else if (this.f2736k != -2) {
                f = this.f2736k;
            }
            PopupWindow popupWindow = this.f2733g;
            if (this.f2747v || this.f2746u) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f2733g.update(mo3967i(), this.f2738m, this.f2739n, i2 < 0 ? -1 : i2, f < 0 ? -1 : f);
        }
    }

    /* renamed from: c */
    public void mo3121c() {
        this.f2733g.dismiss();
        mo3725b();
        this.f2733g.setContentView(null);
        this.f2729c = null;
        this.f2732f.removeCallbacks(this.f2731e);
    }

    /* renamed from: a */
    public void mo3954a(OnDismissListener onDismissListener) {
        this.f2733g.setOnDismissListener(onDismissListener);
    }

    /* renamed from: b */
    private void mo3725b() {
        if (this.f2748w != null) {
            ViewParent parent = this.f2748w.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2748w);
            }
        }
    }

    /* renamed from: h */
    public void mo3966h(int i) {
        this.f2733g.setInputMethodMode(i);
    }

    /* renamed from: i */
    public void mo3968i(int i) {
        C1044x xVar = this.f2729c;
        if (mo3124d() && xVar != null) {
            xVar.setListSelectionHidden(false);
            xVar.setSelection(i);
            if (xVar.getChoiceMode() != 0) {
                xVar.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: m */
    public void mo3972m() {
        C1044x xVar = this.f2729c;
        if (xVar != null) {
            xVar.setListSelectionHidden(true);
            xVar.requestLayout();
        }
    }

    /* renamed from: d */
    public boolean mo3124d() {
        return this.f2733g.isShowing();
    }

    /* renamed from: n */
    public boolean mo3973n() {
        return this.f2733g.getInputMethodMode() == 2;
    }

    /* renamed from: e */
    public ListView mo3125e() {
        return this.f2729c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1044x mo3949a(Context context, boolean z) {
        return new C1044x(context, z);
    }

    /* renamed from: f */
    private int mo3726f() {
        int i;
        int i2;
        int makeMeasureSpec;
        View view;
        int i3;
        int i4;
        boolean z = true;
        if (this.f2729c == null) {
            Context context = this.f2734i;
            this.f2725G = new Runnable() {
                public void run() {
                    View i = ListPopupWindow.this.mo3967i();
                    if (i != null && i.getWindowToken() != null) {
                        ListPopupWindow.this.mo3114a();
                    }
                }
            };
            this.f2729c = mo3949a(context, !this.f2728J);
            if (this.f2719A != null) {
                this.f2729c.setSelector(this.f2719A);
            }
            this.f2729c.setAdapter(this.f2735j);
            this.f2729c.setOnItemClickListener(this.f2720B);
            this.f2729c.setFocusable(true);
            this.f2729c.setFocusableInTouchMode(true);
            this.f2729c.setOnItemSelectedListener(new OnItemSelectedListener() {
                public void onNothingSelected(AdapterView<?> adapterView) {
                }

                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    if (i != -1) {
                        C1044x xVar = ListPopupWindow.this.f2729c;
                        if (xVar != null) {
                            xVar.setListSelectionHidden(false);
                        }
                    }
                }
            });
            this.f2729c.setOnScrollListener(this.f2723E);
            if (this.f2721C != null) {
                this.f2729c.setOnItemSelectedListener(this.f2721C);
            }
            View view2 = this.f2729c;
            View view3 = this.f2748w;
            if (view3 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LayoutParams layoutParams = new LayoutParams(-1, 0, 1.0f);
                switch (this.f2749x) {
                    case 0:
                        linearLayout.addView(view3);
                        linearLayout.addView(view2, layoutParams);
                        break;
                    case 1:
                        linearLayout.addView(view2, layoutParams);
                        linearLayout.addView(view3);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid hint position ");
                        sb.append(this.f2749x);
                        Log.e("ListPopupWindow", sb.toString());
                        break;
                }
                if (this.f2737l >= 0) {
                    i4 = this.f2737l;
                    i3 = Integer.MIN_VALUE;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                view3.measure(MeasureSpec.makeMeasureSpec(i4, i3), 0);
                LayoutParams layoutParams2 = (LayoutParams) view3.getLayoutParams();
                i = view3.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i = 0;
                view = view2;
            }
            this.f2733g.setContentView(view);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f2733g.getContentView();
            View view4 = this.f2748w;
            if (view4 != null) {
                LayoutParams layoutParams3 = (LayoutParams) view4.getLayoutParams();
                i = view4.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f2733g.getBackground();
        if (background != null) {
            background.getPadding(this.f2726H);
            i2 = this.f2726H.top + this.f2726H.bottom;
            if (!this.f2741p) {
                this.f2739n = -this.f2726H.top;
            }
        } else {
            this.f2726H.setEmpty();
            i2 = 0;
        }
        if (this.f2733g.getInputMethodMode() != 2) {
            z = false;
        }
        int a = m3680a(mo3967i(), this.f2739n, z);
        if (this.f2746u || this.f2736k == -1) {
            return a + i2;
        }
        switch (this.f2737l) {
            case -2:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f2734i.getResources().getDisplayMetrics().widthPixels - (this.f2726H.left + this.f2726H.right), Integer.MIN_VALUE);
                break;
            case -1:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f2734i.getResources().getDisplayMetrics().widthPixels - (this.f2726H.left + this.f2726H.right), 1073741824);
                break;
            default:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f2737l, 1073741824);
                break;
        }
        int a2 = this.f2729c.mo4897a(makeMeasureSpec, 0, -1, a - i, -1);
        if (a2 > 0) {
            i += i2 + this.f2729c.getPaddingTop() + this.f2729c.getPaddingBottom();
        }
        return a2 + i;
    }

    /* renamed from: b */
    public void mo3958b(boolean z) {
        this.f2744s = true;
        this.f2743r = z;
    }

    /* renamed from: c */
    private void mo4896c(boolean z) {
        if (f2716a != null) {
            try {
                f2716a.invoke(this.f2733g, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: a */
    private int m3680a(View view, int i, boolean z) {
        if (f2717b != null) {
            try {
                return ((Integer) f2717b.invoke(this.f2733g, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f2733g.getMaxAvailableHeight(view, i);
    }
}

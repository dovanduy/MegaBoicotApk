package android.support.p028v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p017v4.view.C0572b;
import android.support.p017v4.view.p026a.C0564b;
import android.support.p028v7.p029a.C0672a.C0676d;
import android.support.p028v7.p029a.C0672a.C0678f;
import android.support.p028v7.p029a.C0672a.C0679g;
import android.support.p028v7.p029a.C0672a.C0680h;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.view.menu.C0812s;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ActivityChooserView */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: a */
    final C0840a f2560a;

    /* renamed from: b */
    final FrameLayout f2561b;

    /* renamed from: c */
    final FrameLayout f2562c;

    /* renamed from: d */
    C0572b f2563d;

    /* renamed from: e */
    final DataSetObserver f2564e;

    /* renamed from: f */
    OnDismissListener f2565f;

    /* renamed from: g */
    boolean f2566g;

    /* renamed from: h */
    int f2567h;

    /* renamed from: i */
    private final C0841b f2568i;

    /* renamed from: j */
    private final View f2569j;

    /* renamed from: k */
    private final Drawable f2570k;

    /* renamed from: l */
    private final ImageView f2571l;

    /* renamed from: m */
    private final ImageView f2572m;

    /* renamed from: n */
    private final int f2573n;

    /* renamed from: o */
    private final OnGlobalLayoutListener f2574o;

    /* renamed from: p */
    private ListPopupWindow f2575p;

    /* renamed from: q */
    private boolean f2576q;

    /* renamed from: r */
    private int f2577r;

    /* renamed from: android.support.v7.widget.ActivityChooserView$InnerLayout */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        private static final int[] f2583a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0977ay a = C0977ay.m4366a(context, attributeSet, f2583a);
            setBackgroundDrawable(a.mo5086a(0));
            a.mo5087a();
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$a */
    private class C0840a extends BaseAdapter {

        /* renamed from: b */
        private C0996c f2585b;

        /* renamed from: c */
        private int f2586c = 4;

        /* renamed from: d */
        private boolean f2587d;

        /* renamed from: e */
        private boolean f2588e;

        /* renamed from: f */
        private boolean f2589f;

        public long getItemId(int i) {
            return (long) i;
        }

        public int getViewTypeCount() {
            return 3;
        }

        C0840a() {
        }

        /* renamed from: a */
        public void mo3592a(C0996c cVar) {
            C0996c e = ActivityChooserView.this.f2560a.mo3598e();
            if (e != null && ActivityChooserView.this.isShown()) {
                e.unregisterObserver(ActivityChooserView.this.f2564e);
            }
            this.f2585b = cVar;
            if (cVar != null && ActivityChooserView.this.isShown()) {
                cVar.registerObserver(ActivityChooserView.this.f2564e);
            }
            notifyDataSetChanged();
        }

        public int getItemViewType(int i) {
            return (!this.f2589f || i != getCount() - 1) ? 0 : 1;
        }

        public int getCount() {
            int a = this.f2585b.mo5182a();
            if (!this.f2587d && this.f2585b.mo5186b() != null) {
                a--;
            }
            int min = Math.min(a, this.f2586c);
            return this.f2589f ? min + 1 : min;
        }

        public Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!this.f2587d && this.f2585b.mo5186b() != null) {
                        i++;
                    }
                    return this.f2585b.mo5184a(i);
                case 1:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null || view.getId() != C0678f.list_item) {
                        view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C0679g.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
                    PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    ((ImageView) view.findViewById(C0678f.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(C0678f.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (!this.f2587d || i != 0 || !this.f2588e) {
                        view.setActivated(false);
                    } else {
                        view.setActivated(true);
                    }
                    return view;
                case 1:
                    if (view == null || view.getId() != 1) {
                        view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C0679g.abc_activity_chooser_view_list_item, viewGroup, false);
                        view.setId(1);
                        ((TextView) view.findViewById(C0678f.title)).setText(ActivityChooserView.this.getContext().getString(C0680h.abc_activity_chooser_view_see_all));
                    }
                    return view;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public int mo3590a() {
            int i = this.f2586c;
            this.f2586c = Integer.MAX_VALUE;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int i2 = 0;
            View view = null;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f2586c = i;
            return i2;
        }

        /* renamed from: a */
        public void mo3591a(int i) {
            if (this.f2586c != i) {
                this.f2586c = i;
                notifyDataSetChanged();
            }
        }

        /* renamed from: b */
        public ResolveInfo mo3595b() {
            return this.f2585b.mo5186b();
        }

        /* renamed from: a */
        public void mo3593a(boolean z) {
            if (this.f2589f != z) {
                this.f2589f = z;
                notifyDataSetChanged();
            }
        }

        /* renamed from: c */
        public int mo3596c() {
            return this.f2585b.mo5182a();
        }

        /* renamed from: d */
        public int mo3597d() {
            return this.f2585b.mo5187c();
        }

        /* renamed from: e */
        public C0996c mo3598e() {
            return this.f2585b;
        }

        /* renamed from: a */
        public void mo3594a(boolean z, boolean z2) {
            if (this.f2587d != z || this.f2588e != z2) {
                this.f2587d = z;
                this.f2588e = z2;
                notifyDataSetChanged();
            }
        }

        /* renamed from: f */
        public boolean mo3599f() {
            return this.f2587d;
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$b */
    private class C0841b implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {
        C0841b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((C0840a) adapterView.getAdapter()).getItemViewType(i)) {
                case 0:
                    ActivityChooserView.this.mo3569b();
                    if (!ActivityChooserView.this.f2566g) {
                        if (!ActivityChooserView.this.f2560a.mo3599f()) {
                            i++;
                        }
                        Intent b = ActivityChooserView.this.f2560a.mo3598e().mo5185b(i);
                        if (b != null) {
                            b.addFlags(524288);
                            ActivityChooserView.this.getContext().startActivity(b);
                            return;
                        }
                        return;
                    } else if (i > 0) {
                        ActivityChooserView.this.f2560a.mo3598e().mo5188c(i);
                        return;
                    } else {
                        return;
                    }
                case 1:
                    ActivityChooserView.this.mo3567a(Integer.MAX_VALUE);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public void onClick(View view) {
            if (view == ActivityChooserView.this.f2562c) {
                ActivityChooserView.this.mo3569b();
                Intent b = ActivityChooserView.this.f2560a.mo3598e().mo5185b(ActivityChooserView.this.f2560a.mo3598e().mo5183a(ActivityChooserView.this.f2560a.mo3595b()));
                if (b != null) {
                    b.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(b);
                }
            } else if (view == ActivityChooserView.this.f2561b) {
                ActivityChooserView.this.f2566g = false;
                ActivityChooserView.this.mo3567a(ActivityChooserView.this.f2567h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            if (view == ActivityChooserView.this.f2562c) {
                if (ActivityChooserView.this.f2560a.getCount() > 0) {
                    ActivityChooserView.this.f2566g = true;
                    ActivityChooserView.this.mo3567a(ActivityChooserView.this.f2567h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }

        public void onDismiss() {
            m3583a();
            if (ActivityChooserView.this.f2563d != null) {
                ActivityChooserView.this.f2563d.mo2058a(false);
            }
        }

        /* renamed from: a */
        private void m3583a() {
            if (ActivityChooserView.this.f2565f != null) {
                ActivityChooserView.this.f2565f.onDismiss();
            }
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2564e = new DataSetObserver() {
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.f2560a.notifyDataSetChanged();
            }

            public void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.f2560a.notifyDataSetInvalidated();
            }
        };
        this.f2574o = new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (!ActivityChooserView.this.mo3570c()) {
                    return;
                }
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().mo3121c();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().mo3114a();
                if (ActivityChooserView.this.f2563d != null) {
                    ActivityChooserView.this.f2563d.mo2058a(true);
                }
            }
        };
        this.f2567h = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0682j.ActivityChooserView, i, 0);
        this.f2567h = obtainStyledAttributes.getInt(C0682j.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0682j.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C0679g.abc_activity_chooser_view, this, true);
        this.f2568i = new C0841b();
        this.f2569j = findViewById(C0678f.activity_chooser_view_content);
        this.f2570k = this.f2569j.getBackground();
        this.f2562c = (FrameLayout) findViewById(C0678f.default_activity_button);
        this.f2562c.setOnClickListener(this.f2568i);
        this.f2562c.setOnLongClickListener(this.f2568i);
        this.f2572m = (ImageView) this.f2562c.findViewById(C0678f.image);
        FrameLayout frameLayout = (FrameLayout) findViewById(C0678f.expand_activities_button);
        frameLayout.setOnClickListener(this.f2568i);
        frameLayout.setAccessibilityDelegate(new AccessibilityDelegate() {
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                C0564b.m2109a(accessibilityNodeInfo).mo2028j(true);
            }
        });
        frameLayout.setOnTouchListener(new C0934aa(frameLayout) {
            /* renamed from: a */
            public C0812s mo3036a() {
                return ActivityChooserView.this.getListPopupWindow();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public boolean mo3037b() {
                ActivityChooserView.this.mo3568a();
                return true;
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public boolean mo3530c() {
                ActivityChooserView.this.mo3569b();
                return true;
            }
        });
        this.f2561b = frameLayout;
        this.f2571l = (ImageView) frameLayout.findViewById(C0678f.image);
        this.f2571l.setImageDrawable(drawable);
        this.f2560a = new C0840a();
        this.f2560a.registerDataSetObserver(new DataSetObserver() {
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.mo3571d();
            }
        });
        Resources resources = context.getResources();
        this.f2573n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0676d.abc_config_prefDialogWidth));
    }

    public void setActivityChooserModel(C0996c cVar) {
        this.f2560a.mo3592a(cVar);
        if (mo3570c()) {
            mo3569b();
            mo3568a();
        }
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f2571l.setImageDrawable(drawable);
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f2571l.setContentDescription(getContext().getString(i));
    }

    public void setProvider(C0572b bVar) {
        this.f2563d = bVar;
    }

    /* renamed from: a */
    public boolean mo3568a() {
        if (mo3570c() || !this.f2576q) {
            return false;
        }
        this.f2566g = false;
        mo3567a(this.f2567h);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3567a(int i) {
        if (this.f2560a.mo3598e() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f2574o);
        boolean z = this.f2562c.getVisibility() == 0;
        int c = this.f2560a.mo3596c();
        if (i == Integer.MAX_VALUE || c <= i + (z ? 1 : 0)) {
            this.f2560a.mo3593a(false);
            this.f2560a.mo3591a(i);
        } else {
            this.f2560a.mo3593a(true);
            this.f2560a.mo3591a(i - 1);
        }
        ListPopupWindow listPopupWindow = getListPopupWindow();
        if (!listPopupWindow.mo3124d()) {
            if (this.f2566g || !z) {
                this.f2560a.mo3594a(true, z);
            } else {
                this.f2560a.mo3594a(false, false);
            }
            listPopupWindow.mo3963g(Math.min(this.f2560a.mo3590a(), this.f2573n));
            listPopupWindow.mo3114a();
            if (this.f2563d != null) {
                this.f2563d.mo2058a(true);
            }
            listPopupWindow.mo3125e().setContentDescription(getContext().getString(C0680h.abc_activitychooserview_choose_application));
            listPopupWindow.mo3125e().setSelector(new ColorDrawable(0));
        }
    }

    /* renamed from: b */
    public boolean mo3569b() {
        if (mo3570c()) {
            getListPopupWindow().mo3121c();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f2574o);
            }
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo3570c() {
        return getListPopupWindow().mo3124d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0996c e = this.f2560a.mo3598e();
        if (e != null) {
            e.registerObserver(this.f2564e);
        }
        this.f2576q = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0996c e = this.f2560a.mo3598e();
        if (e != null) {
            e.unregisterObserver(this.f2564e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2574o);
        }
        if (mo3570c()) {
            mo3569b();
        }
        this.f2576q = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view = this.f2569j;
        if (this.f2562c.getVisibility() != 0) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2569j.layout(0, 0, i3 - i, i4 - i2);
        if (!mo3570c()) {
            mo3569b();
        }
    }

    public C0996c getDataModel() {
        return this.f2560a.mo3598e();
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.f2565f = onDismissListener;
    }

    public void setInitialActivityCount(int i) {
        this.f2567h = i;
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f2577r = i;
    }

    /* access modifiers changed from: 0000 */
    public ListPopupWindow getListPopupWindow() {
        if (this.f2575p == null) {
            this.f2575p = new ListPopupWindow(getContext());
            this.f2575p.mo3722a((ListAdapter) this.f2560a);
            this.f2575p.mo3957b((View) this);
            this.f2575p.mo3955a(true);
            this.f2575p.mo3953a((OnItemClickListener) this.f2568i);
            this.f2575p.mo3954a((OnDismissListener) this.f2568i);
        }
        return this.f2575p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo3571d() {
        if (this.f2560a.getCount() > 0) {
            this.f2561b.setEnabled(true);
        } else {
            this.f2561b.setEnabled(false);
        }
        int c = this.f2560a.mo3596c();
        int d = this.f2560a.mo3597d();
        if (c == 1 || (c > 1 && d > 0)) {
            this.f2562c.setVisibility(0);
            ResolveInfo b = this.f2560a.mo3595b();
            PackageManager packageManager = getContext().getPackageManager();
            this.f2572m.setImageDrawable(b.loadIcon(packageManager));
            if (this.f2577r != 0) {
                CharSequence loadLabel = b.loadLabel(packageManager);
                this.f2562c.setContentDescription(getContext().getString(this.f2577r, new Object[]{loadLabel}));
            }
        } else {
            this.f2562c.setVisibility(8);
        }
        if (this.f2562c.getVisibility() == 0) {
            this.f2569j.setBackgroundDrawable(this.f2570k);
        } else {
            this.f2569j.setBackgroundDrawable(null);
        }
    }
}

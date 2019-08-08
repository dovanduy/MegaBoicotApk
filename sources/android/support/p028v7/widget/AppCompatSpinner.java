package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p017v4.view.C0594q;
import android.support.p017v4.view.C0595r;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p031c.p032a.C0740a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: android.support.v7.widget.AppCompatSpinner */
public class AppCompatSpinner extends Spinner implements C0594q {

    /* renamed from: d */
    private static final int[] f2614d = {16843505};

    /* renamed from: a */
    C0844b f2615a;

    /* renamed from: b */
    int f2616b;

    /* renamed from: c */
    final Rect f2617c;

    /* renamed from: e */
    private final C1005e f2618e;

    /* renamed from: f */
    private final Context f2619f;

    /* renamed from: g */
    private C0934aa f2620g;

    /* renamed from: h */
    private SpinnerAdapter f2621h;

    /* renamed from: i */
    private final boolean f2622i;

    /* renamed from: android.support.v7.widget.AppCompatSpinner$a */
    private static class C0843a implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f2625a;

        /* renamed from: b */
        private ListAdapter f2626b;

        public int getItemViewType(int i) {
            return 0;
        }

        public int getViewTypeCount() {
            return 1;
        }

        public C0843a(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.f2625a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2626b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0973au) {
                C0973au auVar = (C0973au) spinnerAdapter;
                if (auVar.mo5076a() == null) {
                    auVar.mo5077a(theme);
                }
            }
        }

        public int getCount() {
            if (this.f2625a == null) {
                return 0;
            }
            return this.f2625a.getCount();
        }

        public Object getItem(int i) {
            if (this.f2625a == null) {
                return null;
            }
            return this.f2625a.getItem(i);
        }

        public long getItemId(int i) {
            if (this.f2625a == null) {
                return -1;
            }
            return this.f2625a.getItemId(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            if (this.f2625a == null) {
                return null;
            }
            return this.f2625a.getDropDownView(i, view, viewGroup);
        }

        public boolean hasStableIds() {
            return this.f2625a != null && this.f2625a.hasStableIds();
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f2625a != null) {
                this.f2625a.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f2625a != null) {
                this.f2625a.unregisterDataSetObserver(dataSetObserver);
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2626b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f2626b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }
    }

    /* renamed from: android.support.v7.widget.AppCompatSpinner$b */
    private class C0844b extends ListPopupWindow {

        /* renamed from: a */
        ListAdapter f2627a;

        /* renamed from: h */
        private CharSequence f2629h;

        /* renamed from: i */
        private final Rect f2630i = new Rect();

        public C0844b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo3957b((View) AppCompatSpinner.this);
            mo3955a(true);
            mo3950a(0);
            mo3953a((OnItemClickListener) new OnItemClickListener(AppCompatSpinner.this) {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    AppCompatSpinner.this.setSelection(i);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        AppCompatSpinner.this.performItemClick(view, i, C0844b.this.f2627a.getItemId(i));
                    }
                    C0844b.this.mo3121c();
                }
            });
        }

        /* renamed from: a */
        public void mo3722a(ListAdapter listAdapter) {
            super.mo3722a(listAdapter);
            this.f2627a = listAdapter;
        }

        /* renamed from: b */
        public CharSequence mo3725b() {
            return this.f2629h;
        }

        /* renamed from: a */
        public void mo3723a(CharSequence charSequence) {
            this.f2629h = charSequence;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo3726f() {
            Drawable h = mo3965h();
            int i = 0;
            if (h != null) {
                h.getPadding(AppCompatSpinner.this.f2617c);
                i = C0994bg.m4486a(AppCompatSpinner.this) ? AppCompatSpinner.this.f2617c.right : -AppCompatSpinner.this.f2617c.left;
            } else {
                Rect rect = AppCompatSpinner.this.f2617c;
                AppCompatSpinner.this.f2617c.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            if (AppCompatSpinner.this.f2616b == -2) {
                int a = AppCompatSpinner.this.mo3687a((SpinnerAdapter) this.f2627a, mo3965h());
                int i2 = (AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.f2617c.left) - AppCompatSpinner.this.f2617c.right;
                if (a > i2) {
                    a = i2;
                }
                mo3963g(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (AppCompatSpinner.this.f2616b == -1) {
                mo3963g((width - paddingLeft) - paddingRight);
            } else {
                mo3963g(AppCompatSpinner.this.f2616b);
            }
            mo3959c(C0994bg.m4486a(AppCompatSpinner.this) ? i + ((width - paddingRight) - mo3971l()) : i + paddingLeft);
        }

        /* renamed from: a */
        public void mo3114a() {
            boolean d = mo3124d();
            mo3726f();
            mo3966h(2);
            super.mo3114a();
            mo3125e().setChoiceMode(1);
            mo3968i(AppCompatSpinner.this.getSelectedItemPosition());
            if (!d) {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    final C08462 r1 = new OnGlobalLayoutListener() {
                        public void onGlobalLayout() {
                            if (!C0844b.this.mo3724a((View) AppCompatSpinner.this)) {
                                C0844b.this.mo3121c();
                                return;
                            }
                            C0844b.this.mo3726f();
                            C0844b.super.mo3114a();
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(r1);
                    mo3954a((OnDismissListener) new OnDismissListener() {
                        public void onDismiss() {
                            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.removeGlobalOnLayoutListener(r1);
                            }
                        }
                    });
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3724a(View view) {
            return C0595r.m2276y(view) && view.getGlobalVisibleRect(this.f2630i);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0673a.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r12 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
        if (r12 != null) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f2617c = r0
            int[] r0 = android.support.p028v7.p029a.C0672a.C0682j.Spinner
            r1 = 0
            android.support.v7.widget.ay r0 = android.support.p028v7.widget.C0977ay.m4367a(r8, r9, r0, r10, r1)
            android.support.v7.widget.e r2 = new android.support.v7.widget.e
            r2.<init>(r7)
            r7.f2618e = r2
            r2 = 0
            if (r12 == 0) goto L_0x0023
            android.support.v7.view.d r3 = new android.support.v7.view.d
            r3.<init>(r8, r12)
            r7.f2619f = r3
            goto L_0x003e
        L_0x0023:
            int r12 = android.support.p028v7.p029a.C0672a.C0682j.Spinner_popupTheme
            int r12 = r0.mo5099g(r12, r1)
            if (r12 == 0) goto L_0x0033
            android.support.v7.view.d r3 = new android.support.v7.view.d
            r3.<init>(r8, r12)
            r7.f2619f = r3
            goto L_0x003e
        L_0x0033:
            int r12 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r12 >= r3) goto L_0x003b
            r12 = r8
            goto L_0x003c
        L_0x003b:
            r12 = r2
        L_0x003c:
            r7.f2619f = r12
        L_0x003e:
            android.content.Context r12 = r7.f2619f
            r3 = 1
            if (r12 == 0) goto L_0x00ad
            r12 = -1
            if (r11 != r12) goto L_0x0075
            int[] r12 = f2614d     // Catch:{ Exception -> 0x0062, all -> 0x005f }
            android.content.res.TypedArray r12 = r8.obtainStyledAttributes(r9, r12, r10, r1)     // Catch:{ Exception -> 0x0062, all -> 0x005f }
            boolean r4 = r12.hasValue(r1)     // Catch:{ Exception -> 0x005d }
            if (r4 == 0) goto L_0x0057
            int r4 = r12.getInt(r1, r1)     // Catch:{ Exception -> 0x005d }
            r11 = r4
        L_0x0057:
            if (r12 == 0) goto L_0x0075
        L_0x0059:
            r12.recycle()
            goto L_0x0075
        L_0x005d:
            r4 = move-exception
            goto L_0x0064
        L_0x005f:
            r8 = move-exception
            r12 = r2
            goto L_0x006f
        L_0x0062:
            r4 = move-exception
            r12 = r2
        L_0x0064:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r4)     // Catch:{ all -> 0x006e }
            if (r12 == 0) goto L_0x0075
            goto L_0x0059
        L_0x006e:
            r8 = move-exception
        L_0x006f:
            if (r12 == 0) goto L_0x0074
            r12.recycle()
        L_0x0074:
            throw r8
        L_0x0075:
            if (r11 != r3) goto L_0x00ad
            android.support.v7.widget.AppCompatSpinner$b r11 = new android.support.v7.widget.AppCompatSpinner$b
            android.content.Context r12 = r7.f2619f
            r11.<init>(r12, r9, r10)
            android.content.Context r12 = r7.f2619f
            int[] r4 = android.support.p028v7.p029a.C0672a.C0682j.Spinner
            android.support.v7.widget.ay r12 = android.support.p028v7.widget.C0977ay.m4367a(r12, r9, r4, r10, r1)
            int r1 = android.support.p028v7.p029a.C0672a.C0682j.Spinner_android_dropDownWidth
            r4 = -2
            int r1 = r12.mo5097f(r1, r4)
            r7.f2616b = r1
            int r1 = android.support.p028v7.p029a.C0672a.C0682j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r1 = r12.mo5086a(r1)
            r11.mo3952a(r1)
            int r1 = android.support.p028v7.p029a.C0672a.C0682j.Spinner_android_prompt
            java.lang.String r1 = r0.mo5094d(r1)
            r11.mo3723a(r1)
            r12.mo5087a()
            r7.f2615a = r11
            android.support.v7.widget.AppCompatSpinner$1 r12 = new android.support.v7.widget.AppCompatSpinner$1
            r12.<init>(r7, r11)
            r7.f2620g = r12
        L_0x00ad:
            int r11 = android.support.p028v7.p029a.C0672a.C0682j.Spinner_android_entries
            java.lang.CharSequence[] r11 = r0.mo5098f(r11)
            if (r11 == 0) goto L_0x00c5
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r1, r11)
            int r8 = android.support.p028v7.p029a.C0672a.C0679g.support_simple_spinner_dropdown_item
            r12.setDropDownViewResource(r8)
            r7.setAdapter(r12)
        L_0x00c5:
            r0.mo5087a()
            r7.f2622i = r3
            android.widget.SpinnerAdapter r8 = r7.f2621h
            if (r8 == 0) goto L_0x00d5
            android.widget.SpinnerAdapter r8 = r7.f2621h
            r7.setAdapter(r8)
            r7.f2621h = r2
        L_0x00d5:
            android.support.v7.widget.e r8 = r7.f2618e
            r8.mo5226a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public Context getPopupContext() {
        if (this.f2615a != null) {
            return this.f2619f;
        }
        if (VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.f2615a != null) {
            this.f2615a.mo3952a(drawable);
        } else if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0740a.m3008b(getPopupContext(), i));
    }

    public Drawable getPopupBackground() {
        if (this.f2615a != null) {
            return this.f2615a.mo3965h();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public void setDropDownVerticalOffset(int i) {
        if (this.f2615a != null) {
            this.f2615a.mo3960d(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public int getDropDownVerticalOffset() {
        if (this.f2615a != null) {
            return this.f2615a.mo3970k();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public void setDropDownHorizontalOffset(int i) {
        if (this.f2615a != null) {
            this.f2615a.mo3959c(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public int getDropDownHorizontalOffset() {
        if (this.f2615a != null) {
            return this.f2615a.mo3969j();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public void setDropDownWidth(int i) {
        if (this.f2615a != null) {
            this.f2616b = i;
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public int getDropDownWidth() {
        if (this.f2615a != null) {
            return this.f2616b;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2622i) {
            this.f2621h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f2615a != null) {
            this.f2615a.mo3722a((ListAdapter) new C0843a(spinnerAdapter, (this.f2619f == null ? getContext() : this.f2619f).getTheme()));
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2615a != null && this.f2615a.mo3124d()) {
            this.f2615a.mo3121c();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2620g == null || !this.f2620g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2615a != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo3687a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean performClick() {
        if (this.f2615a == null) {
            return super.performClick();
        }
        if (!this.f2615a.mo3124d()) {
            this.f2615a.mo3114a();
        }
        return true;
    }

    public void setPrompt(CharSequence charSequence) {
        if (this.f2615a != null) {
            this.f2615a.mo3723a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public CharSequence getPrompt() {
        return this.f2615a != null ? this.f2615a.mo3725b() : super.getPrompt();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2618e != null) {
            this.f2618e.mo5222a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2618e != null) {
            this.f2618e.mo5225a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2618e != null) {
            this.f2618e.mo5223a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f2618e != null) {
            return this.f2618e.mo5221a();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2618e != null) {
            this.f2618e.mo5224a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f2618e != null) {
            return this.f2618e.mo5227b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2618e != null) {
            this.f2618e.mo5229c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3687a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int i2 = 0;
        View view = null;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f2617c);
            i2 += this.f2617c.left + this.f2617c.right;
        }
        return i2;
    }
}

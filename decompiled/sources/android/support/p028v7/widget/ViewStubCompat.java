package android.support.p028v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.ViewStubCompat */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f3055a;

    /* renamed from: b */
    private int f3056b;

    /* renamed from: c */
    private WeakReference<View> f3057c;

    /* renamed from: d */
    private LayoutInflater f3058d;

    /* renamed from: e */
    private C0931a f3059e;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a */
    public interface C0931a {
        /* renamed from: a */
        void mo4858a(ViewStubCompat viewStubCompat, View view);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3055a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0682j.ViewStubCompat, i, 0);
        this.f3056b = obtainStyledAttributes.getResourceId(C0682j.ViewStubCompat_android_inflatedId, -1);
        this.f3055a = obtainStyledAttributes.getResourceId(C0682j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0682j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f3056b;
    }

    public void setInflatedId(int i) {
        this.f3056b = i;
    }

    public int getLayoutResource() {
        return this.f3055a;
    }

    public void setLayoutResource(int i) {
        this.f3055a = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f3058d = layoutInflater;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f3058d;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setVisibility(int i) {
        if (this.f3057c != null) {
            View view = (View) this.f3057c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo4846a();
        }
    }

    /* renamed from: a */
    public View mo4846a() {
        LayoutInflater layoutInflater;
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f3055a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (this.f3058d != null) {
                layoutInflater = this.f3058d;
            } else {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f3055a, viewGroup, false);
            if (this.f3056b != -1) {
                inflate.setId(this.f3056b);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f3057c = new WeakReference<>(inflate);
            if (this.f3059e != null) {
                this.f3059e.mo4858a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void setOnInflateListener(C0931a aVar) {
        this.f3059e = aVar;
    }
}

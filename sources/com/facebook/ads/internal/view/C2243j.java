package com.facebook.ads.internal.view;

import android.content.Context;
import android.support.p028v7.widget.RecyclerView.C0870a;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.p104d.C2034a;
import com.facebook.ads.internal.view.p104d.C2035b;
import com.facebook.ads.internal.view.p104d.C2036c;
import com.facebook.ads.internal.view.p104d.C2036c.C2037a;

/* renamed from: com.facebook.ads.internal.view.j */
public class C2243j extends C2036c implements C2037a {

    /* renamed from: c */
    private final HScrollLinearLayoutManager f7061c;

    /* renamed from: d */
    private C2244a f7062d;

    /* renamed from: e */
    private int f7063e = -1;

    /* renamed from: f */
    private int f7064f = -1;

    /* renamed from: g */
    private int f7065g = 0;

    /* renamed from: h */
    private int f7066h = 0;

    /* renamed from: com.facebook.ads.internal.view.j$a */
    public interface C2244a {
        /* renamed from: a */
        void mo8631a(int i, int i2);
    }

    public C2243j(Context context) {
        super(context);
        this.f7061c = new HScrollLinearLayoutManager(context, new C2035b(), new C2034a());
        m8845a();
    }

    public C2243j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7061c = new HScrollLinearLayoutManager(context, new C2035b(), new C2034a());
        m8845a();
    }

    public C2243j(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7061c = new HScrollLinearLayoutManager(context, new C2035b(), new C2034a());
        m8845a();
    }

    /* renamed from: a */
    private void m8845a() {
        this.f7061c.setOrientation(0);
        setLayoutManager(this.f7061c);
        setSaveEnabled(false);
        setSnapDelegate(this);
    }

    /* renamed from: a */
    public int mo8257a(int i) {
        int abs = Math.abs(i);
        if (abs <= this.f6439a) {
            return 0;
        }
        if (this.f7065g == 0) {
            return 1;
        }
        return 1 + (abs / this.f7065g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8253a(int i, boolean z) {
        super.mo8253a(i, z);
        if (i != this.f7063e || this.f7064f != 0) {
            this.f7063e = i;
            this.f7064f = 0;
            if (this.f7062d != null) {
                this.f7062d.mo8631a(this.f7063e, this.f7064f);
            }
        }
    }

    public int getChildSpacing() {
        return this.f7066h;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int r = C1795a.m7458q(getContext()) ? (((int) C2342x.f7369b) * C1795a.m7459r(getContext())) + paddingTop : Math.round(((float) getMeasuredWidth()) / 1.91f);
        int mode = MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            r = Math.min(MeasureSpec.getSize(i2), r);
        } else if (mode == 1073741824) {
            r = MeasureSpec.getSize(i2);
        }
        int i4 = r - paddingTop;
        if (!C1795a.m7458q(getContext())) {
            int i5 = this.f7066h * 2;
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - i5;
            int itemCount = getAdapter().getItemCount();
            int i6 = 0;
            int i7 = Integer.MAX_VALUE;
            while (true) {
                if (i7 <= i4) {
                    i3 = i7;
                    break;
                }
                i6++;
                if (i6 >= itemCount) {
                    i3 = i4;
                    break;
                }
                i7 = (int) (((float) (measuredWidth - (i6 * i5))) / (((float) i6) + 0.333f));
            }
        } else {
            i3 = Math.min(C1966c.f6176a, i4);
        }
        setMeasuredDimension(getMeasuredWidth(), paddingTop + i3);
        if (!C1795a.m7458q(getContext())) {
            setChildWidth(i3 + (this.f7066h * 2));
        }
    }

    public void setAdapter(C0870a aVar) {
        this.f7061c.mo7954a(aVar == null ? -1 : aVar.hashCode());
        super.setAdapter(aVar);
    }

    public void setChildSpacing(int i) {
        this.f7066h = i;
    }

    public void setChildWidth(int i) {
        this.f7065g = i;
        int measuredWidth = getMeasuredWidth();
        this.f7061c.mo7955b((((measuredWidth - getPaddingLeft()) - getPaddingRight()) - this.f7065g) / 2);
        this.f7061c.mo7953a(((double) this.f7065g) / ((double) measuredWidth));
    }

    public void setCurrentPosition(int i) {
        mo8253a(i, false);
    }

    public void setOnPageChangedListener(C2244a aVar) {
        this.f7062d = aVar;
    }
}

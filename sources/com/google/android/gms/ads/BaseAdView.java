package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.doubleclick.C2974a;
import com.google.android.gms.internal.ads.C3987mk;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.aqn;

class BaseAdView extends ViewGroup {

    /* renamed from: a */
    protected final aqn f8660a;

    public BaseAdView(Context context, int i) {
        super(context);
        this.f8660a = new aqn(this, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f8660a = new aqn(this, attributeSet, false, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f8660a = new aqn(this, attributeSet, false, i2);
    }

    /* renamed from: a */
    public void mo12165a() {
        this.f8660a.mo14628i();
    }

    /* renamed from: a */
    public void mo12166a(C2971c cVar) {
        this.f8660a.mo14616a(cVar.mo12202a());
    }

    /* renamed from: b */
    public void mo12167b() {
        this.f8660a.mo14627h();
    }

    /* renamed from: c */
    public void mo12168c() {
        this.f8660a.mo14609a();
    }

    public C2960a getAdListener() {
        return this.f8660a.mo14620b();
    }

    public C2973d getAdSize() {
        return this.f8660a.mo14622c();
    }

    public String getAdUnitId() {
        return this.f8660a.mo14624e();
    }

    public String getMediationAdapterClassName() {
        return this.f8660a.mo14629j();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            C2973d dVar = null;
            try {
                dVar = getAdSize();
            } catch (NullPointerException e) {
                C3987mk.m17430b("Unable to retrieve ad size.", e);
            }
            if (dVar != null) {
                Context context = getContext();
                int b = dVar.mo12215b(context);
                i3 = dVar.mo12213a(context);
                i4 = b;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void setAdListener(C2960a aVar) {
        this.f8660a.mo14610a(aVar);
        if (aVar == null) {
            this.f8660a.mo14615a((anw) null);
            this.f8660a.mo14611a((C2974a) null);
            return;
        }
        if (aVar instanceof anw) {
            this.f8660a.mo14615a((anw) aVar);
        }
        if (aVar instanceof C2974a) {
            this.f8660a.mo14611a((C2974a) aVar);
        }
    }

    public void setAdSize(C2973d dVar) {
        this.f8660a.mo14619a(dVar);
    }

    public void setAdUnitId(String str) {
        this.f8660a.mo14617a(str);
    }
}

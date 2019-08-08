package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C2960a;
import com.google.android.gms.ads.C2973d;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3987mk;
import com.google.android.gms.internal.ads.aqn;

@C3718cm
public final class SearchAdView extends ViewGroup {

    /* renamed from: a */
    private final aqn f9216a;

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9216a = new aqn(this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9216a = new aqn(this, attributeSet, false);
    }

    public final C2960a getAdListener() {
        return this.f9216a.mo14620b();
    }

    public final C2973d getAdSize() {
        return this.f9216a.mo14622c();
    }

    public final String getAdUnitId() {
        return this.f9216a.mo14624e();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public final void onMeasure(int i, int i2) {
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

    public final void setAdListener(C2960a aVar) {
        this.f9216a.mo14610a(aVar);
    }

    public final void setAdSize(C2973d dVar) {
        this.f9216a.mo14619a(dVar);
    }

    public final void setAdUnitId(String str) {
        this.f9216a.mo14617a(str);
    }
}

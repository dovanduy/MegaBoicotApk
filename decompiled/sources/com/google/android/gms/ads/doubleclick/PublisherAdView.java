package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C2960a;
import com.google.android.gms.ads.C2973d;
import com.google.android.gms.ads.C2978e;
import com.google.android.gms.ads.C3000i;
import com.google.android.gms.ads.C3140j;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.ads.C3987mk;
import com.google.android.gms.internal.ads.aqn;

public final class PublisherAdView extends ViewGroup {

    /* renamed from: a */
    private final aqn f8704a;

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8704a = new aqn(this, attributeSet, true);
        C3513t.m12626a(context, (Object) "Context cannot be null");
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8704a = new aqn(this, attributeSet, true);
    }

    public final C2960a getAdListener() {
        return this.f8704a.mo14620b();
    }

    public final C2973d getAdSize() {
        return this.f8704a.mo14622c();
    }

    public final C2973d[] getAdSizes() {
        return this.f8704a.mo14623d();
    }

    public final String getAdUnitId() {
        return this.f8704a.mo14624e();
    }

    public final C2974a getAppEventListener() {
        return this.f8704a.mo14625f();
    }

    public final String getMediationAdapterClassName() {
        return this.f8704a.mo14629j();
    }

    public final C2976c getOnCustomRenderedAdLoadedListener() {
        return this.f8704a.mo14626g();
    }

    public final C3000i getVideoController() {
        return this.f8704a.mo14630k();
    }

    public final C3140j getVideoOptions() {
        return this.f8704a.mo14632m();
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
        this.f8704a.mo14610a(aVar);
    }

    public final void setAdSizes(C2973d... dVarArr) {
        if (dVarArr == null || dVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f8704a.mo14621b(dVarArr);
    }

    public final void setAdUnitId(String str) {
        this.f8704a.mo14617a(str);
    }

    public final void setAppEventListener(C2974a aVar) {
        this.f8704a.mo14611a(aVar);
    }

    public final void setCorrelator(C2978e eVar) {
        this.f8704a.mo14613a(eVar);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.f8704a.mo14618a(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(C2976c cVar) {
        this.f8704a.mo14612a(cVar);
    }

    public final void setVideoOptions(C3140j jVar) {
        this.f8704a.mo14614a(jVar);
    }
}

package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.C3513t;

public final class AdView extends BaseAdView {
    public AdView(Context context) {
        super(context, 0);
        C3513t.m12626a(context, (Object) "Context cannot be null");
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12165a() {
        super.mo12165a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12166a(C2971c cVar) {
        super.mo12166a(cVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo12167b() {
        super.mo12167b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo12168c() {
        super.mo12168c();
    }

    public final /* bridge */ /* synthetic */ C2960a getAdListener() {
        return super.getAdListener();
    }

    public final /* bridge */ /* synthetic */ C2973d getAdSize() {
        return super.getAdSize();
    }

    public final /* bridge */ /* synthetic */ String getAdUnitId() {
        return super.getAdUnitId();
    }

    public final /* bridge */ /* synthetic */ String getMediationAdapterClassName() {
        return super.getMediationAdapterClassName();
    }

    public final C3000i getVideoController() {
        if (this.f8660a != null) {
            return this.f8660a.mo14630k();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void setAdListener(C2960a aVar) {
        super.setAdListener(aVar);
    }

    public final /* bridge */ /* synthetic */ void setAdSize(C2973d dVar) {
        super.setAdSize(dVar);
    }

    public final /* bridge */ /* synthetic */ void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }
}

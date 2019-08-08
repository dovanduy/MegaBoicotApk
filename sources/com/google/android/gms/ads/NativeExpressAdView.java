package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.internal.ads.C3718cm;

@C3718cm
public final class NativeExpressAdView extends BaseAdView {
    public NativeExpressAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 1);
    }

    public NativeExpressAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 1);
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
        return this.f8660a.mo14630k();
    }

    public final C3140j getVideoOptions() {
        return this.f8660a.mo14632m();
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

    public final void setVideoOptions(C3140j jVar) {
        this.f8660a.mo14614a(jVar);
    }
}

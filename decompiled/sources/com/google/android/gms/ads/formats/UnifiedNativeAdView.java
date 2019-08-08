package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.ads.C3987mk;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aum;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;

public final class UnifiedNativeAdView extends FrameLayout {

    /* renamed from: a */
    private final FrameLayout f8711a;

    /* renamed from: b */
    private final aum f8712b = m10657a();

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8711a = m10656a(context);
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8711a = m10656a(context);
    }

    /* renamed from: a */
    private final View m10655a(String str) {
        try {
            C3235a a = this.f8712b.mo14648a(str);
            if (a != null) {
                return (View) C3238b.m11574a(a);
            }
        } catch (RemoteException e) {
            C3987mk.m17430b("Unable to call getAssetView on delegate", e);
        }
        return null;
    }

    /* renamed from: a */
    private final FrameLayout m10656a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    /* renamed from: a */
    private final aum m10657a() {
        C3513t.m12626a(this.f8711a, (Object) "createDelegate must be called after overlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return aoq.m14616b().mo14547a(this.f8711a.getContext(), (FrameLayout) this, this.f8711a);
    }

    /* renamed from: a */
    private final void m10658a(String str, View view) {
        try {
            this.f8712b.mo14652a(str, C3238b.m11573a(view));
        } catch (RemoteException e) {
            C3987mk.m17430b("Unable to call setAssetView on delegate", e);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f8711a);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f8711a != view) {
            super.bringChildToFront(this.f8711a);
        }
    }

    public final AdChoicesView getAdChoicesView() {
        View a = m10655a("3011");
        if (a instanceof AdChoicesView) {
            return (AdChoicesView) a;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return m10655a("3005");
    }

    public final View getBodyView() {
        return m10655a("3004");
    }

    public final View getCallToActionView() {
        return m10655a("3002");
    }

    public final View getHeadlineView() {
        return m10655a("3001");
    }

    public final View getIconView() {
        return m10655a("3003");
    }

    public final View getImageView() {
        return m10655a("3008");
    }

    public final MediaView getMediaView() {
        View a = m10655a("3010");
        if (a instanceof MediaView) {
            return (MediaView) a;
        }
        if (a != null) {
            C3987mk.m17429b("View is not an instance of MediaView");
        }
        return null;
    }

    public final View getPriceView() {
        return m10655a("3007");
    }

    public final View getStarRatingView() {
        return m10655a("3009");
    }

    public final View getStoreView() {
        return m10655a("3006");
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f8712b != null) {
            try {
                this.f8712b.mo14651a(C3238b.m11573a(view), i);
            } catch (RemoteException e) {
                C3987mk.m17430b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f8711a);
    }

    public final void removeView(View view) {
        if (this.f8711a != view) {
            super.removeView(view);
        }
    }

    public final void setAdChoicesView(AdChoicesView adChoicesView) {
        m10658a("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        m10658a("3005", view);
    }

    public final void setBodyView(View view) {
        m10658a("3004", view);
    }

    public final void setCallToActionView(View view) {
        m10658a("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.f8712b.mo14653b(C3238b.m11573a(view));
        } catch (RemoteException e) {
            C3987mk.m17430b("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        m10658a("3001", view);
    }

    public final void setIconView(View view) {
        m10658a("3003", view);
    }

    public final void setImageView(View view) {
        m10658a("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        m10658a("3010", mediaView);
    }

    public final void setNativeAd(C2993g gVar) {
        try {
            this.f8712b.mo14650a((C3235a) gVar.mo12369k());
        } catch (RemoteException e) {
            C3987mk.m17430b("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        m10658a("3007", view);
    }

    public final void setStarRatingView(View view) {
        m10658a("3009", view);
    }

    public final void setStoreView(View view) {
        m10658a("3006", view);
    }
}

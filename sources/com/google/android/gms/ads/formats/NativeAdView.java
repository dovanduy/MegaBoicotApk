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

public class NativeAdView extends FrameLayout {

    /* renamed from: a */
    private final FrameLayout f8707a;

    /* renamed from: b */
    private final aum f8708b = m10650a();

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8707a = m10649a(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8707a = m10649a(context);
    }

    /* renamed from: a */
    private final FrameLayout m10649a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    /* renamed from: a */
    private final aum m10650a() {
        C3513t.m12626a(this.f8707a, (Object) "createDelegate must be called after mOverlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return aoq.m14616b().mo14547a(this.f8707a.getContext(), (FrameLayout) this, this.f8707a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo12251a(String str) {
        try {
            C3235a a = this.f8708b.mo14648a(str);
            if (a != null) {
                return (View) C3238b.m11574a(a);
            }
        } catch (RemoteException e) {
            C3987mk.m17430b("Unable to call getAssetView on delegate", e);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12252a(String str, View view) {
        try {
            this.f8708b.mo14652a(str, C3238b.m11573a(view));
        } catch (RemoteException e) {
            C3987mk.m17430b("Unable to call setAssetView on delegate", e);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f8707a);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f8707a != view) {
            super.bringChildToFront(this.f8707a);
        }
    }

    public AdChoicesView getAdChoicesView() {
        View a = mo12251a("1098");
        if (a instanceof AdChoicesView) {
            return (AdChoicesView) a;
        }
        return null;
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f8708b != null) {
            try {
                this.f8708b.mo14651a(C3238b.m11573a(view), i);
            } catch (RemoteException e) {
                C3987mk.m17430b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f8707a);
    }

    public void removeView(View view) {
        if (this.f8707a != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        mo12252a("1098", adChoicesView);
    }

    public void setNativeAd(C2980a aVar) {
        try {
            this.f8708b.mo14650a((C3235a) aVar.mo12325a());
        } catch (RemoteException e) {
            C3987mk.m17430b("Unable to call setNativeAd on delegate", e);
        }
    }
}

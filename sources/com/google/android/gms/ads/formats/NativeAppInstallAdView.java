package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.ads.C3987mk;

public final class NativeAppInstallAdView extends NativeAdView {
    public NativeAppInstallAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAppInstallAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final View getBodyView() {
        return super.mo12251a("2004");
    }

    public final View getCallToActionView() {
        return super.mo12251a("2002");
    }

    public final View getHeadlineView() {
        return super.mo12251a("2001");
    }

    public final View getIconView() {
        return super.mo12251a("2003");
    }

    public final View getImageView() {
        return super.mo12251a("2007");
    }

    public final MediaView getMediaView() {
        View a = super.mo12251a("2011");
        if (a instanceof MediaView) {
            return (MediaView) a;
        }
        if (a != null) {
            C3987mk.m17429b("View is not an instance of MediaView");
        }
        return null;
    }

    public final View getPriceView() {
        return super.mo12251a("2006");
    }

    public final View getStarRatingView() {
        return super.mo12251a("2008");
    }

    public final View getStoreView() {
        return super.mo12251a("2005");
    }

    public final void setBodyView(View view) {
        super.mo12252a("2004", view);
    }

    public final void setCallToActionView(View view) {
        super.mo12252a("2002", view);
    }

    public final void setHeadlineView(View view) {
        super.mo12252a("2001", view);
    }

    public final void setIconView(View view) {
        super.mo12252a("2003", view);
    }

    public final void setImageView(View view) {
        super.mo12252a("2007", view);
    }

    public final void setMediaView(MediaView mediaView) {
        super.mo12252a("2011", mediaView);
    }

    public final void setPriceView(View view) {
        super.mo12252a("2006", view);
    }

    public final void setStarRatingView(View view) {
        super.mo12252a("2008", view);
    }

    public final void setStoreView(View view) {
        super.mo12252a("2005", view);
    }
}

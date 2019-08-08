package com.appnext.ads.interstitial;

import android.graphics.Color;
import com.appnext.core.C1345p;
import com.appnext.core.Configuration;
import java.io.Serializable;

public class InterstitialConfig extends Configuration implements Serializable {
    private static final long serialVersionUID = 1;
    public Boolean autoPlay;
    public Boolean backButtonCanClose;
    public String buttonColor = "";
    public String creativeType = Interstitial.TYPE_MANAGED;

    /* renamed from: fe */
    protected boolean f3752fe = false;
    public String skipText = "";

    @Deprecated
    public void setOrientation(String str) {
    }

    public void setCreativeType(String str) {
        if (str.equals(Interstitial.TYPE_MANAGED) || str.equals("static") || str.equals("video")) {
            this.creativeType = str;
            return;
        }
        throw new IllegalArgumentException("Wrong creative type");
    }

    public String getCreativeType() {
        return this.creativeType;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public final C1345p mo5475ae() {
        return C1155c.m5113aA();
    }

    public boolean isAutoPlay() {
        return this.autoPlay == null ? Boolean.parseBoolean(C1155c.m5113aA().get("auto_play")) : this.autoPlay.booleanValue();
    }

    public void setAutoPlay(boolean z) {
        this.autoPlay = Boolean.valueOf(z);
    }

    public void setSkipText(String str) {
        if (str == null) {
            str = "";
        }
        this.skipText = str;
    }

    public String getSkipText() {
        return this.skipText;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ak */
    public final boolean mo5705ak() {
        return this.mute != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ay */
    public final boolean mo5706ay() {
        return this.autoPlay != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: az */
    public final boolean mo5707az() {
        return this.backButtonCanClose != null;
    }

    public void setButtonColor(String str) {
        if (str == null) {
            this.buttonColor = "";
            return;
        }
        if (!str.startsWith("#")) {
            StringBuilder sb = new StringBuilder("#");
            sb.append(str);
            str = sb.toString();
        }
        try {
            Color.parseColor(str);
            this.buttonColor = str;
            this.f3752fe = true;
        } catch (Throwable unused) {
            throw new IllegalArgumentException("Unknown color");
        }
    }

    public String getButtonColor() {
        return this.buttonColor;
    }

    @Deprecated
    public boolean isBackButtonCanClose() {
        return this.backButtonCanClose == null ? Boolean.parseBoolean(C1155c.m5113aA().get("can_close")) : this.backButtonCanClose.booleanValue();
    }

    @Deprecated
    public void setBackButtonCanClose(boolean z) {
        this.backButtonCanClose = Boolean.valueOf(z);
    }
}

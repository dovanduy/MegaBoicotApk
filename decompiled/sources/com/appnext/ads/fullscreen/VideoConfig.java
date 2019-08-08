package com.appnext.ads.fullscreen;

import com.appnext.core.C1345p;
import com.appnext.core.Configuration;
import java.io.Serializable;

public class VideoConfig extends Configuration implements Serializable {
    private static final long serialVersionUID = 1;
    public int rollCaptionTime = -2;
    public Boolean showCta;
    public String videoLength = "15";

    public String getVideoLength() {
        return this.videoLength;
    }

    public void setVideoLength(String str) {
        if (str.equals("15") || str.equals("30")) {
            this.videoLength = str;
            return;
        }
        throw new IllegalArgumentException("Wrong video length");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public C1345p mo5475ae() {
        return C1085c.m4984af();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ak */
    public final boolean mo5542ak() {
        return this.mute != null;
    }

    public int getRollCaptionTime() {
        return this.rollCaptionTime;
    }

    public void setRollCaptionTime(int i) {
        this.rollCaptionTime = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: al */
    public final boolean mo5543al() {
        return this.showCta != null;
    }

    public boolean isShowCta() {
        if (this.showCta == null) {
            return true;
        }
        return this.showCta.booleanValue();
    }

    public void setShowCta(boolean z) {
        this.showCta = Boolean.valueOf(z);
    }
}

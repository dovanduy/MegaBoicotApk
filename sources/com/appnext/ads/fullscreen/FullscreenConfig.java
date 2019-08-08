package com.appnext.ads.fullscreen;

import com.appnext.core.C1345p;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.io.Serializable;

public class FullscreenConfig extends VideoConfig implements Serializable {
    private static final long serialVersionUID = 1;
    public Boolean backButtonCanClose;
    public long closeDelay;
    public Boolean showClose;

    public FullscreenConfig() {
        this.closeDelay = AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS;
        this.closeDelay = (long) Integer.parseInt(C1085c.m4984af().get("show_close_time"));
    }

    public boolean isBackButtonCanClose() {
        return this.backButtonCanClose == null ? Boolean.parseBoolean(C1085c.m4984af().get("can_close")) : this.backButtonCanClose.booleanValue();
    }

    public void setBackButtonCanClose(boolean z) {
        this.backButtonCanClose = Boolean.valueOf(z);
    }

    public boolean isShowClose() {
        if (this.showClose == null) {
            return true;
        }
        return this.showClose.booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ad */
    public final Boolean mo5474ad() {
        return this.showClose;
    }

    public void setShowClose(Boolean bool) {
        this.showClose = bool;
    }

    public void setShowClose(boolean z, long j) {
        this.showClose = Boolean.valueOf(z);
        if (j >= 100 && j <= 7500) {
            this.closeDelay = j;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public final C1345p mo5475ae() {
        return C1085c.m4984af();
    }
}

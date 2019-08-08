package com.appnext.ads.fullscreen;

import android.content.Context;
import com.appnext.core.C1286Ad;

public class FullScreenVideo extends Video {
    private boolean canClose;
    private long closeDelay;
    private boolean showClose;

    public String getAUID() {
        return "700";
    }

    protected FullScreenVideo(Context context, FullScreenVideo fullScreenVideo) {
        super(context, fullScreenVideo);
        this.canClose = true;
        this.showClose = true;
        setShowClose(fullScreenVideo.isShowClose());
        setCloseDelay(fullScreenVideo.getCloseDelay());
        setBackButtonCanClose(fullScreenVideo.isBackButtonCanClose());
        this.fq_status = C1286Ad.f4094fq;
    }

    public FullScreenVideo(Context context, String str) {
        super(context, 1, str);
        this.canClose = true;
        this.showClose = true;
        this.closeDelay = (long) Integer.parseInt(getConfig().get("show_close_time"));
    }

    public FullScreenVideo(Context context, String str, FullscreenConfig fullscreenConfig) {
        super(context, 1, str, fullscreenConfig);
        this.canClose = true;
        this.showClose = true;
        if (fullscreenConfig != null) {
            setBackButtonCanClose(fullscreenConfig.isBackButtonCanClose());
            if (fullscreenConfig.showClose != null) {
                setShowClose(fullscreenConfig.isShowClose());
            }
            setCloseDelay(fullscreenConfig.closeDelay);
        }
    }

    public boolean isBackButtonCanClose() {
        return this.canClose;
    }

    public void setBackButtonCanClose(boolean z) {
        this.canClose = z;
    }

    public boolean isShowClose() {
        return this.showClose;
    }

    public void setShowClose(boolean z) {
        this.showClose = z;
    }

    public void setShowClose(boolean z, long j) {
        this.showClose = z;
        if (j >= 100 && j <= 7500) {
            this.closeDelay = j;
        }
    }

    public long getCloseDelay() {
        return this.closeDelay;
    }

    /* access modifiers changed from: protected */
    public C1085c getConfig() {
        return C1085c.m4984af();
    }

    /* access modifiers changed from: protected */
    public void setCloseDelay(long j) {
        this.closeDelay = j;
    }
}

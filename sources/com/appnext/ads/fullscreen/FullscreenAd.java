package com.appnext.ads.fullscreen;

import com.appnext.core.AppnextAd;

public class FullscreenAd extends AppnextAd {
    private static final long serialVersionUID = 3889030223267203195L;
    private String filePath = "";

    protected FullscreenAd(AppnextAd appnextAd) {
        super(appnextAd);
    }

    /* access modifiers changed from: protected */
    public String getAppURL() {
        return super.getAppURL();
    }

    /* access modifiers changed from: protected */
    public void setAppURL(String str) {
        super.setAppURL(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ab */
    public final String mo5467ab() {
        return this.filePath;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void mo5466M(String str) {
        this.filePath = str;
    }

    /* access modifiers changed from: protected */
    public String getZoneID() {
        return super.getZoneID();
    }

    /* access modifiers changed from: protected */
    public String getCampaignGoal() {
        return super.getCampaignGoal();
    }

    /* access modifiers changed from: protected */
    public String getButtonText() {
        return super.getButtonText();
    }

    /* access modifiers changed from: protected */
    public String getCptList() {
        return super.getCptList();
    }
}

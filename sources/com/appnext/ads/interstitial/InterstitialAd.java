package com.appnext.ads.interstitial;

import com.appnext.core.AppnextAd;

public class InterstitialAd extends AppnextAd {
    private static final long serialVersionUID = 3889030223267203195L;
    private String filePath = "";

    protected InterstitialAd(AppnextAd appnextAd) {
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
    public void setImpressionURL(String str) {
        super.setImpressionURL(str);
    }

    /* access modifiers changed from: protected */
    public String getImpressionURL() {
        return super.getImpressionURL();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ab */
    public final String mo5701ab() {
        return this.filePath;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void mo5700M(String str) {
        this.filePath = str;
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

    /* access modifiers changed from: protected */
    public String getAdJSON() {
        return super.getAdJSON();
    }
}

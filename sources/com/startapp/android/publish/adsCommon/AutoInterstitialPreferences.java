package com.startapp.android.publish.adsCommon;

import java.io.Serializable;

/* compiled from: StartAppSDK */
public class AutoInterstitialPreferences implements Serializable {
    private static final long serialVersionUID = 1;
    private int activitiesBetweenAds;
    private int secondsBetweenAds;

    public AutoInterstitialPreferences() {
        setActivitiesBetweenAds(C5344b.m22784a().mo19758J());
        setSecondsBetweenAds(C5344b.m22784a().mo19759K());
    }

    public int getActivitiesBetweenAds() {
        return this.activitiesBetweenAds;
    }

    public int getSecondsBetweenAds() {
        return this.secondsBetweenAds;
    }

    public AutoInterstitialPreferences setActivitiesBetweenAds(int i) {
        if (i < 1) {
            i = 1;
        }
        this.activitiesBetweenAds = i;
        return this;
    }

    public AutoInterstitialPreferences setSecondsBetweenAds(int i) {
        if (i < 0) {
            i = 0;
        }
        this.secondsBetweenAds = i;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AutoInterstitialPreferences [activitiesBetweenAds=");
        sb.append(this.activitiesBetweenAds);
        sb.append(", secondsBetweenAds=");
        sb.append(this.secondsBetweenAds);
        sb.append("]");
        return sb.toString();
    }
}
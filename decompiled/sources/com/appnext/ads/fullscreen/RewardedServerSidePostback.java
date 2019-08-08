package com.appnext.ads.fullscreen;

import java.io.Serializable;
import java.util.HashMap;

public class RewardedServerSidePostback implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: ej */
    private String f3603ej = "";

    /* renamed from: ek */
    private String f3604ek = "";

    /* renamed from: el */
    private String f3605el = "";

    /* renamed from: em */
    private String f3606em = "";

    /* renamed from: en */
    private String f3607en = "";

    public RewardedServerSidePostback() {
    }

    public RewardedServerSidePostback(String str, String str2, String str3, String str4, String str5) {
        this.f3603ej = str;
        this.f3604ek = str2;
        this.f3605el = str3;
        this.f3606em = str4;
        this.f3607en = str5;
    }

    public String getRewardsTransactionId() {
        return this.f3603ej;
    }

    public void setRewardsTransactionId(String str) {
        this.f3603ej = str;
    }

    public String getRewardsUserId() {
        return this.f3604ek;
    }

    public void setRewardsUserId(String str) {
        this.f3604ek = str;
    }

    public String getRewardsRewardTypeCurrency() {
        return this.f3605el;
    }

    public void setRewardsRewardTypeCurrency(String str) {
        this.f3605el = str;
    }

    public String getRewardsAmountRewarded() {
        return this.f3606em;
    }

    public void setRewardsAmountRewarded(String str) {
        this.f3606em = str;
    }

    public String getRewardsCustomParameter() {
        return this.f3607en;
    }

    public void setRewardsCustomParameter(String str) {
        this.f3607en = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ag */
    public final HashMap<String, String> mo5485ag() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("rewardsTransactionId", this.f3603ej);
        hashMap.put("rewardsUserId", this.f3604ek);
        hashMap.put("rewardsRewardTypeCurrency", this.f3605el);
        hashMap.put("rewardsAmountRewarded", this.f3606em);
        hashMap.put("rewardsCustomParameter", this.f3607en);
        return hashMap;
    }
}

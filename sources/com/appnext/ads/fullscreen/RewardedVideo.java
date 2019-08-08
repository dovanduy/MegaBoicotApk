package com.appnext.ads.fullscreen;

import android.content.Context;
import com.appnext.core.C1286Ad;
import com.appnext.core.C1345p;

public class RewardedVideo extends Video {
    public static final String VIDEO_MODE_DEFAULT = "default";
    public static final String VIDEO_MODE_MULTI = "multi";
    public static final String VIDEO_MODE_NORMAL = "normal";
    private String mode = VIDEO_MODE_DEFAULT;
    private int multiTimerLength = 5;
    private RewardedServerSidePostback rewardedServerSidePostback;

    public String getAUID() {
        return "800";
    }

    protected RewardedVideo(Context context, RewardedVideo rewardedVideo) {
        super(context, rewardedVideo);
        setRewardedServerSidePostback(rewardedVideo.getRewardedServerSidePostback());
        setMode(rewardedVideo.getMode());
        setMultiTimerLength(rewardedVideo.getMultiTimerLength());
        this.fq_status = C1286Ad.f4094fq;
    }

    public RewardedVideo(Context context, String str) {
        super(context, 2, str);
    }

    public RewardedVideo(Context context, String str, RewardedConfig rewardedConfig) {
        super(context, 2, str, rewardedConfig);
        setMode(rewardedConfig.getMode());
        setMultiTimerLength(rewardedConfig.getMultiTimerLength());
        setShowCta(rewardedConfig.isShowCta());
    }

    /* access modifiers changed from: protected */
    public C1345p getConfig() {
        return C1103f.m5002ah();
    }

    /* access modifiers changed from: protected */
    public RewardedServerSidePostback getRewardedServerSidePostback() {
        if (!getRewardsTransactionId().equals("") || !getRewardsUserId().equals("") || !getRewardsRewardTypeCurrency().equals("") || !getRewardsAmountRewarded().equals("") || !getRewardsCustomParameter().equals("")) {
            return this.rewardedServerSidePostback;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void setRewardedServerSidePostback(RewardedServerSidePostback rewardedServerSidePostback2) {
        this.rewardedServerSidePostback = rewardedServerSidePostback2;
    }

    public void setRewardedServerSidePostback(String str, String str2, String str3, String str4, String str5) {
        setRewardsTransactionId(str);
        setRewardsUserId(str2);
        setRewardsRewardTypeCurrency(str3);
        setRewardsAmountRewarded(str4);
        setRewardsCustomParameter(str5);
    }

    public String getRewardsTransactionId() {
        if (this.rewardedServerSidePostback == null) {
            return "";
        }
        return this.rewardedServerSidePostback.getRewardsTransactionId();
    }

    public void setRewardsTransactionId(String str) {
        if (this.rewardedServerSidePostback == null) {
            this.rewardedServerSidePostback = new RewardedServerSidePostback();
        }
        this.rewardedServerSidePostback.setRewardsTransactionId(str);
    }

    public String getRewardsUserId() {
        if (this.rewardedServerSidePostback == null) {
            return "";
        }
        return this.rewardedServerSidePostback.getRewardsUserId();
    }

    public void setRewardsUserId(String str) {
        if (this.rewardedServerSidePostback == null) {
            this.rewardedServerSidePostback = new RewardedServerSidePostback();
        }
        this.rewardedServerSidePostback.setRewardsUserId(str);
    }

    public String getRewardsRewardTypeCurrency() {
        if (this.rewardedServerSidePostback == null) {
            return "";
        }
        return this.rewardedServerSidePostback.getRewardsRewardTypeCurrency();
    }

    public void setRewardsRewardTypeCurrency(String str) {
        if (this.rewardedServerSidePostback == null) {
            this.rewardedServerSidePostback = new RewardedServerSidePostback();
        }
        this.rewardedServerSidePostback.setRewardsRewardTypeCurrency(str);
    }

    public String getRewardsAmountRewarded() {
        if (this.rewardedServerSidePostback == null) {
            return "";
        }
        return this.rewardedServerSidePostback.getRewardsAmountRewarded();
    }

    public void setRewardsAmountRewarded(String str) {
        if (this.rewardedServerSidePostback == null) {
            this.rewardedServerSidePostback = new RewardedServerSidePostback();
        }
        this.rewardedServerSidePostback.setRewardsAmountRewarded(str);
    }

    public String getRewardsCustomParameter() {
        if (this.rewardedServerSidePostback == null) {
            return "";
        }
        return this.rewardedServerSidePostback.getRewardsCustomParameter();
    }

    public void setRewardsCustomParameter(String str) {
        if (this.rewardedServerSidePostback == null) {
            this.rewardedServerSidePostback = new RewardedServerSidePostback();
        }
        this.rewardedServerSidePostback.setRewardsCustomParameter(str);
    }

    public String getMode() {
        return this.mode;
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public int getMultiTimerLength() {
        return this.multiTimerLength;
    }

    public void setMultiTimerLength(int i) {
        if (i > 0 && i <= 20) {
            this.multiTimerLength = i;
        }
    }
}

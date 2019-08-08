package com.facebook.ads;

public interface RewardedVideoAdListener extends AdListener {
    void onLoggingImpression(C1514Ad ad);

    void onRewardedVideoClosed();

    void onRewardedVideoCompleted();
}

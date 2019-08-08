package com.appnext.banners;

import com.appnext.core.C1308c;
import java.io.Serializable;

public class BannerAdRequest extends C1308c implements Serializable {
    public static final String TYPE_ALL = "all";
    public static final String TYPE_STATIC = "static";
    public static final String TYPE_VIDEO = "video";
    public static final String VIDEO_LENGTH_LONG = "30";
    public static final String VIDEO_LENGTH_SHORT = "15";
    private boolean autoPlay = false;
    private String categories = "";
    private boolean clickEnabled = true;
    private String creativeType = TYPE_ALL;

    /* renamed from: fG */
    private int f3778fG = 0;

    /* renamed from: fH */
    private int f3779fH = 0;
    private boolean mute = true;
    private String postback = "";
    private String videoLength = "15";

    public BannerAdRequest() {
    }

    BannerAdRequest(BannerAdRequest bannerAdRequest) {
        this.categories = bannerAdRequest.categories;
        this.postback = bannerAdRequest.postback;
        this.creativeType = bannerAdRequest.creativeType;
        this.autoPlay = bannerAdRequest.autoPlay;
        this.mute = bannerAdRequest.mute;
        this.videoLength = bannerAdRequest.videoLength;
        this.f3778fG = bannerAdRequest.f3778fG;
        this.f3779fH = bannerAdRequest.f3779fH;
        this.clickEnabled = bannerAdRequest.clickEnabled;
    }

    public BannerAdRequest setCategories(String str) {
        this.categories = str;
        return this;
    }

    public BannerAdRequest setPostback(String str) {
        this.postback = str;
        return this;
    }

    public BannerAdRequest setCreativeType(String str) {
        this.creativeType = str;
        return this;
    }

    public BannerAdRequest setAutoPlay(boolean z) {
        this.autoPlay = z;
        return this;
    }

    public BannerAdRequest setMute(boolean z) {
        this.mute = z;
        return this;
    }

    public BannerAdRequest setVideoLength(String str) {
        this.videoLength = str;
        return this;
    }

    public BannerAdRequest setVidMin(int i) {
        this.f3778fG = i;
        return this;
    }

    public BannerAdRequest setVidMax(int i) {
        this.f3779fH = i;
        return this;
    }

    public BannerAdRequest setClickEnabled(boolean z) {
        this.clickEnabled = z;
        return this;
    }

    public String getCategories() {
        return this.categories;
    }

    public String getPostback() {
        return this.postback;
    }

    public String getCreativeType() {
        return this.creativeType;
    }

    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    public boolean isMute() {
        return this.mute;
    }

    public String getVideoLength() {
        return this.videoLength;
    }

    public int getVidMin() {
        return this.f3778fG;
    }

    public int getVidMax() {
        return this.f3779fH;
    }

    public boolean isClickEnabled() {
        return this.clickEnabled;
    }
}

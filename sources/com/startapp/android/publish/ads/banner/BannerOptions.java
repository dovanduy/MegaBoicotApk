package com.startapp.android.publish.ads.banner;

import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;

/* compiled from: StartAppSDK */
public class BannerOptions implements Serializable {
    private static final long serialVersionUID = 1;
    private int adsNumber = 4;
    private int delayFaceTime = 5000;
    @C5548f(mo20535b = Effect.class)
    private Effect effect = Effect.ROTATE_3D;
    private int height = 50;
    private float heightRatio = 1.0f;
    private int htmlAdsNumber = 10;
    private float minScale = 0.88f;
    private int minViewabilityPercentage = 50;
    private int refreshRate = 60000;
    private int refreshRate3D = 60000;
    private boolean rotateThroughOnStart = true;
    private int rotateThroughSpeedMult = 2;
    private int scalePower = 4;
    private int stepSize = 5;
    private int timeBetweenFrames = 25;
    private int width = 300;
    private float widthRatio = 1.0f;

    /* compiled from: StartAppSDK */
    public enum Effect {
        ROTATE_3D(1),
        EXCHANGE(2),
        FLY_IN(3);
        
        private int index;

        private Effect(int i) {
            this.index = i;
        }

        public int getIndex() {
            return this.index;
        }

        public int getRotationMultiplier() {
            return (int) Math.pow(2.0d, (double) (this.index - 1));
        }

        public static Effect getByIndex(int i) {
            Effect effect = ROTATE_3D;
            Effect[] values = values();
            for (int i2 = 0; i2 < values.length; i2++) {
                if (values[i2].getIndex() == i) {
                    effect = values[i2];
                }
            }
            return effect;
        }

        public static Effect getByName(String str) {
            Effect effect = ROTATE_3D;
            Effect[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (values[i].name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    effect = values[i];
                }
            }
            return effect;
        }
    }

    public BannerOptions() {
    }

    public BannerOptions(BannerOptions bannerOptions) {
        this.width = bannerOptions.width;
        this.height = bannerOptions.height;
        this.timeBetweenFrames = bannerOptions.timeBetweenFrames;
        this.stepSize = bannerOptions.stepSize;
        this.delayFaceTime = bannerOptions.delayFaceTime;
        this.adsNumber = bannerOptions.adsNumber;
        this.htmlAdsNumber = bannerOptions.htmlAdsNumber;
        this.refreshRate3D = bannerOptions.refreshRate3D;
        this.widthRatio = bannerOptions.widthRatio;
        this.heightRatio = bannerOptions.heightRatio;
        this.minScale = bannerOptions.minScale;
        this.scalePower = bannerOptions.scalePower;
        this.effect = bannerOptions.effect;
        this.rotateThroughOnStart = bannerOptions.rotateThroughOnStart;
        this.rotateThroughSpeedMult = bannerOptions.rotateThroughSpeedMult;
        this.refreshRate = bannerOptions.refreshRate;
    }

    /* renamed from: a */
    public void mo18823a(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    /* renamed from: a */
    public int mo18822a() {
        return this.timeBetweenFrames;
    }

    /* renamed from: b */
    public int mo18824b() {
        return this.stepSize;
    }

    /* renamed from: c */
    public int mo18825c() {
        return this.delayFaceTime;
    }

    /* renamed from: d */
    public int mo18826d() {
        return this.width;
    }

    /* renamed from: e */
    public int mo18827e() {
        return this.height;
    }

    /* renamed from: f */
    public int mo18829f() {
        return this.adsNumber;
    }

    /* renamed from: g */
    public int mo18830g() {
        return this.htmlAdsNumber;
    }

    /* renamed from: h */
    public int mo18831h() {
        return this.refreshRate3D;
    }

    /* renamed from: i */
    public int mo18833i() {
        return this.refreshRate;
    }

    /* renamed from: j */
    public float mo18834j() {
        return this.widthRatio;
    }

    /* renamed from: k */
    public float mo18835k() {
        return this.heightRatio;
    }

    /* renamed from: l */
    public float mo18836l() {
        return this.minScale;
    }

    /* renamed from: m */
    public int mo18837m() {
        return this.scalePower;
    }

    /* renamed from: n */
    public Effect mo18838n() {
        return this.effect;
    }

    /* renamed from: o */
    public boolean mo18839o() {
        return this.rotateThroughOnStart;
    }

    /* renamed from: p */
    public int mo18840p() {
        return this.rotateThroughSpeedMult;
    }

    /* renamed from: q */
    public int mo18841q() {
        return this.minViewabilityPercentage;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BannerOptions bannerOptions = (BannerOptions) obj;
        if (!(this.width == bannerOptions.width && this.height == bannerOptions.height && this.minViewabilityPercentage == bannerOptions.minViewabilityPercentage && this.timeBetweenFrames == bannerOptions.timeBetweenFrames && this.stepSize == bannerOptions.stepSize && this.delayFaceTime == bannerOptions.delayFaceTime && this.adsNumber == bannerOptions.adsNumber && this.htmlAdsNumber == bannerOptions.htmlAdsNumber && this.refreshRate3D == bannerOptions.refreshRate3D && Float.compare(bannerOptions.widthRatio, this.widthRatio) == 0 && Float.compare(bannerOptions.heightRatio, this.heightRatio) == 0 && Float.compare(bannerOptions.minScale, this.minScale) == 0 && this.scalePower == bannerOptions.scalePower && this.rotateThroughOnStart == bannerOptions.rotateThroughOnStart && this.rotateThroughSpeedMult == bannerOptions.rotateThroughSpeedMult && this.refreshRate == bannerOptions.refreshRate && this.effect == bannerOptions.effect)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(Integer.valueOf(this.width), Integer.valueOf(this.height), Integer.valueOf(this.minViewabilityPercentage), Integer.valueOf(this.timeBetweenFrames), Integer.valueOf(this.stepSize), Integer.valueOf(this.delayFaceTime), Integer.valueOf(this.adsNumber), Integer.valueOf(this.htmlAdsNumber), Integer.valueOf(this.refreshRate3D), Float.valueOf(this.widthRatio), Float.valueOf(this.heightRatio), Float.valueOf(this.minScale), Integer.valueOf(this.scalePower), this.effect, Boolean.valueOf(this.rotateThroughOnStart), Integer.valueOf(this.rotateThroughSpeedMult), Integer.valueOf(this.refreshRate));
    }
}

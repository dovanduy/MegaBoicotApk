package com.facebook.ads.internal.protocol;

import java.io.Serializable;

/* renamed from: com.facebook.ads.internal.protocol.d */
public enum C1786d implements Serializable {
    BANNER_320_50(320, 50),
    INTERSTITIAL(0, 0),
    BANNER_HEIGHT_50(-1, 50),
    BANNER_HEIGHT_90(-1, 90),
    RECTANGLE_HEIGHT_250(-1, 250);
    

    /* renamed from: f */
    private final int f5615f;

    /* renamed from: g */
    private final int f5616g;

    private C1786d(int i, int i2) {
        this.f5615f = i;
        this.f5616g = i2;
    }

    /* renamed from: a */
    public static C1786d m7389a(int i, int i2) {
        if (INTERSTITIAL.f5616g == i2 && INTERSTITIAL.f5615f == i) {
            return INTERSTITIAL;
        }
        if (BANNER_320_50.f5616g == i2 && BANNER_320_50.f5615f == i) {
            return BANNER_320_50;
        }
        if (BANNER_HEIGHT_50.f5616g == i2 && BANNER_HEIGHT_50.f5615f == i) {
            return BANNER_HEIGHT_50;
        }
        if (BANNER_HEIGHT_90.f5616g == i2 && BANNER_HEIGHT_90.f5615f == i) {
            return BANNER_HEIGHT_90;
        }
        if (RECTANGLE_HEIGHT_250.f5616g == i2 && RECTANGLE_HEIGHT_250.f5615f == i) {
            return RECTANGLE_HEIGHT_250;
        }
        return null;
    }

    /* renamed from: a */
    public int mo7640a() {
        return this.f5615f;
    }

    /* renamed from: b */
    public int mo7641b() {
        return this.f5616g;
    }
}

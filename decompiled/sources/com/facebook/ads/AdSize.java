package com.facebook.ads;

import com.facebook.ads.internal.protocol.C1786d;
import java.io.Serializable;

public class AdSize implements Serializable {
    @Deprecated
    public static final AdSize BANNER_320_50 = new AdSize(C1786d.BANNER_320_50);
    public static final AdSize BANNER_HEIGHT_50 = new AdSize(C1786d.BANNER_HEIGHT_50);
    public static final AdSize BANNER_HEIGHT_90 = new AdSize(C1786d.BANNER_HEIGHT_90);
    public static final AdSize INTERSTITIAL = new AdSize(C1786d.INTERSTITIAL);
    public static final AdSize RECTANGLE_HEIGHT_250 = new AdSize(C1786d.RECTANGLE_HEIGHT_250);

    /* renamed from: a */
    private final int f4623a;

    /* renamed from: b */
    private final int f4624b;

    public AdSize(int i, int i2) {
        this.f4623a = i;
        this.f4624b = i2;
    }

    private AdSize(C1786d dVar) {
        this.f4623a = dVar.mo7640a();
        this.f4624b = dVar.mo7641b();
    }

    public static AdSize fromWidthAndHeight(int i, int i2) {
        if (INTERSTITIAL.f4624b == i2 && INTERSTITIAL.f4623a == i) {
            return INTERSTITIAL;
        }
        if (BANNER_320_50.f4624b == i2 && BANNER_320_50.f4623a == i) {
            return BANNER_320_50;
        }
        if (BANNER_HEIGHT_50.f4624b == i2 && BANNER_HEIGHT_50.f4623a == i) {
            return BANNER_HEIGHT_50;
        }
        if (BANNER_HEIGHT_90.f4624b == i2 && BANNER_HEIGHT_90.f4623a == i) {
            return BANNER_HEIGHT_90;
        }
        if (RECTANGLE_HEIGHT_250.f4624b == i2 && RECTANGLE_HEIGHT_250.f4623a == i) {
            return RECTANGLE_HEIGHT_250;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        if (this.f4623a != adSize.f4623a) {
            return false;
        }
        return this.f4624b == adSize.f4624b;
    }

    public int getHeight() {
        return this.f4624b;
    }

    public int getWidth() {
        return this.f4623a;
    }

    public int hashCode() {
        return (31 * this.f4623a) + this.f4624b;
    }

    public C1786d toInternalAdSize() {
        return C1786d.m7389a(this.f4623a, this.f4624b);
    }
}

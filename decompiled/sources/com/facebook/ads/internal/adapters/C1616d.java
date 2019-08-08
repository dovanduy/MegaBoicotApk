package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.internal.adapters.d */
public class C1616d {

    /* renamed from: a */
    private static AdAdapter f4993a;

    /* renamed from: a */
    public AdAdapter mo7246a(AdPlacementType adPlacementType) {
        if (f4993a != null) {
            return f4993a;
        }
        switch (adPlacementType) {
            case BANNER:
                return new C1618e();
            case INTERSTITIAL:
                return new C1628g();
            case NATIVE:
                return new C1637i();
            case NATIVE_BANNER:
                return new C1639j();
            case INSTREAM:
                return new C1621f();
            case REWARDED_VIDEO:
                return new C1640k();
            default:
                return null;
        }
    }
}

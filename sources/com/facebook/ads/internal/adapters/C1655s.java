package com.facebook.ads.internal.adapters;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.internal.adapters.s */
public abstract class C1655s implements AdAdapter {

    /* renamed from: a */
    RewardData f5190a;

    /* renamed from: b */
    int f5191b;

    /* renamed from: a */
    public abstract int mo7316a();

    /* renamed from: a */
    public void mo7348a(int i) {
        this.f5191b = i;
    }

    /* renamed from: a */
    public void mo7349a(RewardData rewardData) {
        this.f5190a = rewardData;
    }

    /* renamed from: b */
    public abstract boolean mo7318b();

    public AdPlacementType getPlacementType() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}

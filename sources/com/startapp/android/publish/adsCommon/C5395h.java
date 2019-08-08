package com.startapp.android.publish.adsCommon;

import android.content.Context;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.android.publish.adsCommon.h */
/* compiled from: StartAppSDK */
public abstract class C5395h extends C5286Ad {
    private static final long serialVersionUID = 1;
    private List<AdDetails> adsDetails = null;

    public C5395h(Context context, Placement placement) {
        super(context, placement);
    }

    /* renamed from: a */
    public void mo19939a(List<AdDetails> list) {
        this.adsDetails = list;
        mo18896b();
        mo18894a();
    }

    /* renamed from: a */
    private void mo18894a() {
        boolean z = true;
        for (AdDetails isBelowMinCPM : this.adsDetails) {
            if (!isBelowMinCPM.getIsBelowMinCPM()) {
                z = false;
            }
        }
        this.belowMinCPM = z;
    }

    /* renamed from: d */
    public List<AdDetails> mo19940d() {
        return this.adsDetails;
    }

    /* renamed from: b */
    private void mo18896b() {
        Long l = null;
        if (this.adsDetails != null) {
            for (AdDetails adDetails : this.adsDetails) {
                if (!(adDetails == null || adDetails.getTtl() == null)) {
                    if (l == null || adDetails.getTtl().longValue() < l.longValue()) {
                        l = adDetails.getTtl();
                    }
                }
            }
        }
        if (l != null) {
            this.adCacheTtl = Long.valueOf(TimeUnit.SECONDS.toMillis(l.longValue()));
        }
    }
}

package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3900je;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.overlay.q */
public final class C3121q extends C3107c {
    public C3121q(Activity activity) {
        super(activity);
    }

    /* renamed from: a */
    public final void mo12663a(Bundle bundle) {
        C3900je.m17043a("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f9083d = 3;
        this.f9080a.finish();
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.lr */
public final class C3967lr {
    /* renamed from: a */
    public static boolean m17352a(zzjj zzjj) {
        Bundle bundle = zzjj.f14537m != null ? zzjj.f14537m : new Bundle();
        return (bundle.getBundle(AdMobAdapter.class.getName()) != null ? bundle.getBundle(AdMobAdapter.class.getName()) : new Bundle()).getBoolean("render_test_label", false);
    }
}

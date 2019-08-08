package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.util.C3563o;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3909jn;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.overlay.k */
public final class C3115k {
    /* renamed from: a */
    public static void m11206a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.f9073k == 4 && adOverlayInfoParcel.f9065c == null) {
            if (adOverlayInfoParcel.f9064b != null) {
                adOverlayInfoParcel.f9064b.mo9646e();
            }
            C3025aw.m10914b();
            C3105a.m11174a(context, adOverlayInfoParcel.f9063a, adOverlayInfoParcel.f9071i);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f9075m.f14508d);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.m11172a(intent, adOverlayInfoParcel);
        if (!C3563o.m12770i()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        C3025aw.m10917e();
        C3909jn.m17136a(context, intent);
    }
}

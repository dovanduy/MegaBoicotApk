package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C3018ap;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.C3049bt;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ry */
public final class C4136ry {
    /* renamed from: a */
    public static C4089qe m18028a(Context context, C4130rs rsVar, String str, boolean z, boolean z2, agw agw, zzang zzang, ash ash, C3018ap apVar, C3049bt btVar, amj amj) throws C4100qp {
        try {
            C4137rz rzVar = new C4137rz(context, rsVar, str, z, z2, agw, zzang, ash, apVar, btVar, amj);
            return (C4089qe) C3966lq.m17351a(rzVar);
        } catch (Throwable th) {
            Throwable th2 = th;
            C3025aw.m10921i().mo15436a(th2, "AdWebViewFactory.newAdWebView2");
            throw new C4100qp("Webview initialization failed.", th2);
        }
    }
}

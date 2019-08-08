package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C3018ap;
import com.google.android.gms.ads.internal.C3049bt;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ql */
public final class C4096ql {
    /* renamed from: a */
    public static C4008ne<C4089qe> m17759a(Context context, zzang zzang, String str, agw agw, C3049bt btVar) {
        C4007nd a = C3996mt.m17448a(null);
        C4097qm qmVar = new C4097qm(context, agw, zzang, btVar, str);
        return C3996mt.m17450a((C4008ne<A>) a, (C3991mo<? super A, ? extends B>) qmVar, C4014nk.f13617a);
    }

    /* renamed from: a */
    public static C4089qe m17760a(Context context, C4130rs rsVar, String str, boolean z, boolean z2, agw agw, zzang zzang, ash ash, C3018ap apVar, C3049bt btVar, amj amj) throws C4100qp {
        aru.m15024a(context);
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11827az)).booleanValue()) {
            return C4136ry.m18028a(context, rsVar, str, z2, z, agw, zzang, ash, apVar, btVar, amj);
        }
        try {
            C4098qn qnVar = new C4098qn(context, rsVar, str, z, z2, agw, zzang, ash, apVar, btVar, amj);
            return (C4089qe) C3966lq.m17351a(qnVar);
        } catch (Throwable th) {
            throw new C4100qp("Webview initialization failed.", th);
        }
    }
}

package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.C3050bu;
import com.google.android.gms.common.util.C3554f;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3732d;
import com.google.android.gms.internal.ads.C3787f;
import com.google.android.gms.internal.ads.C3814g;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C4030o;
import com.google.android.gms.internal.ads.C4089qe;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.internal.ads.bec;
import java.util.Map;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.gmsg.d */
public final class C3074d implements C3067ae<C4089qe> {

    /* renamed from: d */
    private static final Map<String, Integer> f8960d = C3554f.m12738a((K[]) new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, (V[]) new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7)});

    /* renamed from: a */
    private final C3050bu f8961a;

    /* renamed from: b */
    private final C3732d f8962b;

    /* renamed from: c */
    private final C4030o f8963c;

    public C3074d(C3050bu buVar, C3732d dVar, C4030o oVar) {
        this.f8961a = buVar;
        this.f8962b = dVar;
        this.f8963c = oVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C4089qe qeVar = (C4089qe) obj;
        int intValue = ((Integer) f8960d.get((String) map.get("a"))).intValue();
        if (intValue != 5 && intValue != 7 && this.f8961a != null && !this.f8961a.mo12587b()) {
            this.f8961a.mo12586a(null);
        } else if (intValue != 1) {
            switch (intValue) {
                case 3:
                    new C3814g(qeVar, map).mo15317a();
                    return;
                case 4:
                    new bec(qeVar, map).mo15192a();
                    return;
                case 5:
                    new C3787f(qeVar, map).mo15275a();
                    return;
                case 6:
                    this.f8962b.mo15236a(true);
                    return;
                case 7:
                    if (((Boolean) aoq.m14620f().mo14695a(aru.f11761M)).booleanValue()) {
                        this.f8963c.mo12588L();
                    }
                    return;
                default:
                    C3900je.m17433d("Unknown MRAID command called.");
                    return;
            }
        } else {
            this.f8962b.mo15235a(map);
        }
    }
}

package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3858hq;
import com.google.android.gms.internal.ads.C3859hr;
import com.google.android.gms.internal.ads.C3863hv;
import com.google.android.gms.internal.ads.C4045oo;
import com.google.android.gms.internal.ads.C4052ov;
import com.google.android.gms.internal.ads.C4067pj;
import com.google.android.gms.internal.ads.C4078pu;
import com.google.android.gms.internal.ads.amo;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.bt */
public final class C3049bt {

    /* renamed from: a */
    public final C4078pu f8919a;

    /* renamed from: b */
    public final C4045oo f8920b;

    /* renamed from: c */
    public final C3863hv f8921c;

    /* renamed from: d */
    public final amo f8922d;

    private C3049bt(C4078pu puVar, C4045oo ooVar, C3863hv hvVar, amo amo) {
        this.f8919a = puVar;
        this.f8920b = ooVar;
        this.f8921c = hvVar;
        this.f8922d = amo;
    }

    /* renamed from: a */
    public static C3049bt m11038a(Context context) {
        return new C3049bt(new C4067pj(), new C4052ov(), new C3858hq(new C3859hr()), new amo(context));
    }
}

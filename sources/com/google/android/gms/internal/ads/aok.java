package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.p137b.C3238b;

final class aok extends C3664a<aph> {

    /* renamed from: a */
    private final /* synthetic */ Context f11619a;

    /* renamed from: b */
    private final /* synthetic */ zzjn f11620b;

    /* renamed from: c */
    private final /* synthetic */ String f11621c;

    /* renamed from: d */
    private final /* synthetic */ bca f11622d;

    /* renamed from: e */
    private final /* synthetic */ aoh f11623e;

    aok(aoh aoh, Context context, zzjn zzjn, String str, bca bca) {
        this.f11623e = aoh;
        this.f11619a = context;
        this.f11620b = zzjn;
        this.f11621c = str;
        this.f11622d = bca;
        super();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14549a() throws RemoteException {
        aph a = this.f11623e.f11602c.mo14537a(this.f11619a, this.f11620b, this.f11621c, this.f11622d, 2);
        if (a != null) {
            return a;
        }
        aoh.m14586a(this.f11619a, "interstitial");
        return new aqx();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14550a(apt apt) throws RemoteException {
        return apt.createInterstitialAdManager(C3238b.m11573a(this.f11619a), this.f11620b, this.f11621c, this.f11622d, C3415h.f9877b);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.p137b.C3238b;

final class aoi extends C3664a<aph> {

    /* renamed from: a */
    private final /* synthetic */ Context f11610a;

    /* renamed from: b */
    private final /* synthetic */ zzjn f11611b;

    /* renamed from: c */
    private final /* synthetic */ String f11612c;

    /* renamed from: d */
    private final /* synthetic */ bca f11613d;

    /* renamed from: e */
    private final /* synthetic */ aoh f11614e;

    aoi(aoh aoh, Context context, zzjn zzjn, String str, bca bca) {
        this.f11614e = aoh;
        this.f11610a = context;
        this.f11611b = zzjn;
        this.f11612c = str;
        this.f11613d = bca;
        super();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14549a() throws RemoteException {
        aph a = this.f11614e.f11602c.mo14537a(this.f11610a, this.f11611b, this.f11612c, this.f11613d, 1);
        if (a != null) {
            return a;
        }
        aoh.m14586a(this.f11610a, "banner");
        return new aqx();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14550a(apt apt) throws RemoteException {
        return apt.createBannerAdManager(C3238b.m11573a(this.f11610a), this.f11611b, this.f11612c, this.f11613d, C3415h.f9877b);
    }
}

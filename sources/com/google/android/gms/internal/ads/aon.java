package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.p137b.C3238b;

final class aon extends C3664a<C3816gb> {

    /* renamed from: a */
    private final /* synthetic */ Context f11632a;

    /* renamed from: b */
    private final /* synthetic */ bca f11633b;

    /* renamed from: c */
    private final /* synthetic */ aoh f11634c;

    aon(aoh aoh, Context context, bca bca) {
        this.f11634c = aoh;
        this.f11632a = context;
        this.f11633b = bca;
        super();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14549a() throws RemoteException {
        C3816gb a = this.f11634c.f11606g.mo15320a(this.f11632a, this.f11633b);
        if (a != null) {
            return a;
        }
        aoh.m14586a(this.f11632a, "rewarded_video");
        return new ara();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14550a(apt apt) throws RemoteException {
        return apt.createRewardedVideoAd(C3238b.m11573a(this.f11632a), this.f11633b, C3415h.f9877b);
    }
}

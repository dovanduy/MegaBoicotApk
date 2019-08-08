package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.p137b.C3238b;

final class aol extends C3664a<apc> {

    /* renamed from: a */
    private final /* synthetic */ Context f11624a;

    /* renamed from: b */
    private final /* synthetic */ String f11625b;

    /* renamed from: c */
    private final /* synthetic */ bca f11626c;

    /* renamed from: d */
    private final /* synthetic */ aoh f11627d;

    aol(aoh aoh, Context context, String str, bca bca) {
        this.f11627d = aoh;
        this.f11624a = context;
        this.f11625b = str;
        this.f11626c = bca;
        super();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14549a() throws RemoteException {
        apc a = this.f11627d.f11603d.mo14536a(this.f11624a, this.f11625b, this.f11626c);
        if (a != null) {
            return a;
        }
        aoh.m14586a(this.f11624a, "native_ad");
        return new aqt();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14550a(apt apt) throws RemoteException {
        return apt.createAdLoaderBuilder(C3238b.m11573a(this.f11624a), this.f11625b, this.f11626c, C3415h.f9877b);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.p137b.C3238b;

final class aoj extends C3664a<aph> {

    /* renamed from: a */
    private final /* synthetic */ Context f11615a;

    /* renamed from: b */
    private final /* synthetic */ zzjn f11616b;

    /* renamed from: c */
    private final /* synthetic */ String f11617c;

    /* renamed from: d */
    private final /* synthetic */ aoh f11618d;

    aoj(aoh aoh, Context context, zzjn zzjn, String str) {
        this.f11618d = aoh;
        this.f11615a = context;
        this.f11616b = zzjn;
        this.f11617c = str;
        super();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14549a() throws RemoteException {
        aph a = this.f11618d.f11602c.mo14537a(this.f11615a, this.f11616b, this.f11617c, null, 3);
        if (a != null) {
            return a;
        }
        aoh.m14586a(this.f11615a, "search");
        return new aqx();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14550a(apt apt) throws RemoteException {
        return apt.createSearchAdManager(C3238b.m11573a(this.f11615a), this.f11616b, this.f11617c, C3415h.f9877b);
    }
}

package com.google.android.gms.internal.p144a;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.a.f */
public abstract class C3629f extends C3625b implements C3628e {
    /* renamed from: a */
    public static C3628e m12920a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof C3628e ? (C3628e) queryLocalInterface : new C3630g(iBinder);
    }
}

package com.google.android.gms.internal.p148e;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.e.dg */
public abstract class C4531dg extends C4435ac implements C4497cf {
    /* renamed from: a */
    public static C4497cf m19469a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof C4497cf) {
            return (C4497cf) queryLocalInterface;
        }
        return new C4559eh(iBinder);
    }
}

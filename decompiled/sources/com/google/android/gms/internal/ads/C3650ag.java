package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.ag */
public final class C3650ag extends aja implements C3649af {
    /* renamed from: a */
    public static C3649af m14045a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof C3649af ? (C3649af) queryLocalInterface : new C3651ah(iBinder);
    }
}

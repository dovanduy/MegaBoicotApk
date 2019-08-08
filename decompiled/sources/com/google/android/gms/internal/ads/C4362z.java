package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.z */
public final class C4362z extends aja implements C4335y {
    /* renamed from: a */
    public static C4335y m18701a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof C4335y ? (C4335y) queryLocalInterface : new C3632aa(iBinder);
    }
}

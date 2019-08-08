package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.ad */
public final class C3642ad extends aja implements C3635ab {
    /* renamed from: a */
    public static C3635ab m13517a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
        return queryLocalInterface instanceof C3635ab ? (C3635ab) queryLocalInterface : new C3644ae(iBinder);
    }
}

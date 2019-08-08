package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.sx */
public abstract class C4162sx extends aja implements C4161sw {
    /* renamed from: a */
    public static C4161sw m18143a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        return queryLocalInterface instanceof C4161sw ? (C4161sw) queryLocalInterface : new C4163sy(iBinder);
    }
}

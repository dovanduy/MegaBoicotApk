package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class aje extends aja implements ajd {
    /* renamed from: a */
    public static ajd m14228a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof ajd ? (ajd) queryLocalInterface : new ajf(iBinder);
    }
}

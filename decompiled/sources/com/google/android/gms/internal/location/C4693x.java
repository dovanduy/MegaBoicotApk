package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.internal.location.x */
public final class C4693x implements Creator<zzbf> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        zzbd zzbd = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel, a);
                    break;
                case 2:
                    zzbd = (zzbd) C3509a.m12564a(parcel, a, zzbd.CREATOR);
                    break;
                case 3:
                    iBinder = C3509a.m12584p(parcel, a);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C3509a.m12564a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = C3509a.m12584p(parcel, a);
                    break;
                case 6:
                    iBinder3 = C3509a.m12584p(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        zzbf zzbf = new zzbf(i, zzbd, iBinder, pendingIntent, iBinder2, iBinder3);
        return zzbf;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbf[i];
    }
}

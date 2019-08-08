package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.location.k */
public final class C4723k implements Creator<LocationAvailability> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        int i = 1;
        int i2 = 1;
        int i3 = 1000;
        long j = 0;
        zzaj[] zzajArr = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel, a);
                    break;
                case 2:
                    i2 = C3509a.m12573e(parcel, a);
                    break;
                case 3:
                    j = C3509a.m12575g(parcel, a);
                    break;
                case 4:
                    i3 = C3509a.m12573e(parcel, a);
                    break;
                case 5:
                    zzajArr = (zzaj[]) C3509a.m12569b(parcel, a, zzaj.CREATOR);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        LocationAvailability locationAvailability = new LocationAvailability(i3, i, i2, j, zzajArr);
        return locationAvailability;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}

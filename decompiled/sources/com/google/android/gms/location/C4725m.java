package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import java.util.List;

/* renamed from: com.google.android.gms.location.m */
public final class C4725m implements Creator<LocationResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        List<Location> list = LocationResult.f15317a;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            if (C3509a.m12561a(a) != 1) {
                C3509a.m12568b(parcel, a);
            } else {
                list = C3509a.m12570c(parcel, a, Location.CREATOR);
            }
        }
        C3509a.m12560E(parcel, b);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}

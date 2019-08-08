package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.location.r */
public final class C4731r implements Creator<LocationSettingsStates> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    z = C3509a.m12571c(parcel, a);
                    break;
                case 2:
                    z2 = C3509a.m12571c(parcel, a);
                    break;
                case 3:
                    z3 = C3509a.m12571c(parcel, a);
                    break;
                case 4:
                    z4 = C3509a.m12571c(parcel, a);
                    break;
                case 5:
                    z5 = C3509a.m12571c(parcel, a);
                    break;
                case 6:
                    z6 = C3509a.m12571c(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        LocationSettingsStates locationSettingsStates = new LocationSettingsStates(z, z2, z3, z4, z5, z6);
        return locationSettingsStates;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.p */
public final class C4728p implements Creator<LocationSettingsRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        boolean z2 = false;
        zzae zzae = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            int a2 = C3509a.m12561a(a);
            if (a2 != 5) {
                switch (a2) {
                    case 1:
                        arrayList = C3509a.m12570c(parcel, a, LocationRequest.CREATOR);
                        break;
                    case 2:
                        z = C3509a.m12571c(parcel, a);
                        break;
                    case 3:
                        z2 = C3509a.m12571c(parcel, a);
                        break;
                    default:
                        C3509a.m12568b(parcel, a);
                        break;
                }
            } else {
                zzae = (zzae) C3509a.m12564a(parcel, a, zzae.CREATOR);
            }
        }
        C3509a.m12560E(parcel, b);
        return new LocationSettingsRequest(arrayList, z, z2, zzae);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}

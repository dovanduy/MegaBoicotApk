package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.w */
public final class C4692w implements Creator<zzbd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        List<ClientIdentity> list = zzbd.f15245a;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            int a2 = C3509a.m12561a(a);
            if (a2 != 1) {
                switch (a2) {
                    case 5:
                        list = C3509a.m12570c(parcel, a, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        str = C3509a.m12583o(parcel, a);
                        break;
                    case 7:
                        z = C3509a.m12571c(parcel, a);
                        break;
                    case 8:
                        z2 = C3509a.m12571c(parcel, a);
                        break;
                    case 9:
                        z3 = C3509a.m12571c(parcel, a);
                        break;
                    case 10:
                        str2 = C3509a.m12583o(parcel, a);
                        break;
                    default:
                        C3509a.m12568b(parcel, a);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) C3509a.m12564a(parcel, a, LocationRequest.CREATOR);
            }
        }
        C3509a.m12560E(parcel, b);
        zzbd zzbd = new zzbd(locationRequest, list, str, z, z2, z3, str2);
        return zzbd;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbd[i];
    }
}

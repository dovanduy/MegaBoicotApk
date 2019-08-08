package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.location.l */
public final class C4724l implements Creator<LocationRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C3509a.m12567b(parcel);
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        boolean z = false;
        long j3 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        long j4 = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel2, a);
                    break;
                case 2:
                    j = C3509a.m12575g(parcel2, a);
                    break;
                case 3:
                    j2 = C3509a.m12575g(parcel2, a);
                    break;
                case 4:
                    z = C3509a.m12571c(parcel2, a);
                    break;
                case 5:
                    j3 = C3509a.m12575g(parcel2, a);
                    break;
                case 6:
                    i2 = C3509a.m12573e(parcel2, a);
                    break;
                case 7:
                    f = C3509a.m12578j(parcel2, a);
                    break;
                case 8:
                    j4 = C3509a.m12575g(parcel2, a);
                    break;
                default:
                    C3509a.m12568b(parcel2, a);
                    break;
            }
        }
        C3509a.m12560E(parcel2, b);
        LocationRequest locationRequest = new LocationRequest(i, j, j2, z, j3, i2, f, j4);
        return locationRequest;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.internal.ads.dz */
public final class C3758dz implements Creator<zzaev> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            if (C3509a.m12561a(a) != 2) {
                C3509a.m12568b(parcel, a);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) C3509a.m12564a(parcel, a, ParcelFileDescriptor.CREATOR);
            }
        }
        C3509a.m12560E(parcel, b);
        return new zzaev(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaev[i];
    }
}

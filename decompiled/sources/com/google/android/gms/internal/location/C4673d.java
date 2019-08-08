package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.internal.location.d */
public final class C4673d implements Creator<zzad> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        Status status = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            if (C3509a.m12561a(a) != 1) {
                C3509a.m12568b(parcel, a);
            } else {
                status = (Status) C3509a.m12564a(parcel, a, Status.CREATOR);
            }
        }
        C3509a.m12560E(parcel, b);
        return new zzad(status);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }
}

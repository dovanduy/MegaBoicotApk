package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.z */
public final class C4739z implements Creator<ActivityTransitionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            if (C3509a.m12561a(a) != 1) {
                C3509a.m12568b(parcel, a);
            } else {
                arrayList = C3509a.m12570c(parcel, a, ActivityTransitionEvent.CREATOR);
            }
        }
        C3509a.m12560E(parcel, b);
        return new ActivityTransitionResult(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionResult[i];
    }
}

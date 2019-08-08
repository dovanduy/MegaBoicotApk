package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.location.y */
public final class C4738y implements Creator<ActivityTransitionRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        ArrayList arrayList = null;
        String str = null;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    arrayList = C3509a.m12570c(parcel, a, ActivityTransition.CREATOR);
                    break;
                case 2:
                    str = C3509a.m12583o(parcel, a);
                    break;
                case 3:
                    list = C3509a.m12570c(parcel, a, ClientIdentity.CREATOR);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        return new ActivityTransitionRequest(arrayList, str, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionRequest[i];
    }
}

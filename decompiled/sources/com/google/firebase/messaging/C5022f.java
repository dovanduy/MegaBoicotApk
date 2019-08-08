package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.firebase.messaging.f */
public final class C5022f implements Creator<RemoteMessage> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new RemoteMessage[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            if (C3509a.m12561a(a) != 2) {
                C3509a.m12568b(parcel, a);
            } else {
                bundle = C3509a.m12585q(parcel, a);
            }
        }
        C3509a.m12560E(parcel, b);
        return new RemoteMessage(bundle);
    }
}

package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.common.m */
public final class C3524m implements Creator<ConnectionResult> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel, a);
                    break;
                case 2:
                    i2 = C3509a.m12573e(parcel, a);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) C3509a.m12564a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 4:
                    str = C3509a.m12583o(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        return new ConnectionResult(i, i2, pendingIntent, str);
    }
}

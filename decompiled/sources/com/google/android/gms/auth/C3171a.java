package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.auth.a */
public final class C3171a implements Creator<AccountChangeEvent> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEvent[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel, a);
                    break;
                case 2:
                    j = C3509a.m12575g(parcel, a);
                    break;
                case 3:
                    str = C3509a.m12583o(parcel, a);
                    break;
                case 4:
                    i2 = C3509a.m12573e(parcel, a);
                    break;
                case 5:
                    i3 = C3509a.m12573e(parcel, a);
                    break;
                case 6:
                    str2 = C3509a.m12583o(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        AccountChangeEvent accountChangeEvent = new AccountChangeEvent(i, j, str, i2, i3, str2);
        return accountChangeEvent;
    }
}

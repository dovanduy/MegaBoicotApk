package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.location.s */
public final class C4732s implements Creator<zzaj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
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
                    j = C3509a.m12575g(parcel, a);
                    break;
                case 4:
                    j2 = C3509a.m12575g(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        zzaj zzaj = new zzaj(i, i2, j, j2);
        return zzaj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaj[i];
    }
}

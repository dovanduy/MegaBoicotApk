package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.location.ac */
public final class C4702ac implements Creator<zzj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C3509a.m12567b(parcel);
        boolean z = true;
        long j = 50;
        float f = 0.0f;
        long j2 = Long.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    z = C3509a.m12571c(parcel2, a);
                    break;
                case 2:
                    j = C3509a.m12575g(parcel2, a);
                    break;
                case 3:
                    f = C3509a.m12578j(parcel2, a);
                    break;
                case 4:
                    j2 = C3509a.m12575g(parcel2, a);
                    break;
                case 5:
                    i = C3509a.m12573e(parcel2, a);
                    break;
                default:
                    C3509a.m12568b(parcel2, a);
                    break;
            }
        }
        C3509a.m12560E(parcel2, b);
        zzj zzj = new zzj(z, j, f, j2, i);
        return zzj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}

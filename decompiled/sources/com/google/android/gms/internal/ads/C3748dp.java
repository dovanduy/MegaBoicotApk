package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.dp */
public final class C3748dp implements Creator<zzael> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 2:
                    z = C3509a.m12571c(parcel, a);
                    break;
                case 3:
                    arrayList = C3509a.m12557B(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        return new zzael(z, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzael[i];
    }
}

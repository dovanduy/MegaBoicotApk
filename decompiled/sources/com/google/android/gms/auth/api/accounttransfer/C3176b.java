package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.b */
public final class C3176b implements Creator<zzo> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel, a);
                    break;
                case 2:
                    list = C3509a.m12557B(parcel, a);
                    break;
                case 3:
                    list2 = C3509a.m12557B(parcel, a);
                    break;
                case 4:
                    list3 = C3509a.m12557B(parcel, a);
                    break;
                case 5:
                    list4 = C3509a.m12557B(parcel, a);
                    break;
                case 6:
                    list5 = C3509a.m12557B(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        zzo zzo = new zzo(i, list, list2, list3, list4, list5);
        return zzo;
    }
}

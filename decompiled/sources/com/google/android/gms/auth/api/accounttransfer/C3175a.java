package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import com.google.android.gms.common.internal.safeparcel.C3509a.C3510a;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.a */
public final class C3175a implements Creator<zzl> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        zzo zzo = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    arrayList = C3509a.m12570c(parcel, a, zzr.CREATOR);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    i2 = C3509a.m12573e(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    zzo = (zzo) C3509a.m12564a(parcel, a, zzo.CREATOR);
                    hashSet.add(Integer.valueOf(4));
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() != b) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(b);
            throw new C3510a(sb.toString(), parcel);
        }
        zzl zzl = new zzl(hashSet, i, arrayList, i2, zzo);
        return zzl;
    }
}

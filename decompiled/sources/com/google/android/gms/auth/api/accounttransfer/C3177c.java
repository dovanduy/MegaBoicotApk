package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import com.google.android.gms.common.internal.safeparcel.C3509a.C3510a;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.c */
public final class C3177c implements Creator<zzr> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        zzt zzt = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    zzt = (zzt) C3509a.m12564a(parcel, a, zzt.CREATOR);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    str = C3509a.m12583o(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    str2 = C3509a.m12583o(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str3 = C3509a.m12583o(parcel, a);
                    hashSet.add(Integer.valueOf(5));
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
        zzr zzr = new zzr(hashSet, i, zzt, str, str2, str3);
        return zzr;
    }
}

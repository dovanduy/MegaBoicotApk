package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

/* renamed from: com.google.android.gms.common.server.response.a */
public final class C3536a implements Creator<Field> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Field[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        String str = null;
        String str2 = null;
        zaa zaa = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
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
                    z = C3509a.m12571c(parcel, a);
                    break;
                case 4:
                    i3 = C3509a.m12573e(parcel, a);
                    break;
                case 5:
                    z2 = C3509a.m12571c(parcel, a);
                    break;
                case 6:
                    str = C3509a.m12583o(parcel, a);
                    break;
                case 7:
                    i4 = C3509a.m12573e(parcel, a);
                    break;
                case 8:
                    str2 = C3509a.m12583o(parcel, a);
                    break;
                case 9:
                    zaa = (zaa) C3509a.m12564a(parcel, a, zaa.CREATOR);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        Field field = new Field(i, i2, z, i3, z2, str, i4, str2, zaa);
        return field;
    }
}

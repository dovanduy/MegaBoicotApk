package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.common.data.c */
public final class C3411c implements Creator<DataHolder> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        int i = 0;
        int i2 = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            int a2 = C3509a.m12561a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        strArr = C3509a.m12594z(parcel, a);
                        break;
                    case 2:
                        cursorWindowArr = (CursorWindow[]) C3509a.m12569b(parcel, a, CursorWindow.CREATOR);
                        break;
                    case 3:
                        i2 = C3509a.m12573e(parcel, a);
                        break;
                    case 4:
                        bundle = C3509a.m12585q(parcel, a);
                        break;
                    default:
                        C3509a.m12568b(parcel, a);
                        break;
                }
            } else {
                i = C3509a.m12573e(parcel, a);
            }
        }
        C3509a.m12560E(parcel, b);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.mo13421a();
        return dataHolder;
    }
}

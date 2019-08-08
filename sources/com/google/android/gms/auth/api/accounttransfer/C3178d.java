package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;
import com.google.android.gms.common.internal.safeparcel.C3509a.C3510a;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.d */
public final class C3178d implements Creator<zzt> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzt[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i2 = C3509a.m12573e(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str = C3509a.m12583o(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    i = C3509a.m12573e(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    bArr = C3509a.m12586r(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    pendingIntent = (PendingIntent) C3509a.m12564a(parcel, a, PendingIntent.CREATOR);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) C3509a.m12564a(parcel, a, DeviceMetaData.CREATOR);
                    hashSet.add(Integer.valueOf(6));
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
        zzt zzt = new zzt(hashSet, i2, str, i, bArr, pendingIntent, deviceMetaData);
        return zzt;
    }
}

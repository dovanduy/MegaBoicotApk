package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.common.images.d */
public final class C3424d implements Creator<WebImage> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new WebImage[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        int i = 0;
        Uri uri = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel, a);
                    break;
                case 2:
                    uri = (Uri) C3509a.m12564a(parcel, a, Uri.CREATOR);
                    break;
                case 3:
                    i2 = C3509a.m12573e(parcel, a);
                    break;
                case 4:
                    i3 = C3509a.m12573e(parcel, a);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        return new WebImage(i, uri, i2, i3);
    }
}

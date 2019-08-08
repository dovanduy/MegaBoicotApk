package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.auth.api.proxy.c */
public final class C3195c implements Creator<ProxyResponse> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyResponse[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            int a2 = C3509a.m12561a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        i2 = C3509a.m12573e(parcel, a);
                        break;
                    case 2:
                        pendingIntent = (PendingIntent) C3509a.m12564a(parcel, a, PendingIntent.CREATOR);
                        break;
                    case 3:
                        i3 = C3509a.m12573e(parcel, a);
                        break;
                    case 4:
                        bundle = C3509a.m12585q(parcel, a);
                        break;
                    case 5:
                        bArr = C3509a.m12586r(parcel, a);
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
        ProxyResponse proxyResponse = new ProxyResponse(i, i2, pendingIntent, i3, bundle, bArr);
        return proxyResponse;
    }
}

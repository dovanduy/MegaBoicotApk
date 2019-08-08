package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.auth.api.proxy.b */
public final class C3194b implements Creator<ProxyRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            int a2 = C3509a.m12561a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        str = C3509a.m12583o(parcel, a);
                        break;
                    case 2:
                        i2 = C3509a.m12573e(parcel, a);
                        break;
                    case 3:
                        j = C3509a.m12575g(parcel, a);
                        break;
                    case 4:
                        bArr = C3509a.m12586r(parcel, a);
                        break;
                    case 5:
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
        ProxyRequest proxyRequest = new ProxyRequest(i, str, i2, j, bArr, bundle);
        return proxyRequest;
    }
}

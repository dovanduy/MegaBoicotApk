package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.common.internal.am */
public final class C3452am implements Creator<GetServiceRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C3509a.m12567b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel2, a);
                    break;
                case 2:
                    i2 = C3509a.m12573e(parcel2, a);
                    break;
                case 3:
                    i3 = C3509a.m12573e(parcel2, a);
                    break;
                case 4:
                    str = C3509a.m12583o(parcel2, a);
                    break;
                case 5:
                    iBinder = C3509a.m12584p(parcel2, a);
                    break;
                case 6:
                    scopeArr = (Scope[]) C3509a.m12569b(parcel2, a, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C3509a.m12585q(parcel2, a);
                    break;
                case 8:
                    account = (Account) C3509a.m12564a(parcel2, a, Account.CREATOR);
                    break;
                case 10:
                    featureArr = (Feature[]) C3509a.m12569b(parcel2, a, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) C3509a.m12569b(parcel2, a, Feature.CREATOR);
                    break;
                case 12:
                    z = C3509a.m12571c(parcel2, a);
                    break;
                default:
                    C3509a.m12568b(parcel2, a);
                    break;
            }
        }
        C3509a.m12560E(parcel2, b);
        GetServiceRequest getServiceRequest = new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z);
        return getServiceRequest;
    }
}

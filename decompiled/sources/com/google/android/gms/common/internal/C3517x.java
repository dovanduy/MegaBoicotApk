package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.common.internal.x */
public final class C3517x implements Creator<AuthAccountRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthAccountRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Integer num = null;
        Integer num2 = null;
        Account account = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel, a);
                    break;
                case 2:
                    iBinder = C3509a.m12584p(parcel, a);
                    break;
                case 3:
                    scopeArr = (Scope[]) C3509a.m12569b(parcel, a, Scope.CREATOR);
                    break;
                case 4:
                    num = C3509a.m12574f(parcel, a);
                    break;
                case 5:
                    num2 = C3509a.m12574f(parcel, a);
                    break;
                case 6:
                    account = (Account) C3509a.m12564a(parcel, a, Account.CREATOR);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        AuthAccountRequest authAccountRequest = new AuthAccountRequest(i, iBinder, scopeArr, num, num2, account);
        return authAccountRequest;
    }
}

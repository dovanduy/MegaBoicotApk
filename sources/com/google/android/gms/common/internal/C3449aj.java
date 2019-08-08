package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C3509a;

/* renamed from: com.google.android.gms.common.internal.aj */
public final class C3449aj implements Creator<SignInButtonConfig> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInButtonConfig[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C3509a.m12567b(parcel);
        int i = 0;
        int i2 = 0;
        Scope[] scopeArr = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C3509a.m12562a(parcel);
            switch (C3509a.m12561a(a)) {
                case 1:
                    i = C3509a.m12573e(parcel, a);
                    break;
                case 2:
                    i3 = C3509a.m12573e(parcel, a);
                    break;
                case 3:
                    i2 = C3509a.m12573e(parcel, a);
                    break;
                case 4:
                    scopeArr = (Scope[]) C3509a.m12569b(parcel, a, Scope.CREATOR);
                    break;
                default:
                    C3509a.m12568b(parcel, a);
                    break;
            }
        }
        C3509a.m12560E(parcel, b);
        return new SignInButtonConfig(i, i3, i2, scopeArr);
    }
}

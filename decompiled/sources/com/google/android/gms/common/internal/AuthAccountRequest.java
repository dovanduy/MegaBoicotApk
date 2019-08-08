package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Creator<AuthAccountRequest> CREATOR = new C3517x();

    /* renamed from: a */
    private final int f9914a;
    @Deprecated

    /* renamed from: b */
    private final IBinder f9915b;

    /* renamed from: c */
    private final Scope[] f9916c;

    /* renamed from: d */
    private Integer f9917d;

    /* renamed from: e */
    private Integer f9918e;

    /* renamed from: f */
    private Account f9919f;

    AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2, Account account) {
        this.f9914a = i;
        this.f9915b = iBinder;
        this.f9916c = scopeArr;
        this.f9917d = num;
        this.f9918e = num2;
        this.f9919f = account;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9914a);
        C3511b.m12602a(parcel, 2, this.f9915b, false);
        C3511b.m12614a(parcel, 3, (T[]) this.f9916c, i, false);
        C3511b.m12607a(parcel, 4, this.f9917d, false);
        C3511b.m12607a(parcel, 5, this.f9918e, false);
        C3511b.m12604a(parcel, 6, (Parcelable) this.f9919f, i, false);
        C3511b.m12596a(parcel, a);
    }
}

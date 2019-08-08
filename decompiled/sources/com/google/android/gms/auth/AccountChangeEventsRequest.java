package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEventsRequest> CREATOR = new C3232b();

    /* renamed from: a */
    private final int f9224a;

    /* renamed from: b */
    private int f9225b;
    @Deprecated

    /* renamed from: c */
    private String f9226c;

    /* renamed from: d */
    private Account f9227d;

    AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.f9224a = i;
        this.f9225b = i2;
        this.f9226c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f9227d = account;
        } else {
            this.f9227d = new Account(str, "com.google");
        }
    }

    public AccountChangeEventsRequest() {
        this.f9224a = 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9224a);
        C3511b.m12599a(parcel, 2, this.f9225b);
        C3511b.m12609a(parcel, 3, this.f9226c, false);
        C3511b.m12604a(parcel, 4, (Parcelable) this.f9227d, i, false);
        C3511b.m12596a(parcel, a);
    }
}

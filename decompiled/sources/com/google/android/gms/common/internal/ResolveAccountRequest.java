package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Creator<ResolveAccountRequest> CREATOR = new C3447ah();

    /* renamed from: a */
    private final int f9938a;

    /* renamed from: b */
    private final Account f9939b;

    /* renamed from: c */
    private final int f9940c;

    /* renamed from: d */
    private final GoogleSignInAccount f9941d;

    ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f9938a = i;
        this.f9939b = account;
        this.f9940c = i2;
        this.f9941d = googleSignInAccount;
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    /* renamed from: a */
    public Account mo13462a() {
        return this.f9939b;
    }

    /* renamed from: b */
    public int mo13463b() {
        return this.f9940c;
    }

    /* renamed from: c */
    public GoogleSignInAccount mo13464c() {
        return this.f9941d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9938a);
        C3511b.m12604a(parcel, 2, (Parcelable) mo13462a(), i, false);
        C3511b.m12599a(parcel, 3, mo13463b());
        C3511b.m12604a(parcel, 4, (Parcelable) mo13464c(), i, false);
        C3511b.m12596a(parcel, a);
    }
}

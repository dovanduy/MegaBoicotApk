package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import javax.annotation.Nullable;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<SignInAccount> CREATOR = new C3231j();
    @Deprecated

    /* renamed from: a */
    private String f9383a;

    /* renamed from: b */
    private GoogleSignInAccount f9384b;
    @Deprecated

    /* renamed from: c */
    private String f9385c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f9384b = googleSignInAccount;
        this.f9383a = C3513t.m12628a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.f9385c = C3513t.m12628a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
    }

    @Nullable
    /* renamed from: a */
    public final GoogleSignInAccount mo12978a() {
        return this.f9384b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 4, this.f9383a, false);
        C3511b.m12604a(parcel, 7, (Parcelable) this.f9384b, i, false);
        C3511b.m12609a(parcel, 8, this.f9385c, false);
        C3511b.m12596a(parcel, a);
    }
}

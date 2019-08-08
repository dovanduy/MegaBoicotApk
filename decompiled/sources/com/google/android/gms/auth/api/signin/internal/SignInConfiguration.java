package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<SignInConfiguration> CREATOR = new C3229u();

    /* renamed from: a */
    private final String f9400a;

    /* renamed from: b */
    private GoogleSignInOptions f9401b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f9400a = C3513t.m12627a(str);
        this.f9401b = googleSignInOptions;
    }

    /* renamed from: a */
    public final GoogleSignInOptions mo12993a() {
        return this.f9401b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 2, this.f9400a, false);
        C3511b.m12604a(parcel, 5, (Parcelable) this.f9401b, i, false);
        C3511b.m12596a(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (!this.f9400a.equals(signInConfiguration.f9400a) || (this.f9401b != null ? !this.f9401b.equals(signInConfiguration.f9401b) : signInConfiguration.f9401b != null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return new C3209a().mo12999a((Object) this.f9400a).mo12999a((Object) this.f9401b).mo12998a();
    }
}

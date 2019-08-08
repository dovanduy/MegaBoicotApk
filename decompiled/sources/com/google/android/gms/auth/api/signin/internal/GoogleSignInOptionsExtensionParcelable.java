package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C3211c();

    /* renamed from: a */
    private final int f9397a;

    /* renamed from: b */
    private int f9398b;

    /* renamed from: c */
    private Bundle f9399c;

    GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f9397a = i;
        this.f9398b = i2;
        this.f9399c = bundle;
    }

    /* renamed from: a */
    public int mo12991a() {
        return this.f9398b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9397a);
        C3511b.m12599a(parcel, 2, mo12991a());
        C3511b.m12601a(parcel, 3, this.f9399c, false);
        C3511b.m12596a(parcel, a);
    }
}

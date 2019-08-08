package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Creator<SignInButtonConfig> CREATOR = new C3449aj();

    /* renamed from: a */
    private final int f9947a;

    /* renamed from: b */
    private final int f9948b;

    /* renamed from: c */
    private final int f9949c;
    @Deprecated

    /* renamed from: d */
    private final Scope[] f9950d;

    SignInButtonConfig(int i, int i2, int i3, Scope[] scopeArr) {
        this.f9947a = i;
        this.f9948b = i2;
        this.f9949c = i3;
        this.f9950d = scopeArr;
    }

    public SignInButtonConfig(int i, int i2, Scope[] scopeArr) {
        this(1, i, i2, null);
    }

    /* renamed from: a */
    public int mo13472a() {
        return this.f9948b;
    }

    /* renamed from: b */
    public int mo13473b() {
        return this.f9949c;
    }

    @Deprecated
    /* renamed from: c */
    public Scope[] mo13474c() {
        return this.f9950d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9947a);
        C3511b.m12599a(parcel, 2, mo13472a());
        C3511b.m12599a(parcel, 3, mo13473b());
        C3511b.m12614a(parcel, 4, (T[]) mo13474c(), i, false);
        C3511b.m12596a(parcel, a);
    }
}

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zaj extends AbstractSafeParcelable {
    public static final Creator<zaj> CREATOR = new C4916i();

    /* renamed from: a */
    private final int f16058a;

    /* renamed from: b */
    private final ConnectionResult f16059b;

    /* renamed from: c */
    private final ResolveAccountResponse f16060c;

    zaj(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.f16058a = i;
        this.f16059b = connectionResult;
        this.f16060c = resolveAccountResponse;
    }

    public zaj(int i) {
        this(new ConnectionResult(8, null), null);
    }

    private zaj(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, null);
    }

    /* renamed from: a */
    public final ConnectionResult mo17813a() {
        return this.f16059b;
    }

    /* renamed from: b */
    public final ResolveAccountResponse mo17814b() {
        return this.f16060c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f16058a);
        C3511b.m12604a(parcel, 2, (Parcelable) this.f16059b, i, false);
        C3511b.m12604a(parcel, 3, (Parcelable) this.f16060c, i, false);
        C3511b.m12596a(parcel, a);
    }
}

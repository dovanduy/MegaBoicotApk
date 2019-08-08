package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3494m.C3495a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Creator<ResolveAccountResponse> CREATOR = new C3448ai();

    /* renamed from: a */
    private final int f9942a;

    /* renamed from: b */
    private IBinder f9943b;

    /* renamed from: c */
    private ConnectionResult f9944c;

    /* renamed from: d */
    private boolean f9945d;

    /* renamed from: e */
    private boolean f9946e;

    ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f9942a = i;
        this.f9943b = iBinder;
        this.f9944c = connectionResult;
        this.f9945d = z;
        this.f9946e = z2;
    }

    /* renamed from: a */
    public C3494m mo13466a() {
        return C3495a.m12537a(this.f9943b);
    }

    /* renamed from: b */
    public ConnectionResult mo13467b() {
        return this.f9944c;
    }

    /* renamed from: c */
    public boolean mo13468c() {
        return this.f9945d;
    }

    /* renamed from: d */
    public boolean mo13469d() {
        return this.f9946e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9942a);
        C3511b.m12602a(parcel, 2, this.f9943b, false);
        C3511b.m12604a(parcel, 3, (Parcelable) mo13467b(), i, false);
        C3511b.m12612a(parcel, 4, mo13468c());
        C3511b.m12612a(parcel, 5, mo13469d());
        C3511b.m12596a(parcel, a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f9944c.equals(resolveAccountResponse.f9944c) && mo13466a().equals(resolveAccountResponse.mo13466a());
    }
}

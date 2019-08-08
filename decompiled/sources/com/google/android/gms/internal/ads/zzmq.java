package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.search.C3170a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

@C3718cm
public final class zzmq extends AbstractSafeParcelable {
    public static final Creator<zzmq> CREATOR = new arc();

    /* renamed from: a */
    public final String f14556a;

    public zzmq(C3170a aVar) {
        this.f14556a = aVar.mo12858a();
    }

    zzmq(String str) {
        this.f14556a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 15, this.f14556a, false);
        C3511b.m12596a(parcel, a);
    }
}

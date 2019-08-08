package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<FavaDiagnosticsEntity> CREATOR = new C3531a();

    /* renamed from: a */
    private final int f10103a;

    /* renamed from: b */
    private final String f10104b;

    /* renamed from: c */
    private final int f10105c;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.f10103a = i;
        this.f10104b = str;
        this.f10105c = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f10103a);
        C3511b.m12609a(parcel, 2, this.f10104b, false);
        C3511b.m12599a(parcel, 3, this.f10105c);
        C3511b.m12596a(parcel, a);
    }
}

package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.location.C4704ae;
import com.google.android.gms.location.C4705af;

public final class zzo extends AbstractSafeParcelable {
    public static final Creator<zzo> CREATOR = new C4667am();

    /* renamed from: a */
    private int f15274a;

    /* renamed from: b */
    private zzm f15275b;

    /* renamed from: c */
    private C4704ae f15276c;

    /* renamed from: d */
    private C4675f f15277d;

    zzo(int i, zzm zzm, IBinder iBinder, IBinder iBinder2) {
        this.f15274a = i;
        this.f15275b = zzm;
        C4675f fVar = null;
        this.f15276c = iBinder == null ? null : C4705af.m20292a(iBinder);
        if (!(iBinder2 == null || iBinder2 == null)) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            fVar = queryLocalInterface instanceof C4675f ? (C4675f) queryLocalInterface : new C4677h(iBinder2);
        }
        this.f15277d = fVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f15274a);
        C3511b.m12604a(parcel, 2, (Parcelable) this.f15275b, i, false);
        IBinder iBinder = null;
        C3511b.m12602a(parcel, 3, this.f15276c == null ? null : this.f15276c.asBinder(), false);
        if (this.f15277d != null) {
            iBinder = this.f15277d.asBinder();
        }
        C3511b.m12602a(parcel, 4, iBinder, false);
        C3511b.m12596a(parcel, a);
    }
}

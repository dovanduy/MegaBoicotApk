package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.location.C4707ah;
import com.google.android.gms.location.C4708ai;
import com.google.android.gms.location.C4710ak;
import com.google.android.gms.location.C4711al;

public final class zzbf extends AbstractSafeParcelable {
    public static final Creator<zzbf> CREATOR = new C4693x();

    /* renamed from: a */
    private int f15254a;

    /* renamed from: b */
    private zzbd f15255b;

    /* renamed from: c */
    private C4710ak f15256c;

    /* renamed from: d */
    private PendingIntent f15257d;

    /* renamed from: e */
    private C4707ah f15258e;

    /* renamed from: f */
    private C4675f f15259f;

    zzbf(int i, zzbd zzbd, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f15254a = i;
        this.f15255b = zzbd;
        C4675f fVar = null;
        this.f15256c = iBinder == null ? null : C4711al.m20301a(iBinder);
        this.f15257d = pendingIntent;
        this.f15258e = iBinder2 == null ? null : C4708ai.m20296a(iBinder2);
        if (!(iBinder3 == null || iBinder3 == null)) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            fVar = queryLocalInterface instanceof C4675f ? (C4675f) queryLocalInterface : new C4677h(iBinder3);
        }
        this.f15259f = fVar;
    }

    /* renamed from: a */
    public static zzbf m20254a(C4707ah ahVar, C4675f fVar) {
        zzbf zzbf = new zzbf(2, null, null, null, ahVar.asBinder(), fVar != null ? fVar.asBinder() : null);
        return zzbf;
    }

    /* renamed from: a */
    public static zzbf m20255a(C4710ak akVar, C4675f fVar) {
        zzbf zzbf = new zzbf(2, null, akVar.asBinder(), null, null, fVar != null ? fVar.asBinder() : null);
        return zzbf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f15254a);
        C3511b.m12604a(parcel, 2, (Parcelable) this.f15255b, i, false);
        IBinder iBinder = null;
        C3511b.m12602a(parcel, 3, this.f15256c == null ? null : this.f15256c.asBinder(), false);
        C3511b.m12604a(parcel, 4, (Parcelable) this.f15257d, i, false);
        C3511b.m12602a(parcel, 5, this.f15258e == null ? null : this.f15258e.asBinder(), false);
        if (this.f15259f != null) {
            iBinder = this.f15259f.asBinder();
        }
        C3511b.m12602a(parcel, 6, iBinder, false);
        C3511b.m12596a(parcel, a);
    }
}

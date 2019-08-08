package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ds */
public final class C3751ds extends aiz implements C3749dq {
    C3751ds(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* renamed from: a */
    public final zzaej mo15250a(zzaef zzaef) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) zzaef);
        Parcel a = mo14352a(1, v_);
        zzaej zzaej = (zzaej) ajb.m14214a(a, zzaej.CREATOR);
        a.recycle();
        return zzaej;
    }

    /* renamed from: a */
    public final void mo15251a(zzaef zzaef, C3752dt dtVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) zzaef);
        ajb.m14215a(v_, (IInterface) dtVar);
        mo14354b(2, v_);
    }

    /* renamed from: a */
    public final void mo15252a(zzaey zzaey, C3755dw dwVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) zzaey);
        ajb.m14215a(v_, (IInterface) dwVar);
        mo14354b(4, v_);
    }

    /* renamed from: b */
    public final void mo15253b(zzaey zzaey, C3755dw dwVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) zzaey);
        ajb.m14215a(v_, (IInterface) dwVar);
        mo14354b(5, v_);
    }
}

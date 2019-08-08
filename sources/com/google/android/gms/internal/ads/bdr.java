package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;

public final class bdr extends aiz implements bdp {
    bdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: a */
    public final zzzt mo15180a() throws RemoteException {
        Parcel a = mo14352a(2, mo14355v_());
        zzzt zzzt = (zzzt) ajb.m14214a(a, zzzt.CREATOR);
        a.recycle();
        return zzzt;
    }

    /* renamed from: a */
    public final void mo15181a(C3235a aVar, String str, Bundle bundle, bds bds) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        v_.writeString(str);
        ajb.m14216a(v_, (Parcelable) bundle);
        ajb.m14215a(v_, (IInterface) bds);
        mo14354b(1, v_);
    }

    /* renamed from: a */
    public final void mo15182a(byte[] bArr, String str, Bundle bundle, C3235a aVar, bdl bdl, bcg bcg, zzjn zzjn) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeByteArray(bArr);
        v_.writeString(str);
        ajb.m14216a(v_, (Parcelable) bundle);
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14215a(v_, (IInterface) bdl);
        ajb.m14215a(v_, (IInterface) bcg);
        ajb.m14216a(v_, (Parcelable) zzjn);
        mo14354b(4, v_);
    }

    /* renamed from: a */
    public final void mo15183a(byte[] bArr, String str, Bundle bundle, C3235a aVar, bdn bdn, bcg bcg) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeByteArray(bArr);
        v_.writeString(str);
        ajb.m14216a(v_, (Parcelable) bundle);
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14215a(v_, (IInterface) bdn);
        ajb.m14215a(v_, (IInterface) bcg);
        mo14354b(6, v_);
    }

    /* renamed from: b */
    public final zzzt mo15184b() throws RemoteException {
        Parcel a = mo14352a(3, mo14355v_());
        zzzt zzzt = (zzzt) ajb.m14214a(a, zzzt.CREATOR);
        a.recycle();
        return zzzt;
    }

    /* renamed from: c */
    public final aqe mo15185c() throws RemoteException {
        Parcel a = mo14352a(5, mo14355v_());
        aqe a2 = aqf.m14787a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final void mo15186d() throws RemoteException {
        mo14354b(7, mo14355v_());
    }
}

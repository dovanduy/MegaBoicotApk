package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;

public final class aqb extends aiz implements apz {
    aqb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* renamed from: a */
    public final void mo12698a() throws RemoteException {
        mo14354b(1, mo14355v_());
    }

    /* renamed from: a */
    public final void mo12699a(float f) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeFloat(f);
        mo14354b(2, v_);
    }

    /* renamed from: a */
    public final void mo12700a(C3235a aVar, String str) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        v_.writeString(str);
        mo14354b(5, v_);
    }

    /* renamed from: a */
    public final void mo12702a(String str) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        mo14354b(3, v_);
    }

    /* renamed from: a */
    public final void mo12703a(String str, C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(6, v_);
    }

    /* renamed from: a */
    public final void mo12704a(boolean z) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14217a(v_, z);
        mo14354b(4, v_);
    }

    /* renamed from: b */
    public final float mo12705b() throws RemoteException {
        Parcel a = mo14352a(7, mo14355v_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: c */
    public final boolean mo12706c() throws RemoteException {
        Parcel a = mo14352a(8, mo14355v_());
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;

public final class ajf extends aiz implements ajd {
    ajf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    /* renamed from: a */
    public final void mo14360a() throws RemoteException {
        mo14354b(3, mo14355v_());
    }

    /* renamed from: a */
    public final void mo14361a(int i) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeInt(i);
        mo14354b(6, v_);
    }

    /* renamed from: a */
    public final void mo14362a(C3235a aVar, String str) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        v_.writeString(str);
        mo14354b(2, v_);
    }

    /* renamed from: a */
    public final void mo14363a(C3235a aVar, String str, String str2) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        v_.writeString(str);
        v_.writeString(null);
        mo14354b(8, v_);
    }

    /* renamed from: a */
    public final void mo14364a(byte[] bArr) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeByteArray(bArr);
        mo14354b(5, v_);
    }

    /* renamed from: a */
    public final void mo14365a(int[] iArr) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeIntArray(null);
        mo14354b(4, v_);
    }

    /* renamed from: b */
    public final void mo14366b(int i) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeInt(i);
        mo14354b(7, v_);
    }
}

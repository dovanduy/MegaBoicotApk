package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;

/* renamed from: com.google.android.gms.internal.ads.t */
public final class C4165t extends aiz implements C4111r {
    C4165t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* renamed from: a */
    public final void mo12662a(int i, int i2, Intent intent) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeInt(i);
        v_.writeInt(i2);
        ajb.m14216a(v_, (Parcelable) intent);
        mo14354b(12, v_);
    }

    /* renamed from: a */
    public final void mo12663a(Bundle bundle) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) bundle);
        mo14354b(1, v_);
    }

    /* renamed from: a */
    public final void mo12665a(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(13, v_);
    }

    /* renamed from: b */
    public final void mo12668b(Bundle bundle) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) bundle);
        Parcel a = mo14352a(6, v_);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    /* renamed from: d */
    public final void mo12670d() throws RemoteException {
        mo14354b(10, mo14355v_());
    }

    /* renamed from: e */
    public final boolean mo12671e() throws RemoteException {
        Parcel a = mo14352a(11, mo14355v_());
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: f */
    public final void mo12672f() throws RemoteException {
        mo14354b(2, mo14355v_());
    }

    /* renamed from: g */
    public final void mo12673g() throws RemoteException {
        mo14354b(3, mo14355v_());
    }

    /* renamed from: h */
    public final void mo12674h() throws RemoteException {
        mo14354b(4, mo14355v_());
    }

    /* renamed from: i */
    public final void mo12675i() throws RemoteException {
        mo14354b(5, mo14355v_());
    }

    /* renamed from: j */
    public final void mo12676j() throws RemoteException {
        mo14354b(7, mo14355v_());
    }

    /* renamed from: k */
    public final void mo12677k() throws RemoteException {
        mo14354b(8, mo14355v_());
    }

    /* renamed from: l */
    public final void mo12678l() throws RemoteException {
        mo14354b(9, mo14355v_());
    }
}

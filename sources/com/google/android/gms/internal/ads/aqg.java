package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class aqg extends aiz implements aqe {
    aqg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: a */
    public final void mo14564a() throws RemoteException {
        mo14354b(1, mo14355v_());
    }

    /* renamed from: a */
    public final void mo14565a(aqh aqh) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aqh);
        mo14354b(8, v_);
    }

    /* renamed from: a */
    public final void mo14566a(boolean z) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14217a(v_, z);
        mo14354b(3, v_);
    }

    /* renamed from: b */
    public final void mo14567b() throws RemoteException {
        mo14354b(2, mo14355v_());
    }

    /* renamed from: c */
    public final boolean mo14568c() throws RemoteException {
        Parcel a = mo14352a(4, mo14355v_());
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final int mo14569d() throws RemoteException {
        Parcel a = mo14352a(5, mo14355v_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: e */
    public final float mo14570e() throws RemoteException {
        Parcel a = mo14352a(9, mo14355v_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: f */
    public final float mo14571f() throws RemoteException {
        Parcel a = mo14352a(6, mo14355v_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: g */
    public final float mo14572g() throws RemoteException {
        Parcel a = mo14352a(7, mo14355v_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: h */
    public final aqh mo14573h() throws RemoteException {
        aqh aqh;
        Parcel a = mo14352a(11, mo14355v_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aqh = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            aqh = queryLocalInterface instanceof aqh ? (aqh) queryLocalInterface : new aqj(readStrongBinder);
        }
        a.recycle();
        return aqh;
    }

    /* renamed from: i */
    public final boolean mo14574i() throws RemoteException {
        Parcel a = mo14352a(10, mo14355v_());
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final boolean mo14575j() throws RemoteException {
        Parcel a = mo14352a(12, mo14355v_());
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }
}

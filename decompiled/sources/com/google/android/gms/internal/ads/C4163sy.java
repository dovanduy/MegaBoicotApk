package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3235a.C3236a;

/* renamed from: com.google.android.gms.internal.ads.sy */
public final class C4163sy extends aiz implements C4161sw {
    C4163sy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    /* renamed from: a */
    public final C3235a mo16059a(String str, C3235a aVar, String str2, String str3, String str4) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        ajb.m14215a(v_, (IInterface) aVar);
        v_.writeString(str2);
        v_.writeString(str3);
        v_.writeString(str4);
        Parcel a = mo14352a(3, v_);
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final String mo16060a() throws RemoteException {
        Parcel a = mo14352a(6, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo16061a(C3235a aVar, C3235a aVar2) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14215a(v_, (IInterface) aVar2);
        mo14354b(5, v_);
    }

    /* renamed from: a */
    public final boolean mo16062a(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        Parcel a = mo14352a(2, v_);
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final void mo16063b(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(4, v_);
    }

    /* renamed from: c */
    public final void mo16064c(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(7, v_);
    }
}

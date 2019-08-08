package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3235a.C3236a;
import java.util.ArrayList;
import java.util.List;

public final class avg extends aiz implements ave {
    avg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: a */
    public final String mo14796a(String str) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        Parcel a = mo14352a(1, v_);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final List<String> mo14797a() throws RemoteException {
        Parcel a = mo14352a(3, mo14355v_());
        ArrayList createStringArrayList = a.createStringArrayList();
        a.recycle();
        return createStringArrayList;
    }

    /* renamed from: a */
    public final boolean mo14798a(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        Parcel a = mo14352a(10, v_);
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final C3235a mo14799b() throws RemoteException {
        Parcel a = mo14352a(11, mo14355v_());
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final auh mo14800b(String str) throws RemoteException {
        auh auh;
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        Parcel a = mo14352a(2, v_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            auh = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            auh = queryLocalInterface instanceof auh ? (auh) queryLocalInterface : new auj(readStrongBinder);
        }
        a.recycle();
        return auh;
    }

    /* renamed from: c */
    public final aqe mo14801c() throws RemoteException {
        Parcel a = mo14352a(7, mo14355v_());
        aqe a2 = aqf.m14787a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final void mo14802c(String str) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        mo14354b(5, v_);
    }

    /* renamed from: d */
    public final void mo14803d() throws RemoteException {
        mo14354b(6, mo14355v_());
    }

    /* renamed from: e */
    public final C3235a mo14804e() throws RemoteException {
        Parcel a = mo14352a(9, mo14355v_());
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: f */
    public final void mo14805f() throws RemoteException {
        mo14354b(8, mo14355v_());
    }

    /* renamed from: l */
    public final String mo14771l() throws RemoteException {
        Parcel a = mo14352a(4, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}

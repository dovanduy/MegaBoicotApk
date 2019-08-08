package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3235a.C3236a;
import java.util.ArrayList;
import java.util.List;

public final class awf extends aiz implements awd {
    awf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* renamed from: a */
    public final String mo14809a() throws RemoteException {
        Parcel a = mo14352a(2, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo14810a(Bundle bundle) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) bundle);
        mo14354b(15, v_);
    }

    /* renamed from: a */
    public final void mo14811a(awb awb) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) awb);
        mo14354b(21, v_);
    }

    /* renamed from: b */
    public final List mo14759b() throws RemoteException {
        Parcel a = mo14352a(3, mo14355v_());
        ArrayList b = ajb.m14219b(a);
        a.recycle();
        return b;
    }

    /* renamed from: b */
    public final boolean mo14812b(Bundle bundle) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) bundle);
        Parcel a = mo14352a(16, v_);
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final String mo14813c() throws RemoteException {
        Parcel a = mo14352a(4, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo14814c(Bundle bundle) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) bundle);
        mo14354b(17, v_);
    }

    /* renamed from: d */
    public final auh mo14815d() throws RemoteException {
        auh auh;
        Parcel a = mo14352a(5, mo14355v_());
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

    /* renamed from: e */
    public final String mo14816e() throws RemoteException {
        Parcel a = mo14352a(6, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final String mo14817f() throws RemoteException {
        Parcel a = mo14352a(7, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: g */
    public final double mo14818g() throws RemoteException {
        Parcel a = mo14352a(8, mo14355v_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: h */
    public final String mo14819h() throws RemoteException {
        Parcel a = mo14352a(9, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: i */
    public final String mo14820i() throws RemoteException {
        Parcel a = mo14352a(10, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: j */
    public final aqe mo14821j() throws RemoteException {
        Parcel a = mo14352a(11, mo14355v_());
        aqe a2 = aqf.m14787a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final C3235a mo14822n() throws RemoteException {
        Parcel a = mo14352a(18, mo14355v_());
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: p */
    public final C3235a mo14823p() throws RemoteException {
        Parcel a = mo14352a(19, mo14355v_());
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: q */
    public final String mo14824q() throws RemoteException {
        Parcel a = mo14352a(12, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: r */
    public final Bundle mo14825r() throws RemoteException {
        Parcel a = mo14352a(20, mo14355v_());
        Bundle bundle = (Bundle) ajb.m14214a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: s */
    public final aud mo14826s() throws RemoteException {
        aud aud;
        Parcel a = mo14352a(14, mo14355v_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aud = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            aud = queryLocalInterface instanceof aud ? (aud) queryLocalInterface : new auf(readStrongBinder);
        }
        a.recycle();
        return aud;
    }

    /* renamed from: t */
    public final void mo14827t() throws RemoteException {
        mo14354b(13, mo14355v_());
    }

    /* renamed from: u */
    public final void mo14828u() throws RemoteException {
        mo14354b(22, mo14355v_());
    }
}

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

public final class auy extends aiz implements auw {
    auy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* renamed from: a */
    public final String mo14756a() throws RemoteException {
        Parcel a = mo14352a(3, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo14757a(Bundle bundle) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) bundle);
        mo14354b(14, v_);
    }

    /* renamed from: b */
    public final List mo14759b() throws RemoteException {
        Parcel a = mo14352a(4, mo14355v_());
        ArrayList b = ajb.m14219b(a);
        a.recycle();
        return b;
    }

    /* renamed from: b */
    public final boolean mo14760b(Bundle bundle) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) bundle);
        Parcel a = mo14352a(15, v_);
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final String mo14761c() throws RemoteException {
        Parcel a = mo14352a(5, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo14762c(Bundle bundle) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) bundle);
        mo14354b(16, v_);
    }

    /* renamed from: d */
    public final auh mo14763d() throws RemoteException {
        auh auh;
        Parcel a = mo14352a(6, mo14355v_());
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
    public final String mo14764e() throws RemoteException {
        Parcel a = mo14352a(7, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final double mo14765f() throws RemoteException {
        Parcel a = mo14352a(8, mo14355v_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: g */
    public final String mo14766g() throws RemoteException {
        Parcel a = mo14352a(9, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: h */
    public final String mo14767h() throws RemoteException {
        Parcel a = mo14352a(10, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: i */
    public final aqe mo14768i() throws RemoteException {
        Parcel a = mo14352a(13, mo14355v_());
        aqe a2 = aqf.m14787a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final C3235a mo14769j() throws RemoteException {
        Parcel a = mo14352a(2, mo14355v_());
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final Bundle mo14773n() throws RemoteException {
        Parcel a = mo14352a(11, mo14355v_());
        Bundle bundle = (Bundle) ajb.m14214a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: p */
    public final C3235a mo14775p() throws RemoteException {
        Parcel a = mo14352a(18, mo14355v_());
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: q */
    public final String mo14776q() throws RemoteException {
        Parcel a = mo14352a(19, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: r */
    public final aud mo14777r() throws RemoteException {
        aud aud;
        Parcel a = mo14352a(17, mo14355v_());
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

    /* renamed from: s */
    public final void mo14778s() throws RemoteException {
        mo14354b(12, mo14355v_());
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;

/* renamed from: com.google.android.gms.internal.ads.ge */
public final class C3819ge extends aiz implements C3816gb {
    C3819ge(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* renamed from: a */
    public final void mo14654a() throws RemoteException {
        mo14354b(2, mo14355v_());
    }

    /* renamed from: a */
    public final void mo14655a(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(9, v_);
    }

    /* renamed from: a */
    public final void mo14656a(apm apm) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) apm);
        mo14354b(14, v_);
    }

    /* renamed from: a */
    public final void mo14657a(C3813fz fzVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) fzVar);
        mo14354b(16, v_);
    }

    /* renamed from: a */
    public final void mo14658a(C3822gh ghVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) ghVar);
        mo14354b(3, v_);
    }

    /* renamed from: a */
    public final void mo14659a(zzahk zzahk) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) zzahk);
        mo14354b(1, v_);
    }

    /* renamed from: a */
    public final void mo14660a(String str) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        mo14354b(13, v_);
    }

    /* renamed from: a */
    public final void mo14661a(boolean z) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14217a(v_, z);
        mo14354b(34, v_);
    }

    /* renamed from: b */
    public final Bundle mo14662b() throws RemoteException {
        Parcel a = mo14352a(15, mo14355v_());
        Bundle bundle = (Bundle) ajb.m14214a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: b */
    public final void mo14663b(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(10, v_);
    }

    /* renamed from: c */
    public final void mo14664c(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(11, v_);
    }

    /* renamed from: c */
    public final boolean mo14665c() throws RemoteException {
        Parcel a = mo14352a(5, mo14355v_());
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final void mo14666d() throws RemoteException {
        mo14354b(6, mo14355v_());
    }

    /* renamed from: e */
    public final void mo14667e() throws RemoteException {
        mo14354b(7, mo14355v_());
    }

    /* renamed from: f */
    public final void mo14668f() throws RemoteException {
        mo14354b(8, mo14355v_());
    }

    /* renamed from: g */
    public final String mo14669g() throws RemoteException {
        Parcel a = mo14352a(12, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}

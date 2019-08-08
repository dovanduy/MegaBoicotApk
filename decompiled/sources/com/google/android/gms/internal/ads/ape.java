package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public final class ape extends aiz implements apc {
    ape(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* renamed from: a */
    public final aoz mo12638a() throws RemoteException {
        aoz aoz;
        Parcel a = mo14352a(1, mo14355v_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aoz = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            aoz = queryLocalInterface instanceof aoz ? (aoz) queryLocalInterface : new apb(readStrongBinder);
        }
        a.recycle();
        return aoz;
    }

    /* renamed from: a */
    public final void mo12639a(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) publisherAdViewOptions);
        mo14354b(9, v_);
    }

    /* renamed from: a */
    public final void mo12640a(aow aow) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aow);
        mo14354b(2, v_);
    }

    /* renamed from: a */
    public final void mo12641a(apw apw) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) apw);
        mo14354b(7, v_);
    }

    /* renamed from: a */
    public final void mo12642a(avi avi) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) avi);
        mo14354b(3, v_);
    }

    /* renamed from: a */
    public final void mo12643a(avl avl) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) avl);
        mo14354b(4, v_);
    }

    /* renamed from: a */
    public final void mo12644a(avv avv, zzjn zzjn) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) avv);
        ajb.m14216a(v_, (Parcelable) zzjn);
        mo14354b(8, v_);
    }

    /* renamed from: a */
    public final void mo12645a(avy avy) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) avy);
        mo14354b(10, v_);
    }

    /* renamed from: a */
    public final void mo12646a(zzpl zzpl) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) zzpl);
        mo14354b(6, v_);
    }

    /* renamed from: a */
    public final void mo12647a(String str, avs avs, avp avp) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        ajb.m14215a(v_, (IInterface) avs);
        ajb.m14215a(v_, (IInterface) avp);
        mo14354b(5, v_);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;

/* renamed from: com.google.android.gms.internal.ads.hh */
public final class C3849hh extends aiz implements C3847hf {
    C3849hh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: a */
    public final void mo15340a(Bundle bundle) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) bundle);
        mo14354b(12, v_);
    }

    /* renamed from: a */
    public final void mo15341a(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(1, v_);
    }

    /* renamed from: a */
    public final void mo15342a(C3235a aVar, int i) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        v_.writeInt(i);
        mo14354b(2, v_);
    }

    /* renamed from: a */
    public final void mo15343a(C3235a aVar, zzaig zzaig) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14216a(v_, (Parcelable) zzaig);
        mo14354b(7, v_);
    }

    /* renamed from: b */
    public final void mo15347b(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(3, v_);
    }

    /* renamed from: b */
    public final void mo15348b(C3235a aVar, int i) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        v_.writeInt(i);
        mo14354b(9, v_);
    }

    /* renamed from: c */
    public final void mo15349c(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(4, v_);
    }

    /* renamed from: d */
    public final void mo15350d(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(5, v_);
    }

    /* renamed from: e */
    public final void mo15351e(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(6, v_);
    }

    /* renamed from: f */
    public final void mo15352f(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(8, v_);
    }

    /* renamed from: g */
    public final void mo15353g(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(10, v_);
    }

    /* renamed from: h */
    public final void mo15354h(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(11, v_);
    }
}

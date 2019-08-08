package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3235a.C3236a;

public final class apj extends aiz implements aph {
    apj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* renamed from: D */
    public final String mo12395D() throws RemoteException {
        Parcel a = mo14352a(31, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: E */
    public final apq mo12396E() throws RemoteException {
        apq apq;
        Parcel a = mo14352a(32, mo14355v_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            apq = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            apq = queryLocalInterface instanceof apq ? (apq) queryLocalInterface : new aps(readStrongBinder);
        }
        a.recycle();
        return apq;
    }

    /* renamed from: F */
    public final aow mo12397F() throws RemoteException {
        aow aow;
        Parcel a = mo14352a(33, mo14355v_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aow = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            aow = queryLocalInterface instanceof aow ? (aow) queryLocalInterface : new aoy(readStrongBinder);
        }
        a.recycle();
        return aow;
    }

    /* renamed from: I */
    public final void mo12456I() throws RemoteException {
        mo14354b(9, mo14355v_());
    }

    /* renamed from: a */
    public final String mo12504a() throws RemoteException {
        Parcel a = mo14352a(18, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo12404a(C3649af afVar, String str) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) afVar);
        v_.writeString(str);
        mo14354b(15, v_);
    }

    /* renamed from: a */
    public final void mo12405a(aot aot) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aot);
        mo14354b(20, v_);
    }

    /* renamed from: a */
    public final void mo12406a(aow aow) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aow);
        mo14354b(7, v_);
    }

    /* renamed from: a */
    public final void mo12407a(apm apm) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) apm);
        mo14354b(36, v_);
    }

    /* renamed from: a */
    public final void mo12408a(apq apq) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) apq);
        mo14354b(8, v_);
    }

    /* renamed from: a */
    public final void mo12409a(apw apw) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) apw);
        mo14354b(21, v_);
    }

    /* renamed from: a */
    public final void mo12411a(aso aso) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aso);
        mo14354b(19, v_);
    }

    /* renamed from: a */
    public final void mo12413a(C3822gh ghVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) ghVar);
        mo14354b(24, v_);
    }

    /* renamed from: a */
    public final void mo12416a(C4335y yVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) yVar);
        mo14354b(14, v_);
    }

    /* renamed from: a */
    public final void mo12417a(zzjn zzjn) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) zzjn);
        mo14354b(13, v_);
    }

    /* renamed from: a */
    public final void mo12418a(zzlu zzlu) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) zzlu);
        mo14354b(30, v_);
    }

    /* renamed from: a */
    public final void mo12419a(zzmu zzmu) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) zzmu);
        mo14354b(29, v_);
    }

    /* renamed from: a */
    public final void mo12420a(String str) throws RemoteException {
        Parcel v_ = mo14355v_();
        v_.writeString(str);
        mo14354b(25, v_);
    }

    /* renamed from: b */
    public final void mo12430b(boolean z) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14217a(v_, z);
        mo14354b(22, v_);
    }

    /* renamed from: b */
    public final boolean mo12431b(zzjj zzjj) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) zzjj);
        Parcel a = mo14352a(4, v_);
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final void mo12432c(boolean z) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14217a(v_, z);
        mo14354b(34, v_);
    }

    /* renamed from: j */
    public final void mo12437j() throws RemoteException {
        mo14354b(2, mo14355v_());
    }

    /* renamed from: k */
    public final C3235a mo12438k() throws RemoteException {
        Parcel a = mo14352a(1, mo14355v_());
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final zzjn mo12439l() throws RemoteException {
        Parcel a = mo14352a(12, mo14355v_());
        zzjn zzjn = (zzjn) ajb.m14214a(a, zzjn.CREATOR);
        a.recycle();
        return zzjn;
    }

    /* renamed from: m */
    public final boolean mo12440m() throws RemoteException {
        Parcel a = mo14352a(3, mo14355v_());
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final void mo12441n() throws RemoteException {
        mo14354b(11, mo14355v_());
    }

    /* renamed from: o */
    public final void mo12442o() throws RemoteException {
        mo14354b(5, mo14355v_());
    }

    /* renamed from: p */
    public final void mo12443p() throws RemoteException {
        mo14354b(6, mo14355v_());
    }

    /* renamed from: q */
    public final Bundle mo12444q() throws RemoteException {
        Parcel a = mo14352a(37, mo14355v_());
        Bundle bundle = (Bundle) ajb.m14214a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: r */
    public final void mo12445r() throws RemoteException {
        mo14354b(10, mo14355v_());
    }

    /* renamed from: s */
    public final boolean mo12446s() throws RemoteException {
        Parcel a = mo14352a(23, mo14355v_());
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: t */
    public final aqe mo12447t() throws RemoteException {
        aqe aqe;
        Parcel a = mo14352a(26, mo14355v_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aqe = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            aqe = queryLocalInterface instanceof aqe ? (aqe) queryLocalInterface : new aqg(readStrongBinder);
        }
        a.recycle();
        return aqe;
    }

    /* renamed from: u_ */
    public final String mo12509u_() throws RemoteException {
        Parcel a = mo14352a(35, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}

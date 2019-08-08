package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3235a.C3236a;
import java.util.ArrayList;
import java.util.List;

public final class bcs extends aiz implements bcq {
    bcs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* renamed from: a */
    public final String mo15132a() throws RemoteException {
        Parcel a = mo14352a(2, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo15133a(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(9, v_);
    }

    /* renamed from: a */
    public final void mo15134a(C3235a aVar, C3235a aVar2, C3235a aVar3) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14215a(v_, (IInterface) aVar2);
        ajb.m14215a(v_, (IInterface) aVar3);
        mo14354b(22, v_);
    }

    /* renamed from: b */
    public final List mo15135b() throws RemoteException {
        Parcel a = mo14352a(3, mo14355v_());
        ArrayList b = ajb.m14219b(a);
        a.recycle();
        return b;
    }

    /* renamed from: b */
    public final void mo15136b(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(10, v_);
    }

    /* renamed from: c */
    public final String mo15137c() throws RemoteException {
        Parcel a = mo14352a(4, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo15138c(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(14, v_);
    }

    /* renamed from: d */
    public final auh mo15139d() throws RemoteException {
        Parcel a = mo14352a(5, mo14355v_());
        auh a2 = aui.m15356a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final String mo15140e() throws RemoteException {
        Parcel a = mo14352a(6, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final String mo15141f() throws RemoteException {
        Parcel a = mo14352a(7, mo14355v_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: g */
    public final void mo15142g() throws RemoteException {
        mo14354b(8, mo14355v_());
    }

    /* renamed from: h */
    public final boolean mo15143h() throws RemoteException {
        Parcel a = mo14352a(11, mo14355v_());
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: i */
    public final boolean mo15144i() throws RemoteException {
        Parcel a = mo14352a(12, mo14355v_());
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final Bundle mo15145j() throws RemoteException {
        Parcel a = mo14352a(13, mo14355v_());
        Bundle bundle = (Bundle) ajb.m14214a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: k */
    public final C3235a mo15146k() throws RemoteException {
        Parcel a = mo14352a(15, mo14355v_());
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final aqe mo15147l() throws RemoteException {
        Parcel a = mo14352a(16, mo14355v_());
        aqe a2 = aqf.m14787a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: m */
    public final aud mo15148m() throws RemoteException {
        Parcel a = mo14352a(19, mo14355v_());
        aud a2 = aue.m15350a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final C3235a mo15149n() throws RemoteException {
        Parcel a = mo14352a(20, mo14355v_());
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: o */
    public final C3235a mo15150o() throws RemoteException {
        Parcel a = mo14352a(21, mo14355v_());
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}

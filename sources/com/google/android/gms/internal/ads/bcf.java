package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3235a.C3236a;
import java.util.List;

public final class bcf extends aiz implements bcd {
    bcf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* renamed from: a */
    public final C3235a mo15083a() throws RemoteException {
        Parcel a = mo14352a(2, mo14355v_());
        C3235a a2 = C3236a.m11572a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo15084a(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        mo14354b(21, v_);
    }

    /* renamed from: a */
    public final void mo15085a(C3235a aVar, C3847hf hfVar, List<String> list) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14215a(v_, (IInterface) hfVar);
        v_.writeStringList(list);
        mo14354b(23, v_);
    }

    /* renamed from: a */
    public final void mo15086a(C3235a aVar, zzjj zzjj, String str, bcg bcg) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14216a(v_, (Parcelable) zzjj);
        v_.writeString(str);
        ajb.m14215a(v_, (IInterface) bcg);
        mo14354b(3, v_);
    }

    /* renamed from: a */
    public final void mo15087a(C3235a aVar, zzjj zzjj, String str, C3847hf hfVar, String str2) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14216a(v_, (Parcelable) zzjj);
        v_.writeString(str);
        ajb.m14215a(v_, (IInterface) hfVar);
        v_.writeString(str2);
        mo14354b(10, v_);
    }

    /* renamed from: a */
    public final void mo15088a(C3235a aVar, zzjj zzjj, String str, String str2, bcg bcg) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14216a(v_, (Parcelable) zzjj);
        v_.writeString(str);
        v_.writeString(str2);
        ajb.m14215a(v_, (IInterface) bcg);
        mo14354b(7, v_);
    }

    /* renamed from: a */
    public final void mo15089a(C3235a aVar, zzjj zzjj, String str, String str2, bcg bcg, zzpl zzpl, List<String> list) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14216a(v_, (Parcelable) zzjj);
        v_.writeString(str);
        v_.writeString(str2);
        ajb.m14215a(v_, (IInterface) bcg);
        ajb.m14216a(v_, (Parcelable) zzpl);
        v_.writeStringList(list);
        mo14354b(14, v_);
    }

    /* renamed from: a */
    public final void mo15090a(C3235a aVar, zzjn zzjn, zzjj zzjj, String str, bcg bcg) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14216a(v_, (Parcelable) zzjn);
        ajb.m14216a(v_, (Parcelable) zzjj);
        v_.writeString(str);
        ajb.m14215a(v_, (IInterface) bcg);
        mo14354b(1, v_);
    }

    /* renamed from: a */
    public final void mo15091a(C3235a aVar, zzjn zzjn, zzjj zzjj, String str, String str2, bcg bcg) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14216a(v_, (Parcelable) zzjn);
        ajb.m14216a(v_, (Parcelable) zzjj);
        v_.writeString(str);
        v_.writeString(str2);
        ajb.m14215a(v_, (IInterface) bcg);
        mo14354b(6, v_);
    }

    /* renamed from: a */
    public final void mo15092a(zzjj zzjj, String str) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) zzjj);
        v_.writeString(str);
        mo14354b(11, v_);
    }

    /* renamed from: a */
    public final void mo15093a(zzjj zzjj, String str, String str2) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14216a(v_, (Parcelable) zzjj);
        v_.writeString(str);
        v_.writeString(str2);
        mo14354b(20, v_);
    }

    /* renamed from: a */
    public final void mo15094a(boolean z) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14217a(v_, z);
        mo14354b(25, v_);
    }

    /* renamed from: b */
    public final void mo15095b() throws RemoteException {
        mo14354b(4, mo14355v_());
    }

    /* renamed from: c */
    public final void mo15096c() throws RemoteException {
        mo14354b(5, mo14355v_());
    }

    /* renamed from: d */
    public final void mo15097d() throws RemoteException {
        mo14354b(8, mo14355v_());
    }

    /* renamed from: e */
    public final void mo15098e() throws RemoteException {
        mo14354b(9, mo14355v_());
    }

    /* renamed from: f */
    public final void mo15099f() throws RemoteException {
        mo14354b(12, mo14355v_());
    }

    /* renamed from: g */
    public final boolean mo15100g() throws RemoteException {
        Parcel a = mo14352a(13, mo14355v_());
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: h */
    public final bcm mo15101h() throws RemoteException {
        bcm bcm;
        Parcel a = mo14352a(15, mo14355v_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bcm = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            bcm = queryLocalInterface instanceof bcm ? (bcm) queryLocalInterface : new bcp(readStrongBinder);
        }
        a.recycle();
        return bcm;
    }

    /* renamed from: i */
    public final bcq mo15102i() throws RemoteException {
        bcq bcq;
        Parcel a = mo14352a(16, mo14355v_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bcq = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            bcq = queryLocalInterface instanceof bcq ? (bcq) queryLocalInterface : new bcs(readStrongBinder);
        }
        a.recycle();
        return bcq;
    }

    /* renamed from: j */
    public final Bundle mo15103j() throws RemoteException {
        Parcel a = mo14352a(17, mo14355v_());
        Bundle bundle = (Bundle) ajb.m14214a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: k */
    public final Bundle mo15104k() throws RemoteException {
        Parcel a = mo14352a(18, mo14355v_());
        Bundle bundle = (Bundle) ajb.m14214a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: l */
    public final Bundle mo15105l() throws RemoteException {
        Parcel a = mo14352a(19, mo14355v_());
        Bundle bundle = (Bundle) ajb.m14214a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: m */
    public final boolean mo15106m() throws RemoteException {
        Parcel a = mo14352a(22, mo14355v_());
        boolean a2 = ajb.m14218a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final ave mo15107n() throws RemoteException {
        Parcel a = mo14352a(24, mo14355v_());
        ave a2 = avf.m15484a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: o */
    public final aqe mo15108o() throws RemoteException {
        Parcel a = mo14352a(26, mo14355v_());
        aqe a2 = aqf.m14787a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: p */
    public final bct mo15109p() throws RemoteException {
        bct bct;
        Parcel a = mo14352a(27, mo14355v_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bct = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            bct = queryLocalInterface instanceof bct ? (bct) queryLocalInterface : new bcv(readStrongBinder);
        }
        a.recycle();
        return bct;
    }
}

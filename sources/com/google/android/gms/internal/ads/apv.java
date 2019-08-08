package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;

public final class apv extends aiz implements apt {
    apv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final apc createAdLoaderBuilder(C3235a aVar, String str, bca bca, int i) throws RemoteException {
        apc apc;
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        v_.writeString(str);
        ajb.m14215a(v_, (IInterface) bca);
        v_.writeInt(i);
        Parcel a = mo14352a(3, v_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            apc = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            apc = queryLocalInterface instanceof apc ? (apc) queryLocalInterface : new ape(readStrongBinder);
        }
        a.recycle();
        return apc;
    }

    public final C4111r createAdOverlay(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        Parcel a = mo14352a(8, v_);
        C4111r a2 = C4138s.m18029a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final aph createBannerAdManager(C3235a aVar, zzjn zzjn, String str, bca bca, int i) throws RemoteException {
        aph aph;
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14216a(v_, (Parcelable) zzjn);
        v_.writeString(str);
        ajb.m14215a(v_, (IInterface) bca);
        v_.writeInt(i);
        Parcel a = mo14352a(1, v_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aph = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            aph = queryLocalInterface instanceof aph ? (aph) queryLocalInterface : new apj(readStrongBinder);
        }
        a.recycle();
        return aph;
    }

    public final C3635ab createInAppPurchaseManager(C3235a aVar) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        Parcel a = mo14352a(7, v_);
        C3635ab a2 = C3642ad.m13517a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final aph createInterstitialAdManager(C3235a aVar, zzjn zzjn, String str, bca bca, int i) throws RemoteException {
        aph aph;
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14216a(v_, (Parcelable) zzjn);
        v_.writeString(str);
        ajb.m14215a(v_, (IInterface) bca);
        v_.writeInt(i);
        Parcel a = mo14352a(2, v_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aph = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            aph = queryLocalInterface instanceof aph ? (aph) queryLocalInterface : new apj(readStrongBinder);
        }
        a.recycle();
        return aph;
    }

    public final aum createNativeAdViewDelegate(C3235a aVar, C3235a aVar2) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14215a(v_, (IInterface) aVar2);
        Parcel a = mo14352a(5, v_);
        aum a2 = aun.m15369a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final aur createNativeAdViewHolderDelegate(C3235a aVar, C3235a aVar2, C3235a aVar3) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14215a(v_, (IInterface) aVar2);
        ajb.m14215a(v_, (IInterface) aVar3);
        Parcel a = mo14352a(11, v_);
        aur a2 = aus.m15381a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final C3816gb createRewardedVideoAd(C3235a aVar, bca bca, int i) throws RemoteException {
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14215a(v_, (IInterface) bca);
        v_.writeInt(i);
        Parcel a = mo14352a(6, v_);
        C3816gb a2 = C3818gd.m16720a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final aph createSearchAdManager(C3235a aVar, zzjn zzjn, String str, int i) throws RemoteException {
        aph aph;
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        ajb.m14216a(v_, (Parcelable) zzjn);
        v_.writeString(str);
        v_.writeInt(i);
        Parcel a = mo14352a(10, v_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aph = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            aph = queryLocalInterface instanceof aph ? (aph) queryLocalInterface : new apj(readStrongBinder);
        }
        a.recycle();
        return aph;
    }

    public final apz getMobileAdsSettingsManager(C3235a aVar) throws RemoteException {
        apz apz;
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        Parcel a = mo14352a(4, v_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            apz = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            apz = queryLocalInterface instanceof apz ? (apz) queryLocalInterface : new aqb(readStrongBinder);
        }
        a.recycle();
        return apz;
    }

    public final apz getMobileAdsSettingsManagerWithClientJarVersion(C3235a aVar, int i) throws RemoteException {
        apz apz;
        Parcel v_ = mo14355v_();
        ajb.m14215a(v_, (IInterface) aVar);
        v_.writeInt(i);
        Parcel a = mo14352a(9, v_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            apz = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            apz = queryLocalInterface instanceof apz ? (apz) queryLocalInterface : new aqb(readStrongBinder);
        }
        a.recycle();
        return apz;
    }
}

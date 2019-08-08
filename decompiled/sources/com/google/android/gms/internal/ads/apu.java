package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a.C3236a;

public abstract class apu extends aja implements apt {
    public apu() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    public static apt asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
        return queryLocalInterface instanceof apt ? (apt) queryLocalInterface : new apv(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface iInterface;
        switch (i) {
            case 1:
                iInterface = createBannerAdManager(C3236a.m11572a(parcel.readStrongBinder()), (zzjn) ajb.m14214a(parcel, zzjn.CREATOR), parcel.readString(), bcb.m15997a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 2:
                iInterface = createInterstitialAdManager(C3236a.m11572a(parcel.readStrongBinder()), (zzjn) ajb.m14214a(parcel, zzjn.CREATOR), parcel.readString(), bcb.m15997a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                iInterface = createAdLoaderBuilder(C3236a.m11572a(parcel.readStrongBinder()), parcel.readString(), bcb.m15997a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 4:
                iInterface = getMobileAdsSettingsManager(C3236a.m11572a(parcel.readStrongBinder()));
                break;
            case 5:
                iInterface = createNativeAdViewDelegate(C3236a.m11572a(parcel.readStrongBinder()), C3236a.m11572a(parcel.readStrongBinder()));
                break;
            case 6:
                iInterface = createRewardedVideoAd(C3236a.m11572a(parcel.readStrongBinder()), bcb.m15997a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 7:
                iInterface = createInAppPurchaseManager(C3236a.m11572a(parcel.readStrongBinder()));
                break;
            case 8:
                iInterface = createAdOverlay(C3236a.m11572a(parcel.readStrongBinder()));
                break;
            case 9:
                iInterface = getMobileAdsSettingsManagerWithClientJarVersion(C3236a.m11572a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                iInterface = createSearchAdManager(C3236a.m11572a(parcel.readStrongBinder()), (zzjn) ajb.m14214a(parcel, zzjn.CREATOR), parcel.readString(), parcel.readInt());
                break;
            case 11:
                iInterface = createNativeAdViewHolderDelegate(C3236a.m11572a(parcel.readStrongBinder()), C3236a.m11572a(parcel.readStrongBinder()), C3236a.m11572a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        ajb.m14215a(parcel2, iInterface);
        return true;
    }
}

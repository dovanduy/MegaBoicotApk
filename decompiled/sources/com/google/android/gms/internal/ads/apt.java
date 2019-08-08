package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;

public interface apt extends IInterface {
    apc createAdLoaderBuilder(C3235a aVar, String str, bca bca, int i) throws RemoteException;

    C4111r createAdOverlay(C3235a aVar) throws RemoteException;

    aph createBannerAdManager(C3235a aVar, zzjn zzjn, String str, bca bca, int i) throws RemoteException;

    C3635ab createInAppPurchaseManager(C3235a aVar) throws RemoteException;

    aph createInterstitialAdManager(C3235a aVar, zzjn zzjn, String str, bca bca, int i) throws RemoteException;

    aum createNativeAdViewDelegate(C3235a aVar, C3235a aVar2) throws RemoteException;

    aur createNativeAdViewHolderDelegate(C3235a aVar, C3235a aVar2, C3235a aVar3) throws RemoteException;

    C3816gb createRewardedVideoAd(C3235a aVar, bca bca, int i) throws RemoteException;

    aph createSearchAdManager(C3235a aVar, zzjn zzjn, String str, int i) throws RemoteException;

    apz getMobileAdsSettingsManager(C3235a aVar) throws RemoteException;

    apz getMobileAdsSettingsManagerWithClientJarVersion(C3235a aVar, int i) throws RemoteException;
}

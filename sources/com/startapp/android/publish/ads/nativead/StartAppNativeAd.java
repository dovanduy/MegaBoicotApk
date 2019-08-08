package com.startapp.android.publish.ads.nativead;

import android.content.Context;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.adListeners.C5326b;
import com.startapp.android.publish.adsCommon.adinformation.C5329a;
import com.startapp.android.publish.adsCommon.p177a.C5314a;
import com.startapp.android.publish.adsCommon.p177a.C5315b;
import com.startapp.android.publish.adsCommon.p177a.C5319f;
import com.startapp.android.publish.adsCommon.p177a.C5320g;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.Constants;
import com.startapp.common.p193a.C5518g;
import com.startapp.common.p193a.C5522i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StartAppSDK */
public class StartAppNativeAd extends C5286Ad implements C5176a {
    private static final String TAG = "StartAppNativeAd";
    private static final long serialVersionUID = 1;
    private C5178a adEventDelegate;
    boolean isLoading = false;
    private List<NativeAdDetails> listNativeAds = new ArrayList();
    private C5181b nativeAd;
    private NativeAdPreferences preferences;
    private int totalObjectsLoaded = 0;

    /* renamed from: com.startapp.android.publish.ads.nativead.StartAppNativeAd$a */
    /* compiled from: StartAppSDK */
    private class C5178a implements AdEventListener {

        /* renamed from: b */
        private AdEventListener f16662b = null;

        public C5178a(AdEventListener adEventListener) {
            this.f16662b = new C5326b(adEventListener);
        }

        public void onReceiveAd(C5286Ad ad) {
            C5518g.m23563a(StartAppNativeAd.TAG, 3, "NativeAd Received");
            StartAppNativeAd.this.initNativeAdList();
        }

        public void onFailedToReceiveAd(C5286Ad ad) {
            C5518g.m23563a(StartAppNativeAd.TAG, 3, "NativeAd Failed to load");
            StartAppNativeAd.this.setErrorMessage(ad.getErrorMessage());
            if (this.f16662b != null) {
                this.f16662b.onFailedToReceiveAd(StartAppNativeAd.this);
                this.f16662b = null;
            }
            StartAppNativeAd.this.isLoading = false;
            StartAppNativeAd.this.initNativeAdList();
        }

        /* renamed from: a */
        public AdEventListener mo19133a() {
            return this.f16662b;
        }
    }

    /* renamed from: com.startapp.android.publish.ads.nativead.StartAppNativeAd$b */
    /* compiled from: StartAppSDK */
    public enum C5179b {
        LAUNCH_APP,
        OPEN_MARKET
    }

    /* access modifiers changed from: protected */
    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
    }

    public StartAppNativeAd(Context context) {
        super(context, Placement.INAPP_NATIVE);
    }

    private NativeAdPreferences getPreferences() {
        return this.preferences;
    }

    private void setPreferences(NativeAdPreferences nativeAdPreferences) {
        this.preferences = nativeAdPreferences;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n===== StartAppNativeAd =====\n");
        for (int i = 0; i < getNumberOfAds(); i++) {
            stringBuffer.append(this.listNativeAds.get(i));
        }
        stringBuffer.append("===== End StartAppNativeAd =====");
        return stringBuffer.toString();
    }

    /* access modifiers changed from: 0000 */
    public void initNativeAdList() {
        this.totalObjectsLoaded = 0;
        if (this.listNativeAds == null) {
            this.listNativeAds = new ArrayList();
        }
        this.listNativeAds.clear();
        if (this.nativeAd != null && this.nativeAd.mo19940d() != null) {
            for (int i = 0; i < this.nativeAd.mo19940d().size(); i++) {
                this.listNativeAds.add(new NativeAdDetails((AdDetails) this.nativeAd.mo19940d().get(i), getPreferences(), i, this));
            }
        }
    }

    public void onNativeAdDetailsLoaded(int i) {
        this.totalObjectsLoaded++;
        if (this.nativeAd.mo19940d() != null && this.totalObjectsLoaded == this.nativeAd.mo19940d().size()) {
            onNativeAdLoaded();
        }
    }

    private void onNativeAdLoaded() {
        C5518g.m23563a(TAG, 3, "Ad Loaded successfully");
        this.isLoading = false;
        setErrorMessage(null);
        if (this.adEventDelegate != null) {
            C5518g.m23563a(TAG, 3, "Calling original RecienedAd callback");
            AdEventListener a = this.adEventDelegate.mo19133a();
            if (a != null) {
                a.onReceiveAd(this);
            }
        }
    }

    public int getNumberOfAds() {
        if (this.listNativeAds != null) {
            return this.listNativeAds.size();
        }
        return 0;
    }

    public boolean isBelowMinCPM() {
        return this.nativeAd.isBelowMinCPM();
    }

    public boolean loadAd() {
        return loadAd(new NativeAdPreferences(), null);
    }

    public boolean loadAd(AdEventListener adEventListener) {
        return loadAd(new NativeAdPreferences(), adEventListener);
    }

    public boolean loadAd(NativeAdPreferences nativeAdPreferences) {
        return loadAd(nativeAdPreferences, null);
    }

    public boolean loadAd(NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        C5518g.m23563a(TAG, 3, "Start loading StartAppNativeAd");
        this.adEventDelegate = new C5178a(adEventListener);
        setPreferences(nativeAdPreferences);
        if (this.isLoading) {
            setErrorMessage("Ad is currently being loaded");
            return false;
        }
        this.isLoading = true;
        this.nativeAd = new C5181b(this.context, getPreferences());
        return this.nativeAd.load(nativeAdPreferences, this.adEventDelegate);
    }

    public ArrayList<NativeAdDetails> getNativeAds() {
        return getNativeAds(null);
    }

    public ArrayList<NativeAdDetails> getNativeAds(String str) {
        ArrayList<NativeAdDetails> arrayList = new ArrayList<>();
        C5319f a = C5320g.m22714a().mo19663b().mo19655a(Placement.INAPP_NATIVE, str);
        if (!a.mo19660a()) {
            C5349c.m22864a(this.context, C5349c.m22872a(getAdDetailsList()), str, a.mo19662c());
            if (Constants.m23468a().booleanValue()) {
                C5522i.m23586a().mo20502a(this.context, a.mo19661b());
            }
        } else if (this.listNativeAds != null) {
            for (NativeAdDetails nativeAdDetails : this.listNativeAds) {
                nativeAdDetails.mo19081a(str);
                arrayList.add(nativeAdDetails);
            }
            C5315b.m22698a().mo19649a(new C5314a(Placement.INAPP_NATIVE, str));
        }
        return arrayList;
    }

    private List<AdDetails> getAdDetailsList() {
        ArrayList arrayList = new ArrayList();
        if (this.listNativeAds != null) {
            for (NativeAdDetails a : this.listNativeAds) {
                arrayList.add(a.mo19080a());
            }
        }
        return arrayList;
    }

    public static String getPrivacyURL() {
        if (C5329a.m22737b().mo19708c() == null) {
            return "";
        }
        String c = C5329a.m22737b().mo19708c();
        if (c.contains("http://") || c.contains("https://")) {
            return C5329a.m22737b().mo19708c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        sb.append(C5329a.m22737b().mo19708c());
        return sb.toString();
    }

    public static String getPrivacyImageUrl() {
        return C5329a.m22737b().mo19709d();
    }
}

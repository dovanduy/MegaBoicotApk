package com.startapp.android.publish.adsCommon;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.ads.splash.SplashConfig;
import com.startapp.android.publish.ads.splash.SplashHideListener;
import com.startapp.android.publish.adsCommon.C5286Ad.AdState;
import com.startapp.android.publish.adsCommon.C5286Ad.AdType;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.activities.AppWallActivity;
import com.startapp.android.publish.adsCommon.activities.OverlayActivity;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.p177a.C5319f;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.cache.C5436a;
import com.startapp.android.publish.cache.C5445c;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.C5523b;
import com.startapp.common.Constants;
import com.startapp.common.p193a.C5518g;
import com.startapp.common.p193a.C5522i;
import java.io.Serializable;

/* compiled from: StartAppSDK */
public class StartAppAd extends C5286Ad {
    private static final String TAG = "StartAppAd";
    private static final long serialVersionUID = 1;
    private static boolean testMode = false;

    /* renamed from: ad */
    C5382g f17021ad = null;
    private C5445c adKey = null;
    private AdMode adMode = AdMode.AUTOMATIC;
    private AdPreferences adPreferences = null;
    AdDisplayListener callback = null;
    private BroadcastReceiver callbackBroadcastReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("com.startapp.android.ShowFailedDisplayBroadcastListener")) {
                if (intent.getExtras().containsKey("showFailedReason")) {
                    StartAppAd.this.setNotDisplayedReason((NotDisplayedReason) intent.getExtras().getSerializable("showFailedReason"));
                }
                if (StartAppAd.this.callback != null) {
                    StartAppAd.this.callback.adNotDisplayed(StartAppAd.this);
                }
                m22607a(context);
            } else if (intent.getAction().equals("com.startapp.android.ShowDisplayBroadcastListener")) {
                if (StartAppAd.this.callback != null) {
                    StartAppAd.this.callback.adDisplayed(StartAppAd.this);
                }
            } else if (intent.getAction().equals("com.startapp.android.OnClickCallback")) {
                if (StartAppAd.this.callback != null) {
                    StartAppAd.this.callback.adClicked(StartAppAd.this);
                }
            } else if (!intent.getAction().equals("com.startapp.android.OnVideoCompleted")) {
                if (StartAppAd.this.callback != null) {
                    StartAppAd.this.callback.adHidden(StartAppAd.this);
                }
                m22607a(context);
            } else if (StartAppAd.this.videoListener != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        StartAppAd.this.videoListener.onVideoCompleted();
                    }
                });
            }
            StartAppAd.this.f17021ad = null;
        }

        /* renamed from: a */
        private void m22607a(Context context) {
            C5523b.m23588a(context).mo20504a((BroadcastReceiver) this);
        }
    };
    VideoListener videoListener = null;

    /* compiled from: StartAppSDK */
    public enum AdMode {
        AUTOMATIC,
        FULLPAGE,
        OFFERWALL,
        REWARDED_VIDEO,
        VIDEO,
        OVERLAY
    }

    /* access modifiers changed from: protected */
    public void loadAds(AdPreferences adPreferences2, AdEventListener adEventListener) {
    }

    public void onPause() {
    }

    public StartAppAd(Context context) {
        super(context, null);
    }

    public static void init(Context context, String str, String str2) {
        StartAppSDK.init(context, str, str2);
    }

    @Deprecated
    public boolean load(AdPreferences adPreferences2, AdEventListener adEventListener) {
        boolean z = false;
        if (!canShowAd()) {
            if (adEventListener != null) {
                setErrorMessage("serving ads disabled");
                adEventListener.onFailedToReceiveAd(this);
            }
            return false;
        }
        this.adKey = C5436a.m23246a().mo20068a(this.context, this, this.adMode, adPreferences2, adEventListener);
        if (this.adKey != null) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x017b  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean show(java.lang.String r10, com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener r11) {
        /*
            r9 = this;
            r0 = 0
            r9.setNotDisplayedReason(r0)
            com.startapp.android.publish.adsCommon.adListeners.a r1 = new com.startapp.android.publish.adsCommon.adListeners.a
            r1.<init>(r11)
            r9.callback = r1
            boolean r11 = r9.canShowAd()
            r1 = 0
            if (r11 != 0) goto L_0x001d
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r10 = com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.SERVING_ADS_DISABLED
            r9.setNotDisplayedReason(r10)
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener r10 = r9.callback
            r10.adNotDisplayed(r9)
            return r1
        L_0x001d:
            com.startapp.android.publish.cache.c r11 = r9.adKey
            if (r11 != 0) goto L_0x0028
            com.startapp.android.publish.adsCommon.StartAppAd$AdMode r11 = r9.adMode
            com.startapp.android.publish.common.model.AdPreferences r2 = r9.adPreferences
            r9.loadAd(r11, r2)
        L_0x0028:
            boolean r11 = r9.isAppOnForeground()
            if (r11 == 0) goto L_0x0155
            boolean r11 = r9.isNetworkAvailable()
            if (r11 == 0) goto L_0x014f
            boolean r11 = r9.isReady()
            r2 = 1
            if (r11 == 0) goto L_0x0132
            com.startapp.android.publish.common.model.AdPreferences$Placement r11 = r9.getPlacement()
            com.startapp.android.publish.adsCommon.a.f r3 = r9.shouldDisplayAd(r10, r11)
            boolean r4 = r3.mo19660a()
            if (r4 == 0) goto L_0x0112
            com.startapp.android.publish.cache.a r4 = com.startapp.android.publish.cache.C5436a.m23246a()
            com.startapp.android.publish.cache.c r5 = r9.adKey
            com.startapp.android.publish.adsCommon.g r4 = r4.mo20067a(r5)
            r9.f17021ad = r4
            com.startapp.android.publish.adsCommon.g r4 = r9.f17021ad
            if (r4 == 0) goto L_0x012e
            com.startapp.android.publish.common.model.AdPreferences$Placement r4 = r9.placement
            com.startapp.android.publish.common.model.AdPreferences$Placement r5 = com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_SPLASH
            r6 = 3
            if (r4 != r5) goto L_0x0078
            com.startapp.android.publish.adsCommon.m r4 = com.startapp.android.publish.adsCommon.C5427m.m23145a()
            boolean r4 = r4.mo20021n()
            if (r4 == 0) goto L_0x0078
            java.lang.String r11 = "StartAppAd"
            java.lang.String r2 = "App in background, can't display splash"
            com.startapp.common.p193a.C5518g.m23563a(r11, r6, r2)
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r11 = com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.APP_IN_BACKGROUND
            r9.setNotDisplayedReason(r11)
            goto L_0x012e
        L_0x0078:
            com.startapp.android.publish.adsCommon.g r4 = r9.f17021ad
            boolean r4 = r4.mo18768a(r10)
            if (r4 == 0) goto L_0x00f9
            com.startapp.android.publish.adsCommon.a.b r5 = com.startapp.android.publish.adsCommon.p177a.C5315b.m22698a()
            com.startapp.android.publish.adsCommon.a.a r7 = new com.startapp.android.publish.adsCommon.a.a
            r7.<init>(r11, r10)
            r5.mo19649a(r7)
            com.startapp.android.publish.adsCommon.StartAppAd$AdMode r11 = r9.adMode
            if (r11 == 0) goto L_0x00a8
            com.startapp.android.publish.common.model.AdPreferences$Placement r11 = r9.placement
            com.startapp.android.publish.common.model.AdPreferences$Placement r5 = com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_SPLASH
            if (r11 == r5) goto L_0x00a8
            com.startapp.android.publish.common.model.AdPreferences r11 = r9.adPreferences
            if (r11 == 0) goto L_0x00a9
            com.startapp.android.publish.common.model.AdPreferences r11 = r9.adPreferences
            com.startapp.android.publish.common.model.AdPreferences r5 = new com.startapp.android.publish.common.model.AdPreferences
            r5.<init>()
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r2 = r1
        L_0x00a9:
            if (r2 == 0) goto L_0x010a
            com.startapp.android.publish.cache.a r11 = com.startapp.android.publish.cache.C5436a.m23246a()
            com.startapp.android.publish.adsCommon.StartAppAd$AdMode r2 = r9.adMode
            java.lang.String r2 = r11.mo20073a(r2)
            java.lang.String r5 = "preCache"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "reset autoLoad after show "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            com.startapp.common.p193a.C5518g.m23563a(r5, r6, r7)
            android.content.Context r5 = r9.context
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            com.startapp.android.publish.adsCommon.C5414k.m23101b(r5, r2, r6)
            com.startapp.android.publish.adsCommon.StartAppAd$AdMode r2 = r9.adMode
            com.startapp.android.publish.adsCommon.StartAppAd$AdMode r5 = com.startapp.android.publish.adsCommon.StartAppAd.AdMode.AUTOMATIC
            if (r2 != r5) goto L_0x010a
            android.content.Context r2 = r9.context
            com.startapp.android.publish.adsCommon.StartAppAd$AdMode r5 = com.startapp.android.publish.adsCommon.StartAppAd.AdMode.FULLPAGE
            java.lang.String r5 = r11.mo20073a(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            com.startapp.android.publish.adsCommon.C5414k.m23101b(r2, r5, r6)
            android.content.Context r2 = r9.context
            com.startapp.android.publish.adsCommon.StartAppAd$AdMode r5 = com.startapp.android.publish.adsCommon.StartAppAd.AdMode.OFFERWALL
            java.lang.String r11 = r11.mo20073a(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            com.startapp.android.publish.adsCommon.C5414k.m23101b(r2, r11, r5)
            goto L_0x010a
        L_0x00f9:
            com.startapp.android.publish.adsCommon.g r11 = r9.f17021ad
            boolean r11 = r11 instanceof com.startapp.android.publish.adsCommon.C5286Ad
            if (r11 == 0) goto L_0x010a
            com.startapp.android.publish.adsCommon.g r11 = r9.f17021ad
            com.startapp.android.publish.adsCommon.Ad r11 = (com.startapp.android.publish.adsCommon.C5286Ad) r11
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r11 = r11.getNotDisplayedReason()
            r9.setNotDisplayedReason(r11)
        L_0x010a:
            com.startapp.android.publish.adsCommon.StartAppAd$AdMode r11 = r9.adMode
            com.startapp.android.publish.common.model.AdPreferences r2 = r9.adPreferences
            r9.loadAd(r11, r2, r0)
            goto L_0x012f
        L_0x0112:
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r11 = com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.AD_RULES
            r9.setNotDisplayedReason(r11)
            java.lang.Boolean r11 = com.startapp.common.Constants.m23468a()
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x012e
            com.startapp.common.a.i r11 = com.startapp.common.p193a.C5522i.m23586a()
            android.content.Context r2 = r9.context
            java.lang.String r4 = r3.mo19661b()
            r11.mo20502a(r2, r4)
        L_0x012e:
            r4 = r1
        L_0x012f:
            r2 = r1
            r1 = r4
            goto L_0x015c
        L_0x0132:
            com.startapp.android.publish.adsCommon.StartAppAd$AdMode r11 = r9.adMode
            com.startapp.android.publish.adsCommon.StartAppAd$AdMode r3 = com.startapp.android.publish.adsCommon.StartAppAd.AdMode.REWARDED_VIDEO
            if (r11 == r3) goto L_0x0145
            com.startapp.android.publish.adsCommon.StartAppAd$AdMode r11 = r9.adMode
            com.startapp.android.publish.adsCommon.StartAppAd$AdMode r3 = com.startapp.android.publish.adsCommon.StartAppAd.AdMode.VIDEO
            if (r11 == r3) goto L_0x0145
            boolean r11 = r9.showPreparedVideoFallbackAd(r10)
            if (r11 == 0) goto L_0x0145
            goto L_0x0146
        L_0x0145:
            r2 = r1
        L_0x0146:
            if (r2 != 0) goto L_0x014d
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r11 = com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.AD_NOT_READY
            r9.setNotDisplayedReason(r11)
        L_0x014d:
            r3 = r0
            goto L_0x015c
        L_0x014f:
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r11 = com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.NETWORK_PROBLEM
            r9.setNotDisplayedReason(r11)
            goto L_0x015a
        L_0x0155:
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r11 = com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.APP_IN_BACKGROUND
            r9.setNotDisplayedReason(r11)
        L_0x015a:
            r3 = r0
            r2 = r1
        L_0x015c:
            if (r1 != 0) goto L_0x0160
            if (r2 == 0) goto L_0x0179
        L_0x0160:
            java.lang.String r11 = "com.startapp.android.HideDisplayBroadcastListener"
            r9.registerBroadcastReceiver(r11)
            java.lang.String r11 = "com.startapp.android.ShowDisplayBroadcastListener"
            r9.registerBroadcastReceiver(r11)
            java.lang.String r11 = "com.startapp.android.ShowFailedDisplayBroadcastListener"
            r9.registerBroadcastReceiver(r11)
            java.lang.String r11 = "com.startapp.android.OnClickCallback"
            r9.registerBroadcastReceiver(r11)
            java.lang.String r11 = "com.startapp.android.OnVideoCompleted"
            r9.registerBroadcastReceiver(r11)
        L_0x0179:
            if (r1 != 0) goto L_0x0202
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r11 = r9.getNotDisplayedReason()
            if (r11 != 0) goto L_0x0186
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r11 = com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.INTERNAL_ERROR
            r9.setNotDisplayedReason(r11)
        L_0x0186:
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r11 = r9.getNotDisplayedReason()
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r4 = com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.NETWORK_PROBLEM
            if (r11 == r4) goto L_0x01f5
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r11 = r9.getNotDisplayedReason()
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r4 = com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.AD_RULES
            if (r11 == r4) goto L_0x01dc
            if (r2 == 0) goto L_0x01b9
            android.content.Context r11 = r9.context
            com.startapp.android.publish.adsCommon.g r3 = r9.f17021ad
            if (r3 == 0) goto L_0x01a1
            com.startapp.android.publish.adsCommon.g r3 = r9.f17021ad
            goto L_0x01ab
        L_0x01a1:
            com.startapp.android.publish.cache.a r3 = com.startapp.android.publish.cache.C5436a.m23246a()
            com.startapp.android.publish.cache.c r4 = r9.adKey
            com.startapp.android.publish.adsCommon.g r3 = r3.mo20080b(r4)
        L_0x01ab:
            java.lang.String[] r3 = com.startapp.android.publish.adsCommon.C5349c.m22871a(r3)
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r4 = com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason.AD_NOT_READY_VIDEO_FALLBACK
            java.lang.String r4 = r4.toString()
            com.startapp.android.publish.adsCommon.C5349c.m22864a(r11, r3, r10, r4)
            goto L_0x01f5
        L_0x01b9:
            android.content.Context r11 = r9.context
            com.startapp.android.publish.adsCommon.g r3 = r9.f17021ad
            if (r3 == 0) goto L_0x01c2
            com.startapp.android.publish.adsCommon.g r3 = r9.f17021ad
            goto L_0x01cc
        L_0x01c2:
            com.startapp.android.publish.cache.a r3 = com.startapp.android.publish.cache.C5436a.m23246a()
            com.startapp.android.publish.cache.c r4 = r9.adKey
            com.startapp.android.publish.adsCommon.g r3 = r3.mo20080b(r4)
        L_0x01cc:
            java.lang.String[] r3 = com.startapp.android.publish.adsCommon.C5349c.m22871a(r3)
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason r4 = r9.getNotDisplayedReason()
            java.lang.String r4 = r4.toString()
            com.startapp.android.publish.adsCommon.C5349c.m22864a(r11, r3, r10, r4)
            goto L_0x01f5
        L_0x01dc:
            if (r3 == 0) goto L_0x01f5
            android.content.Context r11 = r9.context
            com.startapp.android.publish.cache.a r4 = com.startapp.android.publish.cache.C5436a.m23246a()
            com.startapp.android.publish.cache.c r5 = r9.adKey
            com.startapp.android.publish.adsCommon.g r4 = r4.mo20080b(r5)
            java.lang.String[] r4 = com.startapp.android.publish.adsCommon.C5349c.m22871a(r4)
            java.lang.String r3 = r3.mo19662c()
            com.startapp.android.publish.adsCommon.C5349c.m22864a(r11, r4, r10, r3)
        L_0x01f5:
            r9.f17021ad = r0
            if (r2 != 0) goto L_0x0202
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener r10 = r9.callback
            if (r10 == 0) goto L_0x0202
            com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener r10 = r9.callback
            r10.adNotDisplayed(r9)
        L_0x0202:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.publish.adsCommon.StartAppAd.show(java.lang.String, com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener):boolean");
    }

    private boolean showPreparedVideoFallbackAd(String str) {
        AdPreferences adPreferences2;
        if (!canShowAd() || !C5344b.m22784a().mo19756H().mo20040h()) {
            return false;
        }
        if (this.adPreferences == null) {
            adPreferences2 = new AdPreferences();
        } else {
            adPreferences2 = this.adPreferences;
        }
        adPreferences2.setType(AdType.NON_VIDEO);
        Placement placement = getPlacement();
        C5382g b = C5436a.m23246a().mo20080b(new C5445c(placement, adPreferences2));
        if (b == null || !b.isReady() || !shouldDisplayAd(str, placement).mo19660a()) {
            return false;
        }
        b.setVideoCancelCallBack(true);
        if (Constants.m23468a().booleanValue()) {
            C5522i.m23586a().mo20502a(this.context, "display Video fallback");
        }
        return b.mo18768a(str);
    }

    /* access modifiers changed from: protected */
    public C5319f shouldDisplayAd(String str, Placement placement) {
        return C5344b.m22784a().mo19754F().mo19655a(placement, str);
    }

    /* access modifiers changed from: protected */
    public Placement getPlacement() {
        Placement placement = super.getPlacement();
        return (placement != null || this.adKey == null || C5436a.m23246a().mo20080b(this.adKey) == null) ? placement : ((C5286Ad) C5436a.m23246a().mo20080b(this.adKey)).getPlacement();
    }

    /* access modifiers changed from: protected */
    public String getAdHtml() {
        C5382g b = C5436a.m23246a().mo20080b(this.adKey);
        if (b == null || !(b instanceof C5364e)) {
            return null;
        }
        return ((C5364e) b).mo19847f();
    }

    private void registerBroadcastReceiver(String str) {
        C5523b.m23588a(this.context).mo20505a(this.callbackBroadcastReceiver, new IntentFilter(str));
    }

    @Deprecated
    public boolean show() {
        return show(null, null);
    }

    private void setAdMode(AdMode adMode2) {
        this.adMode = adMode2;
    }

    private void setAdPrefs(AdPreferences adPreferences2) {
        this.adPreferences = adPreferences2;
    }

    public void loadAd() {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), null);
    }

    public void loadAd(AdPreferences adPreferences2) {
        loadAd(AdMode.AUTOMATIC, adPreferences2, null);
    }

    public void loadAd(AdEventListener adEventListener) {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), adEventListener);
    }

    public void loadAd(AdPreferences adPreferences2, AdEventListener adEventListener) {
        loadAd(AdMode.AUTOMATIC, adPreferences2, adEventListener);
    }

    public void loadAd(AdMode adMode2) {
        loadAd(adMode2, new AdPreferences(), null);
    }

    public void loadAd(AdMode adMode2, AdPreferences adPreferences2) {
        loadAd(adMode2, adPreferences2, null);
    }

    public void loadAd(AdMode adMode2, AdEventListener adEventListener) {
        loadAd(adMode2, new AdPreferences(), adEventListener);
    }

    public void loadAd(AdMode adMode2, AdPreferences adPreferences2, AdEventListener adEventListener) {
        setAdMode(adMode2);
        setAdPrefs(adPreferences2);
        try {
            load(adPreferences2, adEventListener);
        } catch (Exception e) {
            C5378f.m23016a(this.context, C5376d.EXCEPTION, "StartAppAd.loadAd - unexpected Error occurd", e.getMessage(), "");
            if (adEventListener != null) {
                adEventListener.onFailedToReceiveAd(this);
            }
        }
    }

    public boolean showAd() {
        return showAd(null, null);
    }

    public boolean showAd(String str) {
        return showAd(str, null);
    }

    public boolean showAd(AdDisplayListener adDisplayListener) {
        return showAd(null, adDisplayListener);
    }

    public boolean showAd(String str, AdDisplayListener adDisplayListener) {
        try {
            return show(str, adDisplayListener);
        } catch (Exception e) {
            C5378f.m23016a(this.context, C5376d.EXCEPTION, "StartAppAd.showAd - unexpected Error occurd", e.getMessage(), "");
            setNotDisplayedReason(NotDisplayedReason.INTERNAL_ERROR);
            if (adDisplayListener != null) {
                adDisplayListener.adNotDisplayed(null);
            }
            return false;
        }
    }

    public void setVideoListener(VideoListener videoListener2) {
        this.videoListener = videoListener2;
    }

    public void onResume() {
        if (!isReady()) {
            loadAd();
        }
    }

    public void onBackPressed() {
        if (!showAd("exit_ad")) {
            C5518g.m23563a(TAG, 3, "Could not display StartAppAd onBackPressed");
        }
        C5427m.m23145a().mo20020m();
    }

    public void onSaveInstanceState(Bundle bundle) {
        int i;
        switch (this.adMode) {
            case FULLPAGE:
                i = 1;
                break;
            case OFFERWALL:
                i = 2;
                break;
            case OVERLAY:
                i = 3;
                break;
            case REWARDED_VIDEO:
                i = 4;
                break;
            default:
                i = 0;
                break;
        }
        if (this.adPreferences != null) {
            bundle.putSerializable("AdPrefs", this.adPreferences);
        }
        bundle.putInt("AdMode", i);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        int i = bundle.getInt("AdMode");
        this.adMode = AdMode.AUTOMATIC;
        if (i == 1) {
            this.adMode = AdMode.FULLPAGE;
        } else if (i == 2) {
            this.adMode = AdMode.OFFERWALL;
        } else if (i == 3) {
            this.adMode = AdMode.OVERLAY;
        } else if (i == 4) {
            this.adMode = AdMode.REWARDED_VIDEO;
        } else if (i == 5) {
            this.adMode = AdMode.VIDEO;
        }
        Serializable serializable = bundle.getSerializable("AdPrefs");
        if (serializable != null) {
            this.adPreferences = (AdPreferences) serializable;
        }
    }

    public void close() {
        if (this.callbackBroadcastReceiver != null) {
            C5523b.m23588a(this.context).mo20504a(this.callbackBroadcastReceiver);
        }
        C5523b.m23588a(this.context).mo20506a(new Intent("com.startapp.android.CloseAdActivity"));
    }

    public boolean isReady() {
        C5382g b = C5436a.m23246a().mo20080b(this.adKey);
        if (b != null) {
            return b.isReady();
        }
        return false;
    }

    public boolean isNetworkAvailable() {
        return C5307i.m22675a(this.context);
    }

    private boolean isAppOnForeground() {
        boolean z = true;
        try {
            if (C5344b.m22784a().mo19762N() && !C5307i.m22688e(this.context)) {
                z = false;
            }
            return z;
        } catch (Exception unused) {
            return true;
        }
    }

    public static void disableSplash() {
        C5427m.m23145a().mo20017j();
    }

    public C5445c loadSplash(AdPreferences adPreferences2, AdEventListener adEventListener) {
        this.adKey = C5436a.m23246a().mo20071a(this.context, this, adPreferences2, adEventListener);
        return this.adKey;
    }

    public static void enableAutoInterstitial() {
        C5369f.m22965a().mo19866b();
    }

    public static void disableAutoInterstitial() {
        C5369f.m22965a().mo19867c();
    }

    public static void setAutoInterstitialPreferences(AutoInterstitialPreferences autoInterstitialPreferences) {
        C5369f.m22965a().mo19865a(autoInterstitialPreferences);
    }

    public static void showSplash(Activity activity, Bundle bundle) {
        showSplash(activity, bundle, new SplashConfig());
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig) {
        showSplash(activity, bundle, splashConfig, new AdPreferences());
    }

    public static void showSplash(Activity activity, Bundle bundle, AdPreferences adPreferences2) {
        showSplash(activity, bundle, new SplashConfig(), adPreferences2);
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences2) {
        showSplash(activity, bundle, splashConfig, adPreferences2, null);
    }

    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences2, SplashHideListener splashHideListener) {
        showSplash(activity, bundle, splashConfig, adPreferences2, splashHideListener, true);
    }

    static void showSplash(final Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences2, final SplashHideListener splashHideListener, boolean z) {
        if (bundle == null && MetaData.getInstance().canShowAd()) {
            try {
                C5427m a = C5427m.m23145a();
                if (!a.mo20018k() && z) {
                    a.mo20004d(true);
                }
                a.mo20000c(z);
                if (!z) {
                    if (adPreferences2 == null) {
                        adPreferences2 = new AdPreferences();
                    }
                    adPreferences2.setAs(Boolean.valueOf(true));
                }
                splashConfig.setDefaults(activity);
                C5307i.m22662a(activity, true);
                Intent intent = new Intent(activity, C5307i.m22654a((Context) activity, OverlayActivity.class, AppWallActivity.class));
                intent.putExtra("SplashConfig", splashConfig);
                intent.putExtra("AdPreference", adPreferences2);
                intent.putExtra("testMode", testMode);
                intent.putExtra("fullscreen", C5349c.m22868a(activity));
                intent.putExtra("placement", Placement.INAPP_SPLASH.getIndex());
                intent.addFlags(1140883456);
                activity.startActivity(intent);
                C5523b.m23588a((Context) activity).mo20505a(new BroadcastReceiver() {
                    public void onReceive(Context context, Intent intent) {
                        C5307i.m22662a(activity, false);
                        if (splashHideListener != null) {
                            splashHideListener.splashHidden();
                        }
                        C5523b.m23588a((Context) activity).mo20504a((BroadcastReceiver) this);
                    }
                }, new IntentFilter("com.startapp.android.splashHidden"));
            } catch (Exception e) {
                if (splashHideListener != null) {
                    splashHideListener.splashHidden();
                    C5378f.m23016a(activity, C5376d.EXCEPTION, "StartAppAd.showSplash - unexpected Error occurd", e.getMessage(), "");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public String getLauncherName() {
        C5382g b = C5436a.m23246a().mo20080b(this.adKey);
        if (b != null) {
            return b.mo18769a_();
        }
        return C5307i.m22684c(getContext());
    }

    public AdState getState() {
        C5382g b = C5436a.m23246a().mo20080b(this.adKey);
        if (b != null) {
            return b.getState();
        }
        return AdState.UN_INITIALIZED;
    }

    public boolean isBelowMinCPM() {
        C5382g b = C5436a.m23246a().mo20080b(this.adKey);
        if (b != null) {
            return b.isBelowMinCPM();
        }
        return false;
    }

    public static boolean showAd(Context context) {
        try {
            return new StartAppAd(context).showAd();
        } catch (Exception e) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "StartAppAd.showAd(one line integration) - unexpected Error occurd", e.getMessage(), "");
            return false;
        }
    }

    public static void onBackPressed(Context context) {
        new StartAppAd(context).onBackPressed();
    }
}

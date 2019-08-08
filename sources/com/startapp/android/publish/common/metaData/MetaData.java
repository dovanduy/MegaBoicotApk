package com.startapp.android.publish.common.metaData;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.google.android.exoplayer2.extractor.p132ts.PsExtractor;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.C5414k;
import com.startapp.android.publish.adsCommon.Utils.C5295a;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.p182f.C5372a;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.common.metaData.MetaDataRequest.C5474a;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.C5499a;
import com.startapp.common.C5499a.C5502a;
import com.startapp.common.Constants;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5515e;
import com.startapp.common.p193a.C5518g;
import com.startapp.common.p196c.C5544b;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: StartAppSDK */
public class MetaData implements Serializable {
    public static final String DEFAULT_AD_PLATFORM_HOST = new String("https://req.startappservice.com/1.5/");
    public static final boolean DEFAULT_ALWAYS_SEND_TOKEN = true;
    public static final String DEFAULT_ASSETS_BASE_URL_SECURED = "";
    public static final boolean DEFAULT_BT_ENABLED = false;
    public static final boolean DEFAULT_COMPRESSION_ENABLED = false;
    public static final boolean DEFAULT_INAPPBROWSER = true;
    public static final Set<String> DEFAULT_INSTALLERS_LIST = new HashSet(Arrays.asList(new String[]{Constants.f17536a}));
    public static final Set<Integer> DEFAULT_INVALID_NETWORK_CODES_INFO_EVENTS = new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(204)}));
    public static final long DEFAULT_LAST_KNOWN_LOCATION_THRESHOLD = 30;
    public static final String DEFAULT_LOCATION_SOURCE = "API";
    public static final String DEFAULT_METADATA_HOST = new String("https://init.startappservice.com/1.5/");
    public static final int DEFAULT_NOT_VISIBLE_BANNER_RELOAD_INTERVAL = 3600;
    public static final boolean DEFAULT_OM_SDK_STATE = false;
    public static final boolean DEFAULT_PERIODIC_INFOEVENT_ENABLED = false;
    public static final int DEFAULT_PERIODIC_INFOEVENT_INTERVAL = 360;
    public static final int[] DEFAULT_PERIODIC_INFOEVENT_INTERVALS = {60, 60, PsExtractor.VIDEO_STREAM_MASK};
    public static final boolean DEFAULT_PERIODIC_INFOEVENT_ON_RUN_TIME = false;
    public static final boolean DEFAULT_PERIODIC_METADATA_ENABLED = false;
    public static final int DEFAULT_PERIODIC_METADATA_INTERVAL = 360;
    public static final Set<String> DEFAULT_PRE_INSTALLED_PACKAGES = new HashSet(Arrays.asList(new String[]{new String("com.facebook.katana"), new String("com.yandex.browser")}));
    public static final String DEFAULT_PROFILE_ID = null;
    public static final int DEFAULT_SESSION_MAX_BACKGROUND_TIME = 1800;
    public static final boolean DEFAULT_SIMPLE_TOKEN_ENABLED = true;
    public static final int DEFAULT_STOP_AUTO_LOAD_AMOUNT = 3;
    public static final int DEFAULT_STOP_AUTO_LOAD_PRE_CAHE_AMOUNT = 3;
    public static final boolean DEFAULT_WF_SCAN_ENABLED = false;
    public static final String KEY_METADATA = "metaData";
    private static volatile MetaData instance = new MetaData();
    private static final Object lock = new Object();
    private static final long serialVersionUID = 1;
    private static C5478c task;
    private long IABDisplayImpressionDelayInSeconds = 1;
    private long IABVideoImpressionDelayInSeconds = 2;
    @C5548f(mo20534a = true)
    private C5487h SimpleToken = new C5487h();
    private boolean SupportIABViewability = true;
    private String adPlatformBannerHostSecured;
    public String adPlatformHostSecured = DEFAULT_AD_PLATFORM_HOST;
    private String adPlatformNativeHostSecured;
    private String adPlatformOverlayHostSecured;
    private String adPlatformReturnHostSecured;
    private String adPlatformSplashHostSecured;
    private boolean alwaysSendToken = true;
    @C5548f(mo20534a = true)
    public C5372a analytics = new C5372a();
    private String assetsBaseUrlSecured = "";
    @C5548f(mo20534a = true)
    private C5477b btConfig = new C5477b();
    private boolean btEnabled = false;
    private boolean chromeCustomeTabsExternal = true;
    private boolean chromeCustomeTabsInternal = true;
    private boolean compressionEnabled = false;
    private boolean disableSendAdvertisingId = AdsConstants.f17010g.booleanValue();
    private boolean dns = false;
    private boolean inAppBrowser = true;
    @C5548f(mo20535b = C5473b.class)
    private C5473b inAppBrowserPreLoad;
    @C5548f(mo20535b = HashSet.class)
    private Set<String> installersList = DEFAULT_INSTALLERS_LIST;
    @C5548f(mo20535b = HashSet.class)
    private Set<Integer> invalidForRetry = new HashSet();
    @C5548f(mo20535b = HashSet.class)
    private Set<Integer> invalidNetworkCodesInfoEvents = DEFAULT_INVALID_NETWORK_CODES_INFO_EVENTS;
    private boolean isToken1Mandatory = true;
    private transient boolean loading = false;
    @C5548f(mo20534a = true)
    private LocationConfig location = new LocationConfig();
    public String metaDataHostSecured = DEFAULT_METADATA_HOST;
    private transient List<C5481d> metaDataListeners = new ArrayList();
    private String metadataUpdateVersion = AdsConstants.f17011h;
    private int notVisibleBannerReloadInterval = DEFAULT_NOT_VISIBLE_BANNER_RELOAD_INTERVAL;
    private boolean omSdkEnabled = false;
    private int[] periodicEventIntMin = DEFAULT_PERIODIC_INFOEVENT_INTERVALS;
    private boolean periodicInfoEventEnabled = false;
    private int periodicInfoEventIntervalInMinutes = 360;
    private boolean periodicInfoEventOnRunTimeEnabled = false;
    private boolean periodicMetaDataEnabled = false;
    private int periodicMetaDataIntervalInMinutes = 360;
    @C5548f(mo20535b = HashSet.class)
    private Set<String> preInstalledPackages = DEFAULT_PRE_INSTALLED_PACKAGES;
    private String profileId = DEFAULT_PROFILE_ID;
    private transient boolean ready = false;
    @C5548f(mo20534a = true)
    private C5486g sensorsConfig = new C5486g();
    private int sessionMaxBackgroundTime = DEFAULT_SESSION_MAX_BACKGROUND_TIME;
    private boolean simpleToken2 = true;
    private int stopAutoLoadAmount = 3;
    private int stopAutoLoadPreCacheAmount = 3;
    private boolean trueNetEnabled = false;
    private long userAgentDelayInSeconds = 5;
    private boolean userAgentEnabled = true;
    private boolean webViewSecured = true;
    private boolean wfScanEnabled = false;

    /* renamed from: com.startapp.android.publish.common.metaData.MetaData$a */
    /* compiled from: StartAppSDK */
    public static class C5472a implements C5502a {

        /* renamed from: a */
        Context f17447a;

        /* renamed from: b */
        String f17448b;

        public C5472a(Context context, String str) {
            this.f17447a = context;
            this.f17448b = str;
        }

        /* renamed from: a */
        public void mo18881a(Bitmap bitmap, int i) {
            if (bitmap != null) {
                C5295a.m22611a(this.f17447a, bitmap, this.f17448b, ".png");
            }
        }
    }

    /* renamed from: com.startapp.android.publish.common.metaData.MetaData$b */
    /* compiled from: StartAppSDK */
    public enum C5473b {
        DISABLED,
        CONTENT,
        FULL
    }

    public C5487h getSimpleTokenConfig() {
        return this.SimpleToken;
    }

    /* access modifiers changed from: protected */
    public void setSimpleTokenConfig(C5487h hVar) {
        this.SimpleToken = hVar;
    }

    public static void init(Context context) {
        MetaData metaData = (MetaData) C5515e.m23542a(context, "StartappMetadata", MetaData.class);
        MetaData metaData2 = new MetaData();
        if (metaData != null) {
            boolean a = C5307i.m22678a(metaData, metaData2);
            if (!metaData.isMetaDataVersionChanged() && a) {
                C5378f.m23016a(context, C5376d.METADATA_NULL, "MetaData", "", "");
            }
            metaData.initTransientFields();
            instance = metaData;
        } else {
            instance = metaData2;
        }
        getInstance().applyAdPlatformProtocolToHosts();
    }

    public static void update(Context context, MetaData metaData, boolean z) {
        List<C5481d> list;
        synchronized (lock) {
            if (Constants.m23468a().booleanValue()) {
                StringBuilder sb = new StringBuilder();
                sb.append("MetaData received:\r\n");
                sb.append(C5544b.m23667a(metaData));
                C5518g.m23561a(3, sb.toString());
            }
            if (getInstance().metaDataListeners != null) {
                list = new ArrayList<>(getInstance().metaDataListeners);
                getInstance().metaDataListeners.clear();
            } else {
                list = null;
            }
            metaData.metaDataListeners = getInstance().metaDataListeners;
            metaData.applyAdPlatformProtocolToHosts();
            metaData.metadataUpdateVersion = AdsConstants.f17011h;
            C5515e.m23555b(context, "StartappMetadata", (Serializable) metaData);
            C5518g.m23561a(3, "MetaData saved:");
            metaData.loading = false;
            metaData.ready = true;
            if (!C5307i.m22682b(getInstance(), metaData)) {
                z = true;
            }
            instance = metaData;
            C5414k.m23101b(context, "totalSessions", Integer.valueOf(C5414k.m23094a(context, "totalSessions", Integer.valueOf(0)).intValue() + 1));
            task = null;
        }
        if (list != null) {
            for (C5481d a : list) {
                a.mo19192a(z);
            }
        }
    }

    public static void failedLoading() {
        ArrayList<C5481d> arrayList;
        synchronized (lock) {
            if (getInstance().metaDataListeners != null) {
                arrayList = new ArrayList<>(getInstance().metaDataListeners);
                getInstance().metaDataListeners.clear();
            } else {
                arrayList = null;
            }
            getInstance().loading = false;
        }
        if (arrayList != null) {
            for (C5481d a : arrayList) {
                a.mo19191a();
            }
        }
    }

    public static boolean isLoadedFromServer(Context context) {
        return context.getFileStreamPath("StartappMetadata").exists();
    }

    public void loadFromServer(Context context, AdPreferences adPreferences, C5474a aVar, boolean z, C5481d dVar) {
        loadFromServer(context, adPreferences, aVar, z, dVar, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r8 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r9 == null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r9.mo19192a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadFromServer(android.content.Context r5, com.startapp.android.publish.common.model.AdPreferences r6, com.startapp.android.publish.common.metaData.MetaDataRequest.C5474a r7, boolean r8, com.startapp.android.publish.common.metaData.C5481d r9, boolean r10) {
        /*
            r4 = this;
            java.lang.String r0 = r6.getProductId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0015
            com.startapp.android.publish.adsCommon.f.d r0 = com.startapp.android.publish.adsCommon.p182f.C5376d.NO_APPID
            java.lang.String r1 = "MetaData.loadFromServer"
            java.lang.String r2 = "The productId wasn't set"
            java.lang.String r3 = ""
            com.startapp.android.publish.adsCommon.p182f.C5378f.m23016a(r5, r0, r1, r2, r3)
        L_0x0015:
            r0 = 0
            if (r8 != 0) goto L_0x001d
            if (r9 == 0) goto L_0x001d
            r9.mo19192a(r0)
        L_0x001d:
            java.lang.Object r1 = lock
            monitor-enter(r1)
            com.startapp.android.publish.common.metaData.MetaData r2 = getInstance()     // Catch:{ all -> 0x0069 }
            boolean r2 = r2.isReady()     // Catch:{ all -> 0x0069 }
            if (r2 == 0) goto L_0x0036
            if (r10 == 0) goto L_0x002d
            goto L_0x0036
        L_0x002d:
            monitor-exit(r1)     // Catch:{ all -> 0x0069 }
            if (r8 == 0) goto L_0x0035
            if (r9 == 0) goto L_0x0035
            r9.mo19192a(r0)
        L_0x0035:
            return
        L_0x0036:
            com.startapp.android.publish.common.metaData.MetaData r2 = getInstance()     // Catch:{ all -> 0x0069 }
            boolean r2 = r2.isLoading()     // Catch:{ all -> 0x0069 }
            if (r2 == 0) goto L_0x0042
            if (r10 == 0) goto L_0x005c
        L_0x0042:
            r10 = 1
            r4.loading = r10     // Catch:{ all -> 0x0069 }
            r4.ready = r0     // Catch:{ all -> 0x0069 }
            com.startapp.android.publish.common.metaData.c r10 = task     // Catch:{ all -> 0x0069 }
            if (r10 == 0) goto L_0x0050
            com.startapp.android.publish.common.metaData.c r10 = task     // Catch:{ all -> 0x0069 }
            r10.mo20274b()     // Catch:{ all -> 0x0069 }
        L_0x0050:
            com.startapp.android.publish.common.metaData.c r10 = new com.startapp.android.publish.common.metaData.c     // Catch:{ all -> 0x0069 }
            r10.<init>(r5, r6, r7)     // Catch:{ all -> 0x0069 }
            task = r10     // Catch:{ all -> 0x0069 }
            com.startapp.android.publish.common.metaData.c r5 = task     // Catch:{ all -> 0x0069 }
            r5.mo20272a()     // Catch:{ all -> 0x0069 }
        L_0x005c:
            if (r8 == 0) goto L_0x0067
            if (r9 == 0) goto L_0x0067
            com.startapp.android.publish.common.metaData.MetaData r5 = getInstance()     // Catch:{ all -> 0x0069 }
            r5.addMetaDataListener(r9)     // Catch:{ all -> 0x0069 }
        L_0x0067:
            monitor-exit(r1)     // Catch:{ all -> 0x0069 }
            return
        L_0x0069:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0069 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.publish.common.metaData.MetaData.loadFromServer(android.content.Context, com.startapp.android.publish.common.model.AdPreferences, com.startapp.android.publish.common.metaData.MetaDataRequest$a, boolean, com.startapp.android.publish.common.metaData.d, boolean):void");
    }

    public void addMetaDataListener(C5481d dVar) {
        synchronized (lock) {
            this.metaDataListeners.add(dVar);
        }
    }

    public static Object getLock() {
        return lock;
    }

    public boolean isLoading() {
        return this.loading;
    }

    public boolean isReady() {
        return this.ready;
    }

    public void setReady(boolean z) {
        this.ready = z;
    }

    private boolean isMetaDataVersionChanged() {
        return !AdsConstants.f17011h.equals(this.metadataUpdateVersion);
    }

    public String getAssetsBaseUrl() {
        return this.assetsBaseUrlSecured != null ? this.assetsBaseUrlSecured : "";
    }

    public boolean isPeriodicMetaDataEnabled() {
        return this.periodicMetaDataEnabled;
    }

    public void setPeriodicMetaDataEnabled(boolean z) {
        this.periodicMetaDataEnabled = z;
    }

    public int getPeriodicMetaDataInterval() {
        return this.periodicMetaDataIntervalInMinutes;
    }

    public void setPeriodicMetaDataInterval(int i) {
        this.periodicMetaDataIntervalInMinutes = i;
    }

    public boolean isPeriodicInfoEventEnabled() {
        return this.periodicInfoEventEnabled;
    }

    public boolean isPeriodicInfoEventOnRunTimeEnabled() {
        return this.periodicInfoEventOnRunTimeEnabled;
    }

    public void setPeriodicInfoEventEnabled(boolean z) {
        this.periodicInfoEventEnabled = z;
    }

    public int getPeriodicInfoEventIntervalInMinutes(Context context) {
        if (this.periodicEventIntMin == null || this.periodicEventIntMin.length < 3) {
            this.periodicEventIntMin = DEFAULT_PERIODIC_INFOEVENT_INTERVALS;
        }
        if (C5509c.m23516a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            int i = this.periodicEventIntMin[0];
            if (i <= 0) {
                return DEFAULT_PERIODIC_INFOEVENT_INTERVALS[0];
            }
            return i;
        } else if (!C5509c.m23516a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            return this.periodicEventIntMin[2];
        } else {
            int i2 = this.periodicEventIntMin[1];
            if (i2 <= 0) {
                return DEFAULT_PERIODIC_INFOEVENT_INTERVALS[1];
            }
            return i2;
        }
    }

    public void setPeriodicInfoEventIntervalInMinutes(int i) {
        this.periodicInfoEventIntervalInMinutes = i;
    }

    public Set<Integer> getInvalidForRetry() {
        if (this.invalidForRetry != null) {
            return this.invalidForRetry;
        }
        return new HashSet();
    }

    public Set<Integer> getInvalidNetworkCodesInfoEvents() {
        if (this.invalidNetworkCodesInfoEvents != null) {
            return this.invalidNetworkCodesInfoEvents;
        }
        return DEFAULT_INVALID_NETWORK_CODES_INFO_EVENTS;
    }

    public String getMetaDataHost() {
        if (AdsConstants.OVERRIDE_HOST != null) {
            return AdsConstants.OVERRIDE_HOST;
        }
        return this.metaDataHostSecured;
    }

    public String getAdPlatformHost() {
        if (AdsConstants.OVERRIDE_HOST != null) {
            return AdsConstants.OVERRIDE_HOST;
        }
        return this.adPlatformHostSecured != null ? this.adPlatformHostSecured : DEFAULT_AD_PLATFORM_HOST;
    }

    public String getAdPlatformHost(Placement placement) {
        switch (placement) {
            case INAPP_BANNER:
                return this.adPlatformBannerHostSecured != null ? this.adPlatformBannerHostSecured : getAdPlatformHost();
            case INAPP_OVERLAY:
                return this.adPlatformOverlayHostSecured != null ? this.adPlatformOverlayHostSecured : getAdPlatformHost();
            case INAPP_NATIVE:
                return this.adPlatformNativeHostSecured != null ? this.adPlatformNativeHostSecured : getAdPlatformHost();
            case INAPP_RETURN:
                return this.adPlatformReturnHostSecured != null ? this.adPlatformReturnHostSecured : getAdPlatformHost();
            case INAPP_SPLASH:
                return this.adPlatformSplashHostSecured != null ? this.adPlatformSplashHostSecured : getAdPlatformHost();
            default:
                return getAdPlatformHost();
        }
    }

    public String getHostForWebview() {
        return getHostForWebview(getInstance().getAdPlatformHost(), VERSION.SDK_INT, this.webViewSecured);
    }

    public static String getHostForWebview(String str, int i, boolean z) {
        String str2 = (i > 26 || z) ? "https" : "http";
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("://");
        if (str.startsWith(sb.toString())) {
            return str;
        }
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str.substring(indexOf));
        return sb2.toString();
    }

    public long getSessionMaxBackgroundTime() {
        return TimeUnit.SECONDS.toMillis((long) this.sessionMaxBackgroundTime);
    }

    public Set<String> getInstallersList() {
        return this.installersList;
    }

    public void setInstallersList(Set<String> set) {
        this.installersList = set;
    }

    public Set<String> getPreInstalledPackages() {
        Set<String> set = this.preInstalledPackages;
        if (set == null) {
            set = DEFAULT_PRE_INSTALLED_PACKAGES;
        }
        return Collections.unmodifiableSet(set);
    }

    public void setPreInstalledPackages(Set<String> set) {
        this.preInstalledPackages = set;
    }

    public boolean isSimpleToken2() {
        return this.simpleToken2;
    }

    public void setSimpleToken2(boolean z) {
        this.simpleToken2 = z;
    }

    public boolean isAlwaysSendToken() {
        return this.alwaysSendToken;
    }

    public void setAlwaysSendToken(boolean z) {
        this.alwaysSendToken = z;
    }

    public boolean isToken1Mandatory() {
        return this.isToken1Mandatory;
    }

    public boolean isCompressionEnabled() {
        return this.compressionEnabled;
    }

    public void setCompressionEnabled(boolean z) {
        this.compressionEnabled = z;
    }

    public boolean isInAppBrowser() {
        return C5307i.m22674a(256) && this.inAppBrowser;
    }

    public void setInAppBrowser(boolean z) {
        this.inAppBrowser = z;
    }

    public C5473b getInAppBrowserPreLoad() {
        return this.inAppBrowserPreLoad;
    }

    public void setInAppBrowserPreLoad(C5473b bVar) {
        this.inAppBrowserPreLoad = bVar;
    }

    public String getProfileId() {
        return this.profileId;
    }

    public C5372a getAnalyticsConfig() {
        return this.analytics;
    }

    public C5486g getSensorsConfig() {
        return this.sensorsConfig;
    }

    public C5477b getBluetoothConfig() {
        return this.btConfig;
    }

    public LocationConfig getLocationConfig() {
        return this.location;
    }

    public boolean isWfScanEnabled() {
        return this.wfScanEnabled;
    }

    public int getNotVisibleBannerReloadInterval() {
        return this.notVisibleBannerReloadInterval;
    }

    public static MetaData getInstance() {
        return instance;
    }

    public long getIABDisplayImpressionDelayInSeconds() {
        return this.IABDisplayImpressionDelayInSeconds;
    }

    public long getIABVideoImpressionDelayInSeconds() {
        return this.IABVideoImpressionDelayInSeconds;
    }

    public long getUserAgentDelayInSeconds() {
        return this.userAgentDelayInSeconds;
    }

    public boolean isUserAgentEnabled() {
        return this.userAgentEnabled;
    }

    public boolean isSupportIABViewability() {
        return this.SupportIABViewability;
    }

    public void applyAdPlatformProtocolToHosts() {
        this.adPlatformHostSecured = replaceAdProtocol(this.adPlatformHostSecured, DEFAULT_AD_PLATFORM_HOST);
        this.metaDataHostSecured = replaceAdProtocol(this.metaDataHostSecured, DEFAULT_METADATA_HOST);
        this.adPlatformBannerHostSecured = replaceAdProtocol(this.adPlatformBannerHostSecured, null);
        this.adPlatformSplashHostSecured = replaceAdProtocol(this.adPlatformSplashHostSecured, null);
        this.adPlatformReturnHostSecured = replaceAdProtocol(this.adPlatformReturnHostSecured, null);
        this.adPlatformOverlayHostSecured = replaceAdProtocol(this.adPlatformOverlayHostSecured, null);
        this.adPlatformNativeHostSecured = replaceAdProtocol(this.adPlatformNativeHostSecured, null);
    }

    public boolean canShowAd() {
        return !this.dns;
    }

    public int getStopAutoLoadAmount() {
        return this.stopAutoLoadAmount;
    }

    public int getStopAutoLoadPreCacheAmount() {
        return this.stopAutoLoadPreCacheAmount;
    }

    public boolean getTrueNetEnabled() {
        return this.trueNetEnabled;
    }

    public boolean getChromeCustomeTabsInternal() {
        return this.chromeCustomeTabsInternal;
    }

    public boolean getChromeCustomeTabsExternal() {
        return this.chromeCustomeTabsExternal;
    }

    public boolean getDisableSendAdvertisingId() {
        return this.disableSendAdvertisingId;
    }

    private String replaceAdProtocol(String str, String str2) {
        return str != null ? str.replace("%AdPlatformProtocol%", "1.5") : str2;
    }

    private void initTransientFields() {
        this.loading = false;
        this.ready = false;
        this.metaDataListeners = new ArrayList();
    }

    public static void preCacheResources(Context context, String str) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        if (str != null && !str.equals("")) {
            if (!C5295a.m22612a(context, "close_button", ".png") && !C5307i.m22673a()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("close_button");
                sb.append(".png");
                new C5499a(sb.toString(), new C5472a(context, "close_button"), 0).mo20469a();
            }
            if (C5307i.m22674a(256)) {
                for (String str2 : AdsConstants.f17014k) {
                    if (!C5295a.m22612a(context, str2, ".png")) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(str2);
                        sb2.append(".png");
                        new C5499a(sb2.toString(), new C5472a(context, str2), 0).mo20469a();
                    }
                }
            }
            if (C5307i.m22674a(64)) {
                for (String str3 : AdsConstants.f17015l) {
                    if (!C5295a.m22612a(context, str3, ".png")) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append(str3);
                        sb3.append(".png");
                        new C5499a(sb3.toString(), new C5472a(context, str3), 0).mo20469a();
                    }
                }
                if (!C5295a.m22612a(context, "logo", ".png")) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append("logo");
                    sb4.append(".png");
                    new C5499a(sb4.toString(), new C5472a(context, "logo"), 0).mo20469a();
                }
            } else if (C5307i.m22674a(32)) {
                for (String str4 : AdsConstants.f17015l) {
                    if (!C5295a.m22612a(context, str4, ".png")) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str);
                        sb5.append(str4);
                        sb5.append(".png");
                        new C5499a(sb5.toString(), new C5472a(context, str4), 0).mo20469a();
                    }
                }
            }
        }
    }

    public boolean isOmsdkEnabled() {
        return this.omSdkEnabled;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaData metaData = (MetaData) obj;
        if (!(this.sessionMaxBackgroundTime == metaData.sessionMaxBackgroundTime && this.simpleToken2 == metaData.simpleToken2 && this.alwaysSendToken == metaData.alwaysSendToken && this.isToken1Mandatory == metaData.isToken1Mandatory && this.compressionEnabled == metaData.compressionEnabled && this.btEnabled == metaData.btEnabled && this.periodicMetaDataEnabled == metaData.periodicMetaDataEnabled && this.periodicMetaDataIntervalInMinutes == metaData.periodicMetaDataIntervalInMinutes && this.periodicInfoEventEnabled == metaData.periodicInfoEventEnabled && this.periodicInfoEventOnRunTimeEnabled == metaData.periodicInfoEventOnRunTimeEnabled && this.periodicInfoEventIntervalInMinutes == metaData.periodicInfoEventIntervalInMinutes && this.inAppBrowser == metaData.inAppBrowser && this.SupportIABViewability == metaData.SupportIABViewability && this.IABDisplayImpressionDelayInSeconds == metaData.IABDisplayImpressionDelayInSeconds && this.IABVideoImpressionDelayInSeconds == metaData.IABVideoImpressionDelayInSeconds && this.userAgentDelayInSeconds == metaData.userAgentDelayInSeconds && this.userAgentEnabled == metaData.userAgentEnabled && this.wfScanEnabled == metaData.wfScanEnabled && this.dns == metaData.dns && this.stopAutoLoadAmount == metaData.stopAutoLoadAmount && this.stopAutoLoadPreCacheAmount == metaData.stopAutoLoadPreCacheAmount && this.trueNetEnabled == metaData.trueNetEnabled && this.webViewSecured == metaData.webViewSecured && this.omSdkEnabled == metaData.omSdkEnabled && this.chromeCustomeTabsInternal == metaData.chromeCustomeTabsInternal && this.chromeCustomeTabsExternal == metaData.chromeCustomeTabsExternal && this.disableSendAdvertisingId == metaData.disableSendAdvertisingId && this.notVisibleBannerReloadInterval == metaData.notVisibleBannerReloadInterval && C5307i.m22682b(this.SimpleToken, metaData.SimpleToken) && C5307i.m22682b(this.metaDataHostSecured, metaData.metaDataHostSecured) && C5307i.m22682b(this.adPlatformHostSecured, metaData.adPlatformHostSecured) && C5307i.m22682b(this.adPlatformBannerHostSecured, metaData.adPlatformBannerHostSecured) && C5307i.m22682b(this.adPlatformSplashHostSecured, metaData.adPlatformSplashHostSecured) && C5307i.m22682b(this.adPlatformReturnHostSecured, metaData.adPlatformReturnHostSecured) && C5307i.m22682b(this.adPlatformOverlayHostSecured, metaData.adPlatformOverlayHostSecured) && C5307i.m22682b(this.adPlatformNativeHostSecured, metaData.adPlatformNativeHostSecured) && C5307i.m22682b(this.profileId, metaData.profileId) && C5307i.m22682b(this.installersList, metaData.installersList) && C5307i.m22682b(this.preInstalledPackages, metaData.preInstalledPackages) && Arrays.equals(this.periodicEventIntMin, metaData.periodicEventIntMin) && C5307i.m22682b(this.sensorsConfig, metaData.sensorsConfig) && C5307i.m22682b(this.btConfig, metaData.btConfig) && C5307i.m22682b(this.assetsBaseUrlSecured, metaData.assetsBaseUrlSecured) && this.inAppBrowserPreLoad == metaData.inAppBrowserPreLoad && C5307i.m22682b(this.invalidForRetry, metaData.invalidForRetry) && C5307i.m22682b(this.invalidNetworkCodesInfoEvents, metaData.invalidNetworkCodesInfoEvents) && C5307i.m22682b(this.analytics, metaData.analytics) && C5307i.m22682b(this.location, metaData.location) && C5307i.m22682b(this.metadataUpdateVersion, metaData.metadataUpdateVersion))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (31 * C5307i.m22652a(this.SimpleToken, Integer.valueOf(this.notVisibleBannerReloadInterval), this.metaDataHostSecured, this.adPlatformHostSecured, this.adPlatformBannerHostSecured, this.adPlatformSplashHostSecured, this.adPlatformReturnHostSecured, this.adPlatformOverlayHostSecured, this.adPlatformNativeHostSecured, Integer.valueOf(this.sessionMaxBackgroundTime), this.profileId, this.installersList, this.preInstalledPackages, Boolean.valueOf(this.simpleToken2), Boolean.valueOf(this.alwaysSendToken), Boolean.valueOf(this.isToken1Mandatory), Boolean.valueOf(this.compressionEnabled), Boolean.valueOf(this.btEnabled), Boolean.valueOf(this.periodicMetaDataEnabled), Integer.valueOf(this.periodicMetaDataIntervalInMinutes), Boolean.valueOf(this.periodicInfoEventEnabled), Boolean.valueOf(this.periodicInfoEventOnRunTimeEnabled), Integer.valueOf(this.periodicInfoEventIntervalInMinutes), Boolean.valueOf(this.inAppBrowser), Boolean.valueOf(this.SupportIABViewability), Long.valueOf(this.IABDisplayImpressionDelayInSeconds), Long.valueOf(this.IABVideoImpressionDelayInSeconds), Long.valueOf(this.userAgentDelayInSeconds), Boolean.valueOf(this.userAgentEnabled), this.sensorsConfig, this.btConfig, this.assetsBaseUrlSecured, this.inAppBrowserPreLoad, this.invalidForRetry, this.invalidNetworkCodesInfoEvents, this.analytics, this.location, Boolean.valueOf(this.wfScanEnabled), this.metadataUpdateVersion, Boolean.valueOf(this.dns), Integer.valueOf(this.stopAutoLoadAmount), Integer.valueOf(this.stopAutoLoadPreCacheAmount), Boolean.valueOf(this.trueNetEnabled), Boolean.valueOf(this.webViewSecured), Boolean.valueOf(this.omSdkEnabled), Boolean.valueOf(this.chromeCustomeTabsInternal), Boolean.valueOf(this.chromeCustomeTabsExternal), Boolean.valueOf(this.disableSendAdvertisingId))) + Arrays.hashCode(this.periodicEventIntMin);
    }
}

package com.startapp.android.publish.adsCommon;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.location.Location;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.provider.Settings.Secure;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.startapp.android.publish.adsCommon.Utils.C5300c;
import com.startapp.android.publish.adsCommon.Utils.C5301d;
import com.startapp.android.publish.adsCommon.Utils.C5302e;
import com.startapp.android.publish.adsCommon.Utils.C5305g;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.Utils.NameValueSerializer;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.C5540c;
import com.startapp.common.p193a.C5503a;
import com.startapp.common.p193a.C5504b;
import com.startapp.common.p193a.C5504b.C5507b;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5517f;
import com.startapp.common.p193a.C5519h;
import com.startapp.common.p193a.C5519h.C5521b;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: StartAppSDK */
public abstract class BaseRequest implements NameValueSerializer {

    /* renamed from: OS */
    private static final String f17018OS = "android";
    private String androidId;
    private int appCode;
    private Boolean appOnForeground;
    private String appVersion;
    private String blat;
    private String blon;
    private String bssid;
    private String cellSignalLevel;
    private String cellTimingAdv;
    private String cid;
    private String clientSessionId;
    private float density;
    private String deviceIP;
    private String deviceVersion;
    private Map<String, String> frameworksMap = new TreeMap();
    private int height;
    private Set<String> inputLangs;
    private String installerPkg;
    private String isp;
    private String ispName;
    private String lac;
    private String locale;
    private List<Location> locations = null;
    private String manufacturer;
    private String model;
    private String netOper;
    private String networkOperName;
    private String networkType;

    /* renamed from: os */
    private String f17019os = f17018OS;
    private String packageId;
    private Map<String, String> parameters = new HashMap();
    private String personalizedAdsServing;
    private String productId;
    private String publisherId;
    protected Integer retry;
    private Boolean roaming;
    private boolean root;
    private long sdkFlavor = new BigInteger(AdsConstants.f17012i, 2).longValue();
    private int sdkId = 3;
    private String sdkVersion = AdsConstants.f17011h;
    private String signalLevel;
    private boolean simulator;
    private String ssid;
    private String subProductId;
    private String subPublisherId;
    private Boolean unknownSourcesAllowed;
    private boolean usbDebug;
    private C5507b userAdvertisingId;
    private String wfScanRes;
    private int width;
    private String wifiRSSILevel;
    private String wifiSignalLevel;

    /* renamed from: com.startapp.android.publish.adsCommon.BaseRequest$a */
    /* compiled from: StartAppSDK */
    static class C5290a {

        /* renamed from: a */
        private ScanResult f17020a;

        public C5290a(ScanResult scanResult) {
            this.f17020a = scanResult;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f17020a != null) {
                sb.append(this.f17020a.SSID);
                sb.append(',');
                sb.append(this.f17020a.BSSID);
                sb.append(',');
                sb.append(WifiManager.calculateSignalLevel(this.f17020a.level, 5));
                sb.append(',');
                sb.append(this.f17020a.level);
                sb.append(',');
                long a = C5509c.m23499a(this.f17020a);
                if (a != 0) {
                    sb.append(a);
                }
                sb.append(',');
                CharSequence b = C5509c.m23520b(this.f17020a);
                if (b != null) {
                    sb.append(b);
                }
            }
            return sb.toString();
        }
    }

    public Map<String, String> getParameters() {
        return this.parameters;
    }

    public void setParameters(Map<String, String> map) {
        this.parameters = map;
    }

    public String getPublisherId() {
        return this.publisherId;
    }

    public void setPublisherId(String str) {
        this.publisherId = str;
    }

    public long getSdkFlavor() {
        return this.sdkFlavor;
    }

    public void setSdkFlavor(long j) {
        this.sdkFlavor = j;
    }

    public String getPackageId() {
        return this.packageId;
    }

    public void setPackageId(String str) {
        this.packageId = str;
    }

    public String getAndroidId() {
        return this.androidId;
    }

    private void setAndroidId(Context context) {
        if (C5509c.m23517a(context, "com.google.android.gms", 0)) {
            try {
                if (Integer.parseInt(Integer.toString(context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode).substring(0, 1)) >= 4) {
                    this.androidId = Secure.getString(context.getContentResolver(), "android_id");
                }
            } catch (NameNotFoundException | Exception unused) {
            }
        }
    }

    public String getInstallerPkg() {
        return this.installerPkg;
    }

    public void setInstallerPkg(String str) {
        this.installerPkg = str;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public String getSignalLevel() {
        return this.signalLevel;
    }

    private void setNetworkType(Context context) {
        this.networkType = C5519h.m23568a(context);
    }

    private void setNetworkLevels(Context context) {
        try {
            this.signalLevel = "e106";
            this.cellSignalLevel = "e106";
            this.wifiSignalLevel = "e106";
            this.wifiRSSILevel = "e106";
            C5540c a = C5540c.m23644a();
            if (a != null) {
                this.cellSignalLevel = a.mo20525b();
            }
            C5521b bVar = null;
            if (MetaData.getInstance().isWfScanEnabled()) {
                bVar = C5519h.m23567a(context, this.networkType);
            }
            if (bVar == null) {
                this.signalLevel = this.cellSignalLevel;
            } else if (bVar.mo20496a() == null) {
                this.signalLevel = bVar.mo20500c();
                this.wifiRSSILevel = bVar.mo20498b();
                this.wifiSignalLevel = bVar.mo20500c();
            } else {
                this.signalLevel = bVar.mo20496a();
                this.wifiRSSILevel = bVar.mo20496a();
                this.wifiSignalLevel = bVar.mo20496a();
            }
        } catch (Exception unused) {
        }
    }

    public String getCellSignalLevel() {
        return this.cellSignalLevel;
    }

    public String getWifiSignalLevel() {
        return this.wifiSignalLevel;
    }

    public String getWifiRssiLevel() {
        return this.wifiRSSILevel;
    }

    public C5507b getUserAdvertisingId() {
        return this.userAdvertisingId;
    }

    public void setUserAdvertisingId(C5507b bVar) {
        this.userAdvertisingId = bVar;
    }

    public String getIsp() {
        return this.isp;
    }

    public void setIsp(String str) {
        this.isp = str;
    }

    public String getIspName() {
        return this.ispName;
    }

    public void setIspName(String str) {
        this.ispName = str;
    }

    public String getNetOper() {
        return this.netOper;
    }

    public void setNetOper(String str) {
        this.netOper = str;
    }

    public String getNetworkOperName() {
        return this.networkOperName;
    }

    public void setNetworkOperName(String str) {
        this.networkOperName = str;
    }

    public String getCid() {
        return this.cid;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public String getLac() {
        return this.lac;
    }

    public void setLac(String str) {
        this.lac = str;
    }

    public String getBlat() {
        return this.blat;
    }

    public void setBlat(String str) {
        this.blat = str;
    }

    public String getBlon() {
        return this.blon;
    }

    public void setBlon(String str) {
        this.blon = str;
    }

    public String getSsid() {
        return this.ssid;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public String getBssid() {
        return this.bssid;
    }

    public void setBssid(String str) {
        this.bssid = str;
    }

    public String getWfScanRes() {
        return this.wfScanRes;
    }

    public void setWfScanRes(String str) {
        this.wfScanRes = str;
    }

    public String getModel() {
        return this.model;
    }

    public void setRetry(int i) {
        this.retry = null;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public String getDeviceVersion() {
        return this.deviceVersion;
    }

    public void setDeviceVersion(String str) {
        this.deviceVersion = str;
    }

    public String getLocale() {
        return this.locale;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public String getSubPublisherId() {
        return this.subPublisherId;
    }

    public void setSubPublisherId(String str) {
        this.subPublisherId = str;
    }

    public String getSubProductId() {
        return this.subProductId;
    }

    public void setSubProductId(String str) {
        this.subProductId = str;
    }

    public String getOs() {
        return this.f17019os;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public String getSessionId() {
        if (this.clientSessionId == null) {
            return "";
        }
        return this.clientSessionId;
    }

    public void setSessionId(String str) {
        this.clientSessionId = str;
    }

    public Boolean isRoaming() {
        return this.roaming;
    }

    public void setRoaming(Context context) {
        this.roaming = C5519h.m23572b(context);
    }

    public String getDeviceIP() {
        return this.deviceIP;
    }

    public void setDeviceIP(WifiInfo wifiInfo) {
        this.deviceIP = C5519h.m23571a(wifiInfo);
    }

    public Boolean isUnknownSourcesAllowed() {
        return this.unknownSourcesAllowed;
    }

    public void setUnknownSourcesAllowed(Boolean bool) {
        this.unknownSourcesAllowed = bool;
    }

    public float getDensity() {
        return this.density;
    }

    public void setDensity(float f) {
        this.density = f;
    }

    public Boolean isAppOnForeground() {
        return this.appOnForeground;
    }

    public void setAppOnForeground(Context context) {
        try {
            this.appOnForeground = Boolean.valueOf(C5307i.m22688e(context));
        } catch (Exception unused) {
            this.appOnForeground = null;
        }
    }

    public Set<String> getInputLangs() {
        return this.inputLangs;
    }

    public void setInputLangs(Set<String> set) {
        this.inputLangs = set;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public int getAppCode() {
        return this.appCode;
    }

    public void setAppCode(int i) {
        this.appCode = i;
    }

    public List<Location> getLocations() {
        return this.locations;
    }

    public void setLocations(List<Location> list) {
        this.locations = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BaseRequest [parameters=");
        sb.append(this.parameters);
        sb.append("]");
        return sb.toString();
    }

    public void fillApplicationDetails(Context context, AdPreferences adPreferences) {
        fillApplicationDetails(context, adPreferences, true);
    }

    public void fillApplicationDetails(Context context, AdPreferences adPreferences, boolean z) {
        setPublisherId(adPreferences.getPublisherId());
        setProductId(adPreferences.getProductId());
        this.frameworksMap = C5414k.m23098b(context, "sharedPrefsWrappers", this.frameworksMap);
        if (!MetaData.getInstance().getDisableSendAdvertisingId()) {
            C5507b a = C5504b.m23480a().mo20472a(context);
            String a2 = a.mo20477a();
            if (a2.equals("0") || a2.equals("")) {
                if (!C5414k.m23092a(context, C5376d.NO_ADVERTISING_ID.mo19890a(), Boolean.valueOf(false)).booleanValue()) {
                    C5414k.m23099b(context, C5376d.NO_ADVERTISING_ID.mo19890a(), Boolean.valueOf(true));
                    C5378f.m23016a(context, C5376d.NO_ADVERTISING_ID, "BaseRequest.fillApplicationDetails", a.mo20480d(), "");
                }
                setAndroidId(context);
            }
            setUserAdvertisingId(a);
        }
        setPackageId(context.getPackageName());
        setInstallerPkg(C5307i.m22686d(context));
        setManufacturer(Build.MANUFACTURER);
        setModel(Build.MODEL);
        setDeviceVersion(Integer.toString(VERSION.SDK_INT));
        setLocale(context.getResources().getConfiguration().locale.toString());
        setInputLangs(C5509c.m23522b(context));
        setWidth(context.getResources().getDisplayMetrics().widthPixels);
        setHeight(context.getResources().getDisplayMetrics().heightPixels);
        setDensity(context.getResources().getDisplayMetrics().density);
        setAppOnForeground(context);
        setSessionId(C5305g.m22636d().mo19627a());
        setUnknownSourcesAllowed(Boolean.valueOf(C5509c.m23515a(context)));
        setRoaming(context);
        setNetworkType(context);
        setNetworkLevels(context);
        setAppVersion(C5509c.m23529e(context));
        setAppCode(C5509c.m23528d(context));
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                fillSimDetails(telephonyManager);
                fillNetworkOperatorDetails(context, telephonyManager);
                fillCellLocationDetails(context, telephonyManager);
                setCellTimingAdv(context, telephonyManager);
            }
        } catch (Exception unused) {
        }
        fillWifiDetails(context, z);
        this.usbDebug = C5509c.m23531g(context);
        this.root = C5509c.m23532h(context);
        this.simulator = C5509c.m23533i(context);
        this.personalizedAdsServing = C5414k.m23096a(context, "USER_CONSENT_PERSONALIZED_ADS_SERVING", (String) null);
    }

    public C5302e getNameValueJson() {
        C5300c cVar = new C5300c();
        addParams(cVar);
        return cVar;
    }

    public C5302e getNameValueMap() {
        C5301d dVar = new C5301d();
        addParams(dVar);
        return dVar;
    }

    private void addParams(C5302e eVar) {
        eVar.mo19624a("publisherId", (Object) this.publisherId, false);
        eVar.mo19624a("productId", (Object) this.productId, true);
        eVar.mo19624a("os", (Object) this.f17019os, true);
        eVar.mo19624a("sdkVersion", (Object) this.sdkVersion, false);
        eVar.mo19624a("flavor", (Object) Long.valueOf(this.sdkFlavor), false);
        if (this.frameworksMap != null && !this.frameworksMap.isEmpty()) {
            String str = "";
            for (String str2 : this.frameworksMap.keySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                sb.append(":");
                sb.append((String) this.frameworksMap.get(str2));
                sb.append(";");
                str = sb.toString();
            }
            eVar.mo19620a("frameworksData", (Object) str.substring(0, str.length() - 1), false, false);
        }
        eVar.mo19624a("packageId", (Object) this.packageId, false);
        eVar.mo19624a("installerPkg", (Object) this.installerPkg, false);
        if (this.userAdvertisingId != null) {
            eVar.mo19624a("userAdvertisingId", (Object) this.userAdvertisingId.mo20477a(), false);
            if (this.userAdvertisingId.mo20478b()) {
                eVar.mo19624a("limat", (Object) Boolean.valueOf(this.userAdvertisingId.mo20478b()), false);
            }
            eVar.mo19624a("advertisingIdSource", (Object) this.userAdvertisingId.mo20479c(), false);
        } else if (this.androidId != null) {
            eVar.mo19624a("userId", (Object) this.androidId, false);
        }
        eVar.mo19624a("model", (Object) this.model, false);
        eVar.mo19624a("manufacturer", (Object) this.manufacturer, false);
        eVar.mo19624a("deviceVersion", (Object) this.deviceVersion, false);
        eVar.mo19624a("locale", (Object) this.locale, false);
        eVar.mo19625a("inputLangs", this.inputLangs, false);
        eVar.mo19624a("isp", (Object) this.isp, false);
        eVar.mo19624a("ispName", (Object) this.ispName, false);
        eVar.mo19624a("netOper", (Object) getNetOper(), false);
        eVar.mo19624a("networkOperName", (Object) getNetworkOperName(), false);
        eVar.mo19624a("cid", (Object) getCid(), false);
        eVar.mo19624a("lac", (Object) getLac(), false);
        eVar.mo19624a("blat", (Object) getBlat(), false);
        eVar.mo19624a("blon", (Object) getBlon(), false);
        eVar.mo19624a("ssid", (Object) getSsid(), false);
        eVar.mo19624a("bssid", (Object) getBssid(), false);
        eVar.mo19624a("wfScanRes", (Object) getWfScanRes(), false);
        eVar.mo19624a("subPublisherId", (Object) this.subPublisherId, false);
        eVar.mo19624a("subProductId", (Object) this.subProductId, false);
        eVar.mo19624a("retryCount", (Object) this.retry, false);
        eVar.mo19624a("roaming", (Object) isRoaming(), false);
        eVar.mo19624a("deviceIP", (Object) getDeviceIP(), false);
        eVar.mo19624a("grid", (Object) getNetworkType(), false);
        eVar.mo19624a("silev", (Object) getSignalLevel(), false);
        eVar.mo19624a("cellSignalLevel", (Object) getCellSignalLevel(), false);
        if (getWifiSignalLevel() != null) {
            eVar.mo19624a("wifiSignalLevel", (Object) getWifiSignalLevel(), false);
        }
        if (getWifiRssiLevel() != null) {
            eVar.mo19624a("wifiRssiLevel", (Object) getWifiRssiLevel(), false);
        }
        if (getCellTimingAdv() != null) {
            eVar.mo19624a("cellTimingAdv", (Object) getCellTimingAdv(), false);
        }
        eVar.mo19624a("outsource", (Object) isUnknownSourcesAllowed(), false);
        eVar.mo19624a("width", (Object) String.valueOf(this.width), false);
        eVar.mo19624a("height", (Object) String.valueOf(this.height), false);
        eVar.mo19624a("density", (Object) String.valueOf(this.density), false);
        eVar.mo19624a("fgApp", (Object) isAppOnForeground(), false);
        eVar.mo19624a("sdkId", (Object) String.valueOf(this.sdkId), true);
        eVar.mo19624a("clientSessionId", (Object) this.clientSessionId, false);
        eVar.mo19624a("appVersion", (Object) this.appVersion, false);
        eVar.mo19624a("appCode", (Object) Integer.valueOf(this.appCode), false);
        eVar.mo19624a("timeSinceBoot", (Object) Long.valueOf(getTimeSinceBoot()), false);
        if (getLocations() != null && getLocations().size() > 0) {
            String a = C5517f.m23558a(getLocations());
            if (a != null && !a.equals("")) {
                eVar.mo19624a("locations", (Object) C5503a.m23478c(a), false);
            }
        }
        eVar.mo19624a("udbg", (Object) Boolean.valueOf(this.usbDebug), false);
        eVar.mo19624a("root", (Object) Boolean.valueOf(this.root), false);
        eVar.mo19624a("smltr", (Object) Boolean.valueOf(this.simulator), false);
        eVar.mo19624a("pas", (Object) this.personalizedAdsServing, false);
    }

    public String getRequestString() {
        return getNameValueMap().toString();
    }

    private void fillSimDetails(TelephonyManager telephonyManager) {
        if (telephonyManager.getSimState() == 5) {
            setIsp(telephonyManager.getSimOperator());
            setIspName(telephonyManager.getSimOperatorName());
        }
    }

    private void fillNetworkOperatorDetails(Context context, TelephonyManager telephonyManager) {
        int phoneType = telephonyManager.getPhoneType();
        if (phoneType != 0 && phoneType != 2) {
            String networkOperator = telephonyManager.getNetworkOperator();
            if (networkOperator != null) {
                setNetOper(C5503a.m23478c(networkOperator));
            }
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (networkOperatorName != null) {
                setNetworkOperName(C5503a.m23478c(networkOperatorName));
            }
        }
    }

    private void fillCellLocationDetails(Context context, TelephonyManager telephonyManager) {
        if (C5509c.m23516a(context, "android.permission.ACCESS_FINE_LOCATION") || C5509c.m23516a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            CellLocation cellLocation = telephonyManager.getCellLocation();
            if (cellLocation == null) {
                return;
            }
            if (cellLocation instanceof GsmCellLocation) {
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                setCid(C5503a.m23478c(String.valueOf(gsmCellLocation.getCid())));
                setLac(C5503a.m23478c(String.valueOf(gsmCellLocation.getLac())));
            } else if (cellLocation instanceof CdmaCellLocation) {
                CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                setBlat(C5503a.m23478c(String.valueOf(cdmaCellLocation.getBaseStationLatitude())));
                setBlon(C5503a.m23478c(String.valueOf(cdmaCellLocation.getBaseStationLongitude())));
            }
        }
    }

    private String getCellTimingAdv() {
        return this.cellTimingAdv;
    }

    private void setCellTimingAdv(Context context, TelephonyManager telephonyManager) {
        this.cellTimingAdv = C5509c.m23521b(context, telephonyManager);
    }

    private static long getTimeSinceBoot() {
        return SystemClock.elapsedRealtime();
    }

    public void fillLocationDetails(AdPreferences adPreferences, Context context) {
        boolean z;
        this.locations = new ArrayList();
        if (adPreferences == null || adPreferences.getLatitude() == null || adPreferences.getLongitude() == null) {
            z = false;
        } else {
            Location location = new Location("loc");
            location.setLongitude(adPreferences.getLongitude().doubleValue());
            location.setLongitude(adPreferences.getLongitude().doubleValue());
            location.setProvider(MetaData.DEFAULT_LOCATION_SOURCE);
            this.locations.add(location);
            z = true;
        }
        C5427m.m23145a().mo20014h(context);
        List a = C5517f.m23559a(context, MetaData.getInstance().getLocationConfig().isFiEnabled(), MetaData.getInstance().getLocationConfig().isCoEnabled());
        if (a != null && a.size() > 0) {
            this.locations.addAll(a);
            z = true;
        }
        setUsingLocation(context, z);
    }

    public static void setUsingLocation(Context context, boolean z) {
        C5414k.m23099b(context, "shared_prefs_using_location", Boolean.valueOf(z));
    }

    private void fillWifiDetails(Context context, boolean z) {
        try {
            if (MetaData.getInstance().isWfScanEnabled()) {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                if (wifiManager != null && C5509c.m23516a(context, "android.permission.ACCESS_WIFI_STATE")) {
                    if (getNetworkType().equals("WIFI")) {
                        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                        if (connectionInfo != null) {
                            setDeviceIP(connectionInfo);
                            String ssid2 = connectionInfo.getSSID();
                            String bssid2 = connectionInfo.getBSSID();
                            if (ssid2 != null) {
                                setSsid(C5503a.m23478c(ssid2));
                            }
                            if (bssid2 != null) {
                                setBssid(C5503a.m23478c(bssid2));
                            }
                        }
                    }
                    if (z) {
                        List a = C5509c.m23502a(context, wifiManager);
                        if (a != null && !a.equals(Collections.EMPTY_LIST)) {
                            ArrayList arrayList = new ArrayList();
                            for (int i = 0; i < Math.min(5, a.size()); i++) {
                                arrayList.add(new C5290a((ScanResult) a.get(i)));
                            }
                            setWfScanRes(C5503a.m23478c(TextUtils.join(";", arrayList)));
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}

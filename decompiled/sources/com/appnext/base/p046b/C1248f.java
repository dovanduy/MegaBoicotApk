package com.appnext.base.p046b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.appnext.core.C1326f;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Locale;

/* renamed from: com.appnext.base.b.f */
public class C1248f {
    public static final String TAG = "f";

    /* renamed from: jn */
    static final /* synthetic */ boolean f3971jn = true;

    /* renamed from: cf */
    public static String m5277cf() {
        return VERSION.RELEASE;
    }

    /* renamed from: cg */
    public static String m5278cg() {
        return Locale.getDefault().getLanguage();
    }

    /* renamed from: h */
    public static String m5281h(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            String str = (telephonyManager.getSimState() != 5 || telephonyManager.getSimOperatorName().isEmpty()) ? !telephonyManager.getNetworkOperatorName().isEmpty() ? telephonyManager.getNetworkOperatorName() : null : telephonyManager.getSimOperatorName();
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: au */
    public static long m5273au(String str) {
        try {
            if (!m5280g(C1247e.getContext(), "android.permission.READ_EXTERNAL_STORAGE") || TextUtils.isEmpty(str)) {
                return -1;
            }
            if (VERSION.SDK_INT >= 18) {
                return m5275aw(str);
            }
            return m5274av(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: av */
    private static long m5274av(String str) {
        if (!m5280g(C1247e.getContext(), "android.permission.READ_EXTERNAL_STORAGE") || TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            if ("isfs".equalsIgnoreCase(str)) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                return (((long) statFs.getFreeBlocks()) * ((long) statFs.getBlockSize())) / C1245d.f3948iQ;
            } else if ("iss".equalsIgnoreCase(str)) {
                StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                return (long) m5276b((((long) statFs2.getBlockSize()) * ((long) statFs2.getBlockCount())) / C1245d.f3948iQ);
            } else {
                long j = 0;
                if ("esfs".equalsIgnoreCase(str)) {
                    if (m5280g(C1247e.getContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
                        StatFs statFs3 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                        j = (((long) statFs3.getFreeBlocks()) * ((long) statFs3.getBlockSize())) / C1245d.f3948iQ;
                    }
                    return j;
                } else if ("ess".equalsIgnoreCase(str)) {
                    if (m5280g(C1247e.getContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
                        StatFs statFs4 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                        j = (((long) statFs4.getBlockSize()) * ((long) statFs4.getBlockCount())) / C1245d.f3948iQ;
                    }
                    return (long) m5276b(j);
                } else if ("isfp".equalsIgnoreCase(str)) {
                    StatFs statFs5 = new StatFs(Environment.getDataDirectory().getPath());
                    return Math.round((((double) ((((long) statFs5.getFreeBlocks()) * ((long) statFs5.getBlockSize())) / C1245d.f3948iQ)) / m5276b(((long) (statFs5.getBlockSize() * statFs5.getBlockCount())) / C1245d.f3948iQ)) * 100.0d);
                } else if (!"esfp".equalsIgnoreCase(str) || !m5280g(C1247e.getContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
                    return -1;
                } else {
                    StatFs statFs6 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    return Math.round((((double) ((((long) statFs6.getFreeBlocks()) * ((long) statFs6.getBlockSize())) / C1245d.f3948iQ)) / m5276b((((long) statFs6.getBlockSize()) * ((long) statFs6.getBlockCount())) / C1245d.f3948iQ)) * 100.0d);
                }
            }
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: aw */
    private static long m5275aw(String str) {
        if (!m5280g(C1247e.getContext(), "android.permission.READ_EXTERNAL_STORAGE") || TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            if ("isfs".equalsIgnoreCase(str)) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                return (statFs.getFreeBlocksLong() * statFs.getBlockSizeLong()) / C1245d.f3948iQ;
            } else if ("iss".equalsIgnoreCase(str)) {
                StatFs statFs2 = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                return (long) m5276b((statFs2.getBlockSizeLong() * statFs2.getBlockCountLong()) / C1245d.f3948iQ);
            } else {
                long j = 0;
                if ("esfs".equalsIgnoreCase(str)) {
                    if (m5280g(C1247e.getContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
                        StatFs statFs3 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                        j = (statFs3.getFreeBlocksLong() * statFs3.getBlockSizeLong()) / C1245d.f3948iQ;
                    }
                    return j;
                } else if ("ess".equalsIgnoreCase(str)) {
                    if (m5280g(C1247e.getContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
                        StatFs statFs4 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                        j = (statFs4.getBlockSizeLong() * statFs4.getBlockCountLong()) / C1245d.f3948iQ;
                    }
                    return (long) m5276b(j);
                } else if ("isfp".equalsIgnoreCase(str)) {
                    StatFs statFs5 = new StatFs(Environment.getDataDirectory().getPath());
                    return Math.round((((double) (statFs5.getAvailableBlocksLong() * statFs5.getBlockSizeLong())) / m5276b(statFs5.getBlockSizeLong() * statFs5.getBlockCountLong())) * 100.0d);
                } else if (!"esfp".equalsIgnoreCase(str) || !m5280g(C1247e.getContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
                    return -1;
                } else {
                    StatFs statFs6 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    return Math.round((((double) ((statFs6.getFreeBlocksLong() * statFs6.getBlockSizeLong()) / C1245d.f3948iQ)) / m5276b((statFs6.getBlockSizeLong() * statFs6.getBlockCountLong()) / C1245d.f3948iQ)) * 100.0d);
                }
            }
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private static double m5276b(long j) {
        double d = (double) j;
        int log = (int) (Math.log(d) / Math.log(2.0d));
        if (Math.pow(2.0d, (double) log) == d) {
            return d;
        }
        return Math.pow(2.0d, (double) (log + 1));
    }

    /* renamed from: f */
    public static int m5279f(Context context, String str) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if ("dvolr".equalsIgnoreCase(str)) {
            i = audioManager.getStreamVolume(2);
        } else if ("dvolm".equalsIgnoreCase(str)) {
            i = audioManager.getStreamVolume(3);
        } else if ("dvola".equalsIgnoreCase(str)) {
            i = audioManager.getStreamVolume(4);
        } else if ("dvoln".equalsIgnoreCase(str)) {
            i = audioManager.getStreamVolume(5);
        } else if ("dvolc".equalsIgnoreCase(str)) {
            i = audioManager.getStreamVolume(0);
        }
        return i;
    }

    /* renamed from: i */
    public static boolean m5282i(Context context) throws SettingNotFoundException {
        return Secure.getInt(context.getContentResolver(), "install_non_market_apps") == 1;
    }

    /* renamed from: j */
    public static NetworkInfo m5283j(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    /* renamed from: k */
    public static boolean m5284k(Context context) {
        if (context == null) {
            return false;
        }
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (f3971jn || registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("plugged", -1);
            if (intExtra == 1 || intExtra == 2 || intExtra == 3) {
                return true;
            }
            return false;
        }
        throw new AssertionError();
    }

    /* renamed from: g */
    public static boolean m5280g(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static String m5285l(Context context) {
        WifiInfo wifiInfo;
        String str = "not connected";
        try {
            if (m5280g(context, "android.permission.ACCESS_NETWORK_STATE") && m5280g(context, "android.permission.ACCESS_WIFI_STATE")) {
                try {
                    wifiInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
                } catch (Throwable unused) {
                    wifiInfo = null;
                }
                if (wifiInfo != null) {
                    if (wifiInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                        String ssid = wifiInfo.getSSID();
                        if (!TextUtils.isEmpty(ssid) && !ssid.equalsIgnoreCase("<unknown ssid>")) {
                            str = ssid;
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return str.replace("\"", "");
    }

    public static String getKey() {
        C1250h.m5296ci();
        return C1250h.m5295ay(C1326f.m5675b(C1247e.getContext(), false));
    }
}

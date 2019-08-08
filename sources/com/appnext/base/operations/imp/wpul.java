package com.appnext.base.operations.imp;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appnext.base.C1222a;
import com.appnext.base.C1222a.C1223a;
import com.appnext.base.operations.C1265a;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1248f;
import com.appnext.base.p046b.C1249g;
import com.appnext.base.p046b.C1250h;
import com.appnext.base.p046b.C1251i;
import com.appnext.base.p046b.C1252j;
import com.appnext.base.p046b.C1252j.C1258c;
import com.appnext.base.p046b.C1259k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class wpul extends C1265a implements C1258c {

    /* renamed from: hN */
    private static final String f4052hN = "wpul";

    /* renamed from: hU */
    private static WifiManager f4053hU = null;

    /* renamed from: hW */
    private static final String f4054hW;
    /* access modifiers changed from: private */

    /* renamed from: hY */
    public static final String f4055hY;

    /* renamed from: ic */
    private static final String f4056ic = "level";

    /* renamed from: id */
    private static final String f4057id = "level_local";

    /* renamed from: ie */
    private static final String f4058ie = "level_local_con";

    /* renamed from: if */
    private static final String f4059if = "level_local_ext";

    /* renamed from: ig */
    private static final String f4060ig = "ext_range";

    /* renamed from: ih */
    private static final long f4061ih = 600000;

    /* renamed from: hJ */
    private C1252j f4062hJ = null;

    /* renamed from: hS */
    private String f4063hS = null;
    /* access modifiers changed from: private */

    /* renamed from: hV */
    public WifiScanAvailable f4064hV;

    /* renamed from: hX */
    private boolean f4065hX = false;

    /* renamed from: hZ */
    private final String f4066hZ;

    /* renamed from: ia */
    private final String f4067ia;

    /* renamed from: ib */
    private final String f4068ib;

    /* renamed from: ii */
    private List<ScanResult> f4069ii;
    /* access modifiers changed from: private */

    /* renamed from: ij */
    public boolean f4070ij;

    private class LocationModel {

        /* renamed from: il */
        private double f4075il;

        /* renamed from: im */
        private double f4076im;

        public LocationModel(double d, double d2) {
            this.f4075il = d;
            this.f4076im = d2;
        }

        /* renamed from: bZ */
        public final double mo6032bZ() {
            return this.f4075il;
        }

        /* renamed from: ca */
        public final double mo6033ca() {
            return this.f4076im;
        }
    }

    private class WifiScanAvailable extends BroadcastReceiver {
        private WifiScanAvailable() {
        }

        public void onReceive(Context context, Intent intent) {
            try {
                C1247e.getContext().unregisterReceiver(wpul.this.f4064hV);
                if (!wpul.this.f4070ij) {
                    wpul.this.f4070ij = true;
                    C1249g.m5286ch().mo5955b(new Runnable() {
                        public void run() {
                            try {
                                wpul.m5509d(wpul.this);
                            } catch (Throwable unused) {
                                C1259k.m5337b(wpul.f4055hY, "false", C1246a.Boolean);
                            }
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f4052hN);
        sb.append("lcl");
        f4054hW = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f4052hN);
        sb2.append("DB_Semaphore");
        f4055hY = sb2.toString();
    }

    public wpul(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
        StringBuilder sb = new StringBuilder();
        sb.append(f4052hN);
        sb.append("_last_scan_results");
        this.f4066hZ = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f4052hN);
        sb2.append("_last_sent_scan_results");
        this.f4067ia = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f4052hN);
        sb3.append("_is_in_place");
        this.f4068ib = sb3.toString();
        this.f4070ij = false;
    }

    /* renamed from: bA */
    public final boolean mo5999bA() {
        if ((VERSION.SDK_INT != 23 || C1248f.m5280g(C1247e.getContext(), "android.permission.ACCESS_FINE_LOCATION")) && C1248f.m5280g(C1247e.getContext().getApplicationContext(), "android.permission.ACCESS_WIFI_STATE") && C1248f.m5280g(C1247e.getContext().getApplicationContext(), "android.permission.CHANGE_WIFI_STATE")) {
            return true;
        }
        return false;
    }

    @SuppressLint({"all"})
    /* renamed from: bx */
    public final void mo6007bx() {
        try {
            if (!mo5999bA()) {
                mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
                return;
            }
            Object a = C1259k.m5329a(f4055hY, C1246a.Boolean);
            if (a == null || !(a instanceof Boolean) || !((Boolean) a).booleanValue()) {
                C1259k.m5337b(f4055hY, "true", C1246a.Boolean);
                WifiManager wifiManager = (WifiManager) C1247e.getContext().getApplicationContext().getSystemService("wifi");
                f4053hU = wifiManager;
                if (!wifiManager.isWifiEnabled()) {
                    mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
                    return;
                }
                this.f4064hV = new WifiScanAvailable();
                C1247e.getContext().registerReceiver(this.f4064hV, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
                f4053hU.startScan();
                return;
            }
            mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5497b(Location location) {
        try {
            if (m5504bX()) {
                mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
                return;
            }
            m5510d(true);
            m5487a(location, this.f4069ii, false, false);
            if (location != null) {
                String str = f4054hW;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("Lat");
                C1259k.m5337b(sb.toString(), String.valueOf(location.getLatitude()), C1246a.Double);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("Long");
                C1259k.m5337b(sb2.toString(), String.valueOf(location.getLongitude()), C1246a.Double);
            }
            m5507c(m5512g(this.f4069ii));
            mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
        } catch (Throwable unused) {
            mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m5506c(Location location) {
        if (location != null) {
            try {
                LocationModel ao = m5494ao(f4054hW);
                LocationModel locationModel = new LocationModel(location.getLatitude(), location.getLongitude());
                if (!m5489a(locationModel, ao)) {
                    Set<String> an = m5493an(this.f4067ia);
                    Set g = m5512g(this.f4069ii);
                    m5487a(location, this.f4069ii, false, true);
                    if (an != null) {
                        for (String add : an) {
                            g.add(add);
                        }
                        m5507c(g);
                    }
                    mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
                    return;
                }
            } catch (Throwable unused) {
                mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
                return;
            }
        }
        m5510d(false);
        m5487a(location, this.f4069ii, true, false);
        mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
    }

    /* renamed from: bU */
    private static Boolean m5501bU() {
        try {
            Object a = C1259k.m5329a(dmstat.f4032hA, C1246a.Boolean);
            if (a != null && (a instanceof Boolean)) {
                return (Boolean) a;
            }
        } catch (Throwable unused) {
        }
        return Boolean.FALSE;
    }

    /* renamed from: bV */
    private void m5502bV() {
        try {
            this.f4069ii = f4053hU.getScanResults();
            if (this.f4069ii == null) {
                mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
                return;
            }
            boolean bX = m5504bX();
            int b = mo6004bt().mo5904b(f4057id, 70);
            if (C1251i.m5302ck().getBoolean(wfcn.f4049hR, false)) {
                if (bX) {
                    mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
                    return;
                }
                b = mo6004bt().mo5904b(f4058ie, 50);
            }
            if (bX) {
                b = mo6004bt().mo5904b(f4059if, 25);
            }
            ListIterator listIterator = this.f4069ii.listIterator();
            while (listIterator.hasNext()) {
                if (WifiManager.calculateSignalLevel(((ScanResult) listIterator.next()).level, 100) <= b) {
                    listIterator.remove();
                }
            }
            if (this.f4069ii.size() == 0) {
                mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
                return;
            }
            Set g = m5512g(this.f4069ii);
            if (bX) {
                if (!m5500b(g, this.f4067ia)) {
                    mo6008by();
                } else if (m5503bW()) {
                    Location cm = C1252j.m5317cm();
                    if (m5511d(cm)) {
                        C1252j jVar = new C1252j();
                        jVar.mo5974a((C1258c) this);
                        jVar.init();
                        return;
                    }
                    m5506c(cm);
                } else {
                    m5506c((Location) null);
                }
            } else if (m5501bU().booleanValue()) {
                mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
            } else {
                boolean a = m5492a(g, this.f4066hZ);
                C1259k.m5337b(this.f4066hZ, m5485a(g), C1246a.Set);
                if (a) {
                    if (m5503bW()) {
                        Location cm2 = C1252j.m5317cm();
                        if (m5511d(cm2)) {
                            C1252j jVar2 = new C1252j();
                            jVar2.mo5974a((C1258c) this);
                            jVar2.init();
                        } else {
                            m5497b(cm2);
                        }
                    } else {
                        m5497b((Location) null);
                    }
                    return;
                }
                mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
            }
        } catch (Throwable th) {
            C1259k.m5337b(f4055hY, "false", C1246a.Boolean);
            th.getMessage();
        }
    }

    /* renamed from: bW */
    private static boolean m5503bW() {
        try {
            if (!C1248f.m5280g(C1247e.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                return false;
            }
            return ((LocationManager) C1247e.getContext().getSystemService("location")).isProviderEnabled("gps");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: an */
    private static Set<String> m5493an(String str) {
        try {
            Object a = C1259k.m5329a(str, C1246a.Set);
            if (a != null) {
                if (a instanceof Set) {
                    return (Set) a;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m5485a(Set<String> set) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (String append : set) {
            sb.append(append);
            if (i != set.size()) {
                sb.append(",");
                i++;
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    private void m5499b(Set<String> set) {
        C1259k.m5337b(this.f4066hZ, m5485a(set), C1246a.Set);
    }

    /* renamed from: c */
    private void m5507c(Set<String> set) {
        C1259k.m5337b(this.f4067ia, m5485a(set), C1246a.Set);
    }

    /* renamed from: d */
    private void m5510d(boolean z) {
        C1259k.m5337b(this.f4068ib, String.valueOf(z), C1246a.Boolean);
    }

    /* access modifiers changed from: private */
    /* renamed from: bX */
    public boolean m5504bX() {
        try {
            Object a = C1259k.m5329a(this.f4068ib, C1246a.Boolean);
            if (a == null || !(a instanceof Boolean)) {
                return false;
            }
            return ((Boolean) a).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static void m5486a(Location location, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Lat");
        C1259k.m5337b(sb.toString(), String.valueOf(location.getLatitude()), C1246a.Double);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("Long");
        C1259k.m5337b(sb2.toString(), String.valueOf(location.getLongitude()), C1246a.Double);
    }

    /* renamed from: ao */
    private LocationModel m5494ao(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("Long");
            Object a = C1259k.m5329a(sb.toString(), C1246a.Double);
            if (a == null || !(a instanceof Double)) {
                return null;
            }
            double doubleValue = ((Double) a).doubleValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("Lat");
            Object a2 = C1259k.m5329a(sb2.toString(), C1246a.Double);
            if (a2 == null || !(a2 instanceof Double)) {
                return null;
            }
            LocationModel locationModel = new LocationModel(((Double) a2).doubleValue(), doubleValue);
            return locationModel;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static Set<String> m5512g(List<ScanResult> list) {
        if (list == null) {
            return null;
        }
        try {
            HashSet hashSet = new HashSet();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((ScanResult) list.get(i)).SSID;
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private boolean m5492a(Set<String> set, String str) {
        if (set != null) {
            try {
                if (set.size() != 0) {
                    Set an = m5493an(str);
                    if (an != null) {
                        if (an.size() != 0) {
                            int i = 0;
                            for (String trim : set) {
                                if (an.contains(trim.trim())) {
                                    i++;
                                }
                            }
                            if (i == 0 || ((double) (((float) i) / ((float) an.size()))) >= 0.75d) {
                                return true;
                            }
                            return false;
                        }
                    }
                    return false;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m5500b(Set<String> set, String str) {
        if (set != null) {
            try {
                if (set.size() != 0) {
                    Set an = m5493an(str);
                    if (an != null) {
                        if (an.size() != 0) {
                            int i = 0;
                            for (String trim : set) {
                                if (an.contains(trim.trim())) {
                                    i++;
                                }
                            }
                            if (i == 0 || ((double) (((float) i) / ((float) an.size()))) < 0.15d) {
                                return true;
                            }
                            return false;
                        }
                    }
                    return false;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m5487a(Location location, List<ScanResult> list, boolean z, boolean z2) {
        try {
            int b = mo6004bt().mo5904b(f4056ic, 6);
            JSONArray jSONArray = new JSONArray();
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (ScanResult scanResult : list) {
                    String b2 = m5496b(scanResult);
                    if (!hashSet.contains(b2) && WifiManager.calculateSignalLevel(scanResult.level, 100) >= b) {
                        hashSet.add(b2);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("bssid", scanResult.BSSID);
                        jSONObject.put("ssid", scanResult.SSID);
                        jSONObject.put("strength", scanResult.level);
                        if (VERSION.SDK_INT >= 17) {
                            jSONObject.put("age", (int) (((SystemClock.elapsedRealtime() * 1000) - scanResult.timestamp) / 1000000));
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
            this.f4063hS = m5484a(location, jSONArray, z, z2);
            mo6001bq();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: by */
    public final void mo6008by() {
        try {
            synchronized (this) {
                if (this.f4062hJ != null) {
                    this.f4062hJ.mo5974a((C1258c) null);
                    this.f4062hJ.mo5975cl();
                    this.f4062hJ = null;
                }
            }
        } catch (Throwable th) {
            C1259k.m5337b(f4055hY, "false", C1246a.Boolean);
            throw th;
        }
        C1259k.m5337b(f4055hY, "false", C1246a.Boolean);
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        if (TextUtils.isEmpty(this.f4063hS)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1230b(wpul.class.getSimpleName(), this.f4063hS, C1246a.JSONObject.getType()));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bB */
    public final C1246a mo6000bB() {
        return C1246a.JSONObject;
    }

    /* renamed from: a */
    private static String m5484a(Location location, JSONArray jSONArray, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            double d = 1000.1d;
            jSONObject.put(C1251i.f3980jC, location != null ? location.getLatitude() : 1000.1d);
            String str = "long";
            if (location != null) {
                d = location.getLongitude();
            }
            jSONObject.put(str, d);
            jSONObject.put("acc", location != null ? (int) location.getAccuracy() : 0);
            if (z2) {
                jSONObject.put("dnv", 1);
            }
            jSONObject.put("wl", jSONArray);
            jSONObject.put("wpxt", z ? 1 : 0);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    private static String m5496b(ScanResult scanResult) {
        try {
            C1250h.m5296ci();
            return C1250h.m5295ay(scanResult.BSSID);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    private boolean m5489a(LocationModel locationModel, LocationModel locationModel2) {
        if (locationModel2 == null) {
            return true;
        }
        try {
            float[] fArr = new float[3];
            int b = mo6004bt().mo5904b(f4060ig, C1245d.f3968jk);
            Location.distanceBetween(locationModel2.mo6032bZ(), locationModel2.mo6033ca(), locationModel.mo6032bZ(), locationModel.mo6033ca(), fArr);
            return Math.abs(fArr[0]) > ((float) b);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo5985a(final Location location) {
        try {
            if (!this.f4065hX) {
                this.f4065hX = true;
                if (this.f4062hJ != null) {
                    this.f4062hJ.mo5974a((C1258c) null);
                    this.f4062hJ.mo5975cl();
                    this.f4062hJ = null;
                }
                C1249g.m5286ch().mo5955b(new Runnable() {
                    public void run() {
                        try {
                            if (wpul.this.m5504bX()) {
                                wpul.this.m5506c(location);
                            } else {
                                wpul.this.m5497b(location);
                            }
                        } catch (Throwable unused) {
                            C1259k.m5337b(wpul.f4055hY, "false", C1246a.Boolean);
                        }
                    }
                });
            }
        } catch (Throwable unused) {
            C1259k.m5337b(f4055hY, "false", C1246a.Boolean);
        }
    }

    public final void onError(String str) {
        try {
            C1249g.m5286ch().mo5955b(new Runnable() {
                public void run() {
                    try {
                        if (wpul.this.m5504bX()) {
                            wpul.this.m5506c((Location) null);
                        } else {
                            wpul.this.m5497b((Location) null);
                        }
                    } catch (Throwable unused) {
                        C1259k.m5337b(wpul.f4055hY, "false", C1246a.Boolean);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public final String getKey() {
        return wpul.class.getSimpleName();
    }

    /* renamed from: d */
    private boolean m5511d(Location location) {
        return location == null || location.getAccuracy() > 70.0f || System.currentTimeMillis() - location.getTime() > mo6004bt().mo5902a("timeout", (long) f4061ih);
    }

    /* renamed from: d */
    static /* synthetic */ void m5509d(wpul wpul) {
        try {
            wpul.f4069ii = f4053hU.getScanResults();
            if (wpul.f4069ii == null) {
                wpul.mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
                return;
            }
            boolean bX = wpul.m5504bX();
            int b = wpul.mo6004bt().mo5904b(f4057id, 70);
            if (C1251i.m5302ck().getBoolean(wfcn.f4049hR, false)) {
                if (bX) {
                    wpul.mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
                    return;
                }
                b = wpul.mo6004bt().mo5904b(f4058ie, 50);
            }
            if (bX) {
                b = wpul.mo6004bt().mo5904b(f4059if, 25);
            }
            ListIterator listIterator = wpul.f4069ii.listIterator();
            while (listIterator.hasNext()) {
                if (WifiManager.calculateSignalLevel(((ScanResult) listIterator.next()).level, 100) <= b) {
                    listIterator.remove();
                }
            }
            if (wpul.f4069ii.size() == 0) {
                wpul.mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
                return;
            }
            Set g = m5512g(wpul.f4069ii);
            if (bX) {
                if (!wpul.m5500b(g, wpul.f4067ia)) {
                    wpul.mo6008by();
                } else if (m5503bW()) {
                    Location cm = C1252j.m5317cm();
                    if (wpul.m5511d(cm)) {
                        C1252j jVar = new C1252j();
                        jVar.mo5974a((C1258c) wpul);
                        jVar.init();
                        return;
                    }
                    wpul.m5506c(cm);
                } else {
                    wpul.m5506c((Location) null);
                }
            } else if (m5501bU().booleanValue()) {
                wpul.mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
            } else {
                boolean a = wpul.m5492a(g, wpul.f4066hZ);
                C1259k.m5337b(wpul.f4066hZ, m5485a(g), C1246a.Set);
                if (a) {
                    if (m5503bW()) {
                        Location cm2 = C1252j.m5317cm();
                        if (wpul.m5511d(cm2)) {
                            C1252j jVar2 = new C1252j();
                            jVar2.mo5974a((C1258c) wpul);
                            jVar2.init();
                        } else {
                            wpul.m5497b(cm2);
                        }
                    } else {
                        wpul.m5497b((Location) null);
                    }
                    return;
                }
                wpul.mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
            }
        } catch (Throwable th) {
            C1259k.m5337b(f4055hY, "false", C1246a.Boolean);
            th.getMessage();
        }
    }
}

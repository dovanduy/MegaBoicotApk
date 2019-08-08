package com.appnext.base.operations.imp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.base.C1222a;
import com.appnext.base.C1222a.C1223a;
import com.appnext.base.operations.C1265a;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1248f;
import com.appnext.base.p046b.C1249g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class wfpx extends C1265a {
    /* access modifiers changed from: private */

    /* renamed from: hS */
    public String f4050hS;
    /* access modifiers changed from: private */
    public Context mContext = C1247e.getContext();

    /* renamed from: by */
    public final void mo6008by() {
    }

    public wfpx(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: bx */
    public final void mo6007bx() {
        try {
            if (!mo5999bA()) {
                mo5996a(new C1222a(C1223a.NoPermission$1d8b5b4a));
            } else {
                C1249g.m5286ch().mo5955b(new Runnable() {
                    public void run() {
                        try {
                            WifiManager wifiManager = (WifiManager) wfpx.this.mContext.getApplicationContext().getSystemService("wifi");
                            if (!wfpx.this.mo5999bA() || !wifiManager.isWifiEnabled()) {
                                wfpx.this.f4050hS = null;
                            } else {
                                List<ScanResult> scanResults = wifiManager.getScanResults();
                                if (scanResults == null || scanResults.isEmpty()) {
                                    wfpx.this.f4050hS = null;
                                } else {
                                    HashSet hashSet = new HashSet();
                                    JSONArray jSONArray = new JSONArray();
                                    for (ScanResult scanResult : scanResults) {
                                        String a = wfpx.this.mo6026a(scanResult);
                                        int calculateSignalLevel = WifiManager.calculateSignalLevel(scanResult.level, 100);
                                        if (!hashSet.contains(a) && wfpx.this.mo6028h(calculateSignalLevel).booleanValue()) {
                                            hashSet.add(a);
                                            jSONArray.put(wfpx.this.mo6027am(a));
                                        }
                                    }
                                    if (jSONArray.length() == 0) {
                                        wfpx.this.f4050hS = null;
                                    }
                                    wfpx.this.f4050hS = jSONArray.toString();
                                }
                            }
                            wfpx.this.mo6001bq();
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        } catch (Throwable unused) {
            this.f4050hS = null;
        }
    }

    /* access modifiers changed from: protected */
    public String getKey() {
        return wfpx.class.getSimpleName();
    }

    /* renamed from: bA */
    public final boolean mo5999bA() {
        if (VERSION.SDK_INT != 23 || C1248f.m5280g(C1247e.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
            return C1248f.m5280g(this.mContext.getApplicationContext(), "android.permission.ACCESS_WIFI_STATE");
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bB */
    public final C1246a mo6000bB() {
        return C1246a.JSONArray;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo6026a(ScanResult scanResult) {
        return scanResult.SSID;
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public Object mo6027am(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ssid", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Boolean mo6028h(int i) {
        return Boolean.TRUE;
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        if (TextUtils.isEmpty(this.f4050hS)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1230b(mo6004bt().getKey(), this.f4050hS, C1246a.JSONArray.getType()));
        return arrayList;
    }
}

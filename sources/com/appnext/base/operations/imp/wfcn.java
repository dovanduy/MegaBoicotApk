package com.appnext.base.operations.imp;

import android.annotation.SuppressLint;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1248f;
import com.appnext.base.p046b.C1251i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class wfcn extends C1269d {
    private static String TAG = "wfcn";

    /* renamed from: hP */
    private static final String f4047hP = "<unknown ssid>";

    /* renamed from: hQ */
    private static final String f4048hQ = "LAST_WIFI_CONNECTION";

    /* renamed from: hR */
    public static String f4049hR;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append("isConnected");
        f4049hR = sb.toString();
    }

    public wfcn(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"MissingPermission"})
    public List<C1230b> getData() {
        try {
            if (!mo5999bA()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            NetworkInfo j = C1248f.m5283j(C1247e.getContext());
            if (j != null && j.isConnected()) {
                if (j.getTypeName().equals("WIFI")) {
                    String ssid = ((WifiManager) C1247e.getContext().getApplicationContext().getSystemService("wifi")).getConnectionInfo().getSSID();
                    if (!TextUtils.isEmpty(ssid) && !ssid.equals(f4047hP)) {
                        String replace = ssid.replace("\"", "");
                        C1251i.m5302ck().putString(f4048hQ, replace);
                        arrayList.add(new C1230b(TAG, m5469a(Boolean.TRUE, replace), C1246a.JSONArray.getType()));
                        C1251i.m5302ck().getBoolean(f4049hR, true);
                    }
                } else {
                    arrayList.add(new C1230b(TAG, m5469a(Boolean.FALSE, C1251i.m5302ck().getString(f4048hQ, "No previews data")), C1246a.JSONArray.getType()));
                    C1251i.m5302ck().getBoolean(f4049hR, false);
                }
                if (mo6012e(arrayList)) {
                    return arrayList;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return wfcn.class.getSimpleName();
    }

    /* renamed from: bA */
    public final boolean mo5999bA() {
        return C1248f.m5280g(C1247e.getContext().getApplicationContext(), "android.permission.ACCESS_NETWORK_STATE") && C1248f.m5280g(C1247e.getContext().getApplicationContext(), "android.permission.ACCESS_WIFI_STATE");
    }

    /* renamed from: a */
    private static String m5469a(Boolean bool, String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("connected", bool);
            jSONObject.put("name", str);
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONArray.toString();
    }
}

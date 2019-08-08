package com.appnext.base.operations.imp;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
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
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class bcon extends C1269d {
    private static final String KEY = "bcon";

    /* renamed from: hs */
    private static final String f4024hs = "lastPairedDevice";

    public bcon(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"MissingPermission"})
    public List<C1230b> getData() {
        String str;
        ArrayList arrayList;
        Set bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
        String string = C1251i.m5302ck().getString(f4024hs, null);
        Iterator it = bondedDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) it.next();
            if (bluetoothDevice.getBondState() == 12) {
                str = bluetoothDevice.getName();
                break;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList = new ArrayList();
            if (!TextUtils.isEmpty(string) && !string.equals(str)) {
                arrayList.add(new C1230b(KEY, m5405a(Boolean.FALSE, string), C1246a.JSONArray.getType()));
            }
            arrayList.add(new C1230b(KEY, m5405a(Boolean.TRUE, str), C1246a.JSONArray.getType()));
        } else if (!TextUtils.isEmpty(string)) {
            arrayList = new ArrayList();
            arrayList.add(new C1230b(KEY, m5405a(Boolean.FALSE, string), C1246a.JSONArray.getType()));
        } else {
            arrayList = null;
        }
        if (str == null) {
            C1251i.m5302ck().putString(f4024hs, "");
        } else {
            C1251i.m5302ck().putString(f4024hs, str);
        }
        if (arrayList == null || !mo6012e(arrayList)) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: a */
    private static String m5405a(Boolean bool, String str) {
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

    /* renamed from: bA */
    public final boolean mo5999bA() {
        return C1248f.m5280g(C1247e.getContext(), "android.permission.BLUETOOTH");
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return bcon.class.getSimpleName();
    }
}

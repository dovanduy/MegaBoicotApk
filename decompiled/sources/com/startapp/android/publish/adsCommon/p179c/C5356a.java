package com.startapp.android.publish.adsCommon.p179c;

import android.bluetooth.BluetoothDevice;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.startapp.android.publish.adsCommon.c.a */
/* compiled from: StartAppSDK */
public class C5356a {

    /* renamed from: a */
    private Set<BluetoothDevice> f17175a;

    /* renamed from: b */
    private Set<BluetoothDevice> f17176b;

    /* renamed from: a */
    public void mo19813a(BluetoothDevice bluetoothDevice) {
        if (this.f17176b == null) {
            this.f17176b = new HashSet();
        }
        this.f17176b.add(bluetoothDevice);
    }

    /* renamed from: a */
    public void mo19814a(Set<BluetoothDevice> set) {
        this.f17175a = set;
    }

    /* renamed from: a */
    public JSONObject mo19812a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f17175a != null && this.f17175a.size() > 0) {
                jSONObject.put("paired", m22896b(this.f17175a));
            }
            if (this.f17176b != null && this.f17176b.size() > 0) {
                jSONObject.put("available", m22896b(this.f17176b));
            }
        } catch (Exception unused) {
        }
        if (jSONObject.length() > 0) {
            return jSONObject;
        }
        return null;
    }

    /* renamed from: b */
    private JSONArray m22896b(Set<BluetoothDevice> set) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (BluetoothDevice bluetoothDevice : set) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bluetoothClass", bluetoothDevice.getBluetoothClass().getDeviceClass());
                jSONObject.put("name", bluetoothDevice.getName());
                jSONObject.put("mac", bluetoothDevice.getAddress());
                jSONObject.put("bondState", bluetoothDevice.getBondState());
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (Exception unused) {
            return null;
        }
    }
}

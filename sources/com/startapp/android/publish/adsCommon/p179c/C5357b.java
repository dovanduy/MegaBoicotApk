package com.startapp.android.publish.adsCommon.p179c;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.startapp.common.C5549d;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.startapp.android.publish.adsCommon.c.b */
/* compiled from: StartAppSDK */
public class C5357b {

    /* renamed from: a */
    protected Context f17177a;

    /* renamed from: b */
    protected C5549d f17178b;

    /* renamed from: c */
    protected C5356a f17179c = new C5356a();

    /* renamed from: d */
    protected BluetoothAdapter f17180d = m22901d();

    /* renamed from: e */
    protected BroadcastReceiver f17181e;

    public C5357b(Context context, C5549d dVar) {
        this.f17177a = context;
        this.f17178b = dVar;
    }

    /* renamed from: a */
    public void mo19816a(boolean z) {
        if (this.f17180d == null || !this.f17180d.isEnabled()) {
            this.f17178b.mo19942a(null);
            return;
        }
        this.f17179c.mo19814a(m22900c());
        if (!z || !C5509c.m23516a(this.f17177a, "android.permission.BLUETOOTH_ADMIN")) {
            this.f17178b.mo19942a(mo19817b());
        } else {
            IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.FOUND");
            this.f17181e = m22902e();
            try {
                this.f17177a.registerReceiver(this.f17181e, intentFilter);
                this.f17180d.startDiscovery();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("BluetoothManager - start() ");
                sb.append(e.getMessage());
                C5518g.m23561a(3, sb.toString());
                this.f17180d.cancelDiscovery();
                this.f17178b.mo19942a(mo19817b());
            }
        }
    }

    /* renamed from: a */
    public void mo19815a() {
        if (C5509c.m23516a(this.f17177a, "android.permission.BLUETOOTH_ADMIN") && this.f17181e != null && this.f17180d != null) {
            this.f17180d.cancelDiscovery();
            try {
                this.f17177a.unregisterReceiver(this.f17181e);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("BluetoothManager - stop() ");
                sb.append(e.getMessage());
                C5518g.m23561a(3, sb.toString());
            }
            this.f17181e = null;
        }
    }

    /* renamed from: c */
    private Set<BluetoothDevice> m22900c() {
        HashSet hashSet = new HashSet();
        try {
            if (C5509c.m23516a(this.f17177a, "android.permission.BLUETOOTH") && this.f17180d.isEnabled()) {
                return this.f17180d.getBondedDevices();
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to get devices ");
            sb.append(e.getMessage());
            C5518g.m23561a(6, sb.toString());
        }
        return hashSet;
    }

    /* renamed from: d */
    private BluetoothAdapter m22901d() {
        if (C5509c.m23516a(this.f17177a, "android.permission.BLUETOOTH")) {
            return BluetoothAdapter.getDefaultAdapter();
        }
        return null;
    }

    /* renamed from: e */
    private BroadcastReceiver m22902e() {
        return new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.bluetooth.device.action.FOUND".equals(action)) {
                    C5357b.this.f17179c.mo19813a((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE"));
                } else if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
                    C5357b.this.mo19815a();
                    C5357b.this.f17178b.mo19942a(C5357b.this.mo19817b());
                }
            }
        };
    }

    /* renamed from: b */
    public JSONObject mo19817b() {
        try {
            return this.f17179c.mo19812a();
        } catch (Exception unused) {
            return null;
        }
    }
}

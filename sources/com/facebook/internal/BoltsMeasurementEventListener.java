package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p017v4.content.C0362f;
import com.facebook.appevents.C2436g;

public class BoltsMeasurementEventListener extends BroadcastReceiver {

    /* renamed from: a */
    private static BoltsMeasurementEventListener f7789a;

    /* renamed from: b */
    private Context f7790b;

    private BoltsMeasurementEventListener(Context context) {
        this.f7790b = context.getApplicationContext();
    }

    /* renamed from: a */
    private void m9403a() {
        C0362f.m1362a(this.f7790b).mo1251a(this, new IntentFilter("com.parse.bolts.measurement_event"));
    }

    /* renamed from: b */
    private void m9404b() {
        C0362f.m1362a(this.f7790b).mo1250a((BroadcastReceiver) this);
    }

    /* renamed from: a */
    public static BoltsMeasurementEventListener m9402a(Context context) {
        if (f7789a != null) {
            return f7789a;
        }
        f7789a = new BoltsMeasurementEventListener(context);
        f7789a.m9403a();
        return f7789a;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            m9404b();
        } finally {
            super.finalize();
        }
    }

    public void onReceive(Context context, Intent intent) {
        C2436g a = C2436g.m9318a(context);
        StringBuilder sb = new StringBuilder();
        sb.append("bf_");
        sb.append(intent.getStringExtra("event_name"));
        String sb2 = sb.toString();
        Bundle bundleExtra = intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        for (String str : bundleExtra.keySet()) {
            bundle.putString(str.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String) bundleExtra.get(str));
        }
        a.mo8854a(sb2, bundle);
    }
}

package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zabq extends BroadcastReceiver {

    /* renamed from: a */
    private Context f9830a;

    /* renamed from: b */
    private final C3312bg f9831b;

    public zabq(C3312bg bgVar) {
        this.f9831b = bgVar;
    }

    /* renamed from: a */
    public final void mo13373a(Context context) {
        this.f9830a = context;
    }

    /* renamed from: a */
    public final synchronized void mo13372a() {
        if (this.f9830a != null) {
            this.f9830a.unregisterReceiver(this);
        }
        this.f9830a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f9831b.mo13206a();
            mo13372a();
        }
    }
}

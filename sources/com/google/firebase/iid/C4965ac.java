package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import javax.annotation.Nullable;

/* renamed from: com.google.firebase.iid.ac */
final class C4965ac extends BroadcastReceiver {
    @Nullable

    /* renamed from: a */
    private C4964ab f16180a;

    public C4965ac(C4964ab abVar) {
        this.f16180a = abVar;
    }

    /* renamed from: a */
    public final void mo17909a() {
        if (FirebaseInstanceId.m21585g()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f16180a.mo17906a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f16180a != null && this.f16180a.mo17907b()) {
            if (FirebaseInstanceId.m21585g()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.m21580a((Runnable) this.f16180a, 0);
            this.f16180a.mo17906a().unregisterReceiver(this);
            this.f16180a = null;
        }
    }
}

package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

@Deprecated
public class FirebaseInstanceIdService extends zzb {
    @Deprecated
    /* renamed from: a */
    public void mo17902a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Intent mo17901a(Intent intent) {
        return (Intent) C5013y.m21739a().f16278a.poll();
    }

    /* renamed from: b */
    public final void mo17903b(Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            mo17902a();
            return;
        }
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder sb = new StringBuilder(21 + String.valueOf(stringExtra).length() + String.valueOf(valueOf).length());
                sb.append("Received command: ");
                sb.append(stringExtra);
                sb.append(" - ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.m21578a().mo17894h();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId.m21578a().mo17898l();
            }
        }
    }
}

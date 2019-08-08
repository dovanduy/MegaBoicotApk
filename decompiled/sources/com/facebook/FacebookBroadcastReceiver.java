package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.C2566x;

public class FacebookBroadcastReceiver extends BroadcastReceiver {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6645a(String str, String str2, Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6646b(String str, String str2, Bundle bundle) {
    }

    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        String stringExtra2 = intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
        if (stringExtra != null && stringExtra2 != null) {
            Bundle extras = intent.getExtras();
            if (C2566x.m9763f(intent)) {
                mo6646b(stringExtra, stringExtra2, extras);
            } else {
                mo6645a(stringExtra, stringExtra2, extras);
            }
        }
    }
}

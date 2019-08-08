package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.firebase.iid.ag */
final /* synthetic */ class C4969ag implements Runnable {

    /* renamed from: a */
    private final C4968af f16191a;

    /* renamed from: b */
    private final Intent f16192b;

    C4969ag(C4968af afVar, Intent intent) {
        this.f16191a = afVar;
        this.f16192b = intent;
    }

    public final void run() {
        C4968af afVar = this.f16191a;
        String action = this.f16192b.getAction();
        StringBuilder sb = new StringBuilder(61 + String.valueOf(action).length());
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("EnhancedIntentService", sb.toString());
        afVar.mo17914a();
    }
}

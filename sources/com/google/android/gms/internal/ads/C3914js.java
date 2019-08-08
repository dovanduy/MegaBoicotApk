package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.js */
final class C3914js extends BroadcastReceiver {

    /* renamed from: a */
    private final /* synthetic */ C3909jn f13426a;

    private C3914js(C3909jn jnVar) {
        this.f13426a = jnVar;
    }

    /* synthetic */ C3914js(C3909jn jnVar, C3910jo joVar) {
        this(jnVar);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f13426a.f13413c = true;
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f13426a.f13413c = false;
        }
    }
}

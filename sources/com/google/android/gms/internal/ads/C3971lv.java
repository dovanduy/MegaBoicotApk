package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.lv */
public final class C3971lv {
    @GuardedBy("this")

    /* renamed from: a */
    private final BroadcastReceiver f13523a = new C3972lw(this);
    @GuardedBy("this")

    /* renamed from: b */
    private final Map<BroadcastReceiver, IntentFilter> f13524b = new WeakHashMap();

    /* renamed from: c */
    private boolean f13525c = false;

    /* renamed from: d */
    private boolean f13526d;

    /* renamed from: e */
    private Context f13527e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final synchronized void m17354a(Context context, Intent intent) {
        for (Entry entry : this.f13524b.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                ((BroadcastReceiver) entry.getKey()).onReceive(context, intent);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo15613a(Context context) {
        if (!this.f13525c) {
            this.f13527e = context.getApplicationContext();
            if (this.f13527e == null) {
                this.f13527e = context;
            }
            aru.m15024a(this.f13527e);
            this.f13526d = ((Boolean) aoq.m14620f().mo14695a(aru.f11915ch)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f13527e.registerReceiver(this.f13523a, intentFilter);
            this.f13525c = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo15614a(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f13526d) {
            this.f13524b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* renamed from: a */
    public final synchronized void mo15615a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f13526d) {
            this.f13524b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}

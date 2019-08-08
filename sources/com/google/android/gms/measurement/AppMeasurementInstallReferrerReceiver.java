package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C4754am;
import com.google.android.gms.measurement.internal.C4757ap;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements C4757ap {

    /* renamed from: a */
    private C4754am f15365a;

    /* renamed from: a */
    public final void mo17120a(Context context, Intent intent) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f15365a == null) {
            this.f15365a = new C4754am(this);
        }
        this.f15365a.mo17199a(context, intent);
    }

    /* renamed from: a */
    public final PendingResult mo17119a() {
        return goAsync();
    }
}

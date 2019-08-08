package com.google.android.gms.measurement;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.support.p017v4.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.C4754am;
import com.google.android.gms.measurement.internal.C4757ap;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements C4757ap {

    /* renamed from: a */
    private C4754am f15367a;

    public final void onReceive(Context context, Intent intent) {
        if (this.f15367a == null) {
            this.f15367a = new C4754am(this);
        }
        this.f15367a.mo17199a(context, intent);
    }

    /* renamed from: a */
    public final void mo17120a(Context context, Intent intent) {
        m1235a_(context, intent);
    }

    /* renamed from: a */
    public final PendingResult mo17119a() {
        return goAsync();
    }
}

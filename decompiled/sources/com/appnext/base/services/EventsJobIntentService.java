package com.appnext.base.services;

import android.content.Context;
import android.content.Intent;
import android.support.p017v4.app.JobIntentService;
import com.appnext.base.p046b.C1245d;
import com.appnext.base.services.p047a.C1283c;

public class EventsJobIntentService extends JobIntentService {
    public static void enqueueWork(Context context, int i, Intent intent) {
        try {
            enqueueWork(context, EventsJobIntentService.class, i, intent);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleWork(Intent intent) {
        try {
            new C1284b().mo6050a(this, intent.getStringExtra(C1245d.f3950iS), null, intent.getBundleExtra(C1283c.f4087iv), (Intent) intent.clone(), null);
        } catch (Throwable unused) {
        }
    }
}

package com.appnext.base.services;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.appnext.base.p046b.C1245d;
import com.appnext.base.services.p047a.C1283c;

public class OperationService extends IntentService {
    public OperationService() {
        super(OperationService.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(C1245d.f3950iS);
            Bundle bundleExtra = intent.getBundleExtra(C1283c.f4087iv);
            new C1284b().mo6050a(getApplicationContext(), stringExtra, null, bundleExtra, (Intent) intent.clone(), null);
        } catch (Throwable unused) {
        }
    }
}

package com.startapp.android.publish.common.metaData;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.startapp.common.p194b.C5527a;
import com.startapp.common.p194b.p195a.C5533b.C5534a;
import com.startapp.common.p194b.p195a.C5533b.C5535b;

/* compiled from: StartAppSDK */
public class InfoEventService extends Service {

    /* renamed from: a */
    private static final String f17444a = "InfoEventService";

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C5527a.m23595a((Context) this);
        boolean a = C5527a.m23607a(intent, (C5535b) new C5535b() {
            /* renamed from: a */
            public void mo20155a(C5534a aVar) {
                InfoEventService.this.stopSelf();
            }
        });
        String str = f17444a;
        StringBuilder sb = new StringBuilder();
        sb.append("onHandleIntent: RunnerManager.runJob");
        sb.append(a);
        C5527a.m23600a(3, str, sb.toString(), (Throwable) null);
        return super.onStartCommand(intent, i, i2);
    }
}

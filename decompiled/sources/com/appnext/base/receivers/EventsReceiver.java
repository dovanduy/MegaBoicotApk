package com.appnext.base.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.appnext.base.operations.imp.dmstat;
import com.appnext.base.p046b.C1245d;
import com.appnext.base.services.EventsJobIntentService;

public class EventsReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            if (intent.getAction().equals(dmstat.f4033hB)) {
                String stringExtra = intent.getStringExtra(C1245d.f3950iS);
                if (!TextUtils.isEmpty(stringExtra)) {
                    EventsJobIntentService.enqueueWork(context, stringExtra.hashCode(), intent);
                }
            }
        } catch (Throwable unused) {
        }
    }
}

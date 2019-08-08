package com.appnext.base.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appnext.base.operations.imp.scdle;
import com.appnext.base.p042a.C1224a;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1249g;
import com.appnext.base.services.p048b.C1285a;

public class AppnextBootReciever extends BroadcastReceiver {
    public void onReceive(final Context context, Intent intent) {
        try {
            C1247e.init(context);
            if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
                C1249g.m5286ch().mo5955b(new Runnable() {
                    public final void run() {
                        try {
                            String simpleName = scdle.class.getSimpleName();
                            String str = C1245d.f3956iY;
                            StringBuilder sb = new StringBuilder();
                            sb.append(simpleName);
                            sb.append(System.currentTimeMillis());
                            C1231c cVar = new C1231c("on", "", "", "1", str, simpleName, sb.toString(), null);
                            C1224a.m5161aN().mo5888aR().mo5926a(cVar);
                            C1285a.m5550g(context).mo6051a(cVar, true);
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }
}

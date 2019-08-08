package com.facebook.ads.internal.ipc;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.facebook.ads.internal.p078e.C1708a;
import com.facebook.ads.internal.p087n.C1767a;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.settings.AdInternalSettings;

public class AdsMessengerService extends Service {

    /* renamed from: a */
    private Messenger f5429a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f5430b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ServiceConnection f5431c = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AdsMessengerService.this.f5430b = true;
        }

        public void onServiceDisconnected(ComponentName componentName) {
            AdsMessengerService.this.f5430b = false;
            AdsMessengerService.this.unbindService(AdsMessengerService.this.f5431c);
        }
    };

    /* renamed from: com.facebook.ads.internal.ipc.AdsMessengerService$a */
    public static class C1738a extends Handler {

        /* renamed from: a */
        private final C1739a f5433a;

        private C1738a(Context context) {
            this.f5433a = new C1739a(context);
        }

        public void handleMessage(Message message) {
            String string = message.getData().getString("STR_AD_ID_KEY");
            switch (message.what) {
                case 1:
                    C1708a.m7114a().mo7461a(string, message.replyTo);
                    break;
                case 2:
                    C1708a.m7114a().mo7465d(string);
                    return;
                default:
                    if (!this.f5433a.mo7525a(message)) {
                        super.handleMessage(message);
                        return;
                    }
                    break;
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f5429a.getBinder();
    }

    public void onCreate() {
        AdInternalSettings.f5734d = true;
        C1767a.m7337a(this);
        C1767a.m7338b(this);
        this.f5429a = new Messenger(new C1738a(getApplicationContext()));
        if (C1795a.m7431Y(getApplicationContext())) {
            bindService(new Intent(getApplicationContext(), AdsProcessPriorityService.class), this.f5431c, 1);
        }
    }

    public void onDestroy() {
        C1708a.m7114a().mo7462b();
        if (this.f5430b) {
            unbindService(this.f5431c);
        }
    }
}

package com.facebook.ads.internal.p075c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.ads.internal.ipc.AdsMessengerService;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.internal.c.h */
public class C1699h extends Handler {

    /* renamed from: a */
    Messenger f5304a;

    /* renamed from: b */
    boolean f5305b;

    /* renamed from: c */
    boolean f5306c;

    /* renamed from: d */
    private final Context f5307d;

    /* renamed from: e */
    private final Messenger f5308e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1686b f5309f;

    /* renamed from: g */
    private ServiceConnection f5310g = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1699h.this.f5304a = new Messenger(iBinder);
            C1699h.this.mo7426a("Attached.");
            try {
                C1699h.this.mo7425a(C1699h.this.f5304a, 1, null);
                if (C1699h.this.f5306c) {
                    C1699h.this.f5306c = false;
                    C1699h.this.f5309f.mo7401b();
                }
            } catch (RemoteException unused) {
                C1699h.m7072b(C1699h.this);
            }
            C1699h.this.mo7426a("Remote service connected.");
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C1699h.this.mo7426a("Disconnected.");
            if (C1699h.this.f5305b) {
                C1699h.m7072b(C1699h.this);
            }
        }
    };

    C1699h(Context context, C1686b bVar) {
        super(Looper.getMainLooper());
        this.f5307d = context;
        this.f5308e = new Messenger(this);
        this.f5309f = bVar;
    }

    /* renamed from: b */
    static /* synthetic */ void m7072b(C1699h hVar) {
        hVar.f5304a = null;
        hVar.mo7427b();
        hVar.f5309f.mo7398a(10, AdErrorType.REMOTE_ADS_SERVICE_ERROR, (String) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7424a() {
        this.f5305b = this.f5307d.bindService(new Intent(this.f5307d, AdsMessengerService.class), this.f5310g, 1);
        if (this.f5305b) {
            mo7426a("Binding.");
            return;
        }
        C2370a.m9146a(this.f5307d, "ipc", C2373b.f7494ab, new Exception("Context.bind() returned false."));
        this.f5306c = false;
        mo7426a("Can't bind to service. Use internal.");
        this.f5309f.mo7402c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7425a(Messenger messenger, int i, Bundle bundle) {
        Message obtain = Message.obtain(null, i);
        obtain.replyTo = this.f5308e;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        obtain.getData().putString("STR_AD_ID_KEY", this.f5309f.f5271c);
        messenger.send(obtain);
    }

    /* renamed from: a */
    public void mo7426a(String str) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7427b() {
        if (this.f5305b) {
            if (this.f5304a != null) {
                try {
                    mo7425a(this.f5304a, 2, null);
                } catch (RemoteException unused) {
                }
            }
            this.f5305b = false;
            this.f5307d.unbindService(this.f5310g);
            mo7426a("Unbinding.");
        }
    }

    public void handleMessage(Message message) {
        if (message.what == 3) {
            mo7426a("Received check alive.");
            return;
        }
        String string = message.getData().getString("STR_AD_ID_KEY");
        StringBuilder sb = new StringBuilder();
        sb.append("Received message ");
        sb.append(message.what);
        sb.append(" for Ad: ");
        sb.append(string);
        mo7426a(sb.toString());
        if (this.f5309f.f5271c.equals(string)) {
            this.f5309f.mo7399a(message);
        }
    }
}

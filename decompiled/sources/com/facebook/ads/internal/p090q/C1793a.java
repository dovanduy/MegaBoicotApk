package com.facebook.ads.internal.p090q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;

/* renamed from: com.facebook.ads.internal.q.a */
public class C1793a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f5643a;

    /* renamed from: b */
    private final String f5644b;

    /* renamed from: c */
    private final String f5645c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f5646d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Messenger f5647e;

    /* renamed from: f */
    private final ServiceConnection f5648f = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1793a.this.f5646d = true;
            C1793a.this.f5647e = new Messenger(iBinder);
            Message obtain = Message.obtain(null, 1);
            obtain.setData(C1793a.m7401a(C1793a.this));
            try {
                C1793a.this.f5647e.send(obtain);
            } catch (RemoteException e) {
                C2370a.m9149b(C1793a.this.f5643a, "generic", C2373b.f7523y, e);
            }
            C1793a.this.f5643a.unbindService(this);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            try {
                C1793a.this.f5643a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
            C1793a.this.f5647e = null;
            C1793a.this.f5646d = false;
        }
    };

    public C1793a(Context context, String str, String str2) {
        this.f5643a = context;
        this.f5644b = str;
        this.f5645c = str2;
    }

    /* renamed from: a */
    static /* synthetic */ Bundle m7401a(C1793a aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("PARAM_PROTOCOL_VERSION", 1);
        bundle.putString("PARAM_AN_UUID", aVar.f5645c);
        bundle.putString("PARAM_REQUEST_ID", aVar.f5644b);
        return bundle;
    }

    /* renamed from: a */
    public void mo7648a() {
        Intent intent = new Intent();
        intent.setClassName("com.facebook.katana", "com.facebook.audiencenetwork.AudienceNetworkService");
        try {
            if (!this.f5643a.bindService(intent, this.f5648f, 1)) {
                this.f5643a.unbindService(this.f5648f);
            }
        } catch (Exception e) {
            C2370a.m9149b(this.f5643a, "generic", C2373b.f7524z, e);
        }
    }
}

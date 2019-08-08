package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.facebook.internal.y */
/* compiled from: PlatformServiceClient */
public abstract class C2575y implements ServiceConnection {

    /* renamed from: a */
    private final Context f8033a;

    /* renamed from: b */
    private final Handler f8034b;

    /* renamed from: c */
    private C2577a f8035c;

    /* renamed from: d */
    private boolean f8036d;

    /* renamed from: e */
    private Messenger f8037e;

    /* renamed from: f */
    private int f8038f;

    /* renamed from: g */
    private int f8039g;

    /* renamed from: h */
    private final String f8040h;

    /* renamed from: i */
    private final int f8041i;

    /* renamed from: com.facebook.internal.y$a */
    /* compiled from: PlatformServiceClient */
    public interface C2577a {
        /* renamed from: a */
        void mo9090a(Bundle bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9082a(Bundle bundle);

    public C2575y(Context context, int i, int i2, int i3, String str) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.f8033a = context;
        this.f8038f = i;
        this.f8039g = i2;
        this.f8040h = str;
        this.f8041i = i3;
        this.f8034b = new Handler() {
            public void handleMessage(Message message) {
                C2575y.this.mo9083a(message);
            }
        };
    }

    /* renamed from: a */
    public void mo9084a(C2577a aVar) {
        this.f8035c = aVar;
    }

    /* renamed from: a */
    public boolean mo9085a() {
        if (this.f8036d || C2566x.m9749b(this.f8041i) == -1) {
            return false;
        }
        Intent a = C2566x.m9739a(this.f8033a);
        if (a == null) {
            return false;
        }
        this.f8036d = true;
        this.f8033a.bindService(a, this, 1);
        return true;
    }

    /* renamed from: b */
    public void mo9086b() {
        this.f8036d = false;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f8037e = new Messenger(iBinder);
        m9785c();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f8037e = null;
        try {
            this.f8033a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m9784b(null);
    }

    /* renamed from: c */
    private void m9785c() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f8040h);
        mo9082a(bundle);
        Message obtain = Message.obtain(null, this.f8038f);
        obtain.arg1 = this.f8041i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f8034b);
        try {
            this.f8037e.send(obtain);
        } catch (RemoteException unused) {
            m9784b(null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9083a(Message message) {
        if (message.what == this.f8039g) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                m9784b(null);
            } else {
                m9784b(data);
            }
            try {
                this.f8033a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: b */
    private void m9784b(Bundle bundle) {
        if (this.f8036d) {
            this.f8036d = false;
            C2577a aVar = this.f8035c;
            if (aVar != null) {
                aVar.mo9090a(bundle);
            }
        }
    }
}

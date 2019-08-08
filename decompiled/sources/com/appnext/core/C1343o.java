package com.appnext.core;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

/* renamed from: com.appnext.core.o */
public abstract class C1343o {
    private ServiceConnection mConnection = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1343o.this.mMessenger = new Messenger(iBinder);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            C1343o.this.mMessenger = null;
        }
    };
    /* access modifiers changed from: private */
    public Messenger mMessenger;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5408a(Intent intent);

    /* renamed from: A */
    public final void mo6272A(Context context) {
        Intent intent = new Intent(context, mo6273x());
        mo5408a(intent);
        try {
            context.bindService(intent, this.mConnection, 1);
            Message obtain = Message.obtain(null, AdsService.ADD_PACK, 0, 0);
            obtain.setData(intent.getExtras());
            this.mMessenger.send(obtain);
        } catch (Throwable unused) {
            context.startService(intent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Class<?> mo6273x() {
        return AdsService.class;
    }

    /* renamed from: d */
    public void mo5410d(Context context) {
        try {
            context.unbindService(this.mConnection);
            this.mMessenger = null;
            this.mConnection = null;
        } catch (Throwable unused) {
        }
    }
}

package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.p017v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import com.google.android.gms.common.util.p142a.C3547b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class zzb extends Service {

    /* renamed from: a */
    final ExecutorService f16286a;

    /* renamed from: b */
    private Binder f16287b;

    /* renamed from: c */
    private final Object f16288c;

    /* renamed from: d */
    private int f16289d;

    /* renamed from: e */
    private int f16290e;

    public zzb() {
        String str = "Firebase-";
        String valueOf = String.valueOf(getClass().getSimpleName());
        this.f16286a = Executors.newSingleThreadExecutor(new C3547b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)));
        this.f16288c = new Object();
        this.f16290e = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent mo17901a(Intent intent) {
        return intent;
    }

    /* renamed from: b */
    public abstract void mo17903b(Intent intent);

    /* renamed from: c */
    public boolean mo17980c(Intent intent) {
        return false;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f16287b == null) {
            this.f16287b = new C4970ah(this);
        }
        return this.f16287b;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f16288c) {
            this.f16289d = i2;
            this.f16290e++;
        }
        Intent a = mo17901a(intent);
        if (a == null) {
            m21757d(intent);
            return 2;
        } else if (mo17980c(a)) {
            m21757d(intent);
            return 2;
        } else {
            this.f16286a.execute(new C4967ae(this, a, intent));
            return 3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m21757d(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.m1234a(intent);
        }
        synchronized (this.f16288c) {
            this.f16290e--;
            if (this.f16290e == 0) {
                stopSelfResult(this.f16289d);
            }
        }
    }
}

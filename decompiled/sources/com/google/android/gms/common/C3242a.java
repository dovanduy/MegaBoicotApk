package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C3513t;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.common.a */
public class C3242a implements ServiceConnection {

    /* renamed from: a */
    private boolean f9446a = false;

    /* renamed from: b */
    private final BlockingQueue<IBinder> f9447b = new LinkedBlockingQueue();

    public void onServiceDisconnected(ComponentName componentName) {
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f9447b.add(iBinder);
    }

    /* renamed from: a */
    public IBinder mo13063a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C3513t.m12638c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f9446a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f9446a = true;
        IBinder iBinder = (IBinder) this.f9447b.poll(j, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }
}

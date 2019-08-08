package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.ao */
final class C3454ao implements ServiceConnection {

    /* renamed from: a */
    private final Set<ServiceConnection> f9971a = new HashSet();

    /* renamed from: b */
    private int f9972b = 2;

    /* renamed from: c */
    private boolean f9973c;

    /* renamed from: d */
    private IBinder f9974d;

    /* renamed from: e */
    private final C3491a f9975e;

    /* renamed from: f */
    private ComponentName f9976f;

    /* renamed from: g */
    private final /* synthetic */ C3453an f9977g;

    public C3454ao(C3453an anVar, C3491a aVar) {
        this.f9977g = anVar;
        this.f9975e = aVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f9977g.f9965a) {
            this.f9977g.f9967c.removeMessages(1, this.f9975e);
            this.f9974d = iBinder;
            this.f9976f = componentName;
            for (ServiceConnection onServiceConnected : this.f9971a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f9972b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f9977g.f9965a) {
            this.f9977g.f9967c.removeMessages(1, this.f9975e);
            this.f9974d = null;
            this.f9976f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f9971a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f9972b = 2;
        }
    }

    /* renamed from: a */
    public final void mo13504a(String str) {
        this.f9972b = 3;
        this.f9973c = this.f9977g.f9968d.mo13687a(this.f9977g.f9966b, str, this.f9975e.mo13600a(this.f9977g.f9966b), this, this.f9975e.mo13603c());
        if (this.f9973c) {
            this.f9977g.f9967c.sendMessageDelayed(this.f9977g.f9967c.obtainMessage(1, this.f9975e), this.f9977g.f9970f);
            return;
        }
        this.f9972b = 2;
        try {
            this.f9977g.f9968d.mo13685a(this.f9977g.f9966b, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: b */
    public final void mo13509b(String str) {
        this.f9977g.f9967c.removeMessages(1, this.f9975e);
        this.f9977g.f9968d.mo13685a(this.f9977g.f9966b, this);
        this.f9973c = false;
        this.f9972b = 2;
    }

    /* renamed from: a */
    public final void mo13503a(ServiceConnection serviceConnection, String str) {
        this.f9977g.f9968d;
        this.f9977g.f9966b;
        this.f9975e.mo13600a(this.f9977g.f9966b);
        this.f9971a.add(serviceConnection);
    }

    /* renamed from: b */
    public final void mo13508b(ServiceConnection serviceConnection, String str) {
        this.f9977g.f9968d;
        this.f9977g.f9966b;
        this.f9971a.remove(serviceConnection);
    }

    /* renamed from: a */
    public final boolean mo13505a() {
        return this.f9973c;
    }

    /* renamed from: b */
    public final int mo13507b() {
        return this.f9972b;
    }

    /* renamed from: a */
    public final boolean mo13506a(ServiceConnection serviceConnection) {
        return this.f9971a.contains(serviceConnection);
    }

    /* renamed from: c */
    public final boolean mo13510c() {
        return this.f9971a.isEmpty();
    }

    /* renamed from: d */
    public final int mo13511d() {
        return this.f9971a.size();
    }

    /* renamed from: e */
    public final IBinder mo13512e() {
        return this.f9974d;
    }

    /* renamed from: f */
    public final ComponentName mo13513f() {
        return this.f9976f;
    }
}

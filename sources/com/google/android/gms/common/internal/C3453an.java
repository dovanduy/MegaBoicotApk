package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.common.stats.C3541a;
import com.google.android.gms.internal.p146c.C4421e;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.an */
final class C3453an extends C3490j implements Callback {
    /* access modifiers changed from: private */
    @GuardedBy("mConnectionStatus")

    /* renamed from: a */
    public final HashMap<C3491a, C3454ao> f9965a = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f9966b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f9967c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3541a f9968d;

    /* renamed from: e */
    private final long f9969e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final long f9970f;

    C3453an(Context context) {
        this.f9966b = context.getApplicationContext();
        this.f9967c = new C4421e(context.getMainLooper(), this);
        this.f9968d = C3541a.m12711a();
        this.f9969e = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        this.f9970f = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo13500a(C3491a aVar, ServiceConnection serviceConnection, String str) {
        boolean a;
        C3513t.m12626a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f9965a) {
            C3454ao aoVar = (C3454ao) this.f9965a.get(aVar);
            if (aoVar != null) {
                this.f9967c.removeMessages(0, aVar);
                if (!aoVar.mo13506a(serviceConnection)) {
                    aoVar.mo13503a(serviceConnection, str);
                    switch (aoVar.mo13507b()) {
                        case 1:
                            serviceConnection.onServiceConnected(aoVar.mo13513f(), aoVar.mo13512e());
                            break;
                        case 2:
                            aoVar.mo13504a(str);
                            break;
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(81 + String.valueOf(valueOf).length());
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                aoVar = new C3454ao(this, aVar);
                aoVar.mo13503a(serviceConnection, str);
                aoVar.mo13504a(str);
                this.f9965a.put(aVar, aoVar);
                if (this.f9965a.size() > 200) {
                    String valueOf2 = String.valueOf(aVar);
                    int size = this.f9965a.size();
                    StringBuilder sb2 = new StringBuilder(51 + String.valueOf(valueOf2).length());
                    sb2.append("Adding ");
                    sb2.append(valueOf2);
                    sb2.append(", and there are now ");
                    sb2.append(size);
                    sb2.append(" connections.");
                    Log.wtf("GmsClientSupervisor", sb2.toString(), new Exception());
                }
            }
            if (aoVar.mo13511d() > 100) {
                int d = aoVar.mo13511d();
                String valueOf3 = String.valueOf(aVar);
                StringBuilder sb3 = new StringBuilder(41 + String.valueOf(valueOf3).length());
                sb3.append("There are");
                sb3.append(d);
                sb3.append(" clients for service ");
                sb3.append(valueOf3);
                Log.wtf("GmsClientSupervisor", sb3.toString(), new Exception());
            }
            a = aoVar.mo13505a();
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13501b(C3491a aVar, ServiceConnection serviceConnection, String str) {
        C3513t.m12626a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f9965a) {
            C3454ao aoVar = (C3454ao) this.f9965a.get(aVar);
            if (aoVar == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(50 + String.valueOf(valueOf).length());
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (!aoVar.mo13506a(serviceConnection)) {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(76 + String.valueOf(valueOf2).length());
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            } else {
                aoVar.mo13508b(serviceConnection, str);
                if (aoVar.mo13510c()) {
                    this.f9967c.sendMessageDelayed(this.f9967c.obtainMessage(0, aVar), this.f9969e);
                }
            }
        }
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                synchronized (this.f9965a) {
                    C3491a aVar = (C3491a) message.obj;
                    C3454ao aoVar = (C3454ao) this.f9965a.get(aVar);
                    if (aoVar != null && aoVar.mo13510c()) {
                        if (aoVar.mo13505a()) {
                            aoVar.mo13509b("GmsClientSupervisor");
                        }
                        this.f9965a.remove(aVar);
                    }
                }
                return true;
            case 1:
                synchronized (this.f9965a) {
                    C3491a aVar2 = (C3491a) message.obj;
                    C3454ao aoVar2 = (C3454ao) this.f9965a.get(aVar2);
                    if (aoVar2 != null && aoVar2.mo13507b() == 3) {
                        String valueOf = String.valueOf(aVar2);
                        StringBuilder sb = new StringBuilder(47 + String.valueOf(valueOf).length());
                        sb.append("Timeout waiting for ServiceConnection callback ");
                        sb.append(valueOf);
                        Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                        ComponentName f = aoVar2.mo13513f();
                        if (f == null) {
                            f = aVar2.mo13602b();
                        }
                        if (f == null) {
                            f = new ComponentName(aVar2.mo13601a(), "unknown");
                        }
                        aoVar2.onServiceDisconnected(f);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}

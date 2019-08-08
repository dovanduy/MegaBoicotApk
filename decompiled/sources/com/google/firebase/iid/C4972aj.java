package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.p142a.C3547b;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.google.firebase.iid.aj */
public final class C4972aj implements ServiceConnection {

    /* renamed from: a */
    private final Context f16196a;

    /* renamed from: b */
    private final Intent f16197b;

    /* renamed from: c */
    private final ScheduledExecutorService f16198c;

    /* renamed from: d */
    private final Queue<C4968af> f16199d;

    /* renamed from: e */
    private C4970ah f16200e;

    /* renamed from: f */
    private boolean f16201f;

    public C4972aj(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new C3547b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private C4972aj(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f16199d = new ArrayDeque();
        this.f16201f = false;
        this.f16196a = context.getApplicationContext();
        this.f16197b = new Intent(str).setPackage(this.f16196a.getPackageName());
        this.f16198c = scheduledExecutorService;
    }

    /* renamed from: a */
    public final synchronized void mo17918a(Intent intent, PendingResult pendingResult) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
        }
        this.f16199d.add(new C4968af(intent, pendingResult, this.f16198c));
        m21635a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a4, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m21635a() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "EnhancedIntentService"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "flush queue called"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a7 }
        L_0x0011:
            java.util.Queue<com.google.firebase.iid.af> r0 = r5.f16199d     // Catch:{ all -> 0x00a7 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "found intent to be delivered"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a7 }
        L_0x0028:
            com.google.firebase.iid.ah r0 = r5.f16200e     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0051
            com.google.firebase.iid.ah r0 = r5.f16200e     // Catch:{ all -> 0x00a7 }
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "binder is alive, sending the intent."
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a7 }
        L_0x0043:
            java.util.Queue<com.google.firebase.iid.af> r0 = r5.f16199d     // Catch:{ all -> 0x00a7 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00a7 }
            com.google.firebase.iid.af r0 = (com.google.firebase.iid.C4968af) r0     // Catch:{ all -> 0x00a7 }
            com.google.firebase.iid.ah r2 = r5.f16200e     // Catch:{ all -> 0x00a7 }
            r2.mo17916a(r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x0011
        L_0x0051:
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a7 }
            r1 = 1
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "EnhancedIntentService"
            boolean r2 = r5.f16201f     // Catch:{ all -> 0x00a7 }
            r2 = r2 ^ r1
            r3 = 39
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r4.<init>(r3)     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = "binder is dead. start connection? "
            r4.append(r3)     // Catch:{ all -> 0x00a7 }
            r4.append(r2)     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x00a7 }
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a7 }
        L_0x0075:
            boolean r0 = r5.f16201f     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x00a3
            r5.f16201f = r1     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C3541a.m12711a()     // Catch:{ SecurityException -> 0x0095 }
            android.content.Context r1 = r5.f16196a     // Catch:{ SecurityException -> 0x0095 }
            android.content.Intent r2 = r5.f16197b     // Catch:{ SecurityException -> 0x0095 }
            r3 = 65
            boolean r0 = r0.mo13686a(r1, r2, r5, r3)     // Catch:{ SecurityException -> 0x0095 }
            if (r0 == 0) goto L_0x008d
            monitor-exit(r5)
            return
        L_0x008d:
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r1 = "binding to the service failed"
            android.util.Log.e(r0, r1)     // Catch:{ SecurityException -> 0x0095 }
            goto L_0x009d
        L_0x0095:
            r0 = move-exception
            java.lang.String r1 = "EnhancedIntentService"
            java.lang.String r2 = "Exception while binding the service"
            android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x00a7 }
        L_0x009d:
            r0 = 0
            r5.f16201f = r0     // Catch:{ all -> 0x00a7 }
            r5.m21636b()     // Catch:{ all -> 0x00a7 }
        L_0x00a3:
            monitor-exit(r5)
            return
        L_0x00a5:
            monitor-exit(r5)
            return
        L_0x00a7:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4972aj.m21635a():void");
    }

    /* renamed from: b */
    private final void m21636b() {
        while (!this.f16199d.isEmpty()) {
            ((C4968af) this.f16199d.poll()).mo17914a();
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f16201f = false;
            this.f16200e = (C4970ah) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                String valueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(20 + String.valueOf(valueOf).length());
                sb.append("onServiceConnected: ");
                sb.append(valueOf);
                Log.d("EnhancedIntentService", sb.toString());
            }
            if (iBinder == null) {
                Log.e("EnhancedIntentService", "Null service connection");
                m21636b();
            } else {
                m21635a();
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(23 + String.valueOf(valueOf).length());
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("EnhancedIntentService", sb.toString());
        }
        m21635a();
    }
}

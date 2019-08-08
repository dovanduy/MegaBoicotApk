package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.p142a.C3547b;
import com.google.android.gms.p143d.C3583g;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.e */
public final class C4993e {
    @GuardedBy("MessengerIpcClient.class")

    /* renamed from: a */
    private static C4993e f16234a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f16235b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ScheduledExecutorService f16236c;
    @GuardedBy("this")

    /* renamed from: d */
    private C4995g f16237d = new C4995g(this);
    @GuardedBy("this")

    /* renamed from: e */
    private int f16238e = 1;

    /* renamed from: a */
    public static synchronized C4993e m21695a(Context context) {
        C4993e eVar;
        synchronized (C4993e.class) {
            if (f16234a == null) {
                f16234a = new C4993e(context, Executors.newSingleThreadScheduledExecutor(new C3547b("MessengerIpcClient")));
            }
            eVar = f16234a;
        }
        return eVar;
    }

    private C4993e(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f16236c = scheduledExecutorService;
        this.f16235b = context.getApplicationContext();
    }

    /* renamed from: a */
    public final C3583g<Void> mo17942a(int i, Bundle bundle) {
        return m21694a((C5002n<T>) new C5001m<T>(m21692a(), 2, bundle));
    }

    /* renamed from: b */
    public final C3583g<Bundle> mo17943b(int i, Bundle bundle) {
        return m21694a((C5002n<T>) new C5004p<T>(m21692a(), 1, bundle));
    }

    /* renamed from: a */
    private final synchronized <T> C3583g<T> m21694a(C5002n<T> nVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(nVar);
            StringBuilder sb = new StringBuilder(9 + String.valueOf(valueOf).length());
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f16237d.mo17948a((C5002n) nVar)) {
            this.f16237d = new C4995g(this);
            this.f16237d.mo17948a((C5002n) nVar);
        }
        return nVar.f16253b.mo13720a();
    }

    /* renamed from: a */
    private final synchronized int m21692a() {
        int i;
        i = this.f16238e;
        this.f16238e = i + 1;
        return i;
    }
}

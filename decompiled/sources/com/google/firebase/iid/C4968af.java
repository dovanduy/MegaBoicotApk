package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.af */
final class C4968af {

    /* renamed from: a */
    final Intent f16187a;

    /* renamed from: b */
    private final PendingResult f16188b;

    /* renamed from: c */
    private boolean f16189c = false;

    /* renamed from: d */
    private final ScheduledFuture<?> f16190d;

    C4968af(Intent intent, PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f16187a = intent;
        this.f16188b = pendingResult;
        this.f16190d = scheduledExecutorService.schedule(new C4969ag(this, intent), 9000, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo17914a() {
        if (!this.f16189c) {
            this.f16188b.finish();
            this.f16190d.cancel(false);
            this.f16189c = true;
        }
    }
}

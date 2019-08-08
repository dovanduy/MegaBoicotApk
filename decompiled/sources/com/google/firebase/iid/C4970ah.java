package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* renamed from: com.google.firebase.iid.ah */
public final class C4970ah extends Binder {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzb f16193a;

    C4970ah(zzb zzb) {
        this.f16193a = zzb;
    }

    /* renamed from: a */
    public final void mo17916a(C4968af afVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "service received new intent via bind strategy");
        }
        if (this.f16193a.mo17980c(afVar.f16187a)) {
            afVar.mo17914a();
            return;
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "intent being queued for bg execution");
        }
        this.f16193a.f16286a.execute(new C4971ai(this, afVar));
    }
}

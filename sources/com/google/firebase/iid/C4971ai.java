package com.google.firebase.iid;

import android.util.Log;

/* renamed from: com.google.firebase.iid.ai */
final class C4971ai implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4968af f16194a;

    /* renamed from: b */
    private final /* synthetic */ C4970ah f16195b;

    C4971ai(C4970ah ahVar, C4968af afVar) {
        this.f16195b = ahVar;
        this.f16194a = afVar;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.f16195b.f16193a.mo17903b(this.f16194a.f16187a);
        this.f16194a.mo17914a();
    }
}

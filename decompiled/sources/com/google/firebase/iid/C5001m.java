package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.m */
final class C5001m extends C5002n<Void> {
    C5001m(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo17958a() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17957a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo17960a(null);
        } else {
            mo17959a(new C5003o(4, "Invalid response to one way request"));
        }
    }
}

package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.p */
final class C5004p extends C5002n<Bundle> {
    C5004p(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo17958a() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17957a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        mo17960a(bundle2);
    }
}

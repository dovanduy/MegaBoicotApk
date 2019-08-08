package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

@C3718cm
final class axb {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<ayb> f12344a = new ArrayList();

    axb() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14935a(ayc ayc) {
        Handler handler = C3909jn.f13411a;
        for (ayb aya : this.f12344a) {
            handler.post(new aya(this, aya, ayc));
        }
        this.f12344a.clear();
    }
}

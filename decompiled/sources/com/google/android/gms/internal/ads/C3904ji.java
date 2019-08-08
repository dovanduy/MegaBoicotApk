package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.ji */
final class C3904ji extends C3905jj {

    /* renamed from: a */
    private final /* synthetic */ Bundle f13405a;

    /* renamed from: b */
    private final /* synthetic */ C3902jg f13406b;

    C3904ji(C3902jg jgVar, Bundle bundle) {
        this.f13406b = jgVar;
        this.f13405a = bundle;
        super(null);
    }

    /* renamed from: a */
    public final void mo12687a() {
        Iterator it = this.f13406b.f13386d.iterator();
        while (it.hasNext()) {
            ((C3906jk) it.next()).mo15434a(this.f13405a);
        }
    }
}

package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.C3067ae;
import com.google.android.gms.internal.ads.C4089qe;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.v */
final class C3135v implements C3067ae<C4089qe> {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f9140a;

    C3135v(CountDownLatch countDownLatch) {
        this.f9140a = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C4089qe qeVar = (C4089qe) obj;
        this.f9140a.countDown();
        qeVar.getView().setVisibility(0);
    }
}

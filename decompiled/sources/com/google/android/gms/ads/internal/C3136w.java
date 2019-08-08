package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.C3067ae;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C4089qe;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.w */
final class C3136w implements C3067ae<C4089qe> {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f9141a;

    C3136w(CountDownLatch countDownLatch) {
        this.f9141a = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C4089qe qeVar = (C4089qe) obj;
        C3900je.m17435e("Adapter returned an ad, but assets substitution failed");
        this.f9141a.countDown();
        qeVar.destroy();
    }
}

package com.google.android.gms.ads.internal;

import android.webkit.CookieManager;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aru;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.bd */
final class C3033bd implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ C3030ba f8892a;

    C3033bd(C3030ba baVar) {
        this.f8892a = baVar;
    }

    public final /* synthetic */ Object call() throws Exception {
        String str = "";
        if (!((Boolean) aoq.m14620f().mo14695a(aru.f11884cC)).booleanValue()) {
            return str;
        }
        CookieManager c = C3025aw.m10919g().mo15550c(this.f8892a.f8733e.f8858c);
        return c != null ? c.getCookie("googleads.g.doubleclick.net") : str;
    }
}

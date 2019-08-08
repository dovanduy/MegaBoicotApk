package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.ff */
final class C3793ff implements Callable<C3790fc> {

    /* renamed from: a */
    private final /* synthetic */ Context f13103a;

    /* renamed from: b */
    private final /* synthetic */ C3792fe f13104b;

    C3793ff(C3792fe feVar, Context context) {
        this.f13104b = feVar;
        this.f13103a = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        C3790fc fcVar;
        C3794fg fgVar = (C3794fg) this.f13104b.f13102a.get(this.f13103a);
        if (fgVar != null) {
            if (!(fgVar.f13105a + ((Long) aoq.m14620f().mo14695a(aru.f11871bq)).longValue() < C3025aw.m10924l().mo13694a())) {
                if (((Boolean) aoq.m14620f().mo14695a(aru.f11870bp)).booleanValue()) {
                    fcVar = new C3791fd(this.f13103a, fgVar.f13106b).mo15287a();
                    this.f13104b.f13102a.put(this.f13103a, new C3794fg(this.f13104b, fcVar));
                    return fcVar;
                }
            }
        }
        fcVar = new C3791fd(this.f13103a).mo15287a();
        this.f13104b.f13102a.put(this.f13103a, new C3794fg(this.f13104b, fcVar));
        return fcVar;
    }
}

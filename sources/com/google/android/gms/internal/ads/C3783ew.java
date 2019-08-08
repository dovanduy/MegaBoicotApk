package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ew */
final class C3783ew implements C3067ae<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3781eu f12987a;

    C3783ew(C3781eu euVar) {
        this.f12987a = euVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.f12987a.f12979b) {
            if (!this.f12987a.f12982e.isDone()) {
                C3788fa faVar = new C3788fa(-2, map);
                if (this.f12987a.f12980c.equals(faVar.mo15284h())) {
                    String e = faVar.mo15281e();
                    if (e == null) {
                        C3900je.m17435e("URL missing in loadAdUrl GMSG.");
                        return;
                    }
                    if (e.contains("%40mediation_adapters%40")) {
                        String replaceAll = e.replaceAll("%40mediation_adapters%40", C3893iy.m17029a(this.f12987a.f12978a, (String) map.get("check_adapters"), this.f12987a.f12981d));
                        faVar.mo15277a(replaceAll);
                        String str = "Ad request URL modified to ";
                        String valueOf = String.valueOf(replaceAll);
                        C3900je.m17043a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    }
                    this.f12987a.f12982e.mo15686b(faVar);
                }
            }
        }
    }
}

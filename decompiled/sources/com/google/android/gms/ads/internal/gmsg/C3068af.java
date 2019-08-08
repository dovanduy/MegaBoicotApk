package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.ayo;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.gmsg.af */
final class C3068af implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ayo f8952a;

    /* renamed from: b */
    private final /* synthetic */ Map f8953b;

    /* renamed from: c */
    private final /* synthetic */ HttpClient f8954c;

    C3068af(HttpClient httpClient, Map map, ayo ayo) {
        this.f8954c = httpClient;
        this.f8953b = map;
        this.f8952a = ayo;
    }

    public final void run() {
        C3900je.m17429b("Received Http request.");
        try {
            JSONObject send = this.f8954c.send(new JSONObject((String) this.f8953b.get("http_request")));
            if (send == null) {
                C3900je.m17431c("Response should not be null.");
            } else {
                C3909jn.f13411a.post(new C3069ag(this, send));
            }
        } catch (Exception e) {
            C3900je.m17430b("Error converting request to json.", e);
        }
    }
}

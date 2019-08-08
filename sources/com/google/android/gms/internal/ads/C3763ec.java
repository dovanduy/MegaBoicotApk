package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.base.p046b.C1251i;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import com.google.android.gms.ads.internal.gmsg.C3072b;
import com.google.android.gms.ads.internal.gmsg.HttpClient;
import com.google.android.gms.ads.p135a.C2961a;
import com.google.android.gms.ads.p135a.C2961a.C2962a;
import com.google.android.gms.common.C3412e;
import com.google.android.gms.common.C3413f;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ec */
public final class C3763ec extends C3894iz {

    /* renamed from: a */
    private static final long f12921a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    private static final Object f12922b = new Object();
    @GuardedBy("sLock")

    /* renamed from: c */
    private static boolean f12923c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static azq f12924d;

    /* renamed from: e */
    private static HttpClient f12925e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static C3072b f12926f;

    /* renamed from: g */
    private static C3067ae<Object> f12927g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C3720co f12928h;

    /* renamed from: i */
    private final C3744dl f12929i;

    /* renamed from: j */
    private final Object f12930j = new Object();

    /* renamed from: k */
    private final Context f12931k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public bad f12932l;

    /* renamed from: m */
    private amo f12933m;

    public C3763ec(Context context, C3744dl dlVar, C3720co coVar, amo amo) {
        super(true);
        this.f12928h = coVar;
        this.f12931k = context;
        this.f12929i = dlVar;
        this.f12933m = amo;
        synchronized (f12922b) {
            if (!f12923c) {
                f12926f = new C3072b();
                f12925e = new HttpClient(context.getApplicationContext(), dlVar.f12895j);
                f12927g = new C3771ek();
                azq azq = new azq(this.f12931k.getApplicationContext(), this.f12929i.f12895j, (String) aoq.m14620f().mo14695a(aru.f11775a), new C3770ej(), new C3769ei());
                f12924d = azq;
                f12923c = true;
            }
        }
    }

    /* renamed from: a */
    private final zzaej m16561a(zzaef zzaef) {
        C3025aw.m10917e();
        String a = C3909jn.m17128a();
        JSONObject a2 = m16562a(zzaef, a);
        if (a2 == null) {
            return new zzaej(0);
        }
        long b = C3025aw.m10924l().mo13695b();
        Future a3 = f12926f.mo12615a(a);
        C3975lz.f13539a.post(new C3765ee(this, a2, a));
        try {
            JSONObject jSONObject = (JSONObject) a3.get(f12921a - (C3025aw.m10924l().mo13695b() - b), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new zzaej(-1);
            }
            zzaej a4 = C3780et.m16587a(this.f12931k, zzaef, jSONObject.toString());
            if (a4.f14455d != -3 && TextUtils.isEmpty(a4.f14453b)) {
                a4 = new zzaej(3);
            }
            return a4;
        } catch (InterruptedException | CancellationException unused) {
            return new zzaej(-1);
        } catch (TimeoutException unused2) {
            return new zzaej(2);
        } catch (ExecutionException unused3) {
            return new zzaej(0);
        }
    }

    /* renamed from: a */
    private final JSONObject m16562a(zzaef zzaef, String str) {
        C3790fc fcVar;
        C2962a aVar;
        Bundle bundle = zzaef.f14404c.f14527c.getBundle("sdk_less_server_data");
        if (bundle == null) {
            return null;
        }
        try {
            fcVar = (C3790fc) C3025aw.m10928p().mo15288a(this.f12931k).get();
        } catch (Exception e) {
            C3900je.m17432c("Error grabbing device info: ", e);
            fcVar = null;
        }
        Context context = this.f12931k;
        C3773em emVar = new C3773em();
        emVar.f12951j = zzaef;
        emVar.f12952k = fcVar;
        JSONObject a = C3780et.m16591a(context, emVar);
        if (a == null) {
            return null;
        }
        try {
            aVar = C2961a.m10593a(this.f12931k);
        } catch (C3412e | C3413f | IOException | IllegalStateException e2) {
            C3900je.m17432c("Cannot get advertising id info", e2);
            aVar = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        hashMap.put("request_param", a);
        hashMap.put("data", bundle);
        if (aVar != null) {
            hashMap.put("adid", aVar.mo12186a());
            hashMap.put(C1251i.f3980jC, Integer.valueOf(aVar.mo12187b() ? 1 : 0));
        }
        try {
            return C3025aw.m10917e().mo15514a((Map<String, ?>) hashMap);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    protected static void m16563a(aze aze) {
        aze.mo15016a("/loadAd", f12926f);
        aze.mo15016a("/fetchHttpRequest", f12925e);
        aze.mo15016a("/invalidRequest", f12927g);
    }

    /* renamed from: b */
    protected static void m16565b(aze aze) {
        aze.mo15017b("/loadAd", f12926f);
        aze.mo15017b("/fetchHttpRequest", f12925e);
        aze.mo15017b("/invalidRequest", f12927g);
    }

    /* renamed from: a */
    public final void mo12687a() {
        C3900je.m17429b("SdkLessAdLoaderBackgroundTask started.");
        String j = C3025aw.m10908B().mo15402j(this.f12931k);
        zzaef zzaef = new zzaef(this.f12929i, -1, C3025aw.m10908B().mo15400h(this.f12931k), C3025aw.m10908B().mo15401i(this.f12931k), j);
        C3025aw.m10908B().mo15397f(this.f12931k, j);
        zzaej a = m16561a(zzaef);
        long b = C3025aw.m10924l().mo13695b();
        zzaef zzaef2 = zzaef;
        C3879ik ikVar = new C3879ik(zzaef2, a, null, null, a.f14455d, b, a.f14464m, null, this.f12933m);
        C3975lz.f13539a.post(new C3764ed(this, ikVar));
    }

    /* renamed from: e_ */
    public final void mo12688e_() {
        synchronized (this.f12930j) {
            C3975lz.f13539a.post(new C3768eh(this));
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@C3718cm
public final class arw {

    /* renamed from: a */
    private String f12059a;

    /* renamed from: b */
    private Map<String, String> f12060b;

    /* renamed from: c */
    private Context f12061c = null;

    /* renamed from: d */
    private String f12062d = null;

    public arw(Context context, String str) {
        this.f12061c = context;
        this.f12062d = str;
        this.f12059a = (String) aoq.m14620f().mo14695a(aru.f11763O);
        this.f12060b = new LinkedHashMap();
        this.f12060b.put("s", "gmob_sdk");
        this.f12060b.put("v", "3");
        this.f12060b.put("os", VERSION.RELEASE);
        this.f12060b.put("sdk", VERSION.SDK);
        C3025aw.m10917e();
        this.f12060b.put("device", C3909jn.m17153b());
        this.f12060b.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map<String, String> map = this.f12060b;
        String str2 = "is_lite_sdk";
        C3025aw.m10917e();
        map.put(str2, C3909jn.m17173k(context) ? "1" : "0");
        Future a = C3025aw.m10928p().mo15288a(this.f12061c);
        try {
            a.get();
            this.f12060b.put("network_coarse", Integer.toString(((C3790fc) a.get()).f13061n));
            this.f12060b.put("network_fine", Integer.toString(((C3790fc) a.get()).f13062o));
        } catch (Exception e) {
            C3025aw.m10921i().mo15436a((Throwable) e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo14699a() {
        return this.f12059a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Context mo14700b() {
        return this.f12061c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final String mo14701c() {
        return this.f12062d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Map<String, String> mo14702d() {
        return this.f12060b;
    }
}

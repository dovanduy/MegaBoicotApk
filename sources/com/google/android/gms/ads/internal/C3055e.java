package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3882in;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3994mr;
import com.google.android.gms.internal.ads.C3996mt;
import com.google.android.gms.internal.ads.C4008ne;
import com.google.android.gms.internal.ads.C4014nk;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.internal.ads.bar;
import com.google.android.gms.internal.ads.baw;
import com.google.android.gms.internal.ads.zzang;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.e */
public final class C3055e {

    /* renamed from: a */
    private final Object f8934a = new Object();

    /* renamed from: b */
    private Context f8935b;

    /* renamed from: c */
    private long f8936c = 0;

    /* renamed from: a */
    public final void mo12594a(Context context, zzang zzang, String str, Runnable runnable) {
        mo12595a(context, zzang, true, null, str, null, runnable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12595a(Context context, zzang zzang, boolean z, C3882in inVar, String str, String str2, Runnable runnable) {
        if (C3025aw.m10924l().mo13695b() - this.f8936c < DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
            C3900je.m17435e("Not retrying to fetch app settings");
            return;
        }
        this.f8936c = C3025aw.m10924l().mo13695b();
        boolean z2 = true;
        if (inVar != null) {
            if (!(C3025aw.m10924l().mo13694a() - inVar.mo15426a() > ((Long) aoq.m14620f().mo14695a(aru.f11927ct)).longValue()) && inVar.mo15427b()) {
                z2 = false;
            }
        }
        if (z2) {
            if (context == null) {
                C3900je.m17435e("Context not provided to fetch application settings");
            } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.f8935b = applicationContext;
                bar a = C3025aw.m10931s().mo15045a(this.f8935b, zzang).mo15048a("google.afma.config.fetchAppSettings", baw.f12519a, baw.f12519a);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z);
                    jSONObject.put("pn", context.getPackageName());
                    C4008ne b = a.mo15044b(jSONObject);
                    C4008ne a2 = C3996mt.m17450a(b, C3056f.f8937a, C4014nk.f13618b);
                    if (runnable != null) {
                        b.mo15658a(runnable, C4014nk.f13618b);
                    }
                    C3994mr.m17444a(a2, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Exception e) {
                    C3900je.m17430b("Error requesting application settings", e);
                }
            } else {
                C3900je.m17435e("App settings could not be fetched. Required parameters missing");
            }
        }
    }
}

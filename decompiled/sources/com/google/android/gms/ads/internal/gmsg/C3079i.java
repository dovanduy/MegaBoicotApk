package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.appnext.base.p046b.C1245d;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.internal.ads.zzaig;
import java.util.Map;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.gmsg.i */
public final class C3079i implements C3067ae<Object> {

    /* renamed from: a */
    private final C3080j f8980a;

    public C3079i(C3080j jVar) {
        this.f8980a = jVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get(C1245d.f3959jb);
        if ("grant".equals(str)) {
            zzaig zzaig = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get(C1245d.f3961jd);
                if (!TextUtils.isEmpty(str2)) {
                    zzaig = new zzaig(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                C3900je.m17432c("Unable to parse reward amount.", e);
            }
            this.f8980a.mo12621a(zzaig);
        } else if ("video_start".equals(str)) {
            this.f8980a.mo12622f_();
        } else {
            if ("video_complete".equals(str)) {
                if (((Boolean) aoq.m14620f().mo14695a(aru.f11825ax)).booleanValue()) {
                    if (((Boolean) aoq.m14620f().mo14695a(aru.f11825ax)).booleanValue()) {
                        this.f8980a.mo12623g_();
                    }
                }
            }
        }
    }
}

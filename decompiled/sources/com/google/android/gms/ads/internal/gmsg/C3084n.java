package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.appnext.base.p046b.C1245d;
import com.facebook.ads.internal.p083j.C1746e;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C4089qe;
import com.google.android.gms.internal.ads.ash;
import java.util.Map;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.gmsg.n */
public final class C3084n implements C3067ae<C4089qe> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        C4089qe qeVar = (C4089qe) obj;
        String str = (String) map.get(C1245d.f3959jb);
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                C3900je.m17435e("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                C3900je.m17435e("No timestamp given for CSI tick.");
            } else {
                try {
                    long b = C3025aw.m10924l().mo13695b() + (Long.parseLong(str4) - C3025aw.m10924l().mo13694a());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    qeVar.mo15806j().mo14716a(str2, str3, b);
                } catch (NumberFormatException e) {
                    C3900je.m17432c("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                C3900je.m17435e("No value given for CSI experiment.");
                return;
            }
            ash a = qeVar.mo15806j().mo14714a();
            if (a == null) {
                C3900je.m17435e("No ticker for WebView, dropping experiment ID.");
            } else {
                a.mo14721a(C1746e.f5472a, str5);
            }
        } else {
            if ("extra".equals(str)) {
                String str6 = (String) map.get("name");
                String str7 = (String) map.get("value");
                if (TextUtils.isEmpty(str7)) {
                    C3900je.m17435e("No value given for CSI extra.");
                } else if (TextUtils.isEmpty(str6)) {
                    C3900je.m17435e("No name given for CSI extra.");
                } else {
                    ash a2 = qeVar.mo15806j().mo14714a();
                    if (a2 == null) {
                        C3900je.m17435e("No ticker for WebView, dropping extra parameter.");
                        return;
                    }
                    a2.mo14721a(str6, str7);
                }
            }
        }
    }
}

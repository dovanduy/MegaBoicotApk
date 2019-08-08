package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aru;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.overlay.a */
public final class C3105a {
    /* renamed from: a */
    private static boolean m11173a(Context context, Intent intent, C3123s sVar) {
        String str = "Launching an intent: ";
        try {
            String valueOf = String.valueOf(intent.toURI());
            C3900je.m17043a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            C3025aw.m10917e();
            C3909jn.m17136a(context, intent);
            if (sVar != null) {
                sVar.mo12435h();
            }
            return true;
        } catch (ActivityNotFoundException e) {
            C3900je.m17435e(e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m11174a(Context context, zzc zzc, C3123s sVar) {
        int i;
        String str;
        if (zzc == null) {
            str = "No intent data for launcher overlay.";
        } else {
            aru.m15024a(context);
            if (zzc.f9127f != null) {
                return m11173a(context, zzc.f9127f, sVar);
            }
            Intent intent = new Intent();
            if (TextUtils.isEmpty(zzc.f9122a)) {
                str = "Open GMSG did not contain a URL.";
            } else {
                if (!TextUtils.isEmpty(zzc.f9123b)) {
                    intent.setDataAndType(Uri.parse(zzc.f9122a), zzc.f9123b);
                } else {
                    intent.setData(Uri.parse(zzc.f9122a));
                }
                intent.setAction("android.intent.action.VIEW");
                if (!TextUtils.isEmpty(zzc.f9124c)) {
                    intent.setPackage(zzc.f9124c);
                }
                if (!TextUtils.isEmpty(zzc.f9125d)) {
                    String[] split = zzc.f9125d.split("/", 2);
                    if (split.length < 2) {
                        String str2 = "Could not parse component name from open GMSG: ";
                        String valueOf = String.valueOf(zzc.f9125d);
                        C3900je.m17435e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                        return false;
                    }
                    intent.setClassName(split[0], split[1]);
                }
                String str3 = zzc.f9126e;
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        i = Integer.parseInt(str3);
                    } catch (NumberFormatException unused) {
                        C3900je.m17435e("Could not parse intent flags.");
                        i = 0;
                    }
                    intent.addFlags(i);
                }
                if (((Boolean) aoq.m14620f().mo14695a(aru.f11895cN)).booleanValue()) {
                    intent.addFlags(268435456);
                    intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                } else {
                    if (((Boolean) aoq.m14620f().mo14695a(aru.f11894cM)).booleanValue()) {
                        C3025aw.m10917e();
                        C3909jn.m17154b(context, intent);
                    }
                }
                return m11173a(context, intent, sVar);
            }
        }
        C3900je.m17435e(str);
        return false;
    }
}

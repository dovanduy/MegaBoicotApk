package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3025aw;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.id */
public final class C3872id {
    /* renamed from: a */
    public static Uri m16942a(Uri uri, Context context) {
        if (!C3025aw.m10908B().mo15398f(context) || !TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri;
        }
        String j = C3025aw.m10908B().mo15402j(context);
        Uri a = m16943a(uri.toString(), "fbs_aeid", j);
        C3025aw.m10908B().mo15393d(context, j);
        return a;
    }

    /* renamed from: a */
    private static Uri m16943a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        StringBuilder sb = new StringBuilder(str.substring(0, i));
        sb.append(str2);
        sb.append("=");
        sb.append(str3);
        sb.append("&");
        sb.append(str.substring(i));
        return Uri.parse(sb.toString());
    }

    /* renamed from: a */
    public static String m16944a(String str, Context context) {
        if (C3025aw.m10908B().mo15388a(context)) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            String j = C3025aw.m10908B().mo15402j(context);
            if (j == null) {
                return str;
            }
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11821at)).booleanValue()) {
                String str2 = (String) aoq.m14620f().mo14695a(aru.f11822au);
                if (str.contains(str2)) {
                    if (C3025aw.m10917e().mo15527d(str)) {
                        C3025aw.m10908B().mo15393d(context, j);
                        return str.replace(str2, j);
                    } else if (C3025aw.m10917e().mo15528e(str)) {
                        C3025aw.m10908B().mo15395e(context, j);
                        return str.replace(str2, j);
                    }
                }
            } else if (!str.contains("fbs_aeid")) {
                if (C3025aw.m10917e().mo15527d(str)) {
                    C3025aw.m10908B().mo15393d(context, j);
                    return m16943a(str, "fbs_aeid", j).toString();
                } else if (C3025aw.m10917e().mo15528e(str)) {
                    C3025aw.m10908B().mo15395e(context, j);
                    str = m16943a(str, "fbs_aeid", j).toString();
                }
            }
        }
        return str;
    }

    /* renamed from: b */
    public static String m16945b(String str, Context context) {
        if (C3025aw.m10908B().mo15388a(context)) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            String j = C3025aw.m10908B().mo15402j(context);
            if (j == null || !C3025aw.m10917e().mo15528e(str)) {
                return str;
            }
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11821at)).booleanValue()) {
                String str2 = (String) aoq.m14620f().mo14695a(aru.f11822au);
                if (str.contains(str2)) {
                    return str.replace(str2, j);
                }
            } else if (!str.contains("fbs_aeid")) {
                str = m16943a(str, "fbs_aeid", j).toString();
            }
        }
        return str;
    }
}

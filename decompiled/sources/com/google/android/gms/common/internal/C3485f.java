package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.support.p017v4.p023d.C0398m;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C3414g;
import com.google.android.gms.common.C3520j.C3521a;
import com.google.android.gms.common.p140b.C3404c;
import com.google.android.gms.common.util.C3557i;
import com.google.android.gms.p134a.C2955a.C2958c;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.f */
public final class C3485f {
    @GuardedBy("sCache")

    /* renamed from: a */
    private static final C0398m<String, String> f10051a = new C0398m<>();

    /* renamed from: a */
    public static String m12497a(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 20) {
            switch (i) {
                case 1:
                    return resources.getString(C2958c.common_google_play_services_install_title);
                case 2:
                    return resources.getString(C2958c.common_google_play_services_update_title);
                case 3:
                    return resources.getString(C2958c.common_google_play_services_enable_title);
                case 4:
                case 6:
                    break;
                case 5:
                    Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                    return m12498a(context, "common_google_play_services_invalid_account_title");
                case 7:
                    Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                    return m12498a(context, "common_google_play_services_network_error_title");
                case 8:
                    Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                    return null;
                case 9:
                    Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                    return null;
                case 10:
                    Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                    return null;
                case 11:
                    Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                    return null;
                default:
                    switch (i) {
                        case 16:
                            Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                            return null;
                        case 17:
                            Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                            return m12498a(context, "common_google_play_services_sign_in_failed_title");
                        case 18:
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(33);
                            sb.append("Unexpected error code ");
                            sb.append(i);
                            Log.e("GoogleApiAvailability", sb.toString());
                            return null;
                    }
            }
            return null;
        }
        Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
        return m12498a(context, "common_google_play_services_restricted_profile_title");
    }

    /* renamed from: b */
    public static String m12501b(Context context, int i) {
        String str;
        if (i == 6) {
            str = m12498a(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m12497a(context, i);
        }
        return str == null ? context.getResources().getString(C2958c.common_google_play_services_notification_ticker) : str;
    }

    /* renamed from: c */
    public static String m12502c(Context context, int i) {
        Resources resources = context.getResources();
        String a = m12496a(context);
        if (i == 5) {
            return m12499a(context, "common_google_play_services_invalid_account_text", a);
        }
        if (i == 7) {
            return m12499a(context, "common_google_play_services_network_error_text", a);
        }
        if (i == 9) {
            return resources.getString(C2958c.common_google_play_services_unsupported_text, new Object[]{a});
        } else if (i == 20) {
            return m12499a(context, "common_google_play_services_restricted_profile_text", a);
        } else {
            switch (i) {
                case 1:
                    return resources.getString(C2958c.common_google_play_services_install_text, new Object[]{a});
                case 2:
                    if (C3557i.m12751b(context)) {
                        return resources.getString(C2958c.common_google_play_services_wear_update_text);
                    }
                    return resources.getString(C2958c.common_google_play_services_update_text, new Object[]{a});
                case 3:
                    return resources.getString(C2958c.common_google_play_services_enable_text, new Object[]{a});
                default:
                    switch (i) {
                        case 16:
                            return m12499a(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m12499a(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C2958c.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(C3521a.common_google_play_services_unknown_issue, new Object[]{a});
                    }
            }
        }
    }

    /* renamed from: d */
    public static String m12503d(Context context, int i) {
        if (i == 6) {
            return m12499a(context, "common_google_play_services_resolution_required_text", m12496a(context));
        }
        return m12502c(context, i);
    }

    /* renamed from: e */
    public static String m12504e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C2958c.common_google_play_services_install_button);
            case 2:
                return resources.getString(C2958c.common_google_play_services_update_button);
            case 3:
                return resources.getString(C2958c.common_google_play_services_enable_button);
            default:
                return resources.getString(17039370);
        }
    }

    /* renamed from: a */
    public static String m12496a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C3404c.m12230a(context).mo13396b(packageName).toString();
        } catch (NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: a */
    private static String m12499a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m12498a(context, str);
        if (a == null) {
            a = resources.getString(C3521a.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    /* renamed from: a */
    private static String m12498a(Context context, String str) {
        synchronized (f10051a) {
            String str2 = (String) f10051a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources a = C3414g.m12274a(context);
            if (a == null) {
                return null;
            }
            int identifier = a.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String str3 = "GoogleApiAvailability";
                String str4 = "Missing resource: ";
                String valueOf = String.valueOf(str);
                Log.w(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                return null;
            }
            String string = a.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String str5 = "GoogleApiAvailability";
                String str6 = "Got empty resource: ";
                String valueOf2 = String.valueOf(str);
                Log.w(str5, valueOf2.length() != 0 ? str6.concat(valueOf2) : new String(str6));
                return null;
            }
            f10051a.put(str, string);
            return string;
        }
    }

    /* renamed from: b */
    public static String m12500b(Context context) {
        return context.getResources().getString(C2958c.common_google_play_services_notification_channel_name);
    }
}

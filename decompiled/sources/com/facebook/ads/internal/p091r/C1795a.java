package com.facebook.ads.internal.p091r;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.facebook.ads.internal.p115w.p121f.C2362a;
import com.google.android.exoplayer2.BuildConfig;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.r.a */
public final class C1795a {

    /* renamed from: a */
    private static C1795a f5650a;

    /* renamed from: b */
    private final SharedPreferences f5651b;

    /* renamed from: c */
    private final Context f5652c;

    private C1795a(Context context) {
        this.f5652c = context.getApplicationContext();
        this.f5651b = this.f5652c.getSharedPreferences(C2362a.m9138a("com.facebook.ads.FEATURE_CONFIG", context), 0);
    }

    /* renamed from: A */
    public static String m7407A(Context context) {
        return m7440af(context).mo7654a("adnw_wo_network_signal_url", "");
    }

    /* renamed from: B */
    public static double m7408B(Context context) {
        return m7440af(context).mo7651a("adnw_wo_network_signal_sampling_rate", 0.0d);
    }

    /* renamed from: C */
    public static boolean m7409C(Context context) {
        return m7440af(context).mo7656a("adnw_wo_network_signal_large_payload_enabled", false);
    }

    /* renamed from: D */
    public static int m7410D(Context context) {
        return m7440af(context).mo7652a("adnw_wo_network_signal_large_payload_size", -1);
    }

    /* renamed from: E */
    public static double m7411E(Context context) {
        return m7440af(context).mo7651a("adnw_wo_network_signal_large_payload_sampling_rate", -1.0d);
    }

    /* renamed from: F */
    public static int m7412F(Context context) {
        return m7440af(context).mo7652a("minimum_elapsed_time_after_impression", -1);
    }

    /* renamed from: G */
    public static int m7413G(Context context) {
        return m7440af(context).mo7652a("stack_trace_sample_rate", 0);
    }

    /* renamed from: H */
    public static boolean m7414H(Context context) {
        return m7440af(context).mo7656a("adnw_top_activity_viewability", false);
    }

    /* renamed from: I */
    public static boolean m7415I(Context context) {
        return m7440af(context).mo7656a("adnw_enhanced_viewability_area_check", false);
    }

    /* renamed from: J */
    public static boolean m7416J(Context context) {
        return m7440af(context).mo7656a("adnw_purge_on_413_response", false);
    }

    /* renamed from: K */
    public static boolean m7417K(Context context) {
        return m7440af(context).mo7656a("adnw_arrows_instead_of_x_skip_button", false);
    }

    /* renamed from: L */
    public static boolean m7418L(Context context) {
        return m7440af(context).mo7656a("adnw_viewability_check_area_based", false);
    }

    /* renamed from: M */
    public static String m7419M(Context context) {
        return m7440af(context).mo7654a("adnw_logging_endpoint_prefix", "www");
    }

    /* renamed from: N */
    public static boolean m7420N(Context context) {
        return m7440af(context).mo7656a("adnw_mapp_markup_impression_after_image_load", false);
    }

    /* renamed from: O */
    public static boolean m7421O(Context context) {
        return m7440af(context).mo7656a("adnw_enable_inline_x_out_on_sdk", false);
    }

    /* renamed from: P */
    public static boolean m7422P(Context context) {
        return m7440af(context).mo7656a("adnw_enable_inline_x_out_non_fullscreen_on_sdk", false);
    }

    /* renamed from: Q */
    public static boolean m7423Q(Context context) {
        return m7440af(context).mo7656a("adnw_unique_db_name_per_process", false);
    }

    /* renamed from: R */
    public static boolean m7424R(Context context) {
        return m7440af(context).mo7656a("adnw_log_interstitial_cache_result", false);
    }

    /* renamed from: S */
    public static boolean m7425S(Context context) {
        return m7440af(context).mo7656a("adnw_images_in_display_size", true);
    }

    /* renamed from: T */
    public static boolean m7426T(Context context) {
        return m7440af(context).mo7656a("adnw_fail_ad_load_on_cache_failure", false);
    }

    /* renamed from: U */
    public static boolean m7427U(Context context) {
        return m7440af(context).mo7656a("adnw_should_fail_on_cleartext_http_blocked", false);
    }

    /* renamed from: V */
    public static boolean m7428V(Context context) {
        return m7440af(context).mo7656a("adnw_enable_multiprocess_support", false);
    }

    /* renamed from: W */
    public static boolean m7429W(Context context) {
        return m7440af(context).mo7656a("adnw_request_first_ad_from_main_process", true);
    }

    /* renamed from: X */
    public static boolean m7430X(Context context) {
        return m7440af(context).mo7656a("adnw_hide_error_dialog_for_ad_process", true);
    }

    /* renamed from: Y */
    public static boolean m7431Y(Context context) {
        return m7440af(context).mo7656a("adnw_enable_circular_process_binding", true);
    }

    /* renamed from: Z */
    public static boolean m7432Z(Context context) {
        return m7440af(context).mo7656a("adnw_enable_auto_destroy_leaks", true);
    }

    /* renamed from: a */
    private static int m7433a(Context context, String str, int i) {
        int a = m7440af(context).mo7652a(str, i);
        return (a < 0 || a >= 101) ? i : a;
    }

    /* renamed from: a */
    public static boolean m7434a(Context context) {
        return VERSION.SDK_INT >= 14 && m7444c(BuildConfig.APPLICATION_ID, ExoPlayerLibraryInfo.TAG) && m7440af(context).mo7656a("adnw_enable_exoplayer", false);
    }

    /* renamed from: aa */
    public static boolean m7435aa(Context context) {
        return m7440af(context).mo7656a("adnw_disable_dependencies_check", true);
    }

    /* renamed from: ab */
    public static boolean m7436ab(Context context) {
        return m7440af(context).mo7656a("adnw_enable_wrong_ad_states_check", true);
    }

    /* renamed from: ac */
    public static boolean m7437ac(Context context) {
        return m7440af(context).mo7656a("adnw_do_not_reload_interstitial_adapter", true);
    }

    /* renamed from: ad */
    public static int m7438ad(Context context) {
        return m7440af(context).mo7652a("adnw_time_to_wait_for_video_prepared_ms", 3000);
    }

    /* renamed from: ae */
    public static int m7439ae(Context context) {
        return m7440af(context).mo7652a("adnw_debug_log_file_size_limit_bytes", 10485760);
    }

    /* renamed from: af */
    public static C1795a m7440af(Context context) {
        if (f5650a == null) {
            synchronized (C1795a.class) {
                if (f5650a == null) {
                    f5650a = new C1795a(context);
                }
            }
        }
        return f5650a;
    }

    /* renamed from: b */
    private void m7441b(String str, String str2) {
        String str3;
        if (str != null && !str.isEmpty() && !str.equals("[]")) {
            Editor edit = this.f5651b.edit();
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str4 = (String) keys.next();
                if (str4.equals("accidental_clicks_config")) {
                    m7441b(jSONObject.getString(str4), str4);
                } else {
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(".");
                        sb.append(str4);
                        str3 = sb.toString();
                    } else {
                        str3 = str4;
                    }
                    edit.putString(str3, jSONObject.getString(str4));
                }
            }
            edit.apply();
        }
    }

    /* renamed from: b */
    public static boolean m7442b(Context context) {
        return VERSION.SDK_INT >= 18 && m7440af(context).mo7656a("adnw_enable_debug_overlay", false);
    }

    /* renamed from: c */
    public static boolean m7443c(Context context) {
        return m7440af(context).mo7656a("adnw_enable_rage_shake", false);
    }

    /* renamed from: c */
    private static boolean m7444c(String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            Class.forName(sb.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static int m7445d(Context context) {
        return m7440af(context).mo7652a("clickguard_time_ms", 0);
    }

    /* renamed from: e */
    public static boolean m7446e(Context context) {
        return m7440af(context).mo7656a("accidental_clicks_config.two_step_confirmation", false);
    }

    /* renamed from: f */
    public static String m7447f(Context context) {
        return m7440af(context).mo7654a("accidental_clicks_config.two_step_confirmation_title", "Continue?");
    }

    /* renamed from: g */
    public static String m7448g(Context context) {
        return m7440af(context).mo7654a("accidental_clicks_config.two_step_confirmation_body", "You will be taken to another destination.");
    }

    /* renamed from: h */
    public static String m7449h(Context context) {
        return m7440af(context).mo7654a("accidental_clicks_config.two_step_confirm_button_text", "Continue");
    }

    /* renamed from: i */
    public static String m7450i(Context context) {
        return m7440af(context).mo7654a("accidental_clicks_config.two_step_cancel_button_text", "Cancel");
    }

    /* renamed from: j */
    public static boolean m7451j(Context context) {
        return m7440af(context).mo7656a("adnw_block_lockscreen", false);
    }

    /* renamed from: k */
    public static boolean m7452k(Context context) {
        return m7440af(context).mo7656a("adnw_block_cta_before_impression", false);
    }

    /* renamed from: l */
    public static boolean m7453l(Context context) {
        return m7440af(context).mo7656a("adnw_android_memory_opt", false);
    }

    /* renamed from: m */
    public static boolean m7454m(Context context) {
        return m7440af(context).mo7656a("adnw_android_disable_blur", false);
    }

    /* renamed from: n */
    public static boolean m7455n(Context context) {
        return m7440af(context).mo7656a("adnw_android_disable_playable_precache", false);
    }

    /* renamed from: o */
    public static boolean m7456o(Context context) {
        return VERSION.SDK_INT >= 19 && m7440af(context).mo7656a("adnw_enable_iab", false);
    }

    /* renamed from: p */
    public static boolean m7457p(Context context) {
        return m7440af(context).mo7656a("adnw_debug_logging", false);
    }

    /* renamed from: q */
    public static boolean m7458q(Context context) {
        return m7440af(context).mo7656a("adnw_text_in_native_carousel", false);
    }

    /* renamed from: r */
    public static int m7459r(Context context) {
        return m7440af(context).mo7652a("adnw_native_carousel_compact_threshold", 225);
    }

    /* renamed from: s */
    public static Set<String> m7460s(Context context) {
        String a = m7440af(context).mo7654a("additional_debug_logging_black_list", "");
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(a);
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.getString(i));
            }
        } catch (JSONException unused) {
        }
        return hashSet;
    }

    /* renamed from: t */
    public static int m7461t(Context context) {
        return m7433a(context, "additional_debug_logging_black_list_percentage", 0);
    }

    /* renamed from: u */
    public static int m7462u(Context context) {
        return m7433a(context, "additional_debug_logging_sampling_percentage", 0);
    }

    /* renamed from: v */
    public static long m7463v(Context context) {
        return m7440af(context).mo7653a("unified_logging_immediate_delay_ms", 500);
    }

    /* renamed from: w */
    public static long m7464w(Context context) {
        return ((long) m7440af(context).mo7652a("unified_logging_dispatch_interval_seconds", 300)) * 1000;
    }

    /* renamed from: x */
    public static int m7465x(Context context) {
        return m7440af(context).mo7652a("unified_logging_event_limit", -1);
    }

    /* renamed from: y */
    public static boolean m7466y(Context context) {
        return m7440af(context).mo7654a("video_and_endcard_autorotate", "autorotate_disabled").equals("autorotate_enabled");
    }

    /* renamed from: z */
    public static boolean m7467z(Context context) {
        return m7440af(context).mo7656a("adnw_wo_network_signal_enabled", false);
    }

    /* renamed from: a */
    public double mo7651a(String str, double d) {
        String string = this.f5651b.getString(str, String.valueOf(d));
        try {
            if (string.equals("null")) {
                return d;
            }
            d = Double.valueOf(string).doubleValue();
            return d;
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: a */
    public int mo7652a(String str, int i) {
        String string = this.f5651b.getString(str, String.valueOf(i));
        try {
            return string.equals("null") ? i : Integer.valueOf(string).intValue();
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public long mo7653a(String str, long j) {
        String string = this.f5651b.getString(str, String.valueOf(j));
        try {
            if (string.equals("null")) {
                return j;
            }
            j = Long.valueOf(string).longValue();
            return j;
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: a */
    public String mo7654a(String str, String str2) {
        String string = this.f5651b.getString(str, str2);
        return (string == null || string.equals("null")) ? str2 : string;
    }

    /* renamed from: a */
    public void mo7655a(String str) {
        m7441b(str, null);
    }

    /* renamed from: a */
    public boolean mo7656a(String str, boolean z) {
        String string = this.f5651b.getString(str, String.valueOf(z));
        return string.equals("null") ? z : Boolean.valueOf(string).booleanValue();
    }
}

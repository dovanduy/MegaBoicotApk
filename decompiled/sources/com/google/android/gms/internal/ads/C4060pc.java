package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.pc */
public final class C4060pc {

    /* renamed from: a */
    private final boolean f13740a;

    /* renamed from: b */
    private final int f13741b;

    /* renamed from: c */
    private final int f13742c;

    /* renamed from: d */
    private final int f13743d;

    /* renamed from: e */
    private final String f13744e;

    /* renamed from: f */
    private final int f13745f;

    /* renamed from: g */
    private final int f13746g;

    /* renamed from: h */
    private final int f13747h;

    /* renamed from: i */
    private final boolean f13748i;

    public C4060pc(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f13740a = m17606a(jSONObject, "aggressive_media_codec_release", aru.f11750B);
        this.f13741b = m17607b(jSONObject, "byte_buffer_precache_limit", aru.f12044m);
        this.f13742c = m17607b(jSONObject, "exo_cache_buffer_size", aru.f12047p);
        this.f13743d = m17607b(jSONObject, "exo_connect_timeout_millis", aru.f12040i);
        this.f13744e = m17608c(jSONObject, "exo_player_version", aru.f12039h);
        this.f13745f = m17607b(jSONObject, "exo_read_timeout_millis", aru.f12041j);
        this.f13746g = m17607b(jSONObject, "load_check_interval_bytes", aru.f12042k);
        this.f13747h = m17607b(jSONObject, "player_precache_limit", aru.f12043l);
        this.f13748i = m17606a(jSONObject, "use_cache_data_source", aru.f11889cH);
    }

    /* renamed from: a */
    private static boolean m17606a(JSONObject jSONObject, String str, ark<Boolean> ark) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return ((Boolean) aoq.m14620f().mo14695a(ark)).booleanValue();
    }

    /* renamed from: b */
    private static int m17607b(JSONObject jSONObject, String str, ark<Integer> ark) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) aoq.m14620f().mo14695a(ark)).intValue();
    }

    /* renamed from: c */
    private static String m17608c(JSONObject jSONObject, String str, ark<String> ark) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) aoq.m14620f().mo14695a(ark);
    }
}

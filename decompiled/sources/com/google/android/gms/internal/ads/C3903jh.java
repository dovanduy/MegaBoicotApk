package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.jh */
final class C3903jh extends C3905jj {

    /* renamed from: a */
    private final /* synthetic */ Context f13403a;

    /* renamed from: b */
    private final /* synthetic */ C3902jg f13404b;

    C3903jh(C3902jg jgVar, Context context) {
        this.f13404b = jgVar;
        this.f13403a = context;
        super(null);
    }

    /* renamed from: a */
    public final void mo12687a() {
        SharedPreferences sharedPreferences = this.f13403a.getSharedPreferences("admob", 0);
        Editor edit = sharedPreferences.edit();
        synchronized (this.f13404b.f13384b) {
            this.f13404b.f13387e = sharedPreferences;
            this.f13404b.f13383a = edit;
            this.f13404b.f13388f = C3902jg.m17077n();
            this.f13404b.f13389g = this.f13404b.f13387e.getBoolean("use_https", this.f13404b.f13389g);
            this.f13404b.f13401s = this.f13404b.f13387e.getBoolean("content_url_opted_out", this.f13404b.f13401s);
            this.f13404b.f13390h = this.f13404b.f13387e.getString("content_url_hashes", this.f13404b.f13390h);
            this.f13404b.f13392j = this.f13404b.f13387e.getBoolean("auto_collect_location", this.f13404b.f13392j);
            this.f13404b.f13402t = this.f13404b.f13387e.getBoolean("content_vertical_opted_out", this.f13404b.f13402t);
            this.f13404b.f13391i = this.f13404b.f13387e.getString("content_vertical_hashes", this.f13404b.f13391i);
            this.f13404b.f13398p = this.f13404b.f13387e.getInt("version_code", this.f13404b.f13398p);
            this.f13404b.f13393k = this.f13404b.f13387e.getString("app_settings_json", this.f13404b.f13393k);
            this.f13404b.f13394l = this.f13404b.f13387e.getLong("app_settings_last_update_ms", this.f13404b.f13394l);
            this.f13404b.f13395m = this.f13404b.f13387e.getLong("app_last_background_time_ms", this.f13404b.f13395m);
            this.f13404b.f13397o = this.f13404b.f13387e.getInt("request_in_session_count", this.f13404b.f13397o);
            this.f13404b.f13396n = this.f13404b.f13387e.getLong("first_ad_req_time_ms", this.f13404b.f13396n);
            this.f13404b.f13399q = this.f13404b.f13387e.getStringSet("never_pool_slots", this.f13404b.f13399q);
            try {
                this.f13404b.f13400r = new JSONObject(this.f13404b.f13387e.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                C3900je.m17432c("Could not convert native advanced settings to json object", e);
            }
            this.f13404b.m17052a(this.f13404b.m17080p());
        }
    }
}

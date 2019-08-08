package com.google.android.gms.internal.ads;

import com.appnext.core.p049a.C1305b;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
public final class bbk {

    /* renamed from: a */
    public final List<bbj> f12563a;

    /* renamed from: b */
    public final long f12564b;

    /* renamed from: c */
    public final List<String> f12565c;

    /* renamed from: d */
    public final List<String> f12566d;

    /* renamed from: e */
    public final List<String> f12567e;

    /* renamed from: f */
    public final List<String> f12568f;

    /* renamed from: g */
    public final List<String> f12569g;

    /* renamed from: h */
    public final boolean f12570h;

    /* renamed from: i */
    public final String f12571i;

    /* renamed from: j */
    public final long f12572j;

    /* renamed from: k */
    public final String f12573k;

    /* renamed from: l */
    public final int f12574l;

    /* renamed from: m */
    public final int f12575m;

    /* renamed from: n */
    public final long f12576n;

    /* renamed from: o */
    public final boolean f12577o;

    /* renamed from: p */
    public final boolean f12578p;

    /* renamed from: q */
    public final boolean f12579q;

    /* renamed from: r */
    public int f12580r;

    /* renamed from: s */
    public int f12581s;

    /* renamed from: t */
    public boolean f12582t;

    public bbk(String str) throws JSONException {
        this(new JSONObject(str));
    }

    public bbk(List<bbj> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, boolean z, String str, long j2, int i, int i2, String str2, int i3, int i4, long j3, boolean z2) {
        this.f12563a = list;
        this.f12564b = j;
        this.f12565c = list2;
        this.f12566d = list3;
        this.f12567e = list4;
        this.f12568f = list5;
        this.f12569g = list6;
        this.f12570h = z;
        this.f12571i = str;
        this.f12572j = -1;
        this.f12580r = 0;
        this.f12581s = 1;
        this.f12573k = null;
        this.f12574l = 0;
        this.f12575m = -1;
        this.f12576n = -1;
        this.f12577o = false;
        this.f12578p = false;
        this.f12579q = false;
        this.f12582t = false;
    }

    public bbk(JSONObject jSONObject) throws JSONException {
        if (C3900je.m17428a(2)) {
            String str = "Mediation Response JSON: ";
            String valueOf = String.valueOf(jSONObject.toString(2));
            C3900je.m17043a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            bbj bbj = new bbj(jSONArray.getJSONObject(i2));
            boolean z = true;
            if (bbj.mo15054a()) {
                this.f12582t = true;
            }
            arrayList.add(bbj);
            if (i < 0) {
                Iterator it = bbj.f12544c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    i = i2;
                }
            }
        }
        this.f12580r = i;
        this.f12581s = jSONArray.length();
        this.f12563a = Collections.unmodifiableList(arrayList);
        this.f12571i = jSONObject.optString("qdata");
        this.f12575m = jSONObject.optInt("fs_model_type", -1);
        long j = -1;
        this.f12576n = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject(C1305b.f4125lS);
        if (optJSONObject != null) {
            this.f12564b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            C3025aw.m10936x();
            this.f12565c = bbt.m15969a(optJSONObject, "click_urls");
            C3025aw.m10936x();
            this.f12566d = bbt.m15969a(optJSONObject, "imp_urls");
            C3025aw.m10936x();
            this.f12567e = bbt.m15969a(optJSONObject, "downloaded_imp_urls");
            C3025aw.m10936x();
            this.f12568f = bbt.m15969a(optJSONObject, "nofill_urls");
            C3025aw.m10936x();
            this.f12569g = bbt.m15969a(optJSONObject, "remote_ping_urls");
            this.f12570h = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1);
            if (optLong > 0) {
                j = 1000 * optLong;
            }
            this.f12572j = j;
            zzaig a = zzaig.m18790a(optJSONObject.optJSONArray("rewards"));
            if (a == null) {
                this.f12573k = null;
                this.f12574l = 0;
            } else {
                this.f12573k = a.f14495a;
                this.f12574l = a.f14496b;
            }
            this.f12577o = optJSONObject.optBoolean("use_displayed_impression", false);
            this.f12578p = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.f12579q = optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            return;
        }
        this.f12564b = -1;
        this.f12565c = null;
        this.f12566d = null;
        this.f12567e = null;
        this.f12568f = null;
        this.f12569g = null;
        this.f12572j = -1;
        this.f12573k = null;
        this.f12574l = 0;
        this.f12577o = false;
        this.f12570h = false;
        this.f12578p = false;
        this.f12579q = false;
    }
}

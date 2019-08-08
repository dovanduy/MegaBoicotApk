package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.appnext.core.C1286Ad;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ey */
public final class C3785ey {

    /* renamed from: A */
    private boolean f12989A = false;

    /* renamed from: B */
    private zzael f12990B;

    /* renamed from: C */
    private boolean f12991C = false;

    /* renamed from: D */
    private String f12992D;

    /* renamed from: E */
    private List<String> f12993E;

    /* renamed from: F */
    private boolean f12994F;

    /* renamed from: G */
    private String f12995G;

    /* renamed from: H */
    private zzaiq f12996H;

    /* renamed from: I */
    private boolean f12997I;

    /* renamed from: J */
    private boolean f12998J;

    /* renamed from: K */
    private boolean f12999K;

    /* renamed from: L */
    private boolean f13000L;

    /* renamed from: M */
    private String f13001M;

    /* renamed from: N */
    private final zzaef f13002N;

    /* renamed from: a */
    private String f13003a;

    /* renamed from: b */
    private String f13004b;

    /* renamed from: c */
    private String f13005c;

    /* renamed from: d */
    private List<String> f13006d;

    /* renamed from: e */
    private String f13007e;

    /* renamed from: f */
    private String f13008f;

    /* renamed from: g */
    private String f13009g;

    /* renamed from: h */
    private List<String> f13010h;

    /* renamed from: i */
    private List<String> f13011i;

    /* renamed from: j */
    private long f13012j = -1;

    /* renamed from: k */
    private boolean f13013k = false;

    /* renamed from: l */
    private final long f13014l = -1;

    /* renamed from: m */
    private List<String> f13015m;

    /* renamed from: n */
    private long f13016n = -1;

    /* renamed from: o */
    private int f13017o = -1;

    /* renamed from: p */
    private boolean f13018p = false;

    /* renamed from: q */
    private boolean f13019q = false;

    /* renamed from: r */
    private boolean f13020r = false;

    /* renamed from: s */
    private boolean f13021s = true;

    /* renamed from: t */
    private boolean f13022t = true;

    /* renamed from: u */
    private String f13023u = "";

    /* renamed from: v */
    private boolean f13024v = false;

    /* renamed from: w */
    private boolean f13025w = false;

    /* renamed from: x */
    private zzaig f13026x;

    /* renamed from: y */
    private List<String> f13027y;

    /* renamed from: z */
    private List<String> f13028z;

    public C3785ey(zzaef zzaef, String str) {
        this.f13004b = str;
        this.f13002N = zzaef;
    }

    /* renamed from: a */
    private static String m16599a(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    /* renamed from: b */
    private static long m16600b(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list != null && !list.isEmpty()) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(36 + String.valueOf(str).length() + String.valueOf(str2).length());
                sb.append("Could not parse float from ");
                sb.append(str);
                sb.append(" header: ");
                sb.append(str2);
                C3900je.m17435e(sb.toString());
            }
        }
        return -1;
    }

    /* renamed from: c */
    private static List<String> m16601c(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list != null && !list.isEmpty()) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m16602d(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return false;
        }
        return Boolean.valueOf((String) list.get(0)).booleanValue();
    }

    /* renamed from: a */
    public final zzaej mo15272a(long j, boolean z) {
        zzaef zzaef = this.f13002N;
        String str = this.f13004b;
        String str2 = this.f13005c;
        List<String> list = this.f13006d;
        List<String> list2 = this.f13010h;
        long j2 = this.f13012j;
        boolean z2 = this.f13013k;
        List<String> list3 = this.f13015m;
        long j3 = this.f13016n;
        int i = this.f13017o;
        String str3 = this.f13003a;
        String str4 = this.f13008f;
        String str5 = this.f13009g;
        String str6 = str3;
        boolean z3 = this.f13018p;
        boolean z4 = this.f13019q;
        boolean z5 = this.f13020r;
        boolean z6 = this.f13021s;
        String str7 = this.f13023u;
        boolean z7 = this.f13024v;
        boolean z8 = this.f13025w;
        zzaig zzaig = this.f13026x;
        List<String> list4 = this.f13027y;
        List<String> list5 = this.f13028z;
        boolean z9 = this.f12989A;
        zzael zzael = this.f12990B;
        boolean z10 = this.f12991C;
        String str8 = this.f12992D;
        List<String> list6 = this.f12993E;
        boolean z11 = this.f12994F;
        String str9 = this.f12995G;
        zzaiq zzaiq = this.f12996H;
        String str10 = this.f13007e;
        boolean z12 = this.f13022t;
        boolean z13 = this.f12997I;
        boolean z14 = this.f12998J;
        int i2 = z ? 2 : 1;
        String str11 = str6;
        long j4 = j;
        zzaej zzaej = new zzaej(zzaef, str, str2, list, list2, j2, z2, -1, list3, j3, i, str11, j4, str4, str5, z3, z4, z5, z6, false, str7, z7, z8, zzaig, list4, list5, z9, zzael, z10, str8, list6, z11, str9, zzaiq, str10, z12, z13, z14, i2, this.f12999K, this.f13011i, this.f13000L, this.f13001M);
        return zzaej;
    }

    /* renamed from: a */
    public final void mo15273a(String str, Map<String, List<String>> map, String str2) {
        this.f13005c = str2;
        mo15274a(map);
    }

    /* renamed from: a */
    public final void mo15274a(Map<String, List<String>> map) {
        int a;
        this.f13003a = m16599a(map, "X-Afma-Ad-Size");
        this.f12995G = m16599a(map, "X-Afma-Ad-Slot-Size");
        List<String> c = m16601c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.f13006d = c;
        }
        this.f13007e = m16599a(map, "X-Afma-Debug-Signals");
        List list = (List) map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f13008f = (String) list.get(0);
        }
        List<String> c2 = m16601c(map, "X-Afma-Tracking-Urls");
        if (c2 != null) {
            this.f13010h = c2;
        }
        List<String> c3 = m16601c(map, "X-Afma-Downloaded-Impression-Urls");
        if (c3 != null) {
            this.f13011i = c3;
        }
        long b = m16600b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.f13012j = b;
        }
        this.f13013k |= m16602d(map, "X-Afma-Mediation");
        List<String> c4 = m16601c(map, "X-Afma-Manual-Tracking-Urls");
        if (c4 != null) {
            this.f13015m = c4;
        }
        long b2 = m16600b(map, "X-Afma-Refresh-Rate");
        if (b2 != -1) {
            this.f13016n = b2;
        }
        List list2 = (List) map.get("X-Afma-Orientation");
        if (list2 != null && !list2.isEmpty()) {
            String str = (String) list2.get(0);
            if (C1286Ad.ORIENTATION_PORTRAIT.equalsIgnoreCase(str)) {
                a = C3025aw.m10919g().mo15546b();
            } else if (C1286Ad.ORIENTATION_LANDSCAPE.equalsIgnoreCase(str)) {
                a = C3025aw.m10919g().mo15533a();
            }
            this.f13017o = a;
        }
        this.f13009g = m16599a(map, "X-Afma-ActiveView");
        List list3 = (List) map.get("X-Afma-Use-HTTPS");
        if (list3 != null && !list3.isEmpty()) {
            this.f13020r = Boolean.valueOf((String) list3.get(0)).booleanValue();
        }
        this.f13018p |= m16602d(map, "X-Afma-Custom-Rendering-Allowed");
        this.f13019q = "native".equals(m16599a(map, "X-Afma-Ad-Format"));
        List list4 = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (list4 != null && !list4.isEmpty()) {
            this.f13021s = Boolean.valueOf((String) list4.get(0)).booleanValue();
        }
        List list5 = (List) map.get("X-Afma-Content-Vertical-Opted-Out");
        if (list5 != null && !list5.isEmpty()) {
            this.f13022t = Boolean.valueOf((String) list5.get(0)).booleanValue();
        }
        List list6 = (List) map.get("X-Afma-Gws-Query-Id");
        if (list6 != null && !list6.isEmpty()) {
            this.f13023u = (String) list6.get(0);
        }
        String a2 = m16599a(map, "X-Afma-Fluid");
        if (a2 != null && a2.equals("height")) {
            this.f13024v = true;
        }
        this.f13025w = "native_express".equals(m16599a(map, "X-Afma-Ad-Format"));
        this.f13026x = zzaig.m18789a(m16599a(map, "X-Afma-Rewards"));
        if (this.f13027y == null) {
            this.f13027y = m16601c(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.f13028z == null) {
            this.f13028z = m16601c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.f12989A |= m16602d(map, "X-Afma-Use-Displayed-Impression");
        this.f12991C |= m16602d(map, "X-Afma-Auto-Collect-Location");
        this.f12992D = m16599a(map, "Set-Cookie");
        String a3 = m16599a(map, "X-Afma-Auto-Protection-Configuration");
        if (a3 == null || TextUtils.isEmpty(a3)) {
            Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter(TtmlNode.ATTR_ID, "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.f13008f)) {
                buildUpon.appendQueryParameter("debugDialog", this.f13008f);
            }
            boolean booleanValue = ((Boolean) aoq.m14620f().mo14695a(aru.f12038g)).booleanValue();
            String builder = buildUpon.toString();
            StringBuilder sb = new StringBuilder(31 + String.valueOf(builder).length());
            sb.append(builder);
            sb.append("&navigationURL={NAVIGATION_URL}");
            this.f12990B = new zzael(booleanValue, Arrays.asList(new String[]{sb.toString()}));
        } else {
            try {
                this.f12990B = zzael.m18785a(new JSONObject(a3));
            } catch (JSONException e) {
                C3900je.m17432c("Error parsing configuration JSON", e);
                this.f12990B = new zzael();
            }
        }
        List<String> c5 = m16601c(map, "X-Afma-Remote-Ping-Urls");
        if (c5 != null) {
            this.f12993E = c5;
        }
        String a4 = m16599a(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(a4)) {
            try {
                this.f12996H = zzaiq.m18791a(new JSONObject(a4));
            } catch (JSONException e2) {
                C3900je.m17432c("Error parsing safe browsing header", e2);
            }
        }
        this.f12994F |= m16602d(map, "X-Afma-Render-In-Browser");
        String a5 = m16599a(map, "X-Afma-Pool");
        if (!TextUtils.isEmpty(a5)) {
            try {
                this.f12997I = new JSONObject(a5).getBoolean("never_pool");
            } catch (JSONException e3) {
                C3900je.m17432c("Error parsing interstitial pool header", e3);
            }
        }
        this.f12998J = m16602d(map, "X-Afma-Custom-Close-Blocked");
        this.f12999K = m16602d(map, "X-Afma-Enable-Omid");
        this.f13000L = m16602d(map, "X-Afma-Disable-Closable-Area");
        this.f13001M = m16599a(map, "X-Afma-Omid-Settings");
    }
}

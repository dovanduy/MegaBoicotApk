package com.google.android.gms.ads.internal.gmsg;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.appnext.base.p046b.C1248f;
import com.facebook.ads.internal.p083j.C1746e;
import com.google.android.exoplayer2.C2793C;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3872id;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3963ln;
import com.google.android.gms.internal.ads.C4061pd;
import com.google.android.gms.internal.ads.C4068pk;
import com.google.android.gms.internal.ads.C4069pl;
import com.google.android.gms.internal.ads.C4089qe;
import com.google.android.gms.internal.ads.C4112ra;
import com.google.android.gms.internal.ads.C4120ri;
import com.google.android.gms.internal.ads.C4122rk;
import com.google.android.gms.internal.ads.C4123rl;
import com.google.android.gms.internal.ads.agw;
import com.google.android.gms.internal.ads.agx;
import com.google.android.gms.internal.ads.ayo;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.gmsg.o */
public final class C3085o {

    /* renamed from: a */
    public static final C3067ae<C4089qe> f8982a = C3086p.f9001a;

    /* renamed from: b */
    public static final C3067ae<C4089qe> f8983b = C3087q.f9002a;

    /* renamed from: c */
    public static final C3067ae<C4089qe> f8984c = C3088r.f9003a;

    /* renamed from: d */
    public static final C3067ae<C4089qe> f8985d = new C3093w();

    /* renamed from: e */
    public static final C3067ae<C4089qe> f8986e = new C3094x();

    /* renamed from: f */
    public static final C3067ae<C4089qe> f8987f = C3089s.f9004a;

    /* renamed from: g */
    public static final C3067ae<Object> f8988g = new C3095y();

    /* renamed from: h */
    public static final C3067ae<C4089qe> f8989h = new C3096z();

    /* renamed from: i */
    public static final C3067ae<C4089qe> f8990i = C3090t.f9005a;

    /* renamed from: j */
    public static final C3067ae<C4089qe> f8991j = new C3063aa();

    /* renamed from: k */
    public static final C3067ae<C4089qe> f8992k = new C3064ab();

    /* renamed from: l */
    public static final C3067ae<C4061pd> f8993l = new C4068pk();

    /* renamed from: m */
    public static final C3067ae<C4061pd> f8994m = new C4069pl();

    /* renamed from: n */
    public static final C3067ae<C4089qe> f8995n = new C3084n();

    /* renamed from: o */
    public static final C3077g f8996o = new C3077g();

    /* renamed from: p */
    public static final C3067ae<C4089qe> f8997p = new C3065ac();

    /* renamed from: q */
    public static final C3067ae<C4089qe> f8998q = new C3066ad();

    /* renamed from: r */
    public static final C3067ae<C4089qe> f8999r = new C3092v();

    /* renamed from: s */
    private static final C3067ae<Object> f9000s = new C3091u();

    /* renamed from: a */
    static final /* synthetic */ void m11098a(ayo ayo, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            C3900je.m17435e("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            agw y = ((C4120ri) ayo).mo15922y();
            if (y != null && y.mo14288a(parse)) {
                parse = y.mo14285a(parse, ((C4112ra) ayo).getContext(), ((C4123rl) ayo).getView(), ((C4112ra) ayo).mo15801d());
            }
        } catch (agx unused) {
            String str2 = "Unable to append parameter to URL: ";
            String valueOf = String.valueOf(str);
            C3900je.m17435e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        C4112ra raVar = (C4112ra) ayo;
        new C3963ln(raVar.getContext(), ((C4122rk) ayo).mo15807k().f14505a, C3872id.m16942a(parse, raVar.getContext()).toString()).mo15475h();
    }

    /* renamed from: a */
    static final /* synthetic */ void m11099a(C4112ra raVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            C3900je.m17435e("URL missing from httpTrack GMSG.");
        } else {
            new C3963ln(raVar.getContext(), ((C4122rk) raVar).mo15807k().f14505a, str).mo15475h();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m11100a(C4120ri riVar, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            agw y = riVar.mo15922y();
            if (y != null) {
                y.mo14286a().mo12627a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            C3900je.m17435e("Could not parse touch parameters from gmsg.");
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m11101b(C4112ra raVar, Map map) {
        String str;
        PackageManager packageManager = raVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString(TtmlNode.ATTR_ID);
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString(TtmlNode.TAG_P);
                        String optString6 = jSONObject2.optString("c");
                        jSONObject2.optString(C1248f.TAG);
                        jSONObject2.optString(C1746e.f5472a);
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                String str2 = "Error parsing the url: ";
                                String valueOf = String.valueOf(optString7);
                                C3900je.m17430b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, C2793C.DEFAULT_BUFFER_SEGMENT_SIZE) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e2) {
                            e = e2;
                            str = "Error constructing openable urls response.";
                        }
                    } catch (JSONException e3) {
                        e = e3;
                        str = "Error parsing the intent data.";
                        C3900je.m17430b(str, e);
                    }
                }
                ((ayo) raVar).mo14987a("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((ayo) raVar).mo14987a("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((ayo) raVar).mo14987a("openableIntents", new JSONObject());
        }
    }

    /* renamed from: c */
    static final /* synthetic */ void m11102c(C4112ra raVar, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            C3900je.m17435e("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = raVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), C2793C.DEFAULT_BUFFER_SEGMENT_SIZE) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((ayo) raVar).mo14986a("openableURLs", (Map<String, ?>) hashMap);
    }
}

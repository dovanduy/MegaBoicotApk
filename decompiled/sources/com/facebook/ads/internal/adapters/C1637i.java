package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.appnext.base.p042a.p045c.C1234a;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.p070a.C1563b;
import com.facebook.ads.internal.p070a.C1564c;
import com.facebook.ads.internal.p070a.C1565d;
import com.facebook.ads.internal.p070a.C1566e;
import com.facebook.ads.internal.p070a.C1566e.C1567a;
import com.facebook.ads.internal.p086m.C1765d;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p093t.C1822e;
import com.facebook.ads.internal.p093t.C1822e.C1832c;
import com.facebook.ads.internal.p093t.C1834g;
import com.facebook.ads.internal.p093t.C1836i;
import com.facebook.ads.internal.p093t.C1837j;
import com.facebook.ads.internal.p093t.C1839l;
import com.facebook.ads.internal.p115w.p117b.C2308c;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2345z;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1782a;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.i */
public class C1637i implements C1567a, AdAdapter {

    /* renamed from: a */
    private static final String f5081a = "i";

    /* renamed from: A */
    private int f5082A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public String f5083B;

    /* renamed from: C */
    private boolean f5084C;

    /* renamed from: D */
    private boolean f5085D;

    /* renamed from: E */
    private boolean f5086E;

    /* renamed from: F */
    private boolean f5087F;

    /* renamed from: G */
    private boolean f5088G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C1802c f5089H;

    /* renamed from: I */
    private C1832c f5090I;

    /* renamed from: b */
    private Context f5091b;

    /* renamed from: c */
    private C1653q f5092c;

    /* renamed from: d */
    private Uri f5093d;

    /* renamed from: e */
    private HashMap<String, String> f5094e = new HashMap<>();

    /* renamed from: f */
    private C1834g f5095f;

    /* renamed from: g */
    private C1834g f5096g;

    /* renamed from: h */
    private C1836i f5097h;

    /* renamed from: i */
    private String f5098i;

    /* renamed from: j */
    private C1565d f5099j;

    /* renamed from: k */
    private Collection<String> f5100k;

    /* renamed from: l */
    private boolean f5101l;

    /* renamed from: m */
    private boolean f5102m;

    /* renamed from: n */
    private int f5103n;

    /* renamed from: o */
    private int f5104o;

    /* renamed from: p */
    private int f5105p;

    /* renamed from: q */
    private int f5106q;

    /* renamed from: r */
    private String f5107r;

    /* renamed from: s */
    private String f5108s;

    /* renamed from: t */
    private C1839l f5109t;

    /* renamed from: u */
    private int f5110u = 200;

    /* renamed from: v */
    private C1834g f5111v;

    /* renamed from: w */
    private String f5112w;

    /* renamed from: x */
    private C1837j f5113x;

    /* renamed from: y */
    private List<C1822e> f5114y;

    /* renamed from: z */
    private int f5115z = -1;

    /* renamed from: C */
    private void m6822C() {
        if (!this.f5088G) {
            if (this.f5089H != null) {
                this.f5089H.mo7685a(this.f5098i);
            }
            this.f5088G = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0181 A[Catch:{ JSONException -> 0x01ad }, LOOP:1: B:49:0x017f->B:50:0x0181, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6824a(org.json.JSONObject r11, java.lang.String r12) {
        /*
            r10 = this;
            boolean r0 = r10.f5085D
            if (r0 == 0) goto L_0x000c
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Adapter already loaded data"
            r11.<init>(r12)
            throw r11
        L_0x000c:
            if (r11 != 0) goto L_0x000f
            return
        L_0x000f:
            android.content.Context r0 = r10.f5091b
            java.lang.String r1 = "Audience Network Loaded"
            com.facebook.ads.internal.p115w.p117b.C2308c.m9020a(r0, r1)
            r10.f5083B = r12
            java.lang.String r0 = "fbad_command"
            java.lang.String r0 = com.facebook.ads.internal.p115w.p117b.C2323k.m9047a(r11, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0027
            r0 = r2
            goto L_0x002b
        L_0x0027:
            android.net.Uri r0 = android.net.Uri.parse(r0)
        L_0x002b:
            r10.f5093d = r0
            r0 = 10
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "advertiser_name"
            r3 = 0
            r0[r3] = r1
            java.lang.String r1 = "title"
            r4 = 1
            r0[r4] = r1
            r1 = 2
            java.lang.String r5 = "subtitle"
            r0[r1] = r5
            r1 = 3
            java.lang.String r5 = "headline"
            r0[r1] = r5
            java.lang.String r1 = "body"
            r5 = 4
            r0[r5] = r1
            r1 = 5
            java.lang.String r6 = "social_context"
            r0[r1] = r6
            r1 = 6
            java.lang.String r6 = "link_description"
            r0[r1] = r6
            r1 = 7
            java.lang.String r6 = "sponsored_translation"
            r0[r1] = r6
            r1 = 8
            java.lang.String r6 = "ad_translation"
            r0[r1] = r6
            r1 = 9
            java.lang.String r6 = "promoted_translation"
            r0[r1] = r6
            int r1 = r0.length
            r6 = r3
        L_0x0067:
            if (r6 >= r1) goto L_0x0077
            r7 = r0[r6]
            java.util.HashMap<java.lang.String, java.lang.String> r8 = r10.f5094e
            java.lang.String r9 = com.facebook.ads.internal.p115w.p117b.C2323k.m9047a(r11, r7)
            r8.put(r7, r9)
            int r6 = r6 + 1
            goto L_0x0067
        L_0x0077:
            java.lang.String r0 = "call_to_action"
            java.lang.String r0 = com.facebook.ads.internal.p115w.p117b.C2323k.m9047a(r11, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x008a
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r10.f5094e
            java.lang.String r6 = "call_to_action"
            r1.put(r6, r0)
        L_0x008a:
            java.lang.String r0 = "icon"
            org.json.JSONObject r0 = r11.optJSONObject(r0)
            com.facebook.ads.internal.t.g r0 = com.facebook.ads.internal.p093t.C1834g.m7705a(r0)
            r10.f5095f = r0
            java.lang.String r0 = "image"
            org.json.JSONObject r0 = r11.optJSONObject(r0)
            com.facebook.ads.internal.t.g r0 = com.facebook.ads.internal.p093t.C1834g.m7705a(r0)
            r10.f5096g = r0
            java.lang.String r0 = "star_rating"
            org.json.JSONObject r0 = r11.optJSONObject(r0)
            com.facebook.ads.internal.t.i r0 = com.facebook.ads.internal.p093t.C1836i.m7710a(r0)
            r10.f5097h = r0
            java.lang.String r0 = "used_report_url"
            java.lang.String r0 = com.facebook.ads.internal.p115w.p117b.C2323k.m9047a(r11, r0)
            r10.f5098i = r0
            java.lang.String r0 = "enable_view_log"
            boolean r0 = r11.optBoolean(r0)
            r10.f5101l = r0
            java.lang.String r0 = "enable_snapshot_log"
            boolean r0 = r11.optBoolean(r0)
            r10.f5102m = r0
            java.lang.String r0 = "snapshot_log_delay_second"
            int r0 = r11.optInt(r0, r5)
            r10.f5103n = r0
            java.lang.String r0 = "snapshot_compress_quality"
            int r0 = r11.optInt(r0, r3)
            r10.f5104o = r0
            java.lang.String r0 = "viewability_check_initial_delay"
            int r0 = r11.optInt(r0, r3)
            r10.f5105p = r0
            java.lang.String r0 = "viewability_check_interval"
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = r11.optInt(r0, r1)
            r10.f5106q = r0
            java.lang.String r0 = "ad_choices_icon"
            org.json.JSONObject r0 = r11.optJSONObject(r0)
            java.lang.String r1 = "native_ui_config"
            org.json.JSONObject r1 = r11.optJSONObject(r1)
            if (r1 == 0) goto L_0x0103
            int r5 = r1.length()     // Catch:{ JSONException -> 0x0107 }
            if (r5 != 0) goto L_0x00fd
            goto L_0x0103
        L_0x00fd:
            com.facebook.ads.internal.t.j r5 = new com.facebook.ads.internal.t.j     // Catch:{ JSONException -> 0x0107 }
            r5.<init>(r1)     // Catch:{ JSONException -> 0x0107 }
            goto L_0x0104
        L_0x0103:
            r5 = r2
        L_0x0104:
            r10.f5113x = r5     // Catch:{ JSONException -> 0x0107 }
            goto L_0x0109
        L_0x0107:
            r10.f5113x = r2
        L_0x0109:
            if (r0 == 0) goto L_0x0111
            com.facebook.ads.internal.t.g r0 = com.facebook.ads.internal.p093t.C1834g.m7705a(r0)
            r10.f5111v = r0
        L_0x0111:
            java.lang.String r0 = "ad_choices_link_url"
            java.lang.String r0 = com.facebook.ads.internal.p115w.p117b.C2323k.m9047a(r11, r0)
            r10.f5112w = r0
            java.lang.String r0 = "invalidation_behavior"
            java.lang.String r0 = r11.optString(r0)
            com.facebook.ads.internal.a.d r0 = com.facebook.ads.internal.p070a.C1565d.m6496a(r0)
            r10.f5099j = r0
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0131 }
            java.lang.String r1 = "detection_strings"
            java.lang.String r1 = r11.optString(r1)     // Catch:{ JSONException -> 0x0131 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0131 }
            goto L_0x0136
        L_0x0131:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r2
        L_0x0136:
            java.util.Collection r0 = com.facebook.ads.internal.p070a.C1566e.m6497a(r0)
            r10.f5100k = r0
            java.lang.String r0 = "video_url"
            java.lang.String r0 = com.facebook.ads.internal.p115w.p117b.C2323k.m9047a(r11, r0)
            r10.f5107r = r0
            java.lang.String r0 = "video_mpd"
            java.lang.String r0 = com.facebook.ads.internal.p115w.p117b.C2323k.m9047a(r11, r0)
            r10.f5108s = r0
            java.lang.String r0 = "video_autoplay_enabled"
            boolean r0 = r11.has(r0)
            if (r0 != 0) goto L_0x0159
            com.facebook.ads.internal.t.l r0 = com.facebook.ads.internal.p093t.C1839l.DEFAULT
        L_0x0156:
            r10.f5109t = r0
            goto L_0x0167
        L_0x0159:
            java.lang.String r0 = "video_autoplay_enabled"
            boolean r0 = r11.optBoolean(r0)
            if (r0 == 0) goto L_0x0164
            com.facebook.ads.internal.t.l r0 = com.facebook.ads.internal.p093t.C1839l.ON
            goto L_0x0156
        L_0x0164:
            com.facebook.ads.internal.t.l r0 = com.facebook.ads.internal.p093t.C1839l.OFF
            goto L_0x0156
        L_0x0167:
            java.lang.String r0 = "carousel"
            org.json.JSONArray r11 = r11.optJSONArray(r0)     // Catch:{ JSONException -> 0x01ad }
            if (r11 == 0) goto L_0x01b5
            int r0 = r11.length()     // Catch:{ JSONException -> 0x01ad }
            if (r0 <= 0) goto L_0x01b5
            int r0 = r11.length()     // Catch:{ JSONException -> 0x01ad }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ JSONException -> 0x01ad }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x01ad }
            r5 = r3
        L_0x017f:
            if (r5 >= r0) goto L_0x01aa
            com.facebook.ads.internal.adapters.i r6 = new com.facebook.ads.internal.adapters.i     // Catch:{ JSONException -> 0x01ad }
            r6.<init>()     // Catch:{ JSONException -> 0x01ad }
            android.content.Context r7 = r10.f5091b     // Catch:{ JSONException -> 0x01ad }
            org.json.JSONObject r8 = r11.getJSONObject(r5)     // Catch:{ JSONException -> 0x01ad }
            com.facebook.ads.internal.s.c r9 = r10.f5089H     // Catch:{ JSONException -> 0x01ad }
            r6.f5084C = r4     // Catch:{ JSONException -> 0x01ad }
            r6.f5091b = r7     // Catch:{ JSONException -> 0x01ad }
            r6.f5089H = r9     // Catch:{ JSONException -> 0x01ad }
            r6.f5115z = r5     // Catch:{ JSONException -> 0x01ad }
            r6.f5082A = r0     // Catch:{ JSONException -> 0x01ad }
            r6.m6824a(r8, r12)     // Catch:{ JSONException -> 0x01ad }
            com.facebook.ads.internal.t.e r7 = new com.facebook.ads.internal.t.e     // Catch:{ JSONException -> 0x01ad }
            android.content.Context r8 = r10.f5091b     // Catch:{ JSONException -> 0x01ad }
            com.facebook.ads.internal.t.e$c r9 = r10.f5090I     // Catch:{ JSONException -> 0x01ad }
            r7.<init>(r8, r6, r2, r9)     // Catch:{ JSONException -> 0x01ad }
            r1.add(r7)     // Catch:{ JSONException -> 0x01ad }
            int r5 = r5 + 1
            goto L_0x017f
        L_0x01aa:
            r10.f5114y = r1     // Catch:{ JSONException -> 0x01ad }
            goto L_0x01b5
        L_0x01ad:
            r11 = move-exception
            java.lang.String r12 = f5081a
            java.lang.String r0 = "Unable to parse carousel data."
            android.util.Log.e(r12, r0, r11)
        L_0x01b5:
            r10.f5085D = r4
            boolean r11 = r10.f5084C
            if (r11 != 0) goto L_0x01cb
            java.util.HashMap<java.lang.String, java.lang.String> r11 = r10.f5094e
            java.lang.String r12 = "advertiser_name"
            java.lang.Object r11 = r11.get(r12)
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x01df
        L_0x01cb:
            java.util.HashMap<java.lang.String, java.lang.String> r11 = r10.f5094e
            java.lang.String r12 = "title"
            java.lang.Object r11 = r11.get(r12)
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x01f4
            boolean r11 = r10.f5084C
            if (r11 == 0) goto L_0x01f4
        L_0x01df:
            com.facebook.ads.internal.t.g r11 = r10.f5095f
            if (r11 != 0) goto L_0x01e7
            boolean r11 = r10.f5084C
            if (r11 == 0) goto L_0x01f4
        L_0x01e7:
            com.facebook.ads.internal.t.g r11 = r10.f5096g
            if (r11 != 0) goto L_0x01f3
            com.facebook.ads.internal.protocol.AdPlacementType r11 = r10.getPlacementType()
            com.facebook.ads.internal.protocol.AdPlacementType r12 = com.facebook.ads.internal.protocol.AdPlacementType.NATIVE_BANNER
            if (r11 != r12) goto L_0x01f4
        L_0x01f3:
            r3 = r4
        L_0x01f4:
            r10.f5086E = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.C1637i.m6824a(org.json.JSONObject, java.lang.String):void");
    }

    /* renamed from: A */
    public boolean mo7279A() {
        return this.f5085D && this.f5086E;
    }

    /* renamed from: B */
    public boolean mo7280B() {
        return this.f5084C;
    }

    /* renamed from: a */
    public C1565d mo7060a() {
        return this.f5099j;
    }

    /* renamed from: a */
    public String mo7281a(String str) {
        if (!mo7279A()) {
            return null;
        }
        m6822C();
        return (String) this.f5094e.get(str);
    }

    /* renamed from: a */
    public void mo7282a(int i) {
    }

    /* renamed from: a */
    public void mo7283a(Context context, C1653q qVar, C1802c cVar, Map<String, Object> map, C1832c cVar2) {
        this.f5091b = context;
        this.f5092c = qVar;
        this.f5089H = cVar;
        this.f5090I = cVar2;
        JSONObject jSONObject = (JSONObject) map.get("data");
        C1765d dVar = (C1765d) map.get("definition");
        this.f5110u = dVar != null ? dVar.mo7615k() : 200;
        m6824a(jSONObject, C2323k.m9047a(jSONObject, C1234a.f3911gK));
        if (C1566e.m6498a(context, this, cVar)) {
            qVar.mo7054a(this, new C1782a(AdErrorType.NO_FILL, "No Fill"));
            return;
        }
        if (qVar != null) {
            qVar.mo7053a(this);
        }
    }

    /* renamed from: a */
    public void mo7284a(View view, List<View> list) {
    }

    /* renamed from: a */
    public void mo7285a(C1653q qVar) {
        this.f5092c = qVar;
    }

    /* renamed from: a */
    public void mo7286a(Map<String, String> map) {
        if (mo7279A() && !this.f5087F) {
            if (this.f5092c != null) {
                this.f5092c.mo7055b(this);
            }
            final HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (this.f5084C) {
                hashMap.put("cardind", String.valueOf(this.f5115z));
                hashMap.put("cardcnt", String.valueOf(this.f5082A));
            }
            if (!TextUtils.isEmpty(getClientToken()) && this.f5089H != null) {
                this.f5089H.mo7686a(getClientToken(), hashMap);
            }
            if (mo7291d() || mo7296h()) {
                try {
                    final HashMap hashMap2 = new HashMap();
                    if (map.containsKey("view")) {
                        hashMap2.put("view", map.get("view"));
                    }
                    if (map.containsKey("snapshot")) {
                        hashMap2.put("snapshot", map.get("snapshot"));
                    }
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            if (!TextUtils.isEmpty(C1637i.this.f5083B)) {
                                HashMap hashMap = new HashMap();
                                hashMap.putAll(hashMap);
                                hashMap.putAll(hashMap2);
                                if (C1637i.this.f5089H != null) {
                                    C1637i.this.f5089H.mo7693f(C1637i.this.f5083B, hashMap);
                                }
                            }
                        }
                    }, (long) (this.f5103n * AdError.NETWORK_ERROR_CODE));
                } catch (Exception unused) {
                }
            }
            this.f5087F = true;
        }
    }

    /* renamed from: b */
    public Collection<String> mo7061b() {
        return this.f5100k;
    }

    /* renamed from: b */
    public void mo7287b(Map<String, String> map) {
        if (this.f5089H != null) {
            this.f5089H.mo7698k(this.f5083B, map);
        }
    }

    /* renamed from: c */
    public void mo7288c() {
        if (this.f5114y != null && !this.f5114y.isEmpty()) {
            for (C1822e z : this.f5114y) {
                z.mo7773z();
            }
        }
    }

    /* renamed from: c */
    public void mo7289c(Map<String, String> map) {
        if (this.f5089H != null) {
            this.f5089H.mo7697j(this.f5083B, map);
        }
    }

    /* renamed from: d */
    public void mo7290d(Map<String, String> map) {
        if (this.f5089H != null) {
            this.f5089H.mo7696i(this.f5083B, map);
        }
    }

    /* renamed from: d */
    public boolean mo7291d() {
        return mo7279A() && this.f5101l;
    }

    /* renamed from: e */
    public void mo7292e(Map<String, String> map) {
        if (mo7279A()) {
            if (!C1795a.m7451j(this.f5091b) || !C2345z.m9095a(map)) {
                HashMap hashMap = new HashMap();
                if (map != null) {
                    hashMap.putAll(map);
                }
                C2308c.m9020a(this.f5091b, "Click logged");
                if (this.f5092c != null) {
                    this.f5092c.mo7056c(this);
                }
                if (this.f5084C) {
                    hashMap.put("cardind", String.valueOf(this.f5115z));
                    hashMap.put("cardcnt", String.valueOf(this.f5082A));
                }
                C1563b a = C1564c.m6493a(this.f5091b, this.f5089H, this.f5083B, this.f5093d, hashMap);
                if (a != null) {
                    try {
                        a.mo7058a();
                        return;
                    } catch (Exception e) {
                        Log.e(f5081a, "Error executing action", e);
                    }
                }
                return;
            }
            Log.e(f5081a, "Click happened on lockscreen ad");
        }
    }

    /* renamed from: e */
    public boolean mo7293e() {
        return mo7279A() && this.f5113x != null;
    }

    /* renamed from: f */
    public boolean mo7294f() {
        return mo7279A() && this.f5093d != null;
    }

    /* renamed from: g */
    public boolean mo7295g() {
        return true;
    }

    public String getClientToken() {
        return this.f5083B;
    }

    public AdPlacementType getPlacementType() {
        return AdPlacementType.NATIVE;
    }

    /* renamed from: h */
    public boolean mo7296h() {
        return mo7279A() && this.f5102m;
    }

    /* renamed from: i */
    public int mo7297i() {
        if (this.f5104o < 0 || this.f5104o > 100) {
            return 0;
        }
        return this.f5104o;
    }

    /* renamed from: j */
    public int mo7298j() {
        return this.f5105p;
    }

    /* renamed from: k */
    public int mo7299k() {
        return this.f5106q;
    }

    /* renamed from: l */
    public C1834g mo7300l() {
        if (!mo7279A()) {
            return null;
        }
        return this.f5095f;
    }

    /* renamed from: m */
    public C1834g mo7301m() {
        if (!mo7279A()) {
            return null;
        }
        return this.f5096g;
    }

    /* renamed from: n */
    public C1837j mo7302n() {
        if (!mo7279A()) {
            return null;
        }
        return this.f5113x;
    }

    /* renamed from: o */
    public String mo7303o() {
        StringBuilder sb;
        String substring;
        if (!mo7279A()) {
            return null;
        }
        m6822C();
        String str = (String) this.f5094e.get(TtmlNode.TAG_BODY);
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, " ", true);
            if (str.length() > 90 && (str.length() > 93 || !str.endsWith("..."))) {
                int i = 0;
                while (stringTokenizer.hasMoreTokens()) {
                    int length = stringTokenizer.nextToken().length() + i;
                    if (length < 90) {
                        i = length;
                    }
                }
                if (i == 0) {
                    sb = new StringBuilder();
                    substring = str.substring(0, 90);
                } else {
                    sb = new StringBuilder();
                    substring = str.substring(0, i);
                }
                sb.append(substring);
                sb.append("...");
                return sb.toString();
            }
        }
        return str;
    }

    public void onDestroy() {
    }

    /* renamed from: p */
    public C1836i mo7304p() {
        if (!mo7279A()) {
            return null;
        }
        m6822C();
        return this.f5097h;
    }

    /* renamed from: q */
    public C1834g mo7305q() {
        if (!mo7279A()) {
            return null;
        }
        return this.f5111v;
    }

    /* renamed from: r */
    public String mo7306r() {
        if (!mo7279A()) {
            return null;
        }
        return this.f5112w;
    }

    /* renamed from: s */
    public String mo7307s() {
        if (!mo7279A()) {
            return null;
        }
        return "AdChoices";
    }

    /* renamed from: t */
    public String mo7308t() {
        if (!mo7279A()) {
            return null;
        }
        return this.f5107r;
    }

    /* renamed from: u */
    public String mo7309u() {
        if (!mo7279A()) {
            return null;
        }
        return this.f5108s;
    }

    /* renamed from: v */
    public C1839l mo7310v() {
        return !mo7279A() ? C1839l.DEFAULT : this.f5109t;
    }

    /* renamed from: w */
    public int mo7311w() {
        return this.f5110u;
    }

    /* renamed from: x */
    public List<C1822e> mo7312x() {
        if (!mo7279A()) {
            return null;
        }
        return this.f5114y;
    }

    /* renamed from: y */
    public int mo7313y() {
        return this.f5115z;
    }

    /* renamed from: z */
    public int mo7314z() {
        return this.f5082A;
    }
}

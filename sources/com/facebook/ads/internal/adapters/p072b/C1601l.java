package com.facebook.ads.internal.adapters.p072b;

import com.facebook.ads.internal.adapters.p072b.C1591e.C1594b;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.b.l */
public class C1601l implements Serializable {
    private static final long serialVersionUID = 85021702336014823L;

    /* renamed from: a */
    private final C1591e f4937a;

    /* renamed from: b */
    private final C1598i f4938b;

    /* renamed from: c */
    private final C1588d f4939c;

    /* renamed from: d */
    private final boolean f4940d;

    private C1601l(C1591e eVar, C1598i iVar, C1588d dVar, boolean z) {
        this.f4937a = eVar;
        this.f4938b = iVar;
        this.f4939c = dVar;
        this.f4940d = z;
    }

    /* renamed from: a */
    static C1601l m6668a(JSONObject jSONObject) {
        C1591e a = new C1594b().mo7154a(jSONObject.optString("title")).mo7156b(jSONObject.optString("subtitle")).mo7157c(jSONObject.optString(TtmlNode.TAG_BODY)).mo7155a();
        C1598i iVar = new C1598i(jSONObject.optString("fbad_command"), jSONObject.optString("call_to_action"));
        boolean optBoolean = jSONObject.optBoolean("video_autoplay_enabled");
        boolean optBoolean2 = jSONObject.optBoolean("is_watch_and_browse");
        C1590a b = new C1590a().mo7139a(jSONObject.optString("video_url")).mo7140a(optBoolean).mo7144b(jSONObject.optBoolean("is_audio_muted", true));
        int i = 0;
        if (optBoolean) {
            i = jSONObject.optInt("unskippable_seconds", 0);
        }
        C1590a a2 = b.mo7137a(i);
        JSONObject optJSONObject = jSONObject.optJSONObject("image");
        if (optJSONObject != null) {
            a2.mo7143b(optJSONObject.optString("url")).mo7145c(optJSONObject.optInt("width")).mo7146d(optJSONObject.optInt("height"));
        }
        a2.mo7138a(C1605n.m6686a(jSONObject));
        return new C1601l(a, iVar, a2.mo7141a(), optBoolean2);
    }

    /* renamed from: a */
    public C1591e mo7196a() {
        return this.f4937a;
    }

    /* renamed from: b */
    public C1598i mo7197b() {
        return this.f4938b;
    }

    /* renamed from: c */
    public C1588d mo7198c() {
        return this.f4939c;
    }

    /* renamed from: d */
    public boolean mo7199d() {
        return this.f4940d;
    }
}

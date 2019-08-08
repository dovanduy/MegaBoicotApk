package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.j */
public final class C3895j {

    /* renamed from: a */
    private final boolean f13371a;

    /* renamed from: b */
    private final boolean f13372b;

    /* renamed from: c */
    private final boolean f13373c;

    /* renamed from: d */
    private final boolean f13374d;

    /* renamed from: e */
    private final boolean f13375e;

    private C3895j(C3949l lVar) {
        this.f13371a = lVar.f13486a;
        this.f13372b = lVar.f13487b;
        this.f13373c = lVar.f13488c;
        this.f13374d = lVar.f13489d;
        this.f13375e = lVar.f13490e;
    }

    /* renamed from: a */
    public final JSONObject mo15476a() {
        try {
            return new JSONObject().put("sms", this.f13371a).put("tel", this.f13372b).put("calendar", this.f13373c).put("storePicture", this.f13374d).put("inlineVideo", this.f13375e);
        } catch (JSONException e) {
            C3900je.m17430b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C3025aw;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.fp */
public final class C3803fp implements C3779es {

    /* renamed from: a */
    private bar<JSONObject, JSONObject> f13115a;

    /* renamed from: b */
    private bar<JSONObject, JSONObject> f13116b;

    public C3803fp(Context context) {
        this.f13115a = C3025aw.m10931s().mo15045a(context, zzang.m18792a()).mo15048a("google.afma.request.getAdDictionary", baw.f12519a, baw.f12519a);
        this.f13116b = C3025aw.m10931s().mo15045a(context, zzang.m18792a()).mo15048a("google.afma.sdkConstants.getSdkConstants", baw.f12519a, baw.f12519a);
    }

    /* renamed from: a */
    public final bar<JSONObject, JSONObject> mo15270a() {
        return this.f13115a;
    }

    /* renamed from: b */
    public final bar<JSONObject, JSONObject> mo15271b() {
        return this.f13116b;
    }
}

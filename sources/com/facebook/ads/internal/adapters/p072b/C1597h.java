package com.facebook.ads.internal.adapters.p072b;

import android.graphics.Color;
import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.b.h */
public class C1597h implements Serializable {

    /* renamed from: a */
    public static final int f4909a = Color.parseColor("#90949c");

    /* renamed from: b */
    public static final int f4910b = Color.parseColor("#4b4f56");

    /* renamed from: c */
    public static final int f4911c = Color.parseColor("#f6f7f9");

    /* renamed from: d */
    public static final int f4912d = Color.parseColor("#ff4080ff");

    /* renamed from: e */
    public static final int f4913e = Color.parseColor("#23272F");

    /* renamed from: f */
    public static final int f4914f = Color.parseColor("#ff4080ff");
    private static final long serialVersionUID = 8946536326456653736L;

    /* renamed from: g */
    private int f4915g = f4909a;

    /* renamed from: h */
    private int f4916h = f4910b;

    /* renamed from: i */
    private int f4917i = -16777216;

    /* renamed from: j */
    private int f4918j = f4911c;

    /* renamed from: k */
    private int f4919k = f4912d;

    /* renamed from: l */
    private int f4920l = -1;

    /* renamed from: m */
    private int f4921m = -16777216;

    /* renamed from: a */
    public static C1597h m6639a(JSONObject jSONObject) {
        C1597h hVar = new C1597h();
        if (jSONObject != null) {
            String optString = jSONObject.optString("accent_color");
            String optString2 = jSONObject.optString("body_color");
            String optString3 = jSONObject.optString("subtitle_color");
            String optString4 = jSONObject.optString("bg_color");
            String optString5 = jSONObject.optString("cta_color");
            String optString6 = jSONObject.optString("cta_text_color");
            String optString7 = jSONObject.optString("title_color");
            if (!TextUtils.isEmpty(optString)) {
                hVar.f4915g = Color.parseColor(optString);
            }
            if (!TextUtils.isEmpty(optString2)) {
                hVar.f4916h = Color.parseColor(optString2);
            }
            if (!TextUtils.isEmpty(optString3)) {
                hVar.f4917i = Color.parseColor(optString3);
            }
            if (!TextUtils.isEmpty(optString4)) {
                hVar.f4918j = Color.parseColor(optString4);
            }
            if (!TextUtils.isEmpty(optString5)) {
                hVar.f4919k = Color.parseColor(optString5);
            }
            if (!TextUtils.isEmpty(optString6)) {
                hVar.f4920l = Color.parseColor(optString6);
            }
            if (!TextUtils.isEmpty(optString7)) {
                hVar.f4921m = Color.parseColor(optString7);
            }
        }
        return hVar;
    }

    /* renamed from: a */
    public int mo7170a(boolean z) {
        if (z) {
            return -1;
        }
        return this.f4915g;
    }

    /* renamed from: a */
    public void mo7171a(int i) {
        this.f4919k = i;
    }

    /* renamed from: b */
    public int mo7172b(boolean z) {
        if (z) {
            return -1;
        }
        return this.f4916h;
    }

    /* renamed from: c */
    public int mo7173c(boolean z) {
        if (z) {
            return -1;
        }
        return this.f4917i;
    }

    /* renamed from: d */
    public int mo7174d(boolean z) {
        return z ? f4913e : this.f4918j;
    }

    /* renamed from: e */
    public int mo7175e(boolean z) {
        if (z) {
            return -1;
        }
        return this.f4919k;
    }

    /* renamed from: f */
    public int mo7176f(boolean z) {
        return z ? f4914f : this.f4920l;
    }

    /* renamed from: g */
    public int mo7177g(boolean z) {
        if (z) {
            return -1;
        }
        return this.f4921m;
    }
}

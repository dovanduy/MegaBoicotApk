package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
public final class zzaiq extends AbstractSafeParcelable {
    public static final Creator<zzaiq> CREATOR = new C3860hs();

    /* renamed from: a */
    public final String f14497a;

    /* renamed from: b */
    public final String f14498b;

    /* renamed from: c */
    public final boolean f14499c;

    /* renamed from: d */
    public final boolean f14500d;

    /* renamed from: e */
    public final List<String> f14501e;

    /* renamed from: f */
    public final boolean f14502f;

    /* renamed from: g */
    public final boolean f14503g;

    /* renamed from: h */
    public final List<String> f14504h;

    public zzaiq(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.f14497a = str;
        this.f14498b = str2;
        this.f14499c = z;
        this.f14500d = z2;
        this.f14501e = list;
        this.f14502f = z3;
        this.f14503g = z4;
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        this.f14504h = list2;
    }

    /* renamed from: a */
    public static zzaiq m18791a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        zzaiq zzaiq = new zzaiq(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), C3958li.m17339a(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), C3958li.m17339a(jSONObject.optJSONArray("webview_permissions"), null));
        return zzaiq;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 2, this.f14497a, false);
        C3511b.m12609a(parcel, 3, this.f14498b, false);
        C3511b.m12612a(parcel, 4, this.f14499c);
        C3511b.m12612a(parcel, 5, this.f14500d);
        C3511b.m12619b(parcel, 6, this.f14501e, false);
        C3511b.m12612a(parcel, 7, this.f14502f);
        C3511b.m12612a(parcel, 8, this.f14503g);
        C3511b.m12619b(parcel, 9, this.f14504h, false);
        C3511b.m12596a(parcel, a);
    }
}

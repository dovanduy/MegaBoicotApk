package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.C3165a;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import org.json.JSONArray;
import org.json.JSONException;

@C3718cm
public final class zzaig extends AbstractSafeParcelable {
    public static final Creator<zzaig> CREATOR = new C3851hj();

    /* renamed from: a */
    public final String f14495a;

    /* renamed from: b */
    public final int f14496b;

    public zzaig(C3165a aVar) {
        this(aVar.mo12834a(), aVar.mo12835b());
    }

    public zzaig(String str, int i) {
        this.f14495a = str;
        this.f14496b = i;
    }

    /* renamed from: a */
    public static zzaig m18789a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m18790a(new JSONArray(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static zzaig m18790a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzaig(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zzaig)) {
            return false;
        }
        zzaig zzaig = (zzaig) obj;
        if (C3504r.m12550a(this.f14495a, zzaig.f14495a) && C3504r.m12550a(Integer.valueOf(this.f14496b), Integer.valueOf(zzaig.f14496b))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C3504r.m12548a(this.f14495a, Integer.valueOf(this.f14496b));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 2, this.f14495a, false);
        C3511b.m12599a(parcel, 3, this.f14496b);
        C3511b.m12596a(parcel, a);
    }
}

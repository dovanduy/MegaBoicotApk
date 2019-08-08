package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.List;

public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<TokenData> CREATOR = new C3234d();

    /* renamed from: a */
    private final int f9230a;

    /* renamed from: b */
    private final String f9231b;

    /* renamed from: c */
    private final Long f9232c;

    /* renamed from: d */
    private final boolean f9233d;

    /* renamed from: e */
    private final boolean f9234e;

    /* renamed from: f */
    private final List<String> f9235f;

    /* renamed from: g */
    private final String f9236g;

    TokenData(int i, String str, Long l, boolean z, boolean z2, List<String> list, String str2) {
        this.f9230a = i;
        this.f9231b = C3513t.m12627a(str);
        this.f9232c = l;
        this.f9233d = z;
        this.f9234e = z2;
        this.f9235f = list;
        this.f9236g = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.f9231b, tokenData.f9231b) || !C3504r.m12550a(this.f9232c, tokenData.f9232c) || this.f9233d != tokenData.f9233d || this.f9234e != tokenData.f9234e || !C3504r.m12550a(this.f9235f, tokenData.f9235f) || !C3504r.m12550a(this.f9236g, tokenData.f9236g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C3504r.m12548a(this.f9231b, this.f9232c, Boolean.valueOf(this.f9233d), Boolean.valueOf(this.f9234e), this.f9235f, this.f9236g);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9230a);
        C3511b.m12609a(parcel, 2, this.f9231b, false);
        C3511b.m12608a(parcel, 3, this.f9232c, false);
        C3511b.m12612a(parcel, 4, this.f9233d);
        C3511b.m12612a(parcel, 5, this.f9234e);
        C3511b.m12619b(parcel, 6, this.f9235f, false);
        C3511b.m12609a(parcel, 7, this.f9236g, false);
        C3511b.m12596a(parcel, a);
    }
}

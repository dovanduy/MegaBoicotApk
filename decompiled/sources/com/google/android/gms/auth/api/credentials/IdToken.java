package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<IdToken> CREATOR = new C3189g();

    /* renamed from: a */
    private final String f9320a;

    /* renamed from: b */
    private final String f9321b;

    public IdToken(String str, String str2) {
        C3513t.m12636b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        C3513t.m12636b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f9320a = str;
        this.f9321b = str2;
    }

    /* renamed from: a */
    public final String mo12924a() {
        return this.f9320a;
    }

    /* renamed from: b */
    public final String mo12925b() {
        return this.f9321b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 1, mo12924a(), false);
        C3511b.m12609a(parcel, 2, mo12925b(), false);
        C3511b.m12596a(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return C3504r.m12550a(this.f9320a, idToken.f9320a) && C3504r.m12550a(this.f9321b, idToken.f9321b);
    }
}

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final Creator<ClientIdentity> CREATOR = new C3518y();

    /* renamed from: a */
    private final int f9921a;

    /* renamed from: b */
    private final String f9922b;

    public ClientIdentity(int i, String str) {
        this.f9921a = i;
        this.f9922b = str;
    }

    public int hashCode() {
        return this.f9921a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f9921a == this.f9921a && C3504r.m12550a(clientIdentity.f9922b, this.f9922b);
    }

    public String toString() {
        int i = this.f9921a;
        String str = this.f9922b;
        StringBuilder sb = new StringBuilder(12 + String.valueOf(str).length());
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9921a);
        C3511b.m12609a(parcel, 2, this.f9922b, false);
        C3511b.m12596a(parcel, a);
    }
}

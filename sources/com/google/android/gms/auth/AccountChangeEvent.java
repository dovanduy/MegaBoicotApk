package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEvent> CREATOR = new C3171a();

    /* renamed from: a */
    private final int f9218a;

    /* renamed from: b */
    private final long f9219b;

    /* renamed from: c */
    private final String f9220c;

    /* renamed from: d */
    private final int f9221d;

    /* renamed from: e */
    private final int f9222e;

    /* renamed from: f */
    private final String f9223f;

    AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f9218a = i;
        this.f9219b = j;
        this.f9220c = (String) C3513t.m12625a(str);
        this.f9221d = i2;
        this.f9222e = i3;
        this.f9223f = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9218a);
        C3511b.m12600a(parcel, 2, this.f9219b);
        C3511b.m12609a(parcel, 3, this.f9220c, false);
        C3511b.m12599a(parcel, 4, this.f9221d);
        C3511b.m12599a(parcel, 5, this.f9222e);
        C3511b.m12609a(parcel, 6, this.f9223f, false);
        C3511b.m12596a(parcel, a);
    }

    public String toString() {
        String str = "UNKNOWN";
        switch (this.f9221d) {
            case 1:
                str = "ADDED";
                break;
            case 2:
                str = "REMOVED";
                break;
            case 3:
                str = "RENAMED_FROM";
                break;
            case 4:
                str = "RENAMED_TO";
                break;
        }
        String str2 = this.f9220c;
        String str3 = this.f9223f;
        int i = this.f9222e;
        StringBuilder sb = new StringBuilder(91 + String.valueOf(str2).length() + String.valueOf(str).length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public int hashCode() {
        return C3504r.m12548a(Integer.valueOf(this.f9218a), Long.valueOf(this.f9219b), this.f9220c, Integer.valueOf(this.f9221d), Integer.valueOf(this.f9222e), this.f9223f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.f9218a == accountChangeEvent.f9218a && this.f9219b == accountChangeEvent.f9219b && C3504r.m12550a(this.f9220c, accountChangeEvent.f9220c) && this.f9221d == accountChangeEvent.f9221d && this.f9222e == accountChangeEvent.f9222e && C3504r.m12550a(this.f9223f, accountChangeEvent.f9223f);
    }
}

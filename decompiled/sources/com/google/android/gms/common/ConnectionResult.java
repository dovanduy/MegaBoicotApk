package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Creator<ConnectionResult> CREATOR = new C3524m();

    /* renamed from: a */
    public static final ConnectionResult f9434a = new ConnectionResult(0);

    /* renamed from: b */
    private final int f9435b;

    /* renamed from: c */
    private final int f9436c;

    /* renamed from: d */
    private final PendingIntent f9437d;

    /* renamed from: e */
    private final String f9438e;

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f9435b = i;
        this.f9436c = i2;
        this.f9437d = pendingIntent;
        this.f9438e = str;
    }

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* renamed from: a */
    public final boolean mo13041a() {
        return (this.f9436c == 0 || this.f9437d == null) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo13042b() {
        return this.f9436c == 0;
    }

    /* renamed from: c */
    public final int mo13043c() {
        return this.f9436c;
    }

    /* renamed from: d */
    public final PendingIntent mo13044d() {
        return this.f9437d;
    }

    /* renamed from: e */
    public final String mo13045e() {
        return this.f9438e;
    }

    /* renamed from: a */
    static String m11580a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f9436c == connectionResult.f9436c && C3504r.m12550a(this.f9437d, connectionResult.f9437d) && C3504r.m12550a(this.f9438e, connectionResult.f9438e);
    }

    public final int hashCode() {
        return C3504r.m12548a(Integer.valueOf(this.f9436c), this.f9437d, this.f9438e);
    }

    public final String toString() {
        return C3504r.m12549a((Object) this).mo13613a("statusCode", m11580a(this.f9436c)).mo13613a("resolution", this.f9437d).mo13613a("message", this.f9438e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9435b);
        C3511b.m12599a(parcel, 2, mo13043c());
        C3511b.m12604a(parcel, 3, (Parcelable) mo13044d(), i, false);
        C3511b.m12609a(parcel, 4, mo13045e(), false);
        C3511b.m12596a(parcel, a);
    }
}

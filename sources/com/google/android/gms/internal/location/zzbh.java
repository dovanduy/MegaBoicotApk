package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.Locale;

public final class zzbh extends AbstractSafeParcelable {
    public static final Creator<zzbh> CREATOR = new C4694y();

    /* renamed from: a */
    private final String f15260a;

    /* renamed from: b */
    private final long f15261b;

    /* renamed from: c */
    private final short f15262c;

    /* renamed from: d */
    private final double f15263d;

    /* renamed from: e */
    private final double f15264e;

    /* renamed from: f */
    private final float f15265f;

    /* renamed from: g */
    private final int f15266g;

    /* renamed from: h */
    private final int f15267h;

    /* renamed from: i */
    private final int f15268i;

    public zzbh(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            String str2 = "requestId is null or too long: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i4 = i & 7;
            if (i4 == 0) {
                StringBuilder sb4 = new StringBuilder(46);
                sb4.append("No supported transition specified: ");
                sb4.append(i);
                throw new IllegalArgumentException(sb4.toString());
            }
            this.f15262c = s;
            this.f15260a = str;
            this.f15263d = d;
            this.f15264e = d2;
            this.f15265f = f;
            this.f15261b = j;
            this.f15266g = i4;
            this.f15267h = i2;
            this.f15268i = i3;
        }
    }

    /* renamed from: a */
    public final String mo16959a() {
        return this.f15260a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbh)) {
            return false;
        }
        zzbh zzbh = (zzbh) obj;
        return this.f15265f == zzbh.f15265f && this.f15263d == zzbh.f15263d && this.f15264e == zzbh.f15264e && this.f15262c == zzbh.f15262c;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f15263d);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f15264e);
        return (((((((i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f15265f)) * 31) + this.f15262c) * 31) + this.f15266g;
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]";
        Object[] objArr = new Object[9];
        objArr[0] = this.f15262c != 1 ? null : "CIRCLE";
        objArr[1] = this.f15260a.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f15266g);
        objArr[3] = Double.valueOf(this.f15263d);
        objArr[4] = Double.valueOf(this.f15264e);
        objArr[5] = Float.valueOf(this.f15265f);
        objArr[6] = Integer.valueOf(this.f15267h / AdError.NETWORK_ERROR_CODE);
        objArr[7] = Integer.valueOf(this.f15268i);
        objArr[8] = Long.valueOf(this.f15261b);
        return String.format(locale, str, objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 1, mo16959a(), false);
        C3511b.m12600a(parcel, 2, this.f15261b);
        C3511b.m12611a(parcel, 3, this.f15262c);
        C3511b.m12597a(parcel, 4, this.f15263d);
        C3511b.m12597a(parcel, 5, this.f15264e);
        C3511b.m12598a(parcel, 6, this.f15265f);
        C3511b.m12599a(parcel, 7, this.f15266g);
        C3511b.m12599a(parcel, 8, this.f15267h);
        C3511b.m12599a(parcel, 9, this.f15268i);
        C3511b.m12596a(parcel, a);
    }
}

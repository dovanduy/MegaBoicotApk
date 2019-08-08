package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzfv extends AbstractSafeParcelable {
    public static final Creator<zzfv> CREATOR = new C4860ej();

    /* renamed from: a */
    public final String f15995a;

    /* renamed from: b */
    public final long f15996b;

    /* renamed from: c */
    public final Long f15997c;

    /* renamed from: d */
    public final String f15998d;

    /* renamed from: e */
    public final String f15999e;

    /* renamed from: f */
    public final Double f16000f;

    /* renamed from: g */
    private final int f16001g;

    /* renamed from: h */
    private final Float f16002h;

    zzfv(C4861ek ekVar) {
        this(ekVar.f15786c, ekVar.f15787d, ekVar.f15788e, ekVar.f15785b);
    }

    zzfv(String str, long j, Object obj, String str2) {
        C3513t.m12627a(str);
        this.f16001g = 2;
        this.f15995a = str;
        this.f15996b = j;
        this.f15999e = str2;
        if (obj == null) {
            this.f15997c = null;
            this.f16002h = null;
            this.f16000f = null;
            this.f15998d = null;
        } else if (obj instanceof Long) {
            this.f15997c = (Long) obj;
            this.f16002h = null;
            this.f16000f = null;
            this.f15998d = null;
        } else if (obj instanceof String) {
            this.f15997c = null;
            this.f16002h = null;
            this.f16000f = null;
            this.f15998d = (String) obj;
        } else if (obj instanceof Double) {
            this.f15997c = null;
            this.f16002h = null;
            this.f16000f = (Double) obj;
            this.f15998d = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    zzfv(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f16001g = i;
        this.f15995a = str;
        this.f15996b = j;
        this.f15997c = l;
        Double d2 = null;
        this.f16002h = null;
        if (i == 1) {
            if (f != null) {
                d2 = Double.valueOf(f.doubleValue());
            }
            this.f16000f = d2;
        } else {
            this.f16000f = d;
        }
        this.f15998d = str2;
        this.f15999e = str3;
    }

    /* renamed from: a */
    public final Object mo17782a() {
        if (this.f15997c != null) {
            return this.f15997c;
        }
        if (this.f16000f != null) {
            return this.f16000f;
        }
        if (this.f15998d != null) {
            return this.f15998d;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f16001g);
        C3511b.m12609a(parcel, 2, this.f15995a, false);
        C3511b.m12600a(parcel, 3, this.f15996b);
        C3511b.m12608a(parcel, 4, this.f15997c, false);
        C3511b.m12606a(parcel, 5, (Float) null, false);
        C3511b.m12609a(parcel, 6, this.f15998d, false);
        C3511b.m12609a(parcel, 7, this.f15999e, false);
        C3511b.m12605a(parcel, 8, this.f16000f, false);
        C3511b.m12596a(parcel, a);
    }
}

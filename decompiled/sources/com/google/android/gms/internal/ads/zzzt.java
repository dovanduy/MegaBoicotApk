package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class zzzt extends AbstractSafeParcelable {
    public static final Creator<zzzt> CREATOR = new bdz();

    /* renamed from: a */
    private final int f14577a;

    /* renamed from: b */
    private final int f14578b;

    /* renamed from: c */
    private final int f14579c;

    zzzt(int i, int i2, int i3) {
        this.f14577a = i;
        this.f14578b = i2;
        this.f14579c = i3;
    }

    /* renamed from: a */
    public static zzzt m18811a(C4160sv svVar) {
        return new zzzt(svVar.f14068a, svVar.f14069b, svVar.f14070c);
    }

    public final String toString() {
        int i = this.f14577a;
        int i2 = this.f14578b;
        int i3 = this.f14579c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f14577a);
        C3511b.m12599a(parcel, 2, this.f14578b);
        C3511b.m12599a(parcel, 3, this.f14579c);
        C3511b.m12596a(parcel, a);
    }
}

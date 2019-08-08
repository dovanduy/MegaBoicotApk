package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzah extends AbstractSafeParcelable {
    public static final Creator<zzah> CREATOR = new C4404e();

    /* renamed from: a */
    private final int f14601a = 1;

    /* renamed from: b */
    private final String f14602b;

    /* renamed from: c */
    private final PendingIntent f14603c;

    zzah(int i, String str, PendingIntent pendingIntent) {
        this.f14602b = (String) C3513t.m12625a(str);
        this.f14603c = (PendingIntent) C3513t.m12625a(pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f14601a);
        C3511b.m12609a(parcel, 2, this.f14602b, false);
        C3511b.m12604a(parcel, 3, (Parcelable) this.f14603c, i, false);
        C3511b.m12596a(parcel, a);
    }
}

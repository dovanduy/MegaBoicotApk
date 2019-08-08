package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzaf extends AbstractSafeParcelable {
    public static final Creator<zzaf> CREATOR = new C4403d();

    /* renamed from: a */
    private final int f14598a = 1;

    /* renamed from: b */
    private final String f14599b;

    /* renamed from: c */
    private final byte[] f14600c;

    zzaf(int i, String str, byte[] bArr) {
        this.f14599b = (String) C3513t.m12625a(str);
        this.f14600c = (byte[]) C3513t.m12625a(bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f14598a);
        C3511b.m12609a(parcel, 2, this.f14599b, false);
        C3511b.m12613a(parcel, 3, this.f14600c, false);
        C3511b.m12596a(parcel, a);
    }
}

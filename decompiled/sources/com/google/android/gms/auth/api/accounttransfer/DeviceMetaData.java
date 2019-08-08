package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Creator<DeviceMetaData> CREATOR = new C3179e();

    /* renamed from: a */
    private final int f9251a;

    /* renamed from: b */
    private boolean f9252b;

    /* renamed from: c */
    private long f9253c;

    /* renamed from: d */
    private final boolean f9254d;

    /* renamed from: a */
    public boolean mo12872a() {
        return this.f9252b;
    }

    /* renamed from: b */
    public long mo12873b() {
        return this.f9253c;
    }

    /* renamed from: c */
    public boolean mo12874c() {
        return this.f9254d;
    }

    DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.f9251a = i;
        this.f9252b = z;
        this.f9253c = j;
        this.f9254d = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9251a);
        C3511b.m12612a(parcel, 2, mo12872a());
        C3511b.m12600a(parcel, 3, mo12873b());
        C3511b.m12612a(parcel, 4, mo12874c());
        C3511b.m12596a(parcel, a);
    }
}

package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.apq;
import com.google.android.gms.internal.ads.apr;

@C3718cm
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Creator<PublisherAdViewOptions> CREATOR = new C2996i();

    /* renamed from: a */
    private final boolean f8709a;

    /* renamed from: b */
    private final apq f8710b;

    PublisherAdViewOptions(boolean z, IBinder iBinder) {
        this.f8709a = z;
        this.f8710b = iBinder != null ? apr.m14753a(iBinder) : null;
    }

    /* renamed from: a */
    public final boolean mo12293a() {
        return this.f8709a;
    }

    /* renamed from: b */
    public final apq mo12294b() {
        return this.f8710b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12612a(parcel, 1, mo12293a());
        C3511b.m12602a(parcel, 2, this.f8710b == null ? null : this.f8710b.asBinder(), false);
        C3511b.m12596a(parcel, a);
    }
}

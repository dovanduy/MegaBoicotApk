package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zaa extends AbstractSafeParcelable implements C3391k {
    public static final Creator<zaa> CREATOR = new C4909b();

    /* renamed from: a */
    private final int f16053a;

    /* renamed from: b */
    private int f16054b;

    /* renamed from: c */
    private Intent f16055c;

    zaa(int i, int i2, Intent intent) {
        this.f16053a = i;
        this.f16054b = i2;
        this.f16055c = intent;
    }

    public zaa() {
        this(0, null);
    }

    private zaa(int i, Intent intent) {
        this(2, 0, null);
    }

    /* renamed from: b */
    public final Status mo12984b() {
        if (this.f16054b == 0) {
            return Status.f9455a;
        }
        return Status.f9459e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f16053a);
        C3511b.m12599a(parcel, 2, this.f16054b);
        C3511b.m12604a(parcel, 3, (Parcelable) this.f16055c, i, false);
        C3511b.m12596a(parcel, a);
    }
}

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

public final class zam extends AbstractSafeParcelable {
    public static final Creator<zam> CREATOR = new C3537b();

    /* renamed from: a */
    final String f10140a;

    /* renamed from: b */
    final Field<?, ?> f10141b;

    /* renamed from: c */
    private final int f10142c;

    zam(int i, String str, Field<?, ?> field) {
        this.f10142c = i;
        this.f10140a = str;
        this.f10141b = field;
    }

    zam(String str, Field<?, ?> field) {
        this.f10142c = 1;
        this.f10140a = str;
        this.f10141b = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f10142c);
        C3511b.m12609a(parcel, 2, this.f10140a, false);
        C3511b.m12604a(parcel, 3, (Parcelable) this.f10141b, i, false);
        C3511b.m12596a(parcel, a);
    }
}

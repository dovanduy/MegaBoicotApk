package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.common.server.response.FastJsonResponse.C3535a;

public final class zaa extends AbstractSafeParcelable {
    public static final Creator<zaa> CREATOR = new C3532a();

    /* renamed from: a */
    private final int f10113a;

    /* renamed from: b */
    private final StringToIntConverter f10114b;

    zaa(int i, StringToIntConverter stringToIntConverter) {
        this.f10113a = i;
        this.f10114b = stringToIntConverter;
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.f10113a = 1;
        this.f10114b = stringToIntConverter;
    }

    /* renamed from: a */
    public static zaa m12667a(C3535a<?, ?> aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: a */
    public final C3535a<?, ?> mo13646a() {
        if (this.f10114b != null) {
            return this.f10114b;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f10113a);
        C3511b.m12604a(parcel, 2, (Parcelable) this.f10114b, i, false);
        C3511b.m12596a(parcel, a);
    }
}

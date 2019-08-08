package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.Collections;
import java.util.List;

public final class zzal extends AbstractSafeParcelable {
    public static final Creator<zzal> CREATOR = new C4733t();

    /* renamed from: a */
    private final List<String> f15356a;

    /* renamed from: b */
    private final PendingIntent f15357b;

    /* renamed from: c */
    private final String f15358c;

    zzal(List<String> list, PendingIntent pendingIntent, String str) {
        this.f15356a = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f15357b = pendingIntent;
        this.f15358c = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12619b(parcel, 1, this.f15356a, false);
        C3511b.m12604a(parcel, 2, (Parcelable) this.f15357b, i, false);
        C3511b.m12609a(parcel, 3, this.f15358c, false);
        C3511b.m12596a(parcel, a);
    }
}

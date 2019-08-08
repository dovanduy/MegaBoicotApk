package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.List;

public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEventsResponse> CREATOR = new C3233c();

    /* renamed from: a */
    private final int f9228a;

    /* renamed from: b */
    private final List<AccountChangeEvent> f9229b;

    AccountChangeEventsResponse(int i, List<AccountChangeEvent> list) {
        this.f9228a = i;
        this.f9229b = (List) C3513t.m12625a(list);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9228a);
        C3511b.m12621c(parcel, 2, this.f9229b, false);
        C3511b.m12596a(parcel, a);
    }
}

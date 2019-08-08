package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import java.util.ArrayList;
import java.util.Map;

public final class zal extends AbstractSafeParcelable {
    public static final Creator<zal> CREATOR = new C3539d();

    /* renamed from: a */
    final String f10137a;

    /* renamed from: b */
    final ArrayList<zam> f10138b;

    /* renamed from: c */
    private final int f10139c;

    zal(int i, String str, ArrayList<zam> arrayList) {
        this.f10139c = i;
        this.f10137a = str;
        this.f10138b = arrayList;
    }

    zal(String str, Map<String, Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.f10139c = 1;
        this.f10137a = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (Field) map.get(str2)));
            }
        }
        this.f10138b = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f10139c);
        C3511b.m12609a(parcel, 2, this.f10137a, false);
        C3511b.m12621c(parcel, 3, this.f10138b, false);
        C3511b.m12596a(parcel, a);
    }
}

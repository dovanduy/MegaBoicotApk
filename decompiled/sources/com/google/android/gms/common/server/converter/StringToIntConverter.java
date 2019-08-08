package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.common.server.response.FastJsonResponse.C3535a;
import java.util.ArrayList;
import java.util.HashMap;

public final class StringToIntConverter extends AbstractSafeParcelable implements C3535a<String, Integer> {
    public static final Creator<StringToIntConverter> CREATOR = new C3533b();

    /* renamed from: a */
    private final int f10106a;

    /* renamed from: b */
    private final HashMap<String, Integer> f10107b;

    /* renamed from: c */
    private final SparseArray<String> f10108c;

    /* renamed from: d */
    private final ArrayList<zaa> f10109d;

    public static final class zaa extends AbstractSafeParcelable {
        public static final Creator<zaa> CREATOR = new C3534c();

        /* renamed from: a */
        final String f10110a;

        /* renamed from: b */
        final int f10111b;

        /* renamed from: c */
        private final int f10112c;

        zaa(int i, String str, int i2) {
            this.f10112c = i;
            this.f10110a = str;
            this.f10111b = i2;
        }

        zaa(String str, int i) {
            this.f10112c = 1;
            this.f10110a = str;
            this.f10111b = i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C3511b.m12595a(parcel);
            C3511b.m12599a(parcel, 1, this.f10112c);
            C3511b.m12609a(parcel, 2, this.f10110a, false);
            C3511b.m12599a(parcel, 3, this.f10111b);
            C3511b.m12596a(parcel, a);
        }
    }

    StringToIntConverter(int i, ArrayList<zaa> arrayList) {
        this.f10106a = i;
        this.f10107b = new HashMap<>();
        this.f10108c = new SparseArray<>();
        this.f10109d = null;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            zaa zaa2 = (zaa) obj;
            mo13636a(zaa2.f10110a, zaa2.f10111b);
        }
    }

    public StringToIntConverter() {
        this.f10106a = 1;
        this.f10107b = new HashMap<>();
        this.f10108c = new SparseArray<>();
        this.f10109d = null;
    }

    /* renamed from: a */
    public final StringToIntConverter mo13636a(String str, int i) {
        this.f10107b.put(str, Integer.valueOf(i));
        this.f10108c.put(i, str);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f10106a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f10107b.keySet()) {
            arrayList.add(new zaa(str, ((Integer) this.f10107b.get(str)).intValue()));
        }
        C3511b.m12621c(parcel, 2, arrayList, false);
        C3511b.m12596a(parcel, a);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo13637a(Object obj) {
        String str = (String) this.f10108c.get(((Integer) obj).intValue());
        return (str != null || !this.f10107b.containsKey("gms_unknown")) ? str : "gms_unknown";
    }
}

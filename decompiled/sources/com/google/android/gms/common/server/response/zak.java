package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class zak extends AbstractSafeParcelable {
    public static final Creator<zak> CREATOR = new C3538c();

    /* renamed from: a */
    private final int f10133a;

    /* renamed from: b */
    private final HashMap<String, Map<String, Field<?, ?>>> f10134b;

    /* renamed from: c */
    private final ArrayList<zal> f10135c = null;

    /* renamed from: d */
    private final String f10136d;

    zak(int i, ArrayList<zal> arrayList, String str) {
        this.f10133a = i;
        HashMap<String, Map<String, Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = (zal) arrayList.get(i2);
            String str2 = zal.f10137a;
            HashMap hashMap2 = new HashMap();
            int size2 = zal.f10138b.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = (zam) zal.f10138b.get(i3);
                hashMap2.put(zam.f10140a, zam.f10141b);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f10134b = hashMap;
        this.f10136d = (String) C3513t.m12625a(str);
        mo13673a();
    }

    /* renamed from: a */
    public final void mo13673a() {
        for (String str : this.f10134b.keySet()) {
            Map map = (Map) this.f10134b.get(str);
            for (String str2 : map.keySet()) {
                ((Field) map.get(str2)).mo13653a(this);
            }
        }
    }

    /* renamed from: a */
    public final Map<String, Field<?, ?>> mo13672a(String str) {
        return (Map) this.f10134b.get(str);
    }

    /* renamed from: b */
    public final String mo13674b() {
        return this.f10136d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f10134b.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.f10134b.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f10133a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f10134b.keySet()) {
            arrayList.add(new zal(str, (Map) this.f10134b.get(str)));
        }
        C3511b.m12621c(parcel, 2, arrayList, false);
        C3511b.m12609a(parcel, 3, this.f10136d, false);
        C3511b.m12596a(parcel, a);
    }
}

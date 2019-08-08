package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzl extends zzaz {
    public static final Creator<zzl> CREATOR = new C3175a();

    /* renamed from: a */
    private static final HashMap<String, Field<?, ?>> f9255a;

    /* renamed from: b */
    private final Set<Integer> f9256b;

    /* renamed from: c */
    private final int f9257c;

    /* renamed from: d */
    private ArrayList<zzr> f9258d;

    /* renamed from: e */
    private int f9259e;

    /* renamed from: f */
    private zzo f9260f;

    zzl(Set<Integer> set, int i, ArrayList<zzr> arrayList, int i2, zzo zzo) {
        this.f9256b = set;
        this.f9257c = i;
        this.f9258d = arrayList;
        this.f9259e = i2;
        this.f9260f = zzo;
    }

    public zzl() {
        this.f9256b = new HashSet(1);
        this.f9257c = 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        Set<Integer> set = this.f9256b;
        if (set.contains(Integer.valueOf(1))) {
            C3511b.m12599a(parcel, 1, this.f9257c);
        }
        if (set.contains(Integer.valueOf(2))) {
            C3511b.m12621c(parcel, 2, this.f9258d, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C3511b.m12599a(parcel, 3, this.f9259e);
        }
        if (set.contains(Integer.valueOf(4))) {
            C3511b.m12604a(parcel, 4, (Parcelable) this.f9260f, i, true);
        }
        C3511b.m12596a(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo12887a(Field field) {
        return this.f9256b.contains(Integer.valueOf(field.mo13651a()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo12888b(Field field) {
        int a = field.mo13651a();
        if (a == 4) {
            return this.f9260f;
        }
        switch (a) {
            case 1:
                return Integer.valueOf(this.f9257c);
            case 2:
                return this.f9258d;
            default:
                int a2 = field.mo13651a();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(a2);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Map mo12886a() {
        return f9255a;
    }

    static {
        HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
        f9255a = hashMap;
        hashMap.put("authenticatorData", Field.m12680b("authenticatorData", 2, zzr.class));
        f9255a.put("progress", Field.m12677a("progress", 4, zzo.class));
    }
}

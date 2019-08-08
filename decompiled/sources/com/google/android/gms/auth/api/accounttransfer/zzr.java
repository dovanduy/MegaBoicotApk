package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class zzr extends zzaz {
    public static final Creator<zzr> CREATOR = new C3177c();

    /* renamed from: a */
    private static final HashMap<String, Field<?, ?>> f9268a;

    /* renamed from: b */
    private final Set<Integer> f9269b;

    /* renamed from: c */
    private final int f9270c;

    /* renamed from: d */
    private zzt f9271d;

    /* renamed from: e */
    private String f9272e;

    /* renamed from: f */
    private String f9273f;

    /* renamed from: g */
    private String f9274g;

    public zzr() {
        this.f9269b = new HashSet(3);
        this.f9270c = 1;
    }

    zzr(Set<Integer> set, int i, zzt zzt, String str, String str2, String str3) {
        this.f9269b = set;
        this.f9270c = i;
        this.f9271d = zzt;
        this.f9272e = str;
        this.f9273f = str2;
        this.f9274g = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        Set<Integer> set = this.f9269b;
        if (set.contains(Integer.valueOf(1))) {
            C3511b.m12599a(parcel, 1, this.f9270c);
        }
        if (set.contains(Integer.valueOf(2))) {
            C3511b.m12604a(parcel, 2, (Parcelable) this.f9271d, i, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C3511b.m12609a(parcel, 3, this.f9272e, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            C3511b.m12609a(parcel, 4, this.f9273f, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            C3511b.m12609a(parcel, 5, this.f9274g, true);
        }
        C3511b.m12596a(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12887a(Field field) {
        return this.f9269b.contains(Integer.valueOf(field.mo13651a()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo12888b(Field field) {
        switch (field.mo13651a()) {
            case 1:
                return Integer.valueOf(this.f9270c);
            case 2:
                return this.f9271d;
            case 3:
                return this.f9272e;
            case 4:
                return this.f9273f;
            default:
                int a = field.mo13651a();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(a);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public /* synthetic */ Map mo12886a() {
        return f9268a;
    }

    static {
        HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
        f9268a = hashMap;
        hashMap.put("authenticatorInfo", Field.m12677a("authenticatorInfo", 2, zzt.class));
        f9268a.put("signature", Field.m12679b("signature", 3));
        f9268a.put("package", Field.m12679b("package", 4));
    }
}

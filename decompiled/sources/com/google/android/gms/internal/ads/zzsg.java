package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.Map;
import java.util.Map.Entry;

@C3718cm
public final class zzsg extends AbstractSafeParcelable {
    public static final Creator<zzsg> CREATOR = new awq();

    /* renamed from: a */
    private final String f14566a;

    /* renamed from: b */
    private final String[] f14567b;

    /* renamed from: c */
    private final String[] f14568c;

    zzsg(String str, String[] strArr, String[] strArr2) {
        this.f14566a = str;
        this.f14567b = strArr;
        this.f14568c = strArr2;
    }

    /* renamed from: a */
    public static zzsg m18810a(avm avm) throws C3631a {
        Map b = avm.mo14898b();
        int size = b.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Entry entry : b.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        return new zzsg(avm.mo14904e(), strArr, strArr2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 1, this.f14566a, false);
        C3511b.m12615a(parcel, 2, this.f14567b, false);
        C3511b.m12615a(parcel, 3, this.f14568c, false);
        C3511b.m12596a(parcel, a);
    }
}

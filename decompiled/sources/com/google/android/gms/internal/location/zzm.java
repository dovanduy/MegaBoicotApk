package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;

public final class zzm extends AbstractSafeParcelable {
    public static final Creator<zzm> CREATOR = new C4666al();

    /* renamed from: a */
    static final List<ClientIdentity> f15269a = Collections.emptyList();

    /* renamed from: b */
    static final zzj f15270b = new zzj();

    /* renamed from: c */
    private zzj f15271c;

    /* renamed from: d */
    private List<ClientIdentity> f15272d;

    /* renamed from: e */
    private String f15273e;

    zzm(zzj zzj, List<ClientIdentity> list, String str) {
        this.f15271c = zzj;
        this.f15272d = list;
        this.f15273e = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzm = (zzm) obj;
        return C3504r.m12550a(this.f15271c, zzm.f15271c) && C3504r.m12550a(this.f15272d, zzm.f15272d) && C3504r.m12550a(this.f15273e, zzm.f15273e);
    }

    public final int hashCode() {
        return this.f15271c.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12604a(parcel, 1, (Parcelable) this.f15271c, i, false);
        C3511b.m12621c(parcel, 2, this.f15272d, false);
        C3511b.m12609a(parcel, 3, this.f15273e, false);
        C3511b.m12596a(parcel, a);
    }
}

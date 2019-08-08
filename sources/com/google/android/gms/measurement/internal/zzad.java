package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.Iterator;

public final class zzad extends AbstractSafeParcelable implements Iterable<String> {
    public static final Creator<zzad> CREATOR = new C4877f();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Bundle f15990a;

    zzad(Bundle bundle) {
        this.f15990a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12601a(parcel, 2, mo17773b(), false);
        C3511b.m12596a(parcel, a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo17772a(String str) {
        return this.f15990a.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Long mo17774b(String str) {
        return Long.valueOf(this.f15990a.getLong(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Double mo17775c(String str) {
        return Double.valueOf(this.f15990a.getDouble(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo17776d(String str) {
        return this.f15990a.getString(str);
    }

    /* renamed from: a */
    public final int mo17771a() {
        return this.f15990a.size();
    }

    public final String toString() {
        return this.f15990a.toString();
    }

    /* renamed from: b */
    public final Bundle mo17773b() {
        return new Bundle(this.f15990a);
    }

    public final Iterator<String> iterator() {
        return new C4849e(this);
    }
}

package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<Scope> CREATOR = new C3399s();

    /* renamed from: a */
    private final int f9453a;

    /* renamed from: b */
    private final String f9454b;

    Scope(int i, String str) {
        C3513t.m12628a(str, (Object) "scopeUri must not be null or empty");
        this.f9453a = i;
        this.f9454b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    /* renamed from: a */
    public final String mo13073a() {
        return this.f9454b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f9454b.equals(((Scope) obj).f9454b);
    }

    public final int hashCode() {
        return this.f9454b.hashCode();
    }

    public final String toString() {
        return this.f9454b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9453a);
        C3511b.m12609a(parcel, 2, mo13073a(), false);
        C3511b.m12596a(parcel, a);
    }
}

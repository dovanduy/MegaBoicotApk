package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class zzatv extends AbstractSafeParcelable {
    public static final Creator<zzatv> CREATOR = new C4169td();

    /* renamed from: a */
    private final int f14513a;

    /* renamed from: b */
    private C4378zo f14514b = null;

    /* renamed from: c */
    private byte[] f14515c;

    zzatv(int i, byte[] bArr) {
        this.f14513a = i;
        this.f14515c = bArr;
        m18793b();
    }

    /* renamed from: b */
    private final void m18793b() {
        if (this.f14514b == null && this.f14515c != null) {
            return;
        }
        if (this.f14514b != null && this.f14515c == null) {
            return;
        }
        if (this.f14514b != null && this.f14515c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.f14514b == null && this.f14515c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    /* renamed from: a */
    public final C4378zo mo16258a() {
        if (!(this.f14514b != null)) {
            try {
                this.f14514b = (C4378zo) afc.m13974a(new C4378zo(), this.f14515c);
                this.f14515c = null;
            } catch (afb e) {
                throw new IllegalStateException(e);
            }
        }
        m18793b();
        return this.f14514b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f14513a);
        C3511b.m12613a(parcel, 2, this.f14515c != null ? this.f14515c : afc.m13976a((afc) this.f14514b), false);
        C3511b.m12596a(parcel, a);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
public final class zzhi extends AbstractSafeParcelable {
    public static final Creator<zzhi> CREATOR = new amb();
    @GuardedBy("this")

    /* renamed from: a */
    private ParcelFileDescriptor f14516a;

    public zzhi() {
        this(null);
    }

    public zzhi(ParcelFileDescriptor parcelFileDescriptor) {
        this.f14516a = parcelFileDescriptor;
    }

    /* renamed from: c */
    private final synchronized ParcelFileDescriptor m18795c() {
        return this.f14516a;
    }

    /* renamed from: a */
    public final synchronized boolean mo16260a() {
        return this.f14516a != null;
    }

    /* renamed from: b */
    public final synchronized InputStream mo16261b() {
        if (this.f14516a == null) {
            return null;
        }
        AutoCloseInputStream autoCloseInputStream = new AutoCloseInputStream(this.f14516a);
        this.f14516a = null;
        return autoCloseInputStream;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12604a(parcel, 2, (Parcelable) m18795c(), i, false);
        C3511b.m12596a(parcel, a);
    }
}

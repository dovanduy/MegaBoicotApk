package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<CredentialPickerConfig> CREATOR = new C3186d();

    /* renamed from: a */
    private final int f9295a;

    /* renamed from: b */
    private final boolean f9296b;

    /* renamed from: c */
    private final boolean f9297c;
    @Deprecated

    /* renamed from: d */
    private final boolean f9298d;

    /* renamed from: e */
    private final int f9299e;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    public static class C3182a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f9300a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f9301b = true;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f9302c = 1;

        /* renamed from: a */
        public CredentialPickerConfig mo12908a() {
            return new CredentialPickerConfig(this);
        }
    }

    CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.f9295a = i;
        this.f9296b = z;
        this.f9297c = z2;
        boolean z4 = true;
        if (i < 2) {
            this.f9298d = z3;
            if (z3) {
                z4 = true;
            }
            this.f9299e = z4 ? 1 : 0;
            return;
        }
        if (i2 != 3) {
            z4 = false;
        }
        this.f9298d = z4;
        this.f9299e = i2;
    }

    private CredentialPickerConfig(C3182a aVar) {
        this(2, aVar.f9300a, aVar.f9301b, false, aVar.f9302c);
    }

    /* renamed from: a */
    public final boolean mo12904a() {
        return this.f9296b;
    }

    /* renamed from: b */
    public final boolean mo12905b() {
        return this.f9297c;
    }

    @Deprecated
    /* renamed from: c */
    public final boolean mo12906c() {
        return this.f9299e == 3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12612a(parcel, 1, mo12904a());
        C3511b.m12612a(parcel, 2, mo12905b());
        C3511b.m12612a(parcel, 3, mo12906c());
        C3511b.m12599a(parcel, 4, this.f9299e);
        C3511b.m12599a(parcel, (int) AdError.NETWORK_ERROR_CODE, this.f9295a);
        C3511b.m12596a(parcel, a);
    }
}

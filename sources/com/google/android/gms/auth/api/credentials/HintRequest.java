package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<HintRequest> CREATOR = new C3188f();

    /* renamed from: a */
    private final int f9312a;

    /* renamed from: b */
    private final CredentialPickerConfig f9313b;

    /* renamed from: c */
    private final boolean f9314c;

    /* renamed from: d */
    private final boolean f9315d;

    /* renamed from: e */
    private final String[] f9316e;

    /* renamed from: f */
    private final boolean f9317f;

    /* renamed from: g */
    private final String f9318g;

    /* renamed from: h */
    private final String f9319h;

    HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.f9312a = i;
        this.f9313b = (CredentialPickerConfig) C3513t.m12625a(credentialPickerConfig);
        this.f9314c = z;
        this.f9315d = z2;
        this.f9316e = (String[]) C3513t.m12625a(strArr);
        if (this.f9312a < 2) {
            this.f9317f = true;
            this.f9318g = null;
            this.f9319h = null;
            return;
        }
        this.f9317f = z3;
        this.f9318g = str;
        this.f9319h = str2;
    }

    /* renamed from: a */
    public final CredentialPickerConfig mo12917a() {
        return this.f9313b;
    }

    /* renamed from: b */
    public final boolean mo12918b() {
        return this.f9314c;
    }

    /* renamed from: c */
    public final String[] mo12919c() {
        return this.f9316e;
    }

    /* renamed from: d */
    public final boolean mo12920d() {
        return this.f9317f;
    }

    /* renamed from: e */
    public final String mo12921e() {
        return this.f9318g;
    }

    /* renamed from: f */
    public final String mo12922f() {
        return this.f9319h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12604a(parcel, 1, (Parcelable) mo12917a(), i, false);
        C3511b.m12612a(parcel, 2, mo12918b());
        C3511b.m12612a(parcel, 3, this.f9315d);
        C3511b.m12615a(parcel, 4, mo12919c(), false);
        C3511b.m12612a(parcel, 5, mo12920d());
        C3511b.m12609a(parcel, 6, mo12921e(), false);
        C3511b.m12609a(parcel, 7, mo12922f(), false);
        C3511b.m12599a(parcel, (int) AdError.NETWORK_ERROR_CODE, this.f9312a);
        C3511b.m12596a(parcel, a);
    }
}

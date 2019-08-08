package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig.C3182a;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Creator<CredentialRequest> CREATOR = new C3187e();

    /* renamed from: a */
    private final int f9303a;

    /* renamed from: b */
    private final boolean f9304b;

    /* renamed from: c */
    private final String[] f9305c;

    /* renamed from: d */
    private final CredentialPickerConfig f9306d;

    /* renamed from: e */
    private final CredentialPickerConfig f9307e;

    /* renamed from: f */
    private final boolean f9308f;

    /* renamed from: g */
    private final String f9309g;

    /* renamed from: h */
    private final String f9310h;

    /* renamed from: i */
    private final boolean f9311i;

    CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.f9303a = i;
        this.f9304b = z;
        this.f9305c = (String[]) C3513t.m12625a(strArr);
        if (credentialPickerConfig == null) {
            credentialPickerConfig = new C3182a().mo12908a();
        }
        this.f9306d = credentialPickerConfig;
        if (credentialPickerConfig2 == null) {
            credentialPickerConfig2 = new C3182a().mo12908a();
        }
        this.f9307e = credentialPickerConfig2;
        if (i < 3) {
            this.f9308f = true;
            this.f9309g = null;
            this.f9310h = null;
        } else {
            this.f9308f = z2;
            this.f9309g = str;
            this.f9310h = str2;
        }
        this.f9311i = z3;
    }

    /* renamed from: a */
    public final boolean mo12909a() {
        return this.f9304b;
    }

    /* renamed from: b */
    public final String[] mo12910b() {
        return this.f9305c;
    }

    /* renamed from: c */
    public final CredentialPickerConfig mo12911c() {
        return this.f9306d;
    }

    /* renamed from: d */
    public final CredentialPickerConfig mo12912d() {
        return this.f9307e;
    }

    /* renamed from: e */
    public final boolean mo12913e() {
        return this.f9308f;
    }

    /* renamed from: f */
    public final String mo12914f() {
        return this.f9309g;
    }

    /* renamed from: g */
    public final String mo12915g() {
        return this.f9310h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12612a(parcel, 1, mo12909a());
        C3511b.m12615a(parcel, 2, mo12910b(), false);
        C3511b.m12604a(parcel, 3, (Parcelable) mo12911c(), i, false);
        C3511b.m12604a(parcel, 4, (Parcelable) mo12912d(), i, false);
        C3511b.m12612a(parcel, 5, mo12913e());
        C3511b.m12609a(parcel, 6, mo12914f(), false);
        C3511b.m12609a(parcel, 7, mo12915g(), false);
        C3511b.m12599a(parcel, (int) AdError.NETWORK_ERROR_CODE, this.f9303a);
        C3511b.m12612a(parcel, 8, this.f9311i);
        C3511b.m12596a(parcel, a);
    }
}

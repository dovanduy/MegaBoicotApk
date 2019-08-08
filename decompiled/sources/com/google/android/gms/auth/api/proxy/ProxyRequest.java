package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class ProxyRequest extends AbstractSafeParcelable {
    public static final Creator<ProxyRequest> CREATOR = new C3194b();

    /* renamed from: a */
    public static final int f9322a = 0;

    /* renamed from: b */
    public static final int f9323b = 1;

    /* renamed from: c */
    public static final int f9324c = 2;

    /* renamed from: d */
    public static final int f9325d = 3;

    /* renamed from: e */
    public static final int f9326e = 4;

    /* renamed from: f */
    public static final int f9327f = 5;

    /* renamed from: g */
    public static final int f9328g = 6;

    /* renamed from: h */
    public static final int f9329h = 7;

    /* renamed from: i */
    public static final int f9330i = 7;

    /* renamed from: j */
    public final String f9331j;

    /* renamed from: k */
    public final int f9332k;

    /* renamed from: l */
    public final long f9333l;

    /* renamed from: m */
    public final byte[] f9334m;

    /* renamed from: n */
    private final int f9335n;

    /* renamed from: o */
    private Bundle f9336o;

    ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.f9335n = i;
        this.f9331j = str;
        this.f9332k = i2;
        this.f9333l = j;
        this.f9334m = bArr;
        this.f9336o = bundle;
    }

    public String toString() {
        String str = this.f9331j;
        int i = this.f9332k;
        StringBuilder sb = new StringBuilder(42 + String.valueOf(str).length());
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i);
        sb.append(" ]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 1, this.f9331j, false);
        C3511b.m12599a(parcel, 2, this.f9332k);
        C3511b.m12600a(parcel, 3, this.f9333l);
        C3511b.m12613a(parcel, 4, this.f9334m, false);
        C3511b.m12601a(parcel, 5, this.f9336o, false);
        C3511b.m12599a(parcel, (int) AdError.NETWORK_ERROR_CODE, this.f9335n);
        C3511b.m12596a(parcel, a);
    }
}

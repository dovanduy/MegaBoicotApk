package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class ProxyResponse extends AbstractSafeParcelable {
    public static final Creator<ProxyResponse> CREATOR = new C3195c();

    /* renamed from: a */
    public final int f9337a;

    /* renamed from: b */
    public final PendingIntent f9338b;

    /* renamed from: c */
    public final int f9339c;

    /* renamed from: d */
    public final byte[] f9340d;

    /* renamed from: e */
    private final int f9341e;

    /* renamed from: f */
    private final Bundle f9342f;

    ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.f9341e = i;
        this.f9337a = i2;
        this.f9339c = i3;
        this.f9342f = bundle;
        this.f9340d = bArr;
        this.f9338b = pendingIntent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9337a);
        C3511b.m12604a(parcel, 2, (Parcelable) this.f9338b, i, false);
        C3511b.m12599a(parcel, 3, this.f9339c);
        C3511b.m12601a(parcel, 4, this.f9342f, false);
        C3511b.m12613a(parcel, 5, this.f9340d, false);
        C3511b.m12599a(parcel, (int) AdError.NETWORK_ERROR_CODE, this.f9341e);
        C3511b.m12596a(parcel, a);
    }
}

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public final class Status extends AbstractSafeParcelable implements C3391k, ReflectedParcelable {
    public static final Creator<Status> CREATOR = new C3400t();

    /* renamed from: a */
    public static final Status f9455a = new Status(0);

    /* renamed from: b */
    public static final Status f9456b = new Status(14);

    /* renamed from: c */
    public static final Status f9457c = new Status(8);

    /* renamed from: d */
    public static final Status f9458d = new Status(15);

    /* renamed from: e */
    public static final Status f9459e = new Status(16);

    /* renamed from: f */
    public static final Status f9460f = new Status(18);

    /* renamed from: g */
    private static final Status f9461g = new Status(17);

    /* renamed from: h */
    private final int f9462h;

    /* renamed from: i */
    private final int f9463i;

    /* renamed from: j */
    private final String f9464j;

    /* renamed from: k */
    private final PendingIntent f9465k;

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f9462h = i;
        this.f9463i = i2;
        this.f9464j = str;
        this.f9465k = pendingIntent;
    }

    /* renamed from: b */
    public final Status mo12984b() {
        return this;
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    /* renamed from: a */
    public final String mo13078a() {
        return this.f9464j;
    }

    /* renamed from: c */
    public final boolean mo13079c() {
        return this.f9465k != null;
    }

    /* renamed from: d */
    public final boolean mo13080d() {
        return this.f9463i <= 0;
    }

    /* renamed from: e */
    public final int mo13081e() {
        return this.f9463i;
    }

    public final int hashCode() {
        return C3504r.m12548a(Integer.valueOf(this.f9462h), Integer.valueOf(this.f9463i), this.f9464j, this.f9465k);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f9462h != status.f9462h || this.f9463i != status.f9463i || !C3504r.m12550a(this.f9464j, status.f9464j) || !C3504r.m12550a(this.f9465k, status.f9465k)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo13083f() {
        if (this.f9464j != null) {
            return this.f9464j;
        }
        return C3262d.m11633a(this.f9463i);
    }

    public final String toString() {
        return C3504r.m12549a((Object) this).mo13613a("statusCode", mo13083f()).mo13613a("resolution", this.f9465k).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, mo13081e());
        C3511b.m12609a(parcel, 2, mo13078a(), false);
        C3511b.m12604a(parcel, 3, (Parcelable) this.f9465k, i, false);
        C3511b.m12599a(parcel, (int) AdError.NETWORK_ERROR_CODE, this.f9462h);
        C3511b.m12596a(parcel, a);
    }
}

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C3504r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import java.util.Locale;

public final class WebImage extends AbstractSafeParcelable {
    public static final Creator<WebImage> CREATOR = new C3424d();

    /* renamed from: a */
    private final int f9906a;

    /* renamed from: b */
    private final Uri f9907b;

    /* renamed from: c */
    private final int f9908c;

    /* renamed from: d */
    private final int f9909d;

    WebImage(int i, Uri uri, int i2, int i3) {
        this.f9906a = i;
        this.f9907b = uri;
        this.f9908c = i2;
        this.f9909d = i3;
    }

    /* renamed from: a */
    public final Uri mo13438a() {
        return this.f9907b;
    }

    /* renamed from: b */
    public final int mo13439b() {
        return this.f9908c;
    }

    /* renamed from: c */
    public final int mo13440c() {
        return this.f9909d;
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f9908c), Integer.valueOf(this.f9909d), this.f9907b.toString()});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WebImage)) {
            return false;
        }
        WebImage webImage = (WebImage) obj;
        return C3504r.m12550a(this.f9907b, webImage.f9907b) && this.f9908c == webImage.f9908c && this.f9909d == webImage.f9909d;
    }

    public final int hashCode() {
        return C3504r.m12548a(this.f9907b, Integer.valueOf(this.f9908c), Integer.valueOf(this.f9909d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9906a);
        C3511b.m12604a(parcel, 2, (Parcelable) mo13438a(), i, false);
        C3511b.m12599a(parcel, 3, mo13439b());
        C3511b.m12599a(parcel, 4, mo13440c());
        C3511b.m12596a(parcel, a);
    }
}

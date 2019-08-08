package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.C3504r;

/* renamed from: com.google.android.gms.common.images.b */
final class C3422b {

    /* renamed from: a */
    public final Uri f9912a;

    public C3422b(Uri uri) {
        this.f9912a = uri;
    }

    public final int hashCode() {
        return C3504r.m12548a(this.f9912a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3422b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C3504r.m12550a(((C3422b) obj).f9912a, this.f9912a);
    }
}

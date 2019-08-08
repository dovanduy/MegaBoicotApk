package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.app */
public final class C3667app {

    /* renamed from: a */
    private final String f11651a;

    /* renamed from: b */
    private final String f11652b;

    public C3667app(String str, String str2) {
        this.f11651a = str;
        this.f11652b = str2;
    }

    /* renamed from: a */
    public final String mo14558a() {
        return this.f11651a;
    }

    /* renamed from: b */
    public final String mo14559b() {
        return this.f11652b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3667app app = (C3667app) obj;
        return TextUtils.equals(this.f11651a, app.f11651a) && TextUtils.equals(this.f11652b, app.f11652b);
    }

    public final int hashCode() {
        return (this.f11651a.hashCode() * 31) + this.f11652b.hashCode();
    }

    public final String toString() {
        String str = this.f11651a;
        String str2 = this.f11652b;
        StringBuilder sb = new StringBuilder(20 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}

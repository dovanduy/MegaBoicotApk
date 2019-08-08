package com.google.android.gms.internal.ads;

public final class alq {

    /* renamed from: a */
    final long f11370a;

    /* renamed from: b */
    final String f11371b;

    /* renamed from: c */
    final int f11372c;

    alq(long j, String str, int i) {
        this.f11370a = j;
        this.f11371b = str;
        this.f11372c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof alq)) {
            return false;
        }
        alq alq = (alq) obj;
        if (alq.f11370a == this.f11370a && alq.f11372c == this.f11372c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f11370a;
    }
}

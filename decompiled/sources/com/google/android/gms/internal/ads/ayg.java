package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3042bm;
import java.util.Arrays;

@C3718cm
final class ayg {

    /* renamed from: a */
    private final Object[] f12384a;

    ayg(zzjj zzjj, String str, int i) {
        this.f12384a = C3042bm.m11006a((String) aoq.m14620f().mo14695a(aru.f11797aV), zzjj, str, i, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ayg)) {
            return false;
        }
        return Arrays.equals(this.f12384a, ((ayg) obj).f12384a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12384a);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f12384a);
        StringBuilder sb = new StringBuilder(24 + String.valueOf(arrays).length());
        sb.append("[InterstitialAdPoolKey ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}

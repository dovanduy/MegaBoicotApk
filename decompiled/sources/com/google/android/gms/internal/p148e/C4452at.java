package com.google.android.gms.internal.p148e;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.e.at */
final class C4452at extends C4451as<Long> {
    C4452at(C4457ay ayVar, String str, Long l) {
        super(ayVar, str, l, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Long mo16348a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String b = super.mo16349b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(25 + String.valueOf(b).length() + String.valueOf(valueOf).length());
        sb.append("Invalid long value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}

package com.google.android.gms.internal.p148e;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.e.au */
final class C4453au extends C4451as<Integer> {
    C4453au(C4457ay ayVar, String str, Integer num) {
        super(ayVar, str, num, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Integer mo16348a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String b = super.mo16349b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(24 + String.valueOf(b).length() + String.valueOf(valueOf).length());
        sb.append("Invalid int value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}

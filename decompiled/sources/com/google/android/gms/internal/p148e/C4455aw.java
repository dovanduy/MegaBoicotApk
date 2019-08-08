package com.google.android.gms.internal.p148e;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.e.aw */
final class C4455aw extends C4451as<Double> {
    C4455aw(C4457ay ayVar, String str, Double d) {
        super(ayVar, str, d, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Double mo16348a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String b = super.mo16349b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(27 + String.valueOf(b).length() + String.valueOf(valueOf).length());
        sb.append("Invalid double value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}

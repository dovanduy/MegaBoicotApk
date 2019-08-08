package com.google.android.gms.internal.p148e;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.e.av */
final class C4454av extends C4451as<Boolean> {
    C4454av(C4457ay ayVar, String str, Boolean bool) {
        super(ayVar, str, bool, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo16348a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C4436ad.f14640b.matcher(str).matches()) {
                return Boolean.valueOf(true);
            }
            if (C4436ad.f14641c.matcher(str).matches()) {
                return Boolean.valueOf(false);
            }
        }
        String b = super.mo16349b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(28 + String.valueOf(b).length() + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}

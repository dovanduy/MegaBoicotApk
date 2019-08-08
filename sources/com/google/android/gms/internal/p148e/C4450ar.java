package com.google.android.gms.internal.p148e;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.e.ar */
public final class C4450ar {
    /* renamed from: a */
    public static Uri m18900a(String str) {
        String str2 = "content://com.google.android.gms.phenotype/";
        String valueOf = String.valueOf(Uri.encode(str));
        return Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}

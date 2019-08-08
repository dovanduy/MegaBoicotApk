package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.k */
public final class C3492k {

    /* renamed from: a */
    private static final int f10070a = 15;

    /* renamed from: b */
    private static final String f10071b = null;

    /* renamed from: c */
    private final String f10072c;

    /* renamed from: d */
    private final String f10073d;

    public C3492k(String str, String str2) {
        C3513t.m12626a(str, (Object) "log tag cannot be null");
        C3513t.m12637b(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, Integer.valueOf(23));
        this.f10072c = str;
        if (str2 == null || str2.length() <= 0) {
            this.f10073d = null;
        } else {
            this.f10073d = str2;
        }
    }

    public C3492k(String str) {
        this(str, null);
    }
}

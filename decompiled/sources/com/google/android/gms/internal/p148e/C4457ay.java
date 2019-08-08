package com.google.android.gms.internal.p148e;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.e.ay */
public final class C4457ay {

    /* renamed from: a */
    private final String f14677a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Uri f14678b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f14679c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f14680d;

    /* renamed from: e */
    private final boolean f14681e;

    /* renamed from: f */
    private final boolean f14682f;

    /* renamed from: g */
    private final boolean f14683g;

    public C4457ay(Uri uri) {
        this(null, uri, "", "", false, false, false);
    }

    private C4457ay(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.f14677a = null;
        this.f14678b = uri;
        this.f14679c = str2;
        this.f14680d = str3;
        this.f14681e = false;
        this.f14682f = false;
        this.f14683g = false;
    }

    /* renamed from: a */
    public final C4451as<Long> mo16354a(String str, long j) {
        return C4451as.m18911b(this, str, j);
    }

    /* renamed from: a */
    public final C4451as<Boolean> mo16356a(String str, boolean z) {
        return C4451as.m18913b(this, str, z);
    }

    /* renamed from: a */
    public final C4451as<Integer> mo16353a(String str, int i) {
        return C4451as.m18910b(this, str, i);
    }

    /* renamed from: a */
    public final C4451as<Double> mo16352a(String str, double d) {
        return C4451as.m18909b(this, str, d);
    }

    /* renamed from: a */
    public final C4451as<String> mo16355a(String str, String str2) {
        return C4451as.m18912b(this, str, str2);
    }
}

package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.me */
final /* synthetic */ class C3981me implements C3986mj {

    /* renamed from: a */
    private final String f13566a;

    /* renamed from: b */
    private final String f13567b;

    /* renamed from: c */
    private final Map f13568c;

    /* renamed from: d */
    private final byte[] f13569d;

    C3981me(String str, String str2, Map map, byte[] bArr) {
        this.f13566a = str;
        this.f13567b = str2;
        this.f13568c = map;
        this.f13569d = bArr;
    }

    /* renamed from: a */
    public final void mo15633a(JsonWriter jsonWriter) {
        C3980md.m17403a(this.f13566a, this.f13567b, this.f13568c, this.f13569d, jsonWriter);
    }
}

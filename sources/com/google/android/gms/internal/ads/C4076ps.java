package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.appnext.base.p046b.C1245d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ps */
final class C4076ps implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f13797a;

    /* renamed from: b */
    private final /* synthetic */ String f13798b;

    /* renamed from: c */
    private final /* synthetic */ String f13799c;

    /* renamed from: d */
    private final /* synthetic */ String f13800d;

    /* renamed from: e */
    private final /* synthetic */ C4073pp f13801e;

    C4076ps(C4073pp ppVar, String str, String str2, String str3, String str4) {
        this.f13801e = ppVar;
        this.f13797a = str;
        this.f13798b = str2;
        this.f13799c = str3;
        this.f13800d = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f13797a);
        if (!TextUtils.isEmpty(this.f13798b)) {
            hashMap.put("cachedSrc", this.f13798b);
        }
        hashMap.put(C1245d.f3961jd, C4073pp.m17655b(this.f13799c));
        hashMap.put("reason", this.f13799c);
        if (!TextUtils.isEmpty(this.f13800d)) {
            hashMap.put("message", this.f13800d);
        }
        this.f13801e.m17654a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}

package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.pq */
final class C4074pq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f13787a;

    /* renamed from: b */
    private final /* synthetic */ String f13788b;

    /* renamed from: c */
    private final /* synthetic */ int f13789c;

    /* renamed from: d */
    private final /* synthetic */ int f13790d;

    /* renamed from: e */
    private final /* synthetic */ boolean f13791e = false;

    /* renamed from: f */
    private final /* synthetic */ C4073pp f13792f;

    C4074pq(C4073pp ppVar, String str, String str2, int i, int i2, boolean z) {
        this.f13792f = ppVar;
        this.f13787a = str;
        this.f13788b = str2;
        this.f13789c = i;
        this.f13790d = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f13787a);
        hashMap.put("cachedSrc", this.f13788b);
        hashMap.put("bytesLoaded", Integer.toString(this.f13789c));
        hashMap.put("totalBytes", Integer.toString(this.f13790d));
        hashMap.put("cacheReady", this.f13791e ? "1" : "0");
        this.f13792f.m17654a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}

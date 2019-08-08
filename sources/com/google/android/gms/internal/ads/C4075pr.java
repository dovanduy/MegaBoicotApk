package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.pr */
final class C4075pr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f13793a;

    /* renamed from: b */
    private final /* synthetic */ String f13794b;

    /* renamed from: c */
    private final /* synthetic */ int f13795c;

    /* renamed from: d */
    private final /* synthetic */ C4073pp f13796d;

    C4075pr(C4073pp ppVar, String str, String str2, int i) {
        this.f13796d = ppVar;
        this.f13793a = str;
        this.f13794b = str2;
        this.f13795c = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f13793a);
        hashMap.put("cachedSrc", this.f13794b);
        hashMap.put("totalBytes", Integer.toString(this.f13795c));
        this.f13796d.m17654a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}

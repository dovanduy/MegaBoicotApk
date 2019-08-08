package com.startapp.android.publish.ads.video.p171a;

import java.util.List;

/* renamed from: com.startapp.android.publish.ads.video.a.a */
/* compiled from: StartAppSDK */
public class C5210a {

    /* renamed from: a */
    private List<String> f16724a;

    /* renamed from: b */
    private String f16725b;

    public C5210a(List<String> list, String str) {
        this.f16724a = list;
        this.f16725b = str;
    }

    /* renamed from: a */
    public List<String> mo19247a() {
        return this.f16724a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[VideoEvent: tag=");
        sb.append(this.f16725b);
        sb.append(", fullUrls=");
        sb.append(this.f16724a.toString());
        sb.append("]");
        return sb.toString();
    }
}

package com.startapp.android.publish.ads.video.p173c.p174a.p175a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.android.publish.ads.video.c.a.a.e */
/* compiled from: StartAppSDK */
public class C5239e {

    /* renamed from: a */
    private String f16840a;

    /* renamed from: b */
    private List<String> f16841b;

    /* renamed from: c */
    private List<String> f16842c;

    /* renamed from: a */
    public String mo19332a() {
        return this.f16840a;
    }

    /* renamed from: a */
    public void mo19333a(String str) {
        this.f16840a = str;
    }

    /* renamed from: b */
    public List<String> mo19334b() {
        if (this.f16841b == null) {
            this.f16841b = new ArrayList();
        }
        return this.f16841b;
    }

    /* renamed from: c */
    public List<String> mo19335c() {
        if (this.f16842c == null) {
            this.f16842c = new ArrayList();
        }
        return this.f16842c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VASTVideoClicks [clickThrough=");
        sb.append(this.f16840a);
        sb.append(", clickTracking=[");
        sb.append(this.f16841b);
        sb.append("], customClick=[");
        sb.append(this.f16842c);
        sb.append("] ]");
        return sb.toString();
    }
}

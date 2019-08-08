package com.startapp.android.publish.adsCommon.p177a;

import com.startapp.android.publish.common.model.AdPreferences.Placement;

/* renamed from: com.startapp.android.publish.adsCommon.a.a */
/* compiled from: StartAppSDK */
public class C5314a implements Comparable<C5314a> {

    /* renamed from: a */
    private long f17053a = System.currentTimeMillis();

    /* renamed from: b */
    private Placement f17054b;

    /* renamed from: c */
    private String f17055c;

    public C5314a(Placement placement, String str) {
        this.f17054b = placement;
        if (str == null) {
            str = "";
        }
        this.f17055c = str;
    }

    /* renamed from: a */
    public Placement mo19643a() {
        return this.f17054b;
    }

    /* renamed from: b */
    public String mo19644b() {
        return this.f17055c;
    }

    /* renamed from: a */
    public int compareTo(C5314a aVar) {
        long j = this.f17053a - aVar.f17053a;
        if (j > 0) {
            return 1;
        }
        return j == 0 ? 0 : -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdDisplayEvent [displayTime=");
        sb.append(this.f17053a);
        sb.append(", placement=");
        sb.append(this.f17054b);
        sb.append(", adTag=");
        sb.append(this.f17055c);
        sb.append("]");
        return sb.toString();
    }
}

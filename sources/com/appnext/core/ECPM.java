package com.appnext.core;

public class ECPM {
    private String banner;
    private float ecpm;
    private float ppr;

    public ECPM(float f, float f2, String str) {
        this.ecpm = f;
        this.ppr = f2;
        this.banner = str;
    }

    public float getEcpm() {
        return this.ecpm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo6174c(float f) {
        this.ecpm = f;
    }

    public float getPpr() {
        return this.ppr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo6175d(float f) {
        this.ppr = f;
    }

    public String getBanner() {
        return this.banner;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aP */
    public final void mo6173aP(String str) {
        this.banner = str;
    }
}

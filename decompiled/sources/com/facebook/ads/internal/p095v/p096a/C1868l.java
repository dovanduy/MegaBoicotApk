package com.facebook.ads.internal.p095v.p096a;

/* renamed from: com.facebook.ads.internal.v.a.l */
public abstract class C1868l {

    /* renamed from: a */
    protected String f5927a = "";

    /* renamed from: b */
    protected C1866j f5928b;

    /* renamed from: c */
    protected String f5929c;

    /* renamed from: d */
    protected byte[] f5930d;

    public C1868l(String str, C1872p pVar) {
        if (str != null) {
            this.f5927a = str;
        }
        if (pVar != null) {
            String a = pVar.mo7892a();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5927a);
            sb.append("?");
            sb.append(a);
            this.f5927a = sb.toString();
        }
    }

    /* renamed from: a */
    public String mo7881a() {
        return this.f5927a;
    }

    /* renamed from: b */
    public C1866j mo7882b() {
        return this.f5928b;
    }

    /* renamed from: c */
    public String mo7883c() {
        return this.f5929c;
    }

    /* renamed from: d */
    public byte[] mo7884d() {
        return this.f5930d;
    }
}

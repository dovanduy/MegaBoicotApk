package com.google.android.gms.common.api;

/* renamed from: com.google.android.gms.common.api.b */
public class C3260b extends Exception {

    /* renamed from: a */
    protected final Status f9471a;

    public C3260b(Status status) {
        int e = status.mo13081e();
        String a = status.mo13078a() != null ? status.mo13078a() : "";
        StringBuilder sb = new StringBuilder(13 + String.valueOf(a).length());
        sb.append(e);
        sb.append(": ");
        sb.append(a);
        super(sb.toString());
        this.f9471a = status;
    }
}

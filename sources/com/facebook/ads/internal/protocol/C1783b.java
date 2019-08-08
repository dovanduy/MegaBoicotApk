package com.facebook.ads.internal.protocol;

/* renamed from: com.facebook.ads.internal.protocol.b */
public class C1783b extends Exception {

    /* renamed from: a */
    private final AdErrorType f5599a;

    /* renamed from: b */
    private final String f5600b;

    public C1783b(AdErrorType adErrorType, String str) {
        this(adErrorType, str, null);
    }

    public C1783b(AdErrorType adErrorType, String str, Throwable th) {
        super(str, th);
        this.f5599a = adErrorType;
        this.f5600b = str;
    }

    /* renamed from: a */
    public AdErrorType mo7637a() {
        return this.f5599a;
    }

    /* renamed from: b */
    public String mo7638b() {
        return this.f5600b;
    }
}

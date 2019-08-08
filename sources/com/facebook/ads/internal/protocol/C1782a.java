package com.facebook.ads.internal.protocol;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.internal.protocol.a */
public class C1782a {

    /* renamed from: a */
    private final AdErrorType f5597a;

    /* renamed from: b */
    private final String f5598b;

    public C1782a(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C1782a(AdErrorType adErrorType, String str) {
        if (TextUtils.isEmpty(str)) {
            str = adErrorType.getDefaultErrorMessage();
        }
        this.f5597a = adErrorType;
        this.f5598b = str;
    }

    /* renamed from: a */
    public static C1782a m7381a(AdErrorType adErrorType, String str) {
        return new C1782a(adErrorType, str);
    }

    /* renamed from: a */
    public static C1782a m7382a(C1783b bVar) {
        return new C1782a(bVar.mo7637a(), bVar.mo7638b());
    }

    /* renamed from: a */
    public AdErrorType mo7635a() {
        return this.f5597a;
    }

    /* renamed from: b */
    public String mo7636b() {
        return this.f5598b;
    }
}

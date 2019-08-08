package com.facebook.ads.internal.p095v.p097b.p098a;

import java.io.File;

/* renamed from: com.facebook.ads.internal.v.b.a.g */
public class C1885g extends C1882e {

    /* renamed from: a */
    private final long f5943a;

    public C1885g(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Max size must be positive number!");
        }
        this.f5943a = j;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo7916a(File file) {
        super.mo7916a(file);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7920a(File file, long j, int i) {
        return j <= this.f5943a;
    }
}

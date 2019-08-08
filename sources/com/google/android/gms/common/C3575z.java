package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.z */
final class C3575z extends C3573x {

    /* renamed from: b */
    private final Callable<String> f10199b;

    private C3575z(Callable<String> callable) {
        super(false, null, null);
        this.f10199b = callable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo13700b() {
        try {
            return (String) this.f10199b.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

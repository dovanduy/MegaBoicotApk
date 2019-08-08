package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.iv */
public final class C3890iv {
    @GuardedBy("this")

    /* renamed from: a */
    private BigInteger f13356a = BigInteger.ONE;

    /* renamed from: a */
    public final synchronized String mo15462a() {
        String bigInteger;
        bigInteger = this.f13356a.toString();
        this.f13356a = this.f13356a.add(BigInteger.ONE);
        return bigInteger;
    }
}

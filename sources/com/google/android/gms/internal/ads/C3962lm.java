package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.lm */
public final class C3962lm {

    /* renamed from: a */
    private Map<Integer, Bitmap> f13510a = new ConcurrentHashMap();

    /* renamed from: b */
    private AtomicInteger f13511b = new AtomicInteger(0);

    /* renamed from: a */
    public final int mo15605a(Bitmap bitmap) {
        if (bitmap == null) {
            C3900je.m17429b("Bitmap is null. Skipping putting into the Memory Map.");
            return -1;
        }
        int andIncrement = this.f13511b.getAndIncrement();
        this.f13510a.put(Integer.valueOf(andIncrement), bitmap);
        return andIncrement;
    }

    /* renamed from: a */
    public final Bitmap mo15606a(Integer num) {
        return (Bitmap) this.f13510a.get(num);
    }

    /* renamed from: b */
    public final void mo15607b(Integer num) {
        this.f13510a.remove(num);
    }
}

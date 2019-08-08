package com.facebook.ads.internal.p115w.p118c;

import android.graphics.Bitmap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.internal.w.c.f */
public class C2352f {

    /* renamed from: a */
    static final int f7416a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    static final ExecutorService f7417b = Executors.newFixedThreadPool(f7416a);

    /* renamed from: c */
    private static volatile boolean f7418c = true;

    /* renamed from: d */
    private final Bitmap f7419d;

    /* renamed from: e */
    private Bitmap f7420e;

    /* renamed from: f */
    private final C2346a f7421f = new C2349d();

    public C2352f(Bitmap bitmap) {
        this.f7419d = bitmap;
    }

    /* renamed from: a */
    public Bitmap mo8757a() {
        return this.f7420e;
    }

    /* renamed from: a */
    public Bitmap mo8758a(int i) {
        this.f7420e = this.f7421f.mo8746a(this.f7419d, (float) i);
        return this.f7420e;
    }
}

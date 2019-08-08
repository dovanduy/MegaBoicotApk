package com.facebook.ads.internal.p115w.p117b;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.w.b.y */
public abstract class C2344y<T> implements Runnable {

    /* renamed from: a */
    private final WeakReference<T> f7375a;

    public C2344y(T t) {
        this.f7375a = new WeakReference<>(t);
    }

    /* renamed from: a */
    public T mo8745a() {
        return this.f7375a.get();
    }
}

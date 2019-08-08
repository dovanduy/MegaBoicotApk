package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class aiy implements Callable {

    /* renamed from: a */
    protected final ahn f11164a;

    /* renamed from: b */
    protected final C4378zo f11165b;

    /* renamed from: c */
    protected Method f11166c;

    /* renamed from: d */
    private final String f11167d = getClass().getSimpleName();

    /* renamed from: e */
    private final String f11168e;

    /* renamed from: f */
    private final String f11169f;

    /* renamed from: g */
    private final int f11170g;

    /* renamed from: h */
    private final int f11171h;

    public aiy(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2) {
        this.f11164a = ahn;
        this.f11168e = str;
        this.f11169f = str2;
        this.f11165b = zoVar;
        this.f11170g = i;
        this.f11171h = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14345a() throws IllegalAccessException, InvocationTargetException;

    /* renamed from: b */
    public Void call() throws Exception {
        try {
            long nanoTime = System.nanoTime();
            this.f11166c = this.f11164a.mo14302a(this.f11168e, this.f11169f);
            if (this.f11166c == null) {
                return null;
            }
            mo14345a();
            agq h = this.f11164a.mo14312h();
            if (!(h == null || this.f11170g == Integer.MIN_VALUE)) {
                h.mo14277a(this.f11171h, this.f11170g, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}

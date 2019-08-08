package com.startapp.common;

/* renamed from: com.startapp.common.e */
/* compiled from: StartAppSDK */
public class C5552e extends Exception {

    /* renamed from: b */
    private boolean f17629b;

    /* renamed from: c */
    private int f17630c;

    public C5552e(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f17629b = false;
        this.f17630c = 0;
        this.f17629b = z;
        this.f17630c = i;
    }

    public C5552e(String str, Throwable th, int i) {
        this(str, th, false, i);
    }

    /* renamed from: a */
    public int mo20546a() {
        return this.f17630c;
    }

    public C5552e() {
        this.f17629b = false;
        this.f17630c = 0;
    }

    public C5552e(String str, Throwable th) {
        this(str, th, false);
    }

    public C5552e(String str, Throwable th, boolean z) {
        this(str, th, z, 0);
    }

    /* renamed from: b */
    public boolean mo20547b() {
        return this.f17629b;
    }
}

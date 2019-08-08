package com.truenet.android;

import java.lang.Thread.UncaughtExceptionHandler;
import p000a.p001a.p003b.p004a.C0023b;
import p000a.p001a.p003b.p005b.C0032h;

/* renamed from: com.truenet.android.d */
final class C5598d implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final /* synthetic */ C0023b f17725a;

    C5598d(C0023b bVar) {
        this.f17725a = bVar;
    }

    public final /* synthetic */ void uncaughtException(Thread thread, Throwable th) {
        C0032h.m42a(this.f17725a.mo46a(thread, th), "invoke(...)");
    }
}

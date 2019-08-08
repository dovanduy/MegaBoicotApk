package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.of */
final class C4036of implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f13659a;

    /* renamed from: b */
    private final /* synthetic */ String f13660b;

    /* renamed from: c */
    private final /* synthetic */ C4032ob f13661c;

    C4036of(C4032ob obVar, String str, String str2) {
        this.f13661c = obVar;
        this.f13659a = str;
        this.f13660b = str2;
    }

    public final void run() {
        if (this.f13661c.f13654r != null) {
            this.f13661c.f13654r.mo15739a(this.f13659a, this.f13660b);
        }
    }
}

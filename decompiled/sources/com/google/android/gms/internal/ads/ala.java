package com.google.android.gms.internal.ads;

final class ala implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ akz f11329a;

    ala(akz akz) {
        this.f11329a = akz;
    }

    public final void run() {
        synchronized (this.f11329a.f11320c) {
            if (!this.f11329a.f11321d || !this.f11329a.f11322e) {
                C3900je.m17429b("App is still foreground");
            } else {
                this.f11329a.f11321d = false;
                C3900je.m17429b("App went background");
                for (alb a : this.f11329a.f11323f) {
                    try {
                        a.mo14477a(false);
                    } catch (Exception e) {
                        C3987mk.m17430b("", e);
                    }
                }
            }
        }
    }
}

package com.google.android.gms.p143d;

/* renamed from: com.google.android.gms.d.l */
final class C3591l implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3583g f10214a;

    /* renamed from: b */
    private final /* synthetic */ C3590k f10215b;

    C3591l(C3590k kVar, C3583g gVar) {
        this.f10215b = kVar;
        this.f10214a = gVar;
    }

    public final void run() {
        if (this.f10214a.mo13717c()) {
            this.f10215b.f10213c.mo13742f();
            return;
        }
        try {
            this.f10215b.f10213c.mo13739a(this.f10215b.f10212b.mo13703a(this.f10214a));
        } catch (C3582f e) {
            if (e.getCause() instanceof Exception) {
                this.f10215b.f10213c.mo13738a((Exception) e.getCause());
            } else {
                this.f10215b.f10213c.mo13738a((Exception) e);
            }
        } catch (Exception e2) {
            this.f10215b.f10213c.mo13738a(e2);
        }
    }
}

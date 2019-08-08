package com.google.android.gms.p143d;

/* renamed from: com.google.android.gms.d.n */
final class C3593n implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3583g f10219a;

    /* renamed from: b */
    private final /* synthetic */ C3592m f10220b;

    C3593n(C3592m mVar, C3583g gVar) {
        this.f10220b = mVar;
        this.f10219a = gVar;
    }

    public final void run() {
        try {
            C3583g gVar = (C3583g) this.f10220b.f10217b.mo13703a(this.f10219a);
            if (gVar == null) {
                this.f10220b.mo13706a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            gVar.mo13712a(C3585i.f10208b, (C3581e<? super TResult>) this.f10220b);
            gVar.mo13711a(C3585i.f10208b, (C3580d) this.f10220b);
            gVar.mo13709a(C3585i.f10208b, (C3578b) this.f10220b);
        } catch (C3582f e) {
            if (e.getCause() instanceof Exception) {
                this.f10220b.f10218c.mo13738a((Exception) e.getCause());
            } else {
                this.f10220b.f10218c.mo13738a((Exception) e);
            }
        } catch (Exception e2) {
            this.f10220b.f10218c.mo13738a(e2);
        }
    }
}

package com.google.android.gms.internal.p147d;

/* renamed from: com.google.android.gms.internal.d.g */
final class C4430g extends C4427d {

    /* renamed from: a */
    private final C4428e f14624a = new C4428e();

    C4430g() {
    }

    /* renamed from: a */
    public final void mo16322a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        } else {
            this.f14624a.mo16323a(th, true).add(th2);
        }
    }
}

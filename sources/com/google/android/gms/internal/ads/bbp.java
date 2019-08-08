package com.google.android.gms.internal.ads;

final class bbp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bbn f12610a;

    /* renamed from: b */
    private final /* synthetic */ bbo f12611b;

    bbp(bbo bbo, bbn bbn) {
        this.f12611b = bbo;
        this.f12610a = bbn;
    }

    public final void run() {
        synchronized (this.f12611b.f12598i) {
            if (this.f12611b.f12608s == -2) {
                this.f12611b.f12607r = this.f12611b.m15955d();
                if (this.f12611b.f12607r == null) {
                    this.f12611b.mo15072a(4);
                } else if (!this.f12611b.m15957e() || this.f12611b.m15952b(1)) {
                    this.f12610a.mo15060a((bbs) this.f12611b);
                    this.f12611b.m15946a(this.f12610a);
                } else {
                    String f = this.f12611b.f12590a;
                    StringBuilder sb = new StringBuilder(56 + String.valueOf(f).length());
                    sb.append("Ignoring adapter ");
                    sb.append(f);
                    sb.append(" as delayed impression is not supported");
                    C3900je.m17435e(sb.toString());
                    this.f12611b.mo15072a(2);
                }
            }
        }
    }
}

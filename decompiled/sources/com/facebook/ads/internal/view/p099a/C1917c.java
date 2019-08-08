package com.facebook.ads.internal.view.p099a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.facebook.ads.internal.p079f.C1710a;
import com.facebook.ads.internal.p079f.C1711b;
import com.facebook.ads.internal.p079f.C1711b.C1712a;
import com.facebook.ads.internal.p079f.C1713c;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p120e.C2361g;
import com.facebook.ads.internal.view.C1910a;
import com.facebook.ads.internal.view.C1910a.C1911a;

/* renamed from: com.facebook.ads.internal.view.a.c */
public abstract class C1917c extends FrameLayout {

    /* renamed from: a */
    boolean f6032a;

    /* renamed from: b */
    protected final C1920e f6033b;

    /* renamed from: c */
    private final C1802c f6034c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f6035d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1910a f6036e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1911a f6037f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1916b f6038g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f6039h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C1711b f6040i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1712a f6041j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C1713c f6042k;

    public C1917c(Context context, C1802c cVar, String str) {
        this(context, cVar, str, null, null);
    }

    public C1917c(Context context, C1802c cVar, String str, C1910a aVar, C1911a aVar2) {
        super(context);
        this.f6039h = 0;
        this.f6041j = C1712a.NONE;
        this.f6042k = null;
        this.f6033b = new C1920e() {
            /* renamed from: a */
            public void mo7982a() {
                if (C1917c.this.f6042k == null) {
                    mo7985a(false);
                    return;
                }
                C1917c.this.f6039h = C1917c.this.f6039h - 1;
                if (C1917c.this.f6042k.mo7482e() == null) {
                    C1917c.this.m8011g();
                } else {
                    C1917c.m8002a(C1917c.this, C1917c.this.f6042k.mo7482e());
                }
            }

            /* renamed from: a */
            public void mo7983a(C1712a aVar) {
                C1917c.this.f6039h = C1917c.this.f6039h + 1;
                C1917c.this.f6041j = aVar;
                C1917c.m8002a(C1917c.this, C1917c.this.f6041j == C1712a.HIDE ? C1710a.m7134d(C1917c.this.getContext()) : C1710a.m7137g(C1917c.this.getContext()));
            }

            /* renamed from: a */
            public void mo7984a(C1713c cVar) {
                C1917c.this.f6039h = C1917c.this.f6039h + 1;
                C1917c.this.f6040i.mo7468a(cVar.mo7477a());
                if (cVar.mo7481d().isEmpty()) {
                    C1917c.m8004b(C1917c.this, cVar);
                    if (C1917c.this.f6038g != null) {
                        C1917c.this.f6038g.mo7971a(cVar, C1917c.this.f6041j);
                    }
                } else {
                    C1917c.m8002a(C1917c.this, cVar);
                }
            }

            /* renamed from: a */
            public void mo7985a(boolean z) {
                C1917c.this.mo7978c();
                if (C1917c.this.f6036e != null) {
                    C1917c.this.f6036e.mo7272b(true);
                }
                if (C1917c.this.f6038g != null) {
                    C1917c.this.f6038g.mo7972a(z);
                }
                if (!z) {
                    C1917c.this.m8009f();
                }
            }

            /* renamed from: b */
            public void mo7986b() {
                if (C1917c.this.f6037f != null) {
                    C1917c.this.f6037f.mo6795a("com.facebook.ads.adreporting.FINISH_AD_REPORTING_FLOW");
                }
            }

            /* renamed from: c */
            public void mo7987c() {
                if (!TextUtils.isEmpty(C1710a.m7144n(C1917c.this.getContext()))) {
                    C2361g.m9129a(new C2361g(), C1917c.this.getContext(), Uri.parse(C1710a.m7144n(C1917c.this.getContext())), C1917c.this.f6035d);
                }
                C1917c.this.f6040i.mo7472c();
            }

            /* renamed from: d */
            public void mo7988d() {
                C1917c.this.mo7978c();
                if (C1917c.this.f6036e != null) {
                    C1917c.this.f6036e.mo7272b(true);
                }
                if (!TextUtils.isEmpty(C1710a.m7143m(C1917c.this.getContext()))) {
                    C2361g.m9129a(new C2361g(), C1917c.this.getContext(), Uri.parse(C1710a.m7143m(C1917c.this.getContext())), C1917c.this.f6035d);
                }
                C1917c.this.f6040i.mo7471b();
                C1917c.this.m8009f();
            }
        };
        this.f6034c = cVar;
        this.f6036e = aVar;
        this.f6037f = aVar2;
        this.f6035d = str;
    }

    /* renamed from: a */
    static /* synthetic */ void m8002a(C1917c cVar, C1713c cVar2) {
        cVar.f6042k = cVar2;
        cVar.f6040i.mo7470a(cVar.f6041j, cVar.f6039h);
        cVar.mo7974a(cVar2, cVar.f6041j);
    }

    /* renamed from: b */
    static /* synthetic */ void m8004b(C1917c cVar, C1713c cVar2) {
        cVar.f6040i.mo7469a(cVar.f6041j);
        cVar.mo7977b(cVar2, cVar.f6041j);
        if (cVar.mo7980e()) {
            cVar.m8009f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m8009f() {
        if (this.f6040i.mo7474e()) {
            this.f6034c.mo7701n(this.f6035d, this.f6040i.mo7473d());
            this.f6040i.mo7475f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m8011g() {
        this.f6042k = null;
        this.f6040i.mo7467a();
        mo7979d();
    }

    /* renamed from: a */
    public void mo7973a() {
        this.f6040i = new C1711b();
        if (this.f6036e != null) {
            this.f6036e.mo7271a_(true);
        }
        m8011g();
        if (this.f6038g != null) {
            this.f6038g.mo7970a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo7974a(C1713c cVar, C1712a aVar);

    /* renamed from: a */
    public void mo7975a(boolean z) {
        this.f6032a = z;
    }

    /* renamed from: b */
    public void mo7976b() {
        m8009f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo7977b(C1713c cVar, C1712a aVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract void mo7978c();

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract void mo7979d();

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract boolean mo7980e();

    public void setAdReportingFlowListener(C1916b bVar) {
        this.f6038g = bVar;
    }
}

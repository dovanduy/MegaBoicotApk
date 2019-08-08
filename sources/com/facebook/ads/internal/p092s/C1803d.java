package com.facebook.ads.internal.p092s;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p083j.C1740a;
import com.facebook.ads.internal.p083j.C1743d;
import com.facebook.ads.internal.p087n.C1767a;
import com.facebook.ads.internal.p089p.C1780a;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p092s.C1796a.C1797a;
import com.facebook.ads.internal.p115w.p117b.C2327o;
import com.facebook.ads.internal.p115w.p120e.C2358e;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.s.d */
public class C1803d implements C1802c {

    /* renamed from: a */
    private static final String f5684a = "d";

    /* renamed from: b */
    private static double f5685b = 0.0d;

    /* renamed from: c */
    private static String f5686c = null;

    /* renamed from: d */
    private static volatile boolean f5687d = false;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: i */
    private static C1802c f5688i;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1798b f5689e;

    /* renamed from: f */
    private final C1743d f5690f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f5691g;

    /* renamed from: h */
    private C1805e f5692h;

    private C1803d(Context context) {
        this.f5691g = context.getApplicationContext();
        this.f5690f = new C1743d(context);
        this.f5689e = new C1798b(context, new C1809i(context, this.f5690f));
        this.f5689e.mo7675b();
        m7534b(context);
    }

    /* renamed from: a */
    public static synchronized C1802c m7531a(Context context) {
        C1802c cVar;
        synchronized (C1803d.class) {
            if (f5688i == null) {
                f5688i = new C1803d(context.getApplicationContext());
            }
            cVar = f5688i;
        }
        return cVar;
    }

    /* renamed from: a */
    private void m7532a(final C1796a aVar) {
        if (!aVar.mo7663g()) {
            String str = f5684a;
            StringBuilder sb = new StringBuilder();
            sb.append("Attempting to log an invalid ");
            sb.append(aVar.mo7665i());
            sb.append(" event.");
            Log.e(str, sb.toString());
            return;
        }
        if (this.f5692h != null) {
            this.f5692h.mo7707a(aVar);
        }
        this.f5690f.mo7539a(aVar.mo7657a(), aVar.mo7664h().f5698c, aVar.mo7665i().toString(), aVar.mo7658b(), aVar.mo7659c(), aVar.mo7660d(), aVar.mo7661e(), new C1740a<String>() {
            /* renamed from: a */
            public void mo7527a(int i, String str) {
                super.mo7527a(i, str);
            }

            /* renamed from: a */
            public void mo7528a(String str) {
                super.mo7528a(str);
                if (C1795a.m7467z(C1803d.this.f5691g)) {
                    C1780a.m7380a(C1803d.this.f5691g, aVar.mo7665i().toString(), str);
                }
                if (aVar.mo7662f()) {
                    C1803d.this.f5689e.mo7674a();
                } else {
                    C1803d.this.f5689e.mo7675b();
                }
            }
        });
    }

    /* renamed from: b */
    private static synchronized void m7534b(Context context) {
        synchronized (C1803d.class) {
            if (!f5687d) {
                C1767a.m7338b(context);
                C2327o.m9052a();
                f5685b = C2327o.m9053b();
                f5686c = C2327o.m9054c();
                f5687d = true;
            }
        }
    }

    /* renamed from: a */
    public void mo7685a(String str) {
        new C2358e(this.f5691g).execute(new String[]{str});
    }

    /* renamed from: a */
    public void mo7686a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.IMMEDIATE).mo7668a(C1807g.IMPRESSION).mo7671a(true).mo7672a());
        }
    }

    /* renamed from: a */
    public void mo7687a(String str, Map<String, String> map, String str2, C1806f fVar) {
        m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(fVar).mo7668a(C1807g.m7560a(str2)).mo7671a(true).mo7672a());
    }

    /* renamed from: b */
    public void mo7688b(String str) {
        if (!TextUtils.isEmpty(str)) {
            m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7667a(C1806f.DEFERRED).mo7668a(C1807g.SHOW_AD_CALLED).mo7671a(true).mo7672a());
        }
    }

    /* renamed from: b */
    public void mo7689b(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.IMMEDIATE).mo7668a(C1807g.INVALIDATION).mo7671a(false).mo7672a());
        }
    }

    /* renamed from: c */
    public void mo7690c(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.IMMEDIATE).mo7668a(C1807g.OPEN_LINK).mo7671a(true).mo7672a());
        }
    }

    /* renamed from: d */
    public void mo7691d(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.DEFERRED).mo7668a(C1807g.OFF_TARGET_CLICK).mo7671a(true).mo7672a());
        }
    }

    /* renamed from: e */
    public void mo7692e(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.IMMEDIATE).mo7668a(C1807g.VIDEO).mo7671a(true).mo7672a());
        }
    }

    /* renamed from: f */
    public void mo7693f(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.DEFERRED).mo7668a(C1807g.NATIVE_VIEW).mo7671a(false).mo7672a());
        }
    }

    /* renamed from: g */
    public void mo7694g(String str, Map<String, String> map) {
        m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.DEFERRED).mo7668a(C1807g.BROWSER_SESSION).mo7671a(false).mo7672a());
    }

    /* renamed from: h */
    public void mo7695h(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.IMMEDIATE).mo7668a(C1807g.STORE).mo7671a(true).mo7672a());
        }
    }

    /* renamed from: i */
    public void mo7696i(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.DEFERRED).mo7668a(C1807g.CLICK_GUARD).mo7671a(true).mo7672a());
        }
    }

    /* renamed from: j */
    public void mo7697j(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.DEFERRED).mo7668a(C1807g.TWO_STEP).mo7671a(true).mo7672a());
        }
    }

    /* renamed from: k */
    public void mo7698k(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.DEFERRED).mo7668a(C1807g.TWO_STEP_CANCEL).mo7671a(true).mo7672a());
        }
    }

    /* renamed from: l */
    public void mo7699l(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.DEFERRED).mo7668a(C1807g.CLOSE).mo7671a(true).mo7672a());
        }
    }

    /* renamed from: m */
    public void mo7700m(String str, Map<String, String> map) {
        m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.IMMEDIATE).mo7668a(C1807g.USER_RETURN).mo7671a(true).mo7672a());
    }

    /* renamed from: n */
    public void mo7701n(String str, Map<String, String> map) {
        m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.DEFERRED).mo7668a(C1807g.AD_REPORTING).mo7671a(false).mo7672a());
    }

    /* renamed from: o */
    public void mo7702o(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.DEFERRED).mo7668a(C1807g.PREVIEW_IMPRESSION).mo7671a(true).mo7672a());
        }
    }

    /* renamed from: p */
    public void mo7703p(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.DEFERRED).mo7668a(C1807g.AD_SELECTION).mo7671a(true).mo7672a());
        }
    }

    /* renamed from: q */
    public void mo7704q(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.IMMEDIATE).mo7668a(C1807g.SWIPE_TO_CLICK).mo7671a(true).mo7672a());
        }
    }

    /* renamed from: r */
    public void mo7705r(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m7532a(new C1797a().mo7669a(str).mo7666a(f5685b).mo7673b(f5686c).mo7670a(map).mo7667a(C1806f.IMMEDIATE).mo7668a(C1807g.WATCH_AND_X_MINIMIZED).mo7671a(true).mo7672a());
        }
    }
}

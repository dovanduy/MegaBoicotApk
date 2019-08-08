package com.p055c.p056a.p057a.p058a.p067h;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.p055c.p056a.p057a.p058a.p063d.C1455a;
import com.p055c.p056a.p057a.p058a.p063d.C1455a.C1456a;
import com.p055c.p056a.p057a.p058a.p063d.C1457b;
import com.p055c.p056a.p057a.p058a.p064e.C1461b;
import com.p055c.p056a.p057a.p058a.p064e.C1464d;
import com.p055c.p056a.p057a.p058a.p064e.C1466f;
import com.p055c.p056a.p057a.p058a.p067h.p068a.C1483c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.h.a */
public class C1474a implements C1456a {

    /* renamed from: a */
    private static C1474a f4460a = new C1474a();

    /* renamed from: b */
    private static Handler f4461b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f4462c;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f4463j = new Runnable() {
        public void run() {
            C1474a.m6108a().m6118i();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f4464k = new Runnable() {
        public void run() {
            if (C1474a.f4462c != null) {
                C1474a.f4462c.post(C1474a.f4463j);
                C1474a.f4462c.postDelayed(C1474a.f4464k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<C1478a> f4465d = new ArrayList();

    /* renamed from: e */
    private int f4466e;

    /* renamed from: f */
    private C1457b f4467f = new C1457b();

    /* renamed from: g */
    private C1487b f4468g = new C1487b();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1488c f4469h = new C1488c(new C1483c());

    /* renamed from: i */
    private double f4470i;

    /* renamed from: com.c.a.a.a.h.a$a */
    public interface C1478a {
        /* renamed from: a */
        void mo6588a(int i, long j);
    }

    C1474a() {
    }

    /* renamed from: a */
    public static C1474a m6108a() {
        return f4460a;
    }

    /* renamed from: a */
    private void m6110a(long j) {
        if (this.f4465d.size() > 0) {
            for (C1478a a : this.f4465d) {
                a.mo6588a(this.f4466e, j);
            }
        }
    }

    /* renamed from: a */
    private void m6111a(View view, C1455a aVar, JSONObject jSONObject, C1489d dVar) {
        aVar.mo6555a(view, jSONObject, this, dVar == C1489d.PARENT_VIEW);
    }

    /* renamed from: a */
    private boolean m6112a(View view, JSONObject jSONObject) {
        String a = this.f4468g.mo6603a(view);
        if (a == null) {
            return false;
        }
        C1461b.m6053a(jSONObject, a);
        this.f4468g.mo6610e();
        return true;
    }

    /* renamed from: b */
    private void m6113b(View view, JSONObject jSONObject) {
        ArrayList b = this.f4468g.mo6605b(view);
        if (b != null) {
            C1461b.m6055a(jSONObject, (List<String>) b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m6118i() {
        m6119j();
        mo6584e();
        m6120k();
    }

    /* renamed from: j */
    private void m6119j() {
        this.f4466e = 0;
        this.f4470i = C1464d.m6066a();
    }

    /* renamed from: k */
    private void m6120k() {
        m6110a((long) (C1464d.m6066a() - this.f4470i));
    }

    /* renamed from: l */
    private void m6121l() {
        if (f4462c == null) {
            f4462c = new Handler(Looper.getMainLooper());
            f4462c.post(f4463j);
            f4462c.postDelayed(f4464k, 200);
        }
    }

    /* renamed from: m */
    private void m6122m() {
        if (f4462c != null) {
            f4462c.removeCallbacks(f4464k);
            f4462c = null;
        }
    }

    /* renamed from: a */
    public void mo6556a(View view, C1455a aVar, JSONObject jSONObject) {
        if (C1466f.m6083d(view)) {
            C1489d c = this.f4468g.mo6607c(view);
            if (c != C1489d.UNDERLYING_VIEW) {
                JSONObject a = aVar.mo6554a(view);
                C1461b.m6056a(jSONObject, a);
                if (!m6112a(view, a)) {
                    m6113b(view, a);
                    m6111a(view, aVar, a, c);
                }
                this.f4466e++;
            }
        }
    }

    /* renamed from: b */
    public void mo6581b() {
        m6121l();
    }

    /* renamed from: c */
    public void mo6582c() {
        mo6583d();
        this.f4465d.clear();
        f4461b.post(new Runnable() {
            public void run() {
                C1474a.this.f4469h.mo6612b();
            }
        });
    }

    /* renamed from: d */
    public void mo6583d() {
        m6122m();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo6584e() {
        this.f4468g.mo6608c();
        double a = C1464d.m6066a();
        C1455a a2 = this.f4467f.mo6557a();
        if (this.f4468g.mo6606b().size() > 0) {
            this.f4469h.mo6613b(a2.mo6554a(null), this.f4468g.mo6606b(), a);
        }
        if (this.f4468g.mo6604a().size() > 0) {
            JSONObject a3 = a2.mo6554a(null);
            m6111a(null, a2, a3, C1489d.PARENT_VIEW);
            C1461b.m6052a(a3);
            this.f4469h.mo6611a(a3, this.f4468g.mo6604a(), a);
        } else {
            this.f4469h.mo6612b();
        }
        this.f4468g.mo6609d();
    }
}

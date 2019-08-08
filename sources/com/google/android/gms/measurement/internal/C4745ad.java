package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.p135a.C2961a;
import com.google.android.gms.ads.p135a.C2961a.C2962a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.ad */
final class C4745ad extends C4788bt {

    /* renamed from: a */
    static final Pair<String, Long> f15384a = new Pair<>("", Long.valueOf(0));

    /* renamed from: b */
    public C4749ah f15385b;

    /* renamed from: c */
    public final C4748ag f15386c = new C4748ag(this, "last_upload", 0);

    /* renamed from: d */
    public final C4748ag f15387d = new C4748ag(this, "last_upload_attempt", 0);

    /* renamed from: e */
    public final C4748ag f15388e = new C4748ag(this, "backoff", 0);

    /* renamed from: f */
    public final C4748ag f15389f = new C4748ag(this, "last_delete_stale", 0);

    /* renamed from: g */
    public final C4748ag f15390g = new C4748ag(this, "midnight_offset", 0);

    /* renamed from: h */
    public final C4748ag f15391h = new C4748ag(this, "first_open_time", 0);

    /* renamed from: i */
    public final C4748ag f15392i = new C4748ag(this, "app_install_time", 0);

    /* renamed from: j */
    public final C4750ai f15393j = new C4750ai(this, "app_instance_id", null);

    /* renamed from: k */
    public final C4748ag f15394k = new C4748ag(this, "time_before_start", 10000);

    /* renamed from: l */
    public final C4748ag f15395l = new C4748ag(this, "session_timeout", 1800000);

    /* renamed from: m */
    public final C4747af f15396m = new C4747af(this, "start_new_session", true);

    /* renamed from: n */
    public final C4748ag f15397n = new C4748ag(this, "last_pause_time", 0);

    /* renamed from: o */
    public final C4748ag f15398o = new C4748ag(this, "time_active", 0);

    /* renamed from: p */
    public boolean f15399p;

    /* renamed from: r */
    private SharedPreferences f15400r;

    /* renamed from: s */
    private String f15401s;

    /* renamed from: t */
    private boolean f15402t;

    /* renamed from: u */
    private long f15403u;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Pair<String, Boolean> mo17167a(String str) {
        mo17144d();
        long b = mo17153m().mo13695b();
        if (this.f15401s != null && b < this.f15403u) {
            return new Pair<>(this.f15401s, Boolean.valueOf(this.f15402t));
        }
        this.f15403u = b + mo17160t().mo17637a(str, C4882h.f15912j);
        C2961a.m10596a(true);
        try {
            C2962a a = C2961a.m10593a(mo17154n());
            if (a != null) {
                this.f15401s = a.mo12186a();
                this.f15402t = a.mo12187b();
            }
            if (this.f15401s == null) {
                this.f15401s = "";
            }
        } catch (Exception e) {
            mo17158r().mo17758w().mo17764a("Unable to get advertising id", e);
            this.f15401s = "";
        }
        C2961a.m10596a(false);
        return new Pair<>(this.f15401s, Boolean.valueOf(this.f15402t));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo17176e() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo17170b(String str) {
        mo17144d();
        String str2 = (String) mo17167a(str).first;
        MessageDigest i = C4862el.m20981i();
        if (i == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, i.digest(str2.getBytes()))});
    }

    C4745ad(C4764aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo17177f() {
        this.f15400r = mo17154n().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f15399p = this.f15400r.getBoolean("has_been_opened", false);
        if (!this.f15399p) {
            Editor edit = this.f15400r.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        C4749ah ahVar = new C4749ah(this, "health_monitor", Math.max(0, ((Long) C4882h.f15913k.mo17726b()).longValue()));
        this.f15385b = ahVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final SharedPreferences m20367y() {
        mo17144d();
        mo17300A();
        return this.f15400r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo17172c(String str) {
        mo17144d();
        Editor edit = m20367y().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final String mo17178g() {
        mo17144d();
        return m20367y().getString("gmp_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo17174d(String str) {
        mo17144d();
        Editor edit = m20367y().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final String mo17179h() {
        mo17144d();
        return m20367y().getString("admob_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final Boolean mo17180i() {
        mo17144d();
        if (!m20367y().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(m20367y().getBoolean("use_service", false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17168a(boolean z) {
        mo17144d();
        mo17158r().mo17759x().mo17764a("Setting useService", Boolean.valueOf(z));
        Editor edit = m20367y().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo17181j() {
        mo17144d();
        mo17158r().mo17759x().mo17763a("Clearing collection preferences.");
        if (mo17160t().mo17639a(C4882h.f15894aq)) {
            Boolean k = mo17182k();
            Editor edit = m20367y().edit();
            edit.clear();
            edit.apply();
            if (k != null) {
                mo17171b(k.booleanValue());
            }
            return;
        }
        boolean contains = m20367y().contains("measurement_enabled");
        boolean z = true;
        if (contains) {
            z = mo17173c(true);
        }
        Editor edit2 = m20367y().edit();
        edit2.clear();
        edit2.apply();
        if (contains) {
            mo17171b(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo17171b(boolean z) {
        mo17144d();
        mo17158r().mo17759x().mo17764a("Setting measurementEnabled", Boolean.valueOf(z));
        Editor edit = m20367y().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo17173c(boolean z) {
        mo17144d();
        return m20367y().getBoolean("measurement_enabled", z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final Boolean mo17182k() {
        mo17144d();
        if (m20367y().contains("measurement_enabled")) {
            return Boolean.valueOf(m20367y().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final String mo17183v() {
        mo17144d();
        String string = m20367y().getString("previous_os_version", null);
        mo17152l().mo17300A();
        String str = VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            Editor edit = m20367y().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo17175d(boolean z) {
        mo17144d();
        mo17158r().mo17759x().mo17764a("Updating deferred analytics collection", Boolean.valueOf(z));
        Editor edit = m20367y().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final boolean mo17184w() {
        mo17144d();
        return m20367y().getBoolean("deferred_analytics_collection", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final boolean mo17185x() {
        return this.f15400r.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo17169a(long j) {
        return j - this.f15395l.mo17188a() > this.f15397n.mo17188a();
    }
}

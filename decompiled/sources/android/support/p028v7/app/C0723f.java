package android.support.p028v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.support.p017v4.view.C0595r;
import android.support.p028v7.app.ActionBar.C0683a;
import android.support.p028v7.view.menu.C0790h;
import android.support.p028v7.view.menu.C0790h.C0791a;
import android.support.p028v7.view.menu.C0806o.C0807a;
import android.support.p028v7.widget.C1031u;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window.Callback;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.f */
/* compiled from: ToolbarActionBar */
class C0723f extends ActionBar {

    /* renamed from: a */
    C1031u f2010a;

    /* renamed from: b */
    Callback f2011b;

    /* renamed from: c */
    private boolean f2012c;

    /* renamed from: d */
    private boolean f2013d;

    /* renamed from: e */
    private ArrayList<C0683a> f2014e;

    /* renamed from: f */
    private final Runnable f2015f;

    /* renamed from: android.support.v7.app.f$a */
    /* compiled from: ToolbarActionBar */
    private final class C0724a implements C0807a {

        /* renamed from: b */
        private boolean f2017b;

        C0724a() {
        }

        /* renamed from: a */
        public boolean mo2722a(C0790h hVar) {
            if (C0723f.this.f2011b == null) {
                return false;
            }
            C0723f.this.f2011b.onMenuOpened(108, hVar);
            return true;
        }

        /* renamed from: a */
        public void mo2721a(C0790h hVar, boolean z) {
            if (!this.f2017b) {
                this.f2017b = true;
                C0723f.this.f2010a.mo5135n();
                if (C0723f.this.f2011b != null) {
                    C0723f.this.f2011b.onPanelClosed(108, hVar);
                }
                this.f2017b = false;
            }
        }
    }

    /* renamed from: android.support.v7.app.f$b */
    /* compiled from: ToolbarActionBar */
    private final class C0725b implements C0791a {
        /* renamed from: a */
        public boolean mo2667a(C0790h hVar, MenuItem menuItem) {
            return false;
        }

        C0725b() {
        }

        /* renamed from: a */
        public void mo2661a(C0790h hVar) {
            if (C0723f.this.f2011b == null) {
                return;
            }
            if (C0723f.this.f2010a.mo5130i()) {
                C0723f.this.f2011b.onPanelClosed(108, hVar);
            } else if (C0723f.this.f2011b.onPreparePanel(0, null, hVar)) {
                C0723f.this.f2011b.onMenuOpened(108, hVar);
            }
        }
    }

    /* renamed from: a */
    public void mo2576a(boolean z) {
    }

    /* renamed from: c */
    public void mo2581c(boolean z) {
    }

    /* renamed from: d */
    public void mo2583d(boolean z) {
    }

    /* renamed from: a */
    public void mo2573a(float f) {
        C0595r.m2232a((View) this.f2010a.mo5102a(), f);
    }

    /* renamed from: b */
    public Context mo2579b() {
        return this.f2010a.mo5112b();
    }

    /* renamed from: a */
    public void mo2574a(Configuration configuration) {
        super.mo2574a(configuration);
    }

    /* renamed from: a */
    public void mo2575a(CharSequence charSequence) {
        this.f2010a.mo5110a(charSequence);
    }

    /* renamed from: a */
    public int mo2571a() {
        return this.f2010a.mo5136o();
    }

    /* renamed from: c */
    public boolean mo2582c() {
        return this.f2010a.mo5132k();
    }

    /* renamed from: d */
    public boolean mo2584d() {
        return this.f2010a.mo5133l();
    }

    /* renamed from: e */
    public boolean mo2586e() {
        this.f2010a.mo5102a().removeCallbacks(this.f2015f);
        C0595r.m2242a((View) this.f2010a.mo5102a(), this.f2015f);
        return true;
    }

    /* renamed from: f */
    public boolean mo2587f() {
        if (!this.f2010a.mo5120c()) {
            return false;
        }
        this.f2010a.mo5121d();
        return true;
    }

    /* renamed from: a */
    public boolean mo2578a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo2582c();
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo2577a(int i, KeyEvent keyEvent) {
        Menu h = m2922h();
        if (h == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        h.setQwertyMode(z);
        return h.performShortcut(i, keyEvent, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2588g() {
        this.f2010a.mo5102a().removeCallbacks(this.f2015f);
    }

    /* renamed from: e */
    public void mo2585e(boolean z) {
        if (z != this.f2013d) {
            this.f2013d = z;
            int size = this.f2014e.size();
            for (int i = 0; i < size; i++) {
                ((C0683a) this.f2014e.get(i)).mo2589a(z);
            }
        }
    }

    /* renamed from: h */
    private Menu m2922h() {
        if (!this.f2012c) {
            this.f2010a.mo5105a((C0807a) new C0724a(), (C0791a) new C0725b());
            this.f2012c = true;
        }
        return this.f2010a.mo5138q();
    }
}

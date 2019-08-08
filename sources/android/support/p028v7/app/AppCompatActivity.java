package android.support.p028v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p017v4.app.C0236a;
import android.support.p017v4.app.C0243ac;
import android.support.p017v4.app.C0243ac.C0244a;
import android.support.p017v4.app.C0299s;
import android.support.p017v4.app.FragmentActivity;
import android.support.p028v7.view.C0762b;
import android.support.p028v7.view.C0762b.C0763a;
import android.support.p028v7.widget.C0987bd;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

/* renamed from: android.support.v7.app.AppCompatActivity */
public class AppCompatActivity extends FragmentActivity implements C0244a, C0718b {

    /* renamed from: k */
    private C0719c f1894k;

    /* renamed from: l */
    private int f1895l = 0;

    /* renamed from: m */
    private Resources f1896m;

    /* renamed from: a */
    public C0762b mo2624a(C0763a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo2626a(C0762b bVar) {
    }

    /* renamed from: b */
    public void mo2630b(C0243ac acVar) {
    }

    /* renamed from: b */
    public void mo2631b(C0762b bVar) {
    }

    @Deprecated
    /* renamed from: j */
    public void mo2639j() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0719c k = mo2640k();
        k.mo2689h();
        k.mo2659a(bundle);
        if (k.mo2691i() && this.f1895l != 0) {
            if (VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f1895l, false);
            } else {
                setTheme(this.f1895l);
            }
        }
        super.onCreate(bundle);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f1895l = i;
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo2640k().mo2672b(bundle);
    }

    /* renamed from: h */
    public ActionBar mo2636h() {
        return mo2640k().mo2651a();
    }

    public MenuInflater getMenuInflater() {
        return mo2640k().mo2670b();
    }

    public void setContentView(int i) {
        mo2640k().mo2671b(i);
    }

    public void setContentView(View view) {
        mo2640k().mo2662a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo2640k().mo2663a(view, layoutParams);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo2640k().mo2674b(view, layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo2640k().mo2658a(configuration);
        if (this.f1896m != null) {
            this.f1896m.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo2640k().mo2682e();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo2640k().mo2676c();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo2640k().mo2680d();
    }

    public <T extends View> T findViewById(int i) {
        return mo2640k().mo2655a(i);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar h = mo2636h();
        if (menuItem.getItemId() != 16908332 || h == null || (h.mo2571a() & 4) == 0) {
            return false;
        }
        return mo2637i();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo2640k().mo2686g();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo2640k().mo2665a(charSequence);
    }

    /* renamed from: D_ */
    public void mo661D_() {
        mo2640k().mo2684f();
    }

    public void invalidateOptionsMenu() {
        mo2640k().mo2684f();
    }

    /* renamed from: a */
    public void mo2625a(C0243ac acVar) {
        acVar.mo795a((Activity) this);
    }

    /* renamed from: i */
    public boolean mo2637i() {
        Intent b_ = mo801b_();
        if (b_ == null) {
            return false;
        }
        if (mo2627a(b_)) {
            C0243ac a = C0243ac.m724a((Context) this);
            mo2625a(a);
            mo2630b(a);
            a.mo798a();
            try {
                C0236a.m715a(this);
            } catch (IllegalStateException unused) {
                finish();
            }
        } else {
            mo2629b(b_);
        }
        return true;
    }

    /* renamed from: b_ */
    public Intent mo801b_() {
        return C0299s.m1072a(this);
    }

    /* renamed from: a */
    public boolean mo2627a(Intent intent) {
        return C0299s.m1074a((Activity) this, intent);
    }

    /* renamed from: b */
    public void mo2629b(Intent intent) {
        C0299s.m1077b((Activity) this, intent);
    }

    public void onContentChanged() {
        mo2639j();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo2640k().mo2677c(bundle);
    }

    /* renamed from: k */
    public C0719c mo2640k() {
        if (this.f1894k == null) {
            this.f1894k = C0719c.m2886a((Activity) this, (C0718b) this);
        }
        return this.f1894k;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar h = mo2636h();
        if (keyCode != 82 || h == null || !h.mo2578a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public Resources getResources() {
        if (this.f1896m == null && C0987bd.m4446a()) {
            this.f1896m = new C0987bd(this, super.getResources());
        }
        return this.f1896m == null ? super.getResources() : this.f1896m;
    }

    /* renamed from: a */
    private boolean m2737a(int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            Window window = getWindow();
            if (!(window == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent))) {
                return true;
            }
        }
        return false;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m2737a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void openOptionsMenu() {
        ActionBar h = mo2636h();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (h == null || !h.mo2582c()) {
            super.openOptionsMenu();
        }
    }

    public void closeOptionsMenu() {
        ActionBar h = mo2636h();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (h == null || !h.mo2584d()) {
            super.closeOptionsMenu();
        }
    }
}

package android.support.p017v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v4.view.b */
/* compiled from: ActionProvider */
public abstract class C0572b {

    /* renamed from: a */
    private final Context f1412a;

    /* renamed from: b */
    private C0573a f1413b;

    /* renamed from: c */
    private C0574b f1414c;

    /* renamed from: android.support.v4.view.b$a */
    /* compiled from: ActionProvider */
    public interface C0573a {
        /* renamed from: a */
        void mo2064a(boolean z);
    }

    /* renamed from: android.support.v4.view.b$b */
    /* compiled from: ActionProvider */
    public interface C0574b {
        /* renamed from: a */
        void mo2065a(boolean z);
    }

    /* renamed from: a */
    public abstract View mo2053a();

    /* renamed from: a */
    public void mo2057a(SubMenu subMenu) {
    }

    /* renamed from: b */
    public boolean mo2059b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo2060c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo2061d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo2062e() {
        return false;
    }

    public C0572b(Context context) {
        this.f1412a = context;
    }

    /* renamed from: a */
    public View mo2054a(MenuItem menuItem) {
        return mo2053a();
    }

    /* renamed from: a */
    public void mo2058a(boolean z) {
        if (this.f1413b != null) {
            this.f1413b.mo2064a(z);
        }
    }

    /* renamed from: a */
    public void mo2055a(C0573a aVar) {
        this.f1413b = aVar;
    }

    /* renamed from: a */
    public void mo2056a(C0574b bVar) {
        if (!(this.f1414c == null || bVar == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sb.toString());
        }
        this.f1414c = bVar;
    }

    /* renamed from: f */
    public void mo2063f() {
        this.f1414c = null;
        this.f1413b = null;
    }
}

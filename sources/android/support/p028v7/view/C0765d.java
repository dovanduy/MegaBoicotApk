package android.support.p028v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.p028v7.p029a.C0672a.C0681i;
import android.view.LayoutInflater;

/* renamed from: android.support.v7.view.d */
/* compiled from: ContextThemeWrapper */
public class C0765d extends ContextWrapper {

    /* renamed from: a */
    private int f2153a;

    /* renamed from: b */
    private Theme f2154b;

    /* renamed from: c */
    private LayoutInflater f2155c;

    /* renamed from: d */
    private Configuration f2156d;

    /* renamed from: e */
    private Resources f2157e;

    public C0765d() {
        super(null);
    }

    public C0765d(Context context, int i) {
        super(context);
        this.f2153a = i;
    }

    public C0765d(Context context, Theme theme) {
        super(context);
        this.f2154b = theme;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public Resources getResources() {
        return m3128b();
    }

    /* renamed from: b */
    private Resources m3128b() {
        if (this.f2157e == null) {
            if (this.f2156d == null) {
                this.f2157e = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                this.f2157e = createConfigurationContext(this.f2156d).getResources();
            }
        }
        return this.f2157e;
    }

    public void setTheme(int i) {
        if (this.f2153a != i) {
            this.f2153a = i;
            m3129c();
        }
    }

    /* renamed from: a */
    public int mo2958a() {
        return this.f2153a;
    }

    public Theme getTheme() {
        if (this.f2154b != null) {
            return this.f2154b;
        }
        if (this.f2153a == 0) {
            this.f2153a = C0681i.Theme_AppCompat_Light;
        }
        m3129c();
        return this.f2154b;
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2155c == null) {
            this.f2155c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2155c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2959a(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    /* renamed from: c */
    private void m3129c() {
        boolean z = this.f2154b == null;
        if (z) {
            this.f2154b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2154b.setTo(theme);
            }
        }
        mo2959a(this.f2154b, this.f2153a, z);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }
}

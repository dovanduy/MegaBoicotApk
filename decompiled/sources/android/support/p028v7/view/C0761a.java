package android.support.p028v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p029a.C0672a.C0674b;
import android.support.p028v7.p029a.C0672a.C0676d;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.view.ViewConfiguration;

/* renamed from: android.support.v7.view.a */
/* compiled from: ActionBarPolicy */
public class C0761a {

    /* renamed from: a */
    private Context f2150a;

    /* renamed from: a */
    public static C0761a m3097a(Context context) {
        return new C0761a(context);
    }

    private C0761a(Context context) {
        this.f2150a = context;
    }

    /* renamed from: a */
    public int mo2946a() {
        Configuration configuration = this.f2150a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    /* renamed from: b */
    public boolean mo2947b() {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f2150a).hasPermanentMenuKey();
    }

    /* renamed from: c */
    public int mo2948c() {
        return this.f2150a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public boolean mo2949d() {
        return this.f2150a.getResources().getBoolean(C0674b.abc_action_bar_embed_tabs);
    }

    /* renamed from: e */
    public int mo2950e() {
        TypedArray obtainStyledAttributes = this.f2150a.obtainStyledAttributes(null, C0682j.ActionBar, C0673a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0682j.ActionBar_height, 0);
        Resources resources = this.f2150a.getResources();
        if (!mo2949d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0676d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean mo2951f() {
        return this.f2150a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: g */
    public int mo2952g() {
        return this.f2150a.getResources().getDimensionPixelSize(C0676d.abc_action_bar_stacked_tab_max_width);
    }
}

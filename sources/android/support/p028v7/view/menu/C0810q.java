package android.support.p028v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p017v4.p018a.p019a.C0205a;
import android.support.p017v4.p018a.p019a.C0206b;
import android.support.p017v4.p018a.p019a.C0207c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.q */
/* compiled from: MenuWrapperFactory */
public final class C0810q {
    /* renamed from: a */
    public static Menu m3423a(Context context, C0205a aVar) {
        return new C0811r(context, aVar);
    }

    /* renamed from: a */
    public static MenuItem m3424a(Context context, C0206b bVar) {
        if (VERSION.SDK_INT >= 16) {
            return new C0801l(context, bVar);
        }
        return new C0796k(context, bVar);
    }

    /* renamed from: a */
    public static SubMenu m3425a(Context context, C0207c cVar) {
        return new C0817v(context, cVar);
    }
}

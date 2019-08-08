package android.support.p028v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: android.support.v7.app.c */
/* compiled from: AppCompatDelegate */
public abstract class C0719c {

    /* renamed from: a */
    private static int f1998a = -1;

    /* renamed from: a */
    public abstract ActionBar mo2651a();

    /* renamed from: a */
    public abstract <T extends View> T mo2655a(int i);

    /* renamed from: a */
    public abstract void mo2658a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo2659a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo2662a(View view);

    /* renamed from: a */
    public abstract void mo2663a(View view, LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo2665a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo2670b();

    /* renamed from: b */
    public abstract void mo2671b(int i);

    /* renamed from: b */
    public abstract void mo2672b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo2674b(View view, LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo2676c();

    /* renamed from: c */
    public abstract void mo2677c(Bundle bundle);

    /* renamed from: c */
    public abstract boolean mo2678c(int i);

    /* renamed from: d */
    public abstract void mo2680d();

    /* renamed from: e */
    public abstract void mo2682e();

    /* renamed from: f */
    public abstract void mo2684f();

    /* renamed from: g */
    public abstract void mo2686g();

    /* renamed from: h */
    public abstract void mo2689h();

    /* renamed from: i */
    public abstract boolean mo2691i();

    /* renamed from: a */
    public static C0719c m2886a(Activity activity, C0718b bVar) {
        return new AppCompatDelegateImpl(activity, activity.getWindow(), bVar);
    }

    /* renamed from: a */
    public static C0719c m2887a(Dialog dialog, C0718b bVar) {
        return new AppCompatDelegateImpl(dialog.getContext(), dialog.getWindow(), bVar);
    }

    C0719c() {
    }

    /* renamed from: j */
    public static int m2888j() {
        return f1998a;
    }
}

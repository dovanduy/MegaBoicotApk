package android.support.p017v4.view;

import android.os.Build.VERSION;
import android.support.p012a.C0118a.C0122d;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.t */
/* compiled from: ViewGroupCompat */
public final class C0600t {
    /* renamed from: a */
    public static boolean m2291a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C0122d.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0595r.m2265n(viewGroup) == null) ? false : true;
    }
}

package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.x */
final class C4737x implements Comparator<ActivityTransition> {
    C4737x() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        int a = activityTransition.mo16972a();
        int a2 = activityTransition2.mo16972a();
        if (a != a2) {
            return a < a2 ? -1 : 1;
        }
        int b = activityTransition.mo16973b();
        int b2 = activityTransition2.mo16973b();
        if (b == b2) {
            return 0;
        }
        return b < b2 ? -1 : 1;
    }
}

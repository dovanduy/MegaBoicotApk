package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C3369i.C3370a;
import com.google.android.gms.common.internal.C3513t;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.j */
public class C3373j {

    /* renamed from: a */
    private final Set<C3369i<?>> f9789a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public final void mo13357a() {
        for (C3369i a : this.f9789a) {
            a.mo13348a();
        }
        this.f9789a.clear();
    }

    /* renamed from: a */
    public static <L> C3369i<L> m12124a(L l, Looper looper, String str) {
        C3513t.m12626a(l, (Object) "Listener must not be null");
        C3513t.m12626a(looper, (Object) "Looper must not be null");
        C3513t.m12626a(str, (Object) "Listener type must not be null");
        return new C3369i<>(looper, l, str);
    }

    /* renamed from: a */
    public static <L> C3370a<L> m12123a(L l, String str) {
        C3513t.m12626a(l, (Object) "Listener must not be null");
        C3513t.m12626a(str, (Object) "Listener type must not be null");
        C3513t.m12628a(str, (Object) "Listener type must not be empty");
        return new C3370a<>(l, str);
    }
}

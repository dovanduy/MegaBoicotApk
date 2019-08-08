package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3025aw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.po */
public final class C4072po implements Iterable<C4070pm> {

    /* renamed from: a */
    private final List<C4070pm> f13783a = new ArrayList();

    /* renamed from: a */
    public static boolean m17647a(C4061pd pdVar) {
        C4070pm b = m17648b(pdVar);
        if (b == null) {
            return false;
        }
        b.f13780b.mo15839b();
        return true;
    }

    /* renamed from: b */
    static C4070pm m17648b(C4061pd pdVar) {
        Iterator it = C3025aw.m10938z().iterator();
        while (it.hasNext()) {
            C4070pm pmVar = (C4070pm) it.next();
            if (pmVar.f13779a == pdVar) {
                return pmVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final int mo15832a() {
        return this.f13783a.size();
    }

    /* renamed from: a */
    public final void mo15833a(C4070pm pmVar) {
        this.f13783a.add(pmVar);
    }

    /* renamed from: b */
    public final void mo15834b(C4070pm pmVar) {
        this.f13783a.remove(pmVar);
    }

    public final Iterator<C4070pm> iterator() {
        return this.f13783a.iterator();
    }
}

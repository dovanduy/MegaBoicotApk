package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3244a.C3255f;
import com.google.android.gms.common.internal.C3469d.C3472c;
import com.google.android.gms.common.internal.C3493l;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.ac */
final class C3280ac extends C3287aj {

    /* renamed from: a */
    final /* synthetic */ C3389z f9530a;

    /* renamed from: b */
    private final Map<C3255f, C3279ab> f9531b;

    public C3280ac(C3389z zVar, Map<C3255f, C3279ab> map) {
        this.f9530a = zVar;
        super(zVar, null);
        this.f9531b = map;
    }

    /* renamed from: a */
    public final void mo13181a() {
        C3493l lVar = new C3493l(this.f9530a.f9812d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C3255f fVar : this.f9531b.keySet()) {
            if (!fVar.mo13102k() || ((C3279ab) this.f9531b.get(fVar)).f9529c) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList3 = arrayList;
            int size = arrayList3.size();
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                i = lVar.mo13607a(this.f9530a.f9811c, (C3255f) obj);
                if (i != 0) {
                    break;
                }
            }
        } else {
            ArrayList arrayList4 = arrayList2;
            int size2 = arrayList4.size();
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                i = lVar.mo13607a(this.f9530a.f9811c, (C3255f) obj2);
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            this.f9530a.f9809a.mo13211a((C3299av) new C3281ad(this, this.f9530a, new ConnectionResult(i, null)));
            return;
        }
        if (this.f9530a.f9821m) {
            this.f9530a.f9819k.mo17794A();
        }
        for (C3255f fVar2 : this.f9531b.keySet()) {
            C3472c cVar = (C3472c) this.f9531b.get(fVar2);
            if (!fVar2.mo13102k() || lVar.mo13607a(this.f9530a.f9811c, fVar2) == 0) {
                fVar2.mo13094a(cVar);
            } else {
                this.f9530a.f9809a.mo13211a((C3299av) new C3282ae(this, this.f9530a, cVar));
            }
        }
    }
}

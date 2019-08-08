package com.google.android.gms.internal.p148e;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.e.bl */
final class C4471bl implements Comparator<C4469bj> {
    C4471bl() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C4469bj bjVar = (C4469bj) obj;
        C4469bj bjVar2 = (C4469bj) obj2;
        C4476bq bqVar = (C4476bq) bjVar.iterator();
        C4476bq bqVar2 = (C4476bq) bjVar2.iterator();
        while (bqVar.hasNext() && bqVar2.hasNext()) {
            int compare = Integer.compare(C4469bj.m18962b(bqVar.mo16402a()), C4469bj.m18962b(bqVar2.mo16402a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(bjVar.mo16389a(), bjVar2.mo16389a());
    }
}

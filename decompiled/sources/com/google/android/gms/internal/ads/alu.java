package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class alu implements Comparator<alh> {
    public alu(alt alt) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        alh alh = (alh) obj;
        alh alh2 = (alh) obj2;
        if (alh.mo14489b() < alh2.mo14489b()) {
            return -1;
        }
        if (alh.mo14489b() > alh2.mo14489b()) {
            return 1;
        }
        if (alh.mo14488a() < alh2.mo14488a()) {
            return -1;
        }
        if (alh.mo14488a() > alh2.mo14488a()) {
            return 1;
        }
        float d = (alh.mo14491d() - alh.mo14489b()) * (alh.mo14490c() - alh.mo14488a());
        float d2 = (alh2.mo14491d() - alh2.mo14489b()) * (alh2.mo14490c() - alh2.mo14488a());
        if (d > d2) {
            return -1;
        }
        return d < d2 ? 1 : 0;
    }
}

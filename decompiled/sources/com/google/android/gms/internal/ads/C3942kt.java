package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.kt */
public final class C3942kt {

    /* renamed from: a */
    private final String[] f13469a;

    /* renamed from: b */
    private final double[] f13470b;

    /* renamed from: c */
    private final double[] f13471c;

    /* renamed from: d */
    private final int[] f13472d;

    /* renamed from: e */
    private int f13473e;

    private C3942kt(C3945kw kwVar) {
        int size = kwVar.f13480b.size();
        this.f13469a = (String[]) kwVar.f13479a.toArray(new String[size]);
        this.f13470b = m17284a(kwVar.f13480b);
        this.f13471c = m17284a(kwVar.f13481c);
        this.f13472d = new int[size];
        this.f13473e = 0;
    }

    /* renamed from: a */
    private static double[] m17284a(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public final List<C3944kv> mo15584a() {
        ArrayList arrayList = new ArrayList(this.f13469a.length);
        for (int i = 0; i < this.f13469a.length; i++) {
            C3944kv kvVar = new C3944kv(this.f13469a[i], this.f13471c[i], this.f13470b[i], ((double) this.f13472d[i]) / ((double) this.f13473e), this.f13472d[i]);
            arrayList.add(kvVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo15585a(double d) {
        this.f13473e++;
        int i = 0;
        while (i < this.f13471c.length) {
            if (this.f13471c[i] <= d && d < this.f13470b[i]) {
                int[] iArr = this.f13472d;
                iArr[i] = iArr[i] + 1;
            }
            if (d >= this.f13471c[i]) {
                i++;
            } else {
                return;
            }
        }
    }
}

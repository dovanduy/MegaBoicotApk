package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.kw */
public final class C3945kw {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<String> f13479a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<Double> f13480b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<Double> f13481c = new ArrayList();

    /* renamed from: a */
    public final C3942kt mo15589a() {
        return new C3942kt(this);
    }

    /* renamed from: a */
    public final C3945kw mo15590a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f13479a.size()) {
            double doubleValue = ((Double) this.f13481c.get(i)).doubleValue();
            double doubleValue2 = ((Double) this.f13480b.get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f13479a.add(i, str);
        this.f13481c.add(i, Double.valueOf(d));
        this.f13480b.add(i, Double.valueOf(d2));
        return this;
    }
}

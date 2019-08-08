package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3244a.C3255f;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.internal.af */
final class C3283af extends C3287aj {

    /* renamed from: a */
    private final ArrayList<C3255f> f9535a;

    /* renamed from: b */
    private final /* synthetic */ C3389z f9536b;

    public C3283af(C3389z zVar, ArrayList<C3255f> arrayList) {
        this.f9536b = zVar;
        super(zVar, null);
        this.f9535a = arrayList;
    }

    /* renamed from: a */
    public final void mo13181a() {
        this.f9536b.f9809a.f9583d.f9545c = this.f9536b.m12199i();
        ArrayList arrayList = this.f9535a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C3255f) obj).mo13096a(this.f9536b.f9823o, this.f9536b.f9809a.f9583d.f9545c);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class agv extends agu {
    private agv(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* renamed from: a */
    public static agv m14092a(String str, Context context, boolean z) {
        m14083a(context, z);
        return new agv(context, str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<Callable<Void>> mo14283a(ahn ahn, C4378zo zoVar, C4274wk wkVar) {
        if (ahn.mo14307c() == null || !this.f11022r) {
            return super.mo14283a(ahn, zoVar, wkVar);
        }
        int n = ahn.mo14318n();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo14283a(ahn, zoVar, wkVar));
        aih aih = new aih(ahn, "1QeH3Cf7T53ayw17Ebbo9YTdhU+IFx0X5nCtC5gZQym4uicOVPXxYWmMK9k58i8n", "bHJRpFJ+2R5LAbYQUBDMyfYpLd1oiGixlpIqMJOBQPY=", zoVar, n, 24);
        arrayList.add(aih);
        return arrayList;
    }
}

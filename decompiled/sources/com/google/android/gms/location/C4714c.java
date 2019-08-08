package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.C3263e;
import com.google.android.gms.common.api.internal.C3277a;
import com.google.android.gms.common.api.internal.C3377n;
import com.google.android.gms.common.internal.C3506s;
import com.google.android.gms.p143d.C3583g;

/* renamed from: com.google.android.gms.location.c */
public class C4714c extends C3263e<Object> {
    public C4714c(Context context) {
        super(context, C4719h.f15339a, null, (C3377n) new C3277a());
    }

    /* renamed from: a */
    public C3583g<Void> mo17042a(PendingIntent pendingIntent) {
        return C3506s.m12552a(C4698a.f15336b.mo16910a(mo13121f(), pendingIntent));
    }

    /* renamed from: a */
    public C3583g<Void> mo17043a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        return C3506s.m12552a(C4698a.f15336b.mo16911a(mo13121f(), activityTransitionRequest, pendingIntent));
    }
}

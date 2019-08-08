package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.measurement.internal.ca */
public final class C4796ca {

    /* renamed from: a */
    final Context f15578a;

    /* renamed from: b */
    String f15579b;

    /* renamed from: c */
    String f15580c;

    /* renamed from: d */
    String f15581d;

    /* renamed from: e */
    boolean f15582e = true;

    /* renamed from: f */
    Boolean f15583f;

    /* renamed from: g */
    C4888m f15584g;

    public C4796ca(Context context, C4888m mVar) {
        C3513t.m12625a(context);
        Context applicationContext = context.getApplicationContext();
        C3513t.m12625a(applicationContext);
        this.f15578a = applicationContext;
        if (mVar != null) {
            this.f15584g = mVar;
            this.f15579b = mVar.f15949f;
            this.f15580c = mVar.f15948e;
            this.f15581d = mVar.f15947d;
            this.f15582e = mVar.f15946c;
            if (mVar.f15950g != null) {
                this.f15583f = Boolean.valueOf(mVar.f15950g.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}

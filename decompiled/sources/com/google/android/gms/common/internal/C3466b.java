package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C3260b;
import com.google.android.gms.common.api.C3390j;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b */
public class C3466b {
    /* renamed from: a */
    public static C3260b m12392a(Status status) {
        if (status.mo13079c()) {
            return new C3390j(status);
        }
        return new C3260b(status);
    }
}

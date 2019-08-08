package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.common.api.p */
public final class C3396p extends UnsupportedOperationException {

    /* renamed from: a */
    private final Feature f9832a;

    public C3396p(Feature feature) {
        this.f9832a = feature;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f9832a);
        StringBuilder sb = new StringBuilder(8 + String.valueOf(valueOf).length());
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}

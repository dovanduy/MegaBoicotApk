package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class aii implements Callable {

    /* renamed from: a */
    private final ahn f11138a;

    /* renamed from: b */
    private final C4378zo f11139b;

    public aii(ahn ahn, C4378zo zoVar) {
        this.f11138a = ahn;
        this.f11139b = zoVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() throws Exception {
        if (this.f11138a.mo14316l() != null) {
            this.f11138a.mo14316l().get();
        }
        C4378zo k = this.f11138a.mo14315k();
        if (k != null) {
            try {
                synchronized (this.f11139b) {
                    afc.m13974a(this.f11139b, afc.m13976a((afc) k));
                }
            } catch (afb unused) {
            }
        }
        return null;
    }
}

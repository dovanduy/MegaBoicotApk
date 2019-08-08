package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.p135a.C2961a;
import com.google.android.gms.common.C3412e;
import com.google.android.gms.common.C3413f;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ih */
final class C3876ih implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Context f13244a;

    /* renamed from: b */
    private final /* synthetic */ C4019np f13245b;

    C3876ih(C3875ig igVar, Context context, C4019np npVar) {
        this.f13244a = context;
        this.f13245b = npVar;
    }

    public final void run() {
        try {
            this.f13245b.mo15686b(C2961a.m10593a(this.f13244a));
        } catch (C3412e | C3413f | IOException | IllegalStateException e) {
            this.f13245b.mo15685a(e);
            C3987mk.m17430b("Exception while getting advertising Id info", e);
        }
    }
}

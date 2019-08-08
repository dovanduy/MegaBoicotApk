package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C4089qe;
import com.google.android.gms.internal.ads.bcm;
import com.google.android.gms.internal.ads.bcq;
import com.google.android.gms.p137b.C3238b;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.x */
final class C3137x implements C3067ae<C4089qe> {

    /* renamed from: a */
    private final /* synthetic */ bcm f9142a;

    /* renamed from: b */
    private final /* synthetic */ C3054d f9143b;

    /* renamed from: c */
    private final /* synthetic */ bcq f9144c;

    C3137x(bcm bcm, C3054d dVar, bcq bcq) {
        this.f9142a = bcm;
        this.f9143b = dVar;
        this.f9144c = bcq;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C4089qe qeVar = (C4089qe) obj;
        View view = qeVar.getView();
        if (view != null) {
            try {
                if (this.f9142a == null) {
                    if (this.f9144c != null) {
                        if (!this.f9144c.mo15144i()) {
                            this.f9144c.mo15133a(C3238b.m11573a(view));
                            this.f9143b.f8933a.mo9646e();
                            return;
                        }
                        C3132s.m11242b(qeVar);
                    }
                } else if (!this.f9142a.mo15124k()) {
                    this.f9142a.mo15111a(C3238b.m11573a(view));
                    this.f9143b.f8933a.mo9646e();
                } else {
                    C3132s.m11242b(qeVar);
                }
            } catch (RemoteException e) {
                C3900je.m17432c("Unable to call handleClick on mapper", e);
            }
        }
    }
}

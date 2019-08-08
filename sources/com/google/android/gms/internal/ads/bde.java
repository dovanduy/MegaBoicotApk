package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.C2764a.C2765a;
import com.google.ads.mediation.C2776c;
import com.google.ads.mediation.C2783d;
import com.google.ads.mediation.C2784e;
import com.google.ads.mediation.C2787f;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;

@C3718cm
public final class bde<NETWORK_EXTRAS extends C2787f, SERVER_PARAMETERS extends C2784e> implements C2776c, C2783d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final bcg f12688a;

    public bde(bcg bcg) {
        this.f12688a = bcg;
    }

    /* renamed from: a */
    public final void mo9660a(MediationBannerAdapter<?, ?> mediationBannerAdapter, C2765a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(47 + String.valueOf(valueOf).length());
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        C3987mk.m17429b(sb.toString());
        aoq.m14615a();
        if (!C3975lz.m17382b()) {
            C3987mk.m17434d("#008 Must be called on the main UI thread.", null);
            C3975lz.f13539a.post(new bdf(this, aVar));
            return;
        }
        try {
            this.f12688a.mo15057a(bdi.m16366a(aVar));
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo9667a(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, C2765a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(47 + String.valueOf(valueOf).length());
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        C3987mk.m17429b(sb.toString());
        aoq.m14615a();
        if (!C3975lz.m17382b()) {
            C3987mk.m17434d("#008 Must be called on the main UI thread.", null);
            C3975lz.f13539a.post(new bdh(this, aVar));
            return;
        }
        try {
            this.f12688a.mo15057a(bdi.m16366a(aVar));
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }
}

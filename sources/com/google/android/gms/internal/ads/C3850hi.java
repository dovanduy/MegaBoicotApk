package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.C3165a;
import com.google.android.gms.ads.reward.mediation.C3169a;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.p137b.C3238b;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.hi */
public final class C3850hi implements C3169a {

    /* renamed from: a */
    private final C3847hf f13197a;

    public C3850hi(C3847hf hfVar) {
        this.f13197a = hfVar;
    }

    /* renamed from: a */
    public final void mo12840a(Bundle bundle) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdMetadataChanged.");
        try {
            this.f13197a.mo15340a(bundle);
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12841a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onInitializationSucceeded.");
        try {
            this.f13197a.mo15341a(C3238b.m11573a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12842a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdFailedToLoad.");
        try {
            this.f13197a.mo15348b(C3238b.m11573a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12843a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, C3165a aVar) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onRewarded.");
        if (aVar != null) {
            try {
                this.f13197a.mo15343a(C3238b.m11573a(mediationRewardedVideoAdAdapter), new zzaig(aVar));
            } catch (RemoteException e) {
                C3987mk.m17434d("#007 Could not call remote method.", e);
            }
        } else {
            this.f13197a.mo15343a(C3238b.m11573a(mediationRewardedVideoAdAdapter), new zzaig("", 1));
        }
    }

    /* renamed from: b */
    public final void mo12844b(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdLoaded.");
        try {
            this.f13197a.mo15347b(C3238b.m11573a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo12845c(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdOpened.");
        try {
            this.f13197a.mo15349c(C3238b.m11573a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo12846d(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onVideoStarted.");
        try {
            this.f13197a.mo15350d(C3238b.m11573a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo12847e(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdClosed.");
        try {
            this.f13197a.mo15351e(C3238b.m11573a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo12848f(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdLeftApplication.");
        try {
            this.f13197a.mo15353g(C3238b.m11573a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: g */
    public final void mo12849g(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onVideoCompleted.");
        try {
            this.f13197a.mo15354h(C3238b.m11573a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }
}

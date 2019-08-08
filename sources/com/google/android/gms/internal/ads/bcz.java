package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C3000i;
import com.google.android.gms.ads.formats.C2990f;
import com.google.android.gms.ads.mediation.C3146c;
import com.google.android.gms.ads.mediation.C3155d;
import com.google.android.gms.ads.mediation.C3156e;
import com.google.android.gms.ads.mediation.C3157f;
import com.google.android.gms.ads.mediation.C3163l;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.internal.C3513t;

@C3718cm
public final class bcz implements C3146c, C3155d, C3156e {

    /* renamed from: a */
    private final bcg f12670a;

    /* renamed from: b */
    private C3157f f12671b;

    /* renamed from: c */
    private C3163l f12672c;

    /* renamed from: d */
    private C2990f f12673d;

    public bcz(bcg bcg) {
        this.f12670a = bcg;
    }

    /* renamed from: a */
    private static void m16253a(MediationNativeAdapter mediationNativeAdapter, C3163l lVar, C3157f fVar) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            C3000i iVar = new C3000i();
            iVar.mo12375a((aqe) new bcw());
            if (lVar != null && lVar.mo12826k()) {
                lVar.mo12804a(iVar);
            }
            if (fVar != null && fVar.mo12765h()) {
                fVar.mo12753a(iVar);
            }
        }
    }

    /* renamed from: a */
    public final C3157f mo15172a() {
        return this.f12671b;
    }

    /* renamed from: a */
    public final void mo12721a(MediationBannerAdapter mediationBannerAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdLoaded.");
        try {
            this.f12670a.mo15067e();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12722a(MediationBannerAdapter mediationBannerAdapter, int i) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        C3987mk.m17429b(sb.toString());
        try {
            this.f12670a.mo15057a(i);
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12723a(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAppEvent.");
        try {
            this.f12670a.mo15063a(str, str2);
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12736a(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdLoaded.");
        try {
            this.f12670a.mo15067e();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12737a(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        C3987mk.m17429b(sb.toString());
        try {
            this.f12670a.mo15057a(i);
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12742a(MediationNativeAdapter mediationNativeAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdOpened.");
        try {
            this.f12670a.mo15066d();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12743a(MediationNativeAdapter mediationNativeAdapter, int i) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        C3987mk.m17429b(sb.toString());
        try {
            this.f12670a.mo15057a(i);
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12744a(MediationNativeAdapter mediationNativeAdapter, C2990f fVar) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        String str = "Adapter called onAdLoaded with template id ";
        String valueOf = String.valueOf(fVar.mo12358a());
        C3987mk.m17429b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        this.f12673d = fVar;
        try {
            this.f12670a.mo15067e();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12745a(MediationNativeAdapter mediationNativeAdapter, C2990f fVar, String str) {
        if (fVar instanceof avh) {
            try {
                this.f12670a.mo15058a(((avh) fVar).mo14886b(), str);
            } catch (RemoteException e) {
                C3987mk.m17434d("#007 Could not call remote method.", e);
            }
        } else {
            C3987mk.m17435e("Unexpected native custom template ad type.");
        }
    }

    /* renamed from: a */
    public final void mo12746a(MediationNativeAdapter mediationNativeAdapter, C3157f fVar) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdLoaded.");
        this.f12671b = fVar;
        this.f12672c = null;
        m16253a(mediationNativeAdapter, this.f12672c, this.f12671b);
        try {
            this.f12670a.mo15067e();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo12747a(MediationNativeAdapter mediationNativeAdapter, C3163l lVar) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdLoaded.");
        this.f12672c = lVar;
        this.f12671b = null;
        m16253a(mediationNativeAdapter, this.f12672c, this.f12671b);
        try {
            this.f12670a.mo15067e();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final C3163l mo15173b() {
        return this.f12672c;
    }

    /* renamed from: b */
    public final void mo12724b(MediationBannerAdapter mediationBannerAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdOpened.");
        try {
            this.f12670a.mo15066d();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo12738b(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdOpened.");
        try {
            this.f12670a.mo15066d();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo12748b(MediationNativeAdapter mediationNativeAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdClosed.");
        try {
            this.f12670a.mo15064b();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final C2990f mo15174c() {
        return this.f12673d;
    }

    /* renamed from: c */
    public final void mo12725c(MediationBannerAdapter mediationBannerAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdClosed.");
        try {
            this.f12670a.mo15064b();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo12739c(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdClosed.");
        try {
            this.f12670a.mo15064b();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo12749c(MediationNativeAdapter mediationNativeAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdLeftApplication.");
        try {
            this.f12670a.mo15065c();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo12726d(MediationBannerAdapter mediationBannerAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdLeftApplication.");
        try {
            this.f12670a.mo15065c();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo12740d(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdLeftApplication.");
        try {
            this.f12670a.mo15065c();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo12750d(MediationNativeAdapter mediationNativeAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3157f fVar = this.f12671b;
        C3163l lVar = this.f12672c;
        if (this.f12673d == null) {
            if (fVar == null && lVar == null) {
                C3987mk.m17434d("#007 Could not call remote method.", null);
                return;
            } else if (lVar != null && !lVar.mo12832q()) {
                C3987mk.m17429b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (fVar != null && !fVar.mo12758b()) {
                C3987mk.m17429b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        C3987mk.m17429b("Adapter called onAdClicked.");
        try {
            this.f12670a.mo15056a();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo12727e(MediationBannerAdapter mediationBannerAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdClicked.");
        try {
            this.f12670a.mo15056a();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo12741e(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3987mk.m17429b("Adapter called onAdClicked.");
        try {
            this.f12670a.mo15056a();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo12751e(MediationNativeAdapter mediationNativeAdapter) {
        C3513t.m12634b("#008 Must be called on the main UI thread.");
        C3157f fVar = this.f12671b;
        C3163l lVar = this.f12672c;
        if (this.f12673d == null) {
            if (fVar == null && lVar == null) {
                C3987mk.m17434d("#007 Could not call remote method.", null);
                return;
            } else if (lVar != null && !lVar.mo12831p()) {
                C3987mk.m17429b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (fVar != null && !fVar.mo12755a()) {
                C3987mk.m17429b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        C3987mk.m17429b("Adapter called onAdImpression.");
        try {
            this.f12670a.mo15068f();
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }
}

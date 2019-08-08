package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C2960a;
import com.google.android.gms.ads.C2967b;
import com.google.android.gms.ads.C2967b.C2968a;
import com.google.android.gms.ads.C2971c;
import com.google.android.gms.ads.C2971c.C2972a;
import com.google.android.gms.ads.C2973d;
import com.google.android.gms.ads.C2979f;
import com.google.android.gms.ads.C3000i;
import com.google.android.gms.ads.doubleclick.C2974a;
import com.google.android.gms.ads.formats.C2980a;
import com.google.android.gms.ads.formats.C2983b;
import com.google.android.gms.ads.formats.C2985c;
import com.google.android.gms.ads.formats.C2986d;
import com.google.android.gms.ads.formats.C2986d.C2987a;
import com.google.android.gms.ads.formats.C2988e;
import com.google.android.gms.ads.formats.C2988e.C2989a;
import com.google.android.gms.ads.formats.C2990f;
import com.google.android.gms.ads.formats.C2990f.C2991a;
import com.google.android.gms.ads.formats.C2990f.C2992b;
import com.google.android.gms.ads.formats.C2993g;
import com.google.android.gms.ads.formats.C2993g.C2994a;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.C3143a;
import com.google.android.gms.ads.mediation.C3144b.C3145a;
import com.google.android.gms.ads.mediation.C3146c;
import com.google.android.gms.ads.mediation.C3155d;
import com.google.android.gms.ads.mediation.C3156e;
import com.google.android.gms.ads.mediation.C3157f;
import com.google.android.gms.ads.mediation.C3158g;
import com.google.android.gms.ads.mediation.C3159h;
import com.google.android.gms.ads.mediation.C3160i;
import com.google.android.gms.ads.mediation.C3162k;
import com.google.android.gms.ads.mediation.C3163l;
import com.google.android.gms.ads.mediation.C3164m;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.C3167c;
import com.google.android.gms.ads.reward.C3168d;
import com.google.android.gms.ads.reward.mediation.C3169a;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3975lz;
import com.google.android.gms.internal.ads.C3987mk;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aqe;
import com.google.android.gms.internal.ads.zzatm;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@C3718cm
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, C3162k, C3164m, MediationRewardedVideoAdAdapter, zzatm {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzgw;
    private C2979f zzgx;
    private C2967b zzgy;
    private Context zzgz;
    /* access modifiers changed from: private */
    public C2979f zzha;
    /* access modifiers changed from: private */
    public C3169a zzhb;
    private final C3167c zzhc = new C2788g(this);

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$a */
    static class C2768a extends C3158g {

        /* renamed from: e */
        private final C2986d f8598e;

        public C2768a(C2986d dVar) {
            this.f8598e = dVar;
            mo12768a(dVar.mo12342b().toString());
            mo12769a(dVar.mo12343c());
            mo12770b(dVar.mo12344d().toString());
            mo12767a(dVar.mo12345e());
            mo12771c(dVar.mo12346f().toString());
            if (dVar.mo12347g() != null) {
                mo12766a(dVar.mo12347g().doubleValue());
            }
            if (dVar.mo12348h() != null) {
                mo12772d(dVar.mo12348h().toString());
            }
            if (dVar.mo12349i() != null) {
                mo12773e(dVar.mo12349i().toString());
            }
            mo12754a(true);
            mo12757b(true);
            mo12753a(dVar.mo12350j());
        }

        /* renamed from: a */
        public final void mo9638a(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f8598e);
            }
            C2985c cVar = (C2985c) C2985c.f8723a.get(view);
            if (cVar != null) {
                cVar.mo12340a((C2980a) this.f8598e);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$b */
    static class C2769b extends C3159h {

        /* renamed from: e */
        private final C2988e f8599e;

        public C2769b(C2988e eVar) {
            this.f8599e = eVar;
            mo12783a(eVar.mo12351b().toString());
            mo12784a(eVar.mo12352c());
            mo12785b(eVar.mo12353d().toString());
            if (eVar.mo12354e() != null) {
                mo12782a(eVar.mo12354e());
            }
            mo12786c(eVar.mo12355f().toString());
            mo12787d(eVar.mo12356g().toString());
            mo12754a(true);
            mo12757b(true);
            mo12753a(eVar.mo12357h());
        }

        /* renamed from: a */
        public final void mo9638a(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f8599e);
            }
            C2985c cVar = (C2985c) C2985c.f8723a.get(view);
            if (cVar != null) {
                cVar.mo12340a((C2980a) this.f8599e);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$c */
    static class C2770c extends C3163l {

        /* renamed from: a */
        private final C2993g f8600a;

        public C2770c(C2993g gVar) {
            this.f8600a = gVar;
            mo12807a(gVar.mo12359a());
            mo12808a(gVar.mo12360b());
            mo12812b(gVar.mo12361c());
            mo12803a(gVar.mo12362d());
            mo12815c(gVar.mo12363e());
            mo12817d(gVar.mo12364f());
            mo12805a(gVar.mo12365g());
            mo12819e(gVar.mo12366h());
            mo12821f(gVar.mo12367i());
            mo12806a(gVar.mo12370l());
            mo12809a(true);
            mo12813b(true);
            mo12804a(gVar.mo12368j());
        }

        /* renamed from: a */
        public final void mo9639a(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).setNativeAd(this.f8600a);
                return;
            }
            C2985c cVar = (C2985c) C2985c.f8723a.get(view);
            if (cVar != null) {
                cVar.mo12341a(this.f8600a);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$d */
    static final class C2771d extends C2960a implements C2974a, anw {

        /* renamed from: a */
        private final AbstractAdViewAdapter f8601a;

        /* renamed from: b */
        private final C3146c f8602b;

        public C2771d(AbstractAdViewAdapter abstractAdViewAdapter, C3146c cVar) {
            this.f8601a = abstractAdViewAdapter;
            this.f8602b = cVar;
        }

        /* renamed from: a */
        public final void mo9640a() {
            this.f8602b.mo12721a(this.f8601a);
        }

        /* renamed from: a */
        public final void mo9641a(int i) {
            this.f8602b.mo12722a(this.f8601a, i);
        }

        /* renamed from: a */
        public final void mo9642a(String str, String str2) {
            this.f8602b.mo12723a(this.f8601a, str, str2);
        }

        /* renamed from: b */
        public final void mo9643b() {
            this.f8602b.mo12724b(this.f8601a);
        }

        /* renamed from: c */
        public final void mo9644c() {
            this.f8602b.mo12725c(this.f8601a);
        }

        /* renamed from: d */
        public final void mo9645d() {
            this.f8602b.mo12726d(this.f8601a);
        }

        /* renamed from: e */
        public final void mo9646e() {
            this.f8602b.mo12727e(this.f8601a);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$e */
    static final class C2772e extends C2960a implements anw {

        /* renamed from: a */
        private final AbstractAdViewAdapter f8603a;

        /* renamed from: b */
        private final C3155d f8604b;

        public C2772e(AbstractAdViewAdapter abstractAdViewAdapter, C3155d dVar) {
            this.f8603a = abstractAdViewAdapter;
            this.f8604b = dVar;
        }

        /* renamed from: a */
        public final void mo9640a() {
            this.f8604b.mo12736a(this.f8603a);
        }

        /* renamed from: a */
        public final void mo9641a(int i) {
            this.f8604b.mo12737a(this.f8603a, i);
        }

        /* renamed from: b */
        public final void mo9643b() {
            this.f8604b.mo12738b(this.f8603a);
        }

        /* renamed from: c */
        public final void mo9644c() {
            this.f8604b.mo12739c(this.f8603a);
        }

        /* renamed from: d */
        public final void mo9645d() {
            this.f8604b.mo12740d(this.f8603a);
        }

        /* renamed from: e */
        public final void mo9646e() {
            this.f8604b.mo12741e(this.f8603a);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$f */
    static final class C2773f extends C2960a implements C2987a, C2989a, C2991a, C2992b, C2994a {

        /* renamed from: a */
        private final AbstractAdViewAdapter f8605a;

        /* renamed from: b */
        private final C3156e f8606b;

        public C2773f(AbstractAdViewAdapter abstractAdViewAdapter, C3156e eVar) {
            this.f8605a = abstractAdViewAdapter;
            this.f8606b = eVar;
        }

        /* renamed from: a */
        public final void mo9640a() {
        }

        /* renamed from: a */
        public final void mo9641a(int i) {
            this.f8606b.mo12743a((MediationNativeAdapter) this.f8605a, i);
        }

        /* renamed from: a */
        public final void mo9647a(C2986d dVar) {
            this.f8606b.mo12746a((MediationNativeAdapter) this.f8605a, (C3157f) new C2768a(dVar));
        }

        /* renamed from: a */
        public final void mo9648a(C2988e eVar) {
            this.f8606b.mo12746a((MediationNativeAdapter) this.f8605a, (C3157f) new C2769b(eVar));
        }

        /* renamed from: a */
        public final void mo9649a(C2990f fVar) {
            this.f8606b.mo12744a((MediationNativeAdapter) this.f8605a, fVar);
        }

        /* renamed from: a */
        public final void mo9650a(C2990f fVar, String str) {
            this.f8606b.mo12745a(this.f8605a, fVar, str);
        }

        /* renamed from: a */
        public final void mo9651a(C2993g gVar) {
            this.f8606b.mo12747a((MediationNativeAdapter) this.f8605a, (C3163l) new C2770c(gVar));
        }

        /* renamed from: b */
        public final void mo9643b() {
            this.f8606b.mo12742a(this.f8605a);
        }

        /* renamed from: c */
        public final void mo9644c() {
            this.f8606b.mo12748b(this.f8605a);
        }

        /* renamed from: d */
        public final void mo9645d() {
            this.f8606b.mo12749c(this.f8605a);
        }

        /* renamed from: e */
        public final void mo9646e() {
            this.f8606b.mo12750d(this.f8605a);
        }

        /* renamed from: f */
        public final void mo9652f() {
            this.f8606b.mo12751e(this.f8605a);
        }
    }

    private final C2971c zza(Context context, C3143a aVar, Bundle bundle, Bundle bundle2) {
        C2972a aVar2 = new C2972a();
        Date a = aVar.mo12712a();
        if (a != null) {
            aVar2.mo12207a(a);
        }
        int b = aVar.mo12713b();
        if (b != 0) {
            aVar2.mo12203a(b);
        }
        Set<String> c = aVar.mo12714c();
        if (c != null) {
            for (String a2 : c) {
                aVar2.mo12206a(a2);
            }
        }
        Location d = aVar.mo12715d();
        if (d != null) {
            aVar2.mo12204a(d);
        }
        if (aVar.mo12717f()) {
            aoq.m14615a();
            aVar2.mo12210b(C3975lz.m17371a(context));
        }
        if (aVar.mo12716e() != -1) {
            boolean z = true;
            if (aVar.mo12716e() != 1) {
                z = false;
            }
            aVar2.mo12208a(z);
        }
        aVar2.mo12211b(aVar.mo12718g());
        aVar2.mo12205a(AdMobAdapter.class, zza(bundle, bundle2));
        return aVar2.mo12209a();
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.zzgw;
    }

    public Bundle getInterstitialAdapterInfo() {
        return new C3145a().mo12720a(1).mo12719a();
    }

    public aqe getVideoController() {
        if (this.zzgw != null) {
            C3000i videoController = this.zzgw.getVideoController();
            if (videoController != null) {
                return videoController.mo12373a();
            }
        }
        return null;
    }

    public void initialize(Context context, C3143a aVar, String str, C3169a aVar2, Bundle bundle, Bundle bundle2) {
        this.zzgz = context.getApplicationContext();
        this.zzhb = aVar2;
        this.zzhb.mo12841a((MediationRewardedVideoAdAdapter) this);
    }

    public boolean isInitialized() {
        return this.zzhb != null;
    }

    public void loadAd(C3143a aVar, Bundle bundle, Bundle bundle2) {
        if (this.zzgz == null || this.zzhb == null) {
            C3987mk.m17431c("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzha = new C2979f(this.zzgz);
        this.zzha.mo12246a(true);
        this.zzha.mo12245a(getAdUnitId(bundle));
        this.zzha.mo12243a(this.zzhc);
        this.zzha.mo12244a((C3168d) new C2789h(this));
        this.zzha.mo12242a(zza(this.zzgz, aVar, bundle2, bundle));
    }

    public void onDestroy() {
        if (this.zzgw != null) {
            this.zzgw.mo12168c();
            this.zzgw = null;
        }
        if (this.zzgx != null) {
            this.zzgx = null;
        }
        if (this.zzgy != null) {
            this.zzgy = null;
        }
        if (this.zzha != null) {
            this.zzha = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        if (this.zzgx != null) {
            this.zzgx.mo12249b(z);
        }
        if (this.zzha != null) {
            this.zzha.mo12249b(z);
        }
    }

    public void onPause() {
        if (this.zzgw != null) {
            this.zzgw.mo12167b();
        }
    }

    public void onResume() {
        if (this.zzgw != null) {
            this.zzgw.mo12165a();
        }
    }

    public void requestBannerAd(Context context, C3146c cVar, Bundle bundle, C2973d dVar, C3143a aVar, Bundle bundle2) {
        this.zzgw = new AdView(context);
        this.zzgw.setAdSize(new C2973d(dVar.mo12214b(), dVar.mo12212a()));
        this.zzgw.setAdUnitId(getAdUnitId(bundle));
        this.zzgw.setAdListener(new C2771d(this, cVar));
        this.zzgw.mo12166a(zza(context, aVar, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, C3155d dVar, Bundle bundle, C3143a aVar, Bundle bundle2) {
        this.zzgx = new C2979f(context);
        this.zzgx.mo12245a(getAdUnitId(bundle));
        this.zzgx.mo12241a((C2960a) new C2772e(this, dVar));
        this.zzgx.mo12242a(zza(context, aVar, bundle2, bundle));
    }

    public void requestNativeAd(Context context, C3156e eVar, Bundle bundle, C3160i iVar, Bundle bundle2) {
        C2773f fVar = new C2773f(this, eVar);
        C2968a a = new C2968a(context, bundle.getString(AD_UNIT_ID_PARAMETER)).mo12195a((C2960a) fVar);
        C2983b h = iVar.mo12794h();
        if (h != null) {
            a.mo12196a(h);
        }
        if (iVar.mo12796j()) {
            a.mo12199a((C2994a) fVar);
        }
        if (iVar.mo12795i()) {
            a.mo12197a((C2987a) fVar);
        }
        if (iVar.mo12797k()) {
            a.mo12198a((C2989a) fVar);
        }
        if (iVar.mo12798l()) {
            for (String str : iVar.mo12799m().keySet()) {
                a.mo12200a(str, fVar, ((Boolean) iVar.mo12799m().get(str)).booleanValue() ? fVar : null);
            }
        }
        this.zzgy = a.mo12201a();
        this.zzgy.mo12194a(zza(context, iVar, bundle2, bundle));
    }

    public void showInterstitial() {
        this.zzgx.mo12248b();
    }

    public void showVideo() {
        this.zzha.mo12248b();
    }

    /* access modifiers changed from: protected */
    public abstract Bundle zza(Bundle bundle, Bundle bundle2);
}

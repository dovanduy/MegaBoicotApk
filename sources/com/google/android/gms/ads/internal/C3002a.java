package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.gmsg.C3081k;
import com.google.android.gms.ads.internal.gmsg.C3083m;
import com.google.android.gms.ads.internal.overlay.C3123s;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.util.C3557i;
import com.google.android.gms.internal.ads.C3649af;
import com.google.android.gms.internal.ads.C3665ap;
import com.google.android.gms.internal.ads.C3666api;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3720co;
import com.google.android.gms.internal.ads.C3805fr;
import com.google.android.gms.internal.ads.C3810fw;
import com.google.android.gms.internal.ads.C3813fz;
import com.google.android.gms.internal.ads.C3822gh;
import com.google.android.gms.internal.ads.C3872id;
import com.google.android.gms.internal.ads.C3878ij;
import com.google.android.gms.internal.ads.C3879ik;
import com.google.android.gms.internal.ads.C3880il;
import com.google.android.gms.internal.ads.C3889iu;
import com.google.android.gms.internal.ads.C3891iw;
import com.google.android.gms.internal.ads.C3897jb;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.C3975lz;
import com.google.android.gms.internal.ads.C3987mk;
import com.google.android.gms.internal.ads.C4130rs;
import com.google.android.gms.internal.ads.C4335y;
import com.google.android.gms.internal.ads.aji;
import com.google.android.gms.internal.ads.amj;
import com.google.android.gms.internal.ads.amk;
import com.google.android.gms.internal.ads.aml.C3658a.C3660b;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.aoc;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aot;
import com.google.android.gms.internal.ads.aow;
import com.google.android.gms.internal.ads.apm;
import com.google.android.gms.internal.ads.apq;
import com.google.android.gms.internal.ads.apw;
import com.google.android.gms.internal.ads.aqe;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.internal.ads.asf;
import com.google.android.gms.internal.ads.ash;
import com.google.android.gms.internal.ads.aso;
import com.google.android.gms.internal.ads.zzaig;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzms;
import com.google.android.gms.internal.ads.zzmu;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.a */
public abstract class C3002a extends C3666api implements C3081k, C3083m, C3123s, anw, C3665ap, C3720co, C3889iu {

    /* renamed from: a */
    protected ash f8729a;

    /* renamed from: b */
    protected asf f8730b;

    /* renamed from: c */
    protected boolean f8731c = false;

    /* renamed from: d */
    protected final C3015am f8732d;

    /* renamed from: e */
    protected final C3026ax f8733e;

    /* renamed from: f */
    protected transient zzjj f8734f;

    /* renamed from: g */
    protected final aji f8735g;

    /* renamed from: h */
    protected C3235a f8736h;

    /* renamed from: i */
    protected final C3049bt f8737i;

    /* renamed from: j */
    private asf f8738j;

    /* renamed from: k */
    private final Bundle f8739k = new Bundle();

    /* renamed from: l */
    private boolean f8740l = false;

    C3002a(C3026ax axVar, C3015am amVar, C3049bt btVar) {
        this.f8733e = axVar;
        this.f8732d = new C3015am(this);
        this.f8737i = btVar;
        C3025aw.m10917e().mo15523b(this.f8733e.f8858c);
        C3025aw.m10917e().mo15525c(this.f8733e.f8858c);
        C3897jb.m17037a(this.f8733e.f8858c);
        C3025aw.m10909C().mo15008a(this.f8733e.f8858c);
        C3025aw.m10921i().mo15433a(this.f8733e.f8858c, this.f8733e.f8860e);
        C3025aw.m10923k().mo14508a(this.f8733e.f8858c);
        this.f8735g = C3025aw.m10921i().mo15444g();
        C3025aw.m10920h().mo14461a(this.f8733e.f8858c);
        C3025aw.m10911E().mo15613a(this.f8733e.f8858c);
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11921cn)).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(new C3003aa(this, new CountDownLatch(((Integer) aoq.m14620f().mo14695a(aru.f11923cp)).intValue()), timer), 0, ((Long) aoq.m14620f().mo14695a(aru.f11922co)).longValue());
        }
    }

    /* renamed from: a */
    protected static boolean m10725a(zzjj zzjj) {
        Bundle bundle = zzjj.f14537m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle == null || !bundle.containsKey("gw");
    }

    /* renamed from: b */
    private static long mo12476b(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            C3987mk.m17430b("", e);
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo12392A() {
        if (this.f8733e.f8841C != null) {
            try {
                this.f8733e.f8841C.mo14941c();
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo12393B() {
        if (this.f8733e.f8841C != null) {
            try {
                this.f8733e.f8841C.mo14944f();
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: C */
    public final void mo12394C() {
        C3878ij ijVar = this.f8733e.f8865j;
        if (ijVar != null && !TextUtils.isEmpty(ijVar.f13247B) && !ijVar.f13254I && C3025aw.m10927o().mo15581b()) {
            C3900je.m17429b("Sending troubleshooting signals to the server.");
            C3025aw.m10927o().mo15580b(this.f8733e.f8858c, this.f8733e.f8860e.f14505a, ijVar.f13247B, this.f8733e.f8857b);
            ijVar.f13254I = true;
        }
    }

    /* renamed from: D */
    public String mo12395D() {
        return this.f8733e.f8857b;
    }

    /* renamed from: E */
    public final apq mo12396E() {
        return this.f8733e.f8870o;
    }

    /* renamed from: F */
    public final aow mo12397F() {
        return this.f8733e.f8869n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo12398G() {
        if (this.f8736h != null) {
            C3025aw.m10933u().mo15787b(this.f8736h);
            this.f8736h = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final String mo12399H() {
        C3879ik ikVar = this.f8733e.f8866k;
        if (ikVar == null) {
            return "javascript";
        }
        if (ikVar.f13292b == null) {
            return "javascript";
        }
        String str = ikVar.f13292b.f14447T;
        if (TextUtils.isEmpty(str)) {
            return "javascript";
        }
        try {
            if (new JSONObject(str).optInt("media_type", -1) == 0) {
                return null;
            }
            return "javascript";
        } catch (JSONException e) {
            C3987mk.m17432c("", e);
            return "javascript";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<String> mo12400a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String b : list) {
            arrayList.add(C3872id.m16945b(b, this.f8733e.f8858c));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12401a(int i) {
        mo12402a(i, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12402a(int i, boolean z) {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Failed to load ad: ");
        sb.append(i);
        C3900je.m17435e(sb.toString());
        this.f8731c = z;
        if (this.f8733e.f8869n != null) {
            try {
                this.f8733e.f8869n.mo14530a(i);
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
        if (this.f8733e.f8841C != null) {
            try {
                this.f8733e.f8841C.mo14938a(i);
            } catch (RemoteException e2) {
                C3900je.m17434d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12403a(View view) {
        C3027ay ayVar = this.f8733e.f8861f;
        if (ayVar != null) {
            ayVar.addView(view, C3025aw.m10919g().mo15552d());
        }
    }

    /* renamed from: a */
    public final void mo12404a(C3649af afVar, String str) {
        C3900je.m17435e("#006 Unexpected call to a deprecated method.");
    }

    /* renamed from: a */
    public final void mo12405a(aot aot) {
        C3513t.m12634b("#008 Must be called on the main UI thread.: setAdClickListener");
        this.f8733e.f8868m = aot;
    }

    /* renamed from: a */
    public final void mo12406a(aow aow) {
        C3513t.m12634b("#008 Must be called on the main UI thread.: setAdListener");
        this.f8733e.f8869n = aow;
    }

    /* renamed from: a */
    public final void mo12407a(apm apm) {
        this.f8733e.f8871p = apm;
    }

    /* renamed from: a */
    public final void mo12408a(apq apq) {
        C3513t.m12634b("#008 Must be called on the main UI thread.: setAppEventListener");
        this.f8733e.f8870o = apq;
    }

    /* renamed from: a */
    public final void mo12409a(apw apw) {
        C3513t.m12634b("#008 Must be called on the main UI thread.: setCorrelationIdProvider");
        this.f8733e.f8872q = apw;
    }

    /* renamed from: a */
    public final void mo12410a(asf asf) {
        this.f8729a = new ash(((Boolean) aoq.m14620f().mo14695a(aru.f11762N)).booleanValue(), "load_ad", this.f8733e.f8864i.f14543a);
        this.f8738j = new asf(-1, null, null);
        if (asf == null) {
            this.f8730b = new asf(-1, null, null);
        } else {
            this.f8730b = new asf(asf.mo14711a(), asf.mo14712b(), asf.mo14713c());
        }
    }

    /* renamed from: a */
    public void mo12411a(aso aso) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    /* renamed from: a */
    public final void mo12412a(C3813fz fzVar) {
        C3513t.m12634b("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f8733e.f8842D = fzVar;
    }

    /* renamed from: a */
    public final void mo12413a(C3822gh ghVar) {
        C3513t.m12634b("#008 Must be called on the main UI thread.: setRewardedVideoAdListener");
        this.f8733e.f8841C = ghVar;
    }

    /* renamed from: a */
    public final void mo12414a(C3879ik ikVar) {
        if (ikVar.f13292b.f14464m != -1 && !TextUtils.isEmpty(ikVar.f13292b.f14474w)) {
            long b = mo12476b(ikVar.f13292b.f14474w);
            if (b != -1) {
                asf a = this.f8729a.mo14718a(ikVar.f13292b.f14464m + b);
                this.f8729a.mo14723a(a, "stc");
            }
        }
        this.f8729a.mo14720a(ikVar.f13292b.f14474w);
        this.f8729a.mo14723a(this.f8730b, "arf");
        this.f8738j = this.f8729a.mo14717a();
        this.f8729a.mo14721a("gqi", ikVar.f13292b.f14475x);
        this.f8733e.f8862g = null;
        this.f8733e.f8866k = ikVar;
        ikVar.f13299i.mo14517a((amk) new C3028az(this, ikVar));
        ikVar.f13299i.mo14518a(C3660b.AD_LOADED);
        mo12415a(ikVar, this.f8729a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12415a(C3879ik ikVar, ash ash);

    /* renamed from: a */
    public void mo12416a(C4335y yVar) {
        C3900je.m17435e("#006 Unexpected call to a deprecated method.");
    }

    /* renamed from: a */
    public final void mo12417a(zzjn zzjn) {
        C3513t.m12634b("#008 Must be called on the main UI thread.: setAdSize");
        this.f8733e.f8864i = zzjn;
        if (!(this.f8733e.f8865j == null || this.f8733e.f8865j.f13266b == null || this.f8733e.f8847I != 0)) {
            this.f8733e.f8865j.f13266b.mo15878a(C4130rs.m17979a(zzjn));
        }
        if (this.f8733e.f8861f != null) {
            if (this.f8733e.f8861f.getChildCount() > 1) {
                this.f8733e.f8861f.removeView(this.f8733e.f8861f.getNextView());
            }
            this.f8733e.f8861f.setMinimumWidth(zzjn.f14548f);
            this.f8733e.f8861f.setMinimumHeight(zzjn.f14545c);
            this.f8733e.f8861f.requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo12418a(zzlu zzlu) {
        C3513t.m12634b("#008 Must be called on the main UI thread.: setIconAdOptions");
        this.f8733e.f8880y = zzlu;
    }

    /* renamed from: a */
    public final void mo12419a(zzmu zzmu) {
        C3513t.m12634b("#008 Must be called on the main UI thread.: setVideoOptions");
        this.f8733e.f8879x = zzmu;
    }

    /* renamed from: a */
    public final void mo12420a(String str) {
        C3513t.m12634b("#008 Must be called on the main UI thread.: setUserId");
        this.f8733e.f8843E = str;
    }

    /* renamed from: a */
    public final void mo12421a(String str, Bundle bundle) {
        this.f8739k.putAll(bundle);
        if (this.f8740l && this.f8733e.f8871p != null) {
            try {
                this.f8733e.f8871p.mo14538a();
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo12422a(String str, String str2) {
        if (this.f8733e.f8870o != null) {
            try {
                this.f8733e.f8870o.mo14545a(str, str2);
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo12423a(HashSet<C3880il> hashSet) {
        this.f8733e.mo12523a(hashSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo12424a(C3878ij ijVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo12425a(C3878ij ijVar, C3878ij ijVar2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo12426a(zzjj zzjj, ash ash);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List<String> mo12427b(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String a : list) {
            arrayList.add(C3872id.m16944a(a, this.f8733e.f8858c));
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo12428b(C3878ij ijVar) {
        amj amj;
        C3660b bVar;
        this.f8729a.mo14723a(this.f8738j, "awr");
        this.f8733e.f8863h = null;
        if (!(ijVar.f13268d == -2 || ijVar.f13268d == 3 || this.f8733e.mo12521a() == null)) {
            C3025aw.m10922j().mo15473a(this.f8733e.mo12521a());
        }
        if (ijVar.f13268d == -1) {
            this.f8731c = false;
            return;
        }
        if (mo12424a(ijVar)) {
            C3900je.m17429b("Ad refresh scheduled.");
        }
        if (ijVar.f13268d != -2) {
            if (ijVar.f13268d == 3) {
                amj = ijVar.f13256K;
                bVar = C3660b.AD_FAILED_TO_LOAD_NO_FILL;
            } else {
                amj = ijVar.f13256K;
                bVar = C3660b.AD_FAILED_TO_LOAD;
            }
            amj.mo14518a(bVar);
            mo12401a(ijVar.f13268d);
            return;
        }
        if (this.f8733e.f8845G == null) {
            this.f8733e.f8845G = new C3891iw(this.f8733e.f8857b);
        }
        if (this.f8733e.f8861f != null) {
            this.f8733e.f8861f.mo12532a().mo15570d(ijVar.f13247B);
        }
        this.f8735g.mo14375a(this.f8733e.f8865j);
        if (mo12425a(this.f8733e.f8865j, ijVar)) {
            this.f8733e.f8865j = ijVar;
            C3026ax axVar = this.f8733e;
            if (axVar.f8867l != null) {
                if (axVar.f8865j != null) {
                    axVar.f8867l.mo15414a(axVar.f8865j.f13289y);
                    axVar.f8867l.mo15418b(axVar.f8865j.f13290z);
                    axVar.f8867l.mo15419b(axVar.f8865j.f13278n);
                }
                axVar.f8867l.mo15416a(axVar.f8864i.f14546d);
            }
            this.f8729a.mo14721a("is_mraid", this.f8733e.f8865j.mo15412a() ? "1" : "0");
            this.f8729a.mo14721a("is_mediation", this.f8733e.f8865j.f13278n ? "1" : "0");
            if (!(this.f8733e.f8865j.f13266b == null || this.f8733e.f8865j.f13266b.mo15919v() == null)) {
                this.f8729a.mo14721a("is_delay_pl", this.f8733e.f8865j.f13266b.mo15919v().mo15946f() ? "1" : "0");
            }
            this.f8729a.mo14723a(this.f8730b, "ttc");
            if (C3025aw.m10921i().mo15438b() != null) {
                C3025aw.m10921i().mo15438b().mo14707a(this.f8729a);
            }
            mo12394C();
            if (this.f8733e.mo12527d()) {
                mo12451x();
            }
        }
        if (ijVar.f13255J != null) {
            C3025aw.m10917e().mo15518a(this.f8733e.f8858c, ijVar.f13255J);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12429b(zzaig zzaig) {
        if (this.f8733e.f8841C != null) {
            String str = "";
            int i = 1;
            if (zzaig != null) {
                try {
                    str = zzaig.f14495a;
                    i = zzaig.f14496b;
                } catch (RemoteException e) {
                    C3900je.m17434d("#007 Could not call remote method.", e);
                    return;
                }
            }
            C3805fr frVar = new C3805fr(str, i);
            this.f8733e.f8841C.mo14939a((C3810fw) frVar);
            if (this.f8733e.f8842D != null) {
                this.f8733e.f8842D.mo15316a(frVar, this.f8733e.f8866k.f13291a.f14423v);
            }
        }
    }

    /* renamed from: b */
    public void mo12430b(boolean z) {
        C3900je.m17435e("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    /* renamed from: b */
    public boolean mo12431b(zzjj zzjj) {
        String sb;
        C3513t.m12634b("#008 Must be called on the main UI thread.: loadAd");
        C3025aw.m10923k().mo14507a();
        this.f8739k.clear();
        this.f8740l = false;
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11789aN)).booleanValue()) {
            zzjj = zzjj.mo16264a();
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11790aO)).booleanValue()) {
                zzjj.f14527c.putBoolean(AdMobAdapter.NEW_BUNDLE, true);
            }
        }
        if (C3557i.m12752c(this.f8733e.f8858c) && zzjj.f14535k != null) {
            zzjj = new aoc(zzjj).mo14539a(null).mo14540a();
        }
        if (this.f8733e.f8862g == null && this.f8733e.f8863h == null) {
            C3900je.m17433d("Starting ad request.");
            mo12410a((asf) null);
            this.f8730b = this.f8729a.mo14717a();
            if (zzjj.f14530f) {
                sb = "This request is sent from a test device.";
            } else {
                aoq.m14615a();
                String a = C3975lz.m17371a(this.f8733e.f8858c);
                StringBuilder sb2 = new StringBuilder(71 + String.valueOf(a).length());
                sb2.append("Use AdRequest.Builder.addTestDevice(\"");
                sb2.append(a);
                sb2.append("\") to get test ads on this device.");
                sb = sb2.toString();
            }
            C3900je.m17433d(sb);
            this.f8732d.mo12492a(zzjj);
            this.f8731c = mo12426a(zzjj, this.f8729a);
            return this.f8731c;
        }
        C3900je.m17435e(this.f8734f != null ? "Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes." : "Loading already in progress, saving this object for future refreshes.");
        this.f8734f = zzjj;
        return false;
    }

    /* renamed from: c */
    public void mo12432c(boolean z) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo12433c(zzjj zzjj) {
        if (this.f8733e.f8861f == null) {
            return false;
        }
        ViewParent parent = this.f8733e.f8861f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return C3025aw.m10917e().mo15519a(view, view.getContext());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo12434d(boolean z) {
        C3900je.m17043a("Ad finished loading.");
        this.f8731c = z;
        this.f8740l = true;
        if (this.f8733e.f8869n != null) {
            try {
                this.f8733e.f8869n.mo14532c();
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
        if (this.f8733e.f8841C != null) {
            try {
                this.f8733e.f8841C.mo14937a();
            } catch (RemoteException e2) {
                C3900je.m17434d("#007 Could not call remote method.", e2);
            }
        }
        if (this.f8733e.f8871p != null) {
            try {
                this.f8733e.f8871p.mo14538a();
            } catch (RemoteException e3) {
                C3900je.m17434d("#007 Could not call remote method.", e3);
            }
        }
    }

    /* renamed from: e */
    public void mo9646e() {
        if (this.f8733e.f8865j == null) {
            C3900je.m17435e("Ad state was null when trying to ping click URLs.");
            return;
        }
        C3900je.m17429b("Pinging click URLs.");
        if (this.f8733e.f8867l != null) {
            this.f8733e.f8867l.mo15417b();
        }
        if (this.f8733e.f8865j.f13267c != null) {
            C3025aw.m10917e();
            C3909jn.m17139a(this.f8733e.f8858c, this.f8733e.f8860e.f14505a, mo12427b(this.f8733e.f8865j.f13267c));
        }
        if (this.f8733e.f8868m != null) {
            try {
                this.f8733e.f8868m.mo14528a();
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: h */
    public final void mo12435h() {
        mo12449v();
    }

    /* renamed from: i */
    public final C3049bt mo12436i() {
        return this.f8737i;
    }

    /* renamed from: j */
    public void mo12437j() {
        C3513t.m12634b("#008 Must be called on the main UI thread.: destroy");
        this.f8732d.mo12491a();
        this.f8735g.mo14380b(this.f8733e.f8865j);
        C3026ax axVar = this.f8733e;
        if (axVar.f8861f != null) {
            axVar.f8861f.mo12533b();
        }
        axVar.f8869n = null;
        axVar.f8871p = null;
        axVar.f8870o = null;
        axVar.f8840B = null;
        axVar.f8872q = null;
        axVar.mo12524a(false);
        if (axVar.f8861f != null) {
            axVar.f8861f.removeAllViews();
        }
        axVar.mo12525b();
        axVar.mo12526c();
        axVar.f8865j = null;
    }

    /* renamed from: k */
    public final C3235a mo12438k() {
        C3513t.m12634b("#008 Must be called on the main UI thread.: getAdFrame");
        return C3238b.m11573a(this.f8733e.f8861f);
    }

    /* renamed from: l */
    public final zzjn mo12439l() {
        C3513t.m12634b("#008 Must be called on the main UI thread.: getAdSize");
        if (this.f8733e.f8864i == null) {
            return null;
        }
        return new zzms(this.f8733e.f8864i);
    }

    /* renamed from: m */
    public final boolean mo12440m() {
        C3513t.m12634b("#008 Must be called on the main UI thread.: isLoaded");
        return this.f8733e.f8862g == null && this.f8733e.f8863h == null && this.f8733e.f8865j != null;
    }

    /* renamed from: n */
    public final void mo12441n() {
        C3513t.m12634b("#008 Must be called on the main UI thread.: recordManualImpression");
        if (this.f8733e.f8865j == null) {
            C3900je.m17435e("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        C3900je.m17429b("Pinging manual tracking URLs.");
        if (!this.f8733e.f8865j.f13253H) {
            ArrayList arrayList = new ArrayList();
            if (this.f8733e.f8865j.f13271g != null) {
                arrayList.addAll(this.f8733e.f8865j.f13271g);
            }
            if (!(this.f8733e.f8865j.f13279o == null || this.f8733e.f8865j.f13279o.f12550i == null)) {
                arrayList.addAll(this.f8733e.f8865j.f13279o.f12550i);
            }
            if (!arrayList.isEmpty()) {
                C3025aw.m10917e();
                C3909jn.m17139a(this.f8733e.f8858c, this.f8733e.f8860e.f14505a, (List<String>) arrayList);
                this.f8733e.f8865j.f13253H = true;
            }
        }
    }

    /* renamed from: o */
    public void mo12442o() {
        C3513t.m12634b("#008 Must be called on the main UI thread.: pause");
    }

    /* renamed from: p */
    public void mo12443p() {
        C3513t.m12634b("#008 Must be called on the main UI thread.: resume");
    }

    /* renamed from: q */
    public final Bundle mo12444q() {
        return this.f8740l ? this.f8739k : new Bundle();
    }

    /* renamed from: r */
    public final void mo12445r() {
        C3513t.m12634b("#008 Must be called on the main UI thread.: stopLoading");
        this.f8731c = false;
        this.f8733e.mo12524a(true);
    }

    /* renamed from: s */
    public final boolean mo12446s() {
        return this.f8731c;
    }

    /* renamed from: t */
    public aqe mo12447t() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo12448u() {
        C3900je.m17043a("Ad closing.");
        if (this.f8733e.f8869n != null) {
            try {
                this.f8733e.f8869n.mo14529a();
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
        if (this.f8733e.f8841C != null) {
            try {
                this.f8733e.f8841C.mo14942d();
            } catch (RemoteException e2) {
                C3900je.m17434d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo12449v() {
        C3900je.m17043a("Ad leaving application.");
        if (this.f8733e.f8869n != null) {
            try {
                this.f8733e.f8869n.mo14531b();
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
        if (this.f8733e.f8841C != null) {
            try {
                this.f8733e.f8841C.mo14943e();
            } catch (RemoteException e2) {
                C3900je.m17434d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo12450w() {
        C3900je.m17043a("Ad opening.");
        if (this.f8733e.f8869n != null) {
            try {
                this.f8733e.f8869n.mo14533d();
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
        if (this.f8733e.f8841C != null) {
            try {
                this.f8733e.f8841C.mo14940b();
            } catch (RemoteException e2) {
                C3900je.m17434d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo12451x() {
        mo12434d(false);
    }

    /* renamed from: y */
    public final void mo12452y() {
        C3900je.m17433d("Ad impression.");
        if (this.f8733e.f8869n != null) {
            try {
                this.f8733e.f8869n.mo14535f();
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: z */
    public final void mo12453z() {
        C3900je.m17433d("Ad clicked.");
        if (this.f8733e.f8869n != null) {
            try {
                this.f8733e.f8869n.mo14534e();
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appnext.core.C1286Ad;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.C2983b;
import com.google.android.gms.ads.formats.C2983b.C2984a;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.mediation.C3144b;
import com.google.android.gms.p137b.C3238b;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
public final class bbo implements bbs {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f12590a;

    /* renamed from: b */
    private final bca f12591b;

    /* renamed from: c */
    private final long f12592c;

    /* renamed from: d */
    private final bbk f12593d;

    /* renamed from: e */
    private final bbj f12594e;

    /* renamed from: f */
    private zzjj f12595f;

    /* renamed from: g */
    private final zzjn f12596g;

    /* renamed from: h */
    private final Context f12597h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f12598i = new Object();

    /* renamed from: j */
    private final zzang f12599j;

    /* renamed from: k */
    private final boolean f12600k;

    /* renamed from: l */
    private final zzpl f12601l;

    /* renamed from: m */
    private final List<String> f12602m;

    /* renamed from: n */
    private final List<String> f12603n;

    /* renamed from: o */
    private final List<String> f12604o;

    /* renamed from: p */
    private final boolean f12605p;

    /* renamed from: q */
    private final boolean f12606q;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: r */
    public bcd f12607r;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: s */
    public int f12608s = -2;

    /* renamed from: t */
    private bcj f12609t;

    public bbo(Context context, String str, bca bca, bbk bbk, bbj bbj, zzjj zzjj, zzjn zzjn, zzang zzang, boolean z, boolean z2, zzpl zzpl, List<String> list, List<String> list2, List<String> list3, boolean z3) {
        String str2 = str;
        bbk bbk2 = bbk;
        bbj bbj2 = bbj;
        this.f12597h = context;
        this.f12591b = bca;
        this.f12594e = bbj2;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str2)) {
            str2 = m15951b();
        }
        this.f12590a = str2;
        this.f12593d = bbk2;
        long j = bbj2.f12561t != -1 ? bbj2.f12561t : bbk2.f12564b != -1 ? bbk2.f12564b : 10000;
        this.f12592c = j;
        this.f12595f = zzjj;
        this.f12596g = zzjn;
        this.f12599j = zzang;
        this.f12600k = z;
        this.f12605p = z2;
        this.f12601l = zzpl;
        this.f12602m = list;
        this.f12603n = list2;
        this.f12604o = list3;
        this.f12606q = z3;
    }

    /* renamed from: a */
    private static bcd m15942a(C3144b bVar) {
        return new bcy(bVar);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    private final String m15945a(String str) {
        if (str == null || !m15957e() || m15952b(2)) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.remove("cpm_floor_cents");
            return jSONObject.toString();
        } catch (JSONException unused) {
            C3900je.m17435e("Could not remove field. Returning the original value");
            return str;
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: a */
    public final void m15946a(bbn bbn) {
        String a = m15945a(this.f12594e.f12552k);
        try {
            if (this.f12599j.f14507c >= 4100000) {
                if (!this.f12600k) {
                    if (!this.f12594e.mo15055b()) {
                        if (this.f12596g.f14546d) {
                            this.f12607r.mo15088a(C3238b.m11573a(this.f12597h), this.f12595f, a, this.f12594e.f12542a, (bcg) bbn);
                            return;
                        } else if (!this.f12605p) {
                            this.f12607r.mo15091a(C3238b.m11573a(this.f12597h), this.f12596g, this.f12595f, a, this.f12594e.f12542a, bbn);
                            return;
                        } else if (this.f12594e.f12556o != null) {
                            this.f12607r.mo15089a(C3238b.m11573a(this.f12597h), this.f12595f, a, this.f12594e.f12542a, bbn, new zzpl(m15950b(this.f12594e.f12560s)), this.f12594e.f12559r);
                            return;
                        } else {
                            this.f12607r.mo15091a(C3238b.m11573a(this.f12597h), this.f12596g, this.f12595f, a, this.f12594e.f12542a, bbn);
                            return;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(this.f12602m);
                if (this.f12603n != null) {
                    for (String str : this.f12603n) {
                        String str2 = ":false";
                        if (this.f12604o != null && this.f12604o.contains(str)) {
                            str2 = ":true";
                        }
                        StringBuilder sb = new StringBuilder(7 + String.valueOf(str).length() + String.valueOf(str2).length());
                        sb.append("custom:");
                        sb.append(str);
                        sb.append(str2);
                        arrayList.add(sb.toString());
                    }
                }
                this.f12607r.mo15089a(C3238b.m11573a(this.f12597h), this.f12595f, a, this.f12594e.f12542a, bbn, this.f12601l, arrayList);
            } else if (this.f12596g.f14546d) {
                this.f12607r.mo15086a(C3238b.m11573a(this.f12597h), this.f12595f, a, bbn);
            } else {
                this.f12607r.mo15090a(C3238b.m11573a(this.f12597h), this.f12596g, this.f12595f, a, (bcg) bbn);
            }
        } catch (RemoteException e) {
            C3900je.m17432c("Could not request ad from mediation adapter.", e);
            mo15072a(5);
        }
    }

    /* renamed from: b */
    private static C2983b m15950b(String str) {
        C2984a aVar = new C2984a();
        if (str == null) {
            return aVar.mo12337a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = 0;
            aVar.mo12339b(jSONObject.optBoolean("multiple_images", false));
            aVar.mo12336a(jSONObject.optBoolean("only_urls", false));
            String optString = jSONObject.optString("native_image_orientation", "any");
            if (C1286Ad.ORIENTATION_LANDSCAPE.equals(optString)) {
                i = 2;
            } else if (C1286Ad.ORIENTATION_PORTRAIT.equals(optString)) {
                i = 1;
            } else if (!"any".equals(optString)) {
                i = -1;
            }
            aVar.mo12334a(i);
        } catch (JSONException e) {
            C3900je.m17432c("Exception occurred when creating native ad options", e);
        }
        return aVar.mo12337a();
    }

    /* renamed from: b */
    private final String m15951b() {
        try {
            if (!TextUtils.isEmpty(this.f12594e.f12546e)) {
                return this.f12591b.mo15081b(this.f12594e.f12546e) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        } catch (RemoteException unused) {
            C3900je.m17435e("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: b */
    public final boolean m15952b(int i) {
        try {
            Bundle bundle = this.f12600k ? this.f12607r.mo15105l() : this.f12596g.f14546d ? this.f12607r.mo15104k() : this.f12607r.mo15103j();
            return bundle != null && (bundle.getInt("capabilities", 0) & i) == i;
        } catch (RemoteException unused) {
            C3900je.m17435e("Could not get adapter info. Returning false");
            return false;
        }
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    private final bcj m15954c() {
        if (this.f12608s != 0 || !m15957e()) {
            return null;
        }
        try {
            if (!(!m15952b(4) || this.f12609t == null || this.f12609t.mo15075a() == 0)) {
                return this.f12609t;
            }
        } catch (RemoteException unused) {
            C3900je.m17435e("Could not get cpm value from MediationResponseMetadata");
        }
        return new bbq(m15959f());
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: d */
    public final bcd m15955d() {
        String str = "Instantiating mediation adapter: ";
        String valueOf = String.valueOf(this.f12590a);
        C3900je.m17433d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        if (!this.f12600k && !this.f12594e.mo15055b()) {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11877bw)).booleanValue() && "com.google.ads.mediation.admob.AdMobAdapter".equals(this.f12590a)) {
                return m15942a((C3144b) new AdMobAdapter());
            }
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11878bx)).booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(this.f12590a)) {
                return m15942a((C3144b) new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.f12590a)) {
                return new bcy(new zzzv());
            }
        }
        try {
            return this.f12591b.mo15079a(this.f12590a);
        } catch (RemoteException e) {
            String str2 = "Could not instantiate mediation adapter: ";
            String valueOf2 = String.valueOf(this.f12590a);
            C3900je.m17427a(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m15957e() {
        return this.f12593d.f12575m != -1;
    }

    @GuardedBy("mLock")
    /* renamed from: f */
    private final int m15959f() {
        if (this.f12594e.f12552k == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f12594e.f12552k);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f12590a)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = m15952b(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            if (optInt == 0) {
                optInt = jSONObject.optInt("penalized_average_cpm_cents", 0);
            }
            return optInt;
        } catch (JSONException unused) {
            C3900je.m17435e("Could not convert to json. Returning 0");
            return 0;
        }
    }

    /* renamed from: a */
    public final bbr mo15070a(long j, long j2) {
        bbr bbr;
        synchronized (this.f12598i) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                bbn bbn = new bbn();
                C3909jn.f13411a.post(new bbp(this, bbn));
                long j3 = this.f12592c;
                while (this.f12608s == -2) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j4 = j3 - (elapsedRealtime2 - elapsedRealtime);
                    long j5 = elapsedRealtime;
                    long j6 = j2 - (elapsedRealtime2 - j);
                    if (j4 <= 0 || j6 <= 0) {
                        C3900je.m17433d("Timed out waiting for adapter.");
                        this.f12608s = 3;
                    } else {
                        this.f12598i.wait(Math.min(j4, j6));
                    }
                    elapsedRealtime = j5;
                }
                bbr = new bbr(this.f12594e, this.f12607r, this.f12590a, bbn, this.f12608s, m15954c(), C3025aw.m10924l().mo13695b() - elapsedRealtime);
            } catch (InterruptedException unused) {
                this.f12608s = 5;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bbr;
    }

    /* renamed from: a */
    public final void mo15071a() {
        synchronized (this.f12598i) {
            try {
                if (this.f12607r != null) {
                    this.f12607r.mo15096c();
                }
            } catch (RemoteException e) {
                C3900je.m17432c("Could not destroy mediation adapter.", e);
            }
            this.f12608s = -1;
            this.f12598i.notify();
        }
    }

    /* renamed from: a */
    public final void mo15072a(int i) {
        synchronized (this.f12598i) {
            this.f12608s = i;
            this.f12598i.notify();
        }
    }

    /* renamed from: a */
    public final void mo15073a(int i, bcj bcj) {
        synchronized (this.f12598i) {
            this.f12608s = 0;
            this.f12609t = bcj;
            this.f12598i.notify();
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.internal.C3513t;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ai */
public abstract class C3653ai implements C3929kg<Void>, C4125rn {

    /* renamed from: a */
    protected final Context f11120a;

    /* renamed from: b */
    protected final C4089qe f11121b;

    /* renamed from: c */
    protected zzaej f11122c;

    /* renamed from: d */
    private final C3665ap f11123d;

    /* renamed from: e */
    private final C3879ik f11124e;

    /* renamed from: f */
    private Runnable f11125f;

    /* renamed from: g */
    private final Object f11126g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public AtomicBoolean f11127h = new AtomicBoolean(true);

    protected C3653ai(Context context, C3879ik ikVar, C4089qe qeVar, C3665ap apVar) {
        this.f11120a = context;
        this.f11124e = ikVar;
        this.f11122c = this.f11124e.f13292b;
        this.f11121b = qeVar;
        this.f11123d = apVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14341a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14342a(int i) {
        C3878ij ijVar;
        int i2 = i;
        if (i2 != -2) {
            this.f11122c = new zzaej(i2, this.f11122c.f14461j);
        }
        this.f11121b.mo15907p();
        C3665ap apVar = this.f11123d;
        zzaef zzaef = this.f11124e.f13291a;
        zzjj zzjj = zzaef.f14404c;
        C4089qe qeVar = this.f11121b;
        List<String> list = this.f11122c.f14454c;
        List<String> list2 = this.f11122c.f14456e;
        List<String> list3 = this.f11122c.f14460i;
        int i3 = this.f11122c.f14462k;
        long j = this.f11122c.f14461j;
        String str = zzaef.f14410i;
        boolean z = this.f11122c.f14458g;
        long j2 = this.f11122c.f14459h;
        zzjn zzjn = this.f11124e.f13294d;
        long j3 = j2;
        C3665ap apVar2 = apVar;
        long j4 = this.f11122c.f14457f;
        long j5 = this.f11124e.f13296f;
        long j6 = this.f11122c.f14464m;
        String str2 = this.f11122c.f14465n;
        JSONObject jSONObject = this.f11124e.f13298h;
        zzaig zzaig = this.f11122c.f14428A;
        List<String> list4 = this.f11122c.f14429B;
        List<String> list5 = this.f11122c.f14430C;
        boolean z2 = this.f11122c.f14431D;
        zzael zzael = this.f11122c.f14432E;
        List<String> list6 = this.f11122c.f14435H;
        String str3 = this.f11122c.f14439L;
        amj amj = this.f11124e.f13299i;
        boolean z3 = this.f11124e.f13292b.f14442O;
        boolean z4 = this.f11124e.f13300j;
        boolean z5 = this.f11124e.f13292b.f14444Q;
        List<String> list7 = this.f11122c.f14445R;
        String str4 = str2;
        C3878ij ijVar2 = ijVar;
        C3665ap apVar3 = apVar2;
        long j7 = j3;
        long j8 = j4;
        long j9 = j5;
        long j10 = j6;
        C3878ij ijVar3 = new C3878ij(zzjj, qeVar, list, i2, list2, list3, i3, j, str, z, null, null, null, null, null, j7, zzjn, j8, j9, j10, str4, jSONObject, null, zzaig, list4, list5, z2, zzael, null, list6, str3, amj, z3, z4, z5, list7, this.f11124e.f13292b.f14446S, this.f11124e.f13292b.f14447T);
        apVar3.mo12428b(ijVar2);
    }

    /* renamed from: a */
    public final void mo12684a(boolean z) {
        C3900je.m17429b("WebView finished loading.");
        int i = 0;
        if (this.f11127h.getAndSet(false)) {
            if (z) {
                i = -2;
            }
            mo14342a(i);
            C3909jn.f13411a.removeCallbacks(this.f11125f);
        }
    }

    /* renamed from: b */
    public void mo14343b() {
        if (this.f11127h.getAndSet(false)) {
            this.f11121b.stopLoading();
            C3025aw.m10919g();
            C3915jt.m17195a(this.f11121b);
            mo14342a(-1);
            C3909jn.f13411a.removeCallbacks(this.f11125f);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo14344c() {
        C3513t.m12634b("Webview render task needs to be called on UI thread.");
        this.f11125f = new C3654aj(this);
        C3909jn.f13411a.postDelayed(this.f11125f, ((Long) aoq.m14620f().mo14695a(aru.f11830bB)).longValue());
        mo14341a();
        return null;
    }
}

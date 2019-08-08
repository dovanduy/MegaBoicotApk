package com.google.android.gms.ads.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.internal.ads.C3744dl;
import com.google.android.gms.internal.ads.C3879ik;
import com.google.android.gms.internal.ads.C3996mt;
import com.google.android.gms.internal.ads.ash;
import com.google.android.gms.internal.ads.atn;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzmq;
import com.google.android.gms.internal.ads.zzpl;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.af */
final class C3008af implements Callable<atn> {

    /* renamed from: a */
    private final /* synthetic */ int f8757a;

    /* renamed from: b */
    private final /* synthetic */ JSONArray f8758b;

    /* renamed from: c */
    private final /* synthetic */ int f8759c;

    /* renamed from: d */
    private final /* synthetic */ C3879ik f8760d;

    /* renamed from: e */
    private final /* synthetic */ C3006ad f8761e;

    C3008af(C3006ad adVar, int i, JSONArray jSONArray, int i2, C3879ik ikVar) {
        this.f8761e = adVar;
        this.f8757a = i;
        this.f8758b = jSONArray;
        this.f8759c = i2;
        this.f8760d = ikVar;
    }

    public final /* synthetic */ Object call() throws Exception {
        if (this.f8757a >= this.f8758b.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f8758b.get(this.f8757a));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        C3006ad adVar = new C3006ad(this.f8761e.f8733e.f8858c, this.f8761e.f8737i, this.f8761e.f8733e.f8864i, this.f8761e.f8733e.f8857b, this.f8761e.f8888j, this.f8761e.f8733e.f8860e, true);
        C3006ad.m10792a(this.f8761e.f8733e, adVar.f8733e);
        adVar.mo12482m_();
        adVar.mo12410a(this.f8761e.f8730b);
        ash ash = adVar.f8729a;
        int i = this.f8757a;
        ash.mo14721a("num_ads_requested", String.valueOf(this.f8759c));
        ash.mo14721a("ad_index", String.valueOf(i));
        zzaef zzaef = this.f8760d.f13291a;
        String jSONObject2 = jSONObject.toString();
        Bundle bundle = zzaef.f14404c.f14527c != null ? new Bundle(zzaef.f14404c.f14527c) : new Bundle();
        bundle.putString("_ad", jSONObject2);
        int i2 = zzaef.f14404c.f14525a;
        long j = zzaef.f14404c.f14526b;
        int i3 = zzaef.f14404c.f14528d;
        List<String> list = zzaef.f14404c.f14529e;
        boolean z = zzaef.f14404c.f14530f;
        int i4 = zzaef.f14404c.f14531g;
        boolean z2 = zzaef.f14404c.f14532h;
        String str = zzaef.f14404c.f14533i;
        zzmq zzmq = zzaef.f14404c.f14534j;
        Location location = zzaef.f14404c.f14535k;
        String str2 = zzaef.f14404c.f14536l;
        zzmq zzmq2 = zzmq;
        String str3 = str2;
        zzjj zzjj = new zzjj(i2, j, bundle, i3, list, z, i4, z2, str, zzmq2, location, str3, zzaef.f14404c.f14537m, zzaef.f14404c.f14538n, zzaef.f14404c.f14539o, zzaef.f14404c.f14540p, zzaef.f14404c.f14541q, zzaef.f14404c.f14542r);
        Bundle bundle2 = zzaef.f14403b;
        zzjn zzjn = zzaef.f14405d;
        String str4 = zzaef.f14406e;
        ApplicationInfo applicationInfo = zzaef.f14407f;
        PackageInfo packageInfo = zzaef.f14408g;
        String str5 = zzaef.f14410i;
        String str6 = zzaef.f14411j;
        zzang zzang = zzaef.f14412k;
        Bundle bundle3 = zzaef.f14413l;
        List<String> list2 = zzaef.f14415n;
        List<String> list3 = zzaef.f14427z;
        Bundle bundle4 = zzaef.f14416o;
        C3006ad adVar2 = adVar;
        boolean z3 = zzaef.f14417p;
        int i5 = zzaef.f14418q;
        int i6 = zzaef.f14419r;
        float f = zzaef.f14420s;
        String str7 = zzaef.f14421t;
        Bundle bundle5 = bundle3;
        List<String> list4 = list2;
        long j2 = zzaef.f14422u;
        String str8 = zzaef.f14423v;
        List<String> list5 = zzaef.f14424w;
        String str9 = zzaef.f14425x;
        zzpl zzpl = zzaef.f14426y;
        String str10 = zzaef.f14374B;
        float f2 = zzaef.f14375C;
        boolean z4 = zzaef.f14381I;
        int i7 = zzaef.f14376D;
        int i8 = zzaef.f14377E;
        boolean z5 = zzaef.f14378F;
        boolean z6 = zzaef.f14379G;
        Bundle bundle6 = bundle4;
        C4007nd a = C3996mt.m17448a(zzaef.f14380H);
        String str11 = zzaef.f14382J;
        boolean z7 = z6;
        boolean z8 = zzaef.f14383K;
        int i9 = zzaef.f14384L;
        Bundle bundle7 = zzaef.f14385M;
        String str12 = zzaef.f14386N;
        zzlu zzlu = zzaef.f14387O;
        boolean z9 = zzaef.f14388P;
        Bundle bundle8 = zzaef.f14389Q;
        List<String> list6 = list3;
        zzjj zzjj2 = zzjj;
        PackageInfo packageInfo2 = packageInfo;
        String str13 = str5;
        String str14 = str6;
        zzang zzang2 = zzang;
        Bundle bundle9 = bundle5;
        List<String> list7 = list4;
        boolean z10 = z3;
        int i10 = i5;
        int i11 = i6;
        float f3 = f;
        String str15 = str7;
        long j3 = j2;
        String str16 = str8;
        List<String> list8 = list5;
        String str17 = str9;
        zzpl zzpl2 = zzpl;
        String str18 = str10;
        float f4 = f2;
        boolean z11 = z4;
        int i12 = i7;
        int i13 = i8;
        boolean z12 = z5;
        boolean z13 = z7;
        C3744dl dlVar = new C3744dl(bundle2, zzjj2, zzjn, str4, applicationInfo, packageInfo2, str13, str14, zzang2, bundle9, list7, list6, bundle6, z10, i10, i11, f3, str15, j3, str16, list8, str17, zzpl2, str18, f4, z11, i12, i13, z12, z13, a, str11, z8, i9, bundle7, str12, zzlu, z9, bundle8, zzaef.f14393U, C3996mt.m17448a(zzaef.f14409h), zzaef.f14394V, zzaef.f14395W, zzaef.f14396X, 1, zzaef.f14398Z, zzaef.f14400aa, zzaef.f14401ab, zzaef.f14402ac);
        C3006ad adVar3 = adVar2;
        adVar3.mo12547a(dlVar, adVar3.f8729a);
        return (atn) adVar3.mo12458K().get();
    }
}

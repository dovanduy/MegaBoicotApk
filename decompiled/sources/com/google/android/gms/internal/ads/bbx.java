package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C3718cm
public final class bbx implements bbi {

    /* renamed from: a */
    private final zzaef f12639a;

    /* renamed from: b */
    private final bca f12640b;

    /* renamed from: c */
    private final Context f12641c;

    /* renamed from: d */
    private final Object f12642d = new Object();

    /* renamed from: e */
    private final bbk f12643e;

    /* renamed from: f */
    private final boolean f12644f;

    /* renamed from: g */
    private final long f12645g;

    /* renamed from: h */
    private final long f12646h;

    /* renamed from: i */
    private final ash f12647i;

    /* renamed from: j */
    private final boolean f12648j;

    /* renamed from: k */
    private final String f12649k;

    /* renamed from: l */
    private boolean f12650l = false;

    /* renamed from: m */
    private bbo f12651m;

    /* renamed from: n */
    private List<bbr> f12652n = new ArrayList();

    /* renamed from: o */
    private final boolean f12653o;

    public bbx(Context context, zzaef zzaef, bca bca, bbk bbk, boolean z, boolean z2, String str, long j, long j2, ash ash, boolean z3) {
        this.f12641c = context;
        this.f12639a = zzaef;
        this.f12640b = bca;
        this.f12643e = bbk;
        this.f12644f = z;
        this.f12648j = z2;
        this.f12649k = str;
        this.f12645g = j;
        this.f12646h = j2;
        this.f12647i = ash;
        this.f12653o = z3;
    }

    /* renamed from: a */
    public final bbr mo15051a(List<bbj> list) {
        Object obj;
        Throwable th;
        bbr bbr;
        C3900je.m17429b("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        asf a = this.f12647i.mo14717a();
        zzjn zzjn = this.f12639a.f14405d;
        int[] iArr = new int[2];
        if (zzjn.f14549g != null) {
            C3025aw.m10936x();
            if (bbt.m15972a(this.f12649k, iArr)) {
                int i = iArr[0];
                int i2 = iArr[1];
                zzjn[] zzjnArr = zzjn.f14549g;
                int length = zzjnArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    zzjn zzjn2 = zzjnArr[i3];
                    if (i == zzjn2.f14547e && i2 == zzjn2.f14544b) {
                        zzjn = zzjn2;
                        break;
                    }
                    i3++;
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bbj bbj = (bbj) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(bbj.f12543b);
            C3900je.m17433d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            Iterator it2 = bbj.f12544c.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    asf a2 = this.f12647i.mo14717a();
                    Object obj2 = this.f12642d;
                    synchronized (obj2) {
                        try {
                            if (this.f12650l) {
                                try {
                                    bbr = new bbr(-1);
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj = obj2;
                                    throw th;
                                }
                            } else {
                                Iterator it3 = it;
                                Iterator it4 = it2;
                                asf asf = a;
                                asf asf2 = a2;
                                r12 = r12;
                                ArrayList arrayList2 = arrayList;
                                bbo bbo = r12;
                                obj = obj2;
                                try {
                                    bbo bbo2 = new bbo(this.f12641c, str2, this.f12640b, this.f12643e, bbj, this.f12639a.f14404c, zzjn, this.f12639a.f14412k, this.f12644f, this.f12648j, this.f12639a.f14426y, this.f12639a.f14415n, this.f12639a.f14427z, this.f12639a.f14396X, this.f12653o);
                                    this.f12651m = bbo;
                                    bbr a3 = this.f12651m.mo15070a(this.f12645g, this.f12646h);
                                    this.f12652n.add(a3);
                                    if (a3.f12613a == 0) {
                                        C3900je.m17429b("Adapter succeeded.");
                                        this.f12647i.mo14721a("mediation_network_succeed", str2);
                                        ArrayList arrayList3 = arrayList2;
                                        if (!arrayList3.isEmpty()) {
                                            this.f12647i.mo14721a("mediation_networks_fail", TextUtils.join(",", arrayList3));
                                        }
                                        this.f12647i.mo14723a(asf2, "mls");
                                        this.f12647i.mo14723a(asf, "ttm");
                                        return a3;
                                    }
                                    asf asf3 = asf;
                                    asf asf4 = asf2;
                                    ArrayList arrayList4 = arrayList2;
                                    arrayList4.add(str2);
                                    this.f12647i.mo14723a(asf4, "mlf");
                                    if (a3.f12615c != null) {
                                        C3909jn.f13411a.post(new bby(this, a3));
                                    }
                                    arrayList = arrayList4;
                                    a = asf3;
                                    it = it3;
                                    it2 = it4;
                                } catch (Throwable th3) {
                                    th = th3;
                                    th = th;
                                    throw th;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            obj = obj2;
                            th = th;
                            throw th;
                        }
                    }
                    return bbr;
                }
            }
        }
        ArrayList arrayList5 = arrayList;
        if (!arrayList5.isEmpty()) {
            this.f12647i.mo14721a("mediation_networks_fail", TextUtils.join(",", arrayList5));
        }
        return new bbr(1);
    }

    /* renamed from: a */
    public final void mo15052a() {
        synchronized (this.f12642d) {
            this.f12650l = true;
            if (this.f12651m != null) {
                this.f12651m.mo15071a();
            }
        }
    }

    /* renamed from: b */
    public final List<bbr> mo15053b() {
        return this.f12652n;
    }
}

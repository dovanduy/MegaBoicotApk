package com.startapp.android.publish.adsCommon.p177a;

import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.Constants;
import com.startapp.common.p193a.C5518g;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.startapp.android.publish.adsCommon.a.e */
/* compiled from: StartAppSDK */
public class C5318e implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private transient Set<Class<? extends C5316c>> f17065a = new HashSet();
    private boolean applyOnBannerRefresh = true;
    @C5548f(mo20535b = HashMap.class, mo20536c = ArrayList.class, mo20537d = Placement.class, mo20538e = C5316c.class)
    private Map<Placement, List<C5316c>> placements = new HashMap();
    @C5548f(mo20535b = ArrayList.class, mo20536c = C5316c.class)
    private List<C5316c> session = new ArrayList();
    @C5548f(mo20535b = HashMap.class, mo20536c = ArrayList.class, mo20538e = C5316c.class)
    private Map<String, List<C5316c>> tags = new HashMap();

    /* renamed from: a */
    public boolean mo19656a() {
        return this.applyOnBannerRefresh;
    }

    /* renamed from: a */
    public synchronized C5319f mo19655a(Placement placement, String str) {
        C5319f a;
        String str2;
        this.f17065a.clear();
        a = m22707a((List) this.tags.get(str), C5315b.m22698a().mo19648a(str), C5317d.TAG, str);
        if (a.mo19660a()) {
            a = m22707a((List) this.placements.get(placement), C5315b.m22698a().mo19647a(placement), C5317d.PLACEMENT, placement.toString());
            if (a.mo19660a()) {
                a = m22707a(this.session, C5315b.m22698a().mo19651c(), C5317d.SESSION, "session");
            }
        }
        String str3 = "AdRules";
        StringBuilder sb = new StringBuilder();
        sb.append("shouldDisplayAd result: ");
        sb.append(a.mo19660a());
        if (a.mo19660a()) {
            str2 = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" because of rule ");
            sb2.append(a.mo19661b());
            str2 = sb2.toString();
        }
        sb.append(str2);
        C5518g.m23563a(str3, 3, sb.toString());
        return a;
    }

    /* renamed from: a */
    private C5319f m22707a(List<C5316c> list, List<C5314a> list2, C5317d dVar, String str) {
        String str2;
        if (list == null) {
            return new C5319f(true);
        }
        for (C5316c cVar : list) {
            if (cVar.mo19653a() || !this.f17065a.contains(cVar.getClass())) {
                if (!cVar.mo19654a(list2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(cVar.getClass().getSimpleName());
                    sb.append("_");
                    sb.append(dVar);
                    if (Constants.m23468a().booleanValue()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(" ");
                        sb2.append(str);
                        sb2.append(":");
                        sb2.append(cVar);
                        str2 = sb2.toString();
                    } else {
                        str2 = "";
                    }
                    sb.append(str2);
                    return new C5319f(false, sb.toString());
                }
                this.f17065a.add(cVar.getClass());
            }
        }
        return new C5319f(true);
    }

    /* renamed from: b */
    public void mo19657b() {
        this.f17065a = new HashSet();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5318e eVar = (C5318e) obj;
        if (this.applyOnBannerRefresh != eVar.applyOnBannerRefresh || !C5307i.m22682b(this.session, eVar.session) || !C5307i.m22682b(this.placements, eVar.placements) || !C5307i.m22682b(this.tags, eVar.tags)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(this.session, this.placements, this.tags, Boolean.valueOf(this.applyOnBannerRefresh));
    }
}

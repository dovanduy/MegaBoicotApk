package com.startapp.android.publish.adsCommon.p177a;

import com.startapp.android.publish.common.model.AdPreferences.Placement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.startapp.android.publish.adsCommon.a.b */
/* compiled from: StartAppSDK */
public class C5315b {

    /* renamed from: a */
    private static C5315b f17056a = new C5315b();

    /* renamed from: b */
    private List<C5314a> f17057b = new ArrayList();

    /* renamed from: c */
    private Map<Placement, List<C5314a>> f17058c = new HashMap();

    /* renamed from: d */
    private Map<String, List<C5314a>> f17059d = new HashMap();

    /* renamed from: a */
    public static C5315b m22698a() {
        return f17056a;
    }

    /* renamed from: b */
    public void mo19650b() {
        this.f17057b.clear();
        this.f17058c.clear();
        this.f17059d.clear();
    }

    /* renamed from: c */
    public List<C5314a> mo19651c() {
        return this.f17057b;
    }

    /* renamed from: a */
    public List<C5314a> mo19647a(Placement placement) {
        return (List) this.f17058c.get(placement);
    }

    /* renamed from: a */
    public List<C5314a> mo19648a(String str) {
        return (List) this.f17059d.get(str);
    }

    /* renamed from: a */
    public synchronized void mo19649a(C5314a aVar) {
        this.f17057b.add(0, aVar);
        List list = (List) this.f17058c.get(aVar.mo19643a());
        if (list == null) {
            list = new ArrayList();
            this.f17058c.put(aVar.mo19643a(), list);
        }
        list.add(0, aVar);
        List list2 = (List) this.f17059d.get(aVar.mo19644b());
        if (list2 == null) {
            list2 = new ArrayList();
            this.f17059d.put(aVar.mo19644b(), list2);
        }
        list2.add(0, aVar);
    }

    /* renamed from: d */
    public int mo19652d() {
        return this.f17057b.size();
    }
}

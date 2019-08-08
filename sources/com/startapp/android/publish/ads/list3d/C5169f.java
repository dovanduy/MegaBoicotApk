package com.startapp.android.publish.ads.list3d;

import com.startapp.common.p193a.C5518g;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.startapp.android.publish.ads.list3d.f */
/* compiled from: StartAppSDK */
public class C5169f {

    /* renamed from: a */
    private static C5169f f16643a = new C5169f();

    /* renamed from: b */
    private Map<String, C5168e> f16644b = new ConcurrentHashMap();

    private C5169f() {
    }

    /* renamed from: a */
    public static C5169f m22203a() {
        return f16643a;
    }

    /* renamed from: a */
    public C5168e mo19078a(String str) {
        if (this.f16644b.containsKey(str)) {
            return (C5168e) this.f16644b.get(str);
        }
        C5168e eVar = new C5168e();
        this.f16644b.put(str, eVar);
        StringBuilder sb = new StringBuilder();
        sb.append("Created new model for uuid ");
        sb.append(str);
        sb.append(", Size = ");
        sb.append(this.f16644b.size());
        C5518g.m23563a("ListModelManager", 3, sb.toString());
        return eVar;
    }

    /* renamed from: b */
    public void mo19079b(String str) {
        this.f16644b.remove(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Model for ");
        sb.append(str);
        sb.append(" was removed, Size = ");
        sb.append(this.f16644b.size());
        C5518g.m23563a("ListModelManager", 3, sb.toString());
    }
}

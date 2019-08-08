package com.facebook.ads.internal.p125x;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.x.b */
public class C2379b {

    /* renamed from: a */
    private C2380c f7542a;

    /* renamed from: b */
    private float f7543b;

    /* renamed from: c */
    private Map<String, String> f7544c;

    public C2379b(C2380c cVar) {
        this(cVar, 0.0f);
    }

    public C2379b(C2380c cVar, float f) {
        this(cVar, f, null);
    }

    public C2379b(C2380c cVar, float f, Map<String, String> map) {
        this.f7542a = cVar;
        this.f7543b = f;
        if (map != null) {
            this.f7544c = map;
        } else {
            this.f7544c = new HashMap();
        }
    }

    /* renamed from: a */
    public boolean mo8785a() {
        return this.f7542a == C2380c.IS_VIEWABLE;
    }

    /* renamed from: b */
    public int mo8786b() {
        return this.f7542a.mo8789a();
    }

    /* renamed from: c */
    public float mo8787c() {
        return this.f7543b;
    }

    /* renamed from: d */
    public Map<String, String> mo8788d() {
        return this.f7544c;
    }
}

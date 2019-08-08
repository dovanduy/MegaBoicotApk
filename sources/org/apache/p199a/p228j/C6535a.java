package org.apache.p199a.p228j;

import java.util.HashMap;
import java.util.Map;

/* renamed from: org.apache.a.j.a */
/* compiled from: BasicHttpContext */
public class C6535a implements C6539e {

    /* renamed from: a */
    private final C6539e f21253a;

    /* renamed from: b */
    private Map f21254b;

    public C6535a() {
        this(null);
    }

    public C6535a(C6539e eVar) {
        this.f21254b = null;
        this.f21253a = eVar;
    }

    /* renamed from: a */
    public Object mo22777a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Id may not be null");
        }
        Object obj = null;
        if (this.f21254b != null) {
            obj = this.f21254b.get(str);
        }
        return (obj != null || this.f21253a == null) ? obj : this.f21253a.mo22777a(str);
    }

    /* renamed from: a */
    public void mo22778a(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("Id may not be null");
        }
        if (this.f21254b == null) {
            this.f21254b = new HashMap();
        }
        this.f21254b.put(str, obj);
    }
}

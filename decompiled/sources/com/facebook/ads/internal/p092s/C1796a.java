package com.facebook.ads.internal.p092s;

import android.text.TextUtils;
import com.facebook.ads.internal.p085l.C1757a;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.facebook.ads.internal.s.a */
public class C1796a {

    /* renamed from: a */
    private final String f5653a;

    /* renamed from: b */
    private final double f5654b = (((double) System.currentTimeMillis()) / 1000.0d);

    /* renamed from: c */
    private final double f5655c;

    /* renamed from: d */
    private final String f5656d;

    /* renamed from: e */
    private final Map<String, String> f5657e;

    /* renamed from: f */
    private final C1806f f5658f;

    /* renamed from: g */
    private final C1807g f5659g;

    /* renamed from: h */
    private final boolean f5660h;

    /* renamed from: com.facebook.ads.internal.s.a$a */
    public static class C1797a {

        /* renamed from: a */
        private String f5661a;

        /* renamed from: b */
        private double f5662b;

        /* renamed from: c */
        private String f5663c;

        /* renamed from: d */
        private Map<String, String> f5664d;

        /* renamed from: e */
        private C1806f f5665e;

        /* renamed from: f */
        private C1807g f5666f;

        /* renamed from: g */
        private boolean f5667g;

        /* renamed from: a */
        public C1797a mo7666a(double d) {
            this.f5662b = d;
            return this;
        }

        /* renamed from: a */
        public C1797a mo7667a(C1806f fVar) {
            this.f5665e = fVar;
            return this;
        }

        /* renamed from: a */
        public C1797a mo7668a(C1807g gVar) {
            this.f5666f = gVar;
            return this;
        }

        /* renamed from: a */
        public C1797a mo7669a(String str) {
            this.f5661a = str;
            return this;
        }

        /* renamed from: a */
        public C1797a mo7670a(Map<String, String> map) {
            this.f5664d = map;
            return this;
        }

        /* renamed from: a */
        public C1797a mo7671a(boolean z) {
            this.f5667g = z;
            return this;
        }

        /* renamed from: a */
        public C1796a mo7672a() {
            C1796a aVar = new C1796a(this.f5661a, this.f5662b, this.f5663c, this.f5664d, this.f5665e, this.f5666f, this.f5667g);
            return aVar;
        }

        /* renamed from: b */
        public C1797a mo7673b(String str) {
            this.f5663c = str;
            return this;
        }
    }

    public C1796a(String str, double d, String str2, Map<String, String> map, C1806f fVar, C1807g gVar, boolean z) {
        this.f5653a = str;
        this.f5655c = d;
        this.f5656d = str2;
        this.f5658f = fVar;
        this.f5659g = gVar;
        this.f5660h = z;
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        if (mo7662f()) {
            hashMap.put("analog", C2323k.m9046a(C1757a.m7289a()));
        }
        this.f5657e = m7474a(hashMap);
    }

    /* renamed from: a */
    private static Map<String, String> m7474a(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2 != null) {
                hashMap.put(str, str2);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public String mo7657a() {
        return this.f5653a;
    }

    /* renamed from: b */
    public double mo7658b() {
        return this.f5654b;
    }

    /* renamed from: c */
    public double mo7659c() {
        return this.f5655c;
    }

    /* renamed from: d */
    public String mo7660d() {
        return this.f5656d;
    }

    /* renamed from: e */
    public Map<String, String> mo7661e() {
        return this.f5657e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo7662f() {
        return this.f5658f == C1806f.IMMEDIATE;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo7663g() {
        return !TextUtils.isEmpty(this.f5653a);
    }

    /* renamed from: h */
    public C1806f mo7664h() {
        return this.f5658f;
    }

    /* renamed from: i */
    public C1807g mo7665i() {
        return this.f5659g;
    }
}

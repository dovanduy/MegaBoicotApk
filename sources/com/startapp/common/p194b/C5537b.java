package com.startapp.common.p194b;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.startapp.common.b.b */
/* compiled from: StartAppSDK */
public class C5537b {

    /* renamed from: a */
    private final C5539a f17611a;

    /* renamed from: com.startapp.common.b.b$a */
    /* compiled from: StartAppSDK */
    public static class C5539a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f17612a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Map<String, String> f17613b = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public long f17614c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f17615d = 100;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f17616e = false;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f17617f = false;

        public C5539a(int i) {
            this.f17612a = i;
        }

        /* renamed from: a */
        public C5539a mo20520a(Map<String, String> map) {
            if (map != null) {
                this.f17613b.putAll(map);
            }
            return this;
        }

        /* renamed from: a */
        public C5539a mo20519a(String str, String str2) {
            this.f17613b.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public C5539a mo20518a(long j) {
            this.f17614c = j;
            return this;
        }

        /* renamed from: a */
        public C5539a mo20521a(boolean z) {
            this.f17616e = z;
            return this;
        }

        /* renamed from: b */
        public C5539a mo20523b(boolean z) {
            this.f17617f = z;
            return this;
        }

        /* renamed from: a */
        public C5537b mo20522a() {
            return new C5537b(this);
        }
    }

    private C5537b(C5539a aVar) {
        this.f17611a = aVar;
    }

    /* renamed from: a */
    public int mo20511a() {
        return this.f17611a.f17612a;
    }

    /* renamed from: b */
    public Map<String, String> mo20512b() {
        return this.f17611a.f17613b;
    }

    /* renamed from: c */
    public long mo20513c() {
        return this.f17611a.f17614c;
    }

    /* renamed from: d */
    public long mo20514d() {
        return this.f17611a.f17615d;
    }

    /* renamed from: e */
    public boolean mo20515e() {
        return this.f17611a.f17616e;
    }

    /* renamed from: f */
    public boolean mo20516f() {
        return this.f17611a.f17617f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RunnerRequest: ");
        sb.append(this.f17611a.f17612a);
        sb.append(" ");
        sb.append(this.f17611a.f17614c);
        sb.append(" ");
        sb.append(this.f17611a.f17616e);
        sb.append(" ");
        sb.append(this.f17611a.f17615d);
        sb.append(" ");
        sb.append(this.f17611a.f17613b);
        return sb.toString();
    }
}

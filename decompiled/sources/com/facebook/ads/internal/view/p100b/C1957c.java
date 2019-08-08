package com.facebook.ads.internal.view.p100b;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.b.c */
public class C1957c {

    /* renamed from: a */
    public final String f6143a;

    /* renamed from: b */
    public final long f6144b;

    /* renamed from: c */
    public final long f6145c;

    /* renamed from: d */
    public final long f6146d;

    /* renamed from: e */
    public final long f6147e;

    /* renamed from: f */
    public final long f6148f;

    /* renamed from: g */
    public final long f6149g;

    /* renamed from: h */
    public final long f6150h;

    /* renamed from: com.facebook.ads.internal.view.b.c$a */
    public static class C1959a {

        /* renamed from: a */
        private final String f6151a;

        /* renamed from: b */
        private long f6152b = -1;

        /* renamed from: c */
        private long f6153c = -1;

        /* renamed from: d */
        private long f6154d = -1;

        /* renamed from: e */
        private long f6155e = -1;

        /* renamed from: f */
        private long f6156f = -1;

        /* renamed from: g */
        private long f6157g = -1;

        /* renamed from: h */
        private long f6158h = -1;

        public C1959a(String str) {
            this.f6151a = str;
        }

        /* renamed from: a */
        public C1959a mo8028a(long j) {
            this.f6152b = j;
            return this;
        }

        /* renamed from: a */
        public C1957c mo8029a() {
            C1957c cVar = new C1957c(this.f6151a, this.f6152b, this.f6153c, this.f6154d, this.f6155e, this.f6156f, this.f6157g, this.f6158h);
            return cVar;
        }

        /* renamed from: b */
        public C1959a mo8030b(long j) {
            this.f6153c = j;
            return this;
        }

        /* renamed from: c */
        public C1959a mo8031c(long j) {
            this.f6154d = j;
            return this;
        }

        /* renamed from: d */
        public C1959a mo8032d(long j) {
            this.f6155e = j;
            return this;
        }

        /* renamed from: e */
        public C1959a mo8033e(long j) {
            this.f6156f = j;
            return this;
        }

        /* renamed from: f */
        public C1959a mo8034f(long j) {
            this.f6157g = j;
            return this;
        }

        /* renamed from: g */
        public C1959a mo8035g(long j) {
            this.f6158h = j;
            return this;
        }
    }

    private C1957c(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f6143a = str;
        this.f6144b = j;
        this.f6145c = j2;
        this.f6146d = j3;
        this.f6147e = j4;
        this.f6148f = j5;
        this.f6149g = j6;
        this.f6150h = j7;
    }

    /* renamed from: a */
    public Map<String, String> mo8027a() {
        HashMap hashMap = new HashMap(7);
        hashMap.put("initial_url", this.f6143a);
        hashMap.put("handler_time_ms", String.valueOf(this.f6144b));
        hashMap.put("load_start_ms", String.valueOf(this.f6145c));
        hashMap.put("response_end_ms", String.valueOf(this.f6146d));
        hashMap.put("dom_content_loaded_ms", String.valueOf(this.f6147e));
        hashMap.put("scroll_ready_ms", String.valueOf(this.f6148f));
        hashMap.put("load_finish_ms", String.valueOf(this.f6149g));
        hashMap.put("session_finish_ms", String.valueOf(this.f6150h));
        return hashMap;
    }
}

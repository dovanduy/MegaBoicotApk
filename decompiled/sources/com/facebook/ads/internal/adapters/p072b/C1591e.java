package com.facebook.ads.internal.adapters.p072b;

import java.io.Serializable;

/* renamed from: com.facebook.ads.internal.adapters.b.e */
public class C1591e implements Serializable {
    private static final long serialVersionUID = 5306126965868117466L;

    /* renamed from: a */
    private final String f4883a;

    /* renamed from: b */
    private final String f4884b;

    /* renamed from: c */
    private final String f4885c;

    /* renamed from: d */
    private final String f4886d;

    /* renamed from: e */
    private final String f4887e;

    /* renamed from: f */
    private final String f4888f;

    /* renamed from: g */
    private final C1593a f4889g;

    /* renamed from: com.facebook.ads.internal.adapters.b.e$a */
    public enum C1593a {
        CONTEXTUAL_APP("contextual_app"),
        PAGE_POST("page_post");
        

        /* renamed from: c */
        private final String f4893c;

        private C1593a(String str) {
            this.f4893c = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.facebook.ads.internal.adapters.p072b.C1591e.C1593a m6610a(java.lang.String r2) {
            /*
                int r0 = r2.hashCode()
                r1 = 883765328(0x34ad3050, float:3.2258913E-7)
                if (r0 == r1) goto L_0x0019
                r1 = 1434358835(0x557e9433, float:1.7494529E13)
                if (r0 == r1) goto L_0x000f
                goto L_0x0023
            L_0x000f:
                java.lang.String r0 = "contextual_app"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x0023
                r2 = 0
                goto L_0x0024
            L_0x0019:
                java.lang.String r0 = "page_post"
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x0023
                r2 = 1
                goto L_0x0024
            L_0x0023:
                r2 = -1
            L_0x0024:
                if (r2 == 0) goto L_0x0029
                com.facebook.ads.internal.adapters.b.e$a r2 = PAGE_POST
                return r2
            L_0x0029:
                com.facebook.ads.internal.adapters.b.e$a r2 = CONTEXTUAL_APP
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.p072b.C1591e.C1593a.m6610a(java.lang.String):com.facebook.ads.internal.adapters.b.e$a");
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.b.e$b */
    public static class C1594b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f4894a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f4895b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f4896c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f4897d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f4898e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f4899f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C1593a f4900g;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1594b mo7154a(String str) {
            this.f4894a = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1591e mo7155a() {
            return new C1591e(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C1594b mo7156b(String str) {
            this.f4895b = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C1594b mo7157c(String str) {
            this.f4896c = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C1594b mo7158d(String str) {
            this.f4897d = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C1594b mo7159e(String str) {
            this.f4898e = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C1594b mo7160f(String str) {
            this.f4899f = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public C1594b mo7161g(String str) {
            this.f4900g = C1593a.m6610a(str);
            return this;
        }
    }

    private C1591e(C1594b bVar) {
        this.f4883a = bVar.f4894a;
        this.f4884b = bVar.f4895b;
        this.f4885c = bVar.f4896c;
        this.f4886d = bVar.f4897d;
        this.f4887e = bVar.f4898e;
        this.f4888f = bVar.f4899f;
        this.f4889g = bVar.f4900g;
    }

    /* renamed from: a */
    public String mo7147a() {
        return this.f4883a;
    }

    /* renamed from: b */
    public String mo7148b() {
        return this.f4884b;
    }

    /* renamed from: c */
    public String mo7149c() {
        return this.f4885c;
    }

    /* renamed from: d */
    public String mo7150d() {
        return this.f4886d;
    }

    /* renamed from: e */
    public String mo7151e() {
        return this.f4887e;
    }

    /* renamed from: f */
    public C1593a mo7152f() {
        return this.f4889g;
    }

    /* renamed from: g */
    public String mo7153g() {
        return this.f4888f;
    }
}

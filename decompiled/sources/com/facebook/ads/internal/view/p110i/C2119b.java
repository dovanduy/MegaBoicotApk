package com.facebook.ads.internal.view.p110i;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.internal.p077d.C1704b;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2141i;
import com.facebook.ads.internal.view.p110i.p112b.C2143k;
import com.facebook.ads.internal.view.p110i.p112b.C2145m;
import com.facebook.ads.internal.view.p110i.p112b.C2146n;
import com.facebook.ads.internal.view.p110i.p112b.C2147o;
import com.facebook.ads.internal.view.p110i.p112b.C2149q;
import com.facebook.ads.internal.view.p110i.p112b.C2151s;
import com.facebook.ads.internal.view.p110i.p112b.C2152t;
import com.facebook.ads.internal.view.p110i.p112b.C2155w;
import com.facebook.ads.internal.view.p110i.p112b.C2156x;
import com.facebook.ads.internal.view.p110i.p112b.C2157y;
import com.facebook.ads.internal.view.p110i.p112b.C2158z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.i.b */
public class C2119b extends C2159c {

    /* renamed from: a */
    public int f6771a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2156x f6772b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1779f<C2151s> f6773c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1779f<C2141i> f6774d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1779f<C2143k> f6775e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1779f<C2147o> f6776f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1779f<C2135c> f6777g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1779f<C2149q> f6778h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1779f<C2157y> f6779i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1779f<C2158z> f6780j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1779f<C2152t> f6781k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C2146n f6782l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C2110a f6783m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f6784n;

    public C2119b(Context context, C1802c cVar, C2110a aVar, String str) {
        this(context, cVar, aVar, (List<C1704b>) new ArrayList<C1704b>(), str);
    }

    public C2119b(Context context, C1802c cVar, C2110a aVar, String str, Bundle bundle) {
        this(context, cVar, aVar, new ArrayList(), str, bundle, null);
    }

    public C2119b(Context context, C1802c cVar, C2110a aVar, String str, Map<String, String> map) {
        this(context, cVar, aVar, new ArrayList(), str, null, map);
    }

    public C2119b(Context context, C1802c cVar, C2110a aVar, List<C1704b> list, String str) {
        super(context, cVar, aVar, list, str);
        this.f6772b = new C2156x() {
            /* renamed from: a */
            public void mo6895a(C2155w wVar) {
                C2119b.this.mo8455e();
            }
        };
        this.f6773c = new C1779f<C2151s>() {
            /* renamed from: a */
            public Class<C2151s> mo7260a() {
                return C2151s.class;
            }

            /* renamed from: a */
            public void mo6895a(C2151s sVar) {
                C2119b.this.mo8456f();
            }
        };
        this.f6774d = new C1779f<C2141i>() {
            /* renamed from: a */
            public Class<C2141i> mo7260a() {
                return C2141i.class;
            }

            /* renamed from: a */
            public void mo6895a(C2141i iVar) {
                C2119b.this.mo8457h();
                C2119b.this.mo8450a(iVar.mo8441a(), false, ((double) iVar.mo8441a()) < 2000.0d);
            }
        };
        this.f6775e = new C1779f<C2143k>() {
            /* renamed from: a */
            public Class<C2143k> mo7260a() {
                return C2143k.class;
            }

            /* renamed from: a */
            public void mo6895a(C2143k kVar) {
                if (!C2119b.this.f6784n) {
                    C2119b.this.f6784n = true;
                } else {
                    C2119b.this.mo8458i();
                }
            }
        };
        this.f6776f = new C1779f<C2147o>() {
            /* renamed from: a */
            public Class<C2147o> mo7260a() {
                return C2147o.class;
            }

            /* renamed from: a */
            public void mo6895a(C2147o oVar) {
                int a = oVar.mo8441a();
                if (C2119b.this.f6771a <= 0 || a != C2119b.this.f6783m.getDuration() || C2119b.this.f6783m.getDuration() <= C2119b.this.f6771a) {
                    C2119b.this.mo8448a(a);
                }
            }
        };
        this.f6777g = new C1779f<C2135c>() {
            /* renamed from: a */
            public Class<C2135c> mo7260a() {
                return C2135c.class;
            }

            /* renamed from: a */
            public void mo6895a(C2135c cVar) {
                C2119b bVar;
                int a = cVar.mo8441a();
                int b = cVar.mo8444b();
                if (C2119b.this.f6771a <= 0 || a != b || b <= C2119b.this.f6771a) {
                    if (b >= a + 500) {
                        bVar = C2119b.this;
                    } else if (b == 0) {
                        bVar = C2119b.this;
                        a = C2119b.this.f6771a;
                    } else {
                        C2119b.this.mo8452b(b);
                        return;
                    }
                    bVar.mo8452b(a);
                }
            }
        };
        this.f6778h = new C1779f<C2149q>() {
            /* renamed from: a */
            public Class<C2149q> mo7260a() {
                return C2149q.class;
            }

            /* renamed from: a */
            public void mo6895a(C2149q qVar) {
                C2119b.this.mo8449a(qVar.mo8445a(), qVar.mo8446b());
            }
        };
        this.f6779i = new C1779f<C2157y>() {
            /* renamed from: a */
            public Class<C2157y> mo7260a() {
                return C2157y.class;
            }

            /* renamed from: a */
            public void mo6895a(C2157y yVar) {
                C2119b.this.mo8451b();
            }
        };
        this.f6780j = new C1779f<C2158z>() {
            /* renamed from: a */
            public Class<C2158z> mo7260a() {
                return C2158z.class;
            }

            /* renamed from: a */
            public void mo6895a(C2158z zVar) {
                C2119b.this.mo8453c();
            }
        };
        this.f6781k = new C1779f<C2152t>() {
            /* renamed from: a */
            public Class<C2152t> mo7260a() {
                return C2152t.class;
            }

            /* renamed from: a */
            public void mo6895a(C2152t tVar) {
                C2119b.this.mo8449a(C2119b.this.mo8459j(), C2119b.this.mo8459j());
            }
        };
        this.f6782l = new C2146n() {
            /* renamed from: a */
            public void mo6895a(C2145m mVar) {
                C2119b.this.f6771a = C2119b.this.f6783m.getDuration();
            }
        };
        this.f6784n = false;
        this.f6783m = aVar;
        this.f6783m.getEventBus().mo7626a((T[]) new C1779f[]{this.f6772b, this.f6776f, this.f6773c, this.f6775e, this.f6774d, this.f6777g, this.f6778h, this.f6779i, this.f6780j, this.f6782l, this.f6781k});
    }

    public C2119b(Context context, C1802c cVar, C2110a aVar, List<C1704b> list, String str, Bundle bundle, Map<String, String> map) {
        super(context, cVar, aVar, list, str, bundle, map);
        this.f6772b = new C2156x() {
            /* renamed from: a */
            public void mo6895a(C2155w wVar) {
                C2119b.this.mo8455e();
            }
        };
        this.f6773c = new C1779f<C2151s>() {
            /* renamed from: a */
            public Class<C2151s> mo7260a() {
                return C2151s.class;
            }

            /* renamed from: a */
            public void mo6895a(C2151s sVar) {
                C2119b.this.mo8456f();
            }
        };
        this.f6774d = new C1779f<C2141i>() {
            /* renamed from: a */
            public Class<C2141i> mo7260a() {
                return C2141i.class;
            }

            /* renamed from: a */
            public void mo6895a(C2141i iVar) {
                C2119b.this.mo8457h();
                C2119b.this.mo8450a(iVar.mo8441a(), false, ((double) iVar.mo8441a()) < 2000.0d);
            }
        };
        this.f6775e = new C1779f<C2143k>() {
            /* renamed from: a */
            public Class<C2143k> mo7260a() {
                return C2143k.class;
            }

            /* renamed from: a */
            public void mo6895a(C2143k kVar) {
                if (!C2119b.this.f6784n) {
                    C2119b.this.f6784n = true;
                } else {
                    C2119b.this.mo8458i();
                }
            }
        };
        this.f6776f = new C1779f<C2147o>() {
            /* renamed from: a */
            public Class<C2147o> mo7260a() {
                return C2147o.class;
            }

            /* renamed from: a */
            public void mo6895a(C2147o oVar) {
                int a = oVar.mo8441a();
                if (C2119b.this.f6771a <= 0 || a != C2119b.this.f6783m.getDuration() || C2119b.this.f6783m.getDuration() <= C2119b.this.f6771a) {
                    C2119b.this.mo8448a(a);
                }
            }
        };
        this.f6777g = new C1779f<C2135c>() {
            /* renamed from: a */
            public Class<C2135c> mo7260a() {
                return C2135c.class;
            }

            /* renamed from: a */
            public void mo6895a(C2135c cVar) {
                C2119b bVar;
                int a = cVar.mo8441a();
                int b = cVar.mo8444b();
                if (C2119b.this.f6771a <= 0 || a != b || b <= C2119b.this.f6771a) {
                    if (b >= a + 500) {
                        bVar = C2119b.this;
                    } else if (b == 0) {
                        bVar = C2119b.this;
                        a = C2119b.this.f6771a;
                    } else {
                        C2119b.this.mo8452b(b);
                        return;
                    }
                    bVar.mo8452b(a);
                }
            }
        };
        this.f6778h = new C1779f<C2149q>() {
            /* renamed from: a */
            public Class<C2149q> mo7260a() {
                return C2149q.class;
            }

            /* renamed from: a */
            public void mo6895a(C2149q qVar) {
                C2119b.this.mo8449a(qVar.mo8445a(), qVar.mo8446b());
            }
        };
        this.f6779i = new C1779f<C2157y>() {
            /* renamed from: a */
            public Class<C2157y> mo7260a() {
                return C2157y.class;
            }

            /* renamed from: a */
            public void mo6895a(C2157y yVar) {
                C2119b.this.mo8451b();
            }
        };
        this.f6780j = new C1779f<C2158z>() {
            /* renamed from: a */
            public Class<C2158z> mo7260a() {
                return C2158z.class;
            }

            /* renamed from: a */
            public void mo6895a(C2158z zVar) {
                C2119b.this.mo8453c();
            }
        };
        this.f6781k = new C1779f<C2152t>() {
            /* renamed from: a */
            public Class<C2152t> mo7260a() {
                return C2152t.class;
            }

            /* renamed from: a */
            public void mo6895a(C2152t tVar) {
                C2119b.this.mo8449a(C2119b.this.mo8459j(), C2119b.this.mo8459j());
            }
        };
        this.f6782l = new C2146n() {
            /* renamed from: a */
            public void mo6895a(C2145m mVar) {
                C2119b.this.f6771a = C2119b.this.f6783m.getDuration();
            }
        };
        this.f6784n = false;
        this.f6783m = aVar;
        this.f6783m.getEventBus().mo7626a((T[]) new C1779f[]{this.f6772b, this.f6776f, this.f6773c, this.f6775e, this.f6774d, this.f6777g, this.f6778h, this.f6779i, this.f6780j, this.f6781k});
    }

    /* renamed from: a */
    public void mo8428a() {
        this.f6783m.getStateHandler().post(new Runnable() {
            public void run() {
                C2119b.this.f6783m.getEventBus().mo7628b((T[]) new C1779f[]{C2119b.this.f6772b, C2119b.this.f6776f, C2119b.this.f6773c, C2119b.this.f6775e, C2119b.this.f6774d, C2119b.this.f6777g, C2119b.this.f6778h, C2119b.this.f6779i, C2119b.this.f6780j, C2119b.this.f6782l, C2119b.this.f6781k});
            }
        });
    }
}

package com.facebook.ads.internal.p074b;

import android.content.Context;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.C1637i;
import com.facebook.ads.internal.adapters.C1653q;
import com.facebook.ads.internal.p086m.C1762a;
import com.facebook.ads.internal.p086m.C1764c;
import com.facebook.ads.internal.p086m.C1766e;
import com.facebook.ads.internal.p093t.C1821d;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1782a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.b.g */
public class C1674g extends C1663c {
    public C1674g(Context context, C1659a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    static /* synthetic */ Map m6982a(C1674g gVar, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("delay", String.valueOf(System.currentTimeMillis() - j));
        return hashMap;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r5v0, types: [java.util.List, java.util.List<java.lang.String>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m6983a(com.facebook.ads.internal.p074b.C1674g r4, java.util.List<java.lang.String> r5, java.util.Map r6) {
        /*
            if (r5 == 0) goto L_0x002a
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            java.util.Iterator r5 = r5.iterator()
        L_0x000d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            com.facebook.ads.internal.w.e.e r1 = new com.facebook.ads.internal.w.e.e
            android.content.Context r2 = r4.f5217b
            r1.<init>(r2, r6)
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
            r2[r3] = r0
            r1.execute(r2)
            goto L_0x000d
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p074b.C1674g.m6983a(com.facebook.ads.internal.b.g, java.util.List, java.util.Map):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7370a() {
        C1637i iVar = (C1637i) this.f5221f;
        if (!iVar.mo7279A()) {
            throw new IllegalStateException("ad is not ready or already displayed");
        }
        this.f5218c.mo7096a(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7371a(AdAdapter adAdapter, C1764c cVar, C1762a aVar, Map<String, Object> map) {
        C1637i iVar = (C1637i) adAdapter;
        final C1637i iVar2 = iVar;
        final long currentTimeMillis = System.currentTimeMillis();
        final C1762a aVar2 = aVar;
        C16751 r0 = new Runnable() {
            public void run() {
                C1674g.this.mo7374a((AdAdapter) iVar2);
                Map a = C1674g.m6982a(C1674g.this, currentTimeMillis);
                a.put("error", "-1");
                a.put("msg", "timeout");
                C1674g.m6983a(C1674g.this, aVar2.mo7591a(C1766e.REQUEST), a);
                C1674g.this.mo7385i();
            }
        };
        mo7386j().postDelayed(r0, (long) cVar.mo7596a().mo7614j());
        Context context = this.f5217b;
        final C16751 r2 = r0;
        C16762 r02 = new C1653q() {

            /* renamed from: a */
            boolean f5243a = false;

            /* renamed from: b */
            boolean f5244b = false;

            /* renamed from: c */
            boolean f5245c = false;

            /* renamed from: a */
            public void mo7053a(C1637i iVar) {
                if (iVar == C1674g.this.f5220e) {
                    C1674g.this.mo7386j().removeCallbacks(r2);
                    C1674g.this.f5221f = iVar;
                    C1674g.this.f5218c.mo6777a((AdAdapter) iVar);
                    if (!this.f5243a) {
                        this.f5243a = true;
                        C1674g.m6983a(C1674g.this, aVar2.mo7591a(C1766e.REQUEST), C1674g.m6982a(C1674g.this, currentTimeMillis));
                    }
                }
            }

            /* renamed from: a */
            public void mo7054a(C1637i iVar, C1782a aVar) {
                if (iVar == C1674g.this.f5220e) {
                    C1674g.this.mo7386j().removeCallbacks(r2);
                    C1674g.this.mo7374a((AdAdapter) iVar);
                    if (!this.f5243a) {
                        this.f5243a = true;
                        Map a = C1674g.m6982a(C1674g.this, currentTimeMillis);
                        a.put("error", String.valueOf(aVar.mo7635a().getErrorCode()));
                        a.put("msg", String.valueOf(aVar.mo7636b()));
                        C1674g.m6983a(C1674g.this, aVar2.mo7591a(C1766e.REQUEST), a);
                    }
                    C1674g.this.mo7385i();
                }
            }

            /* renamed from: b */
            public void mo7055b(C1637i iVar) {
                if (!this.f5244b) {
                    this.f5244b = true;
                    C1674g.m6983a(C1674g.this, aVar2.mo7591a(C1766e.IMPRESSION), null);
                }
            }

            /* renamed from: c */
            public void mo7056c(C1637i iVar) {
                if (!this.f5245c) {
                    this.f5245c = true;
                    C1674g.m6983a(C1674g.this, aVar2.mo7591a(C1766e.CLICK), null);
                }
                if (C1674g.this.f5218c != null) {
                    C1674g.this.f5218c.mo6775a();
                }
            }
        };
        iVar.mo7283a(context, r02, this.f5222g, map, NativeAdBase.getViewTraversalPredicate());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7372a(String str) {
        C1782a a = C1669e.m6979a(this.f5217b, Integer.valueOf(0), Integer.valueOf(1));
        if (a != null) {
            mo7048a(a);
        } else {
            super.mo7372a(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C1782a mo7379c() {
        C1782a aVar = null;
        if (!(this.f5223h.f5205h == null || this.f5223h.f5205h == C1821d.NONE)) {
            if (mo7380d()) {
                return null;
            }
            aVar = new C1782a(AdErrorType.CLEAR_TEXT_SUPPORT_NOT_ALLOWED, "");
        }
        return aVar;
    }
}

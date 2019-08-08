package com.facebook.ads.internal.p074b;

import android.content.Context;
import android.view.View;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.C1621f;
import com.facebook.ads.internal.adapters.C1648n;
import com.facebook.ads.internal.p086m.C1762a;
import com.facebook.ads.internal.p086m.C1764c;
import com.facebook.ads.internal.protocol.C1782a;
import com.facebook.ads.p069a.C1557a;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.b.d */
public class C1667d extends C1663c {
    public C1667d(Context context, C1659a aVar) {
        super(context, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7370a() {
        ((C1648n) this.f5221f).mo7257e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7371a(AdAdapter adAdapter, C1764c cVar, C1762a aVar, Map<String, Object> map) {
        ((C1621f) adAdapter).mo7253a(this.f5217b, (C1557a) new C1557a() {
            /* renamed from: a */
            public void mo6821a(C1648n nVar) {
                C1667d.this.f5221f = nVar;
                C1667d.this.f5216a = false;
                C1667d.this.f5218c.mo6777a((AdAdapter) nVar);
            }

            /* renamed from: a */
            public void mo6822a(C1648n nVar, View view) {
                C1667d.this.f5218c.mo6776a(view);
            }

            /* renamed from: a */
            public void mo6823a(C1648n nVar, AdError adError) {
                C1667d.this.f5218c.mo6778a(new C1782a(adError.getErrorCode(), adError.getErrorMessage()));
            }

            /* renamed from: b */
            public void mo6824b(C1648n nVar) {
                C1667d.this.f5218c.mo6775a();
            }

            /* renamed from: c */
            public void mo6825c(C1648n nVar) {
                C1667d.this.f5218c.mo6779b();
            }

            /* renamed from: d */
            public void mo6826d(C1648n nVar) {
                C1667d.this.f5218c.mo6819c();
            }
        }, map, this.f5222g, this.f5223h.f5201d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7372a(String str) {
        C1782a a = C1669e.m6979a(this.f5217b, Integer.valueOf(0));
        if (a != null) {
            mo7048a(a);
        } else {
            super.mo7372a(str);
        }
    }
}

package com.facebook.ads.internal.p074b;

import android.content.Context;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.C1640k;
import com.facebook.ads.internal.adapters.C1655s;
import com.facebook.ads.internal.adapters.C1656t;
import com.facebook.ads.internal.p086m.C1762a;
import com.facebook.ads.internal.p086m.C1764c;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1782a;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.b.h */
public class C1677h extends C1663c {
    public C1677h(Context context, C1659a aVar) {
        super(context, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7370a() {
        C1655s sVar = (C1655s) this.f5221f;
        sVar.mo7348a(this.f5223h.f5204g);
        sVar.mo7318b();
    }

    /* renamed from: a */
    public void mo7392a(RewardData rewardData) {
        if (this.f5221f == null) {
            throw new IllegalStateException("no adapter ready to set reward on");
        } else if (this.f5221f.getPlacementType() != AdPlacementType.REWARDED_VIDEO) {
            throw new IllegalStateException("can only set on rewarded video ads");
        } else {
            ((C1655s) this.f5221f).mo7349a(rewardData);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7371a(AdAdapter adAdapter, C1764c cVar, C1762a aVar, Map<String, Object> map) {
        ((C1640k) adAdapter).mo7317a(this.f5217b, new C1656t() {
            /* renamed from: a */
            public void mo7350a() {
                C1677h.this.f5218c.mo7101h();
            }

            /* renamed from: a */
            public void mo7351a(C1655s sVar) {
                C1677h.this.f5221f = sVar;
                C1677h.this.f5218c.mo6777a((AdAdapter) sVar);
            }

            /* renamed from: a */
            public void mo7352a(C1655s sVar, AdError adError) {
                C1677h.this.f5218c.mo6778a(new C1782a(AdErrorType.INTERNAL_ERROR, (String) null));
                C1677h.this.mo7374a((AdAdapter) sVar);
                C1677h.this.mo7385i();
            }

            /* renamed from: b */
            public void mo7353b() {
                C1677h.this.f5218c.mo7104k();
            }

            /* renamed from: b */
            public void mo7354b(C1655s sVar) {
                C1677h.this.f5218c.mo6775a();
            }

            /* renamed from: c */
            public void mo7355c(C1655s sVar) {
                C1677h.this.f5218c.mo6779b();
            }

            /* renamed from: d */
            public void mo7356d(C1655s sVar) {
                C1677h.this.f5218c.mo7100g();
            }

            /* renamed from: e */
            public void mo7357e(C1655s sVar) {
                C1677h.this.f5218c.mo7102i();
            }

            /* renamed from: f */
            public void mo7358f(C1655s sVar) {
                C1677h.this.f5218c.mo7103j();
            }
        }, map, this.f5223h.f5203f, this.f5223h.f5202e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C1782a mo7379c() {
        C1782a aVar = null;
        if (this.f5223h.f5203f) {
            if (mo7380d()) {
                return null;
            }
            aVar = new C1782a(AdErrorType.CLEAR_TEXT_SUPPORT_NOT_ALLOWED, "");
        }
        return aVar;
    }
}

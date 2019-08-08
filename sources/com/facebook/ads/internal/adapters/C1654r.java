package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.adapters.p072b.C1608q;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p125x.C2376a;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.r */
public class C1654r extends C1584b {

    /* renamed from: c */
    private final C1802c f5187c;

    /* renamed from: d */
    private final C2341w f5188d;

    /* renamed from: e */
    private C1608q f5189e;

    public C1654r(Context context, C1802c cVar, C2376a aVar, C2341w wVar, C1609c cVar2) {
        super(context, cVar2, aVar);
        this.f5187c = cVar;
        this.f5188d = wVar;
    }

    /* renamed from: a */
    public void mo7347a(C1608q qVar) {
        this.f5189e = qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7112a(Map<String, String> map) {
        if (this.f5189e != null && !TextUtils.isEmpty(this.f5189e.mo7113a())) {
            map.put("touch", C2323k.m9046a(this.f5188d.mo8743e()));
            this.f5187c.mo7686a(this.f5189e.mo7113a(), map);
        }
    }
}

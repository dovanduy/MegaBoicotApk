package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.internal.p115w.p117b.C2308c;
import com.facebook.ads.internal.p125x.C2376a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.b */
public abstract class C1584b {

    /* renamed from: a */
    protected final C1609c f4851a;

    /* renamed from: b */
    protected final C2376a f4852b;

    /* renamed from: c */
    private final Context f4853c;

    /* renamed from: d */
    private boolean f4854d;

    public C1584b(Context context, C1609c cVar, C2376a aVar) {
        this.f4853c = context;
        this.f4851a = cVar;
        this.f4852b = aVar;
    }

    /* renamed from: a */
    public final void mo7111a() {
        if (!this.f4854d) {
            if (this.f4851a != null) {
                this.f4851a.mo7238a();
            }
            HashMap hashMap = new HashMap();
            if (this.f4852b != null) {
                this.f4852b.mo8779a((Map<String, String>) hashMap);
            }
            mo7112a(hashMap);
            this.f4854d = true;
            C2308c.m9020a(this.f4853c, "Impression logged");
            if (this.f4851a != null) {
                this.f4851a.mo7239b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7112a(Map<String, String> map);
}

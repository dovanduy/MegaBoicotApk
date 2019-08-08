package com.startapp.android.publish.adsCommon.p188h;

import android.content.Context;
import com.startapp.android.publish.adsCommon.p182f.C5373b;
import com.startapp.android.publish.adsCommon.p190j.C5411b;
import com.startapp.android.publish.common.metaData.MetaData;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.android.publish.adsCommon.h.c */
/* compiled from: StartAppSDK */
public class C5400c extends C5396a {
    public C5400c(Context context, Runnable runnable, C5373b bVar) {
        super(context, runnable, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19944b() {
        try {
            long millis = TimeUnit.SECONDS.toMillis((long) MetaData.getInstance().getSensorsConfig().mo20278a());
            final C5411b bVar = new C5411b(this.f17267a, this);
            mo19943a(new Runnable() {
                public void run() {
                    bVar.mo19963b();
                    C5400c.this.mo19942a(bVar.mo19964c());
                }
            }, millis);
            bVar.mo19962a();
        } catch (Exception unused) {
            mo19942a(null);
        }
    }

    /* renamed from: a */
    public void mo19942a(Object obj) {
        if (obj != null) {
            this.f17269c.mo19879a(obj.toString());
        }
        super.mo19942a(obj);
    }
}

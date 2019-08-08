package com.startapp.android.publish.adsCommon.p188h;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.adsCommon.p182f.C5373b;
import com.startapp.common.C5549d;
import com.startapp.common.C5554g;
import com.startapp.common.C5554g.C5558a;

/* renamed from: com.startapp.android.publish.adsCommon.h.a */
/* compiled from: StartAppSDK */
public abstract class C5396a implements C5549d {

    /* renamed from: a */
    protected final Context f17267a;

    /* renamed from: b */
    protected final Runnable f17268b;

    /* renamed from: c */
    protected C5373b f17269c;

    /* renamed from: d */
    private Handler f17270d = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo19944b();

    public C5396a(Context context, Runnable runnable, C5373b bVar) {
        this.f17267a = context;
        this.f17268b = runnable;
        this.f17269c = bVar;
    }

    /* renamed from: a */
    public void mo19941a() {
        C5554g.m23702a(C5558a.DEFAULT, (Runnable) new Runnable() {
            public void run() {
                C5396a.this.mo19944b();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19943a(Runnable runnable, long j) {
        this.f17270d.postDelayed(runnable, j);
    }

    /* renamed from: a */
    public void mo19942a(Object obj) {
        if (this.f17270d != null) {
            this.f17270d.removeCallbacksAndMessages(null);
        }
        this.f17268b.run();
    }
}

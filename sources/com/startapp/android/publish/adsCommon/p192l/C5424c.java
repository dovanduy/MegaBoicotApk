package com.startapp.android.publish.adsCommon.p192l;

import android.os.Handler;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: com.startapp.android.publish.adsCommon.l.c */
/* compiled from: StartAppSDK */
public class C5424c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f17328a = new Handler();

    /* renamed from: b */
    private final C5422a f17329b = new C5422a();

    /* renamed from: c */
    private final WeakReference<View> f17330c;

    /* renamed from: d */
    private final int f17331d;

    /* renamed from: com.startapp.android.publish.adsCommon.l.c$a */
    /* compiled from: StartAppSDK */
    public interface C5426a {
        boolean onUpdate(boolean z);
    }

    public C5424c(View view, int i, final C5426a aVar) {
        this.f17330c = new WeakReference<>(view);
        this.f17331d = i;
        this.f17328a.postDelayed(new Runnable() {
            public void run() {
                if (aVar.onUpdate(C5424c.this.m23143b())) {
                    C5424c.this.f17328a.postDelayed(this, 100);
                }
            }
        }, 100);
    }

    /* renamed from: a */
    public void mo19980a() {
        this.f17328a.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m23143b() {
        View view = (View) this.f17330c.get();
        return view != null && this.f17329b.mo19974a(view, this.f17331d);
    }
}

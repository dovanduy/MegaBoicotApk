package com.startapp.android.publish.adsCommon.p192l;

import android.os.Handler;
import android.view.View;
import com.startapp.android.publish.adsCommon.C5402i;
import com.startapp.common.p193a.C5518g;
import java.lang.ref.WeakReference;

/* renamed from: com.startapp.android.publish.adsCommon.l.b */
/* compiled from: StartAppSDK */
public class C5423b implements Runnable {

    /* renamed from: a */
    private Handler f17322a = new Handler();

    /* renamed from: b */
    private C5422a f17323b = new C5422a();

    /* renamed from: c */
    private WeakReference<View> f17324c;

    /* renamed from: d */
    private final C5402i f17325d;

    /* renamed from: e */
    private final int f17326e;

    /* renamed from: f */
    private boolean f17327f = true;

    public C5423b(View view, C5402i iVar, int i) {
        this.f17324c = new WeakReference<>(view);
        this.f17325d = iVar;
        this.f17326e = i;
    }

    public C5423b(WeakReference<View> weakReference, C5402i iVar, int i) {
        this.f17324c = weakReference;
        this.f17325d = iVar;
        this.f17326e = i;
    }

    /* renamed from: a */
    public void mo19975a() {
        if (mo19977c()) {
            run();
        }
    }

    /* renamed from: b */
    public void mo19976b() {
        try {
            if (this.f17325d != null) {
                this.f17325d.mo19950a(false);
            }
            if (this.f17322a != null) {
                this.f17322a.removeCallbacksAndMessages(null);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewabilityRunner - clearVisibilityHandler failed ");
            sb.append(e.getMessage());
            C5518g.m23564a("ViewabilityRunner", 6, sb.toString(), e);
        }
    }

    public void run() {
        try {
            if (mo19977c()) {
                boolean d = mo19978d();
                if (d && this.f17327f) {
                    this.f17327f = false;
                    this.f17325d.mo19948a();
                } else if (!d && !this.f17327f) {
                    this.f17327f = true;
                    this.f17325d.mo19951b();
                }
                this.f17322a.postDelayed(this, 100);
                return;
            }
            mo19976b();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewabilityRunner.run - runnable error ");
            sb.append(e.getMessage());
            C5518g.m23564a("ViewabilityRunner", 6, sb.toString(), e);
            mo19976b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo19977c() {
        return (this.f17325d == null || this.f17325d.mo19953c() || this.f17324c.get() == null) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo19978d() {
        View view = (View) this.f17324c.get();
        if (view != null) {
            return this.f17323b.mo19974a(view, this.f17326e);
        }
        return false;
    }
}

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3907jl;
import com.google.android.gms.internal.ads.C3975lz;
import com.google.android.gms.internal.ads.ags;
import com.google.android.gms.internal.ads.agv;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.internal.ads.zzang;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.h */
public final class C3097h implements ags, Runnable {

    /* renamed from: a */
    private final List<Object[]> f9006a;

    /* renamed from: b */
    private final AtomicReference<ags> f9007b;

    /* renamed from: c */
    private Context f9008c;

    /* renamed from: d */
    private zzang f9009d;

    /* renamed from: e */
    private CountDownLatch f9010e;

    private C3097h(Context context, zzang zzang) {
        this.f9006a = new Vector();
        this.f9007b = new AtomicReference<>();
        this.f9010e = new CountDownLatch(1);
        this.f9008c = context;
        this.f9009d = zzang;
        aoq.m14615a();
        if (C3975lz.m17382b()) {
            C3907jl.m17118a((Runnable) this);
        } else {
            run();
        }
    }

    public C3097h(C3026ax axVar) {
        this(axVar.f8858c, axVar.f8860e);
    }

    /* renamed from: a */
    private final boolean m11103a() {
        try {
            this.f9010e.await();
            return true;
        } catch (InterruptedException e) {
            C3900je.m17432c("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* renamed from: b */
    private static Context m11104b(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: b */
    private final void m11105b() {
        if (!this.f9006a.isEmpty()) {
            for (Object[] objArr : this.f9006a) {
                if (objArr.length == 1) {
                    ((ags) this.f9007b.get()).mo12628a((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((ags) this.f9007b.get()).mo12627a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.f9006a.clear();
        }
    }

    /* renamed from: a */
    public final String mo12624a(Context context) {
        if (m11103a()) {
            ags ags = (ags) this.f9007b.get();
            if (ags != null) {
                m11105b();
                return ags.mo12624a(m11104b(context));
            }
        }
        return "";
    }

    /* renamed from: a */
    public final String mo12625a(Context context, String str, View view) {
        return mo12626a(context, str, view, null);
    }

    /* renamed from: a */
    public final String mo12626a(Context context, String str, View view, Activity activity) {
        if (m11103a()) {
            ags ags = (ags) this.f9007b.get();
            if (ags != null) {
                m11105b();
                return ags.mo12626a(m11104b(context), str, view, activity);
            }
        }
        return "";
    }

    /* renamed from: a */
    public final void mo12627a(int i, int i2, int i3) {
        ags ags = (ags) this.f9007b.get();
        if (ags != null) {
            m11105b();
            ags.mo12627a(i, i2, i3);
            return;
        }
        this.f9006a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: a */
    public final void mo12628a(MotionEvent motionEvent) {
        ags ags = (ags) this.f9007b.get();
        if (ags != null) {
            m11105b();
            ags.mo12628a(motionEvent);
            return;
        }
        this.f9006a.add(new Object[]{motionEvent});
    }

    /* renamed from: a */
    public final void mo12629a(View view) {
        ags ags = (ags) this.f9007b.get();
        if (ags != null) {
            ags.mo12629a(view);
        }
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.f9009d.f14508d;
            if (!((Boolean) aoq.m14620f().mo14695a(aru.f11787aL)).booleanValue() && z2) {
                z = true;
            }
            this.f9007b.set(agv.m14092a(this.f9009d.f14505a, m11104b(this.f9008c), z));
        } finally {
            this.f9010e.countDown();
            this.f9008c = null;
            this.f9009d = null;
        }
    }
}

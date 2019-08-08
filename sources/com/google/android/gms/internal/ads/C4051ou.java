package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.common.internal.C3513t;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ou */
public final class C4051ou {

    /* renamed from: a */
    private final Context f13692a;

    /* renamed from: b */
    private final C4061pd f13693b;

    /* renamed from: c */
    private final ViewGroup f13694c;

    /* renamed from: d */
    private C4046op f13695d;

    private C4051ou(Context context, ViewGroup viewGroup, C4061pd pdVar, C4046op opVar) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f13692a = context;
        this.f13694c = viewGroup;
        this.f13693b = pdVar;
        this.f13695d = null;
    }

    public C4051ou(Context context, ViewGroup viewGroup, C4089qe qeVar) {
        this(context, viewGroup, qeVar, null);
    }

    /* renamed from: a */
    public final C4046op mo15767a() {
        C3513t.m12634b("getAdVideoUnderlay must be called from the UI thread.");
        return this.f13695d;
    }

    /* renamed from: a */
    public final void mo15768a(int i, int i2, int i3, int i4) {
        C3513t.m12634b("The underlay may only be modified from the UI thread.");
        if (this.f13695d != null) {
            this.f13695d.mo15750a(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public final void mo15769a(int i, int i2, int i3, int i4, int i5, boolean z, C4060pc pcVar) {
        if (this.f13695d == null) {
            asa.m15040a(this.f13693b.mo15806j().mo14714a(), this.f13693b.mo15800c(), "vpr2");
            C4046op opVar = new C4046op(this.f13692a, this.f13693b, i5, z, this.f13693b.mo15806j().mo14714a(), pcVar);
            this.f13695d = opVar;
            this.f13694c.addView(this.f13695d, 0, new LayoutParams(-1, -1));
            this.f13695d.mo15750a(i, i2, i3, i4);
            this.f13693b.mo15798a(false);
        }
    }

    /* renamed from: b */
    public final void mo15770b() {
        C3513t.m12634b("onPause must be called from the UI thread.");
        if (this.f13695d != null) {
            this.f13695d.mo15755i();
        }
    }

    /* renamed from: c */
    public final void mo15771c() {
        C3513t.m12634b("onDestroy must be called from the UI thread.");
        if (this.f13695d != null) {
            this.f13695d.mo15760n();
            this.f13694c.removeView(this.f13695d);
            this.f13695d = null;
        }
    }
}

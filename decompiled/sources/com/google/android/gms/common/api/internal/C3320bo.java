package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3244a.C3245a;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.C4902a;
import com.google.android.gms.signin.C4904b;
import com.google.android.gms.signin.C4907e;
import com.google.android.gms.signin.internal.C4910c;
import com.google.android.gms.signin.internal.zaj;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.bo */
public final class C3320bo extends C4910c implements C3268b, C3269c {

    /* renamed from: a */
    private static C3245a<? extends C4907e, C4902a> f9620a = C4904b.f16041a;

    /* renamed from: b */
    private final Context f9621b;

    /* renamed from: c */
    private final Handler f9622c;

    /* renamed from: d */
    private final C3245a<? extends C4907e, C4902a> f9623d;

    /* renamed from: e */
    private Set<Scope> f9624e;

    /* renamed from: f */
    private C3482e f9625f;

    /* renamed from: g */
    private C4907e f9626g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3323br f9627h;

    public C3320bo(Context context, Handler handler, C3482e eVar) {
        this(context, handler, eVar, f9620a);
    }

    public C3320bo(Context context, Handler handler, C3482e eVar, C3245a<? extends C4907e, C4902a> aVar) {
        this.f9621b = context;
        this.f9622c = handler;
        this.f9625f = (C3482e) C3513t.m12626a(eVar, (Object) "ClientSettings must not be null");
        this.f9624e = eVar.mo13575d();
        this.f9623d = aVar;
    }

    /* renamed from: a */
    public final void mo13250a(C3323br brVar) {
        if (this.f9626g != null) {
            this.f9626g.mo13098g();
        }
        this.f9625f.mo13572a(Integer.valueOf(System.identityHashCode(this)));
        this.f9626g = (C4907e) this.f9623d.mo12938a(this.f9621b, this.f9622c.getLooper(), this.f9625f, this.f9625f.mo13580i(), this, this);
        this.f9627h = brVar;
        if (this.f9624e == null || this.f9624e.isEmpty()) {
            this.f9622c.post(new C3321bp(this));
        } else {
            this.f9626g.mo17794A();
        }
    }

    /* renamed from: a */
    public final C4907e mo13249a() {
        return this.f9626g;
    }

    /* renamed from: b */
    public final void mo13251b() {
        if (this.f9626g != null) {
            this.f9626g.mo13098g();
        }
    }

    public final void onConnected(Bundle bundle) {
        this.f9626g.mo17796a(this);
    }

    public final void onConnectionSuspended(int i) {
        this.f9626g.mo13098g();
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f9627h.mo13255b(connectionResult);
    }

    /* renamed from: a */
    public final void mo13183a(zaj zaj) {
        this.f9622c.post(new C3322bq(this, zaj));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m11848b(zaj zaj) {
        ConnectionResult a = zaj.mo17813a();
        if (a.mo13042b()) {
            ResolveAccountResponse b = zaj.mo17814b();
            ConnectionResult b2 = b.mo13467b();
            if (!b2.mo13042b()) {
                String valueOf = String.valueOf(b2);
                StringBuilder sb = new StringBuilder(48 + String.valueOf(valueOf).length());
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.f9627h.mo13255b(b2);
                this.f9626g.mo13098g();
                return;
            }
            this.f9627h.mo13254a(b.mo13466a(), this.f9624e);
        } else {
            this.f9627h.mo13255b(a);
        }
        this.f9626g.mo13098g();
    }
}

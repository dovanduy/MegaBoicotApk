package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.C3210b;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.internal.C3469d.C3472c;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.common.internal.C3487h;
import com.google.android.gms.common.internal.C3494m;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.C4902a;
import com.google.android.gms.signin.C4907e;

/* renamed from: com.google.android.gms.signin.internal.a */
public class C4908a extends C3487h<C4913f> implements C4907e {

    /* renamed from: e */
    private final boolean f16049e;

    /* renamed from: f */
    private final C3482e f16050f;

    /* renamed from: g */
    private final Bundle f16051g;

    /* renamed from: h */
    private Integer f16052h;

    private C4908a(Context context, Looper looper, boolean z, C3482e eVar, Bundle bundle, C3268b bVar, C3269c cVar) {
        super(context, looper, 44, eVar, bVar, cVar);
        this.f16049e = true;
        this.f16050f = eVar;
        this.f16051g = bundle;
        this.f16052h = eVar.mo13581j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo13015b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* renamed from: f */
    public int mo13019f() {
        return C3415h.f9877b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n_ */
    public String mo13020n_() {
        return "com.google.android.gms.signin.service.START";
    }

    public C4908a(Context context, Looper looper, boolean z, C3482e eVar, C4902a aVar, C3268b bVar, C3269c cVar) {
        this(context, looper, true, eVar, m21443a(eVar), bVar, cVar);
    }

    /* renamed from: j */
    public boolean mo13544j() {
        return this.f16049e;
    }

    /* renamed from: a */
    public final void mo17795a(C3494m mVar, boolean z) {
        try {
            ((C4913f) mo13557w()).mo17805a(mVar, this.f16052h.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* renamed from: e */
    public final void mo13018e() {
        try {
            ((C4913f) mo13557w()).mo17804a(this.f16052h.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    /* renamed from: a */
    public final void mo17796a(C4911d dVar) {
        C3513t.m12626a(dVar, (Object) "Expecting a valid ISignInCallbacks");
        try {
            Account c = this.f16050f.mo13574c();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(c.name)) {
                googleSignInAccount = C3210b.m11519a(mo13552r()).mo13001a();
            }
            ((C4913f) mo13557w()).mo17806a(new zah(new ResolveAccountRequest(c, this.f16052h.intValue(), googleSignInAccount)), dVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                dVar.mo13183a(new zaj(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Bundle mo13555u() {
        if (!mo13552r().getPackageName().equals(this.f16050f.mo13578g())) {
            this.f16051g.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f16050f.mo13578g());
        }
        return this.f16051g;
    }

    /* renamed from: A */
    public final void mo17794A() {
        mo13535a((C3472c) new C3473d());
    }

    /* renamed from: a */
    public static Bundle m21443a(C3482e eVar) {
        C4902a i = eVar.mo13580i();
        Integer j = eVar.mo13581j();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.mo13573b());
        if (j != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", j.intValue());
        }
        if (i != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", i.mo17786a());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", i.mo17787b());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", i.mo17788c());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", i.mo17789d());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", i.mo17790e());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", i.mo17791f());
            if (i.mo17792g() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", i.mo17792g().longValue());
            }
            if (i.mo17793h() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", i.mo17793h().longValue());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ IInterface mo13014a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C4913f) {
            return (C4913f) queryLocalInterface;
        }
        return new C4914g(iBinder);
    }
}
